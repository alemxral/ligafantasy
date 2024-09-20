package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2166b4 {

    /* renamed from: a, reason: collision with root package name */
    private final W.d f16423a;

    /* renamed from: b, reason: collision with root package name */
    private long f16424b;

    public C2166b4(W.d dVar) {
        AbstractC1319p.l(dVar);
        this.f16423a = dVar;
    }

    public final void a() {
        this.f16424b = 0L;
    }

    public final void b() {
        this.f16424b = this.f16423a.elapsedRealtime();
    }

    public final boolean c(long j8) {
        if (this.f16424b == 0 || this.f16423a.elapsedRealtime() - this.f16424b >= 3600000) {
            return true;
        }
        return false;
    }
}
