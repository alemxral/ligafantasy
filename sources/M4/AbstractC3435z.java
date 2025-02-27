package m4;

import M5.AbstractC1246t;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.AndroidMenu_androidKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import j4.AbstractC3080f;
import j4.AbstractC3081g;
import j4.AbstractC3087m;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: m4.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3435z {

    /* renamed from: a, reason: collision with root package name */
    private static final float f35800a = Dp.m5178constructorimpl(280);

    /* renamed from: b, reason: collision with root package name */
    private static final float f35801b = Dp.m5178constructorimpl(48);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.z$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35802a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusProperties) obj);
            return L5.I.f6474a;
        }

        public final void invoke(FocusProperties focusProperties) {
            AbstractC3159y.i(focusProperties, "$this$focusProperties");
            focusProperties.setCanFocus(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.z$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f35803a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MutableState mutableState) {
            super(0);
            this.f35803a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5616invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5616invoke() {
            AbstractC3435z.e(this.f35803a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.z$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f35804a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MutableState mutableState) {
            super(0);
            this.f35804a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5617invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5617invoke() {
            AbstractC3435z.e(this.f35804a, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.z$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f35805a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f35806b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f35807c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3434y f35808d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ MutableState f35809e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: m4.z$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3434y f35810a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f35811b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ MutableState f35812c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3434y c3434y, int i8, MutableState mutableState) {
                super(0);
                this.f35810a = c3434y;
                this.f35811b = i8;
                this.f35812c = mutableState;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5618invoke();
                return L5.I.f6474a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5618invoke() {
                AbstractC3435z.e(this.f35812c, false);
                this.f35810a.C(this.f35811b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List list, long j8, State state, C3434y c3434y, MutableState mutableState) {
            super(3);
            this.f35805a = list;
            this.f35806b = j8;
            this.f35807c = state;
            this.f35808d = c3434y;
            this.f35809e = mutableState;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(ColumnScope DropdownMenu, Composer composer, int i8) {
            AbstractC3159y.i(DropdownMenu, "$this$DropdownMenu");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1362403838, i8, -1, "com.stripe.android.uicore.elements.DropDown.<anonymous>.<anonymous> (DropdownFieldUI.kt:151)");
            }
            List list = this.f35805a;
            long j8 = this.f35806b;
            State state = this.f35807c;
            C3434y c3434y = this.f35808d;
            MutableState mutableState = this.f35809e;
            int i9 = 0;
            for (Object obj : list) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    AbstractC1246t.w();
                }
                AbstractC3435z.g((String) obj, i9 == AbstractC3435z.c(state), j8, new a(c3434y, i9, mutableState), composer, 0, 0);
                i9 = i10;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.z$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3434y f35813a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35814b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f35815c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f35816d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f35817e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f35818f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C3434y c3434y, boolean z8, Modifier modifier, boolean z9, int i8, int i9) {
            super(2);
            this.f35813a = c3434y;
            this.f35814b = z8;
            this.f35815c = modifier;
            this.f35816d = z9;
            this.f35817e = i8;
            this.f35818f = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3435z.a(this.f35813a, this.f35814b, this.f35815c, this.f35816d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35817e | 1), this.f35818f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.z$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3434y f35819a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f35820b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C3434y c3434y, State state) {
            super(1);
            this.f35819a = c3434y;
            this.f35820b = state;
        }

        public final String a(int i8) {
            return this.f35819a.A(AbstractC3435z.c(this.f35820b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.z$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f35821a = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5619invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5619invoke() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.z$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f35822a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Function0 function0) {
            super(0);
            this.f35822a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5620invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5620invoke() {
            this.f35822a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.z$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f35823a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35824b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f35825c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f35826d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f35827e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f35828f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, boolean z8, long j8, Function0 function0, int i8, int i9) {
            super(2);
            this.f35823a = str;
            this.f35824b = z8;
            this.f35825c = j8;
            this.f35826d = function0;
            this.f35827e = i8;
            this.f35828f = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3435z.g(this.f35823a, this.f35824b, this.f35825c, this.f35826d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35827e | 1), this.f35828f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.z$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f35829a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35830b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35831c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f35832d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f35833e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f35834f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f35835g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Integer num, boolean z8, String str, long j8, boolean z9, boolean z10, int i8) {
            super(2);
            this.f35829a = num;
            this.f35830b = z8;
            this.f35831c = str;
            this.f35832d = j8;
            this.f35833e = z9;
            this.f35834f = z10;
            this.f35835g = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3435z.h(this.f35829a, this.f35830b, this.f35831c, this.f35832d, this.f35833e, this.f35834f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35835g | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.z$k */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f35836a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f35837b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f35838c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f35839d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f35840e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, long j8, boolean z8, boolean z9, int i8) {
            super(2);
            this.f35836a = str;
            this.f35837b = j8;
            this.f35838c = z8;
            this.f35839d = z9;
            this.f35840e = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3435z.i(this.f35836a, this.f35837b, this.f35838c, this.f35839d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35840e | 1));
        }
    }

    public static final void a(C3434y controller, boolean z8, Modifier modifier, boolean z9, Composer composer, int i8, int i9) {
        Modifier modifier2;
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj;
        MutableState mutableState;
        long j8;
        MutableState mutableState2;
        String str;
        MutableState mutableState3;
        int i10;
        Modifier.Companion companion;
        AbstractC3159y.i(controller, "controller");
        Composer startRestartGroup = composer.startRestartGroup(958043205);
        if ((i9 & 4) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i9 & 8) != 0) {
            z10 = true;
        } else {
            z10 = z9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(958043205, i8, -1, "com.stripe.android.uicore.elements.DropDown (DropdownFieldUI.kt:84)");
        }
        State a8 = v4.f.a(controller.b(), startRestartGroup, 8);
        State a9 = v4.f.a(controller.z(), startRestartGroup, 8);
        List x8 = controller.x();
        if (x8.size() == 1 && controller.w()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z8 && !z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        startRestartGroup.startReplaceableGroup(468485858);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue == companion2.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState4 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        State a10 = v4.f.a(v4.g.m(controller.z(), new f(controller, a9)), startRestartGroup, 8);
        startRestartGroup.startReplaceableGroup(468492647);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion2.getEmpty()) {
            rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        if (z12) {
            startRestartGroup.startReplaceableGroup(1638454956);
            long h8 = AbstractC3087m.n(MaterialTheme.INSTANCE, startRestartGroup, MaterialTheme.$stable).h();
            startRestartGroup.endReplaceableGroup();
            j8 = h8;
            obj = null;
            mutableState = mutableState4;
        } else {
            startRestartGroup.startReplaceableGroup(1638518506);
            obj = null;
            mutableState = mutableState4;
            long m2981unboximpl = TextFieldDefaults.INSTANCE.m1399textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151).indicatorColor(false, false, mutableInteractionSource, startRestartGroup, 438).getValue().m2981unboximpl();
            startRestartGroup.endReplaceableGroup();
            j8 = m2981unboximpl;
        }
        Modifier.Companion companion3 = Modifier.Companion;
        Alignment.Companion companion4 = Alignment.Companion;
        Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(companion3, companion4.getTopStart(), false, 2, obj);
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i11 = MaterialTheme.$stable;
        Modifier then = BackgroundKt.m282backgroundbw27NRU$default(wrapContentSize$default, AbstractC3087m.n(materialTheme, startRestartGroup, i11).d(), null, 2, null).then(modifier2);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
        Function0 constructor = companion5.getConstructor();
        X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(then);
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
        Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash = companion5.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier focusProperties = FocusPropertiesKt.focusProperties(companion3, a.f35802a);
        String stringResource = StringResources_androidKt.stringResource(AbstractC3081g.f33199z, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-438263598);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion2.getEmpty()) {
            mutableState2 = mutableState;
            rememberedValue3 = new b(mutableState2);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        } else {
            mutableState2 = mutableState;
        }
        startRestartGroup.endReplaceableGroup();
        Modifier m315clickableXHw0xAI$default = ClickableKt.m315clickableXHw0xAI$default(focusProperties, z12, stringResource, null, (Function0) rememberedValue3, 4, null);
        if (controller.B()) {
            str = "tiny";
        } else {
            str = "normal";
        }
        Modifier testTag = TestTagKt.testTag(m315clickableXHw0xAI$default, "DropDown:" + str);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0 constructor2 = companion5.getConstructor();
        X5.o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(testTag);
        Modifier modifier3 = modifier2;
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
        Updater.m2503setimpl(m2496constructorimpl2, rememberBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
        if (m2496constructorimpl2.getInserting() || !AbstractC3159y.d(m2496constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m2496constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m2496constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        if (controller.B()) {
            startRestartGroup.startReplaceableGroup(-1438505697);
            mutableState3 = mutableState2;
            i10 = i11;
            companion = companion3;
            i(f(a10), j8, z11, z10, startRestartGroup, i8 & 7168);
            startRestartGroup.endReplaceableGroup();
        } else {
            mutableState3 = mutableState2;
            i10 = i11;
            companion = companion3;
            startRestartGroup.startReplaceableGroup(-1438174710);
            h(Integer.valueOf(b(a8)), z12, f(a10), j8, z11, z10, startRestartGroup, (i8 << 6) & 458752);
            startRestartGroup.endReplaceableGroup();
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        boolean d8 = d(mutableState3);
        startRestartGroup.startReplaceableGroup(-438231181);
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == companion2.getEmpty()) {
            rememberedValue4 = new c(mutableState3);
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        startRestartGroup.endReplaceableGroup();
        AndroidMenu_androidKt.m1100DropdownMenu4kj_NE(d8, (Function0) rememberedValue4, SizeKt.m643requiredSizeInqDBjuR0$default(SizeKt.m652width3ABfNKs(BackgroundKt.m282backgroundbw27NRU$default(companion, AbstractC3087m.n(materialTheme, startRestartGroup, i10).d(), null, 2, null), f35800a), 0.0f, 0.0f, 0.0f, Dp.m5178constructorimpl(f35801b * 8.9f), 7, null), 0L, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1362403838, true, new d(x8, j8, a9, controller, mutableState3)), startRestartGroup, 1572912, 56);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e(controller, z8, modifier3, z10, i8, i9));
        }
    }

    private static final int b(State state) {
        return ((Number) state.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(State state) {
        return ((Number) state.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean d(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MutableState mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    private static final String f(State state) {
        return (String) state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(java.lang.String r31, boolean r32, long r33, kotlin.jvm.functions.Function0 r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.AbstractC3435z.g(java.lang.String, boolean, long, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Integer num, boolean z8, String str, long j8, boolean z9, boolean z10, Composer composer, int i8) {
        int i9;
        RowScopeInstance rowScopeInstance;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(1222675217);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(num)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i9 = i15 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(z8)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i9 |= i14;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(str)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i9 |= i13;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(j8)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i9 |= i12;
        }
        if ((57344 & i8) == 0) {
            if (startRestartGroup.changed(z9)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i9 |= i11;
        }
        if ((458752 & i8) == 0) {
            if (startRestartGroup.changed(z10)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i9 |= i10;
        }
        if ((374491 & i9) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1222675217, i9, -1, "com.stripe.android.uicore.elements.LargeDropdownLabel (DropdownFieldUI.kt:174)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
            Updater.m2503setimpl(m2496constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            Modifier m604paddingqDBjuR0$default = PaddingKt.m604paddingqDBjuR0$default(companion, Dp.m5178constructorimpl(16), Dp.m5178constructorimpl(4), 0.0f, Dp.m5178constructorimpl(8), 4, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion3.getConstructor();
            X5.o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m604paddingqDBjuR0$default);
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
            Updater.m2503setimpl(m2496constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m2496constructorimpl2.getInserting() || !AbstractC3159y.d(m2496constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2496constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2496constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(122130702);
            if (num == null) {
                rowScopeInstance = rowScopeInstance2;
            } else {
                rowScopeInstance = rowScopeInstance2;
                E.a(StringResources_androidKt.stringResource(num.intValue(), startRestartGroup, 0), null, z8, startRestartGroup, (i9 << 3) & 896, 2);
                L5.I i16 = L5.I.f6474a;
            }
            startRestartGroup.endReplaceableGroup();
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 0.9f);
            Alignment.Vertical bottom = companion2.getBottom();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), bottom, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor3 = companion3.getConstructor();
            X5.o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(fillMaxWidth);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2496constructorimpl3 = Updater.m2496constructorimpl(startRestartGroup);
            Updater.m2503setimpl(m2496constructorimpl3, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m2496constructorimpl3.getInserting() || !AbstractC3159y.d(m2496constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m2496constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m2496constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            TextKt.m1414Text4IGK_g(str, (Modifier) null, j8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, startRestartGroup, ((i9 >> 6) & 14) | ((i9 >> 3) & 896), 0, 131066);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1732350405);
            if (!z9 && z10) {
                Modifier align = rowScopeInstance.align(companion, companion2.getCenterVertically());
                startRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0 constructor4 = companion3.getConstructor();
                X5.o modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(align);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2496constructorimpl4 = Updater.m2496constructorimpl(startRestartGroup);
                Updater.m2503setimpl(m2496constructorimpl4, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m2503setimpl(m2496constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                X5.n setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                if (m2496constructorimpl4.getInserting() || !AbstractC3159y.d(m2496constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m2496constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m2496constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                modifierMaterializerOf4.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                IconKt.m1266Iconww6aTOc(PainterResources_androidKt.painterResource(AbstractC3080f.f33162a, startRestartGroup, 0), (String) null, SizeKt.m633height3ABfNKs(companion, Dp.m5178constructorimpl(24)), j8, startRestartGroup, (i9 & 7168) | 440, 0);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
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
            endRestartGroup.updateScope(new j(num, z8, str, j8, z9, z10, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(String str, long j8, boolean z8, boolean z9, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1262178129);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(j8)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(z8)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(z9)) {
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
                ComposerKt.traceEventStart(1262178129, i9, -1, "com.stripe.android.uicore.elements.TinyDropdownLabel (DropdownFieldUI.kt:218)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
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
            TextKt.m1414Text4IGK_g(str, (Modifier) null, j8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, startRestartGroup, (i9 & 14) | ((i9 << 3) & 896), 0, 131066);
            startRestartGroup.startReplaceableGroup(-2061792662);
            if (!z8 && z9) {
                IconKt.m1266Iconww6aTOc(PainterResources_androidKt.painterResource(AbstractC3080f.f33162a, startRestartGroup, 0), (String) null, SizeKt.m633height3ABfNKs(companion, Dp.m5178constructorimpl(24)), AbstractC3087m.n(MaterialTheme.INSTANCE, startRestartGroup, MaterialTheme.$stable).i(), startRestartGroup, 440, 0);
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
            endRestartGroup.updateScope(new k(str, j8, z8, z9, i8));
        }
    }
}
