package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class Q3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r4 f16249a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f16250b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q3(R3 r32, r4 r4Var, Runnable runnable) {
        this.f16249a = r4Var;
        this.f16250b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16249a.e();
        this.f16249a.l0(this.f16250b);
        this.f16249a.C();
    }
}
