package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.h3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2201h3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f16496a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2219k3 f16497b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2201h3(C2219k3 c2219k3, long j8) {
        this.f16497b = c2219k3;
        this.f16496a = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16497b.f16764a.y().n(this.f16496a);
        this.f16497b.f16626e = null;
    }
}
