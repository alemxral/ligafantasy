package androidx.compose.ui.semantics;

import L5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SemanticsNode$emitFakeNodes$fakeNode$2 extends AbstractC3160z implements Function1 {
    final /* synthetic */ String $contentDescription;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SemanticsNode$emitFakeNodes$fakeNode$2(String str) {
        super(1);
        this.$contentDescription = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f6474a;
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, this.$contentDescription);
    }
}
