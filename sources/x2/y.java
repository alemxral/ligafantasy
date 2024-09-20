package x2;

import M5.AbstractC1246t;
import M5.Q;
import android.os.Build;
import android.system.Os;
import com.mbridge.msdk.foundation.download.Command;
import g6.C2728d;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import r2.C3683c;
import x2.AbstractC3869G;
import x2.j;

/* loaded from: classes4.dex */
public abstract class y {

    /* renamed from: b, reason: collision with root package name */
    public static final d f39247b = new d(null);

    /* renamed from: c, reason: collision with root package name */
    private static final String f39248c;

    /* renamed from: a, reason: collision with root package name */
    private Map f39249a;

    /* loaded from: classes4.dex */
    public static final class a extends y {

        /* renamed from: d, reason: collision with root package name */
        public static final a f39250d = new a();

        /* renamed from: e, reason: collision with root package name */
        private static final String f39251e = y.f39247b.b("AndroidBindings/20.49.0");

        /* renamed from: f, reason: collision with root package name */
        private static final Map f39252f = Q.h();

        private a() {
            super(null);
        }

        @Override // x2.y
        protected Map e() {
            return f39252f;
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof a)) {
                return true;
            }
            return false;
        }

        @Override // x2.y
        protected String g() {
            return f39251e;
        }

        @Override // x2.y
        protected String h() {
            Map d8 = d();
            ArrayList arrayList = new ArrayList(d8.size());
            for (Map.Entry entry : d8.entrySet()) {
                arrayList.add("\"" + ((String) entry.getKey()) + "\":\"" + ((String) entry.getValue()) + "\"");
            }
            return "{" + AbstractC1246t.w0(arrayList, ",", null, null, 0, null, null, 62, null) + "}";
        }

        public int hashCode() {
            return -334358835;
        }

        public String toString() {
            return "Analytics";
        }
    }

    /* loaded from: classes4.dex */
    public static class c extends y {

        /* renamed from: d, reason: collision with root package name */
        private final Function0 f39255d;

        /* renamed from: e, reason: collision with root package name */
        private final C3683c f39256e;

        /* renamed from: f, reason: collision with root package name */
        private final Locale f39257f;

        /* renamed from: g, reason: collision with root package name */
        private final String f39258g;

        /* renamed from: h, reason: collision with root package name */
        private final String f39259h;

        /* renamed from: i, reason: collision with root package name */
        private final C3866D f39260i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 optionsProvider, C3683c c3683c, Locale locale, String apiVersion, String sdkVersion) {
            super(null);
            AbstractC3159y.i(optionsProvider, "optionsProvider");
            AbstractC3159y.i(locale, "locale");
            AbstractC3159y.i(apiVersion, "apiVersion");
            AbstractC3159y.i(sdkVersion, "sdkVersion");
            this.f39255d = optionsProvider;
            this.f39256e = c3683c;
            this.f39257f = locale;
            this.f39258g = apiVersion;
            this.f39259h = sdkVersion;
            this.f39260i = new C3866D(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        }

        private final String i() {
            String languageTag = this.f39257f.toLanguageTag();
            AbstractC3159y.f(languageTag);
            if (!(!g6.n.u(languageTag)) || AbstractC3159y.d(languageTag, com.mbridge.msdk.playercommon.exoplayer2.C.LANGUAGE_UNDETERMINED)) {
                return null;
            }
            return languageTag;
        }

        @Override // x2.y
        protected Map e() {
            Map h8;
            Map map;
            Map map2;
            j.c cVar = (j.c) this.f39255d.invoke();
            Map q8 = Q.q(Q.k(L5.x.a("Accept", "application/json"), L5.x.a("Stripe-Version", this.f39258g), L5.x.a("Authorization", "Bearer " + cVar.e())), this.f39260i.a(this.f39256e));
            if (cVar.f()) {
                h8 = Q.e(L5.x.a("Stripe-Livemode", String.valueOf(true ^ AbstractC3159y.d(Os.getenv("Stripe-Livemode"), "false"))));
            } else {
                h8 = Q.h();
            }
            Map q9 = Q.q(q8, h8);
            String j8 = cVar.j();
            Map map3 = null;
            if (j8 != null) {
                map = Q.e(L5.x.a("Stripe-Account", j8));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            Map q10 = Q.q(q9, map);
            String i8 = cVar.i();
            if (i8 != null) {
                map2 = Q.e(L5.x.a("Idempotency-Key", i8));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = Q.h();
            }
            Map q11 = Q.q(q10, map2);
            String i9 = i();
            if (i9 != null) {
                map3 = Q.e(L5.x.a("Accept-Language", i9));
            }
            if (map3 == null) {
                map3 = Q.h();
            }
            return Q.q(q11, map3);
        }

        @Override // x2.y
        protected String g() {
            String str;
            String b8 = y.f39247b.b(this.f39259h);
            C3683c c3683c = this.f39256e;
            if (c3683c != null) {
                str = c3683c.e();
            } else {
                str = null;
            }
            return AbstractC1246t.w0(AbstractC1246t.r(b8, str), " ", null, null, 0, null, null, 62, null);
        }

        @Override // x2.y
        protected String h() {
            Map d8 = d();
            C3683c c3683c = this.f39256e;
            if (c3683c != null) {
                d8.putAll(c3683c.c());
            }
            ArrayList arrayList = new ArrayList(d8.size());
            for (Map.Entry entry : d8.entrySet()) {
                arrayList.add("\"" + ((String) entry.getKey()) + "\":\"" + ((String) entry.getValue()) + "\"");
            }
            return "{" + AbstractC1246t.w0(arrayList, ",", null, null, 0, null, null, 62, null) + "}";
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {
        private d() {
        }

        public static /* synthetic */ String c(d dVar, String str, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = "AndroidBindings/20.49.0";
            }
            return dVar.b(str);
        }

        public final String a() {
            return y.f39248c;
        }

        public final String b(String sdkVersion) {
            AbstractC3159y.i(sdkVersion, "sdkVersion");
            return "Stripe/v1 " + sdkVersion;
        }

        public /* synthetic */ d(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends y {

        /* renamed from: g, reason: collision with root package name */
        public static final a f39261g = new a(null);

        /* renamed from: d, reason: collision with root package name */
        private final Map f39262d;

        /* renamed from: e, reason: collision with root package name */
        private final String f39263e;

        /* renamed from: f, reason: collision with root package name */
        private Map f39264f;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String guid) {
            super(null);
            AbstractC3159y.i(guid, "guid");
            this.f39262d = Q.e(L5.x.a("Cookie", "m=" + guid));
            d dVar = y.f39247b;
            this.f39263e = dVar.b("AndroidBindings/20.49.0");
            this.f39264f = Q.e(L5.x.a("Content-Type", AbstractC3869G.b.f39111d.b() + "; charset=" + dVar.a()));
        }

        @Override // x2.y
        protected Map e() {
            return this.f39262d;
        }

        @Override // x2.y
        protected Map f() {
            return this.f39264f;
        }

        @Override // x2.y
        protected String g() {
            return this.f39263e;
        }

        @Override // x2.y
        protected String h() {
            Map d8 = d();
            ArrayList arrayList = new ArrayList(d8.size());
            for (Map.Entry entry : d8.entrySet()) {
                arrayList.add("\"" + ((String) entry.getKey()) + "\":\"" + ((String) entry.getValue()) + "\"");
            }
            return "{" + AbstractC1246t.w0(arrayList, ",", null, null, 0, null, null, 62, null) + "}";
        }
    }

    static {
        String name = C2728d.f31279b.name();
        AbstractC3159y.h(name, "name(...)");
        f39248c = name;
    }

    public /* synthetic */ y(AbstractC3151p abstractC3151p) {
        this();
    }

    public final Map b() {
        return Q.q(e(), Q.k(L5.x.a(Command.HTTP_HEADER_USER_AGENT, g()), L5.x.a("Accept-Charset", f39248c), L5.x.a("X-Stripe-User-Agent", h())));
    }

    public final Map c() {
        return f();
    }

    protected final Map d() {
        L5.r a8 = L5.x.a("lang", "kotlin");
        L5.r a9 = L5.x.a("bindings_version", "20.49.0");
        L5.r a10 = L5.x.a("os_version", String.valueOf(Build.VERSION.SDK_INT));
        String str = Build.MANUFACTURER;
        String str2 = Build.BRAND;
        String str3 = Build.MODEL;
        return Q.m(a8, a9, a10, L5.x.a("type", str + "_" + str2 + "_" + str3), L5.x.a("model", str3));
    }

    protected abstract Map e();

    protected Map f() {
        return this.f39249a;
    }

    protected abstract String g();

    protected abstract String h();

    private y() {
        this.f39249a = Q.h();
    }

    /* loaded from: classes4.dex */
    public static final class b extends c {

        /* renamed from: j, reason: collision with root package name */
        private Map f39253j;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j.c f39254a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j.c cVar) {
                super(0);
                this.f39254a = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j.c invoke() {
                return this.f39254a;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ b(x2.j.c r7, r2.C3683c r8, java.util.Locale r9, java.lang.String r10, java.lang.String r11, int r12, kotlin.jvm.internal.AbstractC3151p r13) {
            /*
                r6 = this;
                r13 = r12 & 2
                if (r13 == 0) goto L5
                r8 = 0
            L5:
                r2 = r8
                r8 = r12 & 4
                if (r8 == 0) goto L13
                java.util.Locale r9 = java.util.Locale.getDefault()
                java.lang.String r8 = "getDefault(...)"
                kotlin.jvm.internal.AbstractC3159y.h(r9, r8)
            L13:
                r3 = r9
                r8 = r12 & 8
                if (r8 == 0) goto L22
                r2.b$a r8 = r2.C3682b.f37542c
                r2.b r8 = r8.a()
                java.lang.String r10 = r8.b()
            L22:
                r4 = r10
                r8 = r12 & 16
                if (r8 == 0) goto L29
                java.lang.String r11 = "AndroidBindings/20.49.0"
            L29:
                r5 = r11
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x2.y.b.<init>(x2.j$c, r2.c, java.util.Locale, java.lang.String, java.lang.String, int, kotlin.jvm.internal.p):void");
        }

        @Override // x2.y
        protected Map f() {
            return this.f39253j;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j.c options, C3683c c3683c, Locale locale, String apiVersion, String sdkVersion) {
            super(new a(options), c3683c, locale, apiVersion, sdkVersion);
            AbstractC3159y.i(options, "options");
            AbstractC3159y.i(locale, "locale");
            AbstractC3159y.i(apiVersion, "apiVersion");
            AbstractC3159y.i(sdkVersion, "sdkVersion");
            this.f39253j = Q.e(L5.x.a("Content-Type", AbstractC3869G.b.f39109b.b() + "; charset=" + y.f39247b.a()));
        }
    }
}
