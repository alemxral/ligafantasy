package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2173d extends S.a {
    public static final Parcelable.Creator<C2173d> CREATOR = new C2179e();

    /* renamed from: a, reason: collision with root package name */
    public String f16433a;

    /* renamed from: b, reason: collision with root package name */
    public String f16434b;

    /* renamed from: c, reason: collision with root package name */
    public u4 f16435c;

    /* renamed from: d, reason: collision with root package name */
    public long f16436d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16437e;

    /* renamed from: f, reason: collision with root package name */
    public String f16438f;

    /* renamed from: g, reason: collision with root package name */
    public final C2270v f16439g;

    /* renamed from: h, reason: collision with root package name */
    public long f16440h;

    /* renamed from: i, reason: collision with root package name */
    public C2270v f16441i;

    /* renamed from: j, reason: collision with root package name */
    public final long f16442j;

    /* renamed from: k, reason: collision with root package name */
    public final C2270v f16443k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2173d(C2173d c2173d) {
        AbstractC1319p.l(c2173d);
        this.f16433a = c2173d.f16433a;
        this.f16434b = c2173d.f16434b;
        this.f16435c = c2173d.f16435c;
        this.f16436d = c2173d.f16436d;
        this.f16437e = c2173d.f16437e;
        this.f16438f = c2173d.f16438f;
        this.f16439g = c2173d.f16439g;
        this.f16440h = c2173d.f16440h;
        this.f16441i = c2173d.f16441i;
        this.f16442j = c2173d.f16442j;
        this.f16443k = c2173d.f16443k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 2, this.f16433a, false);
        S.c.q(parcel, 3, this.f16434b, false);
        S.c.p(parcel, 4, this.f16435c, i8, false);
        S.c.n(parcel, 5, this.f16436d);
        S.c.c(parcel, 6, this.f16437e);
        S.c.q(parcel, 7, this.f16438f, false);
        S.c.p(parcel, 8, this.f16439g, i8, false);
        S.c.n(parcel, 9, this.f16440h);
        S.c.p(parcel, 10, this.f16441i, i8, false);
        S.c.n(parcel, 11, this.f16442j);
        S.c.p(parcel, 12, this.f16443k, i8, false);
        S.c.b(parcel, a8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2173d(String str, String str2, u4 u4Var, long j8, boolean z8, String str3, C2270v c2270v, long j9, C2270v c2270v2, long j10, C2270v c2270v3) {
        this.f16433a = str;
        this.f16434b = str2;
        this.f16435c = u4Var;
        this.f16436d = j8;
        this.f16437e = z8;
        this.f16438f = str3;
        this.f16439g = c2270v;
        this.f16440h = j9;
        this.f16441i = c2270v2;
        this.f16442j = j10;
        this.f16443k = c2270v3;
    }
}
