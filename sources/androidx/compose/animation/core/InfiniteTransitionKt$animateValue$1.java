package androidx.compose.animation.core;

import L5.I;
import androidx.compose.animation.core.InfiniteTransition;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class InfiniteTransitionKt$animateValue$1 extends AbstractC3160z implements Function0 {
    final /* synthetic */ InfiniteRepeatableSpec<T> $animationSpec;
    final /* synthetic */ T $initialValue;
    final /* synthetic */ T $targetValue;
    final /* synthetic */ InfiniteTransition.TransitionAnimationState<T, V> $transitionAnimation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteTransitionKt$animateValue$1(T t8, InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState, T t9, InfiniteRepeatableSpec<T> infiniteRepeatableSpec) {
        super(0);
        this.$initialValue = t8;
        this.$transitionAnimation = transitionAnimationState;
        this.$targetValue = t9;
        this.$animationSpec = infiniteRepeatableSpec;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m215invoke();
        return I.f6474a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m215invoke() {
        if (AbstractC3159y.d(this.$initialValue, this.$transitionAnimation.getInitialValue$animation_core_release()) && AbstractC3159y.d(this.$targetValue, this.$transitionAnimation.getTargetValue$animation_core_release())) {
            return;
        }
        this.$transitionAnimation.updateValues$animation_core_release(this.$initialValue, this.$targetValue, this.$animationSpec);
    }
}
