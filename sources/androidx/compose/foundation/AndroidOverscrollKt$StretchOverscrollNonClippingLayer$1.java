package androidx.compose.foundation;

import L5.I;
import X5.o;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1 extends AbstractC3160z implements o {
    public static final AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1 INSTANCE = new AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3160z implements Function1 {
        final /* synthetic */ int $extraSizePx;
        final /* synthetic */ Placeable $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Placeable placeable, int i8) {
            super(1);
            this.$placeable = placeable;
            this.$extraSizePx = i8;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Placeable.PlacementScope) obj);
            return I.f6474a;
        }

        public final void invoke(Placeable.PlacementScope layout) {
            AbstractC3159y.i(layout, "$this$layout");
            Placeable placeable = this.$placeable;
            Placeable.PlacementScope.placeWithLayer$default(layout, placeable, ((-this.$extraSizePx) / 2) - ((placeable.getWidth() - this.$placeable.getMeasuredWidth()) / 2), ((-this.$extraSizePx) / 2) - ((this.$placeable.getHeight() - this.$placeable.getMeasuredHeight()) / 2), 0.0f, null, 12, null);
        }
    }

    AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1() {
        super(3);
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m279invoke3p2s80s((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).m5152unboximpl());
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final MeasureResult m279invoke3p2s80s(MeasureScope layout, Measurable measurable, long j8) {
        AbstractC3159y.i(layout, "$this$layout");
        AbstractC3159y.i(measurable, "measurable");
        Placeable mo4131measureBRTryo0 = measurable.mo4131measureBRTryo0(j8);
        int mo442roundToPx0680j_4 = layout.mo442roundToPx0680j_4(Dp.m5178constructorimpl(ClipScrollableContainerKt.getMaxSupportedElevation() * 2));
        return MeasureScope.CC.q(layout, mo4131measureBRTryo0.getMeasuredWidth() - mo442roundToPx0680j_4, mo4131measureBRTryo0.getMeasuredHeight() - mo442roundToPx0680j_4, null, new AnonymousClass1(mo4131measureBRTryo0, mo442roundToPx0680j_4), 4, null);
    }
}
