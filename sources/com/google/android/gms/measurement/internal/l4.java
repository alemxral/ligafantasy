package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class l4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B4 f16653a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f16654b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l4(AppMeasurementDynamiteService appMeasurementDynamiteService, B4 b42) {
        this.f16654b = appMeasurementDynamiteService;
        this.f16653a = b42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16654b.f15996a.I().H(this.f16653a);
    }
}
