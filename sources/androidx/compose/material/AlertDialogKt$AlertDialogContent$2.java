package androidx.compose.material;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AlertDialogKt$AlertDialogContent$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ n $buttons;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ n $text;
    final /* synthetic */ n $title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogContent$2(n nVar, Modifier modifier, n nVar2, n nVar3, Shape shape, long j8, long j9, int i8, int i9) {
        super(2);
        this.$buttons = nVar;
        this.$modifier = modifier;
        this.$title = nVar2;
        this.$text = nVar3;
        this.$shape = shape;
        this.$backgroundColor = j8;
        this.$contentColor = j9;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6474a;
    }

    public final void invoke(Composer composer, int i8) {
        AlertDialogKt.m1095AlertDialogContentWMdw5o4(this.$buttons, this.$modifier, this.$title, this.$text, this.$shape, this.$backgroundColor, this.$contentColor, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
