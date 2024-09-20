package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2029k0;

/* loaded from: classes3.dex */
final class A4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2029k0 f15994a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f15995b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A4(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2029k0 interfaceC2029k0) {
        this.f15995b = appMeasurementDynamiteService;
        this.f15994a = interfaceC2029k0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15995b.f15996a.N().E(this.f15994a, this.f15995b.f15996a.n());
    }
}
