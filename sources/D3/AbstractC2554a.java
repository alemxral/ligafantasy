package d3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2554a implements v2.f {

    /* renamed from: a, reason: collision with root package name */
    private final g f30135a;

    /* renamed from: d3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0717a extends AbstractC2554a {
        public static final Parcelable.Creator<C0717a> CREATOR = new C0718a();

        /* renamed from: b, reason: collision with root package name */
        private final String f30136b;

        /* renamed from: d3.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0718a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0717a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new C0717a(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0717a[] newArray(int i8) {
                return new C0717a[i8];
            }
        }

        public C0717a(String str) {
            super(g.f30146c, null);
            this.f30136b = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0717a) && AbstractC3159y.d(this.f30136b, ((C0717a) obj).f30136b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f30136b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "AmexExpressCheckoutWallet(dynamicLast4=" + this.f30136b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f30136b);
        }
    }

    /* renamed from: d3.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC2554a {
        public static final Parcelable.Creator<b> CREATOR = new C0719a();

        /* renamed from: b, reason: collision with root package name */
        private final String f30137b;

        /* renamed from: d3.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0719a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new b(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String str) {
            super(g.f30147d, null);
            this.f30137b = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && AbstractC3159y.d(this.f30137b, ((b) obj).f30137b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f30137b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "ApplePayWallet(dynamicLast4=" + this.f30137b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f30137b);
        }
    }

    /* renamed from: d3.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC2554a implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new C0720a();

        /* renamed from: b, reason: collision with root package name */
        private final String f30138b;

        /* renamed from: d3.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0720a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String str) {
            super(g.f30148e, null);
            this.f30138b = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3159y.d(this.f30138b, ((c) obj).f30138b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f30138b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "GooglePayWallet(dynamicLast4=" + this.f30138b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f30138b);
        }
    }

    /* renamed from: d3.a$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC2554a {
        public static final Parcelable.Creator<d> CREATOR = new C0721a();

        /* renamed from: b, reason: collision with root package name */
        private final String f30139b;

        /* renamed from: d3.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0721a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(String str) {
            super(g.f30152i, null);
            this.f30139b = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && AbstractC3159y.d(this.f30139b, ((d) obj).f30139b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f30139b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "LinkWallet(dynamicLast4=" + this.f30139b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f30139b);
        }
    }

    /* renamed from: d3.a$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC2554a {
        public static final Parcelable.Creator<e> CREATOR = new C0722a();

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.model.a f30140b;

        /* renamed from: c, reason: collision with root package name */
        private final String f30141c;

        /* renamed from: d, reason: collision with root package name */
        private final String f30142d;

        /* renamed from: e, reason: collision with root package name */
        private final com.stripe.android.model.a f30143e;

        /* renamed from: d3.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0722a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                com.stripe.android.model.a createFromParcel;
                AbstractC3159y.i(parcel, "parcel");
                com.stripe.android.model.a aVar = null;
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = com.stripe.android.model.a.CREATOR.createFromParcel(parcel);
                }
                com.stripe.android.model.a aVar2 = createFromParcel;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    aVar = com.stripe.android.model.a.CREATOR.createFromParcel(parcel);
                }
                return new e(aVar2, readString, readString2, aVar);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        public e(com.stripe.android.model.a aVar, String str, String str2, com.stripe.android.model.a aVar2) {
            super(g.f30149f, null);
            this.f30140b = aVar;
            this.f30141c = str;
            this.f30142d = str2;
            this.f30143e = aVar2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (AbstractC3159y.d(this.f30140b, eVar.f30140b) && AbstractC3159y.d(this.f30141c, eVar.f30141c) && AbstractC3159y.d(this.f30142d, eVar.f30142d) && AbstractC3159y.d(this.f30143e, eVar.f30143e)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            com.stripe.android.model.a aVar = this.f30140b;
            int i8 = 0;
            if (aVar == null) {
                hashCode = 0;
            } else {
                hashCode = aVar.hashCode();
            }
            int i9 = hashCode * 31;
            String str = this.f30141c;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str2 = this.f30142d;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            com.stripe.android.model.a aVar2 = this.f30143e;
            if (aVar2 != null) {
                i8 = aVar2.hashCode();
            }
            return i11 + i8;
        }

        public String toString() {
            return "MasterpassWallet(billingAddress=" + this.f30140b + ", email=" + this.f30141c + ", name=" + this.f30142d + ", shippingAddress=" + this.f30143e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            com.stripe.android.model.a aVar = this.f30140b;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f30141c);
            out.writeString(this.f30142d);
            com.stripe.android.model.a aVar2 = this.f30143e;
            if (aVar2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar2.writeToParcel(out, i8);
            }
        }
    }

    /* renamed from: d3.a$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC2554a {
        public static final Parcelable.Creator<f> CREATOR = new C0723a();

        /* renamed from: b, reason: collision with root package name */
        private final String f30144b;

        /* renamed from: d3.a$f$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0723a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new f(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final f[] newArray(int i8) {
                return new f[i8];
            }
        }

        public f(String str) {
            super(g.f30150g, null);
            this.f30144b = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof f) && AbstractC3159y.d(this.f30144b, ((f) obj).f30144b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f30144b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "SamsungPayWallet(dynamicLast4=" + this.f30144b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f30144b);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: d3.a$g */
    /* loaded from: classes4.dex */
    public static final class g {

        /* renamed from: b, reason: collision with root package name */
        public static final C0724a f30145b;

        /* renamed from: c, reason: collision with root package name */
        public static final g f30146c = new g("AmexExpressCheckout", 0, "amex_express_checkout");

        /* renamed from: d, reason: collision with root package name */
        public static final g f30147d = new g("ApplePay", 1, "apple_pay");

        /* renamed from: e, reason: collision with root package name */
        public static final g f30148e = new g("GooglePay", 2, "google_pay");

        /* renamed from: f, reason: collision with root package name */
        public static final g f30149f = new g("Masterpass", 3, "master_pass");

        /* renamed from: g, reason: collision with root package name */
        public static final g f30150g = new g("SamsungPay", 4, "samsung_pay");

        /* renamed from: h, reason: collision with root package name */
        public static final g f30151h = new g("VisaCheckout", 5, "visa_checkout");

        /* renamed from: i, reason: collision with root package name */
        public static final g f30152i = new g("Link", 6, "link");

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ g[] f30153j;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ R5.a f30154k;

        /* renamed from: a, reason: collision with root package name */
        private final String f30155a;

        /* renamed from: d3.a$g$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0724a {
            private C0724a() {
            }

            public final g a(String str) {
                Object obj;
                Iterator<E> it = g.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((g) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (g) obj;
            }

            public /* synthetic */ C0724a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            g[] a8 = a();
            f30153j = a8;
            f30154k = R5.b.a(a8);
            f30145b = new C0724a(null);
        }

        private g(String str, int i8, String str2) {
            this.f30155a = str2;
        }

        private static final /* synthetic */ g[] a() {
            return new g[]{f30146c, f30147d, f30148e, f30149f, f30150g, f30151h, f30152i};
        }

        public static R5.a c() {
            return f30154k;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) f30153j.clone();
        }

        public final String b() {
            return this.f30155a;
        }
    }

    /* renamed from: d3.a$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC2554a {
        public static final Parcelable.Creator<h> CREATOR = new C0725a();

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.model.a f30156b;

        /* renamed from: c, reason: collision with root package name */
        private final String f30157c;

        /* renamed from: d, reason: collision with root package name */
        private final String f30158d;

        /* renamed from: e, reason: collision with root package name */
        private final com.stripe.android.model.a f30159e;

        /* renamed from: f, reason: collision with root package name */
        private final String f30160f;

        /* renamed from: d3.a$h$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0725a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h createFromParcel(Parcel parcel) {
                com.stripe.android.model.a createFromParcel;
                AbstractC3159y.i(parcel, "parcel");
                com.stripe.android.model.a aVar = null;
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = com.stripe.android.model.a.CREATOR.createFromParcel(parcel);
                }
                com.stripe.android.model.a aVar2 = createFromParcel;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    aVar = com.stripe.android.model.a.CREATOR.createFromParcel(parcel);
                }
                return new h(aVar2, readString, readString2, aVar, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final h[] newArray(int i8) {
                return new h[i8];
            }
        }

        public h(com.stripe.android.model.a aVar, String str, String str2, com.stripe.android.model.a aVar2, String str3) {
            super(g.f30151h, null);
            this.f30156b = aVar;
            this.f30157c = str;
            this.f30158d = str2;
            this.f30159e = aVar2;
            this.f30160f = str3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (AbstractC3159y.d(this.f30156b, hVar.f30156b) && AbstractC3159y.d(this.f30157c, hVar.f30157c) && AbstractC3159y.d(this.f30158d, hVar.f30158d) && AbstractC3159y.d(this.f30159e, hVar.f30159e) && AbstractC3159y.d(this.f30160f, hVar.f30160f)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            com.stripe.android.model.a aVar = this.f30156b;
            int i8 = 0;
            if (aVar == null) {
                hashCode = 0;
            } else {
                hashCode = aVar.hashCode();
            }
            int i9 = hashCode * 31;
            String str = this.f30157c;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str2 = this.f30158d;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            com.stripe.android.model.a aVar2 = this.f30159e;
            if (aVar2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = aVar2.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            String str3 = this.f30160f;
            if (str3 != null) {
                i8 = str3.hashCode();
            }
            return i12 + i8;
        }

        public String toString() {
            return "VisaCheckoutWallet(billingAddress=" + this.f30156b + ", email=" + this.f30157c + ", name=" + this.f30158d + ", shippingAddress=" + this.f30159e + ", dynamicLast4=" + this.f30160f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            com.stripe.android.model.a aVar = this.f30156b;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f30157c);
            out.writeString(this.f30158d);
            com.stripe.android.model.a aVar2 = this.f30159e;
            if (aVar2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar2.writeToParcel(out, i8);
            }
            out.writeString(this.f30160f);
        }
    }

    public /* synthetic */ AbstractC2554a(g gVar, AbstractC3151p abstractC3151p) {
        this(gVar);
    }

    public final g b() {
        return this.f30135a;
    }

    private AbstractC2554a(g gVar) {
        this.f30135a = gVar;
    }
}
