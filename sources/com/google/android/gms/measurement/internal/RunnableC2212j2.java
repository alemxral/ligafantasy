package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.j2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2212j2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2270v f16524a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D4 f16525b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC2249q2 f16526c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2212j2(BinderC2249q2 binderC2249q2, C2270v c2270v, D4 d42) {
        this.f16526c = binderC2249q2;
        this.f16524a = c2270v;
        this.f16525b = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16526c.n0(this.f16526c.l(this.f16524a, this.f16525b), this.f16525b);
    }
}
