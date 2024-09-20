package s0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: s0.E, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3708E extends S.a {
    public static final Parcelable.Creator<C3708E> CREATOR = new C3709F();

    /* renamed from: a, reason: collision with root package name */
    final String f37686a;

    /* renamed from: b, reason: collision with root package name */
    final String f37687b;

    /* renamed from: c, reason: collision with root package name */
    final int f37688c;

    /* renamed from: d, reason: collision with root package name */
    final int f37689d;

    public C3708E(String str, String str2, int i8, int i9) {
        this.f37686a = str;
        this.f37687b = str2;
        this.f37688c = i8;
        this.f37689d = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f37686a;
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 2, str, false);
        S.c.q(parcel, 3, this.f37687b, false);
        S.c.k(parcel, 4, this.f37688c);
        S.c.k(parcel, 5, this.f37689d);
        S.c.b(parcel, a8);
    }
}
