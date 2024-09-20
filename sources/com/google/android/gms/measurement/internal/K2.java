package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class K2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f16183a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16184b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f16185c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f16186d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Y2 f16187e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public K2(Y2 y22, AtomicReference atomicReference, String str, String str2, String str3, boolean z8) {
        this.f16187e = y22;
        this.f16183a = atomicReference;
        this.f16184b = str2;
        this.f16185c = str3;
        this.f16186d = z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16187e.f16764a.L().W(this.f16183a, null, this.f16184b, this.f16185c, this.f16186d);
    }
}
