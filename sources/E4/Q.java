package e4;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.text.input.VisualTransformation;
import b3.EnumC1870e;
import b4.AbstractC1879a;
import j2.AbstractC3053E;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import m4.w0;
import m4.x0;
import r4.C3688a;

/* loaded from: classes4.dex */
public final class Q implements m4.w0, m4.m0 {

    /* renamed from: x, reason: collision with root package name */
    public static final int f30476x = 8;

    /* renamed from: a, reason: collision with root package name */
    private final P f30477a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30478b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30479c;

    /* renamed from: d, reason: collision with root package name */
    private final int f30480d;

    /* renamed from: e, reason: collision with root package name */
    private final int f30481e;

    /* renamed from: f, reason: collision with root package name */
    private final VisualTransformation f30482f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f30483g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3349K f30484h;

    /* renamed from: i, reason: collision with root package name */
    private final String f30485i;

    /* renamed from: j, reason: collision with root package name */
    private final AutofillType f30486j;

    /* renamed from: k, reason: collision with root package name */
    private final l6.v f30487k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC3349K f30488l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3349K f30489m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3349K f30490n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3349K f30491o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3349K f30492p;

    /* renamed from: q, reason: collision with root package name */
    private final l6.v f30493q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3349K f30494r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC3349K f30495s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3349K f30496t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC3349K f30497u;

    /* renamed from: v, reason: collision with root package name */
    private final InterfaceC3349K f30498v;

