package androidx.compose.material3.internal;

import L5.I;
import M5.AbstractC1246t;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
public final class ExposedDropdownMenuPopupKt$SimpleStack$1$measure$3 extends AbstractC3160z implements Function1 {
    final /* synthetic */ List<Placeable> $placeables;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExposedDropdownMenuPopupKt$SimpleStack$1$measure$3(List<? extends Placeable> list) {
        super(1);
        this.$placeables = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f6474a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3159y.i(layout, "$this$layout");
        int o8 = AbstractC1246t.o(this.$placeables);
        if (o8 < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            Placeable.PlacementScope.placeRelative$default(layout, this.$placeables.get(i8), 0, 0, 0.0f, 4, null);
            if (i8 == o8) {
                return;
            } else {
                i8++;
            }
        }
    }
}
