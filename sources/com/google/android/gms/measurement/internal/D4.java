package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes3.dex */
public final class D4 extends S.a {
    public static final Parcelable.Creator<D4> CREATOR = new E4();

    /* renamed from: a, reason: collision with root package name */
    public final String f16048a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16049b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16050c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16051d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16052e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16053f;

    /* renamed from: g, reason: collision with root package name */
    public final String f16054g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f16055h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f16056i;

    /* renamed from: j, reason: collision with root package name */
    public final long f16057j;

    /* renamed from: k, reason: collision with root package name */
    public final String f16058k;

    /* renamed from: l, reason: collision with root package name */
    public final long f16059l;

    /* renamed from: m, reason: collision with root package name */
    public final long f16060m;

    /* renamed from: n, reason: collision with root package name */
    public final int f16061n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f16062o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f16063p;

    /* renamed from: q, reason: collision with root package name */
    public final String f16064q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f16065r;

    /* renamed from: s, reason: collision with root package name */
    public final long f16066s;

    /* renamed from: t, reason: collision with root package name */
    public final List f16067t;

    /* renamed from: u, reason: collision with root package name */
    public final String f16068u;

    /* renamed from: v, reason: collision with root package name */
    public final String f16069v;

    /* renamed from: w, reason: collision with root package name */
    public final String f16070w;

    /* renamed from: x, reason: collision with root package name */
    public final String f16071x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f16072y;

    /* renamed from: z, reason: collision with root package name */
    public final long f16073z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D4(String str, String str2, String str3, long j8, String str4, long j9, long j10, String str5, boolean z8, boolean z9, String str6, long j11, long j12, int i8, boolean z10, boolean z11, String str7, Boolean bool, long j13, List list, String str8, String str9, String str10, String str11, boolean z12, long j14) {
        AbstractC1319p.f(str);
        this.f16048a = str;
        this.f16049b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f16050c = str3;
        this.f16057j = j8;
        this.f16051d = str4;
        this.f16052e = j9;
        this.f16053f = j10;
        this.f16054g = str5;
        this.f16055h = z8;
        this.f16056i = z9;
        this.f16058k = str6;
        this.f16059l = 0L;
        this.f16060m = j12;
        this.f16061n = i8;
        this.f16062o = z10;
        this.f16063p = z11;
        this.f16064q = str7;
        this.f16065r = bool;
        this.f16066s = j13;
        this.f16067t = list;
        this.f16068u = null;
        this.f16069v = str9;
        this.f16070w = str10;
        this.f16071x = str11;
        this.f16072y = z12;
        this.f16073z = j14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 2, this.f16048a, false);
        S.c.q(parcel, 3, this.f16049b, false);
        S.c.q(parcel, 4, this.f16050c, false);
        S.c.q(parcel, 5, this.f16051d, false);
        S.c.n(parcel, 6, this.f16052e);
        S.c.n(parcel, 7, this.f16053f);
        S.c.q(parcel, 8, this.f16054g, false);
        S.c.c(parcel, 9, this.f16055h);
        S.c.c(parcel, 10, this.f16056i);
        S.c.n(parcel, 11, this.f16057j);
        S.c.q(parcel, 12, this.f16058k, false);
        S.c.n(parcel, 13, this.f16059l);
        S.c.n(parcel, 14, this.f16060m);
        S.c.k(parcel, 15, this.f16061n);
        S.c.c(parcel, 16, this.f16062o);
        S.c.c(parcel, 18, this.f16063p);
        S.c.q(parcel, 19, this.f16064q, false);
        S.c.d(parcel, 21, this.f16065r, false);
        S.c.n(parcel, 22, this.f16066s);
        S.c.s(parcel, 23, this.f16067t, false);
        S.c.q(parcel, 24, this.f16068u, false);
        S.c.q(parcel, 25, this.f16069v, false);
        S.c.q(parcel, 26, this.f16070w, false);
        S.c.q(parcel, 27, this.f16071x, false);
        S.c.c(parcel, 28, this.f16072y);
        S.c.n(parcel, 29, this.f16073z);
        S.c.b(parcel, a8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public D4(String str, String str2, String str3, String str4, long j8, long j9, String str5, boolean z8, boolean z9, long j10, String str6, long j11, long j12, int i8, boolean z10, boolean z11, String str7, Boolean bool, long j13, List list, String str8, String str9, String str10, String str11, boolean z12, long j14) {
        this.f16048a = str;
        this.f16049b = str2;
        this.f16050c = str3;
        this.f16057j = j10;
        this.f16051d = str4;
        this.f16052e = j8;
        this.f16053f = j9;
        this.f16054g = str5;
        this.f16055h = z8;
        this.f16056i = z9;
        this.f16058k = str6;
        this.f16059l = j11;
        this.f16060m = j12;
        this.f16061n = i8;
        this.f16062o = z10;
        this.f16063p = z11;
        this.f16064q = str7;
        this.f16065r = bool;
        this.f16066s = j13;
        this.f16067t = list;
        this.f16068u = str8;
        this.f16069v = str9;
        this.f16070w = str10;
        this.f16071x = str11;
        this.f16072y = z12;
        this.f16073z = j14;
    }
}
