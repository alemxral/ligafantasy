package s0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: s0.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3730u extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3730u> CREATOR = new H();

    /* renamed from: a, reason: collision with root package name */
    int f37789a;

    /* renamed from: b, reason: collision with root package name */
    String f37790b;

    /* renamed from: c, reason: collision with root package name */
    String f37791c;

    public C3730u(int i8, String str, String str2) {
        this.f37789a = i8;
        this.f37790b = str;
        this.f37791c = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 1, this.f37789a);
        S.c.q(parcel, 2, this.f37790b, false);
        S.c.q(parcel, 3, this.f37791c, false);
        S.c.b(parcel, a8);
    }
}
