package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class C2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f16015a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y2 f16016b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2(Y2 y22, long j8) {
        this.f16016b = y22;
        this.f16015a = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16016b.f16764a.F().f16142k.b(this.f16015a);
        this.f16016b.f16764a.d().q().b("Session timeout duration set", Long.valueOf(this.f16015a));
    }
}
