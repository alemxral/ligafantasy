package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import b3.C1858C;
import b3.C1864I;
import c3.C1912E;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class k implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final C1864I f24292a;

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.model.a f24293b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24294c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24295d;

    /* renamed from: e, reason: collision with root package name */
    private final String f24296e;

    /* renamed from: f, reason: collision with root package name */
    private final C1858C f24297f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f24290g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f24291h = 8;
    public static final Parcelable.Creator<k> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        private final C1858C a(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("shippingAddress");
            if (optJSONObject != null) {
                String l8 = v2.e.l(optJSONObject, "address1");
                String l9 = v2.e.l(optJSONObject, "address2");
                String l10 = v2.e.l(optJSONObject, HintConstants.AUTOFILL_HINT_POSTAL_CODE);
                return new C1858C(new com.stripe.android.model.a(v2.e.l(optJSONObject, "locality"), v2.e.l(optJSONObject, "countryCode"), l8, l9, l10, v2.e.l(optJSONObject, "administrativeArea")), v2.e.l(optJSONObject, "name"), v2.e.l(optJSONObject, HintConstants.AUTOFILL_HINT_PHONE_NUMBER));
            }
            return null;
        }

        public final k b(JSONObject paymentDataJson) {
            com.stripe.android.model.a aVar;
            AbstractC3159y.i(paymentDataJson, "paymentDataJson");
            JSONObject jSONObject = paymentDataJson.getJSONObject("paymentMethodData");
            C1864I a8 = new C1912E().a(new JSONObject(jSONObject.getJSONObject("tokenizationData").getString("token")));
            JSONObject optJSONObject = jSONObject.getJSONObject("info").optJSONObject("billingAddress");
            if (optJSONObject != null) {
                aVar = new com.stripe.android.model.a(v2.e.l(optJSONObject, "locality"), v2.e.l(optJSONObject, "countryCode"), v2.e.l(optJSONObject, "address1"), v2.e.l(optJSONObject, "address2"), v2.e.l(optJSONObject, HintConstants.AUTOFILL_HINT_POSTAL_CODE), v2.e.l(optJSONObject, "administrativeArea"));
            } else {
                aVar = null;
            }
            return new k(a8, aVar, v2.e.l(optJSONObject, "name"), v2.e.l(paymentDataJson, NotificationCompat.CATEGORY_EMAIL), v2.e.l(optJSONObject, HintConstants.AUTOFILL_HINT_PHONE_NUMBER), a(paymentDataJson));
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new k((C1864I) parcel.readParcelable(k.class.getClassLoader()), parcel.readInt() == 0 ? null : com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? C1858C.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k[] newArray(int i8) {
            return new k[i8];
        }
    }

    public k(C1864I c1864i, com.stripe.android.model.a aVar, String str, String str2, String str3, C1858C c1858c) {
        this.f24292a = c1864i;
        this.f24293b = aVar;
        this.f24294c = str;
        this.f24295d = str2;
        this.f24296e = str3;
        this.f24297f = c1858c;
    }

    public final com.stripe.android.model.a b() {
        return this.f24293b;
    }

    public final String c() {
        return this.f24295d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f24294c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return AbstractC3159y.d(this.f24292a, kVar.f24292a) && AbstractC3159y.d(this.f24293b, kVar.f24293b) && AbstractC3159y.d(this.f24294c, kVar.f24294c) && AbstractC3159y.d(this.f24295d, kVar.f24295d) && AbstractC3159y.d(this.f24296e, kVar.f24296e) && AbstractC3159y.d(this.f24297f, kVar.f24297f);
    }

    public final String f() {
        return this.f24296e;
    }

    public int hashCode() {
        C1864I c1864i = this.f24292a;
        int hashCode = (c1864i == null ? 0 : c1864i.hashCode()) * 31;
        com.stripe.android.model.a aVar = this.f24293b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f24294c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24295d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f24296e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C1858C c1858c = this.f24297f;
        return hashCode5 + (c1858c != null ? c1858c.hashCode() : 0);
    }

    public final C1864I i() {
        return this.f24292a;
    }

    public String toString() {
        return "GooglePayResult(token=" + this.f24292a + ", address=" + this.f24293b + ", name=" + this.f24294c + ", email=" + this.f24295d + ", phoneNumber=" + this.f24296e + ", shippingInformation=" + this.f24297f + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeParcelable(this.f24292a, i8);
        com.stripe.android.model.a aVar = this.f24293b;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        out.writeString(this.f24294c);
        out.writeString(this.f24295d);
        out.writeString(this.f24296e);
        C1858C c1858c = this.f24297f;
        if (c1858c == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c1858c.writeToParcel(out, i8);
        }
    }
}