    /* renamed from: w, reason: collision with root package name */
    private final InterfaceC3349K f30499w;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements X5.n {
        a() {
            super(2);
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m4.y0 invoke(EnumC1870e brand, String fieldValue) {
            AbstractC3159y.i(brand, "brand");
            AbstractC3159y.i(fieldValue, "fieldValue");
            return Q.this.f30477a.c(brand, fieldValue, brand.m());
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f30501a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(EnumC1870e cardBrand) {
            int i8;
            AbstractC3159y.i(cardBrand, "cardBrand");
            if (cardBrand == EnumC1870e.f14427q) {
                i8 = AbstractC3053E.f32857b0;
            } else {
                i8 = AbstractC3053E.f32863e0;
            }
            return Integer.valueOf(i8);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f30502a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            AbstractC3159y.i(it, "it");
            return AbstractC1879a.a(it);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f30503a = new d();

        d() {
            super(2);
        }

        public final m4.C a(boolean z8, m4.y0 fieldState) {
            AbstractC3159y.i(fieldState, "fieldState");
            m4.C error = fieldState.getError();
            if (error == null || !z8) {
                return null;
            }
            return error;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (m4.y0) obj2);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f30504a = new e();

        e() {
            super(2);
        }

        public final C3688a a(boolean z8, String value) {
            AbstractC3159y.i(value, "value");
            return new C3688a(value, z8);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (String) obj2);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f30505a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(m4.y0 it) {
            AbstractC3159y.i(it, "it");
            return Boolean.valueOf(it.a());
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3160z implements Function1 {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            AbstractC3159y.i(it, "it");
            return Q.this.f30477a.b(it);
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f30507a = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x0.c invoke(EnumC1870e it) {
            AbstractC3159y.i(it, "it");
            return new x0.c(it.g(), null, false, null, 10, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f30508a = new i();

        i() {
            super(2);
        }

        public final Boolean a(m4.y0 fieldState, boolean z8) {
            AbstractC3159y.i(fieldState, "fieldState");
            return Boolean.valueOf(fieldState.c(z8));
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((m4.y0) obj, ((Boolean) obj2).booleanValue());
        }
    }

    public Q(P cvcTextFieldConfig, InterfaceC3349K cardBrandFlow, String str, boolean z8) {
        AbstractC3159y.i(cvcTextFieldConfig, "cvcTextFieldConfig");
        AbstractC3159y.i(cardBrandFlow, "cardBrandFlow");
        this.f30477a = cvcTextFieldConfig;
        this.f30478b = str;
        this.f30479c = z8;
        this.f30480d = cvcTextFieldConfig.e();
        this.f30481e = cvcTextFieldConfig.g();
        this.f30482f = cvcTextFieldConfig.h();
        InterfaceC3349K m8 = v4.g.m(cardBrandFlow, b.f30501a);
        this.f30483g = m8;
        this.f30484h = m8;
        this.f30485i = cvcTextFieldConfig.f();
        this.f30486j = AutofillType.CreditCardSecurityCode;
        l6.v a8 = AbstractC3351M.a("");
        this.f30487k = a8;
        this.f30488l = AbstractC3360h.b(a8);
        this.f30489m = v4.g.m(a8, new g());
        this.f30490n = v4.g.m(a8, c.f30502a);
        InterfaceC3349K d8 = v4.g.d(cardBrandFlow, a8, new a());
        this.f30491o = d8;
        this.f30492p = d8;
        Boolean bool = Boolean.FALSE;
        l6.v a9 = AbstractC3351M.a(bool);
        this.f30493q = a9;
        this.f30494r = v4.g.d(d8, a9, i.f30508a);
        this.f30495s = v4.g.d(n(), d8, d.f30503a);
        this.f30496t = v4.g.m(d8, f.f30505a);
        this.f30497u = v4.g.d(t(), w(), e.f30504a);
        this.f30498v = v4.g.m(cardBrandFlow, h.f30507a);
        this.f30499w = v4.g.n(bool);
        String s8 = s();
        r(s8 != null ? s8 : "");
    }

    @Override // m4.w0
    public InterfaceC3349K a() {
        return this.f30499w;
    }

    @Override // m4.w0
    public InterfaceC3349K b() {
        return this.f30484h;
    }

    @Override // m4.w0
    public InterfaceC3349K c() {
        return this.f30498v;
    }

    @Override // m4.w0
    public VisualTransformation d() {
        return this.f30482f;
    }

    @Override // m4.w0
    public InterfaceC3349K e() {
        return w0.a.c(this);
    }

    @Override // m4.w0, m4.j0
    public void f(boolean z8, m4.k0 k0Var, Modifier modifier, Set set, m4.G g8, int i8, int i9, Composer composer, int i10) {
        w0.a.a(this, z8, k0Var, modifier, set, g8, i8, i9, composer, i10);
    }

    @Override // m4.w0
    public int g() {
        return this.f30480d;
    }

    @Override // m4.w0
    public InterfaceC3349K getContentDescription() {
        return this.f30490n;
    }

    @Override // m4.m0
    public InterfaceC3349K getError() {
        return this.f30495s;
    }

    @Override // m4.w0
    public void h(x0.a.C0823a c0823a) {
        w0.a.d(this, c0823a);
    }

    @Override // m4.w0
    public void i(boolean z8) {
        this.f30493q.setValue(Boolean.valueOf(z8));
    }

    @Override // m4.w0
    public int j() {
        return this.f30481e;
    }

    @Override // m4.w0
    public InterfaceC3349K k() {
        return this.f30488l;
    }

    @Override // m4.w0
    public m4.y0 l(String displayFormatted) {
        AbstractC3159y.i(displayFormatted, "displayFormatted");
        this.f30487k.setValue(this.f30477a.d(displayFormatted));
        return null;
    }

    @Override // m4.H
    public InterfaceC3349K m() {
        return this.f30497u;
    }

    @Override // m4.w0
    public InterfaceC3349K n() {
        return this.f30494r;
    }

    @Override // m4.w0
    public InterfaceC3349K o() {
        return this.f30492p;
    }

    @Override // m4.w0
    public AutofillType p() {
        return this.f30486j;
    }

    @Override // m4.w0
    public boolean q() {
        return w0.a.b(this);
    }

    @Override // m4.H
    public void r(String rawValue) {
        AbstractC3159y.i(rawValue, "rawValue");
        l(this.f30477a.a(rawValue));
    }

    @Override // m4.w0
    public String s() {
        return this.f30478b;
    }

    @Override // m4.H
    public InterfaceC3349K t() {
        return this.f30496t;
    }

    @Override // m4.w0
    public boolean u() {
        return this.f30479c;
    }

    public InterfaceC3349K w() {
        return this.f30489m;
    }

    public /* synthetic */ Q(P p8, InterfaceC3349K interfaceC3349K, String str, boolean z8, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? new P() : p8, interfaceC3349K, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? false : z8);
    }
}
