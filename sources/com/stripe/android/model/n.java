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
public final class n implements StripeIntent {

    /* renamed from: a, reason: collision with root package name */
    private final String f24314a;

    /* renamed from: b, reason: collision with root package name */
    private final List f24315b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f24316c;

    /* renamed from: d, reason: collision with root package name */
    private final long f24317d;

    /* renamed from: e, reason: collision with root package name */
    private final a f24318e;

    /* renamed from: f, reason: collision with root package name */
    private final b f24319f;

    /* renamed from: g, reason: collision with root package name */
    private final String f24320g;

    /* renamed from: h, reason: collision with root package name */
    private final e f24321h;

    /* renamed from: i, reason: collision with root package name */
    private final String f24322i;

    /* renamed from: j, reason: collision with root package name */
    private final long f24323j;

    /* renamed from: k, reason: collision with root package name */
    private final String f24324k;

    /* renamed from: l, reason: collision with root package name */
    private final String f24325l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f24326m;

    /* renamed from: n, reason: collision with root package name */
    private final o f24327n;

    /* renamed from: o, reason: collision with root package name */
    private final String f24328o;

    /* renamed from: p, reason: collision with root package name */
    private final String f24329p;

    /* renamed from: q, reason: collision with root package name */
    private final StripeIntent.Status f24330q;

    /* renamed from: r, reason: collision with root package name */
    private final StripeIntent.Usage f24331r;

    /* renamed from: s, reason: collision with root package name */
    private final g f24332s;

    /* renamed from: t, reason: collision with root package name */
    private final h f24333t;

    /* renamed from: u, reason: collision with root package name */
    private final List f24334u;

    /* renamed from: v, reason: collision with root package name */
    private final List f24335v;

    /* renamed from: w, reason: collision with root package name */
    private final StripeIntent.a f24336w;

    /* renamed from: x, reason: collision with root package name */
    private final String f24337x;

    /* renamed from: y, reason: collision with root package name */
    public static final d f24312y = new d(null);

    /* renamed from: z, reason: collision with root package name */
    public static final int f24313z = 8;
    public static final Parcelable.Creator<n> CREATOR = new f();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0514a f24338b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f24339c = new a("Duplicate", 0, "duplicate");

        /* renamed from: d, reason: collision with root package name */
        public static final a f24340d = new a("Fraudulent", 1, "fraudulent");

        /* renamed from: e, reason: collision with root package name */
        public static final a f24341e = new a("RequestedByCustomer", 2, "requested_by_customer");

        /* renamed from: f, reason: collision with root package name */
        public static final a f24342f = new a("Abandoned", 3, "abandoned");

        /* renamed from: g, reason: collision with root package name */
        public static final a f24343g = new a("FailedInvoice", 4, "failed_invoice");

        /* renamed from: h, reason: collision with root package name */
        public static final a f24344h = new a("VoidInvoice", 5, "void_invoice");

        /* renamed from: i, reason: collision with root package name */
        public static final a f24345i = new a("Automatic", 6, "automatic");

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ a[] f24346j;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24347k;

        /* renamed from: a, reason: collision with root package name */
        private final String f24348a;

