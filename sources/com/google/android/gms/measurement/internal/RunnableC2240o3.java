package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.RemoteException;
import m0.InterfaceC3391d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.o3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2240o3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D4 f16705a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K3 f16706b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2240o3(K3 k32, D4 d42) {
        this.f16706b = k32;
        this.f16705a = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3391d interfaceC3391d;
        K3 k32 = this.f16706b;
        interfaceC3391d = k32.f16189d;
        if (interfaceC3391d == null) {
            k32.f16764a.d().r().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            AbstractC1319p.l(this.f16705a);
            interfaceC3391d.c0(this.f16705a);
        } catch (RemoteException e8) {
            this.f16706b.f16764a.d().r().b("Failed to reset data on the service: remote exception", e8);
        }
        this.f16706b.E();
    }
}
