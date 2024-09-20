package m4;

import M5.AbstractC1246t;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.VisualTransformation;
import j4.AbstractC3081g;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import r2.AbstractC3685e;
import r4.C3688a;
import v2.C3825a;

/* loaded from: classes4.dex */
public final class Q implements H, j0 {

    /* renamed from: r */
    public static final a f35180r = new a(null);

    /* renamed from: s */
    public static final int f35181s = 8;

    /* renamed from: a */
    private final String f35182a;

    /* renamed from: b */
    private final boolean f35183b;

    /* renamed from: c */
    private final boolean f35184c;

    /* renamed from: d */
    private final InterfaceC3349K f35185d;

    /* renamed from: e */
    private final l6.v f35186e;

    /* renamed from: f */
    private final InterfaceC3349K f35187f;

    /* renamed from: g */
    private final l6.v f35188g;

    /* renamed from: h */
    private final C3429t f35189h;

    /* renamed from: i */
    private final C3434y f35190i;

    /* renamed from: j */
    private final InterfaceC3349K f35191j;

    /* renamed from: k */
    private final InterfaceC3349K f35192k;

    /* renamed from: l */
    private final InterfaceC3349K f35193l;

    /* renamed from: m */
    private final InterfaceC3349K f35194m;

    /* renamed from: n */
    private final InterfaceC3349K f35195n;

    /* renamed from: o */
    private final InterfaceC3349K f35196o;

    /* renamed from: p */
    private final InterfaceC3349K f35197p;

    /* renamed from: q */
    private final InterfaceC3349K f35198q;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ Q b(a aVar, String str, String str2, Set set, boolean z8, boolean z9, int i8, Object obj) {
            boolean z10;
            boolean z11;
            if ((i8 & 1) != 0) {
                str = "";
            }
            if ((i8 & 2) != 0) {
                str2 = null;
            }
            String str3 = str2;
            if ((i8 & 4) != 0) {
                set = M5.a0.f();
            }
            Set set2 = set;
            if ((i8 & 8) != 0) {
                z10 = false;
            } else {
                z10 = z8;
            }
            if ((i8 & 16) != 0) {
                z11 = false;
            } else {
                z11 = z9;
            }
            return aVar.a(str, str3, set2, z10, z11);
        }

