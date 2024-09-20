package R;

import O.C1260d;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class h0 extends S.a {
    public static final Parcelable.Creator<h0> CREATOR = new i0();

    /* renamed from: a, reason: collision with root package name */
    Bundle f8556a;

    /* renamed from: b, reason: collision with root package name */
    C1260d[] f8557b;

    /* renamed from: c, reason: collision with root package name */
    int f8558c;

    /* renamed from: d, reason: collision with root package name */
    C1308e f8559d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(Bundle bundle, C1260d[] c1260dArr, int i8, C1308e c1308e) {
        this.f8556a = bundle;
        this.f8557b = c1260dArr;
        this.f8558c = i8;
        this.f8559d = c1308e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.e(parcel, 1, this.f8556a, false);
        S.c.t(parcel, 2, this.f8557b, i8, false);
        S.c.k(parcel, 3, this.f8558c);
        S.c.p(parcel, 4, this.f8559d, i8, false);
        S.c.b(parcel, a8);
    }
}
