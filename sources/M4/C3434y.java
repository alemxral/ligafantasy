package m4;

import M5.AbstractC1246t;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import r4.C3688a;

/* renamed from: m4.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3434y implements H, m0, j0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3433x f35776a;

    /* renamed from: b, reason: collision with root package name */
    private final List f35777b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f35778c;

    /* renamed from: d, reason: collision with root package name */
    private final l6.v f35779d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3349K f35780e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3349K f35781f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f35782g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3349K f35783h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3349K f35784i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3349K f35785j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3349K f35786k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f35787l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.y$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35789b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f35790c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f35791d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f35792e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G f35793f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f35794g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f35795h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f35796i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
            super(2);
            this.f35789b = z8;
            this.f35790c = k0Var;
            this.f35791d = modifier;
            this.f35792e = set;
            this.f35793f = g8;
            this.f35794g = i8;
            this.f35795h = i9;
            this.f35796i = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            C3434y.this.f(this.f35789b, this.f35790c, this.f35791d, this.f35792e, this.f35793f, this.f35794g, this.f35795h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35796i | 1));
        }
    }

    /* renamed from: m4.y$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function1 {
        b() {
            super(1);
        }

        public final String a(int i8) {
            return (String) C3434y.this.x().get(i8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* renamed from: m4.y$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f35798a = new c();

        c() {
            super(2);
        }

        public final C3688a a(boolean z8, String str) {
            return new C3688a(str, z8);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (String) obj2);
        }
    }

    /* renamed from: m4.y$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function1 {
        d() {
            super(1);
        }

        public final String a(int i8) {
            return (String) AbstractC1246t.p0(C3434y.this.f35776a.j(), i8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public C3434y(InterfaceC3433x config, String str) {
        AbstractC3159y.i(config, "config");
        this.f35776a = config;
        this.f35777b = config.i();
        this.f35778c = config.h();
        l6.v a8 = AbstractC3351M.a(0);
        this.f35779d = a8;
        this.f35780e = a8;
        this.f35781f = AbstractC3351M.a(Integer.valueOf(config.b()));
        this.f35782g = v4.g.m(a8, new b());
        this.f35783h = v4.g.m(a8, new d());
        this.f35784i = v4.g.n(null);
        this.f35785j = AbstractC3351M.a(Boolean.TRUE);
        this.f35786k = v4.g.d(t(), y(), c.f35798a);
        this.f35787l = config.k();
        if (str != null) {
            r(str);
        }
    }

    private final void D(int i8) {
        if (i8 < this.f35777b.size()) {
            this.f35779d.setValue(Integer.valueOf(i8));
        }
    }

    public final String A(int i8) {
        return this.f35776a.g(i8);
    }

    public final boolean B() {
        return this.f35787l;
    }

    public final void C(int i8) {
        D(i8);
    }

    public InterfaceC3349K b() {
        return this.f35781f;
    }

    @Override // m4.j0
    public void f(boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3159y.i(field, "field");
        AbstractC3159y.i(modifier, "modifier");
        AbstractC3159y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(-186755585);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-186755585, i10, -1, "com.stripe.android.uicore.elements.DropdownFieldController.ComposeUI (DropdownFieldController.kt:78)");
        }
        AbstractC3435z.a(this, z8, null, false, startRestartGroup, ((i10 << 3) & 112) | 8, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(z8, field, modifier, hiddenIdentifiers, g8, i8, i9, i10));
        }
    }

    @Override // m4.m0
    public InterfaceC3349K getError() {
        return this.f35784i;
    }

    @Override // m4.H
    public InterfaceC3349K m() {
        return this.f35786k;
    }

    @Override // m4.H
    public void r(String rawValue) {
        int i8;
        AbstractC3159y.i(rawValue, "rawValue");
        Integer valueOf = Integer.valueOf(this.f35777b.indexOf(this.f35776a.f(rawValue)));
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            i8 = valueOf.intValue();
        } else {
            i8 = 0;
        }
        D(i8);
    }

    @Override // m4.H
    public InterfaceC3349K t() {
        return this.f35785j;
    }

    public final boolean w() {
        return this.f35778c;
    }

    public final List x() {
        return this.f35777b;
    }

    public InterfaceC3349K y() {
        return this.f35783h;
    }

    public final InterfaceC3349K z() {
        return this.f35780e;
    }

    public /* synthetic */ C3434y(InterfaceC3433x interfaceC3433x, String str, int i8, AbstractC3151p abstractC3151p) {
        this(interfaceC3433x, (i8 & 2) != 0 ? null : str);
    }
}
