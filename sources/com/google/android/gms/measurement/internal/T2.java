package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1949a7;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class T2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m0.p f16278a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f16279b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f16280c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f16281d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ m0.p f16282e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Y2 f16283f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public T2(Y2 y22, m0.p pVar, long j8, long j9, boolean z8, m0.p pVar2) {
        this.f16283f = y22;
        this.f16278a = pVar;
        this.f16279b = j8;
        this.f16280c = j9;
        this.f16281d = z8;
        this.f16282e = pVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16283f.J(this.f16278a);
        this.f16283f.z(this.f16279b, false);
        Y2.c0(this.f16283f, this.f16278a, this.f16280c, true, this.f16281d);
        C1949a7.c();
        if (this.f16283f.f16764a.z().B(null, AbstractC2217k1.f16600p0)) {
            Y2.b0(this.f16283f, this.f16278a, this.f16282e);
        }
    }
}
