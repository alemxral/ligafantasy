package androidx.compose.foundation.layout;

import L5.I;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class BoxKt$EmptyBoxMeasurePolicy$1$measure$1 extends AbstractC3160z implements Function1 {
    public static final BoxKt$EmptyBoxMeasurePolicy$1$measure$1 INSTANCE = new BoxKt$EmptyBoxMeasurePolicy$1$measure$1();

    BoxKt$EmptyBoxMeasurePolicy$1$measure$1() {
        super(1);
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3159y.i(layout, "$this$layout");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f6474a;
    }
}