        public final Q a(String initialValue, String str, Set overrideCountryCodes, boolean z8, boolean z9) {
            AbstractC3159y.i(initialValue, "initialValue");
            AbstractC3159y.i(overrideCountryCodes, "overrideCountryCodes");
            U u8 = null;
            boolean C8 = g6.n.C(initialValue, "+", false, 2, null);
            if (str == null && C8) {
                u8 = U.f35258a.d(initialValue);
            } else if (str != null) {
                u8 = U.f35258a.c(str);
            }
            if (u8 != null) {
                String e8 = u8.e();
                return new Q(g6.n.k0(u8.g(g6.n.k0(initialValue, e8)), e8), u8.c(), overrideCountryCodes, z8, z9, null);
            }
            return new Q(initialValue, str, overrideCountryCodes, z8, z9, null);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: b */
        final /* synthetic */ boolean f35200b;

        /* renamed from: c */
        final /* synthetic */ k0 f35201c;

        /* renamed from: d */
        final /* synthetic */ Modifier f35202d;

        /* renamed from: e */
        final /* synthetic */ Set f35203e;

        /* renamed from: f */
        final /* synthetic */ G f35204f;

        /* renamed from: g */
        final /* synthetic */ int f35205g;

        /* renamed from: h */
        final /* synthetic */ int f35206h;

        /* renamed from: i */
        final /* synthetic */ int f35207i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
            super(2);
            this.f35200b = z8;
            this.f35201c = k0Var;
            this.f35202d = modifier;
            this.f35203e = set;
            this.f35204f = g8;
            this.f35205g = i8;
            this.f35206h = i9;
            this.f35207i = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            Q.this.f(this.f35200b, this.f35201c, this.f35202d, this.f35203e, this.f35204f, this.f35205g, this.f35206h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35207i | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function1 {

        /* renamed from: a */
        public static final c f35208a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(C3825a country) {
            String str;
            AbstractC3159y.i(country, "country");
            String a8 = C3429t.f35700k.a(country.c().c());
            String g8 = U.f35258a.g(country.c().c());
            if (g8 != null) {
                str = "  " + g8 + "  ";
            } else {
                str = null;
            }
            return AbstractC1246t.w0(AbstractC1246t.r(a8, str), "", null, null, 0, null, null, 62, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function1 {

        /* renamed from: a */
        public static final d f35209a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(C3825a country) {
            AbstractC3159y.i(country, "country");
            return AbstractC1246t.w0(AbstractC1246t.r(C3429t.f35700k.a(country.c().c()), country.e(), U.f35258a.g(country.c().c())), " ", null, null, 0, null, null, 62, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements X5.o {

        /* renamed from: a */
        public static final e f35210a = new e();

        e() {
            super(3);
        }

        public final C a(String value, boolean z8, boolean z9) {
            AbstractC3159y.i(value, "value");
            if (!(!g6.n.u(value)) || z8 || z9) {
                return null;
            }
            return new C(AbstractC3081g.f33171G, null, 2, null);
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((String) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements X5.n {

        /* renamed from: a */
        public static final f f35211a = new f();

        f() {
            super(2);
        }

        public final C3688a a(String fieldValue, boolean z8) {
            AbstractC3159y.i(fieldValue, "fieldValue");
            return new C3688a(fieldValue, z8);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((String) obj, ((Boolean) obj2).booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements X5.n {
        g() {
            super(2);
        }

        @Override // X5.n
        /* renamed from: a */
        public final Boolean invoke(String value, Integer num) {
            int i8;
            AbstractC3159y.i(value, "value");
            int length = value.length();
            boolean z8 = false;
            if (num != null) {
                i8 = num.intValue();
            } else {
                i8 = 0;
            }
            if (length >= i8 || Q.this.f35184c) {
                z8 = true;
            }
            return Boolean.valueOf(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements Function1 {
        h() {
            super(1);
        }

        public final U a(int i8) {
            return U.f35258a.c(((C3825a) Q.this.f35189h.a().get(i8)).c().c());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements Function1 {
        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Integer invoke(int i8) {
            return U.f35258a.f(((C3825a) Q.this.f35189h.a().get(i8)).c().c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements Function1 {

        /* renamed from: a */
        public static final j f35215a = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(U it) {
            AbstractC3159y.i(it, "it");
            return it.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements X5.n {

        /* renamed from: a */
        public static final k f35216a = new k();

        k() {
            super(2);
        }

        @Override // X5.n
        /* renamed from: a */
        public final String invoke(String value, U formatter) {
            AbstractC3159y.i(value, "value");
            AbstractC3159y.i(formatter, "formatter");
            return formatter.g(value);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3160z implements Function1 {

        /* renamed from: a */
        public static final l f35217a = new l();

        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final VisualTransformation invoke(U it) {
            AbstractC3159y.i(it, "it");
            return it.f();
        }
    }

    public /* synthetic */ Q(String str, String str2, Set set, boolean z8, boolean z9, AbstractC3151p abstractC3151p) {
        this(str, str2, set, z8, z9);
    }

    public final String A() {
        return this.f35182a;
    }

    public final String B() {
        return g6.n.k0((String) this.f35186e.getValue(), ((U) this.f35191j.getValue()).e());
    }

    public final InterfaceC3349K C() {
        return this.f35197p;
    }

    public final InterfaceC3349K D() {
        return this.f35198q;
    }

    public final void E(String displayFormatted) {
        AbstractC3159y.i(displayFormatted, "displayFormatted");
        this.f35186e.setValue(((U) this.f35191j.getValue()).h(displayFormatted));
    }

    public InterfaceC3349K b() {
        return this.f35185d;
    }

    @Override // m4.j0
    public void f(boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
        int m4868getDoneeUduSuo;
        AbstractC3159y.i(field, "field");
        AbstractC3159y.i(modifier, "modifier");
        AbstractC3159y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(-1468906333);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1468906333, i10, -1, "com.stripe.android.uicore.elements.PhoneNumberController.ComposeUI (PhoneNumberController.kt:180)");
        }
        if (!AbstractC3159y.d(g8, field.a())) {
            m4868getDoneeUduSuo = ImeAction.Companion.m4870getNexteUduSuo();
        } else {
            m4868getDoneeUduSuo = ImeAction.Companion.m4868getDoneeUduSuo();
        }
        T.b(z8, this, null, null, false, false, null, null, m4868getDoneeUduSuo, startRestartGroup, (i10 & 14) | 64, 252);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(z8, field, modifier, hiddenIdentifiers, g8, i8, i9, i10));
        }
    }

    @Override // m4.m0
    public InterfaceC3349K getError() {
        return this.f35196o;
    }

    public final void i(boolean z8) {
        this.f35188g.setValue(Boolean.valueOf(z8));
    }

    public InterfaceC3349K k() {
        return this.f35187f;
    }

    @Override // m4.H
    public InterfaceC3349K m() {
        return this.f35195n;
    }

    @Override // m4.H
    public void r(String rawValue) {
        AbstractC3159y.i(rawValue, "rawValue");
        E(rawValue);
    }

    @Override // m4.H
    public InterfaceC3349K t() {
        return this.f35194m;
    }

    public boolean u() {
        return this.f35183b;
    }

    public final String x() {
        return ((U) this.f35191j.getValue()).c();
    }

    public final C3434y y() {
        return this.f35190i;
    }

    public final String z(String phoneNumber) {
        AbstractC3159y.i(phoneNumber, "phoneNumber");
        return ((U) this.f35191j.getValue()).g(phoneNumber);
    }

    private Q(String str, String str2, Set set, boolean z8, boolean z9) {
        this.f35182a = str;
        this.f35183b = z8;
        this.f35184c = z9;
        this.f35185d = v4.g.n(Integer.valueOf(AbstractC3685e.f37560f));
        l6.v a8 = AbstractC3351M.a(str);
        this.f35186e = a8;
        this.f35187f = AbstractC3360h.b(a8);
        l6.v a9 = AbstractC3351M.a(Boolean.FALSE);
        this.f35188g = a9;
        C3429t c3429t = new C3429t(set, null, true, false, c.f35208a, d.f35209a, 10, null);
        this.f35189h = c3429t;
        C3434y c3434y = new C3434y(c3429t, str2);
        this.f35190i = c3434y;
        InterfaceC3349K m8 = v4.g.m(c3434y.z(), new h());
        this.f35191j = m8;
        InterfaceC3349K m9 = v4.g.m(c3434y.z(), new i());
        this.f35192k = m9;
        this.f35193l = v4.g.d(k(), m8, k.f35216a);
        this.f35194m = v4.g.d(k(), m9, new g());
        this.f35195n = v4.g.d(k(), t(), f.f35211a);
        this.f35196o = v4.g.e(k(), t(), a9, e.f35210a);
        this.f35197p = v4.g.m(m8, j.f35215a);
        this.f35198q = v4.g.m(m8, l.f35217a);
    }
}
