package androidx.compose.foundation;

import L5.I;
import L5.t;
import P5.d;
import X5.n;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.foundation.FocusableNode$onFocusEvent$1", f = "Focusable.kt", l = {237}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FocusableNode$onFocusEvent$1 extends l implements n {
    int label;
    final /* synthetic */ FocusableNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableNode$onFocusEvent$1(FocusableNode focusableNode, d dVar) {
        super(2, dVar);
        this.this$0 = focusableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new FocusableNode$onFocusEvent$1(this.this$0, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, d dVar) {
        return ((FocusableNode$onFocusEvent$1) create(m8, dVar)).invokeSuspend(I.f6474a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        BringIntoViewRequester bringIntoViewRequester;
        Object e8 = Q5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            bringIntoViewRequester = this.this$0.bringIntoViewRequester;
            this.label = 1;
            if (androidx.compose.foundation.relocation.a.a(bringIntoViewRequester, null, this, 1, null) == e8) {
                return e8;
            }
        }
        return I.f6474a;
    }
}
