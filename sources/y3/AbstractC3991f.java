package y3;

import android.os.Parcel;
import android.os.Parcelable;
import b3.C1876k;
import b3.EnumC1870e;
import b4.n;
import com.stripe.android.model.b;
import com.stripe.android.model.o;
import com.stripe.android.model.p;
import com.stripe.android.model.q;
import com.stripe.android.model.r;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import q3.t;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;

/* renamed from: y3.f */
/* loaded from: classes4.dex */
public abstract class AbstractC3991f implements Parcelable {

    /* renamed from: y3.f$a */
    /* loaded from: classes4.dex */
    public static final class a extends Enum {

        /* renamed from: b */
        public static final a f39745b = new a("RequestReuse", 0, b.c.f24217c);

        /* renamed from: c */
        public static final a f39746c = new a("RequestNoReuse", 1, b.c.f24218d);

        /* renamed from: d */
        public static final a f39747d = new a("NoRequest", 2, null);

        /* renamed from: e */
        private static final /* synthetic */ a[] f39748e;

        /* renamed from: f */
        private static final /* synthetic */ R5.a f39749f;

        /* renamed from: a */
        private final b.c f39750a;

        static {
            a[] a8 = a();
            f39748e = a8;
            f39749f = R5.b.a(a8);
        }

        private a(String str, int i8, b.c cVar) {
            super(str, i8);
            this.f39750a = cVar;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f39745b, f39746c, f39747d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f39748e.clone();
        }

        public final b.c b() {
            return this.f39750a;
        }
    }

    /* renamed from: y3.f$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3991f {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a */
        private final String f39751a;

        /* renamed from: b */
        private final o.e f39752b;

        /* renamed from: c */
        private final InterfaceC3983b f39753c;

        /* renamed from: d */
        private final int f39754d;

        /* renamed from: e */
        private final String f39755e;

        /* renamed from: f */
        private final String f39756f;

        /* renamed from: y3.f$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new b(parcel.readString(), (o.e) parcel.readParcelable(b.class.getClassLoader()), (InterfaceC3983b) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String type, o.e eVar, InterfaceC3983b label, int i8, String str, String str2) {
            super(null);
            AbstractC3159y.i(type, "type");
            AbstractC3159y.i(label, "label");
            this.f39751a = type;
            this.f39752b = eVar;
            this.f39753c = label;
            this.f39754d = i8;
            this.f39755e = str;
            this.f39756f = str2;
        }

        @Override // y3.AbstractC3991f
        public boolean b() {
            return false;
        }

        @Override // y3.AbstractC3991f
        public InterfaceC3983b c(String merchantName, boolean z8) {
            AbstractC3159y.i(merchantName, "merchantName");
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final o.e e() {
            return this.f39752b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3159y.d(this.f39751a, bVar.f39751a) && AbstractC3159y.d(this.f39752b, bVar.f39752b) && AbstractC3159y.d(this.f39753c, bVar.f39753c) && this.f39754d == bVar.f39754d && AbstractC3159y.d(this.f39755e, bVar.f39755e) && AbstractC3159y.d(this.f39756f, bVar.f39756f)) {
                return true;
            }
            return false;
        }

        public final String getType() {
            return this.f39751a;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = this.f39751a.hashCode() * 31;
            o.e eVar = this.f39752b;
            int i8 = 0;
            if (eVar == null) {
                hashCode = 0;
            } else {
                hashCode = eVar.hashCode();
            }
            int hashCode4 = (((((hashCode3 + hashCode) * 31) + this.f39753c.hashCode()) * 31) + this.f39754d) * 31;
            String str = this.f39755e;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i9 = (hashCode4 + hashCode2) * 31;
            String str2 = this.f39756f;
            if (str2 != null) {
                i8 = str2.hashCode();
            }
            return i9 + i8;
        }

        public String toString() {
            return "ExternalPaymentMethod(type=" + this.f39751a + ", billingDetails=" + this.f39752b + ", label=" + this.f39753c + ", iconResource=" + this.f39754d + ", lightThemeIconUrl=" + this.f39755e + ", darkThemeIconUrl=" + this.f39756f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f39751a);
            out.writeParcelable(this.f39752b, i8);
            out.writeParcelable(this.f39753c, i8);
            out.writeInt(this.f39754d);
            out.writeString(this.f39755e);
            out.writeString(this.f39756f);
        }
    }

    /* renamed from: y3.f$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3991f {

        /* renamed from: a */
        public static final c f39757a = new c();
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: y3.f$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return c.f39757a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        private c() {
            super(null);
        }

