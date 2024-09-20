package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2270v extends S.a {
    public static final Parcelable.Creator<C2270v> CREATOR = new C2275w();

    /* renamed from: a, reason: collision with root package name */
    public final String f16871a;

    /* renamed from: b, reason: collision with root package name */
    public final C2260t f16872b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16873c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16874d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2270v(C2270v c2270v, long j8) {
        AbstractC1319p.l(c2270v);
        this.f16871a = c2270v.f16871a;
        this.f16872b = c2270v.f16872b;
        this.f16873c = c2270v.f16873c;
        this.f16874d = j8;
    }

    public final String toString() {
        return "origin=" + this.f16873c + ",name=" + this.f16871a + ",params=" + String.valueOf(this.f16872b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        C2275w.a(this, parcel, i8);
    }

    public C2270v(String str, C2260t c2260t, String str2, long j8) {
        this.f16871a = str;
        this.f16872b = c2260t;
        this.f16873c = str2;
        this.f16874d = j8;
    }
}
