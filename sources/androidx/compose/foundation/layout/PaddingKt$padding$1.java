package androidx.compose.foundation.layout;

import L5.I;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class PaddingKt$padding$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ float $bottom;
    final /* synthetic */ float $end;
    final /* synthetic */ float $start;
    final /* synthetic */ float $top;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingKt$padding$1(float f8, float f9, float f10, float f11) {
        super(1);
        this.$start = f8;
        this.$top = f9;
        this.$end = f10;
        this.$bottom = f11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f6474a;
    }

    public final void invoke(InspectorInfo $receiver) {
        AbstractC3159y.i($receiver, "$this$$receiver");
        $receiver.setName("padding");
        $receiver.getProperties().set("start", Dp.m5176boximpl(this.$start));
        $receiver.getProperties().set("top", Dp.m5176boximpl(this.$top));
        $receiver.getProperties().set(TtmlNode.END, Dp.m5176boximpl(this.$end));
        $receiver.getProperties().set("bottom", Dp.m5176boximpl(this.$bottom));
    }
}
