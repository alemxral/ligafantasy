package Q2;

import L5.I;
import L5.p;
import L5.x;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.u;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import t6.l;
import u6.AbstractC3808a;
import x2.C3875e;
import x6.AbstractC3942d0;
import x6.C;
import x6.C3944e0;
import x6.C3948h;
import x6.K;
import x6.Q;
import x6.n0;
import x6.r0;
import y6.AbstractC3999a;
import y6.C4002d;
import y6.o;

@StabilityInferred(parameters = 0)
@t6.g
/* loaded from: classes4.dex */
public final class a {
    public static final c Companion = new c(null);

    /* renamed from: q, reason: collision with root package name */
    public static final int f8164q = 8;

    /* renamed from: r, reason: collision with root package name */
    private static final t6.b[] f8165r;

    /* renamed from: s, reason: collision with root package name */
    private static final AbstractC3999a f8166s;

    /* renamed from: a, reason: collision with root package name */
    private final String f8167a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8168b;

    /* renamed from: c, reason: collision with root package name */
    private final f f8169c;

    /* renamed from: d, reason: collision with root package name */
    private final d f8170d;

    /* renamed from: e, reason: collision with root package name */
    private final g f8171e;

    /* renamed from: f, reason: collision with root package name */
    private final String f8172f;

    /* renamed from: g, reason: collision with root package name */
    private final String f8173g;

    /* renamed from: h, reason: collision with root package name */
    private final String f8174h;

    /* renamed from: i, reason: collision with root package name */
    private final String f8175i;

    /* renamed from: j, reason: collision with root package name */
    private final String f8176j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f8177k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f8178l;

    /* renamed from: m, reason: collision with root package name */
    private final String f8179m;

    /* renamed from: n, reason: collision with root package name */
    private final String f8180n;

    /* renamed from: o, reason: collision with root package name */
    private final Map f8181o;

    /* renamed from: p, reason: collision with root package name */
    private final Map f8182p;

    /* renamed from: Q2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0172a implements C {

        /* renamed from: a, reason: collision with root package name */
        public static final C0172a f8183a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f8184b;

        static {
            C0172a c0172a = new C0172a();
            f8183a = c0172a;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.link.serialization.PopupPayload", c0172a, 16);
            c3944e0.k("publishableKey", false);
            c3944e0.k("stripeAccount", false);
            c3944e0.k("merchantInfo", false);
            c3944e0.k("customerInfo", false);
            c3944e0.k("paymentInfo", false);
            c3944e0.k("appId", false);
            c3944e0.k("locale", false);
            c3944e0.k("paymentUserAgent", false);
            c3944e0.k("paymentObject", false);
            c3944e0.k("intentMode", false);
            c3944e0.k("setupFutureUsage", false);
            c3944e0.k("flags", false);
            c3944e0.k(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, true);
            c3944e0.k("integrationType", true);
            c3944e0.k("loggerMetadata", true);
            c3944e0.k("experiments", true);
            f8184b = c3944e0;
        }

