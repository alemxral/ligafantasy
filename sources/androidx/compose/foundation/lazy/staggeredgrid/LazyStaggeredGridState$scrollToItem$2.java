package androidx.compose.foundation.lazy.staggeredgrid;

import L5.I;
import L5.t;
import P5.d;
import Q5.b;
import X5.n;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2", f = "LazyStaggeredGridState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LazyStaggeredGridState$scrollToItem$2 extends l implements n {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LazyStaggeredGridState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridState$scrollToItem$2(LazyStaggeredGridState lazyStaggeredGridState, int i8, int i9, d dVar) {
        super(2, dVar);
        this.this$0 = lazyStaggeredGridState;
        this.$index = i8;
        this.$scrollOffset = i9;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        LazyStaggeredGridState$scrollToItem$2 lazyStaggeredGridState$scrollToItem$2 = new LazyStaggeredGridState$scrollToItem$2(this.this$0, this.$index, this.$scrollOffset, dVar);
        lazyStaggeredGridState$scrollToItem$2.L$0 = obj;
        return lazyStaggeredGridState$scrollToItem$2;
    }

    @Override // X5.n
    public final Object invoke(ScrollScope scrollScope, d dVar) {
        return ((LazyStaggeredGridState$scrollToItem$2) create(scrollScope, dVar)).invokeSuspend(I.f6474a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b.e();
        if (this.label == 0) {
            t.b(obj);
            this.this$0.snapToItemInternal$foundation_release((ScrollScope) this.L$0, this.$index, this.$scrollOffset);
            return I.f6474a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
