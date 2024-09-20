package J3;

import J3.V;
import M5.a0;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.p;
import j4.AbstractC3087m;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3349K;
import m4.p0;
import q3.C3654g;
import t4.AbstractC3794a;
import y2.InterfaceC3983b;
import y3.AbstractC3991f;
import z3.InterfaceC4021c;

/* loaded from: classes4.dex */
public abstract class U {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f4966a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4967b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f4968c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f4969d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4970e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f4971f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f8, boolean z8, Function0 function0, Modifier modifier, int i8, int i9) {
            super(2);
            this.f4966a = f8;
            this.f4967b = z8;
            this.f4968c = function0;
            this.f4969d = modifier;
            this.f4970e = i8;
            this.f4971f = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            U.a(this.f4966a, this.f4967b, this.f4968c, this.f4969d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4970e | 1), this.f4971f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f4972a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4973b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusManager f4974c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, FocusManager focusManager, P5.d dVar) {
            super(2, dVar);
            this.f4973b = z8;
            this.f4974c = focusManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f4973b, this.f4974c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f4972a == 0) {
                L5.t.b(obj);
                if (this.f4973b) {
                    androidx.compose.ui.focus.b.a(this.f4974c, false, 1, null);
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f4975a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f4976b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f4977c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i8, MutableState mutableState, P5.d dVar) {
            super(2, dVar);
            this.f4976b = i8;
            this.f4977c = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f4976b, this.f4977c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f4975a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                long j8 = this.f4976b;
                this.f4975a = 1;
                if (i6.X.b(j8, this) == e8) {
                    return e8;
                }
            }
            U.c(this.f4977c, true);
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f4978a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Integer invoke(int i8) {
            return Integer.valueOf(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ State f4979a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e4.S f4980b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4981c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ FocusRequester f4982d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e4.S f4983a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f4984b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ FocusRequester f4985c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e4.S s8, boolean z8, FocusRequester focusRequester) {
                super(2);
                this.f4983a = s8;
                this.f4984b = z8;
                this.f4985c = focusRequester;
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
                    ComposerKt.traceEventStart(408385964, i8, -1, "com.stripe.android.paymentsheet.ui.CvcRecollectionField.<anonymous>.<anonymous>.<anonymous> (SavedPaymentMethodTabLayoutUI.kt:471)");
                }
                e4.Q i9 = this.f4983a.i();
                boolean z8 = !this.f4984b;
                e4.S s8 = this.f4983a;
                Modifier focusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), this.f4985c);
                Set f8 = a0.f();
                FocusDirection.Companion companion = FocusDirection.Companion;
                i9.f(z8, s8, focusRequester, f8, null, companion.m2660getExitdhqQ8s(), companion.m2663getPreviousdhqQ8s(), composer, (e4.S.f30522f << 3) | 27648 | (m4.G.f35059d << 9) | (e4.Q.f30476x << 21));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(State state, e4.S s8, boolean z8, FocusRequester focusRequester) {
            super(3);
            this.f4979a = state;
            this.f4980b = s8;
            this.f4981c = z8;
            this.f4982d = focusRequester;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
            AbstractC3159y.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1074270777, i8, -1, "com.stripe.android.paymentsheet.ui.CvcRecollectionField.<anonymous> (SavedPaymentMethodTabLayoutUI.kt:458)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f8 = 20;
            float f9 = 0;
            Modifier m603paddingqDBjuR0 = PaddingKt.m603paddingqDBjuR0(companion, Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(f9));
            State state = this.f4979a;
            e4.S s8 = this.f4980b;
            boolean z8 = this.f4981c;
            FocusRequester focusRequester = this.f4982d;
            composer.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m603paddingqDBjuR0);
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
            Updater.m2503setimpl(m2496constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String stringResource = StringResources_androidKt.stringResource(q3.w.f37412G, composer, 0);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i9 = MaterialTheme.$stable;
            TextKt.m1414Text4IGK_g(stringResource, (Modifier) null, AbstractC3087m.n(materialTheme, composer, i9).j(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, materialTheme.getTypography(composer, i9).getBody1(), composer, 0, 0, 65530);
            float f10 = 8;
            p0.b(IntrinsicKt.height(PaddingKt.m603paddingqDBjuR0(companion, Dp.m5178constructorimpl(f9), Dp.m5178constructorimpl(f10), Dp.m5178constructorimpl(f9), Dp.m5178constructorimpl(f10)), IntrinsicSize.Min), null, false, 0L, null, ComposableLambdaKt.composableLambda(composer, 408385964, true, new a(s8, z8, focusRequester)), composer, 196614, 30);
            m4.C c8 = (m4.C) state.getValue();
            Integer valueOf = c8 != null ? Integer.valueOf(c8.a()) : null;
            composer.startReplaceableGroup(272129292);
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                composer.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Function0 constructor2 = companion3.getConstructor();
                X5.o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer m2496constructorimpl2 = Updater.m2496constructorimpl(composer);
                Updater.m2503setimpl(m2496constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m2503setimpl(m2496constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                X5.n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (m2496constructorimpl2.getInserting() || !AbstractC3159y.d(m2496constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2496constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2496constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                p0.c(StringResources_androidKt.stringResource(intValue, composer, 0), composer, 0);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
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
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f4986a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4987b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f4988c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f4989d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4990e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f4991f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC3349K interfaceC3349K, boolean z8, int i8, int i9, int i10, int i11) {
            super(2);
            this.f4986a = interfaceC3349K;
            this.f4987b = z8;
            this.f4988c = i8;
            this.f4989d = i9;
            this.f4990e = i10;
            this.f4991f = i11;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            U.b(this.f4986a, this.f4987b, this.f4988c, this.f4989d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4990e | 1), this.f4991f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f4992a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Function1 function1) {
            super(0);
            this.f4992a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m22invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m22invoke() {
            this.f4992a.invoke(AbstractC3991f.c.f39757a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f4993a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4994b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4995c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f4996d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f4997e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f4998f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f4999g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(float f8, boolean z8, boolean z9, Function1 function1, Modifier modifier, int i8, int i9) {
            super(2);
            this.f4993a = f8;
            this.f4994b = z8;
            this.f4995c = z9;
            this.f4996d = function1;
            this.f4997e = modifier;
            this.f4998f = i8;
            this.f4999g = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            U.f(this.f4993a, this.f4994b, this.f4995c, this.f4996d, this.f4997e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4998f | 1), this.f4999g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f5000a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Function1 function1) {
            super(0);
            this.f5000a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m23invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m23invoke() {
            this.f5000a.invoke(AbstractC3991f.d.f39758a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f5001a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f5002b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5003c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f5004d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f5005e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f5006f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f5007g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(float f8, boolean z8, boolean z9, Function1 function1, Modifier modifier, int i8, int i9) {
            super(2);
            this.f5001a = f8;
            this.f5002b = z8;
            this.f5003c = z9;
            this.f5004d = function1;
            this.f5005e = modifier;
            this.f5006f = i8;
            this.f5007g = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            U.g(this.f5001a, this.f5002b, this.f5003c, this.f5004d, this.f5005e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5006f | 1), this.f5007g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.p f5008a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f5009b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5010c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f5011d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f5012e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f5013f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f5014g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f5015h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f5016i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Modifier f5017j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f5018k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f5019l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(com.stripe.android.paymentsheet.p pVar, float f8, boolean z8, boolean z9, boolean z10, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i8, int i9) {
            super(2);
            this.f5008a = pVar;
            this.f5009b = f8;
            this.f5010c = z8;
            this.f5011d = z9;
            this.f5012e = z10;
            this.f5013f = function0;
            this.f5014g = function1;
            this.f5015h = function12;
            this.f5016i = function13;
            this.f5017j = modifier;
            this.f5018k = i8;
            this.f5019l = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            U.i(this.f5008a, this.f5009b, this.f5010c, this.f5011d, this.f5012e, this.f5013f, this.f5014g, this.f5015h, this.f5016i, this.f5017j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5018k | 1), this.f5019l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f5020a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f5021b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5022c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z8, String str, boolean z9) {
            super(1);
            this.f5020a = z8;
            this.f5021b = str;
            this.f5022c = z9;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return L5.I.f6474a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3159y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.setTestTag(semantics, "PaymentSheetSavedPaymentOption");
            SemanticsPropertiesKt.setSelected(semantics, this.f5020a);
            SemanticsPropertiesKt.setText(semantics, new AnnotatedString(this.f5021b, null, null, 6, null));
            if (this.f5022c) {
                return;
            }
            SemanticsPropertiesKt.disabled(semantics);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f5023a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p.d f5024b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Function1 function1, p.d dVar) {
            super(0);
            this.f5023a = function1;
            this.f5024b = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m24invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m24invoke() {
            this.f5023a.invoke(this.f5024b.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f5025a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p.d f5026b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Function1 function1, p.d dVar) {
            super(0);
            this.f5025a = function1;
            this.f5026b = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m25invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m25invoke() {
            this.f5025a.invoke(this.f5026b.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f5027a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p.d f5028b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(Function1 function1, p.d dVar) {
            super(0);
            this.f5027a = function1;
            this.f5028b = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m26invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m26invoke() {
            this.f5027a.invoke(com.stripe.android.paymentsheet.s.c(this.f5028b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p.d f5029a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f5030b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5031c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f5032d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f5033e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f5034f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f5035g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f5036h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f5037i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Modifier f5038j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f5039k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f5040l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(p.d dVar, float f8, boolean z8, boolean z9, boolean z10, boolean z11, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i8, int i9) {
            super(2);
            this.f5029a = dVar;
            this.f5030b = f8;
            this.f5031c = z8;
            this.f5032d = z9;
            this.f5033e = z10;
            this.f5034f = z11;
            this.f5035g = function1;
            this.f5036h = function12;
            this.f5037i = function13;
            this.f5038j = modifier;
            this.f5039k = i8;
            this.f5040l = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            U.h(this.f5029a, this.f5030b, this.f5031c, this.f5032d, this.f5033e, this.f5034f, this.f5035g, this.f5036h, this.f5037i, this.f5038j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5039k | 1), this.f5040l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class q extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p.d f5041a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f5042b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5043c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f5044d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f5045e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f5046f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f5047g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f5048h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f5049i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Modifier f5050j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f5051k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f5052l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(p.d dVar, float f8, boolean z8, boolean z9, boolean z10, boolean z11, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i8, int i9) {
            super(2);
            this.f5041a = dVar;
            this.f5042b = f8;
            this.f5043c = z8;
            this.f5044d = z9;
            this.f5045e = z10;
            this.f5046f = z11;
            this.f5047g = function1;
            this.f5048h = function12;
            this.f5049i = function13;
            this.f5050j = modifier;
            this.f5051k = i8;
            this.f5052l = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            U.h(this.f5041a, this.f5042b, this.f5043c, this.f5044d, this.f5045e, this.f5046f, this.f5047g, this.f5048h, this.f5049i, this.f5050j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5051k | 1), this.f5052l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class r extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V f5053a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(V v8) {
            super(0);
            this.f5053a = v8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m27invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m27invoke() {
            this.f5053a.b(V.b.a.f5113a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class s extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V f5054a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(V v8) {
            super(1);
            this.f5054a = v8;
        }

        public final void a(AbstractC3991f abstractC3991f) {
            this.f5054a.b(new V.b.d(abstractC3991f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC3991f) obj);
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class t extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V f5055a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(V v8) {
            super(1);
            this.f5055a = v8;
        }

        public final void a(com.stripe.android.model.o it) {
            AbstractC3159y.i(it, "it");
            this.f5055a.b(new V.b.c(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.model.o) obj);
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class u extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V f5056a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(V v8) {
            super(1);
            this.f5056a = v8;
        }

        public final void a(com.stripe.android.model.o it) {
            AbstractC3159y.i(it, "it");
            this.f5056a.b(new V.b.C0095b(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.model.o) obj);
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class v extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V f5057a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4021c.j.b f5058b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f5059c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5060d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(V v8, InterfaceC4021c.j.b bVar, Modifier modifier, int i8) {
            super(2);
            this.f5057a = v8;
            this.f5058b = bVar;
            this.f5059c = modifier;
            this.f5060d = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            U.j(this.f5057a, this.f5058b, this.f5059c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5060d | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class w extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f5061a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LazyListState f5062b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f5063c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f5064d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.p f5065e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f5066f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f5067g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f5068h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f5069i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f5070a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f5071b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f5072c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.paymentsheet.p f5073d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ float f5074e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0 f5075f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1 f5076g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1 f5077h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function1 f5078i;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: J3.U$w$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0094a extends AbstractC3160z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                public static final C0094a f5079a = new C0094a();

                C0094a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(com.stripe.android.paymentsheet.p it) {
                    AbstractC3159y.i(it, "it");
                    return com.stripe.android.paymentsheet.q.a(it);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC3160z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                public static final b f5080a = new b();

                b() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return L5.I.f6474a;
                }

                public final void invoke(SemanticsPropertyReceiver semantics) {
                    AbstractC3159y.i(semantics, "$this$semantics");
                    SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
                }
            }

            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3160z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                public static final c f5081a = new c();

                public c() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(Object obj) {
                    return null;
                }
            }

            /* loaded from: classes4.dex */
            public static final class d extends AbstractC3160z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function1 f5082a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ List f5083b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(Function1 function1, List list) {
                    super(1);
                    this.f5082a = function1;
                    this.f5083b = list;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Object invoke(int i8) {
                    return this.f5082a.invoke(this.f5083b.get(i8));
                }
            }

            /* loaded from: classes4.dex */
            public static final class e extends AbstractC3160z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function1 f5084a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ List f5085b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(Function1 function1, List list) {
                    super(1);
                    this.f5084a = function1;
                    this.f5085b = list;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Object invoke(int i8) {
                    return this.f5084a.invoke(this.f5085b.get(i8));
                }
            }

            /* loaded from: classes4.dex */
            public static final class f extends AbstractC3160z implements X5.p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List f5086a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f5087b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f5088c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ com.stripe.android.paymentsheet.p f5089d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ float f5090e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function0 f5091f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function1 f5092g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Function1 f5093h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ Function1 f5094i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(List list, boolean z8, boolean z9, com.stripe.android.paymentsheet.p pVar, float f8, Function0 function0, Function1 function1, Function1 function12, Function1 function13) {
                    super(4);
                    this.f5086a = list;
                    this.f5087b = z8;
                    this.f5088c = z9;
                    this.f5089d = pVar;
                    this.f5090e = f8;
                    this.f5091f = function0;
                    this.f5092g = function1;
                    this.f5093h = function12;
                    this.f5094i = function13;
                }

                @Override // X5.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                    return L5.I.f6474a;
                }

                public final void invoke(LazyItemScope items, int i8, Composer composer, int i9) {
                    int i10;
                    AbstractC3159y.i(items, "$this$items");
                    if ((i9 & 14) == 0) {
                        i10 = i9 | (composer.changed(items) ? 4 : 2);
                    } else {
                        i10 = i9;
                    }
                    if ((i9 & 112) == 0) {
                        i10 |= composer.changed(i8) ? 32 : 16;
                    }
                    if ((i10 & 731) == 146 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i10, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)");
                    }
                    com.stripe.android.paymentsheet.p pVar = (com.stripe.android.paymentsheet.p) this.f5086a.get(i8);
                    composer.startReplaceableGroup(1592562601);
                    boolean z8 = !this.f5087b && (!this.f5088c || pVar.b());
                    U.i(pVar, this.f5090e, z8, this.f5088c, AbstractC3159y.d(pVar, this.f5089d) && !this.f5088c, this.f5091f, this.f5092g, this.f5093h, this.f5094i, androidx.compose.foundation.lazy.a.a(items, TestTagKt.testTag(SemanticsModifierKt.semantics$default(Modifier.Companion, false, b.f5080a, 1, null), pVar.a().name()), null, 1, null), composer, 0, 0);
                    composer.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list, boolean z8, boolean z9, com.stripe.android.paymentsheet.p pVar, float f8, Function0 function0, Function1 function1, Function1 function12, Function1 function13) {
                super(1);
                this.f5070a = list;
                this.f5071b = z8;
                this.f5072c = z9;
                this.f5073d = pVar;
                this.f5074e = f8;
                this.f5075f = function0;
                this.f5076g = function1;
                this.f5077h = function12;
                this.f5078i = function13;
            }

            public final void a(LazyListScope LazyRow) {
                d dVar;
                AbstractC3159y.i(LazyRow, "$this$LazyRow");
                List list = this.f5070a;
                C0094a c0094a = C0094a.f5079a;
                boolean z8 = this.f5071b;
                boolean z9 = this.f5072c;
                com.stripe.android.paymentsheet.p pVar = this.f5073d;
                float f8 = this.f5074e;
                Function0 function0 = this.f5075f;
                Function1 function1 = this.f5076g;
                Function1 function12 = this.f5077h;
                Function1 function13 = this.f5078i;
                c cVar = c.f5081a;
                int size = list.size();
                if (c0094a != null) {
                    dVar = new d(c0094a, list);
                } else {
                    dVar = null;
                }
                LazyRow.items(size, dVar, new e(cVar, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new f(list, z8, z9, pVar, f8, function0, function1, function12, function13)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((LazyListScope) obj);
                return L5.I.f6474a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(boolean z8, LazyListState lazyListState, List list, boolean z9, com.stripe.android.paymentsheet.p pVar, Function0 function0, Function1 function1, Function1 function12, Function1 function13) {
            super(3);
            this.f5061a = z8;
            this.f5062b = lazyListState;
            this.f5063c = list;
            this.f5064d = z9;
            this.f5065e = pVar;
            this.f5066f = function0;
            this.f5067g = function1;
            this.f5068h = function12;
            this.f5069i = function13;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i8) {
            int i9;
            AbstractC3159y.i(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i8 & 14) == 0) {
                i9 = i8 | (composer.changed(BoxWithConstraints) ? 4 : 2);
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(912695486, i9, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUI.<anonymous> (SavedPaymentMethodTabLayoutUI.kt:138)");
            }
            LazyDslKt.LazyRow(null, this.f5062b, PaddingKt.m595PaddingValuesYgX7TsA$default(Dp.m5178constructorimpl(17), 0.0f, 2, null), false, null, null, null, !this.f5061a, new a(this.f5063c, this.f5061a, this.f5064d, this.f5065e, U.s(BoxWithConstraints.mo540getMaxWidthD9Ej5fM(), composer, 0), this.f5066f, this.f5067g, this.f5068h, this.f5069i), composer, 384, 121);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class x extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f5095a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.p f5096b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5097c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f5098d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f5099e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f5100f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f5101g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f5102h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f5103i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LazyListState f5104j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f5105k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f5106l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(List list, com.stripe.android.paymentsheet.p pVar, boolean z8, boolean z9, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, LazyListState lazyListState, int i8, int i9) {
            super(2);
            this.f5095a = list;
            this.f5096b = pVar;
            this.f5097c = z8;
            this.f5098d = z9;
            this.f5099e = function0;
            this.f5100f = function1;
            this.f5101g = function12;
            this.f5102h = function13;
            this.f5103i = modifier;
            this.f5104j = lazyListState;
            this.f5105k = i8;
            this.f5106l = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            U.k(this.f5095a, this.f5096b, this.f5097c, this.f5098d, this.f5099e, this.f5100f, this.f5101g, this.f5102h, this.f5103i, this.f5104j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5105k | 1), this.f5106l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(float r29, boolean r30, kotlin.jvm.functions.Function0 r31, androidx.compose.ui.Modifier r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.U.a(float, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(InterfaceC3349K cvcControllerFlow, boolean z8, int i8, int i9, Composer composer, int i10, int i11) {
        int i12;
        int i13;
        boolean z9;
        AbstractC3159y.i(cvcControllerFlow, "cvcControllerFlow");
        Composer startRestartGroup = composer.startRestartGroup(685072799);
        if ((i11 & 4) != 0) {
            i12 = 500;
        } else {
            i12 = i8;
        }
        if ((i11 & 8) != 0) {
            i13 = 400;
        } else {
            i13 = i9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(685072799, i10, -1, "com.stripe.android.paymentsheet.ui.CvcRecollectionField (SavedPaymentMethodTabLayoutUI.kt:431)");
        }
        State a8 = v4.f.a(cvcControllerFlow, startRestartGroup, 8);
        State a9 = v4.f.a(d(a8).getError(), startRestartGroup, 8);
        e4.S s8 = new e4.S(new m4.G(), d(a8));
        startRestartGroup.startReplaceableGroup(-1879197778);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new FocusRequester();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        FocusRequester focusRequester = (FocusRequester) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-1879196205);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(Boolean.valueOf(z8), new b(z8, (FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager()), null), startRestartGroup, ((i10 >> 3) & 14) | 64);
        L5.I i14 = L5.I.f6474a;
        startRestartGroup.startReplaceableGroup(-1879186954);
        if ((((i10 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(i13)) || (i10 & 3072) == 2048) {
            z9 = true;
        } else {
            z9 = false;
        }
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (z9 || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new c(i13, mutableState, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(i14, (X5.n) rememberedValue3, startRestartGroup, 70);
        AnimatedVisibilityKt.AnimatedVisibility(e(mutableState), (Modifier) null, EnterExitTransitionKt.expandVertically$default(AnimationSpecKt.tween$default(i12, i13, null, 4, null), null, false, d.f4978a, 6, null), (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1074270777, true, new e(a9, s8, z8, focusRequester)), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new f(cvcControllerFlow, z8, i12, i13, i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(MutableState mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    private static final e4.Q d(State state) {
        return (e4.Q) state.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean e(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(float r30, boolean r31, boolean r32, kotlin.jvm.functions.Function1 r33, androidx.compose.ui.Modifier r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.U.f(float, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(float r30, boolean r31, boolean r32, kotlin.jvm.functions.Function1 r33, androidx.compose.ui.Modifier r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.U.g(float, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(p.d dVar, float f8, boolean z8, boolean z9, boolean z10, boolean z11, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        String a8;
        boolean z12;
        boolean z13;
        C c8;
        Composer startRestartGroup = composer.startRestartGroup(-411046220);
        if ((i9 & 512) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-411046220, i8, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTab (SavedPaymentMethodTabLayoutUI.kt:370)");
        }
        Integer e8 = B.e(dVar.e());
        InterfaceC3983b d8 = B.d(dVar.e());
        startRestartGroup.startReplaceableGroup(358888102);
        if (d8 == null) {
            a8 = null;
        } else {
            a8 = AbstractC3794a.a(d8, startRestartGroup, 8);
        }
        startRestartGroup.endReplaceableGroup();
        if (a8 == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new q(dVar, f8, z8, z9, z10, z11, function1, function12, function13, modifier2, i8, i9));
                return;
            }
            return;
        }
        Modifier.Companion companion = Modifier.Companion;
        startRestartGroup.startReplaceableGroup(358890484);
        if ((((458752 & i8) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072 && startRestartGroup.changed(z11)) || (i8 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean changed = z12 | startRestartGroup.changed(a8);
        if ((((i8 & 896) ^ 384) > 256 && startRestartGroup.changed(z8)) || (i8 & 384) == 256) {
            z13 = true;
        } else {
            z13 = false;
        }
        boolean z14 = changed | z13;
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z14 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new l(z11, a8, z8);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
        X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(semantics$default);
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
        Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        if (z8 && z9 && z10) {
            c8 = C.f4762c;
        } else if (z8 && z9) {
            c8 = C.f4761b;
        } else {
            c8 = C.f4760a;
        }
        C c9 = c8;
        int g8 = B.g(dVar.e(), false, 1, null);
        C3654g d9 = dVar.d();
        String a9 = AbstractC1193a.a(AbstractC3794a.a(dVar.d().a(), startRestartGroup, 8));
        String a10 = AbstractC1193a.a(AbstractC3794a.a(dVar.d().c(), startRestartGroup, 8));
        Modifier modifier3 = modifier2;
        T.e(f8, z11, c9, z8, !z9, g8, modifier3, null, e8, a8, d9, a9, false, new m(function13, dVar), new n(function12, dVar), AbstractC1193a.a(AbstractC3794a.a(dVar.d().e(), startRestartGroup, 8)), a10, new o(function1, dVar), startRestartGroup, ((i8 >> 3) & 14) | ((i8 >> 12) & 112) | ((i8 << 3) & 7168) | ((i8 >> 9) & 3670016), 8, 4224);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new p(dVar, f8, z8, z9, z10, z11, function1, function12, function13, modifier2, i8, i9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(com.stripe.android.paymentsheet.p r26, float r27, boolean r28, boolean r29, boolean r30, kotlin.jvm.functions.Function0 r31, kotlin.jvm.functions.Function1 r32, kotlin.jvm.functions.Function1 r33, kotlin.jvm.functions.Function1 r34, androidx.compose.ui.Modifier r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.U.i(com.stripe.android.paymentsheet.p, float, boolean, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void j(V interactor, InterfaceC4021c.j.b cvcRecollectionState, Modifier modifier, Composer composer, int i8) {
        int i9;
        Composer composer2;
        p.d dVar;
        com.stripe.android.model.o e8;
        int i10;
        int i11;
        int i12;
        AbstractC3159y.i(interactor, "interactor");
        AbstractC3159y.i(cvcRecollectionState, "cvcRecollectionState");
        AbstractC3159y.i(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(-1088084493);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(interactor)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i9 = i12 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(cvcRecollectionState)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i9 |= i11;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i9 |= i10;
        }
        if ((i9 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1088084493, i9, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUI (SavedPaymentMethodTabLayoutUI.kt:78)");
            }
            State a8 = v4.f.a(interactor.getState(), startRestartGroup, 8);
            composer2 = startRestartGroup;
            k(l(a8).d(), l(a8).e(), l(a8).f(), l(a8).g(), new r(interactor), new s(interactor), new t(interactor), new u(interactor), TestTagKt.testTag(modifier, "PaymentSheetSavedPaymentOptionTabLayout"), null, startRestartGroup, 8, 512);
            if (cvcRecollectionState instanceof InterfaceC4021c.j.b.C0928b) {
                com.stripe.android.paymentsheet.p e9 = l(a8).e();
                o.p pVar = null;
                if (e9 instanceof p.d) {
                    dVar = (p.d) e9;
                } else {
                    dVar = null;
                }
                if (dVar != null && (e8 = dVar.e()) != null) {
                    pVar = e8.f24399e;
                }
                if (pVar == o.p.f24519i) {
                    b(((InterfaceC4021c.j.b.C0928b) cvcRecollectionState).a(), l(a8).g(), 0, 0, composer2, 8, 12);
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new v(interactor, cvcRecollectionState, modifier, i8));
        }
    }

    public static final void k(List paymentOptionsItems, com.stripe.android.paymentsheet.p pVar, boolean z8, boolean z9, Function0 onAddCardPressed, Function1 onItemSelected, Function1 onModifyItem, Function1 onItemRemoved, Modifier modifier, LazyListState lazyListState, Composer composer, int i8, int i9) {
        Modifier modifier2;
        LazyListState lazyListState2;
        int i10;
        AbstractC3159y.i(paymentOptionsItems, "paymentOptionsItems");
        AbstractC3159y.i(onAddCardPressed, "onAddCardPressed");
        AbstractC3159y.i(onItemSelected, "onItemSelected");
        AbstractC3159y.i(onModifyItem, "onModifyItem");
        AbstractC3159y.i(onItemRemoved, "onItemRemoved");
        Composer startRestartGroup = composer.startRestartGroup(1549652);
        if ((i9 & 256) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i9 & 512) != 0) {
            i10 = i8 & (-1879048193);
            lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
        } else {
            lazyListState2 = lazyListState;
            i10 = i8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1549652, i10, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUI (SavedPaymentMethodTabLayoutUI.kt:136)");
        }
        Modifier modifier3 = modifier2;
        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(startRestartGroup, 912695486, true, new w(z9, lazyListState2, paymentOptionsItems, z8, pVar, onAddCardPressed, onItemSelected, onModifyItem, onItemRemoved)), startRestartGroup, 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x(paymentOptionsItems, pVar, z8, z9, onAddCardPressed, onItemSelected, onModifyItem, onItemRemoved, modifier3, lazyListState2, i8, i9));
        }
    }

    private static final V.a l(State state) {
        return (V.a) state.getValue();
    }

    public static final float s(float f8, Composer composer, int i8) {
        boolean z8;
        composer.startReplaceableGroup(-1122512013);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1122512013, i8, -1, "com.stripe.android.paymentsheet.ui.rememberItemWidth (SavedPaymentMethodTabLayoutUI.kt:224)");
        }
        composer.startReplaceableGroup(697167163);
        if ((((i8 & 14) ^ 6) > 4 && composer.changed(f8)) || (i8 & 6) == 4) {
            z8 = true;
        } else {
            z8 = false;
        }
        Object rememberedValue = composer.rememberedValue();
        if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = Dp.m5176boximpl(Dp.m5178constructorimpl(Dp.m5178constructorimpl(f8 - Dp.m5178constructorimpl(Dp.m5178constructorimpl(17) * 2)) / (((int) (Dp.m5178constructorimpl(r0 * r3) / Dp.m5178constructorimpl(Dp.m5178constructorimpl(100) + Dp.m5178constructorimpl(Dp.m5178constructorimpl(6) * r0)))) / 2.0f)));
            composer.updateRememberedValue(rememberedValue);
        }
        float m5192unboximpl = ((Dp) rememberedValue).m5192unboximpl();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m5192unboximpl;
    }
}
