package s0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: s0.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3732w extends S.a {
    public static final Parcelable.Creator<C3732w> CREATOR = new M();

    /* renamed from: a, reason: collision with root package name */
    String f37805a;

    /* renamed from: b, reason: collision with root package name */
    String f37806b;

    /* renamed from: c, reason: collision with root package name */
    String f37807c;

    /* renamed from: d, reason: collision with root package name */
    String f37808d;

    /* renamed from: e, reason: collision with root package name */
    String f37809e;

    /* renamed from: f, reason: collision with root package name */
    String f37810f;

    /* renamed from: g, reason: collision with root package name */
    String f37811g;

    /* renamed from: h, reason: collision with root package name */
    String f37812h;

    /* renamed from: i, reason: collision with root package name */
    String f37813i;

    /* renamed from: j, reason: collision with root package name */
    boolean f37814j;

    /* renamed from: k, reason: collision with root package name */
    String f37815k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3732w(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z8, String str10) {
        this.f37805a = str;
        this.f37806b = str2;
        this.f37807c = str3;
        this.f37808d = str4;
        this.f37809e = str5;
        this.f37810f = str6;
        this.f37811g = str7;
        this.f37812h = str8;
        this.f37813i = str9;
        this.f37814j = z8;
        this.f37815k = str10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 2, this.f37805a, false);
        S.c.q(parcel, 3, this.f37806b, false);
        S.c.q(parcel, 4, this.f37807c, false);
        S.c.q(parcel, 5, this.f37808d, false);
        S.c.q(parcel, 6, this.f37809e, false);
        S.c.q(parcel, 7, this.f37810f, false);
        S.c.q(parcel, 8, this.f37811g, false);
        S.c.q(parcel, 9, this.f37812h, false);
        S.c.q(parcel, 10, this.f37813i, false);
        S.c.c(parcel, 11, this.f37814j);
        S.c.q(parcel, 12, this.f37815k, false);
        S.c.b(parcel, a8);
    }
}
