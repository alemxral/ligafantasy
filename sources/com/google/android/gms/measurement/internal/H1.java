package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class H1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16120a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16121b;

    /* renamed from: c, reason: collision with root package name */
    private String f16122c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ I1 f16123d;

    public H1(I1 i12, String str, String str2) {
        this.f16123d = i12;
        AbstractC1319p.f(str);
        this.f16120a = str;
    }

    public final String a() {
        if (!this.f16121b) {
            this.f16121b = true;
            this.f16122c = this.f16123d.o().getString(this.f16120a, null);
        }
        return this.f16122c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f16123d.o().edit();
        edit.putString(this.f16120a, str);
        edit.apply();
        this.f16122c = str;
    }
}
