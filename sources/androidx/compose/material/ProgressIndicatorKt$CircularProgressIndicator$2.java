package androidx.compose.material;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$CircularProgressIndicator$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $color;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $progress;
    final /* synthetic */ int $strokeCap;
    final /* synthetic */ float $strokeWidth;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$2(float f8, Modifier modifier, long j8, float f9, long j9, int i8, int i9, int i10) {
        super(2);
        this.$progress = f8;
        this.$modifier = modifier;
        this.$color = j8;
        this.$strokeWidth = f9;
        this.$backgroundColor = j9;
        this.$strokeCap = i8;
        this.$$changed = i9;
        this.$$default = i10;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6474a;
    }

    public final void invoke(Composer composer, int i8) {
        ProgressIndicatorKt.m1300CircularProgressIndicatorDUhRLBM(this.$progress, this.$modifier, this.$color, this.$strokeWidth, this.$backgroundColor, this.$strokeCap, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
