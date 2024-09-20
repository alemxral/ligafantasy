package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class X1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2278w2 f16330a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y1 f16331b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X1(Y1 y12, C2278w2 c2278w2) {
        this.f16331b = y12;
        this.f16330a = c2278w2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y1.e(this.f16331b, this.f16330a);
        this.f16331b.m(this.f16330a.f16892g);
    }
}
