package androidx.compose.material3;

import L5.I;
import X5.n;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SwitchKt$SwitchImpl$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ SwitchColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ float $maxBound;
    final /* synthetic */ float $minBound;
    final /* synthetic */ BoxScope $this_SwitchImpl;
    final /* synthetic */ n $thumbContent;
    final /* synthetic */ Shape $thumbShape;
    final /* synthetic */ State<Float> $thumbValue;
    final /* synthetic */ float $uncheckedThumbDiameter;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchImpl$2(BoxScope boxScope, boolean z8, boolean z9, SwitchColors switchColors, State<Float> state, n nVar, InteractionSource interactionSource, Shape shape, float f8, float f9, float f10, int i8, int i9) {
        super(2);
        this.$this_SwitchImpl = boxScope;
        this.$checked = z8;
        this.$enabled = z9;
        this.$colors = switchColors;
        this.$thumbValue = state;
        this.$thumbContent = nVar;
        this.$interactionSource = interactionSource;
        this.$thumbShape = shape;
        this.$uncheckedThumbDiameter = f8;
        this.$minBound = f9;
        this.$maxBound = f10;
        this.$$changed = i8;
        this.$$changed1 = i9;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6474a;
    }

    public final void invoke(Composer composer, int i8) {
        SwitchKt.m1817SwitchImpl0DmnUew(this.$this_SwitchImpl, this.$checked, this.$enabled, this.$colors, this.$thumbValue, this.$thumbContent, this.$interactionSource, this.$thumbShape, this.$uncheckedThumbDiameter, this.$minBound, this.$maxBound, composer, this.$$changed | 1, this.$$changed1);
    }
}
