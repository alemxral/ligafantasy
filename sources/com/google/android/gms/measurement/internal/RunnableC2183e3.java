package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.e3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2183e3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f16464a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2177d3 f16465b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2177d3 f16466c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f16467d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2219k3 f16468e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2183e3(C2219k3 c2219k3, Bundle bundle, C2177d3 c2177d3, C2177d3 c2177d32, long j8) {
        this.f16468e = c2219k3;
        this.f16464a = bundle;
        this.f16465b = c2177d3;
        this.f16466c = c2177d32;
        this.f16467d = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2219k3.w(this.f16468e, this.f16464a, this.f16465b, this.f16466c, this.f16467d);
    }
}
