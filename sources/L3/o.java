package L3;

import L3.n;
import L5.I;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.KeyboardArrowRightKt;
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
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import j2.AbstractC3053E;
import j4.AbstractC3087m;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import q3.C3654g;
import q3.w;
import s4.C3755g;
import t3.AbstractC3793c;
import y3.AbstractC3991f;
import y3.AbstractC3992g;

/* loaded from: classes4.dex */
public abstract class o {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f6344a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6345b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0 function0, int i8) {
            super(2);
            this.f6344a = function0;
            this.f6345b = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            o.a(this.f6344a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6345b | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f6346a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n nVar) {
            super(0);
            this.f6346a = nVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m52invoke();
            return I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m52invoke() {
            this.f6346a.b(n.c.e.f6343a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f6347a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n nVar) {
            super(0);
            this.f6347a = nVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m53invoke();
            return I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m53invoke() {
            this.f6347a.b(n.c.d.f6342a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f6348a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(n nVar) {
            super(1);
            this.f6348a = nVar;
        }

        public final void a(C3654g it) {
            AbstractC3159y.i(it, "it");
            this.f6348a.b(new n.c.a(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C3654g) obj);
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f6349a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(n nVar) {
            super(1);
            this.f6349a = nVar;
        }

        public final void a(C3654g it) {
            AbstractC3159y.i(it, "it");
            this.f6349a.b(new n.c.C0135c(it.d()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C3654g) obj);
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f6350a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f6351b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6352c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6353d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(n nVar, Modifier modifier, int i8, int i9) {
            super(2);
            this.f6350a = nVar;
            this.f6351b = modifier;
            this.f6352c = i8;
            this.f6353d = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            o.b(this.f6350a, this.f6351b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6352c | 1), this.f6353d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f6354a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3654g f6355b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Function1 function1, C3654g c3654g) {
            super(0);
            this.f6354a = function1;
            this.f6355b = c3654g;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m54invoke();
            return I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m54invoke() {
            this.f6354a.invoke(this.f6355b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3654g f6356a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n.a f6357b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f6358c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f6359d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f6360e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C3654g c3654g, n.a aVar, Function0 function0, Function0 function02, Function1 function1) {
            super(3);
            this.f6356a = c3654g;
            this.f6357b = aVar;
            this.f6358c = function0;
            this.f6359d = function02;
            this.f6360e = function1;
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
                ComposerKt.traceEventStart(-1047630137, i8, -1, "com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutUI.<anonymous>.<anonymous> (PaymentMethodVerticalLayoutUI.kt:114)");
            }
            o.e(this.f6356a, this.f6357b, this.f6358c, this.f6359d, this.f6360e, composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f6361a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3654g f6362b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n.a f6363c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC3991f f6364d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f6365e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f6366f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0 f6367g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f6368h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f6369i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C3755g f6370j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Modifier f6371k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f6372l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f6373m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f6374n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(List list, C3654g c3654g, n.a aVar, AbstractC3991f abstractC3991f, boolean z8, Function0 function0, Function0 function02, Function1 function1, Function1 function12, C3755g c3755g, Modifier modifier, int i8, int i9, int i10) {
            super(2);
            this.f6361a = list;
            this.f6362b = c3654g;
            this.f6363c = aVar;
            this.f6364d = abstractC3991f;
            this.f6365e = z8;
            this.f6366f = function0;
            this.f6367g = function02;
            this.f6368h = function1;
            this.f6369i = function12;
            this.f6370j = c3755g;
            this.f6371k = modifier;
            this.f6372l = i8;
            this.f6373m = i9;
            this.f6374n = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            o.c(this.f6361a, this.f6362b, this.f6363c, this.f6364d, this.f6365e, this.f6366f, this.f6367g, this.f6368h, this.f6369i, this.f6370j, this.f6371k, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6372l | 1), RecomposeScopeImplKt.updateChangedFlags(this.f6373m), this.f6374n);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f6375a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3654g f6376b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Function1 function1, C3654g c3654g) {
            super(0);
            this.f6375a = function1;
            this.f6376b = c3654g;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m55invoke();
            return I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m55invoke() {
            this.f6375a.invoke(this.f6376b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3654g f6377a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n.a f6378b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f6379c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f6380d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f6381e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6382f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(C3654g c3654g, n.a aVar, Function0 function0, Function0 function02, Function1 function1, int i8) {
            super(2);
            this.f6377a = c3654g;
            this.f6378b = aVar;
            this.f6379c = function0;
            this.f6380d = function02;
            this.f6381e = function1;
            this.f6382f = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            o.e(this.f6377a, this.f6378b, this.f6379c, this.f6380d, this.f6381e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6382f | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f6383a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6384b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Function0 function0, int i8) {
            super(2);
            this.f6383a = function0;
            this.f6384b = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            o.f(this.f6383a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6384b | 1));
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class m {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6385a;

        static {
            int[] iArr = new int[n.a.values().length];
            try {
                iArr[n.a.f6327a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.a.f6328b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.a.f6329c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n.a.f6330d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6385a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function0 function0, Composer composer, int i8) {
        int i9;
        Composer composer2;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-716177738);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
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
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-716177738, i9, -1, "com.stripe.android.paymentsheet.verticalmode.EditButton (PaymentMethodVerticalLayoutUI.kt:170)");
            }
            String stringResource = StringResources_androidKt.stringResource(AbstractC3053E.f32871i0, startRestartGroup, 0);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i11 = MaterialTheme.$stable;
            long m1178getPrimary0d7_KjU = materialTheme.getColors(startRestartGroup, i11).m1178getPrimary0d7_KjU();
            TextStyle button = materialTheme.getTypography(startRestartGroup, i11).getButton();
            composer2 = startRestartGroup;
            TextKt.m1414Text4IGK_g(stringResource, PaddingKt.m600padding3ABfNKs(ClickableKt.m315clickableXHw0xAI$default(TestTagKt.testTag(Modifier.Companion, "TEST_TAG_VERTICAL_MODE_SAVED_PM_EDIT"), false, null, null, function0, 7, null), Dp.m5178constructorimpl(4)), m1178getPrimary0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, button, composer2, 0, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(function0, i8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(L3.n r24, androidx.compose.ui.Modifier r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.o.b(L3.n, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(List paymentMethods, C3654g c3654g, n.a savedPaymentMethodAction, AbstractC3991f abstractC3991f, boolean z8, Function0 onViewMorePaymentMethods, Function0 onManageOneSavedPaymentMethod, Function1 onEditPaymentMethod, Function1 onSelectSavedPaymentMethod, C3755g imageLoader, Modifier modifier, Composer composer, int i8, int i9, int i10) {
        Composer composer2;
        int i11;
        int i12;
        AbstractC3159y.i(paymentMethods, "paymentMethods");
        AbstractC3159y.i(savedPaymentMethodAction, "savedPaymentMethodAction");
        AbstractC3159y.i(onViewMorePaymentMethods, "onViewMorePaymentMethods");
        AbstractC3159y.i(onManageOneSavedPaymentMethod, "onManageOneSavedPaymentMethod");
        AbstractC3159y.i(onEditPaymentMethod, "onEditPaymentMethod");
        AbstractC3159y.i(onSelectSavedPaymentMethod, "onSelectSavedPaymentMethod");
        AbstractC3159y.i(imageLoader, "imageLoader");
        Composer startRestartGroup = composer.startRestartGroup(1650746819);
        Modifier modifier2 = (i10 & 1024) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1650746819, i8, i9, "com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutUI (PaymentMethodVerticalLayoutUI.kt:97)");
        }
        Arrangement.HorizontalOrVertical m514spacedBy0680j_4 = Arrangement.INSTANCE.m514spacedBy0680j_4(Dp.m5178constructorimpl(12));
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m514spacedBy0680j_4, Alignment.Companion.getStart(), startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
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
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i13 = MaterialTheme.$stable;
        TextStyle subtitle1 = materialTheme.getTypography(startRestartGroup, i13).getSubtitle1();
        long h8 = AbstractC3087m.n(materialTheme, startRestartGroup, i13).h();
        startRestartGroup.startReplaceableGroup(962083850);
        if (c3654g != null) {
            TextKt.m1414Text4IGK_g(StringResources_androidKt.stringResource(w.f37439d0, startRestartGroup, 0), TestTagKt.testTag(Modifier.Companion, "TEST_TAG_SAVED_TEXT"), h8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, subtitle1, startRestartGroup, 48, 0, 65528);
            composer2 = startRestartGroup;
            i12 = 1;
            p.a(c3654g, z8, false, abstractC3991f != null && AbstractC3992g.b(abstractC3991f), null, new g(onSelectSavedPaymentMethod, c3654g), ComposableLambdaKt.composableLambda(startRestartGroup, -1047630137, true, new h(c3654g, savedPaymentMethodAction, onViewMorePaymentMethods, onManageOneSavedPaymentMethod, onEditPaymentMethod)), composer2, ((i8 >> 9) & 112) | 1572872, 20);
            i11 = 0;
            TextKt.m1414Text4IGK_g(StringResources_androidKt.stringResource(w.f37419N, composer2, 0), (Modifier) null, h8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, subtitle1, composer2, 0, 0, 65530);
        } else {
            composer2 = startRestartGroup;
            i11 = 0;
            i12 = 1;
        }
        composer2.endReplaceableGroup();
        composer2.startReplaceableGroup(962123858);
        boolean changed = composer2.changed(abstractC3991f) | composer2.changed(paymentMethods);
        Object rememberedValue = composer2.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            int i14 = -1;
            if (abstractC3991f != null && !AbstractC3992g.b(abstractC3991f)) {
                String c8 = AbstractC3793c.c(abstractC3991f);
                Iterator it = paymentMethods.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (AbstractC3159y.d(((L3.e) it.next()).a(), c8)) {
                        i14 = i11;
                        break;
                    }
                    i11 += i12;
                }
            }
            rememberedValue = Integer.valueOf(i14);
            composer2.updateRememberedValue(rememberedValue);
        }
        int intValue = ((Number) rememberedValue).intValue();
        composer2.endReplaceableGroup();
        Composer composer3 = composer2;
        L3.l.a(paymentMethods, intValue, z8, imageLoader, null, composer2, ((i8 >> 6) & 896) | 8 | (C3755g.f37920g << 9) | ((i8 >> 18) & 7168), 16);
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new i(paymentMethods, c3654g, savedPaymentMethodAction, abstractC3991f, z8, onViewMorePaymentMethods, onManageOneSavedPaymentMethod, onEditPaymentMethod, onSelectSavedPaymentMethod, imageLoader, modifier2, i8, i9, i10));
        }
    }

    private static final n.b d(State state) {
        return (n.b) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C3654g c3654g, n.a aVar, Function0 function0, Function0 function02, Function1 function1, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(801308256);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(801308256, i8, -1, "com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodTrailingContent (PaymentMethodVerticalLayoutUI.kt:152)");
        }
        int i9 = m.f6385a[aVar.ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        startRestartGroup.startReplaceableGroup(1195991352);
                        startRestartGroup.endReplaceableGroup();
                    } else {
                        startRestartGroup.startReplaceableGroup(1195869119);
                        f(function0, startRestartGroup, (i8 >> 6) & 14);
                        startRestartGroup.endReplaceableGroup();
                    }
                } else {
                    startRestartGroup.startReplaceableGroup(1195707981);
                    a(function02, startRestartGroup, (i8 >> 9) & 14);
                    startRestartGroup.endReplaceableGroup();
                }
            } else {
                startRestartGroup.startReplaceableGroup(1195526166);
                a(new j(function1, c3654g), startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
            }
        } else {
            startRestartGroup.startReplaceableGroup(-99985106);
            startRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new k(c3654g, aVar, function0, function02, function1, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Function0 function0, Composer composer, int i8) {
        int i9;
        Composer composer2;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-446496442);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
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
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-446496442, i9, -1, "com.stripe.android.paymentsheet.verticalmode.ViewMoreButton (PaymentMethodVerticalLayoutUI.kt:185)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier m600padding3ABfNKs = PaddingKt.m600padding3ABfNKs(ClickableKt.m315clickableXHw0xAI$default(TestTagKt.testTag(Modifier.Companion, "TEST_TAG_VIEW_MORE"), false, null, null, function0, 7, null), Dp.m5178constructorimpl(4));
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m600padding3ABfNKs);
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
            Updater.m2503setimpl(m2496constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String stringResource = StringResources_androidKt.stringResource(w.f37459n0, startRestartGroup, 0);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i11 = MaterialTheme.$stable;
            composer2 = startRestartGroup;
            TextKt.m1414Text4IGK_g(stringResource, (Modifier) null, materialTheme.getColors(startRestartGroup, i11).m1178getPrimary0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, materialTheme.getTypography(startRestartGroup, i11).getButton(), composer2, 0, 0, 65530);
            IconKt.m1267Iconww6aTOc(KeyboardArrowRightKt.getKeyboardArrowRight(Icons.Filled.INSTANCE), (String) null, (Modifier) null, materialTheme.getColors(composer2, i11).m1178getPrimary0d7_KjU(), composer2, 48, 4);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new l(function0, i8));
        }
    }
}
