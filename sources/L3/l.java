package L3;

import L5.I;
import M5.AbstractC1246t;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import s4.C3755g;

/* loaded from: classes4.dex */
public abstract class l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f6296a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6297b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f6298c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3755g f6299d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f6300e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6301f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f6302g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list, int i8, boolean z8, C3755g c3755g, Modifier modifier, int i9, int i10) {
            super(2);
            this.f6296a = list;
            this.f6297b = i8;
            this.f6298c = z8;
            this.f6299d = c3755g;
            this.f6300e = modifier;
            this.f6301f = i9;
            this.f6302g = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            l.a(this.f6296a, this.f6297b, this.f6298c, this.f6299d, this.f6300e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6301f | 1), this.f6302g);
        }
    }

    public static final void a(List paymentMethods, int i8, boolean z8, C3755g imageLoader, Modifier modifier, Composer composer, int i9, int i10) {
        Modifier modifier2;
        boolean z9;
        AbstractC3159y.i(paymentMethods, "paymentMethods");
        AbstractC3159y.i(imageLoader, "imageLoader");
        Composer startRestartGroup = composer.startRestartGroup(-317174614);
        if ((i10 & 16) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-317174614, i9, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodVerticalLayoutUI (NewPaymentMethodVerticalLayoutUI.kt:19)");
        }
        Modifier testTag = TestTagKt.testTag(modifier2, "TEST_TAG_NEW_PAYMENT_METHOD_VERTICAL_LAYOUT_UI");
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
        startRestartGroup.startReplaceableGroup(-1479332989);
        int i11 = 0;
        for (Object obj : paymentMethods) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC1246t.w();
            }
            e eVar = (e) obj;
            if (i11 == i8) {
                z9 = true;
            } else {
                z9 = false;
            }
            k.b(z8, z9, eVar, imageLoader, null, startRestartGroup, ((i9 >> 6) & 14) | 512 | (C3755g.f37920g << 9) | (i9 & 7168), 16);
            i11 = i12;
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(paymentMethods, i8, z8, imageLoader, modifier2, i9, i10));
        }
    }
}
