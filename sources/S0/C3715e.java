package s0;

import R.AbstractC1319p;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* renamed from: s0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3715e extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3715e> CREATOR = new T();

    /* renamed from: a, reason: collision with root package name */
    ArrayList f37715a;

    /* renamed from: b, reason: collision with root package name */
    String f37716b;

    /* renamed from: c, reason: collision with root package name */
    String f37717c;

    /* renamed from: d, reason: collision with root package name */
    ArrayList f37718d;

    /* renamed from: e, reason: collision with root package name */
    boolean f37719e;

    /* renamed from: f, reason: collision with root package name */
    String f37720f;

    /* renamed from: s0.e$a */
    /* loaded from: classes3.dex */
    public final class a {
        /* synthetic */ a(S s8) {
        }

        public C3715e a() {
            return C3715e.this;
        }
    }

    C3715e() {
    }

    public static C3715e s(String str) {
        a u8 = u();
        C3715e.this.f37720f = (String) AbstractC1319p.m(str, "isReadyToPayRequestJson cannot be null!");
        return u8.a();
    }

    public static a u() {
        return new a(null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.m(parcel, 2, this.f37715a, false);
        S.c.q(parcel, 4, this.f37716b, false);
        S.c.q(parcel, 5, this.f37717c, false);
        S.c.m(parcel, 6, this.f37718d, false);
        S.c.c(parcel, 7, this.f37719e);
        S.c.q(parcel, 8, this.f37720f, false);
        S.c.b(parcel, a8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3715e(ArrayList arrayList, String str, String str2, ArrayList arrayList2, boolean z8, String str3) {
        this.f37715a = arrayList;
        this.f37716b = str;
        this.f37717c = str2;
        this.f37718d = arrayList2;
        this.f37719e = z8;
        this.f37720f = str3;
    }
}
