package androidx.compose.foundation.gestures;

import L5.I;
import L5.t;
import X5.n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", f = "Scrollable.kt", l = {534}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ScrollDraggableState$drag$2 extends l implements n {
    final /* synthetic */ n $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScrollDraggableState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollDraggableState$drag$2(ScrollDraggableState scrollDraggableState, n nVar, P5.d dVar) {
        super(2, dVar);
        this.this$0 = scrollDraggableState;
        this.$block = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        ScrollDraggableState$drag$2 scrollDraggableState$drag$2 = new ScrollDraggableState$drag$2(this.this$0, this.$block, dVar);
        scrollDraggableState$drag$2.L$0 = obj;
        return scrollDraggableState$drag$2;
    }

    @Override // X5.n
    public final Object invoke(ScrollScope scrollScope, P5.d dVar) {
        return ((ScrollDraggableState$drag$2) create(scrollScope, dVar)).invokeSuspend(I.f6474a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
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
            this.this$0.setLatestScrollScope((ScrollScope) this.L$0);
            n nVar = this.$block;
            ScrollDraggableState scrollDraggableState = this.this$0;
            this.label = 1;
            if (nVar.invoke(scrollDraggableState, this) == e8) {
                return e8;
            }
        }
        return I.f6474a;
    }
}
