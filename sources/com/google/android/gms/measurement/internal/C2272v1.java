package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.v1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2272v1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f16876a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16877b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16878c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f16879d;

    public C2272v1(String str, String str2, Bundle bundle, long j8) {
        this.f16876a = str;
        this.f16877b = str2;
        this.f16879d = bundle;
        this.f16878c = j8;
    }

    public static C2272v1 b(C2270v c2270v) {
        return new C2272v1(c2270v.f16871a, c2270v.f16873c, c2270v.f16872b.z(), c2270v.f16874d);
    }

    public final C2270v a() {
        return new C2270v(this.f16876a, new C2260t(new Bundle(this.f16879d)), this.f16877b, this.f16878c);
    }

    public final String toString() {
        return "origin=" + this.f16877b + ",name=" + this.f16876a + ",params=" + this.f16879d.toString();
    }
}
