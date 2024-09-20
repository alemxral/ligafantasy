package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.Bundle;
import android.os.RemoteException;
import m0.InterfaceC3391d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.t3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2264t3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D4 f16813a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f16814b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ K3 f16815c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2264t3(K3 k32, D4 d42, Bundle bundle) {
        this.f16815c = k32;
        this.f16813a = d42;
        this.f16814b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3391d interfaceC3391d;
        K3 k32 = this.f16815c;
        interfaceC3391d = k32.f16189d;
        if (interfaceC3391d == null) {
            k32.f16764a.d().r().a("Failed to send default event parameters to service");
            return;
        }
        try {
            AbstractC1319p.l(this.f16813a);
            interfaceC3391d.s(this.f16814b, this.f16813a);
        } catch (RemoteException e8) {
            this.f16815c.f16764a.d().r().b("Failed to send default event parameters to service", e8);
        }
    }
}
