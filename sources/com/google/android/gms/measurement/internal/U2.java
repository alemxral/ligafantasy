package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1949a7;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class U2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m0.p f16292a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f16293b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f16294c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ m0.p f16295d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Y2 f16296e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U2(Y2 y22, m0.p pVar, long j8, boolean z8, m0.p pVar2) {
        this.f16296e = y22;
        this.f16292a = pVar;
        this.f16293b = j8;
        this.f16294c = z8;
        this.f16295d = pVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16296e.J(this.f16292a);
        Y2.c0(this.f16296e, this.f16292a, this.f16293b, false, this.f16294c);
        C1949a7.c();
        if (this.f16296e.f16764a.z().B(null, AbstractC2217k1.f16600p0)) {
            Y2.b0(this.f16296e, this.f16292a, this.f16295d);
        }
    }
}
