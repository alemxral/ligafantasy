package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2029k0;

/* renamed from: com.google.android.gms.measurement.internal.l3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2225l3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2029k0 f16649a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2270v f16650b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f16651c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f16652d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2225l3(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2029k0 interfaceC2029k0, C2270v c2270v, String str) {
        this.f16652d = appMeasurementDynamiteService;
        this.f16649a = interfaceC2029k0;
        this.f16650b = c2270v;
        this.f16651c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16652d.f15996a.L().p(this.f16649a, this.f16650b, this.f16651c);
    }
}
