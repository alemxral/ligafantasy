package J3;

import M5.AbstractC1246t;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Dp;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import s4.C3755g;
import t4.AbstractC3794a;

/* renamed from: J3.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1213v {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.v$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f5379a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f5380b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LazyListState f5381c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5382d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, LazyListState lazyListState, int i8, P5.d dVar) {
            super(2, dVar);
            this.f5380b = z8;
            this.f5381c = lazyListState;
            this.f5382d = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(this.f5380b, this.f5381c, this.f5382d, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f5379a;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                if (this.f5380b) {
                    LazyListState lazyListState = this.f5381c;
                    int i9 = this.f5382d;
                    this.f5379a = 1;
                    if (LazyListState.scrollToItem$default(lazyListState, i9, 0, this, 2, null) == e8) {
                        return e8;
                    }
                } else {
                    LazyListState lazyListState2 = this.f5381c;
                    int i10 = this.f5382d;
                    this.f5379a = 2;
                    if (LazyListState.animateScrollToItem$default(lazyListState2, i10, 0, this, 2, null) == e8) {
                        return e8;
                    }
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.v$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f5383a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LazyListState f5384b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5385c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5386d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3755g f5387e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f5388f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.v$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f5389a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f5390b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f5391c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C3755g f5392d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f5393e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1 f5394f;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: J3.v$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0107a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function1 f5395a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ List f5396b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ int f5397c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0107a(Function1 function1, List list, int i8) {
                    super(0);
                    this.f5395a = function1;
                    this.f5396b = list;
                    this.f5397c = i8;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m39invoke();
                    return L5.I.f6474a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m39invoke() {
                    this.f5395a.invoke(this.f5396b.get(this.f5397c));
                }
            }

            /* renamed from: J3.v$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0108b extends AbstractC3160z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List f5398a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0108b(List list) {
                    super(1);
                    this.f5398a = list;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Object invoke(int i8) {
                    this.f5398a.get(i8);
                    return null;
                }
            }

            /* renamed from: J3.v$b$a$c */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3160z implements X5.p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List f5399a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ int f5400b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ float f5401c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C3755g f5402d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ boolean f5403e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function1 f5404f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ List f5405g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(List list, int i8, float f8, C3755g c3755g, boolean z8, Function1 function1, List list2) {
                    super(4);
                    this.f5399a = list;
                    this.f5400b = i8;
                    this.f5401c = f8;
                    this.f5402d = c3755g;
                    this.f5403e = z8;
                    this.f5404f = function1;
                    this.f5405g = list2;
                }

                @Override // X5.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                    return L5.I.f6474a;
                }

                public final void invoke(LazyItemScope items, int i8, Composer composer, int i9) {
                    int i10;
                    String i11;
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
                        ComposerKt.traceEventStart(-1091073711, i10, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
                    }
                    X2.g gVar = (X2.g) this.f5399a.get(i8);
                    composer.startReplaceableGroup(1249436630);
                    if (DarkThemeKt.isSystemInDarkTheme(composer, 0) && gVar.e() != null) {
                        i11 = gVar.e();
                    } else {
                        i11 = gVar.i();
                    }
                    Modifier testTag = TestTagKt.testTag(Modifier.Companion, "PaymentMethodsUITestTag" + gVar.d());
                    AbstractC1212u.a(this.f5401c, gVar.h(), i11, this.f5402d, AbstractC3794a.a(gVar.f(), composer, 8), i8 == this.f5400b, this.f5403e, gVar.g(), testTag, new C0107a(this.f5404f, this.f5405g, i8), composer, C3755g.f37920g << 9, 0);
                    composer.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list, int i8, float f8, C3755g c3755g, boolean z8, Function1 function1) {
                super(1);
                this.f5389a = list;
                this.f5390b = i8;
                this.f5391c = f8;
                this.f5392d = c3755g;
                this.f5393e = z8;
                this.f5394f = function1;
            }

            public final void a(LazyListScope LazyRow) {
                AbstractC3159y.i(LazyRow, "$this$LazyRow");
                List list = this.f5389a;
                LazyRow.items(list.size(), null, new C0108b(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new c(list, this.f5390b, this.f5391c, this.f5392d, this.f5393e, this.f5394f, list)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((LazyListScope) obj);
                return L5.I.f6474a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, LazyListState lazyListState, boolean z8, int i8, C3755g c3755g, Function1 function1) {
            super(3);
            this.f5383a = list;
            this.f5384b = lazyListState;
            this.f5385c = z8;
            this.f5386d = i8;
            this.f5387e = c3755g;
            this.f5388f = function1;
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
                ComposerKt.traceEventStart(782109993, i9, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTabLayoutUI.<anonymous> (NewPaymentMethodTabLayoutUI.kt:60)");
            }
            float e8 = AbstractC1213v.e(BoxWithConstraints.mo540getMaxWidthD9Ej5fM(), this.f5383a.size(), composer, 0);
            A a8 = A.f4755a;
            PaddingValues m595PaddingValuesYgX7TsA$default = PaddingKt.m595PaddingValuesYgX7TsA$default(a8.b(), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical m514spacedBy0680j_4 = Arrangement.INSTANCE.m514spacedBy0680j_4(a8.a());
            Modifier testTag = TestTagKt.testTag(Modifier.Companion, "PaymentMethodsUITestTag");
            LazyListState lazyListState = this.f5384b;
            boolean z8 = this.f5385c;
            LazyDslKt.LazyRow(testTag, lazyListState, m595PaddingValuesYgX7TsA$default, false, m514spacedBy0680j_4, null, null, z8, new a(this.f5383a, this.f5386d, e8, this.f5387e, z8, this.f5388f), composer, 24966, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.v$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f5406a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f5407b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5408c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f5409d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3755g f5410e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f5411f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LazyListState f5412g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f5413h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f5414i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, int i8, boolean z8, Function1 function1, C3755g c3755g, Modifier modifier, LazyListState lazyListState, int i9, int i10) {
            super(2);
            this.f5406a = list;
            this.f5407b = i8;
            this.f5408c = z8;
            this.f5409d = function1;
            this.f5410e = c3755g;
            this.f5411f = modifier;
            this.f5412g = lazyListState;
            this.f5413h = i9;
            this.f5414i = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1213v.a(this.f5406a, this.f5407b, this.f5408c, this.f5409d, this.f5410e, this.f5411f, this.f5412g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5413h | 1), this.f5414i);
        }
    }

    public static final void a(List paymentMethods, int i8, boolean z8, Function1 onItemSelectedListener, C3755g imageLoader, Modifier modifier, LazyListState lazyListState, Composer composer, int i9, int i10) {
        Modifier modifier2;
        LazyListState lazyListState2;
        int i11;
        boolean z9;
        AbstractC3159y.i(paymentMethods, "paymentMethods");
        AbstractC3159y.i(onItemSelectedListener, "onItemSelectedListener");
        AbstractC3159y.i(imageLoader, "imageLoader");
        Composer startRestartGroup = composer.startRestartGroup(994479443);
        if ((i10 & 32) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        boolean z10 = false;
        if ((i10 & 64) != 0) {
            i11 = i9 & (-3670017);
            lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
        } else {
            lazyListState2 = lazyListState;
            i11 = i9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(994479443, i11, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTabLayoutUI (NewPaymentMethodTabLayoutUI.kt:43)");
        }
        boolean booleanValue = ((Boolean) startRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue();
        Integer valueOf = Integer.valueOf(i8);
        startRestartGroup.startReplaceableGroup(-132451049);
        boolean changed = startRestartGroup.changed(booleanValue);
        if ((((i9 & 3670016) ^ 1572864) > 1048576 && startRestartGroup.changed(lazyListState2)) || (i9 & 1572864) == 1048576) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z11 = changed | z9;
        if ((((i9 & 112) ^ 48) > 32 && startRestartGroup.changed(i8)) || (i9 & 48) == 32) {
            z10 = true;
        }
        boolean z12 = z10 | z11;
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z12 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new a(booleanValue, lazyListState2, i8, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(valueOf, (X5.n) rememberedValue, startRestartGroup, ((i11 >> 3) & 14) | 64);
        LazyListState lazyListState3 = lazyListState2;
        Modifier modifier3 = modifier2;
        BoxWithConstraintsKt.BoxWithConstraints(TestTagKt.testTag(modifier2, "PaymentMethodsUITestTag1"), null, false, ComposableLambdaKt.composableLambda(startRestartGroup, 782109993, true, new b(paymentMethods, lazyListState2, z8, i8, imageLoader, onItemSelectedListener)), startRestartGroup, 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(paymentMethods, i8, z8, onItemSelectedListener, imageLoader, modifier3, lazyListState3, i9, i10));
        }
    }

    public static final float c(float f8, int i8) {
        A a8 = A.f4755a;
        float m5178constructorimpl = Dp.m5178constructorimpl(f8 - Dp.m5178constructorimpl(a8.b() * 2));
        float m5178constructorimpl2 = Dp.m5178constructorimpl(90);
        float f9 = i8;
        float m5178constructorimpl3 = Dp.m5178constructorimpl(m5178constructorimpl2 * f9);
        float m5178constructorimpl4 = Dp.m5178constructorimpl(a8.a() * (i8 - 1));
        if (Dp.m5177compareTo0680j_4(Dp.m5178constructorimpl(m5178constructorimpl3 + m5178constructorimpl4), m5178constructorimpl) <= 0) {
            return Dp.m5178constructorimpl(Dp.m5178constructorimpl(m5178constructorimpl - m5178constructorimpl4) / f9);
        }
        Iterator it = AbstractC1246t.p(Float.valueOf(0.3f), Float.valueOf(0.4f), Float.valueOf(0.5f)).iterator();
        if (it.hasNext()) {
            Dp m5176boximpl = Dp.m5176boximpl(d(m5178constructorimpl, m5178constructorimpl2, a8.a(), ((Number) it.next()).floatValue()));
            while (it.hasNext()) {
                Dp m5176boximpl2 = Dp.m5176boximpl(d(m5178constructorimpl, m5178constructorimpl2, A.f4755a.a(), ((Number) it.next()).floatValue()));
                if (m5176boximpl.compareTo(m5176boximpl2) > 0) {
                    m5176boximpl = m5176boximpl2;
                }
            }
            return m5176boximpl.m5192unboximpl();
        }
        throw new NoSuchElementException();
    }

    private static final float d(float f8, float f9, float f10, float f11) {
        return Dp.m5178constructorimpl(Dp.m5178constructorimpl(f8 - Dp.m5178constructorimpl(f10 * ((int) (Dp.m5178constructorimpl(Dp.m5178constructorimpl(f8 - f9) - Dp.m5178constructorimpl(f9 * f11)) / Dp.m5178constructorimpl(f9 + f10))))) / ((r3 + 1) + f11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(float f8, int i8, Composer composer, int i9) {
        boolean z8;
        composer.startReplaceableGroup(-709663121);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-709663121, i9, -1, "com.stripe.android.paymentsheet.ui.rememberViewWidth (NewPaymentMethodTabLayoutUI.kt:103)");
        }
        composer.startReplaceableGroup(1221348739);
        boolean z9 = false;
        if ((((i9 & 14) ^ 6) > 4 && composer.changed(f8)) || (i9 & 6) == 4) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((((i9 & 112) ^ 48) > 32 && composer.changed(i8)) || (i9 & 48) == 32) {
            z9 = true;
        }
        boolean z10 = z8 | z9;
        Object rememberedValue = composer.rememberedValue();
        if (z10 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = Dp.m5176boximpl(c(f8, i8));
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
