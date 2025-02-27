package androidx.compose.foundation.gestures;

import L5.I;
import X5.p;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class TransformGestureDetectorKt {
    /* renamed from: angle-k-4lQ0M, reason: not valid java name */
    private static final float m475anglek4lQ0M(long j8) {
        if (Offset.m2735getXimpl(j8) == 0.0f && Offset.m2736getYimpl(j8) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Offset.m2735getXimpl(j8), Offset.m2736getYimpl(j8)))) * 180.0f) / 3.1415927f;
    }

    public static final long calculateCentroid(PointerEvent pointerEvent, boolean z8) {
        long m4017getPreviousPositionF1C5BW0;
        AbstractC3159y.i(pointerEvent, "<this>");
        long m2751getZeroF1C5BW0 = Offset.Companion.m2751getZeroF1C5BW0();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            PointerInputChange pointerInputChange = changes.get(i9);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                if (z8) {
                    m4017getPreviousPositionF1C5BW0 = pointerInputChange.m4016getPositionF1C5BW0();
                } else {
                    m4017getPreviousPositionF1C5BW0 = pointerInputChange.m4017getPreviousPositionF1C5BW0();
                }
                m2751getZeroF1C5BW0 = Offset.m2740plusMKHz9U(m2751getZeroF1C5BW0, m4017getPreviousPositionF1C5BW0);
                i8++;
            }
        }
        if (i8 == 0) {
            return Offset.Companion.m2750getUnspecifiedF1C5BW0();
        }
        return Offset.m2730divtuRUvjQ(m2751getZeroF1C5BW0, i8);
    }

    public static /* synthetic */ long calculateCentroid$default(PointerEvent pointerEvent, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        return calculateCentroid(pointerEvent, z8);
    }

    public static final float calculateCentroidSize(PointerEvent pointerEvent, boolean z8) {
        long m4017getPreviousPositionF1C5BW0;
        AbstractC3159y.i(pointerEvent, "<this>");
        long calculateCentroid = calculateCentroid(pointerEvent, z8);
        float f8 = 0.0f;
        if (Offset.m2732equalsimpl0(calculateCentroid, Offset.Companion.m2750getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            PointerInputChange pointerInputChange = changes.get(i9);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                if (z8) {
                    m4017getPreviousPositionF1C5BW0 = pointerInputChange.m4016getPositionF1C5BW0();
                } else {
                    m4017getPreviousPositionF1C5BW0 = pointerInputChange.m4017getPreviousPositionF1C5BW0();
                }
                f8 += Offset.m2733getDistanceimpl(Offset.m2739minusMKHz9U(m4017getPreviousPositionF1C5BW0, calculateCentroid));
                i8++;
            }
        }
        return f8 / i8;
    }

    public static /* synthetic */ float calculateCentroidSize$default(PointerEvent pointerEvent, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        return calculateCentroidSize(pointerEvent, z8);
    }

    public static final long calculatePan(PointerEvent pointerEvent) {
        AbstractC3159y.i(pointerEvent, "<this>");
        long calculateCentroid = calculateCentroid(pointerEvent, true);
        Offset.Companion companion = Offset.Companion;
        if (Offset.m2732equalsimpl0(calculateCentroid, companion.m2750getUnspecifiedF1C5BW0())) {
            return companion.m2751getZeroF1C5BW0();
        }
        return Offset.m2739minusMKHz9U(calculateCentroid, calculateCentroid(pointerEvent, false));
    }

    public static final float calculateRotation(PointerEvent pointerEvent) {
        AbstractC3159y.i(pointerEvent, "<this>");
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = 1;
            if (i8 >= size) {
                break;
            }
            PointerInputChange pointerInputChange = changes.get(i8);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i10 = 0;
            }
            i9 += i10;
            i8++;
        }
        if (i9 < 2) {
            return 0.0f;
        }
        long calculateCentroid = calculateCentroid(pointerEvent, true);
        long calculateCentroid2 = calculateCentroid(pointerEvent, false);
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i11 = 0; i11 < size2; i11++) {
            PointerInputChange pointerInputChange2 = changes2.get(i11);
            if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                long m4016getPositionF1C5BW0 = pointerInputChange2.m4016getPositionF1C5BW0();
                long m2739minusMKHz9U = Offset.m2739minusMKHz9U(pointerInputChange2.m4017getPreviousPositionF1C5BW0(), calculateCentroid2);
                long m2739minusMKHz9U2 = Offset.m2739minusMKHz9U(m4016getPositionF1C5BW0, calculateCentroid);
                float m475anglek4lQ0M = m475anglek4lQ0M(m2739minusMKHz9U2) - m475anglek4lQ0M(m2739minusMKHz9U);
                float m2733getDistanceimpl = Offset.m2733getDistanceimpl(Offset.m2740plusMKHz9U(m2739minusMKHz9U2, m2739minusMKHz9U)) / 2.0f;
                if (m475anglek4lQ0M > 180.0f) {
                    m475anglek4lQ0M -= 360.0f;
                } else if (m475anglek4lQ0M < -180.0f) {
                    m475anglek4lQ0M += 360.0f;
                }
                f9 += m475anglek4lQ0M * m2733getDistanceimpl;
                f8 += m2733getDistanceimpl;
            }
        }
        if (f8 == 0.0f) {
            return 0.0f;
        }
        return f9 / f8;
    }

    public static final float calculateZoom(PointerEvent pointerEvent) {
        AbstractC3159y.i(pointerEvent, "<this>");
        float calculateCentroidSize = calculateCentroidSize(pointerEvent, true);
        float calculateCentroidSize2 = calculateCentroidSize(pointerEvent, false);
        if (calculateCentroidSize == 0.0f || calculateCentroidSize2 == 0.0f) {
            return 1.0f;
        }
        return calculateCentroidSize / calculateCentroidSize2;
    }

    public static final Object detectTransformGestures(PointerInputScope pointerInputScope, boolean z8, p pVar, P5.d dVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new TransformGestureDetectorKt$detectTransformGestures$2(z8, pVar, null), dVar);
        if (awaitEachGesture == Q5.b.e()) {
            return awaitEachGesture;
        }
        return I.f6474a;
    }

    public static /* synthetic */ Object detectTransformGestures$default(PointerInputScope pointerInputScope, boolean z8, p pVar, P5.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return detectTransformGestures(pointerInputScope, z8, pVar, dVar);
    }
}
