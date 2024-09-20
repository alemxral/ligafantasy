package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import m0.InterfaceC3391d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.s3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2259s3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2177d3 f16807a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K3 f16808b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2259s3(K3 k32, C2177d3 c2177d3) {
        this.f16808b = k32;
        this.f16807a = c2177d3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3391d interfaceC3391d;
        K3 k32 = this.f16808b;
        interfaceC3391d = k32.f16189d;
        if (interfaceC3391d == null) {
            k32.f16764a.d().r().a("Failed to send current screen to service");
            return;
        }
        try {
            C2177d3 c2177d3 = this.f16807a;
            if (c2177d3 == null) {
                interfaceC3391d.S(0L, null, null, k32.f16764a.c().getPackageName());
            } else {
                interfaceC3391d.S(c2177d3.f16452c, c2177d3.f16450a, c2177d3.f16451b, k32.f16764a.c().getPackageName());
            }
            this.f16808b.E();
        } catch (RemoteException e8) {
            this.f16808b.f16764a.d().r().b("Failed to send current screen to the service", e8);
        }
    }
}
