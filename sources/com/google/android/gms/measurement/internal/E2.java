package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class E2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16080a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16081b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f16082c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f16083d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Y2 f16084e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E2(Y2 y22, String str, String str2, Object obj, long j8) {
        this.f16084e = y22;
        this.f16080a = str;
        this.f16081b = str2;
        this.f16082c = obj;
        this.f16083d = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16084e.M(this.f16080a, this.f16081b, this.f16082c, this.f16083d);
    }
}
