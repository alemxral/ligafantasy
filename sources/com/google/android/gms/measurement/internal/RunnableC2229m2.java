package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.m2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2229m2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u4 f16671a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D4 f16672b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC2249q2 f16673c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2229m2(BinderC2249q2 binderC2249q2, u4 u4Var, D4 d42) {
        this.f16673c = binderC2249q2;
        this.f16671a = u4Var;
        this.f16672b = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r4 r4Var;
        r4 r4Var2;
        r4 r4Var3;
        r4Var = this.f16673c.f16738a;
        r4Var.e();
        if (this.f16671a.s() == null) {
            r4Var3 = this.f16673c.f16738a;
            r4Var3.u(this.f16671a.f16865b, this.f16672b);
        } else {
            r4Var2 = this.f16673c.f16738a;
            r4Var2.B(this.f16671a, this.f16672b);
        }
    }
}
