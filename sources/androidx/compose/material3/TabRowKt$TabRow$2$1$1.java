package androidx.compose.material3;

import L5.I;
import M5.AbstractC1246t;
import X5.n;
import X5.o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TabRowKt$TabRow$2$1$1 extends AbstractC3160z implements n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ n $divider;
    final /* synthetic */ o $indicator;
    final /* synthetic */ n $tabs;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.TabRowKt$TabRow$2$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3160z implements Function1 {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ long $constraints;
        final /* synthetic */ n $divider;
        final /* synthetic */ o $indicator;
        final /* synthetic */ List<Placeable> $tabPlaceables;
        final /* synthetic */ List<TabPosition> $tabPositions;
        final /* synthetic */ int $tabRowHeight;
        final /* synthetic */ int $tabRowWidth;
        final /* synthetic */ int $tabWidth;
        final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material3.TabRowKt$TabRow$2$1$1$1$3, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass3 extends AbstractC3160z implements n {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ o $indicator;
            final /* synthetic */ List<TabPosition> $tabPositions;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(o oVar, List<TabPosition> list, int i8) {
                super(2);
                this.$indicator = oVar;
                this.$tabPositions = list;
                this.$$dirty = i8;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6474a;
            }

            @Composable
            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-976887453, i8, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                }
                this.$indicator.invoke(this.$tabPositions, composer, Integer.valueOf(((this.$$dirty >> 9) & 112) | 8));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(List<? extends Placeable> list, SubcomposeMeasureScope subcomposeMeasureScope, n nVar, int i8, long j8, int i9, o oVar, List<TabPosition> list2, int i10, int i11) {
            super(1);
            this.$tabPlaceables = list;
            this.$this_SubcomposeLayout = subcomposeMeasureScope;
            this.$divider = nVar;
            this.$tabWidth = i8;
            this.$constraints = j8;
            this.$tabRowHeight = i9;
            this.$indicator = oVar;
            this.$tabPositions = list2;
            this.$$dirty = i10;
            this.$tabRowWidth = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Placeable.PlacementScope) obj);
            return I.f6474a;
        }

        public final void invoke(Placeable.PlacementScope layout) {
            AbstractC3159y.i(layout, "$this$layout");
            List<Placeable> list = this.$tabPlaceables;
            int i8 = this.$tabWidth;
            int i9 = 0;
            for (Object obj : list) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    AbstractC1246t.w();
                }
                Placeable.PlacementScope.placeRelative$default(layout, (Placeable) obj, i9 * i8, 0, 0.0f, 4, null);
                i9 = i10;
            }
            List<Measurable> subcompose = this.$this_SubcomposeLayout.subcompose(TabSlots.Divider, this.$divider);
            long j8 = this.$constraints;
            int i11 = this.$tabRowHeight;
            Iterator<T> it = subcompose.iterator();
            while (it.hasNext()) {
                Placeable mo4131measureBRTryo0 = ((Measurable) it.next()).mo4131measureBRTryo0(Constraints.m5137copyZbe2FdA$default(j8, 0, 0, 0, 0, 11, null));
                Placeable.PlacementScope.placeRelative$default(layout, mo4131measureBRTryo0, 0, i11 - mo4131measureBRTryo0.getHeight(), 0.0f, 4, null);
                i11 = i11;
                j8 = j8;
            }
            List<Measurable> subcompose2 = this.$this_SubcomposeLayout.subcompose(TabSlots.Indicator, ComposableLambdaKt.composableLambdaInstance(-976887453, true, new AnonymousClass3(this.$indicator, this.$tabPositions, this.$$dirty)));
            int i12 = this.$tabRowWidth;
            int i13 = this.$tabRowHeight;
            Iterator<T> it2 = subcompose2.iterator();
            while (it2.hasNext()) {
                Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo4131measureBRTryo0(Constraints.Companion.m5154fixedJhjzzOo(i12, i13)), 0, 0, 0.0f, 4, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$TabRow$2$1$1(n nVar, n nVar2, o oVar, int i8) {
        super(2);
        this.$tabs = nVar;
        this.$divider = nVar2;
        this.$indicator = oVar;
        this.$$dirty = i8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1839invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).m5152unboximpl());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final MeasureResult m1839invoke0kLqBqw(SubcomposeMeasureScope SubcomposeLayout, long j8) {
        AbstractC3159y.i(SubcomposeLayout, "$this$SubcomposeLayout");
        int m5146getMaxWidthimpl = Constraints.m5146getMaxWidthimpl(j8);
        List<Measurable> subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, this.$tabs);
        int size = subcompose.size();
        int i8 = m5146getMaxWidthimpl / size;
        List<Measurable> list = subcompose;
        Iterator<T> it = list.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            i9 = Math.max(((Measurable) it.next()).maxIntrinsicHeight(i8), i9);
        }
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            int i10 = m5146getMaxWidthimpl;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(((Measurable) it2.next()).mo4131measureBRTryo0(Constraints.m5137copyZbe2FdA$default(j8, i8, i8, i9, 0, 8, null)));
            arrayList = arrayList2;
            m5146getMaxWidthimpl = i10;
        }
        int i11 = m5146getMaxWidthimpl;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList4.add(new TabPosition(Dp.m5178constructorimpl(SubcomposeLayout.mo445toDpu2uoSUM(i8) * i12), SubcomposeLayout.mo445toDpu2uoSUM(i8), null));
        }
        return MeasureScope.CC.q(SubcomposeLayout, i11, i9, null, new AnonymousClass1(arrayList3, SubcomposeLayout, this.$divider, i8, j8, i9, this.$indicator, arrayList4, this.$$dirty, i11), 4, null);
    }
}
