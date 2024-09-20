package m4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import j4.AbstractC3081g;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3351M;
import m4.v0;

/* loaded from: classes4.dex */
public final class Y implements v0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f35287a;

    /* renamed from: b, reason: collision with root package name */
    private final l6.v f35288b;

    /* renamed from: c, reason: collision with root package name */
    private final String f35289c;

    /* renamed from: d, reason: collision with root package name */
    private final a f35290d;

    /* renamed from: e, reason: collision with root package name */
    private final int f35291e;

    /* renamed from: f, reason: collision with root package name */
    private final int f35292f;

    /* renamed from: g, reason: collision with root package name */
    private final String f35293g;

    /* renamed from: h, reason: collision with root package name */
    private final VisualTransformation f35294h;

    /* renamed from: i, reason: collision with root package name */
    private final l6.v f35295i;

    /* loaded from: classes4.dex */
    public static abstract class a {

        /* renamed from: d, reason: collision with root package name */
        public static final b f35296d = new b(null);

        /* renamed from: e, reason: collision with root package name */
        public static final int f35297e = 8;

        /* renamed from: a, reason: collision with root package name */
        private final int f35298a;

        /* renamed from: b, reason: collision with root package name */
        private final int f35299b;

        /* renamed from: c, reason: collision with root package name */
        private final g6.j f35300c;

        /* renamed from: m4.Y$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0799a extends a {

            /* renamed from: f, reason: collision with root package name */
            public static final C0799a f35301f = new C0799a();

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private C0799a() {
                /*
                    r3 = this;
                    g6.j r0 = new g6.j
                    java.lang.String r1 = "[a-zA-Z]\\d[a-zA-Z][\\s-]?\\d[a-zA-Z]\\d"
                    r0.<init>(r1)
                    r1 = 0
                    r2 = 6
                    r3.<init>(r2, r2, r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: m4.Y.a.C0799a.<init>():void");
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public final a a(String country) {
                AbstractC3159y.i(country, "country");
                int hashCode = country.hashCode();
                if (hashCode != 2142) {
                    if (hashCode != 2267) {
                        if (hashCode == 2718 && country.equals("US")) {
                            return e.f35304f;
                        }
                    } else if (country.equals("GB")) {
                        return c.f35302f;
                    }
                } else if (country.equals("CA")) {
                    return C0799a.f35301f;
                }
                return d.f35303f;
            }

            public /* synthetic */ b(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends a {

            /* renamed from: f, reason: collision with root package name */
            public static final c f35302f = new c();

            private c() {
                super(5, 7, new g6.j("^[A-Za-z][A-Za-z0-9]*(?: [A-Za-z0-9]*)?$"), null);
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends a {

            /* renamed from: f, reason: collision with root package name */
            public static final d f35303f = new d();

            private d() {
                super(1, Integer.MAX_VALUE, new g6.j(".*"), null);
            }
        }

        /* loaded from: classes4.dex */
        public static final class e extends a {

            /* renamed from: f, reason: collision with root package name */
            public static final e f35304f = new e();

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private e() {
                /*
                    r3 = this;
                    g6.j r0 = new g6.j
                    java.lang.String r1 = "\\d+"
                    r0.<init>(r1)
                    r1 = 0
                    r2 = 5
                    r3.<init>(r2, r2, r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: m4.Y.a.e.<init>():void");
            }
        }

        public /* synthetic */ a(int i8, int i9, g6.j jVar, AbstractC3151p abstractC3151p) {
            this(i8, i9, jVar);
        }

        public final int a() {
            return this.f35299b;
        }

        public final int b() {
            return this.f35298a;
        }

        public final g6.j c() {
            return this.f35300c;
        }

        private a(int i8, int i9, g6.j jVar) {
            this.f35298a = i8;
            this.f35299b = i9;
            this.f35300c = jVar;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements y0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35306b;

        b(String str) {
            this.f35306b = str;
        }

        @Override // m4.y0
        public boolean a() {
            if (Y.this.f35290d instanceof a.d) {
                if (g6.n.u(this.f35306b)) {
                    return false;
                }
            } else {
                int b8 = Y.this.f35290d.b();
                int a8 = Y.this.f35290d.a();
                int length = this.f35306b.length();
                if (b8 > length || length > a8) {
                    return false;
                }
                if (!Y.this.f35290d.c().e(this.f35306b)) {
                    return false;
                }
            }
            return true;
        }

        @Override // m4.y0
        public boolean b() {
            return g6.n.u(this.f35306b);
        }

        @Override // m4.y0
        public boolean c(boolean z8) {
            if (getError() != null && !z8) {
                return true;
            }
            return false;
        }

        @Override // m4.y0
        public boolean d() {
            if (this.f35306b.length() >= Y.this.f35290d.a()) {
                return true;
            }
            return false;
        }

        @Override // m4.y0
        public C getError() {
            C c8;
            if ((!g6.n.u(this.f35306b)) && !a() && AbstractC3159y.d(Y.this.f35289c, "US")) {
                c8 = new C(AbstractC3081g.f33195v, null, 2, null);
            } else {
                if (!(!g6.n.u(this.f35306b)) || a()) {
                    return null;
                }
                c8 = new C(AbstractC3081g.f33196w, null, 2, null);
            }
            return c8;
        }
    }

    public Y(int i8, l6.v trailingIcon, String country) {
        int m4895getCharactersIUNYP9k;
        int m4922getTextPjHm6EE;
        AbstractC3159y.i(trailingIcon, "trailingIcon");
        AbstractC3159y.i(country, "country");
        this.f35287a = i8;
        this.f35288b = trailingIcon;
        this.f35289c = country;
        a a8 = a.f35296d.a(country);
        this.f35290d = a8;
        a.e eVar = a.e.f35304f;
        if (AbstractC3159y.d(a8, eVar)) {
            m4895getCharactersIUNYP9k = KeyboardCapitalization.Companion.m4896getNoneIUNYP9k();
        } else {
            if (!(AbstractC3159y.d(a8, a.C0799a.f35301f) ? true : AbstractC3159y.d(a8, a.c.f35302f) ? true : AbstractC3159y.d(a8, a.d.f35303f))) {
                throw new L5.p();
            }
            m4895getCharactersIUNYP9k = KeyboardCapitalization.Companion.m4895getCharactersIUNYP9k();
        }
        this.f35291e = m4895getCharactersIUNYP9k;
        if (AbstractC3159y.d(a8, eVar)) {
            m4922getTextPjHm6EE = KeyboardType.Companion.m4919getNumberPasswordPjHm6EE();
        } else {
            if (!(AbstractC3159y.d(a8, a.C0799a.f35301f) ? true : AbstractC3159y.d(a8, a.c.f35302f) ? true : AbstractC3159y.d(a8, a.d.f35303f))) {
                throw new L5.p();
            }
            m4922getTextPjHm6EE = KeyboardType.Companion.m4922getTextPjHm6EE();
        }
        this.f35292f = m4922getTextPjHm6EE;
        this.f35293g = "postal_code_text";
        this.f35294h = new Z(a8);
        this.f35295i = AbstractC3351M.a(Boolean.FALSE);
    }

    @Override // m4.v0
    public Integer b() {
        return Integer.valueOf(this.f35287a);
    }

    @Override // m4.v0
    public VisualTransformation d() {
        return this.f35294h;
    }

    @Override // m4.v0
    public String e() {
        return v0.a.a(this);
    }

    @Override // m4.v0
    public String f(String rawValue) {
        AbstractC3159y.i(rawValue, "rawValue");
        return new g6.j("\\s+").f(rawValue, "");
    }

    @Override // m4.v0
    public int g() {
        return this.f35291e;
    }

    @Override // m4.v0
    public String h(String displayName) {
        AbstractC3159y.i(displayName, "displayName");
        return displayName;
    }

    @Override // m4.v0
    public int i() {
        return this.f35292f;
    }

    @Override // m4.v0
    public String j(String userTyped) {
        boolean d8;
        AbstractC3159y.i(userTyped, "userTyped");
        a aVar = this.f35290d;
        int i8 = 0;
        if (AbstractC3159y.d(aVar, a.e.f35304f)) {
            StringBuilder sb = new StringBuilder();
            int length = userTyped.length();
            while (i8 < length) {
                char charAt = userTyped.charAt(i8);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
                i8++;
            }
            userTyped = sb.toString();
            AbstractC3159y.h(userTyped, "toString(...)");
        } else {
            if (AbstractC3159y.d(aVar, a.C0799a.f35301f)) {
                d8 = true;
            } else {
                d8 = AbstractC3159y.d(aVar, a.c.f35302f);
            }
            if (d8) {
                StringBuilder sb2 = new StringBuilder();
                int length2 = userTyped.length();
                while (i8 < length2) {
                    char charAt2 = userTyped.charAt(i8);
                    if (Character.isLetterOrDigit(charAt2)) {
                        sb2.append(charAt2);
                    }
                    i8++;
                }
                String sb3 = sb2.toString();
                AbstractC3159y.h(sb3, "toString(...)");
                userTyped = sb3.toUpperCase(Locale.ROOT);
                AbstractC3159y.h(userTyped, "toUpperCase(...)");
            } else if (!AbstractC3159y.d(aVar, a.d.f35303f)) {
                throw new L5.p();
            }
        }
        return g6.n.U0(userTyped, this.f35290d.a());
    }

    @Override // m4.v0
    public String k() {
        return this.f35293g;
    }

    @Override // m4.v0
    public y0 l(String input) {
        AbstractC3159y.i(input, "input");
        return new b(input);
    }

    @Override // m4.v0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public l6.v a() {
        return this.f35295i;
    }

    @Override // m4.v0
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public l6.v c() {
        return this.f35288b;
    }

    public /* synthetic */ Y(int i8, l6.v vVar, String str, int i9, AbstractC3151p abstractC3151p) {
        this(i8, (i9 & 2) != 0 ? AbstractC3351M.a(null) : vVar, str);
    }
}
