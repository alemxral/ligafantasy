package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import m0.InterfaceC3391d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.p3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2245p3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f16723a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D4 f16724b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ K3 f16725c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2245p3(K3 k32, AtomicReference atomicReference, D4 d42) {
        this.f16725c = k32;
        this.f16723a = atomicReference;
        this.f16724b = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC3391d interfaceC3391d;
        synchronized (this.f16723a) {
            try {
                try {
                } catch (RemoteException e8) {
                    this.f16725c.f16764a.d().r().b("Failed to get app instance id", e8);
                    atomicReference = this.f16723a;
                }
                if (!this.f16725c.f16764a.F().q().j(m0.o.ANALYTICS_STORAGE)) {
                    this.f16725c.f16764a.d().x().a("Analytics storage consent denied; will not get app instance id");
                    this.f16725c.f16764a.I().C(null);
                    this.f16725c.f16764a.F().f16138g.b(null);
                    this.f16723a.set(null);
                    return;
                }
                K3 k32 = this.f16725c;
                interfaceC3391d = k32.f16189d;
                if (interfaceC3391d == null) {
                    k32.f16764a.d().r().a("Failed to get app instance id");
                    return;
                }
                AbstractC1319p.l(this.f16724b);
                this.f16723a.set(interfaceC3391d.z(this.f16724b));
                String str = (String) this.f16723a.get();
                if (str != null) {
                    this.f16725c.f16764a.I().C(str);
                    this.f16725c.f16764a.F().f16138g.b(str);
                }
                this.f16725c.E();
                atomicReference = this.f16723a;
                atomicReference.notify();
            } finally {
                this.f16723a.notify();
            }
        }
    }
}
