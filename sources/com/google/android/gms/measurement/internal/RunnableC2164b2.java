package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2164b2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2173d f16421a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC2249q2 f16422b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2164b2(BinderC2249q2 binderC2249q2, C2173d c2173d) {
        this.f16422b = binderC2249q2;
        this.f16421a = c2173d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r4 r4Var;
        r4 r4Var2;
        r4 r4Var3;
        r4Var = this.f16422b.f16738a;
        r4Var.e();
        if (this.f16421a.f16435c.s() == null) {
            r4Var3 = this.f16422b.f16738a;
            r4Var3.s(this.f16421a);
        } else {
            r4Var2 = this.f16422b.f16738a;
            r4Var2.y(this.f16421a);
        }
    }
}
