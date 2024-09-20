package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.RemoteException;
import m0.InterfaceC3391d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.y3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2289y3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D4 f16925a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K3 f16926b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2289y3(K3 k32, D4 d42) {
        this.f16926b = k32;
        this.f16925a = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3391d interfaceC3391d;
        K3 k32 = this.f16926b;
        interfaceC3391d = k32.f16189d;
        if (interfaceC3391d == null) {
            k32.f16764a.d().r().a("Failed to send consent settings to service");
            return;
        }
        try {
            AbstractC1319p.l(this.f16925a);
            interfaceC3391d.V(this.f16925a);
            this.f16926b.E();
        } catch (RemoteException e8) {
            this.f16926b.f16764a.d().r().b("Failed to send consent settings to the service", e8);
        }
    }
}
