package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class I2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f16156a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16157b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f16158c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Y2 f16159d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I2(Y2 y22, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f16159d = y22;
        this.f16156a = atomicReference;
        this.f16157b = str2;
        this.f16158c = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16159d.f16764a.L().U(this.f16156a, null, this.f16157b, this.f16158c);
    }
}
