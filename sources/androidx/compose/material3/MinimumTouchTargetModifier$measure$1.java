package androidx.compose.material3;

import L5.I;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class MinimumTouchTargetModifier$measure$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ int $height;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ int $width;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinimumTouchTargetModifier$measure$1(int i8, Placeable placeable, int i9) {
        super(1);
        this.$width = i8;
        this.$placeable = placeable;
        this.$height = i9;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f6474a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3159y.i(layout, "$this$layout");
        Placeable.PlacementScope.place$default(layout, this.$placeable, Z5.a.d((this.$width - this.$placeable.getWidth()) / 2.0f), Z5.a.d((this.$height - this.$placeable.getHeight()) / 2.0f), 0.0f, 4, null);
    }
}
