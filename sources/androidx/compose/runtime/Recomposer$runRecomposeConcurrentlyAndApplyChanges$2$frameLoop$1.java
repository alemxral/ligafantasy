package androidx.compose.runtime;

import L5.I;
import L5.t;
import X5.n;
import i6.M;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1", f = "Recomposer.kt", l = {838}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1 extends kotlin.coroutines.jvm.internal.l implements n {
    final /* synthetic */ ProduceFrameSignal $frameSignal;
    final /* synthetic */ MonotonicFrameClock $parentFrameClock;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1(Recomposer recomposer, MonotonicFrameClock monotonicFrameClock, ProduceFrameSignal produceFrameSignal, P5.d dVar) {
        super(2, dVar);
        this.this$0 = recomposer;
        this.$parentFrameClock = monotonicFrameClock;
        this.$frameSignal = produceFrameSignal;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1(this.this$0, this.$parentFrameClock, this.$frameSignal, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, P5.d dVar) {
        return ((Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1) create(m8, dVar)).invokeSuspend(I.f6474a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object runFrameLoop;
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
            Recomposer recomposer = this.this$0;
            MonotonicFrameClock monotonicFrameClock = this.$parentFrameClock;
            ProduceFrameSignal produceFrameSignal = this.$frameSignal;
            this.label = 1;
            runFrameLoop = recomposer.runFrameLoop(monotonicFrameClock, produceFrameSignal, this);
            if (runFrameLoop == e8) {
                return e8;
            }
        }
        return I.f6474a;
    }
}
