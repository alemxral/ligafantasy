package androidx.compose.foundation;

import L5.I;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
public final class ScrollKt$scroll$$inlined$debugInspectorInfo$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ FlingBehavior $flingBehavior$inlined;
    final /* synthetic */ boolean $isScrollable$inlined;
    final /* synthetic */ boolean $isVertical$inlined;
    final /* synthetic */ boolean $reverseScrolling$inlined;
    final /* synthetic */ ScrollState $state$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollKt$scroll$$inlined$debugInspectorInfo$1(ScrollState scrollState, boolean z8, FlingBehavior flingBehavior, boolean z9, boolean z10) {
        super(1);
        this.$state$inlined = scrollState;
        this.$reverseScrolling$inlined = z8;
        this.$flingBehavior$inlined = flingBehavior;
        this.$isScrollable$inlined = z9;
        this.$isVertical$inlined = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f6474a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3159y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("scroll");
        inspectorInfo.getProperties().set("state", this.$state$inlined);
        inspectorInfo.getProperties().set("reverseScrolling", Boolean.valueOf(this.$reverseScrolling$inlined));
        inspectorInfo.getProperties().set("flingBehavior", this.$flingBehavior$inlined);
        inspectorInfo.getProperties().set("isScrollable", Boolean.valueOf(this.$isScrollable$inlined));
        inspectorInfo.getProperties().set("isVertical", Boolean.valueOf(this.$isVertical$inlined));
    }
}
