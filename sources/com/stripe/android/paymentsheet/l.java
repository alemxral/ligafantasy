package com.stripe.android.paymentsheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.internal.AbstractC3159y;
import r3.C3686a;

/* loaded from: classes4.dex */
public interface l extends Parcelable {

    /* loaded from: classes4.dex */
    public static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        private final u.l f26025a;

        /* renamed from: b, reason: collision with root package name */
        private final C3686a f26026b;

        /* renamed from: c, reason: collision with root package name */
        private final com.stripe.android.model.p f26027c;

        /* renamed from: d, reason: collision with root package name */
        private final com.stripe.android.model.r f26028d;

        /* renamed from: e, reason: collision with root package name */
        private final u.b f26029e;

        /* renamed from: f, reason: collision with root package name */
        public static final int f26024f = com.stripe.android.model.r.f24643b | com.stripe.android.model.p.f24569v;
        public static final Parcelable.Creator<a> CREATOR = new C0613a();

        /* renamed from: com.stripe.android.paymentsheet.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0613a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a((u.l) parcel.readParcelable(a.class.getClassLoader()), parcel.readInt() == 0 ? null : C3686a.CREATOR.createFromParcel(parcel), (com.stripe.android.model.p) parcel.readParcelable(a.class.getClassLoader()), (com.stripe.android.model.r) parcel.readParcelable(a.class.getClassLoader()), u.b.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(u.l initializationMode, C3686a c3686a, com.stripe.android.model.p createParams, com.stripe.android.model.r rVar, u.b appearance) {
            AbstractC3159y.i(initializationMode, "initializationMode");
            AbstractC3159y.i(createParams, "createParams");
            AbstractC3159y.i(appearance, "appearance");
            this.f26025a = initializationMode;
            this.f26026b = c3686a;
            this.f26027c = createParams;
            this.f26028d = rVar;
            this.f26029e = appearance;
        }

        public final u.l B() {
            return this.f26025a;
        }

        public final u.b b() {
            return this.f26029e;
        }

        public final com.stripe.android.model.p c() {
            return this.f26027c;
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
            return AbstractC3159y.d(this.f26025a, aVar.f26025a) && AbstractC3159y.d(this.f26026b, aVar.f26026b) && AbstractC3159y.d(this.f26027c, aVar.f26027c) && AbstractC3159y.d(this.f26028d, aVar.f26028d) && AbstractC3159y.d(this.f26029e, aVar.f26029e);
        }

        public int hashCode() {
            int hashCode = this.f26025a.hashCode() * 31;
            C3686a c3686a = this.f26026b;
            int hashCode2 = (((hashCode + (c3686a == null ? 0 : c3686a.hashCode())) * 31) + this.f26027c.hashCode()) * 31;
            com.stripe.android.model.r rVar = this.f26028d;
            return ((hashCode2 + (rVar != null ? rVar.hashCode() : 0)) * 31) + this.f26029e.hashCode();
        }

        public final C3686a t() {
            return this.f26026b;
        }

        public String toString() {
            return "BacsPaymentMethod(initializationMode=" + this.f26025a + ", shippingDetails=" + this.f26026b + ", createParams=" + this.f26027c + ", optionsParams=" + this.f26028d + ", appearance=" + this.f26029e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f26025a, i8);
            C3686a c3686a = this.f26026b;
            if (c3686a == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                c3686a.writeToParcel(out, i8);
            }
            out.writeParcelable(this.f26027c, i8);
            out.writeParcelable(this.f26028d, i8);
            this.f26029e.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements l {

        /* renamed from: a, reason: collision with root package name */
        private final String f26031a;

        /* renamed from: b, reason: collision with root package name */
        private final o.e f26032b;

        /* renamed from: c, reason: collision with root package name */
        public static final int f26030c = o.e.f24434f;
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new b(parcel.readString(), (o.e) parcel.readParcelable(b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String type, o.e eVar) {
            AbstractC3159y.i(type, "type");
            this.f26031a = type;
            this.f26032b = eVar;
        }

        public final o.e b() {
            return this.f26032b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f26031a, bVar.f26031a) && AbstractC3159y.d(this.f26032b, bVar.f26032b);
        }

