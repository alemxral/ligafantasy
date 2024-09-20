package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class F1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16089a;

    /* renamed from: b, reason: collision with root package name */
    private final long f16090b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16091c;

    /* renamed from: d, reason: collision with root package name */
    private long f16092d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ I1 f16093e;

    public F1(I1 i12, String str, long j8) {
        this.f16093e = i12;
        AbstractC1319p.f(str);
        this.f16089a = str;
        this.f16090b = j8;
    }

    public final long a() {
        if (!this.f16091c) {
            this.f16091c = true;
            this.f16092d = this.f16093e.o().getLong(this.f16089a, this.f16090b);
        }
        return this.f16092d;
    }

    public final void b(long j8) {
        SharedPreferences.Editor edit = this.f16093e.o().edit();
        edit.putLong(this.f16089a, j8);
        edit.apply();
        this.f16092d = j8;
    }
}