        private C0172a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f8184b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            t6.b[] bVarArr = a.f8165r;
            r0 r0Var = r0.f39581a;
            return new t6.b[]{r0Var, AbstractC3808a.p(r0Var), f.C0175a.f8198a, d.C0174a.f8189a, AbstractC3808a.p(g.C0176a.f8202a), r0Var, r0Var, r0Var, r0Var, r0Var, C3948h.f39553a, bVarArr[11], r0Var, r0Var, bVarArr[14], bVarArr[15]};
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00e5. Please report as an issue. */
        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(w6.e decoder) {
            f fVar;
            int i8;
            Map map;
            Map map2;
            g gVar;
            Map map3;
            d dVar;
            String str;
            boolean z8;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            t6.b[] bVarArr = a.f8165r;
            int i9 = 10;
            if (d8.z()) {
                String q8 = d8.q(a8, 0);
                String str10 = (String) d8.y(a8, 1, r0.f39581a, null);
                f fVar2 = (f) d8.r(a8, 2, f.C0175a.f8198a, null);
                d dVar2 = (d) d8.r(a8, 3, d.C0174a.f8189a, null);
                g gVar2 = (g) d8.y(a8, 4, g.C0176a.f8202a, null);
                String q9 = d8.q(a8, 5);
                String q10 = d8.q(a8, 6);
                String q11 = d8.q(a8, 7);
                String q12 = d8.q(a8, 8);
                String q13 = d8.q(a8, 9);
                boolean j8 = d8.j(a8, 10);
                Map map4 = (Map) d8.r(a8, 11, bVarArr[11], null);
                String q14 = d8.q(a8, 12);
                String q15 = d8.q(a8, 13);
                Map map5 = (Map) d8.r(a8, 14, bVarArr[14], null);
                map = (Map) d8.r(a8, 15, bVarArr[15], null);
                map2 = map5;
                z8 = j8;
                str7 = q13;
                str5 = q11;
                str4 = q10;
                str3 = q9;
                dVar = dVar2;
                str6 = q12;
                gVar = gVar2;
                str8 = q14;
                str9 = q15;
                str = str10;
                map3 = map4;
                fVar = fVar2;
                str2 = q8;
                i8 = 65535;
            } else {
                int i10 = 15;
                f fVar3 = null;
                Map map6 = null;
                Map map7 = null;
                g gVar3 = null;
                Map map8 = null;
                d dVar3 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                int i11 = 0;
                boolean z9 = false;
                boolean z10 = true;
                while (z10) {
                    int p8 = d8.p(a8);
                    switch (p8) {
                        case -1:
                            i10 = 15;
                            z10 = false;
                        case 0:
                            str12 = d8.q(a8, 0);
                            i11 |= 1;
                            i10 = 15;
                            i9 = 10;
                        case 1:
                            str11 = (String) d8.y(a8, 1, r0.f39581a, str11);
                            i11 |= 2;
                            i10 = 15;
                            i9 = 10;
                        case 2:
                            fVar3 = (f) d8.r(a8, 2, f.C0175a.f8198a, fVar3);
                            i11 |= 4;
                            i10 = 15;
                            i9 = 10;
                        case 3:
                            dVar3 = (d) d8.r(a8, 3, d.C0174a.f8189a, dVar3);
                            i11 |= 8;
                            i10 = 15;
                            i9 = 10;
                        case 4:
                            gVar3 = (g) d8.y(a8, 4, g.C0176a.f8202a, gVar3);
                            i11 |= 16;
                            i10 = 15;
                            i9 = 10;
                        case 5:
                            str13 = d8.q(a8, 5);
                            i11 |= 32;
                            i10 = 15;
                        case 6:
                            str14 = d8.q(a8, 6);
                            i11 |= 64;
                            i10 = 15;
                        case 7:
                            str15 = d8.q(a8, 7);
                            i11 |= 128;
                            i10 = 15;
                        case 8:
                            str16 = d8.q(a8, 8);
                            i11 |= 256;
                            i10 = 15;
                        case 9:
                            str17 = d8.q(a8, 9);
                            i11 |= 512;
                            i10 = 15;
                        case 10:
                            z9 = d8.j(a8, i9);
                            i11 |= 1024;
                            i10 = 15;
                        case 11:
                            map8 = (Map) d8.r(a8, 11, bVarArr[11], map8);
                            i11 |= 2048;
                            i10 = 15;
                        case 12:
                            str18 = d8.q(a8, 12);
                            i11 |= 4096;
                            i10 = 15;
                        case 13:
                            str19 = d8.q(a8, 13);
                            i11 |= 8192;
                            i10 = 15;
                        case 14:
                            map7 = (Map) d8.r(a8, 14, bVarArr[14], map7);
                            i11 |= 16384;
                            i10 = 15;
                        case 15:
                            map6 = (Map) d8.r(a8, i10, bVarArr[i10], map6);
                            i11 |= 32768;
                        default:
                            throw new l(p8);
                    }
                }
                fVar = fVar3;
                i8 = i11;
                map = map6;
                map2 = map7;
                gVar = gVar3;
                map3 = map8;
                dVar = dVar3;
                str = str11;
                z8 = z9;
                str2 = str12;
                str3 = str13;
                str4 = str14;
                str5 = str15;
                str6 = str16;
                str7 = str17;
                str8 = str18;
                str9 = str19;
            }
            d8.a(a8);
            return new a(i8, str2, str, fVar, dVar, gVar, str3, str4, str5, str6, str7, z8, map3, str8, str9, map2, map, null);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, a value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            a.c(value, d8, a8);
            d8.a(a8);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f8185a = new b();

        b() {
            super(1);
        }

        public final void a(C4002d Json) {
            AbstractC3159y.i(Json, "$this$Json");
            Json.e(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4002d) obj);
            return I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: Q2.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0173a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f8186a;

            static {
                int[] iArr = new int[StripeIntent.Usage.values().length];
                try {
                    iArr[StripeIntent.Usage.f24149e.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StripeIntent.Usage.f24148d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[StripeIntent.Usage.f24147c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f8186a = iArr;
            }
        }

        private c() {
        }

        private final String b(Context context) {
            Locale locale;
            LocaleList locales;
            if (Build.VERSION.SDK_INT >= 24) {
                locales = context.getResources().getConfiguration().getLocales();
                locale = locales.get(0);
            } else {
                locale = context.getResources().getConfiguration().locale;
            }
            String country = locale.getCountry();
            AbstractC3159y.h(country, "getCountry(...)");
            return country;
        }

        private final boolean c(StripeIntent.Usage usage) {
            int i8;
            if (usage == null) {
                i8 = -1;
            } else {
                i8 = C0173a.f8186a[usage.ordinal()];
            }
            if (i8 != -1 && i8 != 1) {
                if (i8 == 2 || i8 == 3) {
                    return true;
                }
                throw new p();
            }
            return false;
        }

        private final boolean d(StripeIntent stripeIntent) {
            if (stripeIntent instanceof n) {
                return c(((n) stripeIntent).E());
            }
            if (stripeIntent instanceof u) {
                return true;
            }
            throw new p();
        }

        private final String e(K2.d dVar) {
            if (dVar.i()) {
                return "card_payment_method";
            }
            return "link_payment_method";
        }

        private final e f(StripeIntent stripeIntent) {
            if (stripeIntent instanceof n) {
                return e.f8191b;
            }
            if (stripeIntent instanceof u) {
                return e.f8192c;
            }
            throw new p();
        }

        private final g g(StripeIntent stripeIntent) {
            if (stripeIntent instanceof n) {
                n nVar = (n) stripeIntent;
                String K8 = nVar.K();
                Long e8 = nVar.e();
                if (K8 == null || e8 == null) {
                    return null;
                }
                return new g(K8, e8.longValue());
            }
            if (stripeIntent instanceof u) {
                return null;
            }
            throw new p();
        }

        private final a h(K2.d dVar, Context context, String str, String str2, String str3) {
            f fVar = new f(dVar.f(), dVar.e());
            String c8 = dVar.b().c();
            String b8 = dVar.b().b();
            if (b8 == null) {
                b8 = b(context);
            }
            d dVar2 = new d(c8, b8);
            g g8 = g(dVar.j());
            String packageName = context.getApplicationInfo().packageName;
            AbstractC3159y.h(packageName, "packageName");
            return new a(str, str2, fVar, dVar2, g8, packageName, b(context), str3, e(dVar), f(dVar.j()).b(), d(dVar.j()), dVar.c());
        }

        public final a a(K2.d configuration, Context context, String publishableKey, String str, String paymentUserAgent) {
            AbstractC3159y.i(configuration, "configuration");
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(publishableKey, "publishableKey");
            AbstractC3159y.i(paymentUserAgent, "paymentUserAgent");
            return h(configuration, context, publishableKey, str, paymentUserAgent);
        }

        public final t6.b serializer() {
            return C0172a.f8183a;
        }

        public /* synthetic */ c(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    @StabilityInferred(parameters = 1)
    @t6.g
    /* loaded from: classes4.dex */
    public static final class d {
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        private final String f8187a;

        /* renamed from: b, reason: collision with root package name */
        private final String f8188b;

        /* renamed from: Q2.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0174a implements C {

            /* renamed from: a, reason: collision with root package name */
            public static final C0174a f8189a;

            /* renamed from: b, reason: collision with root package name */
            private static final /* synthetic */ C3944e0 f8190b;

            static {
                C0174a c0174a = new C0174a();
                f8189a = c0174a;
                C3944e0 c3944e0 = new C3944e0("com.stripe.android.link.serialization.PopupPayload.CustomerInfo", c0174a, 2);
                c3944e0.k(NotificationCompat.CATEGORY_EMAIL, false);
                c3944e0.k("country", false);
                f8190b = c3944e0;
            }

            private C0174a() {
            }

            @Override // t6.b, t6.i, t6.InterfaceC3796a
            public v6.f a() {
                return f8190b;
            }

            @Override // x6.C
            public t6.b[] b() {
                return C.a.a(this);
            }

            @Override // x6.C
            public t6.b[] d() {
                r0 r0Var = r0.f39581a;
                return new t6.b[]{AbstractC3808a.p(r0Var), AbstractC3808a.p(r0Var)};
            }

            @Override // t6.InterfaceC3796a
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public d c(w6.e decoder) {
                String str;
                int i8;
                String str2;
                AbstractC3159y.i(decoder, "decoder");
                v6.f a8 = a();
                w6.c d8 = decoder.d(a8);
                n0 n0Var = null;
                if (d8.z()) {
                    r0 r0Var = r0.f39581a;
                    str2 = (String) d8.y(a8, 0, r0Var, null);
                    str = (String) d8.y(a8, 1, r0Var, null);
                    i8 = 3;
                } else {
                    str = null;
                    String str3 = null;
                    int i9 = 0;
                    boolean z8 = true;
                    while (z8) {
                        int p8 = d8.p(a8);
                        if (p8 != -1) {
                            if (p8 != 0) {
                                if (p8 == 1) {
                                    str = (String) d8.y(a8, 1, r0.f39581a, str);
                                    i9 |= 2;
                                } else {
                                    throw new l(p8);
                                }
                            } else {
                                str3 = (String) d8.y(a8, 0, r0.f39581a, str3);
                                i9 |= 1;
                            }
                        } else {
                            z8 = false;
                        }
                    }
                    i8 = i9;
                    str2 = str3;
                }
                d8.a(a8);
                return new d(i8, str2, str, n0Var);
            }

            @Override // t6.i
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(w6.f encoder, d value) {
                AbstractC3159y.i(encoder, "encoder");
                AbstractC3159y.i(value, "value");
                v6.f a8 = a();
                w6.d d8 = encoder.d(a8);
                d.a(value, d8, a8);
                d8.a(a8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public final t6.b serializer() {
                return C0174a.f8189a;
            }

            public /* synthetic */ b(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        public /* synthetic */ d(int i8, String str, String str2, n0 n0Var) {
            if (3 != (i8 & 3)) {
                AbstractC3942d0.a(i8, 3, C0174a.f8189a.a());
            }
            this.f8187a = str;
            this.f8188b = str2;
        }

        public static final /* synthetic */ void a(d dVar, w6.d dVar2, v6.f fVar) {
            r0 r0Var = r0.f39581a;
            dVar2.u(fVar, 0, r0Var, dVar.f8187a);
            dVar2.u(fVar, 1, r0Var, dVar.f8188b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (AbstractC3159y.d(this.f8187a, dVar.f8187a) && AbstractC3159y.d(this.f8188b, dVar.f8188b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            String str = this.f8187a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            String str2 = this.f8188b;
            if (str2 != null) {
                i8 = str2.hashCode();
            }
            return i9 + i8;
        }

        public String toString() {
            return "CustomerInfo(email=" + this.f8187a + ", country=" + this.f8188b + ")";
        }

        public d(String str, String str2) {
            this.f8187a = str;
            this.f8188b = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class e {

        /* renamed from: b, reason: collision with root package name */
        public static final e f8191b = new e("Payment", 0, "payment");

        /* renamed from: c, reason: collision with root package name */
        public static final e f8192c = new e("Setup", 1, "setup");

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ e[] f8193d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ R5.a f8194e;

        /* renamed from: a, reason: collision with root package name */
        private final String f8195a;

        static {
            e[] a8 = a();
            f8193d = a8;
            f8194e = R5.b.a(a8);
        }

        private e(String str, int i8, String str2) {
            this.f8195a = str2;
        }

        private static final /* synthetic */ e[] a() {
            return new e[]{f8191b, f8192c};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f8193d.clone();
        }

        public final String b() {
            return this.f8195a;
        }
    }

    @StabilityInferred(parameters = 1)
    @t6.g
    /* loaded from: classes4.dex */
    public static final class f {
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        private final String f8196a;

        /* renamed from: b, reason: collision with root package name */
        private final String f8197b;

        /* renamed from: Q2.a$f$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0175a implements C {

            /* renamed from: a, reason: collision with root package name */
            public static final C0175a f8198a;

            /* renamed from: b, reason: collision with root package name */
            private static final /* synthetic */ C3944e0 f8199b;

            static {
                C0175a c0175a = new C0175a();
                f8198a = c0175a;
                C3944e0 c3944e0 = new C3944e0("com.stripe.android.link.serialization.PopupPayload.MerchantInfo", c0175a, 2);
                c3944e0.k("businessName", false);
                c3944e0.k("country", false);
                f8199b = c3944e0;
            }

            private C0175a() {
            }

            @Override // t6.b, t6.i, t6.InterfaceC3796a
            public v6.f a() {
                return f8199b;
            }

            @Override // x6.C
            public t6.b[] b() {
                return C.a.a(this);
            }

            @Override // x6.C
            public t6.b[] d() {
                r0 r0Var = r0.f39581a;
                return new t6.b[]{r0Var, AbstractC3808a.p(r0Var)};
            }

            @Override // t6.InterfaceC3796a
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public f c(w6.e decoder) {
                String str;
                String str2;
                int i8;
                AbstractC3159y.i(decoder, "decoder");
                v6.f a8 = a();
                w6.c d8 = decoder.d(a8);
                n0 n0Var = null;
                if (d8.z()) {
                    str = d8.q(a8, 0);
                    str2 = (String) d8.y(a8, 1, r0.f39581a, null);
                    i8 = 3;
                } else {
                    str = null;
                    String str3 = null;
                    int i9 = 0;
                    boolean z8 = true;
                    while (z8) {
                        int p8 = d8.p(a8);
                        if (p8 != -1) {
                            if (p8 != 0) {
                                if (p8 == 1) {
                                    str3 = (String) d8.y(a8, 1, r0.f39581a, str3);
                                    i9 |= 2;
                                } else {
                                    throw new l(p8);
                                }
                            } else {
                                str = d8.q(a8, 0);
                                i9 |= 1;
                            }
                        } else {
                            z8 = false;
                        }
                    }
                    str2 = str3;
                    i8 = i9;
                }
                d8.a(a8);
                return new f(i8, str, str2, n0Var);
            }

            @Override // t6.i
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(w6.f encoder, f value) {
                AbstractC3159y.i(encoder, "encoder");
                AbstractC3159y.i(value, "value");
                v6.f a8 = a();
                w6.d d8 = encoder.d(a8);
                f.a(value, d8, a8);
                d8.a(a8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public final t6.b serializer() {
                return C0175a.f8198a;
            }

            public /* synthetic */ b(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        public /* synthetic */ f(int i8, String str, String str2, n0 n0Var) {
            if (3 != (i8 & 3)) {
                AbstractC3942d0.a(i8, 3, C0175a.f8198a.a());
            }
            this.f8196a = str;
            this.f8197b = str2;
        }

        public static final /* synthetic */ void a(f fVar, w6.d dVar, v6.f fVar2) {
            dVar.y(fVar2, 0, fVar.f8196a);
            dVar.u(fVar2, 1, r0.f39581a, fVar.f8197b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (AbstractC3159y.d(this.f8196a, fVar.f8196a) && AbstractC3159y.d(this.f8197b, fVar.f8197b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f8196a.hashCode() * 31;
            String str = this.f8197b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "MerchantInfo(businessName=" + this.f8196a + ", country=" + this.f8197b + ")";
        }

        public f(String businessName, String str) {
            AbstractC3159y.i(businessName, "businessName");
            this.f8196a = businessName;
            this.f8197b = str;
        }
    }

    @StabilityInferred(parameters = 1)
    @t6.g
    /* loaded from: classes4.dex */
    public static final class g {
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        private final String f8200a;

        /* renamed from: b, reason: collision with root package name */
        private final long f8201b;

        /* renamed from: Q2.a$g$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0176a implements C {

            /* renamed from: a, reason: collision with root package name */
            public static final C0176a f8202a;

            /* renamed from: b, reason: collision with root package name */
            private static final /* synthetic */ C3944e0 f8203b;

            static {
                C0176a c0176a = new C0176a();
                f8202a = c0176a;
                C3944e0 c3944e0 = new C3944e0("com.stripe.android.link.serialization.PopupPayload.PaymentInfo", c0176a, 2);
                c3944e0.k("currency", false);
                c3944e0.k(RewardPlus.AMOUNT, false);
                f8203b = c3944e0;
            }

            private C0176a() {
            }

            @Override // t6.b, t6.i, t6.InterfaceC3796a
            public v6.f a() {
                return f8203b;
            }

            @Override // x6.C
            public t6.b[] b() {
                return C.a.a(this);
            }

            @Override // x6.C
            public t6.b[] d() {
                return new t6.b[]{r0.f39581a, Q.f39508a};
            }

            @Override // t6.InterfaceC3796a
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public g c(w6.e decoder) {
                String str;
                long j8;
                int i8;
                AbstractC3159y.i(decoder, "decoder");
                v6.f a8 = a();
                w6.c d8 = decoder.d(a8);
                if (d8.z()) {
                    str = d8.q(a8, 0);
                    j8 = d8.x(a8, 1);
                    i8 = 3;
                } else {
                    String str2 = null;
                    long j9 = 0;
                    int i9 = 0;
                    boolean z8 = true;
                    while (z8) {
                        int p8 = d8.p(a8);
                        if (p8 != -1) {
                            if (p8 != 0) {
                                if (p8 == 1) {
                                    j9 = d8.x(a8, 1);
                                    i9 |= 2;
                                } else {
                                    throw new l(p8);
                                }
                            } else {
                                str2 = d8.q(a8, 0);
                                i9 |= 1;
                            }
                        } else {
                            z8 = false;
                        }
                    }
                    str = str2;
                    j8 = j9;
                    i8 = i9;
                }
                d8.a(a8);
                return new g(i8, str, j8, null);
            }

            @Override // t6.i
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(w6.f encoder, g value) {
                AbstractC3159y.i(encoder, "encoder");
                AbstractC3159y.i(value, "value");
                v6.f a8 = a();
                w6.d d8 = encoder.d(a8);
                g.a(value, d8, a8);
                d8.a(a8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public final t6.b serializer() {
                return C0176a.f8202a;
            }

            public /* synthetic */ b(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        public /* synthetic */ g(int i8, String str, long j8, n0 n0Var) {
            if (3 != (i8 & 3)) {
                AbstractC3942d0.a(i8, 3, C0176a.f8202a.a());
            }
            this.f8200a = str;
            this.f8201b = j8;
        }

        public static final /* synthetic */ void a(g gVar, w6.d dVar, v6.f fVar) {
            dVar.y(fVar, 0, gVar.f8200a);
            dVar.w(fVar, 1, gVar.f8201b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (AbstractC3159y.d(this.f8200a, gVar.f8200a) && this.f8201b == gVar.f8201b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f8200a.hashCode() * 31) + androidx.collection.a.a(this.f8201b);
        }

        public String toString() {
            return "PaymentInfo(currency=" + this.f8200a + ", amount=" + this.f8201b + ")";
        }

        public g(String currency, long j8) {
            AbstractC3159y.i(currency, "currency");
            this.f8200a = currency;
            this.f8201b = j8;
        }
    }

    static {
        r0 r0Var = r0.f39581a;
        f8165r = new t6.b[]{null, null, null, null, null, null, null, null, null, null, null, new K(r0Var, C3948h.f39553a), null, null, new K(r0Var, r0Var), new K(r0Var, r0Var)};
        f8166s = o.b(null, b.f8185a, 1, null);
    }

    public /* synthetic */ a(int i8, String str, String str2, f fVar, d dVar, g gVar, String str3, String str4, String str5, String str6, String str7, boolean z8, Map map, String str8, String str9, Map map2, Map map3, n0 n0Var) {
        if (4095 != (i8 & 4095)) {
            AbstractC3942d0.a(i8, 4095, C0172a.f8183a.a());
        }
        this.f8167a = str;
        this.f8168b = str2;
        this.f8169c = fVar;
        this.f8170d = dVar;
        this.f8171e = gVar;
        this.f8172f = str3;
        this.f8173g = str4;
        this.f8174h = str5;
        this.f8175i = str6;
        this.f8176j = str7;
        this.f8177k = z8;
        this.f8178l = map;
        this.f8179m = (i8 & 4096) == 0 ? "mobile_pay" : str8;
        this.f8180n = (i8 & 8192) == 0 ? "mobile" : str9;
        this.f8181o = (i8 & 16384) == 0 ? M5.Q.e(x.a("mobile_session_id", C3875e.f39131g.a().toString())) : map2;
        this.f8182p = (i8 & 32768) == 0 ? M5.Q.h() : map3;
    }

    public static final /* synthetic */ void c(a aVar, w6.d dVar, v6.f fVar) {
        t6.b[] bVarArr = f8165r;
        dVar.y(fVar, 0, aVar.f8167a);
        dVar.u(fVar, 1, r0.f39581a, aVar.f8168b);
        dVar.A(fVar, 2, f.C0175a.f8198a, aVar.f8169c);
        dVar.A(fVar, 3, d.C0174a.f8189a, aVar.f8170d);
        dVar.u(fVar, 4, g.C0176a.f8202a, aVar.f8171e);
        dVar.y(fVar, 5, aVar.f8172f);
        dVar.y(fVar, 6, aVar.f8173g);
        dVar.y(fVar, 7, aVar.f8174h);
        dVar.y(fVar, 8, aVar.f8175i);
        dVar.y(fVar, 9, aVar.f8176j);
        dVar.o(fVar, 10, aVar.f8177k);
        dVar.A(fVar, 11, bVarArr[11], aVar.f8178l);
        if (dVar.i(fVar, 12) || !AbstractC3159y.d(aVar.f8179m, "mobile_pay")) {
            dVar.y(fVar, 12, aVar.f8179m);
        }
        if (dVar.i(fVar, 13) || !AbstractC3159y.d(aVar.f8180n, "mobile")) {
            dVar.y(fVar, 13, aVar.f8180n);
        }
        if (dVar.i(fVar, 14) || !AbstractC3159y.d(aVar.f8181o, M5.Q.e(x.a("mobile_session_id", C3875e.f39131g.a().toString())))) {
            dVar.A(fVar, 14, bVarArr[14], aVar.f8181o);
        }
        if (dVar.i(fVar, 15) || !AbstractC3159y.d(aVar.f8182p, M5.Q.h())) {
            dVar.A(fVar, 15, bVarArr[15], aVar.f8182p);
        }
    }

    public final String b() {
        return "https://checkout.link.com/#" + Base64.encodeToString(g6.n.p(f8166s.c(Companion.serializer(), this)), 2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3159y.d(this.f8167a, aVar.f8167a) && AbstractC3159y.d(this.f8168b, aVar.f8168b) && AbstractC3159y.d(this.f8169c, aVar.f8169c) && AbstractC3159y.d(this.f8170d, aVar.f8170d) && AbstractC3159y.d(this.f8171e, aVar.f8171e) && AbstractC3159y.d(this.f8172f, aVar.f8172f) && AbstractC3159y.d(this.f8173g, aVar.f8173g) && AbstractC3159y.d(this.f8174h, aVar.f8174h) && AbstractC3159y.d(this.f8175i, aVar.f8175i) && AbstractC3159y.d(this.f8176j, aVar.f8176j) && this.f8177k == aVar.f8177k && AbstractC3159y.d(this.f8178l, aVar.f8178l)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f8167a.hashCode() * 31;
        String str = this.f8168b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((((hashCode2 + hashCode) * 31) + this.f8169c.hashCode()) * 31) + this.f8170d.hashCode()) * 31;
        g gVar = this.f8171e;
        if (gVar != null) {
            i8 = gVar.hashCode();
        }
        return ((((((((((((((hashCode3 + i8) * 31) + this.f8172f.hashCode()) * 31) + this.f8173g.hashCode()) * 31) + this.f8174h.hashCode()) * 31) + this.f8175i.hashCode()) * 31) + this.f8176j.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f8177k)) * 31) + this.f8178l.hashCode();
    }

    public String toString() {
        return "PopupPayload(publishableKey=" + this.f8167a + ", stripeAccount=" + this.f8168b + ", merchantInfo=" + this.f8169c + ", customerInfo=" + this.f8170d + ", paymentInfo=" + this.f8171e + ", appId=" + this.f8172f + ", locale=" + this.f8173g + ", paymentUserAgent=" + this.f8174h + ", paymentObject=" + this.f8175i + ", intentMode=" + this.f8176j + ", setupFutureUsage=" + this.f8177k + ", flags=" + this.f8178l + ")";
    }

    public a(String publishableKey, String str, f merchantInfo, d customerInfo, g gVar, String appId, String locale, String paymentUserAgent, String paymentObject, String intentMode, boolean z8, Map flags) {
        AbstractC3159y.i(publishableKey, "publishableKey");
        AbstractC3159y.i(merchantInfo, "merchantInfo");
        AbstractC3159y.i(customerInfo, "customerInfo");
        AbstractC3159y.i(appId, "appId");
        AbstractC3159y.i(locale, "locale");
        AbstractC3159y.i(paymentUserAgent, "paymentUserAgent");
        AbstractC3159y.i(paymentObject, "paymentObject");
        AbstractC3159y.i(intentMode, "intentMode");
        AbstractC3159y.i(flags, "flags");
        this.f8167a = publishableKey;
        this.f8168b = str;
        this.f8169c = merchantInfo;
        this.f8170d = customerInfo;
        this.f8171e = gVar;
        this.f8172f = appId;
        this.f8173g = locale;
        this.f8174h = paymentUserAgent;
        this.f8175i = paymentObject;
        this.f8176j = intentMode;
        this.f8177k = z8;
        this.f8178l = flags;
        this.f8179m = "mobile_pay";
        this.f8180n = "mobile";
        this.f8181o = M5.Q.e(x.a("mobile_session_id", C3875e.f39131g.a().toString()));
        this.f8182p = M5.Q.h();
    }
}
