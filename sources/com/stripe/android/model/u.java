package com.stripe.android.model;

import M5.AbstractC1246t;
import M5.Q;
import M5.a0;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class u implements StripeIntent {

    /* renamed from: a, reason: collision with root package name */
    private final String f24677a;

    /* renamed from: b, reason: collision with root package name */
    private final a f24678b;

    /* renamed from: c, reason: collision with root package name */
    private final long f24679c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24680d;

    /* renamed from: e, reason: collision with root package name */
    private final String f24681e;

    /* renamed from: f, reason: collision with root package name */
    private final String f24682f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f24683g;

    /* renamed from: h, reason: collision with root package name */
    private final o f24684h;

    /* renamed from: i, reason: collision with root package name */
    private final String f24685i;

    /* renamed from: j, reason: collision with root package name */
    private final List f24686j;

    /* renamed from: k, reason: collision with root package name */
    private final StripeIntent.Status f24687k;

    /* renamed from: l, reason: collision with root package name */
    private final StripeIntent.Usage f24688l;

    /* renamed from: m, reason: collision with root package name */
    private final e f24689m;

    /* renamed from: n, reason: collision with root package name */
    private final List f24690n;

    /* renamed from: o, reason: collision with root package name */
    private final List f24691o;

    /* renamed from: p, reason: collision with root package name */
    private final StripeIntent.a f24692p;

    /* renamed from: q, reason: collision with root package name */
    private final String f24693q;

    /* renamed from: r, reason: collision with root package name */
    public static final c f24675r = new c(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f24676s = 8;
    public static final Parcelable.Creator<u> CREATOR = new d();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0529a f24694b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f24695c = new a("Duplicate", 0, "duplicate");

        /* renamed from: d, reason: collision with root package name */
        public static final a f24696d = new a("RequestedByCustomer", 1, "requested_by_customer");

        /* renamed from: e, reason: collision with root package name */
        public static final a f24697e = new a("Abandoned", 2, "abandoned");

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ a[] f24698f;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24699g;

        /* renamed from: a, reason: collision with root package name */
        private final String f24700a;

        /* renamed from: com.stripe.android.model.u$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0529a {
            private C0529a() {
            }

            public final a a(String str) {
                Object obj;
                Iterator<E> it = a.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((a) obj).f24700a, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (a) obj;
            }

            public /* synthetic */ C0529a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            a[] a8 = a();
            f24698f = a8;
            f24699g = R5.b.a(a8);
            f24694b = new C0529a(null);
        }

        private a(String str, int i8, String str2) {
            this.f24700a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f24695c, f24696d, f24697e};
        }

        public static R5.a c() {
            return f24699g;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f24698f.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final a f24701c = new a(null);

        /* renamed from: d, reason: collision with root package name */
        private static final Pattern f24702d = Pattern.compile("^seti_[^_]+_secret_[^_]+$");

        /* renamed from: a, reason: collision with root package name */
        private final String f24703a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24704b;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final boolean a(String value) {
                AbstractC3159y.i(value, "value");
                return b.f24702d.matcher(value).matches();
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        public b(String value) {
            List m8;
            AbstractC3159y.i(value, "value");
            this.f24703a = value;
            List j8 = new g6.j("_secret").j(value, 0);
            if (!j8.isEmpty()) {
                ListIterator listIterator = j8.listIterator(j8.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        m8 = AbstractC1246t.Q0(j8, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            m8 = AbstractC1246t.m();
            this.f24704b = ((String[]) m8.toArray(new String[0]))[0];
            if (f24701c.a(this.f24703a)) {
                return;
            }
            throw new IllegalArgumentException(("Invalid Setup Intent client secret: " + this.f24703a).toString());
        }

        public final String b() {
            return this.f24704b;
        }

        public final String c() {
            return this.f24703a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC3159y.d(this.f24703a, ((b) obj).f24703a);
        }

        public int hashCode() {
            return this.f24703a.hashCode();
        }

        public String toString() {
            return "ClientSecret(value=" + this.f24703a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new u(parcel.readString(), parcel.readInt() == 0 ? null : a.valueOf(parcel.readString()), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : o.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : StripeIntent.Status.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString()), parcel.readInt() != 0 ? e.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList(), parcel.createStringArrayList(), (StripeIntent.a) parcel.readParcelable(u.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final u[] newArray(int i8) {
            return new u[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements v2.f {

        /* renamed from: a, reason: collision with root package name */
        private final String f24707a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24708b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24709c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24710d;

        /* renamed from: e, reason: collision with root package name */
        private final String f24711e;

        /* renamed from: f, reason: collision with root package name */
        private final o f24712f;

        /* renamed from: g, reason: collision with root package name */
        private final c f24713g;

        /* renamed from: h, reason: collision with root package name */
        public static final a f24705h = new a(null);

        /* renamed from: i, reason: collision with root package name */
        public static final int f24706i = 8;
        public static final Parcelable.Creator<e> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
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
            public final e createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new e(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : o.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class c {

            /* renamed from: b, reason: collision with root package name */
            public static final a f24714b;

            /* renamed from: c, reason: collision with root package name */
            public static final c f24715c = new c("ApiConnectionError", 0, "api_connection_error");

            /* renamed from: d, reason: collision with root package name */
            public static final c f24716d = new c("ApiError", 1, "api_error");

            /* renamed from: e, reason: collision with root package name */
            public static final c f24717e = new c("AuthenticationError", 2, "authentication_error");

            /* renamed from: f, reason: collision with root package name */
            public static final c f24718f = new c("CardError", 3, "card_error");

            /* renamed from: g, reason: collision with root package name */
            public static final c f24719g = new c("IdempotencyError", 4, "idempotency_error");

            /* renamed from: h, reason: collision with root package name */
            public static final c f24720h = new c("InvalidRequestError", 5, "invalid_request_error");

            /* renamed from: i, reason: collision with root package name */
            public static final c f24721i = new c("RateLimitError", 6, "rate_limit_error");

            /* renamed from: j, reason: collision with root package name */
            private static final /* synthetic */ c[] f24722j;

            /* renamed from: k, reason: collision with root package name */
            private static final /* synthetic */ R5.a f24723k;

            /* renamed from: a, reason: collision with root package name */
            private final String f24724a;

            /* loaded from: classes4.dex */
            public static final class a {
                private a() {
                }

                public final c a(String str) {
                    Object obj;
                    Iterator<E> it = c.c().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (AbstractC3159y.d(((c) obj).b(), str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    return (c) obj;
                }

                public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                    this();
                }
            }

            static {
                c[] a8 = a();
                f24722j = a8;
                f24723k = R5.b.a(a8);
                f24714b = new a(null);
            }

            private c(String str, int i8, String str2) {
                this.f24724a = str2;
            }

            private static final /* synthetic */ c[] a() {
                return new c[]{f24715c, f24716d, f24717e, f24718f, f24719g, f24720h, f24721i};
            }

            public static R5.a c() {
                return f24723k;
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) f24722j.clone();
            }

            public final String b() {
                return this.f24724a;
            }
        }

        public e(String str, String str2, String str3, String str4, String str5, o oVar, c cVar) {
            this.f24707a = str;
            this.f24708b = str2;
            this.f24709c = str3;
            this.f24710d = str4;
            this.f24711e = str5;
            this.f24712f = oVar;
            this.f24713g = cVar;
        }

        public static /* synthetic */ e c(e eVar, String str, String str2, String str3, String str4, String str5, o oVar, c cVar, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = eVar.f24707a;
            }
            if ((i8 & 2) != 0) {
                str2 = eVar.f24708b;
            }
            String str6 = str2;
            if ((i8 & 4) != 0) {
                str3 = eVar.f24709c;
            }
            String str7 = str3;
            if ((i8 & 8) != 0) {
                str4 = eVar.f24710d;
            }
            String str8 = str4;
            if ((i8 & 16) != 0) {
                str5 = eVar.f24711e;
            }
            String str9 = str5;
            if ((i8 & 32) != 0) {
                oVar = eVar.f24712f;
            }
            o oVar2 = oVar;
            if ((i8 & 64) != 0) {
                cVar = eVar.f24713g;
            }
            return eVar.b(str, str6, str7, str8, str9, oVar2, cVar);
        }

        public final e b(String str, String str2, String str3, String str4, String str5, o oVar, c cVar) {
            return new e(str, str2, str3, str4, str5, oVar, cVar);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f24710d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC3159y.d(this.f24707a, eVar.f24707a) && AbstractC3159y.d(this.f24708b, eVar.f24708b) && AbstractC3159y.d(this.f24709c, eVar.f24709c) && AbstractC3159y.d(this.f24710d, eVar.f24710d) && AbstractC3159y.d(this.f24711e, eVar.f24711e) && AbstractC3159y.d(this.f24712f, eVar.f24712f) && this.f24713g == eVar.f24713g;
        }

        public final c f() {
            return this.f24713g;
        }

        public int hashCode() {
            String str = this.f24707a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24708b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24709c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f24710d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f24711e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            o oVar = this.f24712f;
            int hashCode6 = (hashCode5 + (oVar == null ? 0 : oVar.hashCode())) * 31;
            c cVar = this.f24713g;
            return hashCode6 + (cVar != null ? cVar.hashCode() : 0);
        }

        public final String r() {
            return this.f24707a;
        }

        public String toString() {
            return "Error(code=" + this.f24707a + ", declineCode=" + this.f24708b + ", docUrl=" + this.f24709c + ", message=" + this.f24710d + ", param=" + this.f24711e + ", paymentMethod=" + this.f24712f + ", type=" + this.f24713g + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24707a);
            out.writeString(this.f24708b);
            out.writeString(this.f24709c);
            out.writeString(this.f24710d);
            out.writeString(this.f24711e);
            o oVar = this.f24712f;
            if (oVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                oVar.writeToParcel(out, i8);
            }
            c cVar = this.f24713g;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(cVar.name());
            }
        }
    }

    public u(String str, a aVar, long j8, String str2, String str3, String str4, boolean z8, o oVar, String str5, List paymentMethodTypes, StripeIntent.Status status, StripeIntent.Usage usage, e eVar, List unactivatedPaymentMethods, List linkFundingSources, StripeIntent.a aVar2, String str6) {
        AbstractC3159y.i(paymentMethodTypes, "paymentMethodTypes");
        AbstractC3159y.i(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        AbstractC3159y.i(linkFundingSources, "linkFundingSources");
        this.f24677a = str;
        this.f24678b = aVar;
        this.f24679c = j8;
        this.f24680d = str2;
        this.f24681e = str3;
        this.f24682f = str4;
        this.f24683g = z8;
        this.f24684h = oVar;
        this.f24685i = str5;
        this.f24686j = paymentMethodTypes;
        this.f24687k = status;
        this.f24688l = usage;
        this.f24689m = eVar;
        this.f24690n = unactivatedPaymentMethods;
        this.f24691o = linkFundingSources;
        this.f24692p = aVar2;
        this.f24693q = str6;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List D() {
        return this.f24690n;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List H() {
        return this.f24691o;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean J() {
        return AbstractC1246t.d0(a0.i(StripeIntent.Status.f24137d, StripeIntent.Status.f24141h), getStatus());
    }

    @Override // com.stripe.android.model.StripeIntent
    public Map N() {
        Map b8;
        String str = this.f24693q;
        if (str == null || (b8 = v2.e.f38770a.b(new JSONObject(str))) == null) {
            return Q.h();
        }
        return b8;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean a() {
        return this.f24683g;
    }

    public final u b(String str, a aVar, long j8, String str2, String str3, String str4, boolean z8, o oVar, String str5, List paymentMethodTypes, StripeIntent.Status status, StripeIntent.Usage usage, e eVar, List unactivatedPaymentMethods, List linkFundingSources, StripeIntent.a aVar2, String str6) {
        AbstractC3159y.i(paymentMethodTypes, "paymentMethodTypes");
        AbstractC3159y.i(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        AbstractC3159y.i(linkFundingSources, "linkFundingSources");
        return new u(str, aVar, j8, str2, str3, str4, z8, oVar, str5, paymentMethodTypes, status, usage, eVar, unactivatedPaymentMethods, linkFundingSources, aVar2, str6);
    }

    @Override // com.stripe.android.model.StripeIntent
    public String d() {
        return this.f24681e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final e e() {
        return this.f24689m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return AbstractC3159y.d(this.f24677a, uVar.f24677a) && this.f24678b == uVar.f24678b && this.f24679c == uVar.f24679c && AbstractC3159y.d(this.f24680d, uVar.f24680d) && AbstractC3159y.d(this.f24681e, uVar.f24681e) && AbstractC3159y.d(this.f24682f, uVar.f24682f) && this.f24683g == uVar.f24683g && AbstractC3159y.d(this.f24684h, uVar.f24684h) && AbstractC3159y.d(this.f24685i, uVar.f24685i) && AbstractC3159y.d(this.f24686j, uVar.f24686j) && this.f24687k == uVar.f24687k && this.f24688l == uVar.f24688l && AbstractC3159y.d(this.f24689m, uVar.f24689m) && AbstractC3159y.d(this.f24690n, uVar.f24690n) && AbstractC3159y.d(this.f24691o, uVar.f24691o) && AbstractC3159y.d(this.f24692p, uVar.f24692p) && AbstractC3159y.d(this.f24693q, uVar.f24693q);
    }

    @Override // com.stripe.android.model.StripeIntent
    public List g() {
        return this.f24686j;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getId() {
        return this.f24677a;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.Status getStatus() {
        return this.f24687k;
    }

    public int hashCode() {
        String str = this.f24677a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        a aVar = this.f24678b;
        int hashCode2 = (((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + androidx.collection.a.a(this.f24679c)) * 31;
        String str2 = this.f24680d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f24681e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f24682f;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f24683g)) * 31;
        o oVar = this.f24684h;
        int hashCode6 = (hashCode5 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str5 = this.f24685i;
        int hashCode7 = (((hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f24686j.hashCode()) * 31;
        StripeIntent.Status status = this.f24687k;
        int hashCode8 = (hashCode7 + (status == null ? 0 : status.hashCode())) * 31;
        StripeIntent.Usage usage = this.f24688l;
        int hashCode9 = (hashCode8 + (usage == null ? 0 : usage.hashCode())) * 31;
        e eVar = this.f24689m;
        int hashCode10 = (((((hashCode9 + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.f24690n.hashCode()) * 31) + this.f24691o.hashCode()) * 31;
        StripeIntent.a aVar2 = this.f24692p;
        int hashCode11 = (hashCode10 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str6 = this.f24693q;
        return hashCode11 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.a l() {
        return this.f24692p;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.NextActionType m() {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        StripeIntent.a l8 = l();
        if (l8 instanceof StripeIntent.a.j) {
            return StripeIntent.NextActionType.f24120d;
        }
        if (l8 instanceof StripeIntent.a.i) {
            return StripeIntent.NextActionType.f24119c;
        }
        if (l8 instanceof StripeIntent.a.g) {
            return StripeIntent.NextActionType.f24121e;
        }
        if (l8 instanceof StripeIntent.a.d) {
            return StripeIntent.NextActionType.f24128l;
        }
        if (l8 instanceof StripeIntent.a.e) {
            return StripeIntent.NextActionType.f24129m;
        }
        if (l8 instanceof StripeIntent.a.f) {
            return StripeIntent.NextActionType.f24130n;
        }
        if (l8 instanceof StripeIntent.a.m) {
            return StripeIntent.NextActionType.f24125i;
        }
        if (l8 instanceof StripeIntent.a.c) {
            return StripeIntent.NextActionType.f24127k;
        }
        boolean z12 = true;
        if (l8 instanceof StripeIntent.a.C0480a) {
            z8 = true;
        } else {
            z8 = l8 instanceof StripeIntent.a.b;
        }
        if (z8) {
            z9 = true;
        } else {
            z9 = l8 instanceof StripeIntent.a.n;
        }
        if (z9) {
            z10 = true;
        } else {
            z10 = l8 instanceof StripeIntent.a.l;
        }
        if (z10) {
            z11 = true;
        } else {
            z11 = l8 instanceof StripeIntent.a.k;
        }
        if (!z11 && l8 != null) {
            z12 = false;
        }
        if (z12) {
            return null;
        }
        throw new L5.p();
    }

    @Override // com.stripe.android.model.StripeIntent
    public String p() {
        return this.f24680d;
    }

    public String toString() {
        return "SetupIntent(id=" + this.f24677a + ", cancellationReason=" + this.f24678b + ", created=" + this.f24679c + ", countryCode=" + this.f24680d + ", clientSecret=" + this.f24681e + ", description=" + this.f24682f + ", isLiveMode=" + this.f24683g + ", paymentMethod=" + this.f24684h + ", paymentMethodId=" + this.f24685i + ", paymentMethodTypes=" + this.f24686j + ", status=" + this.f24687k + ", usage=" + this.f24688l + ", lastSetupError=" + this.f24689m + ", unactivatedPaymentMethods=" + this.f24690n + ", linkFundingSources=" + this.f24691o + ", nextActionData=" + this.f24692p + ", paymentMethodOptionsJsonString=" + this.f24693q + ")";
    }

    @Override // com.stripe.android.model.StripeIntent
    public o v() {
        return this.f24684h;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean w() {
        if (getStatus() == StripeIntent.Status.f24138e) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f24677a);
        a aVar = this.f24678b;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(aVar.name());
        }
        out.writeLong(this.f24679c);
        out.writeString(this.f24680d);
        out.writeString(this.f24681e);
        out.writeString(this.f24682f);
        out.writeInt(this.f24683g ? 1 : 0);
        o oVar = this.f24684h;
        if (oVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            oVar.writeToParcel(out, i8);
        }
        out.writeString(this.f24685i);
        out.writeStringList(this.f24686j);
        StripeIntent.Status status = this.f24687k;
        if (status == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(status.name());
        }
        StripeIntent.Usage usage = this.f24688l;
        if (usage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(usage.name());
        }
        e eVar = this.f24689m;
        if (eVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            eVar.writeToParcel(out, i8);
        }
        out.writeStringList(this.f24690n);
        out.writeStringList(this.f24691o);
        out.writeParcelable(this.f24692p, i8);
        out.writeString(this.f24693q);
    }

    public /* synthetic */ u(String str, a aVar, long j8, String str2, String str3, String str4, boolean z8, o oVar, String str5, List list, StripeIntent.Status status, StripeIntent.Usage usage, e eVar, List list2, List list3, StripeIntent.a aVar2, String str6, int i8, AbstractC3151p abstractC3151p) {
        this(str, aVar, j8, str2, str3, str4, z8, (i8 & 128) != 0 ? null : oVar, str5, list, status, usage, (i8 & 4096) != 0 ? null : eVar, list2, list3, aVar2, (i8 & 65536) != 0 ? null : str6);
    }
}
