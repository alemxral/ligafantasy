package androidx.compose.foundation.lazy;

import L5.I;
import L5.t;
import P5.d;
import X5.n;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LazyListState$scrollToItem$2 extends l implements n {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    int label;
    final /* synthetic */ LazyListState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$scrollToItem$2(LazyListState lazyListState, int i8, int i9, d dVar) {
        super(2, dVar);
        this.this$0 = lazyListState;
        this.$index = i8;
        this.$scrollOffset = i9;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new LazyListState$scrollToItem$2(this.this$0, this.$index, this.$scrollOffset, dVar);
    }

    @Override // X5.n
    public final Object invoke(ScrollScope scrollScope, d dVar) {
        return ((LazyListState$scrollToItem$2) create(scrollScope, dVar)).invokeSuspend(I.f6474a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Q5.b.e();
        if (this.label == 0) {
            t.b(obj);
            this.this$0.snapToItemIndexInternal$foundation_release(this.$index, this.$scrollOffset);
            return I.f6474a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
