package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.e2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC2182e2 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16460a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16461b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f16462c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinderC2249q2 f16463d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2182e2(BinderC2249q2 binderC2249q2, String str, String str2, String str3) {
        this.f16463d = binderC2249q2;
        this.f16460a = str;
        this.f16461b = str2;
        this.f16462c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        r4 r4Var;
        r4 r4Var2;
        r4Var = this.f16463d.f16738a;
        r4Var.e();
        r4Var2 = this.f16463d.f16738a;
        return r4Var2.V().a0(this.f16460a, this.f16461b, this.f16462c);
    }
}
