package androidx.compose.foundation.text.selection;

import L5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldSelectionManager$showSelectionToolbar$selectAll$1 extends AbstractC3160z implements Function0 {
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$showSelectionToolbar$selectAll$1(TextFieldSelectionManager textFieldSelectionManager) {
        super(0);
        this.this$0 = textFieldSelectionManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1088invoke();
        return I.f6474a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1088invoke() {
        this.this$0.selectAll$foundation_release();
    }
}
