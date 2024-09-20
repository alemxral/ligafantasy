package com.stripe.android.view;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class v0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f27966a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27967b;

    /* renamed from: c, reason: collision with root package name */
    private final int f27968c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f27969d;

    /* renamed from: e, reason: collision with root package name */
    private final List f27970e;

    /* renamed from: f, reason: collision with root package name */
    private final j2.r f27971f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f27972g;

    /* renamed from: h, reason: collision with root package name */
    private final EnumC2472u f27973h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f27974i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f27975j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f27976k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f27964l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    public static final int f27965m = 8;
    public static final Parcelable.Creator<v0> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ v0 a(Intent intent) {
            AbstractC3159y.i(intent, "intent");
            Parcelable parcelableExtra = intent.getParcelableExtra("extra_activity_args");
            if (parcelableExtra != null) {
                return (v0) parcelableExtra;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v0 createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            boolean z8 = parcel.readInt() != 0;
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            for (int i8 = 0; i8 != readInt3; i8++) {
                arrayList.add(o.p.CREATOR.createFromParcel(parcel));
            }
            return new v0(readString, readInt, readInt2, z8, arrayList, parcel.readInt() == 0 ? null : j2.r.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, EnumC2472u.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0[] newArray(int i8) {
            return new v0[i8];
        }
    }

    public v0(String str, int i8, int i9, boolean z8, List paymentMethodTypes, j2.r rVar, Integer num, EnumC2472u billingAddressFields, boolean z9, boolean z10, boolean z11) {
        AbstractC3159y.i(paymentMethodTypes, "paymentMethodTypes");
        AbstractC3159y.i(billingAddressFields, "billingAddressFields");
        this.f27966a = str;
        this.f27967b = i8;
        this.f27968c = i9;
        this.f27969d = z8;
        this.f27970e = paymentMethodTypes;
        this.f27971f = rVar;
        this.f27972g = num;
        this.f27973h = billingAddressFields;
        this.f27974i = z9;
        this.f27975j = z10;
        this.f27976k = z11;
    }

    public final int b() {
        return this.f27968c;
    }

    public final EnumC2472u c() {
        return this.f27973h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f27976k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return AbstractC3159y.d(this.f27966a, v0Var.f27966a) && this.f27967b == v0Var.f27967b && this.f27968c == v0Var.f27968c && this.f27969d == v0Var.f27969d && AbstractC3159y.d(this.f27970e, v0Var.f27970e) && AbstractC3159y.d(this.f27971f, v0Var.f27971f) && AbstractC3159y.d(this.f27972g, v0Var.f27972g) && this.f27973h == v0Var.f27973h && this.f27974i == v0Var.f27974i && this.f27975j == v0Var.f27975j && this.f27976k == v0Var.f27976k;
    }

    public final String f() {
        return this.f27966a;
    }

    public int hashCode() {
        String str = this.f27966a;
        int hashCode = (((((((((str == null ? 0 : str.hashCode()) * 31) + this.f27967b) * 31) + this.f27968c) * 31) + androidx.compose.foundation.a.a(this.f27969d)) * 31) + this.f27970e.hashCode()) * 31;
        j2.r rVar = this.f27971f;
        int hashCode2 = (hashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        Integer num = this.f27972g;
        return ((((((((hashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.f27973h.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f27974i)) * 31) + androidx.compose.foundation.a.a(this.f27975j)) * 31) + androidx.compose.foundation.a.a(this.f27976k);
    }

    public final j2.r i() {
        return this.f27971f;
    }

    public final List j() {
        return this.f27970e;
    }

    public final int k() {
        return this.f27967b;
    }

    public final boolean n() {
        return this.f27974i;
    }

    public final boolean o() {
        return this.f27975j;
    }

    public final Integer s() {
        return this.f27972g;
    }

    public String toString() {
        return "Args(initialPaymentMethodId=" + this.f27966a + ", paymentMethodsFooterLayoutId=" + this.f27967b + ", addPaymentMethodFooterLayoutId=" + this.f27968c + ", isPaymentSessionActive=" + this.f27969d + ", paymentMethodTypes=" + this.f27970e + ", paymentConfiguration=" + this.f27971f + ", windowFlags=" + this.f27972g + ", billingAddressFields=" + this.f27973h + ", shouldShowGooglePay=" + this.f27974i + ", useGooglePay=" + this.f27975j + ", canDeletePaymentMethods=" + this.f27976k + ")";
    }

    public final boolean u() {
        return this.f27969d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f27966a);
        out.writeInt(this.f27967b);
        out.writeInt(this.f27968c);
        out.writeInt(this.f27969d ? 1 : 0);
        List list = this.f27970e;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((o.p) it.next()).writeToParcel(out, i8);
        }
        j2.r rVar = this.f27971f;
        if (rVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            rVar.writeToParcel(out, i8);
        }
        Integer num = this.f27972g;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.f27973h.name());
        out.writeInt(this.f27974i ? 1 : 0);
        out.writeInt(this.f27975j ? 1 : 0);
        out.writeInt(this.f27976k ? 1 : 0);
    }
}
