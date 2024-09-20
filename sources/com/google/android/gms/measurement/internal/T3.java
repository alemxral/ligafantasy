package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class T3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f16284a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2160a4 f16285b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public T3(C2160a4 c2160a4, long j8) {
        this.f16285b = c2160a4;
        this.f16284a = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2160a4.q(this.f16285b, this.f16284a);
    }
}
