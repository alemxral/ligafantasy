package R;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class r extends S.a {

    @NonNull
    public static final Parcelable.Creator<r> CREATOR = new a0();

    /* renamed from: a, reason: collision with root package name */
    private final int f8599a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8600b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f8601c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8602d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8603e;

    public r(int i8, boolean z8, boolean z9, int i9, int i10) {
        this.f8599a = i8;
        this.f8600b = z8;
        this.f8601c = z9;
        this.f8602d = i9;
        this.f8603e = i10;
    }

    public boolean G() {
        return this.f8601c;
    }

    public int I() {
        return this.f8599a;
    }

    public int s() {
        return this.f8602d;
    }

    public int u() {
        return this.f8603e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 1, I());
        S.c.c(parcel, 2, z());
        S.c.c(parcel, 3, G());
        S.c.k(parcel, 4, s());
        S.c.k(parcel, 5, u());
        S.c.b(parcel, a8);
    }

    public boolean z() {
        return this.f8600b;
    }
}
