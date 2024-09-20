package L3;

import J3.W;
import L3.i;
import L5.I;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import q3.C3654g;

/* loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f6253a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3654g f6254b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar, C3654g c3654g) {
            super(0);
            this.f6253a = iVar;
            this.f6254b = c3654g;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m50invoke();
            return I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m50invoke() {
            this.f6253a.b(new i.b.c(this.f6254b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6255a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3654g f6256b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f6257c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f6258d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f6259a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar) {
                super(1);
                this.f6259a = iVar;
            }

            public final void a(C3654g paymentMethod) {
                AbstractC3159y.i(paymentMethod, "paymentMethod");
                this.f6259a.b(new i.b.a(paymentMethod));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C3654g) obj);
                return I.f6474a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: L3.j$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0134b extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f6260a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0134b(i iVar) {
                super(1);
                this.f6260a = iVar;
            }

            public final void a(C3654g paymentMethod) {
                AbstractC3159y.i(paymentMethod, "paymentMethod");
                this.f6260a.b(new i.b.C0133b(paymentMethod));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C3654g) obj);
                return I.f6474a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, C3654g c3654g, State state, i iVar) {
            super(3);
            this.f6255a = z8;
            this.f6256b = c3654g;
            this.f6257c = state;
            this.f6258d = iVar;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f6474a;
        }

        public final void invoke(RowScope SavedPaymentMethodRowButton, Composer composer, int i8) {
            AbstractC3159y.i(SavedPaymentMethodRowButton, "$this$SavedPaymentMethodRowButton");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(77758085, i8, -1, "com.stripe.android.paymentsheet.verticalmode.ManageScreenUI.<anonymous>.<anonymous>.<anonymous> (ManageScreenUI.kt:40)");
            }
            j.c(this.f6255a, j.b(this.f6257c).e(), this.f6256b.f(), j.b(this.f6257c).b(), this.f6256b, new a(this.f6258d), new C0134b(this.f6258d), composer, 32768);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f6261a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6262b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(i iVar, int i8) {
            super(2);
            this.f6261a = iVar;
            this.f6262b = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            j.a(this.f6261a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6262b | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6263a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6264b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f6265c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f6266d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3654g f6267e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f6268f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f6269g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f6270h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z8, boolean z9, boolean z10, boolean z11, C3654g c3654g, Function1 function1, Function1 function12, int i8) {
            super(2);
            this.f6263a = z8;
            this.f6264b = z9;
            this.f6265c = z10;
            this.f6266d = z11;
            this.f6267e = c3654g;
            this.f6268f = function1;
            this.f6269g = function12;
            this.f6270h = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            j.c(this.f6263a, this.f6264b, this.f6265c, this.f6266d, this.f6267e, this.f6268f, this.f6269g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6270h | 1));
        }
    }

    public static final void a(i interactor, Composer composer, int i8) {
        int i9;
        int i10;
        AbstractC3159y.i(interactor, "interactor");
        Composer startRestartGroup = composer.startRestartGroup(-655977581);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(interactor)) {
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
                ComposerKt.traceEventStart(-655977581, i9, -1, "com.stripe.android.paymentsheet.verticalmode.ManageScreenUI (ManageScreenUI.kt:18)");
            }
            float dimensionResource = PrimitiveResources_androidKt.dimensionResource(q3.s.f37371e, startRestartGroup, 0);
            State a8 = v4.f.a(interactor.getState(), startRestartGroup, 8);
            Modifier testTag = TestTagKt.testTag(PaddingKt.m602paddingVpY3zN4$default(Modifier.Companion, dimensionResource, 0.0f, 2, null), "manage_screen_saved_pms_list");
            Arrangement.HorizontalOrVertical m514spacedBy0680j_4 = Arrangement.INSTANCE.m514spacedBy0680j_4(Dp.m5178constructorimpl(12));
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m514spacedBy0680j_4, Alignment.Companion.getStart(), startRestartGroup, 6);
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
            startRestartGroup.startReplaceableGroup(-648129373);
            for (C3654g c3654g : b(a8).d()) {
                boolean d8 = AbstractC3159y.d(c3654g, b(a8).c());
                p.a(c3654g, true, !b(a8).e(), d8, null, new a(interactor, c3654g), ComposableLambdaKt.composableLambda(startRestartGroup, 77758085, true, new b(d8, c3654g, a8, interactor)), startRestartGroup, 1572920, 16);
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(interactor, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i.a b(State state) {
        return (i.a) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(boolean z8, boolean z9, boolean z10, boolean z11, C3654g c3654g, Function1 function1, Function1 function12, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-176682203);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-176682203, i8, -1, "com.stripe.android.paymentsheet.verticalmode.TrailingContent (ManageScreenUI.kt:75)");
        }
        if (z9 && z10) {
            startRestartGroup.startReplaceableGroup(-959522877);
            Arrangement.HorizontalOrVertical m514spacedBy0680j_4 = Arrangement.INSTANCE.m514spacedBy0680j_4(Dp.m5178constructorimpl(12));
            startRestartGroup.startReplaceableGroup(693286680);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m514spacedBy0680j_4, Alignment.Companion.getTop(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            Updater.m2503setimpl(m2496constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            h.b(c3654g, function12, startRestartGroup, ((i8 >> 15) & 112) | 8);
            startRestartGroup.startReplaceableGroup(114380678);
            if (z11) {
                h.a(c3654g, function1, startRestartGroup, ((i8 >> 12) & 112) | 8);
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
        } else if (z9 && z11) {
            startRestartGroup.startReplaceableGroup(-959251782);
            h.a(c3654g, function1, startRestartGroup, ((i8 >> 12) & 112) | 8);
            startRestartGroup.endReplaceableGroup();
        } else if (z8) {
            startRestartGroup.startReplaceableGroup(-959169415);
            W.a(null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(-959139624);
            startRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(z8, z9, z10, z11, c3654g, function1, function12, i8));
        }
    }
}