        /* renamed from: com.stripe.android.model.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0514a {
            private C0514a() {
            }

            public final a a(String str) {
                Object obj;
                Iterator<E> it = a.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((a) obj).f24348a, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (a) obj;
            }

            public /* synthetic */ C0514a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            a[] a8 = a();
            f24346j = a8;
            f24347k = R5.b.a(a8);
            f24338b = new C0514a(null);
        }

        private a(String str, int i8, String str2) {
            this.f24348a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f24339c, f24340d, f24341e, f24342f, f24343g, f24344h, f24345i};
        }

        public static R5.a c() {
            return f24347k;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f24346j.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final a f24349b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f24350c = new b("Automatic", 0, "automatic");

        /* renamed from: d, reason: collision with root package name */
        public static final b f24351d = new b("AutomaticAsync", 1, "automatic_async");

        /* renamed from: e, reason: collision with root package name */
        public static final b f24352e = new b("Manual", 2, "manual");

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ b[] f24353f;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24354g;

        /* renamed from: a, reason: collision with root package name */
        private final String f24355a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final b a(String str) {
                Object obj;
                Iterator<E> it = b.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((b) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                b bVar = (b) obj;
                if (bVar == null) {
                    return b.f24350c;
                }
                return bVar;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            b[] a8 = a();
            f24353f = a8;
            f24354g = R5.b.a(a8);
            f24349b = new a(null);
        }

        private b(String str, int i8, String str2) {
            this.f24355a = str2;
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f24350c, f24351d, f24352e};
        }

        public static R5.a c() {
            return f24354g;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f24353f.clone();
        }

        public final String b() {
            return this.f24355a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final a f24356c = new a(null);

        /* renamed from: d, reason: collision with root package name */
        private static final Pattern f24357d = Pattern.compile("^pi_[^_]+_secret_[^_]+$");

        /* renamed from: a, reason: collision with root package name */
        private final String f24358a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24359b;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final boolean a(String value) {
                AbstractC3159y.i(value, "value");
                return c.f24357d.matcher(value).matches();
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        public c(String value) {
            List m8;
            AbstractC3159y.i(value, "value");
            this.f24358a = value;
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
            this.f24359b = ((String[]) m8.toArray(new String[0]))[0];
            if (f24356c.a(this.f24358a)) {
                return;
            }
            throw new IllegalArgumentException(("Invalid Payment Intent client secret: " + this.f24358a).toString());
        }

        public final String b() {
            return this.f24359b;
        }

        public final String c() {
            return this.f24358a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3159y.d(this.f24358a, ((c) obj).f24358a);
        }

        public int hashCode() {
            return this.f24358a.hashCode();
        }

        public String toString() {
            return "ClientSecret(value=" + this.f24358a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class e {

        /* renamed from: b, reason: collision with root package name */
        public static final a f24360b;

        /* renamed from: c, reason: collision with root package name */
        public static final e f24361c = new e("Automatic", 0, "automatic");

        /* renamed from: d, reason: collision with root package name */
        public static final e f24362d = new e("Manual", 1, "manual");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ e[] f24363e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24364f;

        /* renamed from: a, reason: collision with root package name */
        private final String f24365a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final e a(String str) {
                Object obj;
                Iterator<E> it = e.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((e) obj).f24365a, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                e eVar = (e) obj;
                if (eVar == null) {
                    return e.f24361c;
                }
                return eVar;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            e[] a8 = a();
            f24363e = a8;
            f24364f = R5.b.a(a8);
            f24360b = new a(null);
        }

        private e(String str, int i8, String str2) {
            this.f24365a = str2;
        }

        private static final /* synthetic */ e[] a() {
            return new e[]{f24361c, f24362d};
        }

        public static R5.a c() {
            return f24364f;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f24363e.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new n(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readInt() == 0 ? null : a.valueOf(parcel.readString()), b.valueOf(parcel.readString()), parcel.readString(), e.valueOf(parcel.readString()), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : o.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : StripeIntent.Status.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : g.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? h.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList(), parcel.createStringArrayList(), (StripeIntent.a) parcel.readParcelable(n.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n[] newArray(int i8) {
            return new n[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements v2.f {

        /* renamed from: a, reason: collision with root package name */
        private final String f24368a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24369b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24370c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24371d;

        /* renamed from: e, reason: collision with root package name */
        private final String f24372e;

        /* renamed from: f, reason: collision with root package name */
        private final String f24373f;

        /* renamed from: g, reason: collision with root package name */
        private final o f24374g;

        /* renamed from: h, reason: collision with root package name */
        private final c f24375h;

        /* renamed from: i, reason: collision with root package name */
        public static final a f24366i = new a(null);

        /* renamed from: j, reason: collision with root package name */
        public static final int f24367j = 8;
        public static final Parcelable.Creator<g> CREATOR = new b();

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
            public final g createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new g(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : o.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i8) {
                return new g[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class c {

            /* renamed from: b, reason: collision with root package name */
            public static final a f24376b;

            /* renamed from: c, reason: collision with root package name */
            public static final c f24377c = new c("ApiConnectionError", 0, "api_connection_error");

            /* renamed from: d, reason: collision with root package name */
            public static final c f24378d = new c("ApiError", 1, "api_error");

            /* renamed from: e, reason: collision with root package name */
            public static final c f24379e = new c("AuthenticationError", 2, "authentication_error");

            /* renamed from: f, reason: collision with root package name */
            public static final c f24380f = new c("CardError", 3, "card_error");

            /* renamed from: g, reason: collision with root package name */
            public static final c f24381g = new c("IdempotencyError", 4, "idempotency_error");

            /* renamed from: h, reason: collision with root package name */
            public static final c f24382h = new c("InvalidRequestError", 5, "invalid_request_error");

            /* renamed from: i, reason: collision with root package name */
            public static final c f24383i = new c("RateLimitError", 6, "rate_limit_error");

            /* renamed from: j, reason: collision with root package name */
            private static final /* synthetic */ c[] f24384j;

            /* renamed from: k, reason: collision with root package name */
            private static final /* synthetic */ R5.a f24385k;

            /* renamed from: a, reason: collision with root package name */
            private final String f24386a;

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
                f24384j = a8;
                f24385k = R5.b.a(a8);
                f24376b = new a(null);
            }

            private c(String str, int i8, String str2) {
                this.f24386a = str2;
            }

            private static final /* synthetic */ c[] a() {
                return new c[]{f24377c, f24378d, f24379e, f24380f, f24381g, f24382h, f24383i};
            }

            public static R5.a c() {
                return f24385k;
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) f24384j.clone();
            }

            public final String b() {
                return this.f24386a;
            }
        }

        public g(String str, String str2, String str3, String str4, String str5, String str6, o oVar, c cVar) {
            this.f24368a = str;
            this.f24369b = str2;
            this.f24370c = str3;
            this.f24371d = str4;
            this.f24372e = str5;
            this.f24373f = str6;
            this.f24374g = oVar;
            this.f24375h = cVar;
        }

        public final g b(String str, String str2, String str3, String str4, String str5, String str6, o oVar, c cVar) {
            return new g(str, str2, str3, str4, str5, str6, oVar, cVar);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f24372e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return AbstractC3159y.d(this.f24368a, gVar.f24368a) && AbstractC3159y.d(this.f24369b, gVar.f24369b) && AbstractC3159y.d(this.f24370c, gVar.f24370c) && AbstractC3159y.d(this.f24371d, gVar.f24371d) && AbstractC3159y.d(this.f24372e, gVar.f24372e) && AbstractC3159y.d(this.f24373f, gVar.f24373f) && AbstractC3159y.d(this.f24374g, gVar.f24374g) && this.f24375h == gVar.f24375h;
        }

        public final c f() {
            return this.f24375h;
        }

        public int hashCode() {
            String str = this.f24368a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24369b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24370c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f24371d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f24372e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f24373f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            o oVar = this.f24374g;
            int hashCode7 = (hashCode6 + (oVar == null ? 0 : oVar.hashCode())) * 31;
            c cVar = this.f24375h;
            return hashCode7 + (cVar != null ? cVar.hashCode() : 0);
        }

        public final String r() {
            return this.f24369b;
        }

        public String toString() {
            return "Error(charge=" + this.f24368a + ", code=" + this.f24369b + ", declineCode=" + this.f24370c + ", docUrl=" + this.f24371d + ", message=" + this.f24372e + ", param=" + this.f24373f + ", paymentMethod=" + this.f24374g + ", type=" + this.f24375h + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24368a);
            out.writeString(this.f24369b);
            out.writeString(this.f24370c);
            out.writeString(this.f24371d);
            out.writeString(this.f24372e);
            out.writeString(this.f24373f);
            o oVar = this.f24374g;
            if (oVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                oVar.writeToParcel(out, i8);
            }
            c cVar = this.f24375h;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(cVar.name());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements v2.f {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.model.a f24387a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24388b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24389c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24390d;

        /* renamed from: e, reason: collision with root package name */
        private final String f24391e;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new h(com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final h[] newArray(int i8) {
                return new h[i8];
            }
        }

        public h(com.stripe.android.model.a address, String str, String str2, String str3, String str4) {
            AbstractC3159y.i(address, "address");
            this.f24387a = address;
            this.f24388b = str;
            this.f24389c = str2;
            this.f24390d = str3;
            this.f24391e = str4;
        }

        public final com.stripe.android.model.a b() {
            return this.f24387a;
        }

        public final String c() {
            return this.f24389c;
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
            return AbstractC3159y.d(this.f24387a, hVar.f24387a) && AbstractC3159y.d(this.f24388b, hVar.f24388b) && AbstractC3159y.d(this.f24389c, hVar.f24389c) && AbstractC3159y.d(this.f24390d, hVar.f24390d) && AbstractC3159y.d(this.f24391e, hVar.f24391e);
        }

        public int hashCode() {
            int hashCode = this.f24387a.hashCode() * 31;
            String str = this.f24388b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f24389c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24390d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f24391e;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "Shipping(address=" + this.f24387a + ", carrier=" + this.f24388b + ", name=" + this.f24389c + ", phone=" + this.f24390d + ", trackingNumber=" + this.f24391e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            this.f24387a.writeToParcel(out, i8);
            out.writeString(this.f24388b);
            out.writeString(this.f24389c);
            out.writeString(this.f24390d);
            out.writeString(this.f24391e);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class i {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24392a;

        static {
            int[] iArr = new int[StripeIntent.Usage.values().length];
            try {
                iArr[StripeIntent.Usage.f24147c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.Usage.f24148d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StripeIntent.Usage.f24149e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f24392a = iArr;
        }
    }

    public n(String str, List paymentMethodTypes, Long l8, long j8, a aVar, b captureMethod, String str2, e confirmationMethod, String str3, long j9, String str4, String str5, boolean z8, o oVar, String str6, String str7, StripeIntent.Status status, StripeIntent.Usage usage, g gVar, h hVar, List unactivatedPaymentMethods, List linkFundingSources, StripeIntent.a aVar2, String str8) {
        AbstractC3159y.i(paymentMethodTypes, "paymentMethodTypes");
        AbstractC3159y.i(captureMethod, "captureMethod");
        AbstractC3159y.i(confirmationMethod, "confirmationMethod");
        AbstractC3159y.i(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        AbstractC3159y.i(linkFundingSources, "linkFundingSources");
        this.f24314a = str;
        this.f24315b = paymentMethodTypes;
        this.f24316c = l8;
        this.f24317d = j8;
        this.f24318e = aVar;
        this.f24319f = captureMethod;
        this.f24320g = str2;
        this.f24321h = confirmationMethod;
        this.f24322i = str3;
        this.f24323j = j9;
        this.f24324k = str4;
        this.f24325l = str5;
        this.f24326m = z8;
        this.f24327n = oVar;
        this.f24328o = str6;
        this.f24329p = str7;
        this.f24330q = status;
        this.f24331r = usage;
        this.f24332s = gVar;
        this.f24333t = hVar;
        this.f24334u = unactivatedPaymentMethods;
        this.f24335v = linkFundingSources;
        this.f24336w = aVar2;
        this.f24337x = str8;
    }

    private final boolean n(String str) {
        JSONObject optJSONObject;
        String str2 = this.f24337x;
        if (str2 == null || (optJSONObject = new JSONObject(str2).optJSONObject(str)) == null) {
            return false;
        }
        return optJSONObject.has("setup_future_usage");
    }

    private final boolean s() {
        int i8;
        StripeIntent.Usage usage = this.f24331r;
        if (usage == null) {
            i8 = -1;
        } else {
            i8 = i.f24392a[usage.ordinal()];
        }
        if (i8 == -1) {
            return false;
        }
        if (i8 != 1 && i8 != 2) {
            if (i8 == 3) {
                return false;
            }
            throw new L5.p();
        }
        return true;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List D() {
        return this.f24334u;
    }

    public final StripeIntent.Usage E() {
        return this.f24331r;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List H() {
        return this.f24335v;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean J() {
        return AbstractC1246t.d0(a0.i(StripeIntent.Status.f24137d, StripeIntent.Status.f24142i, StripeIntent.Status.f24141h), getStatus());
    }

    public final String K() {
        return this.f24324k;
    }

    @Override // com.stripe.android.model.StripeIntent
    public Map N() {
        Map b8;
        String str = this.f24337x;
        if (str == null || (b8 = v2.e.f38770a.b(new JSONObject(str))) == null) {
            return Q.h();
        }
        return b8;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean a() {
        return this.f24326m;
    }

    public final n b(String str, List paymentMethodTypes, Long l8, long j8, a aVar, b captureMethod, String str2, e confirmationMethod, String str3, long j9, String str4, String str5, boolean z8, o oVar, String str6, String str7, StripeIntent.Status status, StripeIntent.Usage usage, g gVar, h hVar, List unactivatedPaymentMethods, List linkFundingSources, StripeIntent.a aVar2, String str8) {
        AbstractC3159y.i(paymentMethodTypes, "paymentMethodTypes");
        AbstractC3159y.i(captureMethod, "captureMethod");
        AbstractC3159y.i(confirmationMethod, "confirmationMethod");
        AbstractC3159y.i(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        AbstractC3159y.i(linkFundingSources, "linkFundingSources");
        return new n(str, paymentMethodTypes, l8, j8, aVar, captureMethod, str2, confirmationMethod, str3, j9, str4, str5, z8, oVar, str6, str7, status, usage, gVar, hVar, unactivatedPaymentMethods, linkFundingSources, aVar2, str8);
    }

    @Override // com.stripe.android.model.StripeIntent
    public String d() {
        return this.f24320g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Long e() {
        return this.f24316c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return AbstractC3159y.d(this.f24314a, nVar.f24314a) && AbstractC3159y.d(this.f24315b, nVar.f24315b) && AbstractC3159y.d(this.f24316c, nVar.f24316c) && this.f24317d == nVar.f24317d && this.f24318e == nVar.f24318e && this.f24319f == nVar.f24319f && AbstractC3159y.d(this.f24320g, nVar.f24320g) && this.f24321h == nVar.f24321h && AbstractC3159y.d(this.f24322i, nVar.f24322i) && this.f24323j == nVar.f24323j && AbstractC3159y.d(this.f24324k, nVar.f24324k) && AbstractC3159y.d(this.f24325l, nVar.f24325l) && this.f24326m == nVar.f24326m && AbstractC3159y.d(this.f24327n, nVar.f24327n) && AbstractC3159y.d(this.f24328o, nVar.f24328o) && AbstractC3159y.d(this.f24329p, nVar.f24329p) && this.f24330q == nVar.f24330q && this.f24331r == nVar.f24331r && AbstractC3159y.d(this.f24332s, nVar.f24332s) && AbstractC3159y.d(this.f24333t, nVar.f24333t) && AbstractC3159y.d(this.f24334u, nVar.f24334u) && AbstractC3159y.d(this.f24335v, nVar.f24335v) && AbstractC3159y.d(this.f24336w, nVar.f24336w) && AbstractC3159y.d(this.f24337x, nVar.f24337x);
    }

    public final e f() {
        return this.f24321h;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List g() {
        return this.f24315b;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getId() {
        return this.f24314a;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.Status getStatus() {
        return this.f24330q;
    }

    public int hashCode() {
        String str = this.f24314a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f24315b.hashCode()) * 31;
        Long l8 = this.f24316c;
        int hashCode2 = (((hashCode + (l8 == null ? 0 : l8.hashCode())) * 31) + androidx.collection.a.a(this.f24317d)) * 31;
        a aVar = this.f24318e;
        int hashCode3 = (((hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f24319f.hashCode()) * 31;
        String str2 = this.f24320g;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f24321h.hashCode()) * 31;
        String str3 = this.f24322i;
        int hashCode5 = (((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + androidx.collection.a.a(this.f24323j)) * 31;
        String str4 = this.f24324k;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f24325l;
        int hashCode7 = (((hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f24326m)) * 31;
        o oVar = this.f24327n;
        int hashCode8 = (hashCode7 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str6 = this.f24328o;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f24329p;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        StripeIntent.Status status = this.f24330q;
        int hashCode11 = (hashCode10 + (status == null ? 0 : status.hashCode())) * 31;
        StripeIntent.Usage usage = this.f24331r;
        int hashCode12 = (hashCode11 + (usage == null ? 0 : usage.hashCode())) * 31;
        g gVar = this.f24332s;
        int hashCode13 = (hashCode12 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        h hVar = this.f24333t;
        int hashCode14 = (((((hashCode13 + (hVar == null ? 0 : hVar.hashCode())) * 31) + this.f24334u.hashCode()) * 31) + this.f24335v.hashCode()) * 31;
        StripeIntent.a aVar2 = this.f24336w;
        int hashCode15 = (hashCode14 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str8 = this.f24337x;
        return hashCode15 + (str8 != null ? str8.hashCode() : 0);
    }

    public final g i() {
        return this.f24332s;
    }

    public final boolean j() {
        JSONObject optJSONObject;
        String str = this.f24337x;
        if (str == null || (optJSONObject = new JSONObject(str).optJSONObject("card")) == null) {
            return false;
        }
        return optJSONObject.optBoolean("require_cvc_recollection");
    }

    public final h k() {
        return this.f24333t;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.a l() {
        return this.f24336w;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.NextActionType m() {
        boolean z8;
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
        if (l8 instanceof StripeIntent.a.l) {
            return StripeIntent.NextActionType.f24126j;
        }
        if (l8 instanceof StripeIntent.a.c) {
            return StripeIntent.NextActionType.f24127k;
        }
        if (l8 instanceof StripeIntent.a.b) {
            return StripeIntent.NextActionType.f24123g;
        }
        if (l8 instanceof StripeIntent.a.k) {
            return StripeIntent.NextActionType.f24131o;
        }
        boolean z9 = true;
        if (l8 instanceof StripeIntent.a.C0480a) {
            z8 = true;
        } else {
            z8 = l8 instanceof StripeIntent.a.n;
        }
        if (!z8 && l8 != null) {
            z9 = false;
        }
        if (z9) {
            return null;
        }
        throw new L5.p();
    }

    public final boolean o(String code) {
        AbstractC3159y.i(code, "code");
        if (!s() && !n(code)) {
            return false;
        }
        return true;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String p() {
        return this.f24322i;
    }

    public String toString() {
        return "PaymentIntent(id=" + this.f24314a + ", paymentMethodTypes=" + this.f24315b + ", amount=" + this.f24316c + ", canceledAt=" + this.f24317d + ", cancellationReason=" + this.f24318e + ", captureMethod=" + this.f24319f + ", clientSecret=" + this.f24320g + ", confirmationMethod=" + this.f24321h + ", countryCode=" + this.f24322i + ", created=" + this.f24323j + ", currency=" + this.f24324k + ", description=" + this.f24325l + ", isLiveMode=" + this.f24326m + ", paymentMethod=" + this.f24327n + ", paymentMethodId=" + this.f24328o + ", receiptEmail=" + this.f24329p + ", status=" + this.f24330q + ", setupFutureUsage=" + this.f24331r + ", lastPaymentError=" + this.f24332s + ", shipping=" + this.f24333t + ", unactivatedPaymentMethods=" + this.f24334u + ", linkFundingSources=" + this.f24335v + ", nextActionData=" + this.f24336w + ", paymentMethodOptionsJsonString=" + this.f24337x + ")";
    }

    @Override // com.stripe.android.model.StripeIntent
    public o v() {
        return this.f24327n;
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
        out.writeString(this.f24314a);
        out.writeStringList(this.f24315b);
        Long l8 = this.f24316c;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
        out.writeLong(this.f24317d);
        a aVar = this.f24318e;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(aVar.name());
        }
        out.writeString(this.f24319f.name());
        out.writeString(this.f24320g);
        out.writeString(this.f24321h.name());
        out.writeString(this.f24322i);
        out.writeLong(this.f24323j);
        out.writeString(this.f24324k);
        out.writeString(this.f24325l);
        out.writeInt(this.f24326m ? 1 : 0);
        o oVar = this.f24327n;
        if (oVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            oVar.writeToParcel(out, i8);
        }
        out.writeString(this.f24328o);
        out.writeString(this.f24329p);
        StripeIntent.Status status = this.f24330q;
        if (status == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(status.name());
        }
        StripeIntent.Usage usage = this.f24331r;
        if (usage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(usage.name());
        }
        g gVar = this.f24332s;
        if (gVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            gVar.writeToParcel(out, i8);
        }
        h hVar = this.f24333t;
        if (hVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            hVar.writeToParcel(out, i8);
        }
        out.writeStringList(this.f24334u);
        out.writeStringList(this.f24335v);
        out.writeParcelable(this.f24336w, i8);
        out.writeString(this.f24337x);
    }

    public /* synthetic */ n(String str, List list, Long l8, long j8, a aVar, b bVar, String str2, e eVar, String str3, long j9, String str4, String str5, boolean z8, o oVar, String str6, String str7, StripeIntent.Status status, StripeIntent.Usage usage, g gVar, h hVar, List list2, List list3, StripeIntent.a aVar2, String str8, int i8, AbstractC3151p abstractC3151p) {
        this(str, list, l8, (i8 & 8) != 0 ? 0L : j8, (i8 & 16) != 0 ? null : aVar, (i8 & 32) != 0 ? b.f24350c : bVar, str2, (i8 & 128) != 0 ? e.f24361c : eVar, str3, j9, str4, (i8 & 2048) != 0 ? null : str5, z8, (i8 & 8192) != 0 ? null : oVar, (i8 & 16384) != 0 ? null : str6, (32768 & i8) != 0 ? null : str7, (65536 & i8) != 0 ? null : status, (131072 & i8) != 0 ? null : usage, (262144 & i8) != 0 ? null : gVar, (524288 & i8) != 0 ? null : hVar, list2, (2097152 & i8) != 0 ? AbstractC1246t.m() : list3, (4194304 & i8) != 0 ? null : aVar2, (i8 & 8388608) != 0 ? null : str8);
    }
}
