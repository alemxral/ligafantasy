package v0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: v0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3814d extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3814d> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    int f38596a;

    /* renamed from: b, reason: collision with root package name */
    String f38597b;

    /* renamed from: c, reason: collision with root package name */
    double f38598c;

    /* renamed from: d, reason: collision with root package name */
    String f38599d;

    /* renamed from: e, reason: collision with root package name */
    long f38600e;

    /* renamed from: f, reason: collision with root package name */
    int f38601f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3814d(int i8, String str, double d8, String str2, long j8, int i9) {
        this.f38596a = i8;
        this.f38597b = str;
        this.f38598c = d8;
        this.f38599d = str2;
        this.f38600e = j8;
        this.f38601f = i9;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 2, this.f38596a);
        S.c.q(parcel, 3, this.f38597b, false);
        S.c.g(parcel, 4, this.f38598c);
        S.c.q(parcel, 5, this.f38599d, false);
        S.c.n(parcel, 6, this.f38600e);
        S.c.k(parcel, 7, this.f38601f);
        S.c.b(parcel, a8);
    }
}
