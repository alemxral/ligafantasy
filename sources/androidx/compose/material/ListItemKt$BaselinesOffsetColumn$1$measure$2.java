package androidx.compose.material;

import L5.I;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class ListItemKt$BaselinesOffsetColumn$1$measure$2 extends AbstractC3160z implements Function1 {
    final /* synthetic */ List<Placeable> $placeables;
    final /* synthetic */ Integer[] $y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListItemKt$BaselinesOffsetColumn$1$measure$2(List<? extends Placeable> list, Integer[] numArr) {
        super(1);
        this.$placeables = list;
        this.$y = numArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f6474a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3159y.i(layout, "$this$layout");
        List<Placeable> list = this.$placeables;
        Integer[] numArr = this.$y;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            Placeable.PlacementScope.placeRelative$default(layout, list.get(i8), 0, numArr[i8].intValue(), 0.0f, 4, null);
        }
    }
}