        public final String getType() {
            return this.f26031a;
        }

        public int hashCode() {
            int hashCode = this.f26031a.hashCode() * 31;
            o.e eVar = this.f26032b;
            return hashCode + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            return "ExternalPaymentMethod(type=" + this.f26031a + ", billingDetails=" + this.f26032b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26031a);
            out.writeParcelable(this.f26032b, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements l {
        public static final Parcelable.Creator<c> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        private final u.l f26033a;

        /* renamed from: b, reason: collision with root package name */
        private final C3686a f26034b;

        /* renamed from: c, reason: collision with root package name */
        private final a f26035c;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0614a();

            /* renamed from: a, reason: collision with root package name */
            private final u.k.c f26036a;

            /* renamed from: b, reason: collision with root package name */
            private final String f26037b;

            /* renamed from: c, reason: collision with root package name */
            private final String f26038c;

            /* renamed from: d, reason: collision with root package name */
            private final String f26039d;

            /* renamed from: e, reason: collision with root package name */
            private final Long f26040e;

            /* renamed from: f, reason: collision with root package name */
            private final String f26041f;

            /* renamed from: g, reason: collision with root package name */
            private final u.d f26042g;

            /* renamed from: com.stripe.android.paymentsheet.l$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0614a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new a(parcel.readInt() == 0 ? null : u.k.c.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), u.d.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a(u.k.c cVar, String merchantName, String merchantCountryCode, String str, Long l8, String str2, u.d billingDetailsCollectionConfiguration) {
                AbstractC3159y.i(merchantName, "merchantName");
                AbstractC3159y.i(merchantCountryCode, "merchantCountryCode");
                AbstractC3159y.i(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
                this.f26036a = cVar;
                this.f26037b = merchantName;
                this.f26038c = merchantCountryCode;
                this.f26039d = str;
                this.f26040e = l8;
                this.f26041f = str2;
                this.f26042g = billingDetailsCollectionConfiguration;
            }

            public final u.d b() {
                return this.f26042g;
            }

            public final Long c() {
                return this.f26040e;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String e() {
                return this.f26041f;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f26036a == aVar.f26036a && AbstractC3159y.d(this.f26037b, aVar.f26037b) && AbstractC3159y.d(this.f26038c, aVar.f26038c) && AbstractC3159y.d(this.f26039d, aVar.f26039d) && AbstractC3159y.d(this.f26040e, aVar.f26040e) && AbstractC3159y.d(this.f26041f, aVar.f26041f) && AbstractC3159y.d(this.f26042g, aVar.f26042g);
            }

            public final u.k.c f() {
                return this.f26036a;
            }

            public int hashCode() {
                u.k.c cVar = this.f26036a;
                int hashCode = (((((cVar == null ? 0 : cVar.hashCode()) * 31) + this.f26037b.hashCode()) * 31) + this.f26038c.hashCode()) * 31;
                String str = this.f26039d;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Long l8 = this.f26040e;
                int hashCode3 = (hashCode2 + (l8 == null ? 0 : l8.hashCode())) * 31;
                String str2 = this.f26041f;
                return ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f26042g.hashCode();
            }

            public final String i() {
                return this.f26038c;
            }

            public final String j() {
                return this.f26039d;
            }

            public final String k() {
                return this.f26037b;
            }

            public String toString() {
                return "Config(environment=" + this.f26036a + ", merchantName=" + this.f26037b + ", merchantCountryCode=" + this.f26038c + ", merchantCurrencyCode=" + this.f26039d + ", customAmount=" + this.f26040e + ", customLabel=" + this.f26041f + ", billingDetailsCollectionConfiguration=" + this.f26042g + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                u.k.c cVar = this.f26036a;
                if (cVar == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeString(cVar.name());
                }
                out.writeString(this.f26037b);
                out.writeString(this.f26038c);
                out.writeString(this.f26039d);
                Long l8 = this.f26040e;
                if (l8 == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeLong(l8.longValue());
                }
                out.writeString(this.f26041f);
                this.f26042g.writeToParcel(out, i8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c((u.l) parcel.readParcelable(c.class.getClassLoader()), parcel.readInt() == 0 ? null : C3686a.CREATOR.createFromParcel(parcel), a.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(u.l initializationMode, C3686a c3686a, a config) {
            AbstractC3159y.i(initializationMode, "initializationMode");
            AbstractC3159y.i(config, "config");
            this.f26033a = initializationMode;
            this.f26034b = c3686a;
            this.f26035c = config;
        }

        public final u.l B() {
            return this.f26033a;
        }

        public final a b() {
            return this.f26035c;
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
            return AbstractC3159y.d(this.f26033a, cVar.f26033a) && AbstractC3159y.d(this.f26034b, cVar.f26034b) && AbstractC3159y.d(this.f26035c, cVar.f26035c);
        }

        public int hashCode() {
            int hashCode = this.f26033a.hashCode() * 31;
            C3686a c3686a = this.f26034b;
            return ((hashCode + (c3686a == null ? 0 : c3686a.hashCode())) * 31) + this.f26035c.hashCode();
        }

        public final C3686a t() {
            return this.f26034b;
        }

        public String toString() {
            return "GooglePay(initializationMode=" + this.f26033a + ", shippingDetails=" + this.f26034b + ", config=" + this.f26035c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f26033a, i8);
            C3686a c3686a = this.f26034b;
            if (c3686a == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                c3686a.writeToParcel(out, i8);
            }
            this.f26035c.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public interface d extends l {

        /* loaded from: classes4.dex */
        public static final class a implements d {

            /* renamed from: a, reason: collision with root package name */
            private final u.l f26044a;

            /* renamed from: b, reason: collision with root package name */
            private final C3686a f26045b;

            /* renamed from: c, reason: collision with root package name */
            private final com.stripe.android.model.p f26046c;

            /* renamed from: d, reason: collision with root package name */
            private final com.stripe.android.model.r f26047d;

            /* renamed from: e, reason: collision with root package name */
            private final boolean f26048e;

            /* renamed from: f, reason: collision with root package name */
            public static final int f26043f = com.stripe.android.model.r.f24643b | com.stripe.android.model.p.f24569v;
            public static final Parcelable.Creator<a> CREATOR = new C0615a();

            /* renamed from: com.stripe.android.paymentsheet.l$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0615a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new a((u.l) parcel.readParcelable(a.class.getClassLoader()), parcel.readInt() == 0 ? null : C3686a.CREATOR.createFromParcel(parcel), (com.stripe.android.model.p) parcel.readParcelable(a.class.getClassLoader()), (com.stripe.android.model.r) parcel.readParcelable(a.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a(u.l initializationMode, C3686a c3686a, com.stripe.android.model.p createParams, com.stripe.android.model.r rVar, boolean z8) {
                AbstractC3159y.i(initializationMode, "initializationMode");
                AbstractC3159y.i(createParams, "createParams");
                this.f26044a = initializationMode;
                this.f26045b = c3686a;
                this.f26046c = createParams;
                this.f26047d = rVar;
                this.f26048e = z8;
            }

            @Override // com.stripe.android.paymentsheet.l.d
            public u.l B() {
                return this.f26044a;
            }

            public final com.stripe.android.model.p b() {
                return this.f26046c;
            }

            public final com.stripe.android.model.r c() {
                return this.f26047d;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final boolean e() {
                return this.f26048e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return AbstractC3159y.d(this.f26044a, aVar.f26044a) && AbstractC3159y.d(this.f26045b, aVar.f26045b) && AbstractC3159y.d(this.f26046c, aVar.f26046c) && AbstractC3159y.d(this.f26047d, aVar.f26047d) && this.f26048e == aVar.f26048e;
            }

            public int hashCode() {
                int hashCode = this.f26044a.hashCode() * 31;
                C3686a c3686a = this.f26045b;
                int hashCode2 = (((hashCode + (c3686a == null ? 0 : c3686a.hashCode())) * 31) + this.f26046c.hashCode()) * 31;
                com.stripe.android.model.r rVar = this.f26047d;
                return ((hashCode2 + (rVar != null ? rVar.hashCode() : 0)) * 31) + androidx.compose.foundation.a.a(this.f26048e);
            }

            @Override // com.stripe.android.paymentsheet.l.d
            public C3686a t() {
                return this.f26045b;
            }

            public String toString() {
                return "New(initializationMode=" + this.f26044a + ", shippingDetails=" + this.f26045b + ", createParams=" + this.f26046c + ", optionsParams=" + this.f26047d + ", shouldSave=" + this.f26048e + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeParcelable(this.f26044a, i8);
                C3686a c3686a = this.f26045b;
                if (c3686a == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    c3686a.writeToParcel(out, i8);
                }
                out.writeParcelable(this.f26046c, i8);
                out.writeParcelable(this.f26047d, i8);
                out.writeInt(this.f26048e ? 1 : 0);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements d {

            /* renamed from: a, reason: collision with root package name */
            private final u.l f26050a;

            /* renamed from: b, reason: collision with root package name */
            private final C3686a f26051b;

            /* renamed from: c, reason: collision with root package name */
            private final com.stripe.android.model.o f26052c;

            /* renamed from: d, reason: collision with root package name */
            private final com.stripe.android.model.r f26053d;

            /* renamed from: e, reason: collision with root package name */
            public static final int f26049e = com.stripe.android.model.r.f24643b | com.stripe.android.model.o.f24394u;
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new b((u.l) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt() == 0 ? null : C3686a.CREATOR.createFromParcel(parcel), (com.stripe.android.model.o) parcel.readParcelable(b.class.getClassLoader()), (com.stripe.android.model.r) parcel.readParcelable(b.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            public b(u.l initializationMode, C3686a c3686a, com.stripe.android.model.o paymentMethod, com.stripe.android.model.r rVar) {
                AbstractC3159y.i(initializationMode, "initializationMode");
                AbstractC3159y.i(paymentMethod, "paymentMethod");
                this.f26050a = initializationMode;
                this.f26051b = c3686a;
                this.f26052c = paymentMethod;
                this.f26053d = rVar;
            }

            @Override // com.stripe.android.paymentsheet.l.d
            public u.l B() {
                return this.f26050a;
            }

            public final com.stripe.android.model.r b() {
                return this.f26053d;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return AbstractC3159y.d(this.f26050a, bVar.f26050a) && AbstractC3159y.d(this.f26051b, bVar.f26051b) && AbstractC3159y.d(this.f26052c, bVar.f26052c) && AbstractC3159y.d(this.f26053d, bVar.f26053d);
            }

            public int hashCode() {
                int hashCode = this.f26050a.hashCode() * 31;
                C3686a c3686a = this.f26051b;
                int hashCode2 = (((hashCode + (c3686a == null ? 0 : c3686a.hashCode())) * 31) + this.f26052c.hashCode()) * 31;
                com.stripe.android.model.r rVar = this.f26053d;
                return hashCode2 + (rVar != null ? rVar.hashCode() : 0);
            }

            @Override // com.stripe.android.paymentsheet.l.d
            public C3686a t() {
                return this.f26051b;
            }

            public String toString() {
                return "Saved(initializationMode=" + this.f26050a + ", shippingDetails=" + this.f26051b + ", paymentMethod=" + this.f26052c + ", optionsParams=" + this.f26053d + ")";
            }

            public final com.stripe.android.model.o v() {
                return this.f26052c;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeParcelable(this.f26050a, i8);
                C3686a c3686a = this.f26051b;
                if (c3686a == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    c3686a.writeToParcel(out, i8);
                }
                out.writeParcelable(this.f26052c, i8);
                out.writeParcelable(this.f26053d, i8);
            }
        }

        u.l B();

        C3686a t();
    }
}
