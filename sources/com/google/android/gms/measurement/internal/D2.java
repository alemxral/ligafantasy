package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class D2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16033a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16034b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f16035c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Bundle f16036d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f16037e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f16038f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f16039g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f16040h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Y2 f16041i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D2(Y2 y22, String str, String str2, long j8, Bundle bundle, boolean z8, boolean z9, boolean z10, String str3) {
        this.f16041i = y22;
        this.f16033a = str;
        this.f16034b = str2;
        this.f16035c = j8;
        this.f16036d = bundle;
        this.f16037e = z8;
        this.f16038f = z9;
        this.f16039g = z10;
        this.f16040h = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16041i.w(this.f16033a, this.f16034b, this.f16035c, this.f16036d, this.f16037e, this.f16038f, this.f16039g, this.f16040h);
    }
}
