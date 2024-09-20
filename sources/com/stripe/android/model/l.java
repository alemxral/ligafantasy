package com.stripe.android.model;

import M5.AbstractC1246t;
import M5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import b3.InterfaceC1863H;
import com.stripe.android.model.o;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class l implements InterfaceC1863H, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f24299a;

    /* renamed from: b, reason: collision with root package name */
    private final o.p f24300b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f24301c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24302d;

    /* renamed from: e, reason: collision with root package name */
    private final String f24303e;

    /* renamed from: f, reason: collision with root package name */
    private static final a f24298f = new a(null);
    public static final Parcelable.Creator<l> CREATOR = new b();

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new l(parcel.readString(), o.p.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l[] newArray(int i8) {
            return new l[i8];
        }
    }

    public l(String customerId, o.p paymentMethodType, Integer num, String str, String str2) {
        AbstractC3159y.i(customerId, "customerId");
        AbstractC3159y.i(paymentMethodType, "paymentMethodType");
        this.f24299a = customerId;
        this.f24300b = paymentMethodType;
        this.f24301c = num;
        this.f24302d = str;
        this.f24303e = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return AbstractC3159y.d(this.f24299a, lVar.f24299a) && this.f24300b == lVar.f24300b && AbstractC3159y.d(this.f24301c, lVar.f24301c) && AbstractC3159y.d(this.f24302d, lVar.f24302d) && AbstractC3159y.d(this.f24303e, lVar.f24303e);
    }

    public int hashCode() {
        int hashCode = ((this.f24299a.hashCode() * 31) + this.f24300b.hashCode()) * 31;
        Integer num = this.f24301c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f24302d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24303e;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ListPaymentMethodsParams(customerId=" + this.f24299a + ", paymentMethodType=" + this.f24300b + ", limit=" + this.f24301c + ", endingBefore=" + this.f24302d + ", startingAfter=" + this.f24303e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        int intValue;
        AbstractC3159y.i(out, "out");
        out.writeString(this.f24299a);
        this.f24300b.writeToParcel(out, i8);
        Integer num = this.f24301c;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.f24302d);
        out.writeString(this.f24303e);
    }

    @Override // b3.InterfaceC1863H
    public Map y() {
        Map map;
        List<L5.r> p8 = AbstractC1246t.p(L5.x.a("customer", this.f24299a), L5.x.a("type", this.f24300b.f24537a), L5.x.a("limit", this.f24301c), L5.x.a("ending_before", this.f24302d), L5.x.a("starting_after", this.f24303e));
        Map h8 = Q.h();
        for (L5.r rVar : p8) {
            String str = (String) rVar.a();
            Object b8 = rVar.b();
            if (b8 != null) {
                map = Q.e(L5.x.a(str, b8));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            h8 = Q.q(h8, map);
        }
        return h8;
    }

    public /* synthetic */ l(String str, o.p pVar, Integer num, String str2, String str3, int i8, AbstractC3151p abstractC3151p) {
        this(str, pVar, (i8 & 4) != 0 ? null : num, (i8 & 8) != 0 ? null : str2, (i8 & 16) != 0 ? null : str3);
    }
}
