package m4;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import j4.AbstractC3081g;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import r4.C3688a;

/* loaded from: classes4.dex */
public final class d0 implements H, j0 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f35412i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3349K f35413a = v4.g.n(Integer.valueOf(AbstractC3081g.f33197x));

    /* renamed from: b, reason: collision with root package name */
    private final l6.v f35414b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3349K f35415c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f35416d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3349K f35417e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3349K f35418f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f35419g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3349K f35420h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35422b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f35423c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f35424d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f35425e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G f35426f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f35427g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f35428h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f35429i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
            super(2);
            this.f35422b = z8;
            this.f35423c = k0Var;
            this.f35424d = modifier;
            this.f35425e = set;
            this.f35426f = g8;
            this.f35427g = i8;
            this.f35428h = i9;
            this.f35429i = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            d0.this.f(this.f35422b, this.f35423c, this.f35424d, this.f35425e, this.f35426f, this.f35427g, this.f35428h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35429i | 1));
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f35430a = new b();

        b() {
            super(1);
        }

        public final String a(boolean z8) {
            return String.valueOf(z8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f35431a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3688a invoke(String str) {
            return new C3688a(str, true);
        }
    }

    public d0(boolean z8) {
        l6.v a8 = AbstractC3351M.a(Boolean.valueOf(z8));
        this.f35414b = a8;
        InterfaceC3349K b8 = AbstractC3360h.b(a8);
        this.f35415c = b8;
        this.f35416d = v4.g.m(b8, b.f35430a);
        this.f35417e = k();
        this.f35418f = v4.g.n(null);
        this.f35419g = v4.g.n(Boolean.TRUE);
        this.f35420h = v4.g.m(v(), c.f35431a);
    }

    public InterfaceC3349K b() {
        return this.f35413a;
    }

    @Override // m4.j0
    public void f(boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3159y.i(field, "field");
        AbstractC3159y.i(modifier, "modifier");
        AbstractC3159y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(1284799623);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1284799623, i10, -1, "com.stripe.android.uicore.elements.SameAsShippingController.ComposeUI (SameAsShippingController.kt:49)");
        }
        f0.a(this, startRestartGroup, 8);
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
        return this.f35418f;
    }

    public InterfaceC3349K k() {
        return this.f35416d;
    }

    @Override // m4.H
    public InterfaceC3349K m() {
        return this.f35420h;
    }

    @Override // m4.H
    public void r(String rawValue) {
        boolean z8;
        AbstractC3159y.i(rawValue, "rawValue");
        Boolean L02 = g6.n.L0(rawValue);
        if (L02 != null) {
            z8 = L02.booleanValue();
        } else {
            z8 = true;
        }
        x(z8);
    }

    public InterfaceC3349K v() {
        return this.f35417e;
    }

    public final InterfaceC3349K w() {
        return this.f35415c;
    }

    public final void x(boolean z8) {
        this.f35414b.setValue(Boolean.valueOf(z8));
    }
}
