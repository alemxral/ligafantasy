package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.i3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2207i3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2177d3 f16505a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f16506b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2219k3 f16507c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2207i3(C2219k3 c2219k3, C2177d3 c2177d3, long j8) {
        this.f16507c = c2219k3;
        this.f16505a = c2177d3;
        this.f16506b = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16507c.p(this.f16505a, false, this.f16506b);
        C2219k3 c2219k3 = this.f16507c;
        c2219k3.f16626e = null;
        c2219k3.f16764a.L().u(null);
    }
}
