package androidx.compose.material;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OneLine$ListItem$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ n $icon;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ n $text;
    final /* synthetic */ OneLine $tmp0_rcvr;
    final /* synthetic */ n $trailing;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneLine$ListItem$2(OneLine oneLine, Modifier modifier, n nVar, n nVar2, n nVar3, int i8, int i9) {
        super(2);
        this.$tmp0_rcvr = oneLine;
        this.$modifier = modifier;
        this.$icon = nVar;
        this.$text = nVar2;
        this.$trailing = nVar3;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6474a;
    }

    public final void invoke(Composer composer, int i8) {
        this.$tmp0_rcvr.ListItem(this.$modifier, this.$icon, this.$text, this.$trailing, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
