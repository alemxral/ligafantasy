package androidx.compose.foundation;

import L5.I;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class CombinedClickablePointerInputNode$pointerInput$3 extends AbstractC3160z implements Function1 {
    final /* synthetic */ CombinedClickablePointerInputNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickablePointerInputNode$pointerInput$3(CombinedClickablePointerInputNode combinedClickablePointerInputNode) {
        super(1);
        this.this$0 = combinedClickablePointerInputNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m334invokek4lQ0M(((Offset) obj).m2745unboximpl());
        return I.f6474a;
    }

    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
    public final void m334invokek4lQ0M(long j8) {
        Function0 function0;
        function0 = this.this$0.onLongClick;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
