package androidx.compose.material3;

import L5.I;
import M5.AbstractC1246t;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SliderDefaults$Track$1$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ State<Color> $activeTickColor;
    final /* synthetic */ State<Color> $activeTrackColor;
    final /* synthetic */ State<Color> $inactiveTickColor;
    final /* synthetic */ State<Color> $inactiveTrackColor;
    final /* synthetic */ SliderPositions $sliderPositions;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderDefaults$Track$1$1(State<Color> state, SliderPositions sliderPositions, State<Color> state2, State<Color> state3, State<Color> state4) {
        super(1);
        this.$inactiveTrackColor = state;
        this.$sliderPositions = sliderPositions;
        this.$activeTrackColor = state2;
        this.$inactiveTickColor = state3;
        this.$activeTickColor = state4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return I.f6474a;
    }

    public final void invoke(DrawScope Canvas) {
        AbstractC3159y.i(Canvas, "$this$Canvas");
        boolean z8 = Canvas.getLayoutDirection() == LayoutDirection.Rtl;
        long Offset = OffsetKt.Offset(0.0f, Offset.m2736getYimpl(Canvas.mo3413getCenterF1C5BW0()));
        long Offset2 = OffsetKt.Offset(Size.m2804getWidthimpl(Canvas.mo3414getSizeNHjbRc()), Offset.m2736getYimpl(Canvas.mo3413getCenterF1C5BW0()));
        long j8 = z8 ? Offset2 : Offset;
        long j9 = z8 ? Offset : Offset2;
        float mo448toPx0680j_4 = Canvas.mo448toPx0680j_4(SliderKt.access$getTickSize$p());
        float mo448toPx0680j_42 = Canvas.mo448toPx0680j_4(SliderKt.getTrackHeight());
        long m2981unboximpl = this.$inactiveTrackColor.getValue().m2981unboximpl();
        StrokeCap.Companion companion = StrokeCap.Companion;
        long j10 = j9;
        long j11 = j8;
        c.C(Canvas, m2981unboximpl, j8, j9, mo448toPx0680j_42, companion.m3302getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        c.C(Canvas, this.$activeTrackColor.getValue().m2981unboximpl(), OffsetKt.Offset(Offset.m2735getXimpl(j11) + ((Offset.m2735getXimpl(j10) - Offset.m2735getXimpl(j11)) * 0.0f), Offset.m2736getYimpl(Canvas.mo3413getCenterF1C5BW0())), OffsetKt.Offset(Offset.m2735getXimpl(j11) + ((Offset.m2735getXimpl(j10) - Offset.m2735getXimpl(j11)) * this.$sliderPositions.getPositionFraction()), Offset.m2736getYimpl(Canvas.mo3413getCenterF1C5BW0())), mo448toPx0680j_42, companion.m3302getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        float[] tickFractions = this.$sliderPositions.getTickFractions();
        SliderPositions sliderPositions = this.$sliderPositions;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = tickFractions.length;
        for (int i8 = 0; i8 < length; i8++) {
            float f8 = tickFractions[i8];
            Boolean valueOf = Boolean.valueOf(f8 > sliderPositions.getPositionFraction() || f8 < 0.0f);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(Float.valueOf(f8));
        }
        State<Color> state = this.$inactiveTickColor;
        State<Color> state2 = this.$activeTickColor;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
            List list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Offset.m2724boximpl(OffsetKt.Offset(Offset.m2735getXimpl(OffsetKt.m2758lerpWko1d7g(j11, j10, ((Number) it.next()).floatValue())), Offset.m2736getYimpl(Canvas.mo3413getCenterF1C5BW0()))));
            }
            long j12 = j11;
            long j13 = j10;
            c.H(Canvas, arrayList, PointMode.Companion.m3254getPointsr_lszbg(), (booleanValue ? state : state2).getValue().m2981unboximpl(), mo448toPx0680j_4, StrokeCap.Companion.m3302getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
            j10 = j13;
            j11 = j12;
        }
    }
}
