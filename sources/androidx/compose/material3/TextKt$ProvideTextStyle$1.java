package androidx.compose.material3;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextKt$ProvideTextStyle$1 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ n $content;
    final /* synthetic */ TextStyle $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextKt$ProvideTextStyle$1(TextStyle textStyle, n nVar, int i8) {
        super(2);
        this.$value = textStyle;
        this.$content = nVar;
        this.$$changed = i8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6474a;
    }

    public final void invoke(Composer composer, int i8) {
        TextKt.ProvideTextStyle(this.$value, this.$content, composer, this.$$changed | 1);
    }
}
