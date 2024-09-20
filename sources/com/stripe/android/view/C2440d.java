package com.stripe.android.view;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: com.stripe.android.view.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2440d implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC2472u f27644a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f27645b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f27646c;

    /* renamed from: d, reason: collision with root package name */
    private final o.p f27647d;

    /* renamed from: e, reason: collision with root package name */
    private final j2.r f27648e;

    /* renamed from: f, reason: collision with root package name */
    private final int f27649f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f27650g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f27643h = new b(null);
    public static final Parcelable.Creator<C2440d> CREATOR = new c();

    /* renamed from: com.stripe.android.view.d$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        private boolean f27652b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f27653c;

        /* renamed from: e, reason: collision with root package name */
        private j2.r f27655e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f27656f;

        /* renamed from: g, reason: collision with root package name */
        private int f27657g;

        /* renamed from: a, reason: collision with root package name */
        private EnumC2472u f27651a = EnumC2472u.f27956b;

        /* renamed from: d, reason: collision with root package name */
        private o.p f27654d = o.p.f24519i;

        public final C2440d a() {
            EnumC2472u enumC2472u = this.f27651a;
            boolean z8 = this.f27652b;
            boolean z9 = this.f27653c;
            o.p pVar = this.f27654d;
            if (pVar == null) {
                pVar = o.p.f24519i;
            }
            return new C2440d(enumC2472u, z8, z9, pVar, this.f27655e, this.f27657g, this.f27656f);
        }

        public final a b(int i8) {
            this.f27657g = i8;
            return this;
        }

        public final a c(EnumC2472u billingAddressFields) {
            AbstractC3159y.i(billingAddressFields, "billingAddressFields");
            this.f27651a = billingAddressFields;
            return this;
        }

        public final /* synthetic */ a d(boolean z8) {
            this.f27653c = z8;
            return this;
        }

        public final /* synthetic */ a e(j2.r rVar) {
            this.f27655e = rVar;
            return this;
        }

        public final a f(o.p paymentMethodType) {
            AbstractC3159y.i(paymentMethodType, "paymentMethodType");
            this.f27654d = paymentMethodType;
            return this;
        }

        public final a g(boolean z8) {
            this.f27652b = z8;
            return this;
        }

        public final a h(Integer num) {
            this.f27656f = num;
            return this;
        }
    }

    /* renamed from: com.stripe.android.view.d$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final /* synthetic */ C2440d a(Intent intent) {
            AbstractC3159y.i(intent, "intent");
            Parcelable parcelableExtra = intent.getParcelableExtra("extra_activity_args");
            if (parcelableExtra != null) {
                return (C2440d) parcelableExtra;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.view.d$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2440d createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C2440d(EnumC2472u.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, o.p.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : j2.r.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2440d[] newArray(int i8) {
            return new C2440d[i8];
        }
    }

    public C2440d(EnumC2472u billingAddressFields, boolean z8, boolean z9, o.p paymentMethodType, j2.r rVar, int i8, Integer num) {
        AbstractC3159y.i(billingAddressFields, "billingAddressFields");
        AbstractC3159y.i(paymentMethodType, "paymentMethodType");
        this.f27644a = billingAddressFields;
        this.f27645b = z8;
        this.f27646c = z9;
        this.f27647d = paymentMethodType;
        this.f27648e = rVar;
        this.f27649f = i8;
        this.f27650g = num;
    }

    public final int b() {
        return this.f27649f;
    }

    public final EnumC2472u c() {
        return this.f27644a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final j2.r e() {
        return this.f27648e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2440d)) {
            return false;
        }
        C2440d c2440d = (C2440d) obj;
        return this.f27644a == c2440d.f27644a && this.f27645b == c2440d.f27645b && this.f27646c == c2440d.f27646c && this.f27647d == c2440d.f27647d && AbstractC3159y.d(this.f27648e, c2440d.f27648e) && this.f27649f == c2440d.f27649f && AbstractC3159y.d(this.f27650g, c2440d.f27650g);
    }

    public final o.p f() {
        return this.f27647d;
    }

    public int hashCode() {
        int hashCode = ((((((this.f27644a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f27645b)) * 31) + androidx.compose.foundation.a.a(this.f27646c)) * 31) + this.f27647d.hashCode()) * 31;
        j2.r rVar = this.f27648e;
        int hashCode2 = (((hashCode + (rVar == null ? 0 : rVar.hashCode())) * 31) + this.f27649f) * 31;
        Integer num = this.f27650g;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final boolean i() {
        return this.f27645b;
    }

    public final Integer j() {
        return this.f27650g;
    }

    public final boolean k() {
        return this.f27646c;
    }

    public String toString() {
        return "Args(billingAddressFields=" + this.f27644a + ", shouldAttachToCustomer=" + this.f27645b + ", isPaymentSessionActive=" + this.f27646c + ", paymentMethodType=" + this.f27647d + ", paymentConfiguration=" + this.f27648e + ", addPaymentMethodFooterLayoutId=" + this.f27649f + ", windowFlags=" + this.f27650g + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f27644a.name());
        out.writeInt(this.f27645b ? 1 : 0);
        out.writeInt(this.f27646c ? 1 : 0);
        this.f27647d.writeToParcel(out, i8);
        j2.r rVar = this.f27648e;
        if (rVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            rVar.writeToParcel(out, i8);
        }
        out.writeInt(this.f27649f);
        Integer num = this.f27650g;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
    }
}
