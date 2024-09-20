package m4;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.text.input.VisualTransformation;
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
import m4.z0;
import r4.C3688a;

/* loaded from: classes4.dex */
public final class s0 implements w0, m0 {

    /* renamed from: x, reason: collision with root package name */
    public static final int f35671x = 8;

    /* renamed from: a, reason: collision with root package name */
    private final v0 f35672a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f35673b;

    /* renamed from: c, reason: collision with root package name */
    private final String f35674c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f35675d;

    /* renamed from: e, reason: collision with root package name */
    private final int f35676e;

    /* renamed from: f, reason: collision with root package name */
    private final int f35677f;

    /* renamed from: g, reason: collision with root package name */
    private final VisualTransformation f35678g;

    /* renamed from: h, reason: collision with root package name */
    private final l6.v f35679h;

    /* renamed from: i, reason: collision with root package name */
    private final String f35680i;

    /* renamed from: j, reason: collision with root package name */
    private final AutofillType f35681j;

    /* renamed from: k, reason: collision with root package name */
    private final l6.v f35682k;

    /* renamed from: l, reason: collision with root package name */
    private final l6.v f35683l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3349K f35684m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3349K f35685n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3349K f35686o;

    /* renamed from: p, reason: collision with root package name */
    private final l6.v f35687p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3349K f35688q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3349K f35689r;

    /* renamed from: s, reason: collision with root package name */
    private final l6.v f35690s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3349K f35691t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC3349K f35692u;

    /* renamed from: v, reason: collision with root package name */
    private final InterfaceC3349K f35693v;

