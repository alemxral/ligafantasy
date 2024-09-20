package J3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public abstract class S {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f4868a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4869b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f4870c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ PaddingValues f4871d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Arrangement.Vertical f4872e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ X5.o f4873f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, boolean z9, Function0 function0, PaddingValues paddingValues, Arrangement.Vertical vertical, X5.o oVar) {
            super(2);
            this.f4868a = z8;
            this.f4869b = z9;
            this.f4870c = function0;
            this.f4871d = paddingValues;
            this.f4872e = vertical;
            this.f4873f = oVar;
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
                ComposerKt.traceEventStart(-1029411776, i8, -1, "com.stripe.android.paymentsheet.ui.RowButton.<anonymous> (RowButton.kt:36)");
            }
            Modifier padding = PaddingKt.padding(SelectableKt.m825selectableXHw0xAI$default(Modifier.Companion, this.f4868a, this.f4869b, null, this.f4870c, 4, null), this.f4871d);
            Arrangement.Vertical vertical = this.f4872e;
            X5.o oVar = this.f4873f;
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(vertical, Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(padding);
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
            X5.n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            oVar.invoke(ColumnScopeInstance.INSTANCE, composer, 6);
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
    public static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f4874a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4875b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4876c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f4877d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ PaddingValues f4878e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Arrangement.Vertical f4879f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f4880g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ X5.o f4881h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f4882i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f4883j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, boolean z9, boolean z10, Function0 function0, PaddingValues paddingValues, Arrangement.Vertical vertical, Modifier modifier, X5.o oVar, int i8, int i9) {
            super(2);
            this.f4874a = z8;
            this.f4875b = z9;
            this.f4876c = z10;
            this.f4877d = function0;
            this.f4878e = paddingValues;
            this.f4879f = vertical;
            this.f4880g = modifier;
            this.f4881h = oVar;
            this.f4882i = i8;
            this.f4883j = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            S.a(this.f4874a, this.f4875b, this.f4876c, this.f4877d, this.f4878e, this.f4879f, this.f4880g, this.f4881h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4882i | 1), this.f4883j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r29, boolean r30, boolean r31, kotlin.jvm.functions.Function0 r32, androidx.compose.foundation.layout.PaddingValues r33, androidx.compose.foundation.layout.Arrangement.Vertical r34, androidx.compose.ui.Modifier r35, X5.o r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.S.a(boolean, boolean, boolean, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Modifier, X5.o, androidx.compose.runtime.Composer, int, int):void");
    }
}
