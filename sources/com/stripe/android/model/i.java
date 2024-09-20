package com.stripe.android.model;

import M5.AbstractC1246t;
import M5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class i implements v2.f {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final b f24247a;

    /* renamed from: b, reason: collision with root package name */
    private final List f24248b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24249c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24250d;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new i((b) parcel.readParcelable(i.class.getClassLoader()), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i[] newArray(int i8) {
            return new i[i8];
        }
    }

    /* loaded from: classes4.dex */
    public interface b extends Parcelable {

        /* loaded from: classes4.dex */
        public static final class a implements b {
            public static final Parcelable.Creator<a> CREATOR = new C0501a();

            /* renamed from: a, reason: collision with root package name */
            private final long f24251a;

            /* renamed from: b, reason: collision with root package name */
            private final String f24252b;

            /* renamed from: c, reason: collision with root package name */
            private final StripeIntent.Usage f24253c;

            /* renamed from: d, reason: collision with root package name */
            private final n.b f24254d;

            /* renamed from: com.stripe.android.model.i$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0501a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new a(parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString()), n.b.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a(long j8, String currency, StripeIntent.Usage usage, n.b captureMethod) {
                AbstractC3159y.i(currency, "currency");
                AbstractC3159y.i(captureMethod, "captureMethod");
                this.f24251a = j8;
                this.f24252b = currency;
                this.f24253c = usage;
                this.f24254d = captureMethod;
            }

            @Override // com.stripe.android.model.i.b
            public StripeIntent.Usage E() {
                return this.f24253c;
            }

            @Override // com.stripe.android.model.i.b
            public String K() {
                return this.f24252b;
            }

            public final long b() {
                return this.f24251a;
            }

            public final n.b c() {
                return this.f24254d;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f24251a == aVar.f24251a && AbstractC3159y.d(this.f24252b, aVar.f24252b) && this.f24253c == aVar.f24253c && this.f24254d == aVar.f24254d;
            }

            public int hashCode() {
                int a8 = ((androidx.collection.a.a(this.f24251a) * 31) + this.f24252b.hashCode()) * 31;
                StripeIntent.Usage usage = this.f24253c;
                return ((a8 + (usage == null ? 0 : usage.hashCode())) * 31) + this.f24254d.hashCode();
            }

            @Override // com.stripe.android.model.i.b
            public String r() {
                return "payment";
            }

            public String toString() {
                return "Payment(amount=" + this.f24251a + ", currency=" + this.f24252b + ", setupFutureUsage=" + this.f24253c + ", captureMethod=" + this.f24254d + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeLong(this.f24251a);
                out.writeString(this.f24252b);
                StripeIntent.Usage usage = this.f24253c;
                if (usage == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeString(usage.name());
                }
                out.writeString(this.f24254d.name());
            }
        }

        /* renamed from: com.stripe.android.model.i$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0502b implements b {
            public static final Parcelable.Creator<C0502b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f24255a;

            /* renamed from: b, reason: collision with root package name */
            private final StripeIntent.Usage f24256b;

            /* renamed from: com.stripe.android.model.i$b$b$a */
            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0502b createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new C0502b(parcel.readString(), StripeIntent.Usage.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0502b[] newArray(int i8) {
                    return new C0502b[i8];
                }
            }

            public C0502b(String str, StripeIntent.Usage setupFutureUsage) {
                AbstractC3159y.i(setupFutureUsage, "setupFutureUsage");
                this.f24255a = str;
                this.f24256b = setupFutureUsage;
            }

            @Override // com.stripe.android.model.i.b
            public StripeIntent.Usage E() {
                return this.f24256b;
            }

            @Override // com.stripe.android.model.i.b
            public String K() {
                return this.f24255a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0502b)) {
                    return false;
                }
                C0502b c0502b = (C0502b) obj;
                return AbstractC3159y.d(this.f24255a, c0502b.f24255a) && this.f24256b == c0502b.f24256b;
            }

            public int hashCode() {
                String str = this.f24255a;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.f24256b.hashCode();
            }

            @Override // com.stripe.android.model.i.b
            public String r() {
                return "setup";
            }

            public String toString() {
                return "Setup(currency=" + this.f24255a + ", setupFutureUsage=" + this.f24256b + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f24255a);
                out.writeString(this.f24256b.name());
            }
        }

        StripeIntent.Usage E();

        String K();

        String r();
    }

    public i(b mode, List paymentMethodTypes, String str, String str2) {
        AbstractC3159y.i(mode, "mode");
        AbstractC3159y.i(paymentMethodTypes, "paymentMethodTypes");
        this.f24247a = mode;
        this.f24248b = paymentMethodTypes;
        this.f24249c = str;
        this.f24250d = str2;
    }

    public final b b() {
        return this.f24247a;
    }

    public final Map c() {
        b.a aVar;
        Long l8;
        String str;
        b.a aVar2;
        n.b c8;
        int i8 = 0;
        L5.r a8 = L5.x.a("deferred_intent[mode]", this.f24247a.r());
        b bVar = this.f24247a;
        String str2 = null;
        if (bVar instanceof b.a) {
            aVar = (b.a) bVar;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            l8 = Long.valueOf(aVar.b());
        } else {
            l8 = null;
        }
        L5.r a9 = L5.x.a("deferred_intent[amount]", l8);
        L5.r a10 = L5.x.a("deferred_intent[currency]", this.f24247a.K());
        StripeIntent.Usage E8 = this.f24247a.E();
        if (E8 != null) {
            str = E8.b();
        } else {
            str = null;
        }
        L5.r a11 = L5.x.a("deferred_intent[setup_future_usage]", str);
        b bVar2 = this.f24247a;
        if (bVar2 instanceof b.a) {
            aVar2 = (b.a) bVar2;
        } else {
            aVar2 = null;
        }
        if (aVar2 != null && (c8 = aVar2.c()) != null) {
            str2 = c8.b();
        }
        Map k8 = Q.k(a8, a9, a10, a11, L5.x.a("deferred_intent[capture_method]", str2), L5.x.a("deferred_intent[payment_method_configuration][id]", this.f24249c), L5.x.a("deferred_intent[on_behalf_of]", this.f24250d));
        List list = this.f24248b;
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
        for (Object obj : list) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC1246t.w();
            }
            arrayList.add(L5.x.a("deferred_intent[payment_method_types][" + i8 + "]", (String) obj));
            i8 = i9;
        }
        return Q.p(k8, arrayList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return AbstractC3159y.d(this.f24247a, iVar.f24247a) && AbstractC3159y.d(this.f24248b, iVar.f24248b) && AbstractC3159y.d(this.f24249c, iVar.f24249c) && AbstractC3159y.d(this.f24250d, iVar.f24250d);
    }

    public int hashCode() {
        int hashCode = ((this.f24247a.hashCode() * 31) + this.f24248b.hashCode()) * 31;
        String str = this.f24249c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24250d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DeferredIntentParams(mode=" + this.f24247a + ", paymentMethodTypes=" + this.f24248b + ", paymentMethodConfigurationId=" + this.f24249c + ", onBehalfOf=" + this.f24250d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeParcelable(this.f24247a, i8);
        out.writeStringList(this.f24248b);
        out.writeString(this.f24249c);
        out.writeString(this.f24250d);
    }
}