    /* renamed from: w, reason: collision with root package name */
    private final InterfaceC3349K f35694w;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {
        a() {
            super(1);
        }

        public final C a(boolean z8) {
            C error = ((y0) s0.this.f35687p.getValue()).getError();
            if (error == null || !z8) {
                return null;
            }
            return error;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f35696a = new b();

        b() {
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
    static final class c extends AbstractC3160z implements Function1 {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(y0 it) {
            boolean z8;
            AbstractC3159y.i(it, "it");
            if (!it.a() && (it.a() || !s0.this.u() || !it.b())) {
                z8 = false;
            } else {
                z8 = true;
            }
            return Boolean.valueOf(z8);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function1 {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            AbstractC3159y.i(it, "it");
            return s0.this.z().h(it);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f35699a = new e();

        e() {
            super(2);
        }

        public final Boolean a(y0 fieldState, boolean z8) {
            AbstractC3159y.i(fieldState, "fieldState");
            return Boolean.valueOf(fieldState.c(z8));
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((y0) obj, ((Boolean) obj2).booleanValue());
        }
    }

    public s0(v0 textFieldConfig, boolean z8, String str) {
        AutofillType autofillType;
        AbstractC3159y.i(textFieldConfig, "textFieldConfig");
        this.f35672a = textFieldConfig;
        this.f35673b = z8;
        this.f35674c = str;
        this.f35675d = textFieldConfig.c();
        this.f35676e = textFieldConfig.g();
        this.f35677f = textFieldConfig.i();
        VisualTransformation d8 = textFieldConfig.d();
        this.f35678g = d8 == null ? VisualTransformation.Companion.getNone() : d8;
        this.f35679h = AbstractC3351M.a(textFieldConfig.b());
        this.f35680i = textFieldConfig.k();
        if (textFieldConfig instanceof C3431v) {
            autofillType = AutofillType.CreditCardExpirationDate;
        } else if (textFieldConfig instanceof Y) {
            autofillType = AutofillType.PostalCode;
        } else if (textFieldConfig instanceof C3399A) {
            autofillType = AutofillType.EmailAddress;
        } else {
            autofillType = textFieldConfig instanceof J ? AutofillType.PersonFullName : null;
        }
        this.f35681j = autofillType;
        this.f35682k = AbstractC3351M.a(textFieldConfig.e());
        l6.v a8 = AbstractC3351M.a("");
        this.f35683l = a8;
        this.f35684m = AbstractC3360h.b(a8);
        this.f35685n = v4.g.m(a8, new d());
        this.f35686o = AbstractC3360h.b(a8);
        l6.v a9 = AbstractC3351M.a(z0.a.f35843c);
        this.f35687p = a9;
        this.f35688q = AbstractC3360h.b(a9);
        this.f35689r = textFieldConfig.a();
        l6.v a10 = AbstractC3351M.a(Boolean.FALSE);
        this.f35690s = a10;
        this.f35691t = v4.g.d(a9, a10, e.f35699a);
        this.f35692u = v4.g.m(n(), new a());
        this.f35693v = v4.g.m(a9, new c());
        this.f35694w = v4.g.d(t(), y(), b.f35696a);
        String s8 = s();
        if (s8 != null) {
            r(s8);
        }
    }

    @Override // m4.w0
    public InterfaceC3349K a() {
        return this.f35689r;
    }

    @Override // m4.w0
    public InterfaceC3349K c() {
        return this.f35675d;
    }

    @Override // m4.w0
    public VisualTransformation d() {
        return this.f35678g;
    }

    @Override // m4.w0, m4.j0
    public void f(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, Composer composer, int i10) {
        w0.a.a(this, z8, k0Var, modifier, set, g8, i8, i9, composer, i10);
    }

    @Override // m4.w0
    public int g() {
        return this.f35676e;
    }

    @Override // m4.w0
    public InterfaceC3349K getContentDescription() {
        return this.f35686o;
    }

    @Override // m4.m0
    public InterfaceC3349K getError() {
        return this.f35692u;
    }

    @Override // m4.w0
    public void h(x0.a.C0823a c0823a) {
        w0.a.d(this, c0823a);
    }

    @Override // m4.w0
    public void i(boolean z8) {
        this.f35690s.setValue(Boolean.valueOf(z8));
    }

    @Override // m4.w0
    public int j() {
        return this.f35677f;
    }

    @Override // m4.w0
    public InterfaceC3349K k() {
        return this.f35684m;
    }

    @Override // m4.w0
    public y0 l(String displayFormatted) {
        AbstractC3159y.i(displayFormatted, "displayFormatted");
        y0 y0Var = (y0) this.f35687p.getValue();
        this.f35683l.setValue(this.f35672a.j(displayFormatted));
        this.f35687p.setValue(this.f35672a.l((String) this.f35683l.getValue()));
        if (!AbstractC3159y.d(this.f35687p.getValue(), y0Var)) {
            return (y0) this.f35687p.getValue();
        }
        return null;
    }

    @Override // m4.H
    public InterfaceC3349K m() {
        return this.f35694w;
    }

    @Override // m4.w0
    public InterfaceC3349K n() {
        return this.f35691t;
    }

    @Override // m4.w0
    public InterfaceC3349K o() {
        return this.f35688q;
    }

    @Override // m4.w0
    public AutofillType p() {
        return this.f35681j;
    }

    @Override // m4.w0
    public boolean q() {
        return w0.a.b(this);
    }

    @Override // m4.H
    public void r(String rawValue) {
        AbstractC3159y.i(rawValue, "rawValue");
        l(this.f35672a.f(rawValue));
    }

    @Override // m4.w0
    public String s() {
        return this.f35674c;
    }

    @Override // m4.H
    public InterfaceC3349K t() {
        return this.f35693v;
    }

    @Override // m4.w0
    public boolean u() {
        return this.f35673b;
    }

    @Override // m4.w0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public l6.v b() {
        return this.f35679h;
    }

    @Override // m4.w0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public l6.v e() {
        return this.f35682k;
    }

    public InterfaceC3349K y() {
        return this.f35685n;
    }

    public final v0 z() {
        return this.f35672a;
    }

    public /* synthetic */ s0(v0 v0Var, boolean z8, String str, int i8, AbstractC3151p abstractC3151p) {
        this(v0Var, (i8 & 2) != 0 ? false : z8, (i8 & 4) != 0 ? null : str);
    }
}
