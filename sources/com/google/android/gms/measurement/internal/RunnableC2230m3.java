package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2029k0;
import java.util.List;
import m0.InterfaceC3391d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.m3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2230m3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16674a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16675b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ D4 f16676c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f16677d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2029k0 f16678e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ K3 f16679f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2230m3(K3 k32, String str, String str2, D4 d42, boolean z8, InterfaceC2029k0 interfaceC2029k0) {
        this.f16679f = k32;
        this.f16674a = str;
        this.f16675b = str2;
        this.f16676c = d42;
        this.f16677d = z8;
        this.f16678e = interfaceC2029k0;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x009b: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:156), block:B:44:0x009a */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e8;
        Bundle bundle2;
        InterfaceC3391d interfaceC3391d;
        Bundle bundle3 = new Bundle();
        try {
            try {
                K3 k32 = this.f16679f;
                interfaceC3391d = k32.f16189d;
                if (interfaceC3391d == null) {
                    k32.f16764a.d().r().c("Failed to get user properties; not connected to service", this.f16674a, this.f16675b);
                    this.f16679f.f16764a.N().G(this.f16678e, bundle3);
                    return;
                }
                AbstractC1319p.l(this.f16676c);
                List<u4> W7 = interfaceC3391d.W(this.f16674a, this.f16675b, this.f16677d, this.f16676c);
                bundle = new Bundle();
                if (W7 != null) {
                    for (u4 u4Var : W7) {
                        String str = u4Var.f16868e;
                        if (str != null) {
                            bundle.putString(u4Var.f16865b, str);
                        } else {
                            Long l8 = u4Var.f16867d;
                            if (l8 != null) {
                                bundle.putLong(u4Var.f16865b, l8.longValue());
                            } else {
                                Double d8 = u4Var.f16870g;
                                if (d8 != null) {
                                    bundle.putDouble(u4Var.f16865b, d8.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    this.f16679f.E();
                    this.f16679f.f16764a.N().G(this.f16678e, bundle);
                } catch (RemoteException e9) {
                    e8 = e9;
                    this.f16679f.f16764a.d().r().c("Failed to get user properties; remote exception", this.f16674a, e8);
                    this.f16679f.f16764a.N().G(this.f16678e, bundle);
                }
            } catch (RemoteException e10) {
                bundle = bundle3;
                e8 = e10;
            } catch (Throwable th) {
                th = th;
                this.f16679f.f16764a.N().G(this.f16678e, bundle3);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bundle3 = bundle2;
            this.f16679f.f16764a.N().G(this.f16678e, bundle3);
            throw th;
        }
    }
}
