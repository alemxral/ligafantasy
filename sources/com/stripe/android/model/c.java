package com.stripe.android.model;

import M5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import b3.InterfaceC1874i;
import com.stripe.android.model.m;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class c implements InterfaceC1874i {

    /* renamed from: a, reason: collision with root package name */
    private final String f24230a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24231b;

    /* renamed from: c, reason: collision with root package name */
    private final p f24232c;

    /* renamed from: d, reason: collision with root package name */
    private String f24233d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f24234e;

    /* renamed from: f, reason: collision with root package name */
    private String f24235f;

    /* renamed from: g, reason: collision with root package name */
    private m f24236g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f24228h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f24229i = 8;
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ c c(a aVar, p pVar, String str, m mVar, String str2, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                mVar = null;
            }
            if ((i8 & 8) != 0) {
                str2 = null;
            }
            return aVar.a(pVar, str, mVar, str2);
        }

        public static /* synthetic */ c d(a aVar, String str, String str2, m mVar, String str3, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                mVar = null;
            }
            if ((i8 & 8) != 0) {
                str3 = null;
            }
            return aVar.b(str, str2, mVar, str3);
        }

        public final c a(p paymentMethodCreateParams, String clientSecret, m mVar, String str) {
            AbstractC3159y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
            AbstractC3159y.i(clientSecret, "clientSecret");
            return new c(clientSecret, null, paymentMethodCreateParams, null, false, str, mVar, 26, null);
        }

        public final c b(String paymentMethodId, String clientSecret, m mVar, String str) {
            AbstractC3159y.i(paymentMethodId, "paymentMethodId");
            AbstractC3159y.i(clientSecret, "clientSecret");
            return new c(clientSecret, paymentMethodId, null, null, false, str, mVar, 28, null);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new c(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : p.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0 ? m.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i8) {
            return new c[i8];
        }
    }

    public c(String clientSecret, String str, p pVar, String str2, boolean z8, String str3, m mVar) {
        AbstractC3159y.i(clientSecret, "clientSecret");
        this.f24230a = clientSecret;
        this.f24231b = str;
        this.f24232c = pVar;
        this.f24233d = str2;
        this.f24234e = z8;
        this.f24235f = str3;
        this.f24236g = mVar;
    }

    public static /* synthetic */ c c(c cVar, String str, String str2, p pVar, String str3, boolean z8, String str4, m mVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = cVar.f24230a;
        }
        if ((i8 & 2) != 0) {
            str2 = cVar.f24231b;
        }
        String str5 = str2;
        if ((i8 & 4) != 0) {
            pVar = cVar.f24232c;
        }
        p pVar2 = pVar;
        if ((i8 & 8) != 0) {
            str3 = cVar.f24233d;
        }
        String str6 = str3;
        if ((i8 & 16) != 0) {
            z8 = cVar.f24234e;
        }
        boolean z9 = z8;
        if ((i8 & 32) != 0) {
            str4 = cVar.f24235f;
        }
        String str7 = str4;
        if ((i8 & 64) != 0) {
            mVar = cVar.f24236g;
        }
        return cVar.b(str, str5, pVar2, str6, z9, str7, mVar);
    }

    private final Map e() {
        Map y8;
        m mVar = this.f24236g;
        if (mVar == null || (y8 = mVar.y()) == null) {
            p pVar = this.f24232c;
            if (pVar != null && pVar.n() && this.f24235f == null) {
                return new m(m.c.a.f24307e.a()).y();
            }
            return null;
        }
        return y8;
    }

    private final Map i() {
        p pVar = this.f24232c;
        if (pVar != null) {
            return Q.e(L5.x.a("payment_method_data", pVar.y()));
        }
        String str = this.f24231b;
        if (str != null) {
            return Q.e(L5.x.a("payment_method", str));
        }
        return Q.h();
    }

    @Override // b3.InterfaceC1874i
    public void W(String str) {
        this.f24233d = str;
    }

    public final c b(String clientSecret, String str, p pVar, String str2, boolean z8, String str3, m mVar) {
        AbstractC3159y.i(clientSecret, "clientSecret");
        return new c(clientSecret, str, pVar, str2, z8, str3, mVar);
    }

    @Override // b3.InterfaceC1874i
    public /* synthetic */ String d() {
        return this.f24230a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC3159y.d(this.f24230a, cVar.f24230a) && AbstractC3159y.d(this.f24231b, cVar.f24231b) && AbstractC3159y.d(this.f24232c, cVar.f24232c) && AbstractC3159y.d(this.f24233d, cVar.f24233d) && this.f24234e == cVar.f24234e && AbstractC3159y.d(this.f24235f, cVar.f24235f) && AbstractC3159y.d(this.f24236g, cVar.f24236g);
    }

    public final /* synthetic */ p f() {
        return this.f24232c;
    }

    public int hashCode() {
        int hashCode = this.f24230a.hashCode() * 31;
        String str = this.f24231b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        p pVar = this.f24232c;
        int hashCode3 = (hashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str2 = this.f24233d;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f24234e)) * 31;
        String str3 = this.f24235f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        m mVar = this.f24236g;
        return hashCode5 + (mVar != null ? mVar.hashCode() : 0);
    }

    @Override // b3.InterfaceC1874i
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public c C(boolean z8) {
        return c(this, null, null, null, null, z8, null, null, 111, null);
    }

    public String toString() {
        return "ConfirmSetupIntentParams(clientSecret=" + this.f24230a + ", paymentMethodId=" + this.f24231b + ", paymentMethodCreateParams=" + this.f24232c + ", returnUrl=" + this.f24233d + ", useStripeSdk=" + this.f24234e + ", mandateId=" + this.f24235f + ", mandateData=" + this.f24236g + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f24230a);
        out.writeString(this.f24231b);
        p pVar = this.f24232c;
        if (pVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            pVar.writeToParcel(out, i8);
        }
        out.writeString(this.f24233d);
        out.writeInt(this.f24234e ? 1 : 0);
        out.writeString(this.f24235f);
        m mVar = this.f24236g;
        if (mVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            mVar.writeToParcel(out, i8);
        }
    }

    @Override // b3.InterfaceC1874i
    public String x() {
        return this.f24233d;
    }

    @Override // b3.InterfaceC1863H
    public Map y() {
        Map map;
        Map map2;
        Map k8 = Q.k(L5.x.a("client_secret", d()), L5.x.a("use_stripe_sdk", Boolean.valueOf(this.f24234e)));
        String x8 = x();
        Map map3 = null;
        if (x8 != null) {
            map = Q.e(L5.x.a("return_url", x8));
        } else {
            map = null;
        }
        if (map == null) {
            map = Q.h();
        }
        Map q8 = Q.q(k8, map);
        String str = this.f24235f;
        if (str != null) {
            map2 = Q.e(L5.x.a("mandate", str));
        } else {
            map2 = null;
        }
        if (map2 == null) {
            map2 = Q.h();
        }
        Map q9 = Q.q(q8, map2);
        Map e8 = e();
        if (e8 != null) {
            map3 = Q.e(L5.x.a("mandate_data", e8));
        }
        if (map3 == null) {
            map3 = Q.h();
        }
        return Q.q(Q.q(q9, map3), i());
    }

    public /* synthetic */ c(String str, String str2, p pVar, String str3, boolean z8, String str4, m mVar, int i8, AbstractC3151p abstractC3151p) {
        this(str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : pVar, (i8 & 8) != 0 ? null : str3, (i8 & 16) != 0 ? false : z8, (i8 & 32) != 0 ? null : str4, (i8 & 64) == 0 ? mVar : null);
    }
}
