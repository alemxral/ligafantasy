package androidx.compose.material3;

import L5.I;
import L5.t;
import P5.d;
import Q5.b;
import X5.n;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3159y;

@f(c = "androidx.compose.material3.SwipeableKt$rememberSwipeableStateFor$1", f = "Swipeable.kt", l = {512}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SwipeableKt$rememberSwipeableStateFor$1 extends l implements n {
    final /* synthetic */ SwipeableState<T> $swipeableState;
    final /* synthetic */ T $value;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableKt$rememberSwipeableStateFor$1(T t8, SwipeableState<T> swipeableState, d dVar) {
        super(2, dVar);
        this.$value = t8;
        this.$swipeableState = swipeableState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new SwipeableKt$rememberSwipeableStateFor$1(this.$value, this.$swipeableState, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, d dVar) {
        return ((SwipeableKt$rememberSwipeableStateFor$1) create(m8, dVar)).invokeSuspend(I.f6474a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            if (!AbstractC3159y.d(this.$value, this.$swipeableState.getCurrentValue())) {
                SwipeableState<T> swipeableState = this.$swipeableState;
                T t8 = this.$value;
                this.label = 1;
                if (SwipeableState.animateTo$material3_release$default(swipeableState, t8, null, this, 2, null) == e8) {
                    return e8;
                }
            }
        }
        return I.f6474a;
    }
}
