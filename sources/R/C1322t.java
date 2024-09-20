package R;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* renamed from: R.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1322t extends S.a {

    @NonNull
    public static final Parcelable.Creator<C1322t> CREATOR = new C1326x();

    /* renamed from: a, reason: collision with root package name */
    private final int f8609a;

    /* renamed from: b, reason: collision with root package name */
    private List f8610b;

    public C1322t(int i8, List list) {
        this.f8609a = i8;
        this.f8610b = list;
    }

    public final int s() {
        return this.f8609a;
    }

    public final List u() {
        return this.f8610b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 1, this.f8609a);
        S.c.u(parcel, 2, this.f8610b, false);
        S.c.b(parcel, a8);
    }

    public final void z(C1316m c1316m) {
        if (this.f8610b == null) {
            this.f8610b = new ArrayList();
        }
        this.f8610b.add(c1316m);
    }
}
