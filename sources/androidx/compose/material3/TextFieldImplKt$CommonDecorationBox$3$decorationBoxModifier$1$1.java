package androidx.compose.material3;

import L5.I;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ String $defaultErrorMessage;
    final /* synthetic */ boolean $isError;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1(boolean z8, String str) {
        super(1);
        this.$isError = z8;
        this.$defaultErrorMessage = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f6474a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3159y.i(semantics, "$this$semantics");
        if (this.$isError) {
            SemanticsPropertiesKt.error(semantics, this.$defaultErrorMessage);
        }
    }
}
