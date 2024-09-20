package s0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import v0.C3813c;
import v0.C3816f;

/* renamed from: s0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3716f extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3716f> CREATOR = new U();

    /* renamed from: a, reason: collision with root package name */
    String f37722a;

    /* renamed from: b, reason: collision with root package name */
    String f37723b;

    /* renamed from: c, reason: collision with root package name */
    String f37724c;

    /* renamed from: d, reason: collision with root package name */
    String f37725d;

    /* renamed from: e, reason: collision with root package name */
    String f37726e;

    /* renamed from: f, reason: collision with root package name */
    String f37727f;

    /* renamed from: g, reason: collision with root package name */
    String f37728g;

    /* renamed from: h, reason: collision with root package name */
    String f37729h;

    /* renamed from: i, reason: collision with root package name */
    String f37730i;

    /* renamed from: j, reason: collision with root package name */
    String f37731j;

    /* renamed from: k, reason: collision with root package name */
    int f37732k;

    /* renamed from: l, reason: collision with root package name */
    final ArrayList f37733l;

    /* renamed from: m, reason: collision with root package name */
    C3816f f37734m;

    /* renamed from: n, reason: collision with root package name */
    final ArrayList f37735n;

    /* renamed from: o, reason: collision with root package name */
    String f37736o;

    /* renamed from: p, reason: collision with root package name */
    String f37737p;

    /* renamed from: q, reason: collision with root package name */
    final ArrayList f37738q;

    /* renamed from: r, reason: collision with root package name */
    boolean f37739r;

    /* renamed from: s, reason: collision with root package name */
    final ArrayList f37740s;

    /* renamed from: t, reason: collision with root package name */
    final ArrayList f37741t;

    /* renamed from: u, reason: collision with root package name */
    final ArrayList f37742u;

    /* renamed from: v, reason: collision with root package name */
    C3813c f37743v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3716f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i8, ArrayList arrayList, C3816f c3816f, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z8, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, C3813c c3813c) {
        this.f37722a = str;
        this.f37723b = str2;
        this.f37724c = str3;
        this.f37725d = str4;
        this.f37726e = str5;
        this.f37727f = str6;
        this.f37728g = str7;
        this.f37729h = str8;
        this.f37730i = str9;
        this.f37731j = str10;
        this.f37732k = i8;
        this.f37733l = arrayList;
        this.f37734m = c3816f;
        this.f37735n = arrayList2;
        this.f37736o = str11;
        this.f37737p = str12;
        this.f37738q = arrayList3;
        this.f37739r = z8;
        this.f37740s = arrayList4;
        this.f37741t = arrayList5;
        this.f37742u = arrayList6;
        this.f37743v = c3813c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 2, this.f37722a, false);
        S.c.q(parcel, 3, this.f37723b, false);
        S.c.q(parcel, 4, this.f37724c, false);
        S.c.q(parcel, 5, this.f37725d, false);
        S.c.q(parcel, 6, this.f37726e, false);
        S.c.q(parcel, 7, this.f37727f, false);
        S.c.q(parcel, 8, this.f37728g, false);
        S.c.q(parcel, 9, this.f37729h, false);
        S.c.q(parcel, 10, this.f37730i, false);
        S.c.q(parcel, 11, this.f37731j, false);
        S.c.k(parcel, 12, this.f37732k);
        S.c.u(parcel, 13, this.f37733l, false);
        S.c.p(parcel, 14, this.f37734m, i8, false);
        S.c.u(parcel, 15, this.f37735n, false);
        S.c.q(parcel, 16, this.f37736o, false);
        S.c.q(parcel, 17, this.f37737p, false);
        S.c.u(parcel, 18, this.f37738q, false);
        S.c.c(parcel, 19, this.f37739r);
        S.c.u(parcel, 20, this.f37740s, false);
        S.c.u(parcel, 21, this.f37741t, false);
        S.c.u(parcel, 22, this.f37742u, false);
        S.c.p(parcel, 23, this.f37743v, i8, false);
        S.c.b(parcel, a8);
    }
}
