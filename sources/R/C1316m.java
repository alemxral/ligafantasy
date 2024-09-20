package R;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: R.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1316m extends S.a {

    @NonNull
    public static final Parcelable.Creator<C1316m> CREATOR = new H();

    /* renamed from: a, reason: collision with root package name */
    private final int f8568a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8569b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8570c;

    /* renamed from: d, reason: collision with root package name */
    private final long f8571d;

    /* renamed from: e, reason: collision with root package name */
    private final long f8572e;

    /* renamed from: f, reason: collision with root package name */
    private final String f8573f;

    /* renamed from: g, reason: collision with root package name */
    private final String f8574g;

    /* renamed from: h, reason: collision with root package name */
    private final int f8575h;

    /* renamed from: i, reason: collision with root package name */
    private final int f8576i;

    public C1316m(int i8, int i9, int i10, long j8, long j9, String str, String str2, int i11, int i12) {
        this.f8568a = i8;
        this.f8569b = i9;
        this.f8570c = i10;
        this.f8571d = j8;
        this.f8572e = j9;
        this.f8573f = str;
        this.f8574g = str2;
        this.f8575h = i11;
        this.f8576i = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f8568a;
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 1, i9);
        S.c.k(parcel, 2, this.f8569b);
        S.c.k(parcel, 3, this.f8570c);
        S.c.n(parcel, 4, this.f8571d);
        S.c.n(parcel, 5, this.f8572e);
        S.c.q(parcel, 6, this.f8573f, false);
        S.c.q(parcel, 7, this.f8574g, false);
        S.c.k(parcel, 8, this.f8575h);
        S.c.k(parcel, 9, this.f8576i);
        S.c.b(parcel, a8);
    }
}
