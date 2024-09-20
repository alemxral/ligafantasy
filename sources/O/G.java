package O;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class G extends S.a {
    public static final Parcelable.Creator<G> CREATOR = new H();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f7622a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7623b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7624c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7625d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G(boolean z8, String str, int i8, int i9) {
        this.f7622a = z8;
        this.f7623b = str;
        this.f7624c = O.a(i8) - 1;
        this.f7625d = t.a(i9) - 1;
    }

    public final int G() {
        return O.a(this.f7624c);
    }

    public final String s() {
        return this.f7623b;
    }

    public final boolean u() {
        return this.f7622a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.c(parcel, 1, this.f7622a);
        S.c.q(parcel, 2, this.f7623b, false);
        S.c.k(parcel, 3, this.f7624c);
        S.c.k(parcel, 4, this.f7625d);
        S.c.b(parcel, a8);
    }

    public final int z() {
        return t.a(this.f7625d);
    }
}
