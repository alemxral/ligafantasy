package s0;

import R.AbstractC1319p;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* renamed from: s0.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3720j extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3720j> CREATOR = new z();

    /* renamed from: a, reason: collision with root package name */
    boolean f37757a;

    /* renamed from: b, reason: collision with root package name */
    boolean f37758b;

    /* renamed from: c, reason: collision with root package name */
    C3713c f37759c;

    /* renamed from: d, reason: collision with root package name */
    boolean f37760d;

    /* renamed from: e, reason: collision with root package name */
    C3729t f37761e;

    /* renamed from: f, reason: collision with root package name */
    ArrayList f37762f;

    /* renamed from: g, reason: collision with root package name */
    C3722l f37763g;

    /* renamed from: h, reason: collision with root package name */
    C3730u f37764h;

    /* renamed from: i, reason: collision with root package name */
    boolean f37765i;

    /* renamed from: j, reason: collision with root package name */
    String f37766j;

    /* renamed from: k, reason: collision with root package name */
    byte[] f37767k;

    /* renamed from: l, reason: collision with root package name */
    Bundle f37768l;

    /* renamed from: s0.j$a */
    /* loaded from: classes3.dex */
    public final class a {
        /* synthetic */ a(y yVar) {
        }

        public C3720j a() {
            C3720j c3720j = C3720j.this;
            if (c3720j.f37766j == null && c3720j.f37767k == null) {
                AbstractC1319p.m(c3720j.f37762f, "Allowed payment methods must be set! You can set it through addAllowedPaymentMethod() or addAllowedPaymentMethods() in the PaymentDataRequest Builder.");
                AbstractC1319p.m(C3720j.this.f37759c, "Card requirements must be set!");
                C3720j c3720j2 = C3720j.this;
                if (c3720j2.f37763g != null) {
                    AbstractC1319p.m(c3720j2.f37764h, "Transaction info must be set if paymentMethodTokenizationParameters is set!");
                }
            }
            return C3720j.this;
        }
    }

    private C3720j() {
        this.f37765i = true;
    }

    public static C3720j s(String str) {
        a u8 = u();
        C3720j.this.f37766j = (String) AbstractC1319p.m(str, "paymentDataRequestJson cannot be null!");
        return u8.a();
    }

    public static a u() {
        return new a(null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.c(parcel, 1, this.f37757a);
        S.c.c(parcel, 2, this.f37758b);
        S.c.p(parcel, 3, this.f37759c, i8, false);
        S.c.c(parcel, 4, this.f37760d);
        S.c.p(parcel, 5, this.f37761e, i8, false);
        S.c.m(parcel, 6, this.f37762f, false);
        S.c.p(parcel, 7, this.f37763g, i8, false);
        S.c.p(parcel, 8, this.f37764h, i8, false);
        S.c.c(parcel, 9, this.f37765i);
        S.c.q(parcel, 10, this.f37766j, false);
        S.c.e(parcel, 11, this.f37768l, false);
        S.c.f(parcel, 12, this.f37767k, false);
        S.c.b(parcel, a8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3720j(boolean z8, boolean z9, C3713c c3713c, boolean z10, C3729t c3729t, ArrayList arrayList, C3722l c3722l, C3730u c3730u, boolean z11, String str, byte[] bArr, Bundle bundle) {
        this.f37757a = z8;
        this.f37758b = z9;
        this.f37759c = c3713c;
        this.f37760d = z10;
        this.f37761e = c3729t;
        this.f37762f = arrayList;
        this.f37763g = c3722l;
        this.f37764h = c3730u;
        this.f37765i = z11;
        this.f37766j = str;
        this.f37767k = bArr;
        this.f37768l = bundle;
    }
}
