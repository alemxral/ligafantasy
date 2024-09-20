package com.google.android.gms.wallet.wobs;

import S.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import v0.C3816f;

@KeepName
/* loaded from: classes3.dex */
public class CommonWalletObject extends S.a {

    @NonNull
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    String f16980a;

    /* renamed from: b, reason: collision with root package name */
    String f16981b;

    /* renamed from: c, reason: collision with root package name */
    String f16982c;

    /* renamed from: d, reason: collision with root package name */
    String f16983d;

    /* renamed from: e, reason: collision with root package name */
    String f16984e;

    /* renamed from: f, reason: collision with root package name */
    String f16985f;

    /* renamed from: g, reason: collision with root package name */
    String f16986g;

    /* renamed from: h, reason: collision with root package name */
    String f16987h;

    /* renamed from: i, reason: collision with root package name */
    int f16988i;

    /* renamed from: j, reason: collision with root package name */
    final ArrayList f16989j;

    /* renamed from: k, reason: collision with root package name */
    C3816f f16990k;

    /* renamed from: l, reason: collision with root package name */
    final ArrayList f16991l;

    /* renamed from: m, reason: collision with root package name */
    String f16992m;

    /* renamed from: n, reason: collision with root package name */
    String f16993n;

    /* renamed from: o, reason: collision with root package name */
    final ArrayList f16994o;

    /* renamed from: p, reason: collision with root package name */
    boolean f16995p;

    /* renamed from: q, reason: collision with root package name */
    final ArrayList f16996q;

    /* renamed from: r, reason: collision with root package name */
    final ArrayList f16997r;

    /* renamed from: s, reason: collision with root package name */
    final ArrayList f16998s;

    CommonWalletObject() {
        this.f16989j = W.b.c();
        this.f16991l = W.b.c();
        this.f16994o = W.b.c();
        this.f16996q = W.b.c();
        this.f16997r = W.b.c();
        this.f16998s = W.b.c();
    }

    public static a s() {
        return new a(new CommonWalletObject(), null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = c.a(parcel);
        c.q(parcel, 2, this.f16980a, false);
        c.q(parcel, 3, this.f16981b, false);
        c.q(parcel, 4, this.f16982c, false);
        c.q(parcel, 5, this.f16983d, false);
        c.q(parcel, 6, this.f16984e, false);
        c.q(parcel, 7, this.f16985f, false);
        c.q(parcel, 8, this.f16986g, false);
        c.q(parcel, 9, this.f16987h, false);
        c.k(parcel, 10, this.f16988i);
        c.u(parcel, 11, this.f16989j, false);
        c.p(parcel, 12, this.f16990k, i8, false);
        c.u(parcel, 13, this.f16991l, false);
        c.q(parcel, 14, this.f16992m, false);
        c.q(parcel, 15, this.f16993n, false);
        c.u(parcel, 16, this.f16994o, false);
        c.c(parcel, 17, this.f16995p);
        c.u(parcel, 18, this.f16996q, false);
        c.u(parcel, 19, this.f16997r, false);
        c.u(parcel, 20, this.f16998s, false);
        c.b(parcel, a8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i8, ArrayList arrayList, C3816f c3816f, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z8, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.f16980a = str;
        this.f16981b = str2;
        this.f16982c = str3;
        this.f16983d = str4;
        this.f16984e = str5;
        this.f16985f = str6;
        this.f16986g = str7;
        this.f16987h = str8;
        this.f16988i = i8;
        this.f16989j = arrayList;
        this.f16990k = c3816f;
        this.f16991l = arrayList2;
        this.f16992m = str9;
        this.f16993n = str10;
        this.f16994o = arrayList3;
        this.f16995p = z8;
        this.f16996q = arrayList4;
        this.f16997r = arrayList5;
        this.f16998s = arrayList6;
    }
}
