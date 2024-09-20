package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.g2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2194g2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D4 f16485a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC2249q2 f16486b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2194g2(BinderC2249q2 binderC2249q2, D4 d42) {
        this.f16486b = binderC2249q2;
        this.f16485a = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r4 r4Var;
        r4 r4Var2;
        r4Var = this.f16486b.f16738a;
        r4Var.e();
        r4Var2 = this.f16486b.f16738a;
        r4Var2.v(this.f16485a);
    }
}
