package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class D1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16028a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16029b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16030c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16031d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ I1 f16032e;

    public D1(I1 i12, String str, boolean z8) {
        this.f16032e = i12;
        AbstractC1319p.f(str);
        this.f16028a = str;
        this.f16029b = z8;
    }

    public final void a(boolean z8) {
        SharedPreferences.Editor edit = this.f16032e.o().edit();
        edit.putBoolean(this.f16028a, z8);
        edit.apply();
        this.f16031d = z8;
    }

    public final boolean b() {
        if (!this.f16030c) {
            this.f16030c = true;
            this.f16031d = this.f16032e.o().getBoolean(this.f16028a, this.f16029b);
        }
        return this.f16031d;
    }
}