        @Override // y3.AbstractC3991f
        public boolean b() {
            return false;
        }

        @Override // y3.AbstractC3991f
        public InterfaceC3983b c(String merchantName, boolean z8) {
            AbstractC3159y.i(merchantName, "merchantName");
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -61554386;
        }

        public String toString() {
            return "GooglePay";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* renamed from: y3.f$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3991f {

        /* renamed from: a */
        public static final d f39758a = new d();
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: y3.f$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return d.f39758a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        private d() {
            super(null);
        }

        @Override // y3.AbstractC3991f
        public boolean b() {
            return false;
        }

        @Override // y3.AbstractC3991f
        public InterfaceC3983b c(String merchantName, boolean z8) {
            AbstractC3159y.i(merchantName, "merchantName");
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -395165925;
        }

        public String toString() {
            return "Link";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* renamed from: y3.f$e */
    /* loaded from: classes4.dex */
    public static abstract class e extends AbstractC3991f {

        /* renamed from: y3.f$e$a */
        /* loaded from: classes4.dex */
        public static final class a extends e {

            /* renamed from: a */
            private final p f39760a;

            /* renamed from: b */
            private final EnumC1870e f39761b;

            /* renamed from: c */
            private final a f39762c;

            /* renamed from: d */
            private final r f39763d;

            /* renamed from: e */
            private final q f39764e;

            /* renamed from: f */
            private final String f39765f;

            /* renamed from: g */
            public static final int f39759g = (q.f24638b | r.f24643b) | p.f24569v;
            public static final Parcelable.Creator<a> CREATOR = new C0915a();

            /* renamed from: y3.f$e$a$a */
            /* loaded from: classes4.dex */
            public static final class C0915a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new a((p) parcel.readParcelable(a.class.getClassLoader()), EnumC1870e.valueOf(parcel.readString()), a.valueOf(parcel.readString()), (r) parcel.readParcelable(a.class.getClassLoader()), (q) parcel.readParcelable(a.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public /* synthetic */ a(p pVar, EnumC1870e enumC1870e, a aVar, r rVar, q qVar, int i8, AbstractC3151p abstractC3151p) {
                this(pVar, enumC1870e, aVar, (i8 & 8) != 0 ? null : rVar, (i8 & 16) != 0 ? null : qVar);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // y3.AbstractC3991f.e
            public a e() {
                return this.f39762c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                if (AbstractC3159y.d(this.f39760a, aVar.f39760a) && this.f39761b == aVar.f39761b && this.f39762c == aVar.f39762c && AbstractC3159y.d(this.f39763d, aVar.f39763d) && AbstractC3159y.d(this.f39764e, aVar.f39764e)) {
                    return true;
                }
                return false;
            }

            @Override // y3.AbstractC3991f.e
            public p f() {
                return this.f39760a;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = ((((this.f39760a.hashCode() * 31) + this.f39761b.hashCode()) * 31) + this.f39762c.hashCode()) * 31;
                r rVar = this.f39763d;
                int i8 = 0;
                if (rVar == null) {
                    hashCode = 0;
                } else {
                    hashCode = rVar.hashCode();
                }
                int i9 = (hashCode2 + hashCode) * 31;
                q qVar = this.f39764e;
                if (qVar != null) {
                    i8 = qVar.hashCode();
                }
                return i9 + i8;
            }

            @Override // y3.AbstractC3991f.e
            public q i() {
                return this.f39764e;
            }

            @Override // y3.AbstractC3991f.e
            public r j() {
                return this.f39763d;
            }

            public String toString() {
                return "Card(paymentMethodCreateParams=" + this.f39760a + ", brand=" + this.f39761b + ", customerRequestedSave=" + this.f39762c + ", paymentMethodOptionsParams=" + this.f39763d + ", paymentMethodExtraParams=" + this.f39764e + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeParcelable(this.f39760a, i8);
                out.writeString(this.f39761b.name());
                out.writeString(this.f39762c.name());
                out.writeParcelable(this.f39763d, i8);
                out.writeParcelable(this.f39764e, i8);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p paymentMethodCreateParams, EnumC1870e brand, a customerRequestedSave, r rVar, q qVar) {
                super(null);
                AbstractC3159y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
                AbstractC3159y.i(brand, "brand");
                AbstractC3159y.i(customerRequestedSave, "customerRequestedSave");
                this.f39760a = paymentMethodCreateParams;
                this.f39761b = brand;
                this.f39762c = customerRequestedSave;
                this.f39763d = rVar;
                this.f39764e = qVar;
                String c8 = f().c();
                this.f39765f = c8 == null ? "" : c8;
            }
        }

        /* renamed from: y3.f$e$b */
        /* loaded from: classes4.dex */
        public static final class b extends e {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a */
            private final InterfaceC3983b f39766a;

            /* renamed from: b */
            private final int f39767b;

            /* renamed from: c */
            private final String f39768c;

            /* renamed from: d */
            private final String f39769d;

            /* renamed from: e */
            private final p f39770e;

            /* renamed from: f */
            private final a f39771f;

            /* renamed from: g */
            private final r f39772g;

            /* renamed from: h */
            private final q f39773h;

            /* renamed from: y3.f$e$b$a */
            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new b((InterfaceC3983b) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString(), (p) parcel.readParcelable(b.class.getClassLoader()), a.valueOf(parcel.readString()), (r) parcel.readParcelable(b.class.getClassLoader()), (q) parcel.readParcelable(b.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC3983b label, int i8, String str, String str2, p paymentMethodCreateParams, a customerRequestedSave, r rVar, q qVar) {
                super(null);
                AbstractC3159y.i(label, "label");
                AbstractC3159y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
                AbstractC3159y.i(customerRequestedSave, "customerRequestedSave");
                this.f39766a = label;
                this.f39767b = i8;
                this.f39768c = str;
                this.f39769d = str2;
                this.f39770e = paymentMethodCreateParams;
                this.f39771f = customerRequestedSave;
                this.f39772g = rVar;
                this.f39773h = qVar;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // y3.AbstractC3991f.e
            public a e() {
                return this.f39771f;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                if (AbstractC3159y.d(this.f39766a, bVar.f39766a) && this.f39767b == bVar.f39767b && AbstractC3159y.d(this.f39768c, bVar.f39768c) && AbstractC3159y.d(this.f39769d, bVar.f39769d) && AbstractC3159y.d(this.f39770e, bVar.f39770e) && this.f39771f == bVar.f39771f && AbstractC3159y.d(this.f39772g, bVar.f39772g) && AbstractC3159y.d(this.f39773h, bVar.f39773h)) {
                    return true;
                }
                return false;
            }

            @Override // y3.AbstractC3991f.e
            public p f() {
                return this.f39770e;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3;
                int hashCode4 = ((this.f39766a.hashCode() * 31) + this.f39767b) * 31;
                String str = this.f39768c;
                int i8 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i9 = (hashCode4 + hashCode) * 31;
                String str2 = this.f39769d;
                if (str2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str2.hashCode();
                }
                int hashCode5 = (((((i9 + hashCode2) * 31) + this.f39770e.hashCode()) * 31) + this.f39771f.hashCode()) * 31;
                r rVar = this.f39772g;
                if (rVar == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = rVar.hashCode();
                }
                int i10 = (hashCode5 + hashCode3) * 31;
                q qVar = this.f39773h;
                if (qVar != null) {
                    i8 = qVar.hashCode();
                }
                return i10 + i8;
            }

            @Override // y3.AbstractC3991f.e
            public q i() {
                return this.f39773h;
            }

            @Override // y3.AbstractC3991f.e
            public r j() {
                return this.f39772g;
            }

            public String toString() {
                return "GenericPaymentMethod(label=" + this.f39766a + ", iconResource=" + this.f39767b + ", lightThemeIconUrl=" + this.f39768c + ", darkThemeIconUrl=" + this.f39769d + ", paymentMethodCreateParams=" + this.f39770e + ", customerRequestedSave=" + this.f39771f + ", paymentMethodOptionsParams=" + this.f39772g + ", paymentMethodExtraParams=" + this.f39773h + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeParcelable(this.f39766a, i8);
                out.writeInt(this.f39767b);
                out.writeString(this.f39768c);
                out.writeString(this.f39769d);
                out.writeParcelable(this.f39770e, i8);
                out.writeString(this.f39771f.name());
                out.writeParcelable(this.f39772g, i8);
                out.writeParcelable(this.f39773h, i8);
            }
        }

        /* renamed from: y3.f$e$c */
        /* loaded from: classes4.dex */
        public static final class c extends e {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: a */
            private final K2.f f39774a;

            /* renamed from: b */
            private final a f39775b;

            /* renamed from: c */
            private final C1876k.e f39776c;

            /* renamed from: d */
            private final p f39777d;

            /* renamed from: e */
            private final r.b f39778e;

            /* renamed from: f */
            private final Void f39779f;

            /* renamed from: g */
            private final int f39780g;

            /* renamed from: h */
            private final String f39781h;

            /* renamed from: y3.f$e$c$a */
            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new c((K2.f) parcel.readParcelable(c.class.getClassLoader()), a.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(K2.f linkPaymentDetails, a customerRequestedSave) {
                super(null);
                AbstractC3159y.i(linkPaymentDetails, "linkPaymentDetails");
                AbstractC3159y.i(customerRequestedSave, "customerRequestedSave");
                this.f39774a = linkPaymentDetails;
                this.f39775b = customerRequestedSave;
                C1876k.e b8 = linkPaymentDetails.b();
                this.f39776c = b8;
                this.f39777d = linkPaymentDetails.c();
                this.f39778e = new r.b(null, null, e().b(), 3, null);
                this.f39780g = t.f37395u;
                this.f39781h = "····" + b8.b();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // y3.AbstractC3991f.e
            public a e() {
                return this.f39775b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                if (AbstractC3159y.d(this.f39774a, cVar.f39774a) && this.f39775b == cVar.f39775b) {
                    return true;
                }
                return false;
            }

            @Override // y3.AbstractC3991f.e
            public p f() {
                return this.f39777d;
            }

            public int hashCode() {
                return (this.f39774a.hashCode() * 31) + this.f39775b.hashCode();
            }

            @Override // y3.AbstractC3991f.e
            public /* bridge */ /* synthetic */ q i() {
                return (q) k();
            }

            public Void k() {
                return this.f39779f;
            }

            @Override // y3.AbstractC3991f.e
            /* renamed from: n */
            public r.b j() {
                return this.f39778e;
            }

            public String toString() {
                return "LinkInline(linkPaymentDetails=" + this.f39774a + ", customerRequestedSave=" + this.f39775b + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeParcelable(this.f39774a, i8);
                out.writeString(this.f39775b.name());
            }
        }

        /* renamed from: y3.f$e$d */
        /* loaded from: classes4.dex */
        public static final class d extends e {
            public static final Parcelable.Creator<d> CREATOR = new a();

            /* renamed from: a */
            private final String f39782a;

            /* renamed from: b */
            private final int f39783b;

            /* renamed from: c */
            private final b f39784c;

            /* renamed from: d */
            private final B3.f f39785d;

            /* renamed from: e */
            private final c f39786e;

            /* renamed from: f */
            private final p f39787f;

            /* renamed from: g */
            private final a f39788g;

            /* renamed from: h */
            private final r f39789h;

            /* renamed from: i */
            private final q f39790i;

            /* renamed from: y3.f$e$d$a */
            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final d createFromParcel(Parcel parcel) {
                    c createFromParcel;
                    AbstractC3159y.i(parcel, "parcel");
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    b createFromParcel2 = b.CREATOR.createFromParcel(parcel);
                    B3.f fVar = (B3.f) parcel.readParcelable(d.class.getClassLoader());
                    if (parcel.readInt() == 0) {
                        createFromParcel = null;
                    } else {
                        createFromParcel = c.CREATOR.createFromParcel(parcel);
                    }
                    return new d(readString, readInt, createFromParcel2, fVar, createFromParcel, (p) parcel.readParcelable(d.class.getClassLoader()), a.valueOf(parcel.readString()), (r) parcel.readParcelable(d.class.getClassLoader()), (q) parcel.readParcelable(d.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final d[] newArray(int i8) {
                    return new d[i8];
                }
            }

            /* renamed from: y3.f$e$d$b */
            /* loaded from: classes4.dex */
            public static final class b implements Parcelable {

                /* renamed from: a */
                private final String f39792a;

                /* renamed from: b */
                private final String f39793b;

                /* renamed from: c */
                private final String f39794c;

                /* renamed from: d */
                private final com.stripe.android.model.a f39795d;

                /* renamed from: e */
                private final boolean f39796e;

                /* renamed from: f */
                public static final int f39791f = com.stripe.android.model.a.f24187h;
                public static final Parcelable.Creator<b> CREATOR = new a();

                /* renamed from: y3.f$e$d$b$a */
                /* loaded from: classes4.dex */
                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a */
                    public final b createFromParcel(Parcel parcel) {
                        boolean z8;
                        AbstractC3159y.i(parcel, "parcel");
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        String readString3 = parcel.readString();
                        com.stripe.android.model.a aVar = (com.stripe.android.model.a) parcel.readParcelable(b.class.getClassLoader());
                        if (parcel.readInt() != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        return new b(readString, readString2, readString3, aVar, z8);
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b */
                    public final b[] newArray(int i8) {
                        return new b[i8];
                    }
                }

                public b(String name, String str, String str2, com.stripe.android.model.a aVar, boolean z8) {
                    AbstractC3159y.i(name, "name");
                    this.f39792a = name;
                    this.f39793b = str;
                    this.f39794c = str2;
                    this.f39795d = aVar;
                    this.f39796e = z8;
                }

                public final com.stripe.android.model.a b() {
                    return this.f39795d;
                }

                public final String c() {
                    return this.f39793b;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public final String e() {
                    return this.f39792a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    if (AbstractC3159y.d(this.f39792a, bVar.f39792a) && AbstractC3159y.d(this.f39793b, bVar.f39793b) && AbstractC3159y.d(this.f39794c, bVar.f39794c) && AbstractC3159y.d(this.f39795d, bVar.f39795d) && this.f39796e == bVar.f39796e) {
                        return true;
                    }
                    return false;
                }

                public final String f() {
                    return this.f39794c;
                }

                public int hashCode() {
                    int hashCode;
                    int hashCode2;
                    int hashCode3 = this.f39792a.hashCode() * 31;
                    String str = this.f39793b;
                    int i8 = 0;
                    if (str == null) {
                        hashCode = 0;
                    } else {
                        hashCode = str.hashCode();
                    }
                    int i9 = (hashCode3 + hashCode) * 31;
                    String str2 = this.f39794c;
                    if (str2 == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = str2.hashCode();
                    }
                    int i10 = (i9 + hashCode2) * 31;
                    com.stripe.android.model.a aVar = this.f39795d;
                    if (aVar != null) {
                        i8 = aVar.hashCode();
                    }
                    return ((i10 + i8) * 31) + androidx.compose.foundation.a.a(this.f39796e);
                }

                public final boolean i() {
                    return this.f39796e;
                }

                public String toString() {
                    return "Input(name=" + this.f39792a + ", email=" + this.f39793b + ", phone=" + this.f39794c + ", address=" + this.f39795d + ", saveForFutureUse=" + this.f39796e + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i8) {
                    AbstractC3159y.i(out, "out");
                    out.writeString(this.f39792a);
                    out.writeString(this.f39793b);
                    out.writeString(this.f39794c);
                    out.writeParcelable(this.f39795d, i8);
                    out.writeInt(this.f39796e ? 1 : 0);
                }
            }

            /* renamed from: y3.f$e$d$c */
            /* loaded from: classes4.dex */
            public static final class c implements Parcelable {
                public static final Parcelable.Creator<c> CREATOR = new a();

                /* renamed from: a */
                private final String f39797a;

                /* renamed from: y3.f$e$d$c$a */
                /* loaded from: classes4.dex */
                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a */
                    public final c createFromParcel(Parcel parcel) {
                        AbstractC3159y.i(parcel, "parcel");
                        return new c(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b */
                    public final c[] newArray(int i8) {
                        return new c[i8];
                    }
                }

                public c(String paymentMethodId) {
                    AbstractC3159y.i(paymentMethodId, "paymentMethodId");
                    this.f39797a = paymentMethodId;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if ((obj instanceof c) && AbstractC3159y.d(this.f39797a, ((c) obj).f39797a)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    return this.f39797a.hashCode();
                }

                public String toString() {
                    return "InstantDebitsInfo(paymentMethodId=" + this.f39797a + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i8) {
                    AbstractC3159y.i(out, "out");
                    out.writeString(this.f39797a);
                }
            }

            public /* synthetic */ d(String str, int i8, b bVar, B3.f fVar, c cVar, p pVar, a aVar, r rVar, q qVar, int i9, AbstractC3151p abstractC3151p) {
                this(str, i8, bVar, fVar, cVar, pVar, aVar, (i9 & 128) != 0 ? null : rVar, (i9 & 256) != 0 ? null : qVar);
            }

            @Override // y3.AbstractC3991f.e, y3.AbstractC3991f
            public InterfaceC3983b c(String merchantName, boolean z8) {
                AbstractC3159y.i(merchantName, "merchantName");
                return this.f39785d.c();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // y3.AbstractC3991f.e
            public a e() {
                return this.f39788g;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                if (AbstractC3159y.d(this.f39782a, dVar.f39782a) && this.f39783b == dVar.f39783b && AbstractC3159y.d(this.f39784c, dVar.f39784c) && AbstractC3159y.d(this.f39785d, dVar.f39785d) && AbstractC3159y.d(this.f39786e, dVar.f39786e) && AbstractC3159y.d(this.f39787f, dVar.f39787f) && this.f39788g == dVar.f39788g && AbstractC3159y.d(this.f39789h, dVar.f39789h) && AbstractC3159y.d(this.f39790i, dVar.f39790i)) {
                    return true;
                }
                return false;
            }

            @Override // y3.AbstractC3991f.e
            public p f() {
                return this.f39787f;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3 = ((((((this.f39782a.hashCode() * 31) + this.f39783b) * 31) + this.f39784c.hashCode()) * 31) + this.f39785d.hashCode()) * 31;
                c cVar = this.f39786e;
                int i8 = 0;
                if (cVar == null) {
                    hashCode = 0;
                } else {
                    hashCode = cVar.hashCode();
                }
                int hashCode4 = (((((hashCode3 + hashCode) * 31) + this.f39787f.hashCode()) * 31) + this.f39788g.hashCode()) * 31;
                r rVar = this.f39789h;
                if (rVar == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = rVar.hashCode();
                }
                int i9 = (hashCode4 + hashCode2) * 31;
                q qVar = this.f39790i;
                if (qVar != null) {
                    i8 = qVar.hashCode();
                }
                return i9 + i8;
            }

            @Override // y3.AbstractC3991f.e
            public q i() {
                return this.f39790i;
            }

            @Override // y3.AbstractC3991f.e
            public r j() {
                return this.f39789h;
            }

            public final b k() {
                return this.f39784c;
            }

            public final c n() {
                return this.f39786e;
            }

            public final B3.f o() {
                return this.f39785d;
            }

            public String toString() {
                return "USBankAccount(labelResource=" + this.f39782a + ", iconResource=" + this.f39783b + ", input=" + this.f39784c + ", screenState=" + this.f39785d + ", instantDebits=" + this.f39786e + ", paymentMethodCreateParams=" + this.f39787f + ", customerRequestedSave=" + this.f39788g + ", paymentMethodOptionsParams=" + this.f39789h + ", paymentMethodExtraParams=" + this.f39790i + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f39782a);
                out.writeInt(this.f39783b);
                this.f39784c.writeToParcel(out, i8);
                out.writeParcelable(this.f39785d, i8);
                c cVar = this.f39786e;
                if (cVar == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    cVar.writeToParcel(out, i8);
                }
                out.writeParcelable(this.f39787f, i8);
                out.writeString(this.f39788g.name());
                out.writeParcelable(this.f39789h, i8);
                out.writeParcelable(this.f39790i, i8);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String labelResource, int i8, b input, B3.f screenState, c cVar, p paymentMethodCreateParams, a customerRequestedSave, r rVar, q qVar) {
                super(null);
                AbstractC3159y.i(labelResource, "labelResource");
                AbstractC3159y.i(input, "input");
                AbstractC3159y.i(screenState, "screenState");
                AbstractC3159y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
                AbstractC3159y.i(customerRequestedSave, "customerRequestedSave");
                this.f39782a = labelResource;
                this.f39783b = i8;
                this.f39784c = input;
                this.f39785d = screenState;
                this.f39786e = cVar;
                this.f39787f = paymentMethodCreateParams;
                this.f39788g = customerRequestedSave;
                this.f39789h = rVar;
                this.f39790i = qVar;
            }
        }

        public /* synthetic */ e(AbstractC3151p abstractC3151p) {
            this();
        }

        @Override // y3.AbstractC3991f
        public boolean b() {
            return false;
        }

        @Override // y3.AbstractC3991f
        public InterfaceC3983b c(String merchantName, boolean z8) {
            AbstractC3159y.i(merchantName, "merchantName");
            return null;
        }

        public abstract a e();

        public abstract p f();

        public abstract q i();

        public abstract r j();

        private e() {
            super(null);
        }
    }

    /* renamed from: y3.f$f */
    /* loaded from: classes4.dex */
    public static final class C0916f extends AbstractC3991f {

        /* renamed from: a */
        private final o f39799a;

        /* renamed from: b */
        private final b f39800b;

        /* renamed from: c */
        private final r f39801c;

        /* renamed from: d */
        public static final int f39798d = r.f24643b | o.f24394u;
        public static final Parcelable.Creator<C0916f> CREATOR = new a();

        /* renamed from: y3.f$f$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final C0916f createFromParcel(Parcel parcel) {
                b valueOf;
                AbstractC3159y.i(parcel, "parcel");
                o oVar = (o) parcel.readParcelable(C0916f.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = b.valueOf(parcel.readString());
                }
                return new C0916f(oVar, valueOf, (r) parcel.readParcelable(C0916f.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final C0916f[] newArray(int i8) {
                return new C0916f[i8];
            }
        }

        /* renamed from: y3.f$f$b */
        /* loaded from: classes4.dex */
        public static final class b extends Enum {

            /* renamed from: b */
            public static final b f39802b = new b("GooglePay", 0, c.f39757a);

            /* renamed from: c */
            public static final b f39803c = new b("Link", 1, d.f39758a);

            /* renamed from: d */
            private static final /* synthetic */ b[] f39804d;

            /* renamed from: e */
            private static final /* synthetic */ R5.a f39805e;

            /* renamed from: a */
            private final AbstractC3991f f39806a;

            static {
                b[] a8 = a();
                f39804d = a8;
                f39805e = R5.b.a(a8);
            }

            private b(String str, int i8, AbstractC3991f abstractC3991f) {
                super(str, i8);
                this.f39806a = abstractC3991f;
            }

            private static final /* synthetic */ b[] a() {
                return new b[]{f39802b, f39803c};
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) f39804d.clone();
            }

            public final AbstractC3991f b() {
                return this.f39806a;
            }
        }

        /* renamed from: y3.f$f$c */
        /* loaded from: classes4.dex */
        public /* synthetic */ class c {

            /* renamed from: a */
            public static final /* synthetic */ int[] f39807a;

            static {
                int[] iArr = new int[o.p.values().length];
                try {
                    iArr[o.p.f24509O.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[o.p.f24523m.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f39807a = iArr;
            }
        }

        public /* synthetic */ C0916f(o oVar, b bVar, r rVar, int i8, AbstractC3151p abstractC3151p) {
            this(oVar, (i8 & 2) != 0 ? null : bVar, (i8 & 4) != 0 ? null : rVar);
        }

        public static /* synthetic */ C0916f f(C0916f c0916f, o oVar, b bVar, r rVar, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                oVar = c0916f.f39799a;
            }
            if ((i8 & 2) != 0) {
                bVar = c0916f.f39800b;
            }
            if ((i8 & 4) != 0) {
                rVar = c0916f.f39801c;
            }
            return c0916f.e(oVar, bVar, rVar);
        }

        @Override // y3.AbstractC3991f
        public boolean b() {
            o.p pVar = this.f39799a.f24399e;
            if (pVar != o.p.f24509O && pVar != o.p.f24523m) {
                return false;
            }
            return true;
        }

        @Override // y3.AbstractC3991f
        public InterfaceC3983b c(String merchantName, boolean z8) {
            int i8;
            AbstractC3159y.i(merchantName, "merchantName");
            o.p pVar = this.f39799a.f24399e;
            if (pVar == null) {
                i8 = -1;
            } else {
                i8 = c.f39807a[pVar.ordinal()];
            }
            if (i8 != 1) {
                if (i8 != 2) {
                    return null;
                }
                return AbstractC3984c.f(n.f14674B0, new Object[]{merchantName}, null, 4, null);
            }
            return B3.i.f971a.a(merchantName, false, false, z8);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final C0916f e(o paymentMethod, b bVar, r rVar) {
            AbstractC3159y.i(paymentMethod, "paymentMethod");
            return new C0916f(paymentMethod, bVar, rVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0916f)) {
                return false;
            }
            C0916f c0916f = (C0916f) obj;
            if (AbstractC3159y.d(this.f39799a, c0916f.f39799a) && this.f39800b == c0916f.f39800b && AbstractC3159y.d(this.f39801c, c0916f.f39801c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f39799a.hashCode() * 31;
            b bVar = this.f39800b;
            int i8 = 0;
            if (bVar == null) {
                hashCode = 0;
            } else {
                hashCode = bVar.hashCode();
            }
            int i9 = (hashCode2 + hashCode) * 31;
            r rVar = this.f39801c;
            if (rVar != null) {
                i8 = rVar.hashCode();
            }
            return i9 + i8;
        }

        public final r i() {
            return this.f39801c;
        }

        public final boolean j() {
            if (this.f39799a.f24399e == o.p.f24523m) {
                return true;
            }
            return false;
        }

        public final b k() {
            return this.f39800b;
        }

        public String toString() {
            return "Saved(paymentMethod=" + this.f39799a + ", walletType=" + this.f39800b + ", paymentMethodOptionsParams=" + this.f39801c + ")";
        }

        public final o v() {
            return this.f39799a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f39799a, i8);
            b bVar = this.f39800b;
            if (bVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(bVar.name());
            }
            out.writeParcelable(this.f39801c, i8);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0916f(o paymentMethod, b bVar, r rVar) {
            super(null);
            AbstractC3159y.i(paymentMethod, "paymentMethod");
            this.f39799a = paymentMethod;
            this.f39800b = bVar;
            this.f39801c = rVar;
        }
    }

    private AbstractC3991f() {
    }

    public abstract boolean b();

    public abstract InterfaceC3983b c(String str, boolean z8);

    public /* synthetic */ AbstractC3991f(AbstractC3151p abstractC3151p) {
        this();
    }
}
