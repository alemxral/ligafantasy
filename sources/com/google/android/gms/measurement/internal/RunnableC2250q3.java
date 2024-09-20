package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2029k0;
import m0.InterfaceC3391d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.q3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2250q3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D4 f16741a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2029k0 f16742b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ K3 f16743c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2250q3(K3 k32, D4 d42, InterfaceC2029k0 interfaceC2029k0) {
        this.f16743c = k32;
        this.f16741a = d42;
        this.f16742b = interfaceC2029k0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y1 y12;
        InterfaceC3391d interfaceC3391d;
        String str = null;
        try {
            try {
                if (!this.f16743c.f16764a.F().q().j(m0.o.ANALYTICS_STORAGE)) {
                    this.f16743c.f16764a.d().x().a("Analytics storage consent denied; will not get app instance id");
                    this.f16743c.f16764a.I().C(null);
                    this.f16743c.f16764a.F().f16138g.b(null);
                    y12 = this.f16743c.f16764a;
                } else {
                    K3 k32 = this.f16743c;
                    interfaceC3391d = k32.f16189d;
                    if (interfaceC3391d == null) {
                        k32.f16764a.d().r().a("Failed to get app instance id");
                        y12 = this.f16743c.f16764a;
                    } else {
                        AbstractC1319p.l(this.f16741a);
                        str = interfaceC3391d.z(this.f16741a);
                        if (str != null) {
                            this.f16743c.f16764a.I().C(str);
                            this.f16743c.f16764a.F().f16138g.b(str);
                        }
                        this.f16743c.E();
                        y12 = this.f16743c.f16764a;
                    }
                }
            } catch (RemoteException e8) {
                this.f16743c.f16764a.d().r().b("Failed to get app instance id", e8);
                y12 = this.f16743c.f16764a;
            }
            y12.N().K(this.f16742b, str);
        } catch (Throwable th) {
            this.f16743c.f16764a.N().K(this.f16742b, null);
            throw th;
        }
    }
}
