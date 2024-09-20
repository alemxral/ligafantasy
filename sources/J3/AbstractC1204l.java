package J3;

import J3.C1207o;
import J3.InterfaceC1205m;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.InteractiveComponentSizeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.ripple.RippleThemeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import e4.I0;
import j2.AbstractC3053E;
import j4.AbstractC3080f;
import j4.AbstractC3087m;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import m4.C0;
import m4.p0;
import m4.u0;
import t4.AbstractC3794a;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;

/* renamed from: J3.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1204l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.l$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f5278a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f5279b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1 function1, MutableState mutableState) {
            super(0);
            this.f5278a = function1;
            this.f5279b = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m32invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m32invoke() {
            if (AbstractC1204l.b(this.f5279b)) {
                return;
            }
            AbstractC1204l.c(this.f5279b, true);
            this.f5278a.invoke(InterfaceC1205m.c.f5323a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.l$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f5280a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f5281b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function1 function1, MutableState mutableState) {
            super(1);
            this.f5280a = function1;
            this.f5281b = mutableState;
        }

        public final void a(C1207o.a item) {
            AbstractC3159y.i(item, "item");
            AbstractC1204l.c(this.f5281b, false);
            this.f5280a.invoke(new InterfaceC1205m.a(item));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1207o.a) obj);
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.l$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f5282a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f5283b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function1 function1, MutableState mutableState) {
            super(0);
            this.f5282a = function1;
            this.f5283b = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m33invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m33invoke() {
            AbstractC1204l.c(this.f5283b, false);
            this.f5282a.invoke(InterfaceC1205m.b.f5322a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.l$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1207o f5284a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f5285b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5286c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C1207o c1207o, Function1 function1, int i8) {
            super(2);
            this.f5284a = c1207o;
            this.f5285b = function1;
            this.f5286c = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1204l.a(this.f5284a, this.f5285b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5286c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.l$e */
    /* loaded from: classes4.dex */
    public /* synthetic */ class e extends C3156v implements Function1 {
        e(Object obj) {
            super(1, obj, InterfaceC1206n.class, "handleViewAction", "handleViewAction(Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction;)V", 0);
        }

        public final void d(InterfaceC1205m p02) {
            AbstractC3159y.i(p02, "p0");
            ((InterfaceC1206n) this.receiver).c(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((InterfaceC1205m) obj);
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.l$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1206n f5287a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f5288b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5289c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5290d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC1206n interfaceC1206n, Modifier modifier, int i8, int i9) {
            super(2);
            this.f5287a = interfaceC1206n;
            this.f5288b = modifier;
            this.f5289c = i8;
            this.f5290d = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1204l.d(this.f5287a, this.f5288b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5289c | 1), this.f5290d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.l$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1207o f5291a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f5292b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f5293c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.l$g$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f5294a = new a();

            a() {
                super(1);
            }

            public final void invoke(String it) {
                AbstractC3159y.i(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return L5.I.f6474a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.l$g$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3160z implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Modifier f5295a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Modifier modifier) {
                super(2);
                this.f5295a = modifier;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return L5.I.f6474a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1623512054, i8, -1, "com.stripe.android.paymentsheet.ui.EditPaymentMethodUi.<anonymous>.<anonymous>.<anonymous> (EditPaymentMethod.kt:105)");
                }
                AbstractC1204l.g(StringResources_androidKt.stringResource(AbstractC3053E.f32854a, composer, 0), this.f5295a, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.l$g$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3160z implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1207o f5296a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f5297b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C1207o c1207o, Function1 function1) {
                super(2);
                this.f5296a = c1207o;
                this.f5297b = function1;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return L5.I.f6474a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1857875321, i8, -1, "com.stripe.android.paymentsheet.ui.EditPaymentMethodUi.<anonymous>.<anonymous>.<anonymous> (EditPaymentMethod.kt:111)");
                }
                AbstractC1204l.a(this.f5296a, this.f5297b, composer, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C1207o c1207o, Modifier modifier, Function1 function1) {
            super(2);
            this.f5291a = c1207o;
            this.f5292b = modifier;
            this.f5293c = function1;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1330496850, i8, -1, "com.stripe.android.paymentsheet.ui.EditPaymentMethodUi.<anonymous>.<anonymous> (EditPaymentMethod.kt:97)");
            }
            TextFieldColors d8 = C0.d(false, composer, 6, 0);
            TextFieldKt.TextField("•••• •••• •••• " + this.f5291a.g(), (Function1) a.f5294a, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), false, false, (TextStyle) null, (X5.n) ComposableLambdaKt.composableLambda(composer, 1623512054, true, new b(this.f5292b)), (X5.n) null, (X5.n) null, (X5.n) ComposableLambdaKt.composableLambda(composer, 1857875321, true, new c(this.f5291a, this.f5293c)), false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, d8, composer, 806882736, 0, 523696);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.l$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f5298a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Function1 function1) {
            super(0);
            this.f5298a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m34invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m34invoke() {
            this.f5298a.invoke(InterfaceC1205m.g.f5327a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.l$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f5299a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Function1 function1) {
            super(0);
            this.f5299a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m35invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m35invoke() {
            this.f5299a.invoke(InterfaceC1205m.f.f5326a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.l$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f5300a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Function1 function1) {
            super(0);
            this.f5300a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m36invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m36invoke() {
            this.f5300a.invoke(InterfaceC1205m.e.f5325a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.l$k */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f5301a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Function1 function1) {
            super(0);
            this.f5301a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m37invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m37invoke() {
            this.f5301a.invoke(InterfaceC1205m.d.f5324a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.l$l, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0105l extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1207o f5302a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f5303b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f5304c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5305d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f5306e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0105l(C1207o c1207o, Function1 function1, Modifier modifier, int i8, int i9) {
            super(2);
            this.f5302a = c1207o;
            this.f5303b = function1;
            this.f5304c = modifier;
            this.f5305d = i8;
            this.f5306e = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1204l.f(this.f5302a, this.f5303b, this.f5304c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5305d | 1), this.f5306e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.l$m */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5307a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f5308b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5309c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, Modifier modifier, int i8) {
            super(2);
            this.f5307a = str;
            this.f5308b = modifier;
            this.f5309c = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1204l.g(this.f5307a, this.f5308b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5309c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.l$n */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f5310a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f5311b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f5312c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.l$n$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ BoxScope f5313a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f5314b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f5315c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0 f5316d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(BoxScope boxScope, boolean z8, boolean z9, Function0 function0) {
                super(2);
                this.f5313a = boxScope;
                this.f5314b = z8;
                this.f5315c = z9;
                this.f5316d = function0;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return L5.I.f6474a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(649323835, i8, -1, "com.stripe.android.paymentsheet.ui.RemoveButton.<anonymous>.<anonymous>.<anonymous> (EditPaymentMethod.kt:204)");
                }
                ButtonKt.TextButton(this.f5316d, this.f5313a.align(Modifier.Companion, Alignment.Companion.getCenter()), this.f5314b && !this.f5315c, null, null, AbstractC3087m.o(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).f(), null, null, null, C1198f.f5160a.a(), composer, 805306368, 472);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(boolean z8, boolean z9, Function0 function0) {
            super(2);
            this.f5310a = z8;
            this.f5311b = z9;
            this.f5312c = function0;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(934400577, i8, -1, "com.stripe.android.paymentsheet.ui.RemoveButton.<anonymous> (EditPaymentMethod.kt:193)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f8 = 8;
            Modifier m561offsetVpY3zN4$default = OffsetKt.m561offsetVpY3zN4$default(PaddingKt.m604paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(TestTagKt.testTag(companion, "PaymentSheetEditScreenRemoveButton"), 0.0f, 1, null), Dp.m5178constructorimpl(f8), 0.0f, Dp.m5178constructorimpl(f8), 0.0f, 10, null), 0.0f, Dp.m5178constructorimpl(f8), 1, null);
            boolean z8 = this.f5310a;
            boolean z9 = this.f5311b;
            Function0 function0 = this.f5312c;
            composer.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m561offsetVpY3zN4$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m2496constructorimpl = Updater.m2496constructorimpl(composer);
            Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentEnforcement().provides(Boolean.FALSE)}, ComposableLambdaKt.composableLambda(composer, 649323835, true, new a(boxScopeInstance, z9, z8, function0)), composer, 56);
            composer.startReplaceableGroup(-245509255);
            if (z8) {
                q2.b.b(boxScopeInstance.align(companion, companion2.getCenterEnd()), MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1172getError0d7_KjU(), composer, 0, 0);
            }
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.l$o */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f5317a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f5318b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f5319c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5320d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(boolean z8, boolean z9, Function0 function0, int i8) {
            super(2);
            this.f5317a = z8;
            this.f5318b = z9;
            this.f5319c = function0;
            this.f5320d = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1204l.h(this.f5317a, this.f5318b, this.f5319c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5320d | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C1207o c1207o, Function1 function1, Composer composer, int i8) {
        boolean z8;
        boolean z9;
        Composer startRestartGroup = composer.startRestartGroup(1943978362);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1943978362, i8, -1, "com.stripe.android.paymentsheet.ui.Dropdown (EditPaymentMethod.kt:232)");
        }
        startRestartGroup.startReplaceableGroup(-1126873801);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        Modifier.Companion companion2 = Modifier.Companion;
        startRestartGroup.startReplaceableGroup(-1126870188);
        int i9 = (i8 & 112) ^ 48;
        boolean z10 = true;
        if ((i9 > 32 && startRestartGroup.changed(function1)) || (i8 & 48) == 32) {
            z8 = true;
        } else {
            z8 = false;
        }
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (z8 || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new a(function1, mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        Modifier testTag = TestTagKt.testTag(ClickableKt.m315clickableXHw0xAI$default(companion2, false, null, null, (Function0) rememberedValue2, 7, null), "dropdown_menu_clickable");
        startRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion3 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
        Function0 constructor = companion4.getConstructor();
        X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(testTag);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2496constructorimpl = Updater.m2496constructorimpl(startRestartGroup);
        Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier m600padding3ABfNKs = PaddingKt.m600padding3ABfNKs(companion2, Dp.m5178constructorimpl(10));
        Alignment.Vertical centerVertically = companion3.getCenterVertically();
        Arrangement.HorizontalOrVertical m514spacedBy0680j_4 = Arrangement.INSTANCE.m514spacedBy0680j_4(Dp.m5178constructorimpl(4));
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m514spacedBy0680j_4, centerVertically, startRestartGroup, 54);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0 constructor2 = companion4.getConstructor();
        X5.o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m600padding3ABfNKs);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor2);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2496constructorimpl2 = Updater.m2496constructorimpl(startRestartGroup);
        Updater.m2503setimpl(m2496constructorimpl2, rowMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
        if (m2496constructorimpl2.getInserting() || !AbstractC3159y.d(m2496constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m2496constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m2496constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(c1207o.h().getIcon().intValue(), startRestartGroup, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 56, 124);
        IconKt.m1266Iconww6aTOc(PainterResources_androidKt.painterResource(AbstractC3080f.f33162a, startRestartGroup, 0), (String) null, (Modifier) null, 0L, startRestartGroup, 56, 12);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        boolean b8 = b(mutableState);
        InterfaceC3983b a8 = AbstractC3984c.a(AbstractC3053E.f32851X);
        C1207o.a h8 = c1207o.h();
        List a9 = c1207o.a();
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i10 = MaterialTheme.$stable;
        long j8 = AbstractC3087m.n(materialTheme, startRestartGroup, i10).j();
        long h9 = AbstractC3087m.n(materialTheme, startRestartGroup, i10).h();
        startRestartGroup.startReplaceableGroup(-533242456);
        if ((i9 > 32 && startRestartGroup.changed(function1)) || (i8 & 48) == 32) {
            z9 = true;
        } else {
            z9 = false;
        }
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (z9 || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new b(function1, mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        Function1 function12 = (Function1) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-533235523);
        if ((i9 <= 32 || !startRestartGroup.changed(function1)) && (i8 & 48) != 32) {
            z10 = false;
        }
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (z10 || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new c(function1, mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        startRestartGroup.endReplaceableGroup();
        u0.b(b8, a8, h8, a9, function12, j8, h9, (Function0) rememberedValue4, startRestartGroup, 4160);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(c1207o, function1, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean b(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(MutableState mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    public static final void d(InterfaceC1206n interactor, Modifier modifier, Composer composer, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        AbstractC3159y.i(interactor, "interactor");
        Composer startRestartGroup = composer.startRestartGroup(958707926);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(interactor)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            i10 = i8;
        }
        int i13 = i9 & 2;
        if (i13 != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i10 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(958707926, i10, -1, "com.stripe.android.paymentsheet.ui.EditPaymentMethod (EditPaymentMethod.kt:71)");
            }
            f(e(v4.f.a(interactor.b(), startRestartGroup, 8)), new e(interactor), modifier, startRestartGroup, ((i10 << 3) & 896) | 8, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new f(interactor, modifier, i8, i9));
        }
    }

    private static final C1207o e(State state) {
        return (C1207o) state.getValue();
    }

    public static final void f(C1207o viewState, Function1 viewActionHandler, Modifier modifier, Composer composer, int i8, int i9) {
        AbstractC3159y.i(viewState, "viewState");
        AbstractC3159y.i(viewActionHandler, "viewActionHandler");
        Composer startRestartGroup = composer.startRestartGroup(124818519);
        Modifier modifier2 = (i9 & 4) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(124818519, i8, -1, "com.stripe.android.paymentsheet.ui.EditPaymentMethodUi (EditPaymentMethod.kt:86)");
        }
        float dimensionResource = PrimitiveResources_androidKt.dimensionResource(q3.s.f37371e, startRestartGroup, 0);
        boolean z8 = viewState.i() == C1207o.b.f5340a;
        Modifier testTag = TestTagKt.testTag(PaddingKt.m602paddingVpY3zN4$default(modifier2, dimensionResource, 0.0f, 2, null), "TEST_TAG_PAYMENT_SHEET_EDIT_SCREEN");
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(testTag);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2496constructorimpl = Updater.m2496constructorimpl(startRestartGroup);
        Updater.m2503setimpl(m2496constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        boolean z9 = z8;
        Modifier modifier3 = modifier2;
        p0.b(null, null, false, 0L, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1330496850, true, new g(viewState, modifier2, viewActionHandler)), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
        Modifier.Companion companion2 = Modifier.Companion;
        SpacerKt.Spacer(SizeKt.m636requiredHeight3ABfNKs(companion2, Dp.m5178constructorimpl(32)), startRestartGroup, 6);
        InterfaceC3983b f8 = viewState.f();
        startRestartGroup.startReplaceableGroup(1368256471);
        if (f8 != null) {
            AbstractC1208p.a(AbstractC3794a.a(f8, startRestartGroup, 8), PaddingKt.m604paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, Dp.m5178constructorimpl(8), 7, null), startRestartGroup, 48, 0);
        }
        startRestartGroup.endReplaceableGroup();
        String stringResource = StringResources_androidKt.stringResource(AbstractC3053E.f32839M0, startRestartGroup, 0);
        boolean z10 = viewState.i() == C1207o.b.f5341b;
        boolean z11 = viewState.c() && z9;
        Modifier testTag2 = TestTagKt.testTag(companion2, "TEST_TAG_EDIT_SCREEN_UPDATE_BUTTON");
        startRestartGroup.startReplaceableGroup(1368271973);
        int i10 = (i8 & 112) ^ 48;
        boolean z12 = (i10 > 32 && startRestartGroup.changed(viewActionHandler)) || (i8 & 48) == 32;
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z12 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new h(viewActionHandler);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        q2.c.a(stringResource, z11, (Function0) rememberedValue, testTag2, z10, false, startRestartGroup, 3072, 32);
        startRestartGroup.startReplaceableGroup(1368276737);
        if (viewState.b()) {
            boolean z13 = viewState.i() == C1207o.b.f5342c;
            startRestartGroup.startReplaceableGroup(1368282974);
            boolean z14 = (i10 > 32 && startRestartGroup.changed(viewActionHandler)) || (i8 & 48) == 32;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z14 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new i(viewActionHandler);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            h(z9, z13, (Function0) rememberedValue2, startRestartGroup, 0);
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (viewState.d()) {
            String stringResource2 = StringResources_androidKt.stringResource(q3.w.f37430Y, new Object[]{AbstractC3794a.a(viewState.e(), startRestartGroup, 8)}, startRestartGroup, 64);
            String stringResource3 = StringResources_androidKt.stringResource(AbstractC3053E.f32853Z, new Object[]{viewState.h().a().h(), viewState.g()}, startRestartGroup, 64);
            String stringResource4 = StringResources_androidKt.stringResource(AbstractC3053E.f32825F0, startRestartGroup, 0);
            String stringResource5 = StringResources_androidKt.stringResource(AbstractC3053E.f32849V, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(692289345);
            boolean z15 = (i10 > 32 && startRestartGroup.changed(viewActionHandler)) || (i8 & 48) == 32;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z15 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new j(viewActionHandler);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Function0 function0 = (Function0) rememberedValue3;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(692291725);
            boolean z16 = (i10 > 32 && startRestartGroup.changed(viewActionHandler)) || (48 & i8) == 32;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (z16 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new k(viewActionHandler);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            I0.a(stringResource2, stringResource3, stringResource4, stringResource5, true, function0, (Function0) rememberedValue4, startRestartGroup, 24576, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C0105l(viewState, viewActionHandler, modifier3, i8, i9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(String str, Modifier modifier, Composer composer, int i8) {
        int i9;
        Composer composer2;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(1417892261);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(str)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i11 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        int i12 = i9;
        if ((i12 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1417892261, i12, -1, "com.stripe.android.paymentsheet.ui.Label (EditPaymentMethod.kt:173)");
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i13 = MaterialTheme.$stable;
            composer2 = startRestartGroup;
            TextKt.m1414Text4IGK_g(str, modifier, Color.m2970copywmQWz5c$default(AbstractC3087m.n(materialTheme, startRestartGroup, i13).i(), ContentAlpha.INSTANCE.getDisabled(startRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, materialTheme.getTypography(startRestartGroup, i13).getSubtitle1(), composer2, i12 & 126, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new m(str, modifier, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(boolean z8, boolean z9, Function0 function0, Composer composer, int i8) {
        int i9;
        float high;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-336781567);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i9 = i12 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(z9)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i9 |= i11;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i9 |= i10;
        }
        if ((i9 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-336781567, i9, -1, "com.stripe.android.paymentsheet.ui.RemoveButton (EditPaymentMethod.kt:188)");
            }
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            if (z9) {
                startRestartGroup.startReplaceableGroup(701837750);
                high = ContentAlpha.INSTANCE.getDisabled(startRestartGroup, ContentAlpha.$stable);
            } else {
                startRestartGroup.startReplaceableGroup(701838610);
                high = ContentAlpha.INSTANCE.getHigh(startRestartGroup, ContentAlpha.$stable);
            }
            startRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{localContentAlpha.provides(Float.valueOf(high)), RippleThemeKt.getLocalRippleTheme().provides(C1209q.f5349a)}, ComposableLambdaKt.composableLambda(startRestartGroup, 934400577, true, new n(z9, z8, function0)), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new o(z8, z9, function0, i8));
        }
    }
}
