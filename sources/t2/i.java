package T2;

import L5.I;
import L5.t;
import X5.n;
import X5.o;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
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
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import i6.B0;
import i6.M;
import j4.AbstractC3087m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import m4.C;
import m4.C0;
import m4.Q;
import m4.g0;
import m4.s0;
import m4.w0;

/* loaded from: classes4.dex */
public abstract class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9897a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f6474a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3159y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.setTestTag(semantics, "CircularProgressIndicator");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f9898a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f9899b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusRequester f9900c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FocusRequester f9901a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FocusRequester focusRequester) {
                super(1);
                this.f9901a = focusRequester;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return I.f6474a;
            }

            public final void invoke(Throwable th) {
                this.f9901a.requestFocus();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusRequester focusRequester, P5.d dVar) {
            super(2, dVar);
            this.f9900c = focusRequester;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            b bVar = new b(this.f9900c, dVar);
            bVar.f9899b = obj;
            return bVar;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f9898a == 0) {
                t.b(obj);
                B0.l(((M) this.f9899b).getCoroutineContext()).u(new a(this.f9900c));
                return I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f9902a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f9903b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ U2.a f9904c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f9905d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FocusRequester f9906e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f9907f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ n f9908g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f9909h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f9910i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z8, w0 w0Var, U2.a aVar, int i8, FocusRequester focusRequester, boolean z9, n nVar, int i9, int i10) {
            super(2);
            this.f9902a = z8;
            this.f9903b = w0Var;
            this.f9904c = aVar;
            this.f9905d = i8;
            this.f9906e = focusRequester;
            this.f9907f = z9;
            this.f9908g = nVar;
            this.f9909h = i9;
            this.f9910i = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            i.a(this.f9902a, this.f9903b, this.f9904c, this.f9905d, this.f9906e, this.f9907f, this.f9908g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9909h | 1), this.f9910i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f9911a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f6474a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3159y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.setTestTag(semantics, "LinkLogoIcon");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f9912a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i8) {
            super(2);
            this.f9912a = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            i.b(composer, RecomposeScopeImplKt.updateChangedFlags(this.f9912a | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f9913a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f9914b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f9915c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Function1 function1, State state, P5.d dVar) {
            super(2, dVar);
            this.f9914b = function1;
            this.f9915c = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f9914b, this.f9915c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f9913a == 0) {
                t.b(obj);
                this.f9914b.invoke(i.e(this.f9915c));
                return I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f9916a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusManager f9917b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextInputService f9918c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ State f9919d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(FocusManager focusManager, TextInputService textInputService, State state, P5.d dVar) {
            super(2, dVar);
            this.f9917b = focusManager;
            this.f9918c = textInputService;
            this.f9919d = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f9917b, this.f9918c, this.f9919d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f9916a == 0) {
                t.b(obj);
                if (i.e(this.f9919d).f() == U2.a.f11057a && i.e(this.f9919d).i() != null) {
                    this.f9917b.clearFocus(true);
                    TextInputService textInputService = this.f9918c;
                    if (textInputService != null) {
                        textInputService.hideSoftwareKeyboard();
                    }
                }
                return I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ T2.c f9920a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f9921b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f9922c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f9923d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f9924e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f9925f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(T2.c cVar, boolean z8, Function1 function1, Modifier modifier, int i8, int i9) {
            super(2);
            this.f9920a = cVar;
            this.f9921b = z8;
            this.f9922c = function1;
            this.f9923d = modifier;
            this.f9924e = i8;
            this.f9925f = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            i.c(this.f9920a, this.f9921b, this.f9922c, this.f9923d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9924e | 1), this.f9925f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T2.i$i, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0220i extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f9926a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BringIntoViewRequester f9927b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f9928c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f9929d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FocusRequester f9930e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ FocusRequester f9931f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ FocusRequester f9932g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f9933h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0220i(BringIntoViewRequester bringIntoViewRequester, w0 w0Var, boolean z8, FocusRequester focusRequester, FocusRequester focusRequester2, FocusRequester focusRequester3, boolean z9, P5.d dVar) {
            super(2, dVar);
            this.f9927b = bringIntoViewRequester;
            this.f9928c = w0Var;
            this.f9929d = z8;
            this.f9930e = focusRequester;
            this.f9931f = focusRequester2;
            this.f9932g = focusRequester3;
            this.f9933h = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0220i(this.f9927b, this.f9928c, this.f9929d, this.f9930e, this.f9931f, this.f9932g, this.f9933h, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0220i) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            Object e8 = Q5.b.e();
            int i8 = this.f9926a;
            FocusRequester focusRequester = null;
            boolean z9 = true;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                BringIntoViewRequester bringIntoViewRequester = this.f9927b;
                this.f9926a = 1;
                if (androidx.compose.foundation.relocation.a.a(bringIntoViewRequester, null, this, 1, null) == e8) {
                    return e8;
                }
            }
            String s8 = this.f9928c.s();
            if (s8 != null && !g6.n.u(s8)) {
                z8 = false;
            } else {
                z8 = true;
            }
            String s9 = this.f9928c.s();
            if (s9 != null && !g6.n.u(s9)) {
                z9 = false;
            }
            boolean z10 = this.f9929d;
            if (z10 && z8) {
                focusRequester = this.f9930e;
            } else if (!z10 && z9) {
                focusRequester = this.f9931f;
            } else {
                FocusRequester focusRequester2 = this.f9932g;
                if (this.f9933h) {
                    focusRequester = focusRequester2;
                }
            }
            if (focusRequester != null) {
                focusRequester.requestFocus();
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f9934a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(MutableState mutableState) {
            super(0);
            this.f9934a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m64invoke();
            return I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m64invoke() {
            i.h(this.f9934a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final k f9935a = new k();

        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableState invoke() {
            MutableState mutableStateOf$default;
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            return mutableStateOf$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g0 f9936a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f9937b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q f9938c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w0 f9939d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f9940e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ U2.a f9941f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f9942g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f9943h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ S2.b f9944i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Modifier f9945j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f9946k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f9947l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(g0 g0Var, w0 w0Var, Q q8, w0 w0Var2, boolean z8, U2.a aVar, boolean z9, boolean z10, S2.b bVar, Modifier modifier, int i8, int i9) {
            super(2);
            this.f9936a = g0Var;
            this.f9937b = w0Var;
            this.f9938c = q8;
            this.f9939d = w0Var2;
            this.f9940e = z8;
            this.f9941f = aVar;
            this.f9942g = z9;
            this.f9943h = z10;
            this.f9944i = bVar;
            this.f9945j = modifier;
            this.f9946k = i8;
            this.f9947l = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            i.d(this.f9936a, this.f9937b, this.f9938c, this.f9939d, this.f9940e, this.f9941f, this.f9942g, this.f9943h, this.f9944i, this.f9945j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9946k | 1), this.f9947l);
        }
    }

    public static final void a(boolean z8, w0 emailController, U2.a signUpState, int i8, FocusRequester focusRequester, boolean z9, n nVar, Composer composer, int i9, int i10) {
        FocusRequester focusRequester2;
        boolean z10;
        n nVar2;
        P5.d dVar;
        boolean z11;
        AbstractC3159y.i(emailController, "emailController");
        AbstractC3159y.i(signUpState, "signUpState");
        Composer startRestartGroup = composer.startRestartGroup(1243429650);
        if ((i10 & 16) != 0) {
            startRestartGroup.startReplaceableGroup(-1492093893);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            focusRequester2 = (FocusRequester) rememberedValue;
        } else {
            focusRequester2 = focusRequester;
        }
        if ((i10 & 32) != 0) {
            z10 = false;
        } else {
            z10 = z9;
        }
        if ((i10 & 64) != 0) {
            nVar2 = null;
        } else {
            nVar2 = nVar;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1243429650, i9, -1, "com.stripe.android.link.ui.inline.EmailCollection (LinkOptionalInlineSignup.kt:173)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
        o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
        C0.c(emailController, z8, i8, FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.e.a(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), focusRequester2), null, 0, 0, null, startRestartGroup, ((i9 << 3) & 112) | 8 | ((i9 >> 3) & 896), PsExtractor.VIDEO_STREAM_MASK);
        startRestartGroup.startReplaceableGroup(-1293866320);
        if (signUpState == U2.a.f11058b) {
            float f8 = 8;
            z11 = true;
            dVar = null;
            b4.d.a(SemanticsModifierKt.semantics$default(PaddingKt.m603paddingqDBjuR0(SizeKt.m647size3ABfNKs(companion, Dp.m5178constructorimpl(32)), Dp.m5178constructorimpl(0), Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(16), Dp.m5178constructorimpl(f8)), false, a.f9897a, 1, null), MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable).m1178getPrimary0d7_KjU(), Dp.m5178constructorimpl(2), 0L, 0, startRestartGroup, 384, 24);
        } else {
            dVar = null;
            z11 = true;
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-1293851067);
        if (nVar2 != null) {
            nVar2.invoke(startRestartGroup, Integer.valueOf((i9 >> 18) & 14));
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (z10) {
            I i11 = I.f6474a;
            startRestartGroup.startReplaceableGroup(-1492059269);
            if ((((57344 & i9) ^ 24576) <= 16384 || !startRestartGroup.changed(focusRequester2)) && (i9 & 24576) != 16384) {
                z11 = false;
            }
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new b(focusRequester2, dVar);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(i11, (n) rememberedValue2, startRestartGroup, 70);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(z8, emailController, signUpState, i8, focusRequester2, z10, nVar2, i9, i10));
        }
    }

    public static final void b(Composer composer, int i8) {
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-2039774832);
        if (i8 == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2039774832, i8, -1, "com.stripe.android.link.ui.inline.LinkLogo (LinkOptionalInlineSignup.kt:213)");
            }
            if (AbstractC3087m.s(AbstractC3087m.n(MaterialTheme.INSTANCE, startRestartGroup, MaterialTheme.$stable).d())) {
                i9 = K2.i.f5902b;
            } else {
                i9 = K2.i.f5903c;
            }
            IconKt.m1266Iconww6aTOc(PainterResources_androidKt.painterResource(i9, startRestartGroup, 0), StringResources_androidKt.stringResource(K2.j.f5905b, startRestartGroup, 0), SemanticsModifierKt.semantics$default(PaddingKt.m604paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, Dp.m5178constructorimpl(16), 0.0f, 11, null), false, d.f9911a, 1, null), Color.Companion.m3007getUnspecified0d7_KjU(), startRestartGroup, 3080, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e(i8));
        }
    }

    public static final void c(T2.c viewModel, boolean z8, Function1 onStateChanged, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        boolean z9;
        AbstractC3159y.i(viewModel, "viewModel");
        AbstractC3159y.i(onStateChanged, "onStateChanged");
        Composer startRestartGroup = composer.startRestartGroup(-1868616687);
        if ((i9 & 8) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1868616687, i8, -1, "com.stripe.android.link.ui.inline.LinkOptionalInlineSignup (LinkOptionalInlineSignup.kt:61)");
        }
        State a8 = v4.f.a(viewModel.s(), startRestartGroup, 8);
        State a9 = v4.f.a(viewModel.m(), startRestartGroup, 8);
        T2.e e8 = e(a8);
        startRestartGroup.startReplaceableGroup(-233533584);
        if ((((i8 & 896) ^ 384) > 256 && startRestartGroup.changed(onStateChanged)) || (i8 & 384) == 256) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean changed = z9 | startRestartGroup.changed(a8);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new f(onStateChanged, a8, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(e8, (n) rememberedValue, startRestartGroup, 72);
        EffectsKt.LaunchedEffect(e(a8).f(), new g((FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager()), (TextInputService) startRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService()), a8, null), startRestartGroup, 64);
        g0 q8 = viewModel.q();
        s0 l8 = viewModel.l();
        Q o8 = viewModel.o();
        s0 n8 = viewModel.n();
        U2.a f8 = e(a8).f();
        boolean l9 = e(a8).l();
        boolean p8 = viewModel.p();
        S2.b f9 = f(a9);
        int i10 = g0.f35484c;
        int i11 = s0.f35671x;
        d(q8, l8, o8, n8, l9, f8, z8, p8, f9, modifier2, startRestartGroup, i10 | (i11 << 3) | (Q.f35181s << 6) | (i11 << 9) | ((i8 << 15) & 3670016) | ((i8 << 18) & 1879048192), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new h(viewModel, z8, onStateChanged, modifier2, i8, i9));
        }
    }

    public static final void d(g0 sectionController, w0 emailController, Q phoneNumberController, w0 nameController, boolean z8, U2.a signUpState, boolean z9, boolean z10, S2.b bVar, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        MutableState mutableState;
        Composer composer2;
        Integer num;
        AbstractC3159y.i(sectionController, "sectionController");
        AbstractC3159y.i(emailController, "emailController");
        AbstractC3159y.i(phoneNumberController, "phoneNumberController");
        AbstractC3159y.i(nameController, "nameController");
        AbstractC3159y.i(signUpState, "signUpState");
        Composer startRestartGroup = composer.startRestartGroup(-198300985);
        if ((i9 & 512) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-198300985, i8, -1, "com.stripe.android.link.ui.inline.LinkOptionalInlineSignup (LinkOptionalInlineSignup.kt:107)");
        }
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
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
        n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(726211115);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue == companion2.getEmpty()) {
            rememberedValue = BringIntoViewRequesterKt.BringIntoViewRequester();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(726213411);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion2.getEmpty()) {
            rememberedValue2 = new FocusRequester();
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        FocusRequester focusRequester = (FocusRequester) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(726215459);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion2.getEmpty()) {
            rememberedValue3 = new FocusRequester();
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        FocusRequester focusRequester2 = (FocusRequester) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(726217475);
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == companion2.getEmpty()) {
            rememberedValue4 = new FocusRequester();
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        FocusRequester focusRequester3 = (FocusRequester) rememberedValue4;
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) RememberSaveableKt.m2583rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) k.f9935a, startRestartGroup, 3080, 6);
        State a8 = v4.f.a(sectionController.getError(), startRestartGroup, 8);
        startRestartGroup.startReplaceableGroup(726224087);
        if (signUpState == U2.a.f11059c) {
            mutableState = mutableState2;
            composer2 = startRestartGroup;
            EffectsKt.LaunchedEffect(signUpState, new C0220i(bringIntoViewRequester, emailController, z8, focusRequester, focusRequester2, focusRequester3, z10, null), composer2, ((i8 >> 15) & 14) | 64);
        } else {
            mutableState = mutableState2;
            composer2 = startRestartGroup;
        }
        composer2.endReplaceableGroup();
        C i10 = i(a8);
        if (i10 != null) {
            num = Integer.valueOf(i10.a());
        } else {
            num = null;
        }
        boolean g8 = g(mutableState);
        composer2.startReplaceableGroup(726270241);
        MutableState mutableState3 = mutableState;
        boolean changed = composer2.changed(mutableState3);
        Object rememberedValue5 = composer2.rememberedValue();
        if (changed || rememberedValue5 == companion2.getEmpty()) {
            rememberedValue5 = new j(mutableState3);
            composer2.updateRememberedValue(rememberedValue5);
        }
        composer2.endReplaceableGroup();
        int i11 = i8 >> 3;
        Composer composer3 = composer2;
        T2.g.a(num, emailController, phoneNumberController, nameController, signUpState, z9, z8, z10, bVar, g8, (Function0) rememberedValue5, null, focusRequester, focusRequester2, focusRequester3, composer3, (Q.f35181s << 6) | 4160 | (i8 & 896) | (57344 & i11) | (i11 & 458752) | ((i8 << 6) & 3670016) | (29360128 & i8) | (234881024 & i8), 28032, 2048);
        S2.g.a(true, z8, BringIntoViewRequesterKt.bringIntoViewRequester(PaddingKt.m604paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dp.m5178constructorimpl(8), 0.0f, 0.0f, 13, null), bringIntoViewRequester), TextAlign.Companion.m5087getStarte0LSkKk(), composer3, ((i8 >> 9) & 112) | 6, 0);
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new l(sectionController, emailController, phoneNumberController, nameController, z8, signUpState, z9, z10, bVar, modifier2, i8, i9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final T2.e e(State state) {
        return (T2.e) state.getValue();
    }

    private static final S2.b f(State state) {
        return (S2.b) state.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean g(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(MutableState mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    private static final C i(State state) {
        return (C) state.getValue();
    }
}
