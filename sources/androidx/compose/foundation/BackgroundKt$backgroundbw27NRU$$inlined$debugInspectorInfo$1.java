package androidx.compose.foundation;

import L5.I;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: androidx.compose.foundation.BackgroundKt$background-bw27NRU$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class BackgroundKt$backgroundbw27NRU$$inlined$debugInspectorInfo$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ long $color$inlined;
    final /* synthetic */ Shape $shape$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundKt$backgroundbw27NRU$$inlined$debugInspectorInfo$1(long j8, Shape shape) {
        super(1);
        this.$color$inlined = j8;
        this.$shape$inlined = shape;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f6474a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3159y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("background");
        inspectorInfo.setValue(Color.m2961boximpl(this.$color$inlined));
        inspectorInfo.getProperties().set("color", Color.m2961boximpl(this.$color$inlined));
        inspectorInfo.getProperties().set("shape", this.$shape$inlined);
    }
}
