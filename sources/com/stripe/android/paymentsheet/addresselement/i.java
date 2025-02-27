package com.stripe.android.paymentsheet.addresselement;

import J3.AbstractC1196d;
import L5.I;
import X5.n;
import X5.o;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.stripe.android.paymentsheet.addresselement.j;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import m4.AbstractC3422l;
import q3.w;

/* loaded from: classes4.dex */
public abstract class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusManager f25640a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f25641b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.addresselement.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0598a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FocusManager f25642a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0 f25643b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0598a(FocusManager focusManager, Function0 function0) {
                super(0);
                this.f25642a = focusManager;
                this.f25643b = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5519invoke();
                return I.f6474a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5519invoke() {
                androidx.compose.ui.focus.b.a(this.f25642a, false, 1, null);
                this.f25643b.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(FocusManager focusManager, Function0 function0) {
            super(2);
            this.f25640a = focusManager;
            this.f25641b = function0;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-833687647, i8, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous> (InputAddressScreen.kt:45)");
            }
            AbstractC1196d.a(true, new C0598a(this.f25640a, this.f25641b), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f25644a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f25645b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ o f25646c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f25647d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f25648e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ FocusManager f25649f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0 f25650g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f25651a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f25652b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ o f25653c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f25654d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f25655e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FocusManager f25656f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function0 f25657g;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.addresselement.i$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0599a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FocusManager f25658a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function0 f25659b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0599a(FocusManager focusManager, Function0 function0) {
                    super(0);
                    this.f25658a = focusManager;
                    this.f25659b = function0;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5520invoke();
                    return I.f6474a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5520invoke() {
                    androidx.compose.ui.focus.b.a(this.f25658a, false, 1, null);
                    this.f25659b.invoke();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, o oVar, o oVar2, String str2, boolean z8, FocusManager focusManager, Function0 function0) {
                super(3);
                this.f25651a = str;
                this.f25652b = oVar;
                this.f25653c = oVar2;
                this.f25654d = str2;
                this.f25655e = z8;
                this.f25656f = focusManager;
                this.f25657g = function0;
            }

            @Override // X5.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return I.f6474a;
            }

            public final void invoke(ColumnScope ScrollableColumn, Composer composer, int i8) {
                AbstractC3159y.i(ScrollableColumn, "$this$ScrollableColumn");
                if ((i8 & 81) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(178055957, i8, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous>.<anonymous> (InputAddressScreen.kt:57)");
                }
                Modifier.Companion companion = Modifier.Companion;
                Modifier m602paddingVpY3zN4$default = PaddingKt.m602paddingVpY3zN4$default(companion, Dp.m5178constructorimpl(20), 0.0f, 2, null);
                String str = this.f25651a;
                o oVar = this.f25652b;
                o oVar2 = this.f25653c;
                String str2 = this.f25654d;
                boolean z8 = this.f25655e;
                FocusManager focusManager = this.f25656f;
                Function0 function0 = this.f25657g;
                composer.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0 constructor = companion2.getConstructor();
                o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m602paddingVpY3zN4$default);
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
                Updater.m2503setimpl(m2496constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                TextKt.m1414Text4IGK_g(str, PaddingKt.m604paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m5178constructorimpl(8), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getH4(), composer, 48, 0, 65532);
                oVar.invoke(columnScopeInstance, composer, 6);
                oVar2.invoke(columnScopeInstance, composer, 6);
                q2.c.a(str2, z8, new C0599a(focusManager, function0), PaddingKt.m602paddingVpY3zN4$default(companion, 0.0f, Dp.m5178constructorimpl(16), 1, null), false, false, composer, 3072, 48);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, o oVar, o oVar2, String str2, boolean z8, FocusManager focusManager, Function0 function0) {
            super(3);
            this.f25644a = str;
            this.f25645b = oVar;
            this.f25646c = oVar2;
            this.f25647d = str2;
            this.f25648e = z8;
            this.f25649f = focusManager;
            this.f25650g = function0;
        }

        public final void a(PaddingValues it, Composer composer, int i8) {
            int i9;
            AbstractC3159y.i(it, "it");
            if ((i8 & 14) == 0) {
                if (composer.changed(it)) {
                    i9 = 4;
                } else {
                    i9 = 2;
                }
                i8 |= i9;
            }
            if ((i8 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(973020890, i8, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous> (InputAddressScreen.kt:54)");
            }
            r3.g.a(PaddingKt.padding(Modifier.Companion, it), ComposableLambdaKt.composableLambda(composer, 178055957, true, new a(this.f25644a, this.f25645b, this.f25646c, this.f25647d, this.f25648e, this.f25649f, this.f25650g)), composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f25660a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f25661b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25662c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f25663d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f25664e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ o f25665f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ o f25666g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f25667h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z8, String str, String str2, Function0 function0, Function0 function02, o oVar, o oVar2, int i8) {
            super(2);
            this.f25660a = z8;
            this.f25661b = str;
            this.f25662c = str2;
            this.f25663d = function0;
            this.f25664e = function02;
            this.f25665f = oVar;
            this.f25666g = oVar2;
            this.f25667h = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            i.b(this.f25660a, this.f25661b, this.f25662c, this.f25663d, this.f25664e, this.f25665f, this.f25666g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f25667h | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f25668a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f25669b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f25670c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(j jVar, State state, State state2) {
            super(0);
            this.f25668a = jVar;
            this.f25669b = state;
            this.f25670c = state2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5521invoke();
            return I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5521invoke() {
            this.f25668a.j(i.d(this.f25669b), i.f(this.f25670c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f25671a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(j jVar) {
            super(0);
            this.f25671a = jVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5522invoke();
            return I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5522invoke() {
            com.stripe.android.paymentsheet.addresselement.a.b(this.f25671a.r(), null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r3.i f25672a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f25673b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(r3.i iVar, j jVar) {
            super(3);
            this.f25672a = iVar;
            this.f25673b = jVar;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f6474a;
        }

        public final void invoke(ColumnScope InputAddressScreen, Composer composer, int i8) {
            AbstractC3159y.i(InputAddressScreen, "$this$InputAddressScreen");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(814782016, i8, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous>.<anonymous> (InputAddressScreen.kt:119)");
            }
            b4.i.b(this.f25672a.d(), this.f25673b.q(), this.f25672a.b(), this.f25672a.e(), null, composer, 4680, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f25674a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f25675b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f25676c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f25677a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ State f25678b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, State state) {
                super(1);
                this.f25677a = jVar;
                this.f25678b = state;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return I.f6474a;
            }

            public final void invoke(boolean z8) {
                this.f25677a.i(!i.f(this.f25678b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(j jVar, State state, State state2) {
            super(3);
            this.f25674a = jVar;
            this.f25675b = state;
            this.f25676c = state2;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f6474a;
        }

        public final void invoke(ColumnScope InputAddressScreen, Composer composer, int i8) {
            r3.d b8;
            AbstractC3159y.i(InputAddressScreen, "$this$InputAddressScreen");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1989616575, i8, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous>.<anonymous> (InputAddressScreen.kt:127)");
            }
            r3.e b9 = this.f25674a.l().b();
            String b10 = (b9 == null || (b8 = b9.b()) == null) ? null : b8.b();
            if (b10 != null) {
                State state = this.f25675b;
                AbstractC3422l.a(null, null, i.f(state), b10, i.e(this.f25676c), new a(this.f25674a, state), composer, 0, 3);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ I5.a f25679a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25680b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(I5.a aVar, int i8) {
            super(2);
            this.f25679a = aVar;
            this.f25680b = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            i.a(this.f25679a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f25680b | 1));
        }
    }

    public static final void a(I5.a inputAddressViewModelSubcomponentBuilderProvider, Composer composer, int i8) {
        CreationExtras creationExtras;
        String str;
        AbstractC3159y.i(inputAddressViewModelSubcomponentBuilderProvider, "inputAddressViewModelSubcomponentBuilderProvider");
        Composer startRestartGroup = composer.startRestartGroup(1998888381);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1998888381, i8, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen (InputAddressScreen.kt:84)");
        }
        j.d dVar = new j.d(inputAddressViewModelSubcomponentBuilderProvider);
        startRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
        if (current != null) {
            if (current instanceof HasDefaultViewModelProviderFactory) {
                creationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) j.class, current, (String) null, dVar, creationExtras, startRestartGroup, 36936, 0);
            startRestartGroup.endReplaceableGroup();
            j jVar = (j) viewModel;
            State a8 = v4.f.a(jVar.p(), startRestartGroup, 8);
            String str2 = null;
            if (c(a8) == null) {
                startRestartGroup.startReplaceableGroup(-1514223121);
                q2.b.b(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), 0L, startRestartGroup, 6, 2);
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(-1514070105);
                r3.i c8 = c(a8);
                if (c8 != null) {
                    State a9 = v4.f.a(c8.a(), startRestartGroup, 8);
                    r3.e b8 = jVar.l().b();
                    if (b8 != null) {
                        str = b8.j();
                    } else {
                        str = null;
                    }
                    startRestartGroup.startReplaceableGroup(-1988501175);
                    boolean z8 = false;
                    if (str == null) {
                        str = StringResources_androidKt.stringResource(w.f37458n, startRestartGroup, 0);
                    }
                    startRestartGroup.endReplaceableGroup();
                    r3.e b9 = jVar.l().b();
                    if (b9 != null) {
                        str2 = b9.n();
                    }
                    startRestartGroup.startReplaceableGroup(-1988495675);
                    if (str2 == null) {
                        str2 = StringResources_androidKt.stringResource(w.f37460o, startRestartGroup, 0);
                    }
                    startRestartGroup.endReplaceableGroup();
                    State a10 = v4.f.a(jVar.q(), startRestartGroup, 8);
                    State a11 = v4.f.a(jVar.m(), startRestartGroup, 8);
                    if (d(a9) != null) {
                        z8 = true;
                    }
                    b(z8, str, str2, new d(jVar, a9, a11), new e(jVar), ComposableLambdaKt.composableLambda(startRestartGroup, 814782016, true, new f(c8, jVar)), ComposableLambdaKt.composableLambda(startRestartGroup, -1989616575, true, new g(jVar, a11, a10)), startRestartGroup, 1769472);
                }
                startRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new h(inputAddressViewModelSubcomponentBuilderProvider, i8));
                return;
            }
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    public static final void b(boolean z8, String primaryButtonText, String title, Function0 onPrimaryButtonClick, Function0 onCloseClick, o formContent, o checkboxContent, Composer composer, int i8) {
        int i9;
        Composer composer2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        AbstractC3159y.i(primaryButtonText, "primaryButtonText");
        AbstractC3159y.i(title, "title");
        AbstractC3159y.i(onPrimaryButtonClick, "onPrimaryButtonClick");
        AbstractC3159y.i(onCloseClick, "onCloseClick");
        AbstractC3159y.i(formContent, "formContent");
        AbstractC3159y.i(checkboxContent, "checkboxContent");
        Composer startRestartGroup = composer.startRestartGroup(642189468);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i9 = i16 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(primaryButtonText)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i9 |= i15;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(title)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i9 |= i14;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changedInstance(onPrimaryButtonClick)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i9 |= i13;
        }
        if ((57344 & i8) == 0) {
            if (startRestartGroup.changedInstance(onCloseClick)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i9 |= i12;
        }
        if ((458752 & i8) == 0) {
            if (startRestartGroup.changedInstance(formContent)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i9 |= i11;
        }
        if ((3670016 & i8) == 0) {
            if (startRestartGroup.changedInstance(checkboxContent)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i9 |= i10;
        }
        if ((2995931 & i9) == 599186 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(642189468, i9, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen (InputAddressScreen.kt:37)");
            }
            FocusManager focusManager = (FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            composer2 = startRestartGroup;
            ScaffoldKt.m1320Scaffold27mzLpw(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null)), null, ComposableLambdaKt.composableLambda(startRestartGroup, -833687647, true, new a(focusManager, onCloseClick)), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable).m1182getSurface0d7_KjU(), 0L, ComposableLambdaKt.composableLambda(composer2, 973020890, true, new b(title, formContent, checkboxContent, primaryButtonText, z8, focusManager, onPrimaryButtonClick)), composer2, 384, 12582912, 98298);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(z8, primaryButtonText, title, onPrimaryButtonClick, onCloseClick, formContent, checkboxContent, i8));
        }
    }

    private static final r3.i c(State state) {
        return (r3.i) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map d(State state) {
        return (Map) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }
}
