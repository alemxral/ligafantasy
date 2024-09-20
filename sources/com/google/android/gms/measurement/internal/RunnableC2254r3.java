package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.RemoteException;
import m0.InterfaceC3391d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.r3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2254r3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D4 f16765a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K3 f16766b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2254r3(K3 k32, D4 d42) {
        this.f16766b = k32;
        this.f16765a = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3391d interfaceC3391d;
        K3 k32 = this.f16766b;
        interfaceC3391d = k32.f16189d;
        if (interfaceC3391d == null) {
            k32.f16764a.d().r().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            AbstractC1319p.l(this.f16765a);
            interfaceC3391d.M(this.f16765a);
            this.f16766b.f16764a.C().t();
            this.f16766b.r(interfaceC3391d, null, this.f16765a);
            this.f16766b.E();
        } catch (RemoteException e8) {
            this.f16766b.f16764a.d().r().b("Failed to send app launch to the service", e8);
        }
    }
}
