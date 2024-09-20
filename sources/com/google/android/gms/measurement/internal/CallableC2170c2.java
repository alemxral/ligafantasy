package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.c2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC2170c2 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16428a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16429b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f16430c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinderC2249q2 f16431d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2170c2(BinderC2249q2 binderC2249q2, String str, String str2, String str3) {
        this.f16431d = binderC2249q2;
        this.f16428a = str;
        this.f16429b = str2;
        this.f16430c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        r4 r4Var;
        r4 r4Var2;
        r4Var = this.f16431d.f16738a;
        r4Var.e();
        r4Var2 = this.f16431d.f16738a;
        return r4Var2.V().d0(this.f16428a, this.f16429b, this.f16430c);
    }
}
