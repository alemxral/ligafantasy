package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2029k0;

/* loaded from: classes3.dex */
final class z4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2029k0 f16942a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16943b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f16944c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f16945d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z4(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2029k0 interfaceC2029k0, String str, String str2) {
        this.f16945d = appMeasurementDynamiteService;
        this.f16942a = interfaceC2029k0;
        this.f16943b = str;
        this.f16944c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16945d.f15996a.L().T(this.f16942a, this.f16943b, this.f16944c);
    }
}
