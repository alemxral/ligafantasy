package v0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: v0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3815e extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3815e> CREATOR = new o();

    /* renamed from: a, reason: collision with root package name */
    String f38602a;

    /* renamed from: b, reason: collision with root package name */
    String f38603b;

    public C3815e(String str, String str2) {
        this.f38602a = str;
        this.f38603b = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 2, this.f38602a, false);
        S.c.q(parcel, 3, this.f38603b, false);
        S.c.b(parcel, a8);
    }
}
