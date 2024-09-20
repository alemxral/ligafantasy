package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import J3.F;
import L5.I;
import L5.t;
import M5.AbstractC1246t;
import X5.n;
import X5.o;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextFieldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c;
import e4.AbstractC2612h0;
import i6.M;
import j4.AbstractC3087m;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import m4.C0;
import m4.X;
import m4.p0;
import m4.x0;
import q3.w;
import u4.AbstractC3804a;

/* loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f26202a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0 function0) {
            super(0);
            this.f26202a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5530invoke();
            return I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5530invoke() {
            this.f26202a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0637b extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f26203a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f26204b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f26205c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0637b(boolean z8, Function0 function0, int i8) {
            super(2);
            this.f26203a = z8;
            this.f26204b = function0;
            this.f26205c = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            b.a(this.f26203a, this.f26204b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26205c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f26206a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusRequester f26207b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(FocusRequester focusRequester, P5.d dVar) {
            super(2, dVar);
            this.f26207b = focusRequester;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f26207b, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f26206a == 0) {
                t.b(obj);
                this.f26207b.requestFocus();
                return I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f26208a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f26209b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusRequester f26210c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ E3.g f26211d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f26212e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f26213a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function1 function1) {
                super(1);
                this.f26213a = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return I.f6474a;
            }

            public final void invoke(String it) {
                AbstractC3159y.i(it, "it");
                this.f26213a.invoke(it);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b$d$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0638b extends AbstractC3160z implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ E3.g f26214a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0638b(E3.g gVar) {
                super(2);
                this.f26214a = gVar;
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
                    ComposerKt.traceEventStart(1638127461, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionField.<anonymous>.<anonymous>.<anonymous> (CvcRecollectionScreen.kt:193)");
                }
                X.a(StringResources_androidKt.stringResource(this.f26214a.d(), composer, 0), null, false, composer, 0, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3160z implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ E3.g f26215a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(E3.g gVar) {
                super(2);
                this.f26215a = gVar;
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
                    ComposerKt.traceEventStart(105090984, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionField.<anonymous>.<anonymous>.<anonymous> (CvcRecollectionScreen.kt:196)");
                }
                C0.u(this.f26215a.c(), false, null, composer, x0.c.f35771e | 48, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j8, Function1 function1, FocusRequester focusRequester, E3.g gVar, String str) {
            super(2);
            this.f26208a = j8;
            this.f26209b = function1;
            this.f26210c = focusRequester;
            this.f26211d = gVar;
            this.f26212e = str;
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
                ComposerKt.traceEventStart(334418597, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionField.<anonymous> (CvcRecollectionScreen.kt:136)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier height = IntrinsicKt.height(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), IntrinsicSize.Min);
            long j8 = this.f26208a;
            Function1 function1 = this.f26209b;
            FocusRequester focusRequester = this.f26210c;
            E3.g gVar = this.f26211d;
            String str = this.f26212e;
            composer.startReplaceableGroup(693286680);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(height);
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
            Updater.m2503setimpl(m2496constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier m282backgroundbw27NRU$default = BackgroundKt.m282backgroundbw27NRU$default(SizeKt.fillMaxSize$default(rowScopeInstance.weight(companion, 0.5f, true), 0.0f, 1, null), j8, null, 2, null);
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion3.getConstructor();
            o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m282backgroundbw27NRU$default);
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
            Updater.m2503setimpl(m2496constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m2496constructorimpl2.getInserting() || !AbstractC3159y.d(m2496constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2496constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2496constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            Modifier m600padding3ABfNKs = PaddingKt.m600padding3ABfNKs(BoxScopeInstance.INSTANCE.align(companion, companion2.getCenterStart()), Dp.m5178constructorimpl(12));
            Arrangement.HorizontalOrVertical m514spacedBy0680j_4 = arrangement.m514spacedBy0680j_4(Dp.m5178constructorimpl(6));
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composer.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m514spacedBy0680j_4, centerVertically, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Function0 constructor3 = companion3.getConstructor();
            o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m600padding3ABfNKs);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer m2496constructorimpl3 = Updater.m2496constructorimpl(composer);
            Updater.m2503setimpl(m2496constructorimpl3, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            n setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m2496constructorimpl3.getInserting() || !AbstractC3159y.d(m2496constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m2496constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m2496constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ImageKt.Image(PainterResources_androidKt.painterResource(gVar.a().l(), composer, 0), "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 124);
            String stringResource = StringResources_androidKt.stringResource(w.f37426U, new Object[]{" " + str}, composer, 64);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i9 = MaterialTheme.$stable;
            TextKt.m1414Text4IGK_g(stringResource, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, materialTheme.getTypography(composer, i9).getBody1(), composer, 0, 0, 65534);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            DividerKt.m1213DivideroMI9zvI(SizeKt.fillMaxHeight$default(SizeKt.m652width3ABfNKs(companion, Dp.m5178constructorimpl(1)), 0.0f, 1, null), AbstractC3087m.n(materialTheme, composer, i9).e(), 0.0f, 0.0f, composer, 6, 12);
            List e8 = AbstractC1246t.e(AutofillType.CreditCardSecurityCode);
            composer.startReplaceableGroup(1517714320);
            boolean changed = composer.changed(function1);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new a(function1);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            TextFieldKt.TextField(gVar.b(), function1, FocusRequesterModifierKt.focusRequester(rowScopeInstance.weight(SizeKt.fillMaxWidth$default(AbstractC3804a.a(companion, e8, (Function1) rememberedValue, composer, 54), 0.0f, 1, null), 0.5f, true), focusRequester), false, false, (TextStyle) null, (n) ComposableLambdaKt.composableLambda(composer, 1638127461, true, new C0638b(gVar)), (n) null, (n) null, (n) ComposableLambdaKt.composableLambda(composer, 105090984, true, new c(gVar)), false, (VisualTransformation) null, new KeyboardOptions(0, false, KeyboardType.Companion.m4919getNumberPasswordPjHm6EE(), 0, 11, null), (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) materialTheme.getShapes(composer, i9).getLarge(), C0.d(false, composer, 0, 1), composer, 806879232, 24960, 241080);
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
    public static final class e extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26216a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ E3.g f26217b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f26218c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f26219d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, E3.g gVar, Function1 function1, int i8) {
            super(2);
            this.f26216a = str;
            this.f26217b = gVar;
            this.f26218c = function1;
            this.f26219d = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            b.b(this.f26216a, this.f26217b, this.f26218c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26219d | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E3.e f26220a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f26221b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3156v implements Function1 {
            a(Object obj) {
                super(1, obj, E3.e.class, "onCvcChanged", "onCvcChanged(Ljava/lang/String;)V", 0);
            }

            public final void d(String p02) {
                AbstractC3159y.i(p02, "p0");
                ((E3.e) this.receiver).c(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((String) obj);
                return I.f6474a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(E3.e eVar, State state) {
            super(2);
            this.f26220a = eVar;
            this.f26221b = state;
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
                ComposerKt.traceEventStart(66292912, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionPaymentSheetScreen.<anonymous> (CvcRecollectionScreen.kt:96)");
            }
            Modifier m602paddingVpY3zN4$default = PaddingKt.m602paddingVpY3zN4$default(BackgroundKt.m282backgroundbw27NRU$default(Modifier.Companion, AbstractC3087m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).g().m1182getSurface0d7_KjU(), null, 2, null), Dp.m5178constructorimpl(20), 0.0f, 2, null);
            E3.e eVar = this.f26220a;
            State state = this.f26221b;
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
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
            Updater.m2503setimpl(m2496constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            b.f(composer, 0);
            b.b(b.d(state).d(), b.d(state).c(), new a(eVar), composer, 0);
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
    public static final class g extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E3.e f26222a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26223b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(E3.e eVar, int i8) {
            super(2);
            this.f26222a = eVar;
            this.f26223b = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            b.c(this.f26222a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26223b | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f26224a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f26225b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26226c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ E3.g f26227d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f26228a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function1 function1) {
                super(0);
                this.f26228a = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5531invoke();
                return I.f6474a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5531invoke() {
                this.f26228a.invoke(c.a.f26241a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b$h$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0639b extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f26229a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0639b(Function1 function1) {
                super(1);
                this.f26229a = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return I.f6474a;
            }

            public final void invoke(String it) {
                AbstractC3159y.i(it, "it");
                this.f26229a.invoke(new c.C0640c(it));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f26230a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Function1 function1) {
                super(0);
                this.f26230a = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5532invoke();
                return I.f6474a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5532invoke() {
                this.f26230a.invoke(c.b.f26242a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z8, Function1 function1, String str, E3.g gVar) {
            super(2);
            this.f26224a = z8;
            this.f26225b = function1;
            this.f26226c = str;
            this.f26227d = gVar;
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
                ComposerKt.traceEventStart(891453526, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionScreen.<anonymous> (CvcRecollectionScreen.kt:66)");
            }
            Modifier m602paddingVpY3zN4$default = PaddingKt.m602paddingVpY3zN4$default(BackgroundKt.m282backgroundbw27NRU$default(Modifier.Companion, AbstractC3087m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).g().m1182getSurface0d7_KjU(), null, 2, null), Dp.m5178constructorimpl(20), 0.0f, 2, null);
            boolean z8 = this.f26224a;
            Function1 function1 = this.f26225b;
            String str = this.f26226c;
            E3.g gVar = this.f26227d;
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
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
            Updater.m2503setimpl(m2496constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer.startReplaceableGroup(161246301);
            boolean changed = composer.changed(function1);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new a(function1);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            b.g(z8, (Function0) rememberedValue, composer, 0);
            b.f(composer, 0);
            composer.startReplaceableGroup(161255073);
            boolean changed2 = composer.changed(function1);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new C0639b(function1);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            b.b(str, gVar, (Function1) rememberedValue2, composer, 0);
            boolean e8 = gVar.e();
            composer.startReplaceableGroup(161260448);
            boolean changed3 = composer.changed(function1);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new c(function1);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            b.a(e8, (Function0) rememberedValue3, composer, 0);
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
    public static final class i extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26231a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f26232b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ E3.g f26233c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f26234d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f26235e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, boolean z8, E3.g gVar, Function1 function1, int i8) {
            super(2);
            this.f26231a = str;
            this.f26232b = z8;
            this.f26233c = gVar;
            this.f26234d = function1;
            this.f26235e = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            b.e(this.f26231a, this.f26232b, this.f26233c, this.f26234d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26235e | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f26236a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i8) {
            super(2);
            this.f26236a = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            b.f(composer, RecomposeScopeImplKt.updateChangedFlags(this.f26236a | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f26237a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Function0 function0) {
            super(0);
            this.f26237a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5533invoke();
            return I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5533invoke() {
            this.f26237a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f26238a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f26239b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f26240c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z8, Function0 function0, int i8) {
            super(2);
            this.f26238a = z8;
            this.f26239b = function0;
            this.f26240c = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            b.g(this.f26238a, this.f26239b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26240c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z8, Function0 function0, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-1690775401);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i11 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        if ((i9 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1690775401, i9, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionButton (CvcRecollectionScreen.kt:241)");
            }
            boolean z9 = false;
            float f8 = 0;
            Modifier testTag = TestTagKt.testTag(PaddingKt.m603paddingqDBjuR0(SizeKt.fillMaxWidth(Modifier.Companion, 1.0f), Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(32), Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(20)), "CVC_CONFIRM");
            Alignment center = Alignment.Companion.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(testTag);
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
            Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            String stringResource = StringResources_androidKt.stringResource(w.f37411F, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(78247732);
            if ((i9 & 112) == 32) {
                z9 = true;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z9 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new a(function0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            com.stripe.android.paymentsheet.ui.c.i(stringResource, false, z8, null, null, (Function0) rememberedValue, startRestartGroup, ((i9 << 6) & 896) | 48, 24);
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
            endRestartGroup.updateScope(new C0637b(z8, function0, i8));
        }
    }

    public static final void b(String lastFour, E3.g cvcState, Function1 onValueChanged, Composer composer, int i8) {
        int i9;
        long m2970copywmQWz5c$default;
        int i10;
        int i11;
        int i12;
        AbstractC3159y.i(lastFour, "lastFour");
        AbstractC3159y.i(cvcState, "cvcState");
        AbstractC3159y.i(onValueChanged, "onValueChanged");
        Composer startRestartGroup = composer.startRestartGroup(-122860128);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(lastFour)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i9 = i12 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(cvcState)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i9 |= i11;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changedInstance(onValueChanged)) {
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
                ComposerKt.traceEventStart(-122860128, i9, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionField (CvcRecollectionScreen.kt:118)");
            }
            if (DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0)) {
                m2970copywmQWz5c$default = Color.m2970copywmQWz5c$default(Color.Companion.m3008getWhite0d7_KjU(), 0.075f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                m2970copywmQWz5c$default = Color.m2970copywmQWz5c$default(Color.Companion.m2997getBlack0d7_KjU(), 0.075f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            long j8 = m2970copywmQWz5c$default;
            startRestartGroup.startReplaceableGroup(331790769);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            FocusRequester focusRequester = (FocusRequester) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(331792356);
            if (!((Boolean) startRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
                I i13 = I.f6474a;
                startRestartGroup.startReplaceableGroup(331794365);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = new c(focusRequester, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(i13, (n) rememberedValue2, startRestartGroup, 70);
            }
            startRestartGroup.endReplaceableGroup();
            p0.b(null, null, false, 0L, null, ComposableLambdaKt.composableLambda(startRestartGroup, 334418597, true, new d(j8, onValueChanged, focusRequester, cvcState, lastFour)), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e(lastFour, cvcState, onValueChanged, i8));
        }
    }

    public static final void c(E3.e interactor, Composer composer, int i8) {
        int i9;
        int i10;
        AbstractC3159y.i(interactor, "interactor");
        Composer startRestartGroup = composer.startRestartGroup(-1132926818);
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
                ComposerKt.traceEventStart(-1132926818, i9, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionPaymentSheetScreen (CvcRecollectionScreen.kt:92)");
            }
            AbstractC3087m.a(null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 66292912, true, new f(interactor, v4.f.a(interactor.b(), startRestartGroup, 8))), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new g(interactor, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E3.f d(State state) {
        return (E3.f) state.getValue();
    }

    public static final void e(String lastFour, boolean z8, E3.g cvcState, Function1 viewActionHandler, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC3159y.i(lastFour, "lastFour");
        AbstractC3159y.i(cvcState, "cvcState");
        AbstractC3159y.i(viewActionHandler, "viewActionHandler");
        Composer startRestartGroup = composer.startRestartGroup(-694222012);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(lastFour)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(z8)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(cvcState)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changedInstance(viewActionHandler)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i9 |= i10;
        }
        if ((i9 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-694222012, i9, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionScreen (CvcRecollectionScreen.kt:64)");
            }
            AbstractC3087m.a(null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 891453526, true, new h(z8, viewActionHandler, lastFour, cvcState)), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new i(lastFour, z8, cvcState, viewActionHandler, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(802797669);
        if (i8 == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(802797669, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionTitle (CvcRecollectionScreen.kt:230)");
            }
            float f8 = 0;
            AbstractC2612h0.a(StringResources_androidKt.stringResource(w.f37412G, startRestartGroup, 0), PaddingKt.m603paddingqDBjuR0(Modifier.Companion, Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(16)), startRestartGroup, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new j(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(boolean z8, Function0 function0, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-1018538037);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i11 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        if ((i9 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1018538037, i9, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionTopBar (CvcRecollectionScreen.kt:210)");
            }
            Modifier.Companion companion = Modifier.Companion;
            boolean z9 = false;
            float f8 = 0;
            float f9 = 16;
            Modifier m633height3ABfNKs = SizeKt.m633height3ABfNKs(PaddingKt.m603paddingqDBjuR0(companion, Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(f9), Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(f8)), Dp.m5178constructorimpl(32));
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m633height3ABfNKs);
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
            n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1173693210);
            if (z8) {
                F.d(startRestartGroup, 0);
            }
            startRestartGroup.endReplaceableGroup();
            SpacerKt.Spacer(androidx.compose.foundation.layout.e.a(rowScopeInstance, companion, 1.0f, false, 2, null), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1173688598);
            if ((i9 & 112) == 32) {
                z9 = true;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z9 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new k(function0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            IconButtonKt.IconButton((Function0) rememberedValue, OffsetKt.m560offsetVpY3zN4(companion, Dp.m5178constructorimpl(f9), Dp.m5178constructorimpl(-Dp.m5178constructorimpl(8))), false, null, E3.b.f1973a.a(), startRestartGroup, 24576, 12);
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
            endRestartGroup.updateScope(new l(z8, function0, i8));
        }
    }
}
