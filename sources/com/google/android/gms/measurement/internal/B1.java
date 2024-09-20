package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class B1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f16000a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1 f16001b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B1(C1 c12, boolean z8) {
        this.f16001b = c12;
        this.f16000a = z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r4 r4Var;
        r4Var = this.f16001b.f16012a;
        r4Var.o(this.f16000a);
    }
}
