package z3;

import E3.c;
import J3.AbstractC1195c;
import J3.AbstractC1204l;
import J3.G;
import J3.H;
import J3.InterfaceC1194b;
import J3.InterfaceC1211t;
import J3.T;
import J3.U;
import J3.V;
import L3.i;
import L3.s;
import L3.t;
import L5.I;
import M5.AbstractC1246t;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.model.o;
import j2.AbstractC3053E;
import java.io.Closeable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3349K;
import q3.w;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;
import z3.C4019a;

/* renamed from: z3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4021c {

    /* renamed from: z3.c$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC4021c, Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC1194b f40063a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3349K f40064b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f40065c;

        /* renamed from: d, reason: collision with root package name */
        private final float f40066d;

        /* renamed from: e, reason: collision with root package name */
        private final float f40067e;

        /* renamed from: f, reason: collision with root package name */
        private final float f40068f;

        /* renamed from: g, reason: collision with root package name */
        private final EnumC0926c f40069g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f40070h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z3.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0924a extends AbstractC3160z implements n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f40072b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f40073c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0924a(Modifier modifier, int i8) {
                super(2);
                this.f40072b = modifier;
                this.f40073c = i8;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6474a;
            }

            public final void invoke(Composer composer, int i8) {
                a.this.f(this.f40072b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40073c | 1));
            }
        }

        /* renamed from: z3.c$a$b */
        /* loaded from: classes4.dex */
        static final class b extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f40074a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f40075b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(boolean z8, boolean z9) {
                super(1);
                this.f40074a = z8;
                this.f40075b = z9;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3983b invoke(InterfaceC1194b.a state) {
                AbstractC3159y.i(state, "state");
                String str = null;
                if (this.f40074a || this.f40075b) {
                    return null;
                }
                X2.g gVar = (X2.g) AbstractC1246t.M0(state.g());
                if (gVar != null) {
                    str = gVar.d();
                }
                if (AbstractC3159y.d(str, o.p.f24519i.f24537a)) {
                    return AbstractC3984c.a(AbstractC3053E.f32829H0);
                }
                return AbstractC3984c.a(w.f37409D);
            }
        }

        public a(InterfaceC1194b interactor) {
            AbstractC3159y.i(interactor, "interactor");
            this.f40063a = interactor;
            this.f40064b = v4.g.n(new C4019a(true, null, 2, null));
            this.f40065c = true;
            this.f40066d = Dp.m5178constructorimpl(0);
            this.f40067e = AbstractC4022d.a();
            this.f40068f = AbstractC4022d.b();
            this.f40069g = EnumC0926c.f40088a;
            this.f40070h = true;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K a() {
            return this.f40064b;
        }

        @Override // z3.InterfaceC4021c
        public EnumC0926c b() {
            return this.f40069g;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f40063a.close();
        }

        @Override // z3.InterfaceC4021c
        public boolean e() {
            return this.f40065c;
        }

        @Override // z3.InterfaceC4021c
        public void f(Modifier modifier, Composer composer, int i8) {
            AbstractC3159y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(-992403751);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-992403751, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.AddAnotherPaymentMethod.Content (PaymentSheetScreen.kt:224)");
            }
            AbstractC1195c.a(this.f40063a, modifier, startRestartGroup, (i8 << 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new C0924a(modifier, i8));
            }
        }

        @Override // z3.InterfaceC4021c
        public boolean g() {
            return this.f40070h;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K h(boolean z8, boolean z9) {
            return v4.g.m(this.f40063a.getState(), new b(z9, z8));
        }

        @Override // z3.InterfaceC4021c
        public float l() {
            return this.f40067e;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K m() {
            return v4.g.n(H.f4820a.a(true, this.f40063a.a(), G.a.b.f4819a));
        }

        @Override // z3.InterfaceC4021c
        public float o() {
            return this.f40066d;
        }

        @Override // z3.InterfaceC4021c
        public float r() {
            return this.f40068f;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K t(boolean z8) {
            return v4.g.n(Boolean.valueOf(z8));
        }
    }

    /* renamed from: z3.c$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC4021c, Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC1194b f40076a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3349K f40077b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f40078c;

        /* renamed from: d, reason: collision with root package name */
        private final float f40079d;

        /* renamed from: e, reason: collision with root package name */
        private final float f40080e;

        /* renamed from: f, reason: collision with root package name */
        private final float f40081f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f40082g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z3.c$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f40084b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f40085c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f40084b = modifier;
                this.f40085c = i8;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6474a;
            }

            public final void invoke(Composer composer, int i8) {
                b.this.f(this.f40084b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40085c | 1));
            }
        }

        /* renamed from: z3.c$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0925b extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f40086a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f40087b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0925b(boolean z8, boolean z9) {
                super(1);
                this.f40086a = z8;
                this.f40087b = z9;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3983b invoke(InterfaceC1194b.a state) {
                AbstractC3159y.i(state, "state");
                String str = null;
                if (this.f40086a) {
                    return null;
                }
                if (this.f40087b) {
                    return AbstractC3984c.a(w.f37456m);
                }
                X2.g gVar = (X2.g) AbstractC1246t.M0(state.g());
                if (gVar != null) {
                    str = gVar.d();
                }
                if (AbstractC3159y.d(str, o.p.f24519i.f24537a)) {
                    return AbstractC3984c.a(AbstractC3053E.f32829H0);
                }
                return AbstractC3984c.a(w.f37409D);
            }
        }

        public b(InterfaceC1194b interactor) {
            AbstractC3159y.i(interactor, "interactor");
            this.f40076a = interactor;
            this.f40077b = v4.g.n(new C4019a(true, null, 2, null));
            this.f40078c = true;
            this.f40079d = Dp.m5178constructorimpl(0);
            this.f40080e = AbstractC4022d.a();
            this.f40081f = AbstractC4022d.b();
            this.f40082g = true;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K a() {
            return this.f40077b;
        }

        @Override // z3.InterfaceC4021c
        public EnumC0926c b() {
            return e.a(this);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f40076a.close();
        }

        @Override // z3.InterfaceC4021c
        public boolean e() {
            return this.f40078c;
        }

        @Override // z3.InterfaceC4021c
        public void f(Modifier modifier, Composer composer, int i8) {
            AbstractC3159y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(1504163590);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1504163590, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.AddFirstPaymentMethod.Content (PaymentSheetScreen.kt:277)");
            }
            AbstractC1195c.a(this.f40076a, modifier, startRestartGroup, (i8 << 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // z3.InterfaceC4021c
        public boolean g() {
            return this.f40082g;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K h(boolean z8, boolean z9) {
            return v4.g.m(this.f40076a.getState(), new C0925b(z9, z8));
        }

        @Override // z3.InterfaceC4021c
        public float l() {
            return this.f40080e;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K m() {
            return v4.g.n(H.f4820a.a(false, this.f40076a.a(), G.a.b.f4819a));
        }

        @Override // z3.InterfaceC4021c
        public float o() {
            return this.f40079d;
        }

        @Override // z3.InterfaceC4021c
        public float r() {
            return this.f40081f;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K t(boolean z8) {
            return v4.g.n(Boolean.TRUE);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: z3.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class EnumC0926c {

        /* renamed from: a, reason: collision with root package name */
        public static final EnumC0926c f40088a = new EnumC0926c("PrimaryButtonAnchored", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0926c f40089b = new EnumC0926c("FullPage", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ EnumC0926c[] f40090c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ R5.a f40091d;

        static {
            EnumC0926c[] a8 = a();
            f40090c = a8;
            f40091d = R5.b.a(a8);
        }

        private EnumC0926c(String str, int i8) {
        }

        private static final /* synthetic */ EnumC0926c[] a() {
            return new EnumC0926c[]{f40088a, f40089b};
        }

        public static EnumC0926c valueOf(String str) {
            return (EnumC0926c) Enum.valueOf(EnumC0926c.class, str);
        }

        public static EnumC0926c[] values() {
            return (EnumC0926c[]) f40090c.clone();
        }
    }

    /* renamed from: z3.c$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC4021c {

        /* renamed from: a, reason: collision with root package name */
        private final E3.e f40092a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3349K f40093b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f40094c;

        /* renamed from: d, reason: collision with root package name */
        private final float f40095d;

        /* renamed from: e, reason: collision with root package name */
        private final float f40096e;

        /* renamed from: f, reason: collision with root package name */
        private final float f40097f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f40098g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z3.c$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f40100b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f40101c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f40100b = modifier;
                this.f40101c = i8;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6474a;
            }

            public final void invoke(Composer composer, int i8) {
                d.this.f(this.f40100b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40101c | 1));
            }
        }

        /* renamed from: z3.c$d$b */
        /* loaded from: classes4.dex */
        static final class b extends AbstractC3160z implements Function1 {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: z3.c$d$b$a */
            /* loaded from: classes4.dex */
            public static final class a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                public static final a f40103a = new a();

                a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5629invoke();
                    return I.f6474a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5629invoke() {
                }
            }

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final G invoke(E3.c complete) {
                AbstractC3159y.i(complete, "complete");
                return H.f4820a.a(false, !((E3.f) d.this.f40092a.b().getValue()).e(), new G.a.C0093a(complete instanceof c.b, false, a.f40103a));
            }
        }

        public d(E3.e interactor) {
            AbstractC3159y.i(interactor, "interactor");
            this.f40092a = interactor;
            this.f40093b = v4.g.n(new C4019a(true, new C4019a.C0922a(AbstractC3984c.f(w.f37411F, new Object[0], null, 4, null), false)));
            this.f40095d = Dp.m5178constructorimpl(0);
            this.f40096e = AbstractC4022d.c();
            this.f40097f = AbstractC4022d.d();
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K a() {
            return this.f40093b;
        }

        @Override // z3.InterfaceC4021c
        public EnumC0926c b() {
            return e.a(this);
        }

        @Override // z3.InterfaceC4021c
        public boolean e() {
            return this.f40094c;
        }

        @Override // z3.InterfaceC4021c
        public void f(Modifier modifier, Composer composer, int i8) {
            AbstractC3159y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(-521548963);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-521548963, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.CvcRecollection.Content (PaymentSheetScreen.kt:532)");
            }
            com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b.c(this.f40092a, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // z3.InterfaceC4021c
        public boolean g() {
            return this.f40098g;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K h(boolean z8, boolean z9) {
            return v4.g.n(null);
        }

        @Override // z3.InterfaceC4021c
        public float l() {
            return this.f40096e;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K m() {
            return v4.g.m(this.f40092a.d(), new b());
        }

        @Override // z3.InterfaceC4021c
        public float o() {
            return this.f40095d;
        }

        @Override // z3.InterfaceC4021c
        public float r() {
            return this.f40097f;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K t(boolean z8) {
            return v4.g.n(Boolean.FALSE);
        }
    }

    /* renamed from: z3.c$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public static EnumC0926c a(InterfaceC4021c interfaceC4021c) {
            return EnumC0926c.f40089b;
        }
    }

    /* renamed from: z3.c$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC4021c, Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC1211t f40104a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3349K f40105b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f40106c;

        /* renamed from: d, reason: collision with root package name */
        private final float f40107d;

        /* renamed from: e, reason: collision with root package name */
        private final float f40108e;

        /* renamed from: f, reason: collision with root package name */
        private final float f40109f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f40110g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z3.c$f$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f40112b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f40113c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f40112b = modifier;
                this.f40113c = i8;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6474a;
            }

            public final void invoke(Composer composer, int i8) {
                f.this.f(this.f40112b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40113c | 1));
            }
        }

        public f(InterfaceC1211t interactor) {
            AbstractC3159y.i(interactor, "interactor");
            this.f40104a = interactor;
            this.f40105b = v4.g.n(new C4019a(false, null, 2, null));
            float f8 = 0;
            this.f40107d = Dp.m5178constructorimpl(f8);
            this.f40108e = Dp.m5178constructorimpl(f8);
            this.f40109f = AbstractC4022d.b();
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K a() {
            return this.f40105b;
        }

        @Override // z3.InterfaceC4021c
        public EnumC0926c b() {
            return e.a(this);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f40104a.close();
        }

        @Override // z3.InterfaceC4021c
        public boolean e() {
            return this.f40106c;
        }

        @Override // z3.InterfaceC4021c
        public void f(Modifier modifier, Composer composer, int i8) {
            AbstractC3159y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(-1252883967);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1252883967, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.EditPaymentMethod.Content (PaymentSheetScreen.kt:318)");
            }
            AbstractC1204l.d(this.f40104a, modifier, startRestartGroup, (i8 << 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // z3.InterfaceC4021c
        public boolean g() {
            return this.f40110g;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K h(boolean z8, boolean z9) {
            return v4.g.n(AbstractC3984c.a(AbstractC3053E.f32837L0));
        }

        @Override // z3.InterfaceC4021c
        public float l() {
            return this.f40108e;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K m() {
            return v4.g.n(H.f4820a.a(true, this.f40104a.a(), G.a.b.f4819a));
        }

        @Override // z3.InterfaceC4021c
        public float o() {
            return this.f40107d;
        }

        @Override // z3.InterfaceC4021c
        public float r() {
            return this.f40109f;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K t(boolean z8) {
            return v4.g.n(Boolean.FALSE);
        }
    }

    /* renamed from: z3.c$g */
    /* loaded from: classes4.dex */
    public static final class g implements InterfaceC4021c {

        /* renamed from: c, reason: collision with root package name */
        private static final boolean f40116c = false;

        /* renamed from: d, reason: collision with root package name */
        private static final float f40117d;

        /* renamed from: e, reason: collision with root package name */
        private static final float f40118e;

        /* renamed from: g, reason: collision with root package name */
        private static final boolean f40120g = false;

        /* renamed from: a, reason: collision with root package name */
        public static final g f40114a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final InterfaceC3349K f40115b = v4.g.n(new C4019a(false, null, 2, null));

        /* renamed from: f, reason: collision with root package name */
        private static final float f40119f = AbstractC4022d.b();

        /* renamed from: h, reason: collision with root package name */
        public static final int f40121h = 8;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z3.c$g$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f40123b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f40124c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f40123b = modifier;
                this.f40124c = i8;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6474a;
            }

            public final void invoke(Composer composer, int i8) {
                g.this.f(this.f40123b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40124c | 1));
            }
        }

        static {
            float f8 = 0;
            f40117d = Dp.m5178constructorimpl(f8);
            f40118e = Dp.m5178constructorimpl(f8);
        }

        private g() {
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K a() {
            return f40115b;
        }

        @Override // z3.InterfaceC4021c
        public EnumC0926c b() {
            return e.a(this);
        }

        @Override // z3.InterfaceC4021c
        public boolean e() {
            return f40116c;
        }

        @Override // z3.InterfaceC4021c
        public void f(Modifier modifier, Composer composer, int i8) {
            int i9;
            int i10;
            AbstractC3159y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(1798980290);
            if ((i8 & 14) == 0) {
                if (startRestartGroup.changed(modifier)) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                i9 = i10 | i8;
            } else {
                i9 = i8;
            }
            if ((i9 & 11) == 2 && startRestartGroup.getSkipping()) {
                startRestartGroup.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1798980290, i9, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.Loading.Content (PaymentSheetScreen.kt:112)");
                }
                q2.b.a(modifier, startRestartGroup, i9 & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // z3.InterfaceC4021c
        public boolean g() {
            return f40120g;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K h(boolean z8, boolean z9) {
            return v4.g.n(null);
        }

        @Override // z3.InterfaceC4021c
        public float l() {
            return f40118e;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K m() {
            return v4.g.n(null);
        }

        @Override // z3.InterfaceC4021c
        public float o() {
            return f40117d;
        }

        @Override // z3.InterfaceC4021c
        public float r() {
            return f40119f;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K t(boolean z8) {
            return v4.g.n(Boolean.FALSE);
        }
    }

    /* renamed from: z3.c$h */
    /* loaded from: classes4.dex */
    public static final class h implements InterfaceC4021c {

        /* renamed from: a, reason: collision with root package name */
        private final L3.f f40125a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3349K f40126b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f40127c;

        /* renamed from: d, reason: collision with root package name */
        private final float f40128d;

        /* renamed from: e, reason: collision with root package name */
        private final float f40129e;

        /* renamed from: f, reason: collision with root package name */
        private final float f40130f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f40131g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z3.c$h$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f40133b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f40134c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f40133b = modifier;
                this.f40134c = i8;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6474a;
            }

            public final void invoke(Composer composer, int i8) {
                h.this.f(this.f40133b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40134c | 1));
            }
        }

        public h(L3.f interactor) {
            AbstractC3159y.i(interactor, "interactor");
            this.f40125a = interactor;
            this.f40126b = v4.g.n(new C4019a(false, null, 2, null));
            float f8 = 0;
            this.f40128d = Dp.m5178constructorimpl(f8);
            this.f40129e = Dp.m5178constructorimpl(f8);
            this.f40130f = AbstractC4022d.d();
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K a() {
            return this.f40126b;
        }

        @Override // z3.InterfaceC4021c
        public EnumC0926c b() {
            return e.a(this);
        }

        @Override // z3.InterfaceC4021c
        public boolean e() {
            return this.f40127c;
        }

        @Override // z3.InterfaceC4021c
        public void f(Modifier modifier, Composer composer, int i8) {
            AbstractC3159y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(1539421821);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1539421821, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.ManageOneSavedPaymentMethod.Content (PaymentSheetScreen.kt:492)");
            }
            L3.g.a(this.f40125a, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // z3.InterfaceC4021c
        public boolean g() {
            return this.f40131g;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K h(boolean z8, boolean z9) {
            return v4.g.n(AbstractC3984c.a(w.f37431Z));
        }

        @Override // z3.InterfaceC4021c
        public float l() {
            return this.f40129e;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K m() {
            return v4.g.n(H.f4820a.a(true, this.f40125a.getState().b(), G.a.b.f4819a));
        }

        @Override // z3.InterfaceC4021c
        public float o() {
            return this.f40128d;
        }

        @Override // z3.InterfaceC4021c
        public float r() {
            return this.f40130f;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K t(boolean z8) {
            return v4.g.n(Boolean.FALSE);
        }
    }

    /* renamed from: z3.c$i */
    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC4021c, Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final L3.i f40135a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3349K f40136b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f40137c;

        /* renamed from: d, reason: collision with root package name */
        private final float f40138d;

        /* renamed from: e, reason: collision with root package name */
        private final float f40139e;

        /* renamed from: f, reason: collision with root package name */
        private final float f40140f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f40141g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z3.c$i$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f40143b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f40144c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f40143b = modifier;
                this.f40144c = i8;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6474a;
            }

            public final void invoke(Composer composer, int i8) {
                i.this.f(this.f40143b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40144c | 1));
            }
        }

        /* renamed from: z3.c$i$b */
        /* loaded from: classes4.dex */
        static final class b extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final b f40145a = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3983b invoke(i.a state) {
                int i8;
                AbstractC3159y.i(state, "state");
                if (state.e()) {
                    i8 = w.f37414I;
                } else {
                    i8 = w.f37443f0;
                }
                return AbstractC3984c.a(i8);
            }
        }

        /* renamed from: z3.c$i$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0927c extends AbstractC3160z implements Function1 {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: z3.c$i$c$a */
            /* loaded from: classes4.dex */
            public static final class a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ i f40147a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(i iVar) {
                    super(0);
                    this.f40147a = iVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5630invoke();
                    return I.f6474a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5630invoke() {
                    this.f40147a.f40135a.b(i.b.d.f6252a);
                }
            }

            C0927c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final G invoke(i.a state) {
                AbstractC3159y.i(state, "state");
                return H.f4820a.a(true, i.this.f40135a.a(), new G.a.C0093a(state.e(), state.a(), new a(i.this)));
            }
        }

        public i(L3.i interactor) {
            AbstractC3159y.i(interactor, "interactor");
            this.f40135a = interactor;
            this.f40136b = v4.g.n(new C4019a(false, null, 2, null));
            float f8 = 0;
            this.f40138d = Dp.m5178constructorimpl(f8);
            this.f40139e = Dp.m5178constructorimpl(f8);
            this.f40140f = AbstractC4022d.d();
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K a() {
            return this.f40136b;
        }

        @Override // z3.InterfaceC4021c
        public EnumC0926c b() {
            return e.a(this);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f40135a.close();
        }

        @Override // z3.InterfaceC4021c
        public boolean e() {
            return this.f40137c;
        }

        @Override // z3.InterfaceC4021c
        public void f(Modifier modifier, Composer composer, int i8) {
            AbstractC3159y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(-449464720);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-449464720, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.ManageSavedPaymentMethods.Content (PaymentSheetScreen.kt:454)");
            }
            L3.j.a(this.f40135a, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // z3.InterfaceC4021c
        public boolean g() {
            return this.f40141g;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K h(boolean z8, boolean z9) {
            return v4.g.m(this.f40135a.getState(), b.f40145a);
        }

        @Override // z3.InterfaceC4021c
        public float l() {
            return this.f40139e;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K m() {
            return v4.g.m(this.f40135a.getState(), new C0927c());
        }

        @Override // z3.InterfaceC4021c
        public float o() {
            return this.f40138d;
        }

        @Override // z3.InterfaceC4021c
        public float r() {
            return this.f40140f;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K t(boolean z8) {
            return v4.g.n(Boolean.FALSE);
        }
    }

    /* renamed from: z3.c$k */
    /* loaded from: classes4.dex */
    public static final class k implements InterfaceC4021c {

        /* renamed from: a, reason: collision with root package name */
        private final L3.n f40164a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3349K f40165b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f40166c;

        /* renamed from: d, reason: collision with root package name */
        private final float f40167d;

        /* renamed from: e, reason: collision with root package name */
        private final float f40168e;

        /* renamed from: f, reason: collision with root package name */
        private final float f40169f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f40170g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z3.c$k$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f40172b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f40173c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f40172b = modifier;
                this.f40173c = i8;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6474a;
            }

            public final void invoke(Composer composer, int i8) {
                k.this.f(this.f40172b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40173c | 1));
            }
        }

        public k(L3.n interactor) {
            AbstractC3159y.i(interactor, "interactor");
            this.f40164a = interactor;
            this.f40165b = v4.g.n(new C4019a(true, null, 2, null));
            this.f40166c = true;
            this.f40167d = Dp.m5178constructorimpl(0);
            this.f40168e = AbstractC4022d.c();
            this.f40169f = AbstractC4022d.d();
            this.f40170g = true;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K a() {
            return this.f40165b;
        }

        @Override // z3.InterfaceC4021c
        public EnumC0926c b() {
            return e.a(this);
        }

        @Override // z3.InterfaceC4021c
        public boolean e() {
            return this.f40166c;
        }

        @Override // z3.InterfaceC4021c
        public void f(Modifier modifier, Composer composer, int i8) {
            AbstractC3159y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(-1185148305);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1185148305, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.VerticalMode.Content (PaymentSheetScreen.kt:365)");
            }
            L3.o.b(this.f40164a, modifier, startRestartGroup, (i8 << 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // z3.InterfaceC4021c
        public boolean g() {
            return this.f40170g;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K h(boolean z8, boolean z9) {
            InterfaceC3983b a8;
            if (z9) {
                a8 = null;
            } else if (z8) {
                a8 = AbstractC3984c.a(w.f37441e0);
            } else {
                a8 = AbstractC3984c.a(w.f37409D);
            }
            return v4.g.n(a8);
        }

        @Override // z3.InterfaceC4021c
        public float l() {
            return this.f40168e;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K m() {
            return v4.g.n(H.f4820a.a(false, this.f40164a.a(), G.a.b.f4819a));
        }

        @Override // z3.InterfaceC4021c
        public float o() {
            return this.f40167d;
        }

        @Override // z3.InterfaceC4021c
        public float r() {
            return this.f40169f;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K t(boolean z8) {
            return this.f40164a.c();
        }
    }

    InterfaceC3349K a();

    EnumC0926c b();

    boolean e();

    void f(Modifier modifier, Composer composer, int i8);

    boolean g();

    InterfaceC3349K h(boolean z8, boolean z9);

    float l();

    InterfaceC3349K m();

    float o();

    float r();

    InterfaceC3349K t(boolean z8);

    /* renamed from: z3.c$j */
    /* loaded from: classes4.dex */
    public static final class j implements InterfaceC4021c, Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final V f40148a;

        /* renamed from: b, reason: collision with root package name */
        private final b f40149b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC3349K f40150c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f40151d;

        /* renamed from: e, reason: collision with root package name */
        private final float f40152e;

        /* renamed from: f, reason: collision with root package name */
        private final float f40153f;

        /* renamed from: g, reason: collision with root package name */
        private final float f40154g;

        /* renamed from: h, reason: collision with root package name */
        private final EnumC0926c f40155h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f40156i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z3.c$j$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f40158b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f40159c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f40158b = modifier;
                this.f40159c = i8;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6474a;
            }

            public final void invoke(Composer composer, int i8) {
                j.this.f(this.f40158b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40159c | 1));
            }
        }

        /* renamed from: z3.c$j$b */
        /* loaded from: classes4.dex */
        public interface b {

            /* renamed from: z3.c$j$b$a */
            /* loaded from: classes4.dex */
            public static final class a implements b {

                /* renamed from: a, reason: collision with root package name */
                public static final a f40160a = new a();

                private a() {
                }

                public boolean equals(Object obj) {
                    if (this == obj || (obj instanceof a)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    return 689265788;
                }

                public String toString() {
                    return "NotRequired";
                }
            }

            /* renamed from: z3.c$j$b$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0928b implements b {

                /* renamed from: a, reason: collision with root package name */
                private final InterfaceC3349K f40161a;

                public C0928b(InterfaceC3349K cvcControllerFlow) {
                    AbstractC3159y.i(cvcControllerFlow, "cvcControllerFlow");
                    this.f40161a = cvcControllerFlow;
                }

                public final InterfaceC3349K a() {
                    return this.f40161a;
                }
            }
        }

        /* renamed from: z3.c$j$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0929c extends AbstractC3160z implements Function1 {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: z3.c$j$c$a */
            /* loaded from: classes4.dex */
            public static final class a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ j f40163a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(j jVar) {
                    super(0);
                    this.f40163a = jVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5631invoke();
                    return I.f6474a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5631invoke() {
                    this.f40163a.f40148a.b(V.b.e.f5119a);
                }
            }

            C0929c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final G invoke(V.a state) {
                AbstractC3159y.i(state, "state");
                return H.f4820a.a(false, j.this.f40148a.a(), new G.a.C0093a(state.f(), state.c(), new a(j.this)));
            }
        }

        public j(V interactor, b cvcRecollectionState) {
            AbstractC3159y.i(interactor, "interactor");
            AbstractC3159y.i(cvcRecollectionState, "cvcRecollectionState");
            this.f40148a = interactor;
            this.f40149b = cvcRecollectionState;
            this.f40150c = v4.g.n(new C4019a(true, null, 2, null));
            this.f40152e = T.j();
            this.f40153f = Dp.m5178constructorimpl(0);
            this.f40154g = AbstractC4022d.b();
            this.f40155h = EnumC0926c.f40088a;
            this.f40156i = true;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K a() {
            return this.f40150c;
        }

        @Override // z3.InterfaceC4021c
        public EnumC0926c b() {
            return this.f40155h;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f40148a.close();
        }

        @Override // z3.InterfaceC4021c
        public boolean e() {
            return this.f40151d;
        }

        @Override // z3.InterfaceC4021c
        public void f(Modifier modifier, Composer composer, int i8) {
            AbstractC3159y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(-289202489);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-289202489, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.SelectSavedPaymentMethods.Content (PaymentSheetScreen.kt:168)");
            }
            U.j(this.f40148a, this.f40149b, modifier, startRestartGroup, (i8 << 6) & 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // z3.InterfaceC4021c
        public boolean g() {
            return this.f40156i;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K h(boolean z8, boolean z9) {
            InterfaceC3983b a8;
            if (z8 && z9) {
                a8 = null;
            } else {
                a8 = AbstractC3984c.a(w.f37443f0);
            }
            return v4.g.n(a8);
        }

        @Override // z3.InterfaceC4021c
        public float l() {
            return this.f40153f;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K m() {
            return v4.g.m(this.f40148a.getState(), new C0929c());
        }

        @Override // z3.InterfaceC4021c
        public float o() {
            return this.f40152e;
        }

        @Override // z3.InterfaceC4021c
        public float r() {
            return this.f40154g;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K t(boolean z8) {
            return v4.g.n(Boolean.valueOf(z8));
        }

        public final b w() {
            return this.f40149b;
        }

        public /* synthetic */ j(V v8, b bVar, int i8, AbstractC3151p abstractC3151p) {
            this(v8, (i8 & 2) != 0 ? b.a.f40160a : bVar);
        }
    }

    /* renamed from: z3.c$l */
    /* loaded from: classes4.dex */
    public static final class l implements InterfaceC4021c, Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final s f40174a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f40175b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC3349K f40176c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f40177d;

        /* renamed from: e, reason: collision with root package name */
        private final float f40178e;

        /* renamed from: f, reason: collision with root package name */
        private final float f40179f;

        /* renamed from: g, reason: collision with root package name */
        private final float f40180g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f40181h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z3.c$l$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f40183b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f40184c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f40183b = modifier;
                this.f40184c = i8;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6474a;
            }

            public final void invoke(Composer composer, int i8) {
                l.this.f(this.f40183b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40184c | 1));
            }
        }

        public l(s interactor, boolean z8) {
            AbstractC3159y.i(interactor, "interactor");
            this.f40174a = interactor;
            this.f40175b = z8;
            this.f40176c = v4.g.n(new C4019a(true, null, 2, null));
            this.f40177d = true;
            this.f40178e = Dp.m5178constructorimpl(0);
            this.f40179f = AbstractC4022d.c();
            this.f40180g = AbstractC4022d.d();
            this.f40181h = true;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K a() {
            return this.f40176c;
        }

        @Override // z3.InterfaceC4021c
        public EnumC0926c b() {
            return e.a(this);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f40174a.close();
        }

        @Override // z3.InterfaceC4021c
        public boolean e() {
            return this.f40177d;
        }

        @Override // z3.InterfaceC4021c
        public void f(Modifier modifier, Composer composer, int i8) {
            AbstractC3159y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(1422248203);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1422248203, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.VerticalModeForm.Content (PaymentSheetScreen.kt:403)");
            }
            t.b(this.f40174a, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // z3.InterfaceC4021c
        public boolean g() {
            return this.f40181h;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K h(boolean z8, boolean z9) {
            return v4.g.n(null);
        }

        @Override // z3.InterfaceC4021c
        public float l() {
            return this.f40179f;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K m() {
            return v4.g.n(H.f4820a.a(this.f40174a.b(), this.f40174a.a(), G.a.b.f4819a));
        }

        @Override // z3.InterfaceC4021c
        public float o() {
            return this.f40178e;
        }

        @Override // z3.InterfaceC4021c
        public float r() {
            return this.f40180g;
        }

        @Override // z3.InterfaceC4021c
        public InterfaceC3349K t(boolean z8) {
            return v4.g.n(Boolean.valueOf(this.f40175b));
        }

        public /* synthetic */ l(s sVar, boolean z8, int i8, AbstractC3151p abstractC3151p) {
            this(sVar, (i8 & 2) != 0 ? false : z8);
        }
    }
}
