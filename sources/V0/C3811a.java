package v0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3811a extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3811a> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    String f38588a;

    /* renamed from: b, reason: collision with root package name */
    String f38589b;

    public C3811a(String str, String str2) {
        this.f38588a = str;
        this.f38589b = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 2, this.f38588a, false);
        S.c.q(parcel, 3, this.f38589b, false);
        S.c.b(parcel, a8);
    }
}
