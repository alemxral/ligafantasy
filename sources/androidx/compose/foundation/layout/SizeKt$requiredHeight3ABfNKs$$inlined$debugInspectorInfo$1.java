package androidx.compose.foundation.layout;

import L5.I;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: androidx.compose.foundation.layout.SizeKt$requiredHeight-3ABfNKs$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class SizeKt$requiredHeight3ABfNKs$$inlined$debugInspectorInfo$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ float $height$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeKt$requiredHeight3ABfNKs$$inlined$debugInspectorInfo$1(float f8) {
        super(1);
        this.$height$inlined = f8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f6474a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3159y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("requiredHeight");
        inspectorInfo.setValue(Dp.m5176boximpl(this.$height$inlined));
    }
}
