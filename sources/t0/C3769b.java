package t0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3769b extends S.a {
    public static final Parcelable.Creator<C3769b> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    String f38184a;

    /* renamed from: b, reason: collision with root package name */
    int f38185b;

    /* renamed from: c, reason: collision with root package name */
    boolean f38186c;

    /* renamed from: d, reason: collision with root package name */
    String f38187d;

    /* renamed from: e, reason: collision with root package name */
    String f38188e;

    /* renamed from: f, reason: collision with root package name */
    String f38189f;

    /* renamed from: g, reason: collision with root package name */
    String f38190g;

    /* renamed from: h, reason: collision with root package name */
    String f38191h;

    /* renamed from: i, reason: collision with root package name */
    String f38192i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3769b(String str, int i8, boolean z8, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f38184a = str;
        this.f38185b = i8;
        this.f38186c = z8;
        this.f38187d = str2;
        this.f38188e = str3;
        this.f38189f = str4;
        this.f38190g = str5;
        this.f38191h = str6;
        this.f38192i = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 1, this.f38184a, false);
        S.c.k(parcel, 2, this.f38185b);
        S.c.c(parcel, 3, this.f38186c);
        S.c.q(parcel, 4, this.f38187d, false);
        S.c.q(parcel, 5, this.f38188e, false);
        S.c.q(parcel, 6, this.f38189f, false);
        S.c.q(parcel, 7, this.f38190g, false);
        S.c.q(parcel, 8, this.f38191h, false);
        S.c.q(parcel, 9, this.f38192i, false);
        S.c.b(parcel, a8);
    }
}
