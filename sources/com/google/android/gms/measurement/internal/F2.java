package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class F2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f16094a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y2 f16095b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F2(Y2 y22, long j8) {
        this.f16095b = y22;
        this.f16094a = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16095b.z(this.f16094a, true);
        this.f16095b.f16764a.L().S(new AtomicReference());
    }
}
