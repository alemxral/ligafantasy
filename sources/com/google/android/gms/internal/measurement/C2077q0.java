package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.measurement.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2077q0 extends S.a {
    public static final Parcelable.Creator<C2077q0> CREATOR = new C2084r0();

    /* renamed from: a, reason: collision with root package name */
    public final long f15832a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15833b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15834c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15835d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15836e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15837f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f15838g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15839h;

    public C2077q0(long j8, long j9, boolean z8, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f15832a = j8;
        this.f15833b = j9;
        this.f15834c = z8;
        this.f15835d = str;
        this.f15836e = str2;
        this.f15837f = str3;
        this.f15838g = bundle;
        this.f15839h = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.n(parcel, 1, this.f15832a);
        S.c.n(parcel, 2, this.f15833b);
        S.c.c(parcel, 3, this.f15834c);
        S.c.q(parcel, 4, this.f15835d, false);
        S.c.q(parcel, 5, this.f15836e, false);
        S.c.q(parcel, 6, this.f15837f, false);
        S.c.e(parcel, 7, this.f15838g, false);
        S.c.q(parcel, 8, this.f15839h, false);
        S.c.b(parcel, a8);
    }
}
