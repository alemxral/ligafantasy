package androidx.compose.material;

import L5.I;
import L5.t;
import P5.d;
import X5.n;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.material.AnchoredDraggableDefaults$ReconcileAnimationOnAnchorChangedCallback$1$onAnchorsChanged$1", f = "AnchoredDraggable.kt", l = {686}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AnchoredDraggableDefaults$ReconcileAnimationOnAnchorChangedCallback$1$onAnchorsChanged$1 extends l implements n {
    final /* synthetic */ T $previousTarget;
    final /* synthetic */ AnchoredDraggableState<T> $state;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableDefaults$ReconcileAnimationOnAnchorChangedCallback$1$onAnchorsChanged$1(AnchoredDraggableState<T> anchoredDraggableState, T t8, d dVar) {
        super(2, dVar);
        this.$state = anchoredDraggableState;
        this.$previousTarget = t8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new AnchoredDraggableDefaults$ReconcileAnimationOnAnchorChangedCallback$1$onAnchorsChanged$1(this.$state, this.$previousTarget, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, d dVar) {
        return ((AnchoredDraggableDefaults$ReconcileAnimationOnAnchorChangedCallback$1$onAnchorsChanged$1) create(m8, dVar)).invokeSuspend(I.f6474a);
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
            AnchoredDraggableState<T> anchoredDraggableState = this.$state;
            T t8 = this.$previousTarget;
            float lastVelocity = anchoredDraggableState.getLastVelocity();
            this.label = 1;
            if (AnchoredDraggableKt.animateTo(anchoredDraggableState, t8, lastVelocity, this) == e8) {
                return e8;
            }
        }
        return I.f6474a;
    }
}
