package v0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: v0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3818h extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3818h> CREATOR = new r();

    /* renamed from: a, reason: collision with root package name */
    String f38608a;

    /* renamed from: b, reason: collision with root package name */
    String f38609b;

    /* renamed from: c, reason: collision with root package name */
    C3816f f38610c;

    /* renamed from: d, reason: collision with root package name */
    C3817g f38611d;

    /* renamed from: e, reason: collision with root package name */
    C3817g f38612e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3818h(String str, String str2, C3816f c3816f, C3817g c3817g, C3817g c3817g2) {
        this.f38608a = str;
        this.f38609b = str2;
        this.f38610c = c3816f;
        this.f38611d = c3817g;
        this.f38612e = c3817g2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 2, this.f38608a, false);
        S.c.q(parcel, 3, this.f38609b, false);
        S.c.p(parcel, 4, this.f38610c, i8, false);
        S.c.p(parcel, 5, this.f38611d, i8, false);
        S.c.p(parcel, 6, this.f38612e, i8, false);
        S.c.b(parcel, a8);
    }
}
