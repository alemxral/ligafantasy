package androidx.compose.material;

import L5.I;
import L5.t;
import P5.d;
import X5.n;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.DragScope;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.P;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.SliderKt$animateToTarget$2", f = "Slider.kt", l = {955}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SliderKt$animateToTarget$2 extends l implements n {
    final /* synthetic */ float $current;
    final /* synthetic */ float $target;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.SliderKt$animateToTarget$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3160z implements Function1 {
        final /* synthetic */ DragScope $$this$drag;
        final /* synthetic */ P $latestValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DragScope dragScope, P p8) {
            super(1);
            this.$$this$drag = dragScope;
            this.$latestValue = p8;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Animatable<Float, AnimationVector1D>) obj);
            return I.f6474a;
        }

        public final void invoke(Animatable<Float, AnimationVector1D> animateTo) {
            AbstractC3159y.i(animateTo, "$this$animateTo");
            this.$$this$drag.dragBy(animateTo.getValue().floatValue() - this.$latestValue.f33744a);
            this.$latestValue.f33744a = animateTo.getValue().floatValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$animateToTarget$2(float f8, float f9, float f10, d dVar) {
        super(2, dVar);
        this.$current = f8;
        this.$target = f9;
        this.$velocity = f10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        SliderKt$animateToTarget$2 sliderKt$animateToTarget$2 = new SliderKt$animateToTarget$2(this.$current, this.$target, this.$velocity, dVar);
        sliderKt$animateToTarget$2.L$0 = obj;
        return sliderKt$animateToTarget$2;
    }

    @Override // X5.n
    public final Object invoke(DragScope dragScope, d dVar) {
        return ((SliderKt$animateToTarget$2) create(dragScope, dVar)).invokeSuspend(I.f6474a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TweenSpec tweenSpec;
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
            DragScope dragScope = (DragScope) this.L$0;
            P p8 = new P();
            float f8 = this.$current;
            p8.f33744a = f8;
            Animatable Animatable$default = AnimatableKt.Animatable$default(f8, 0.0f, 2, null);
            Float b8 = kotlin.coroutines.jvm.internal.b.b(this.$target);
            tweenSpec = SliderKt.SliderToTickAnimation;
            Float b9 = kotlin.coroutines.jvm.internal.b.b(this.$velocity);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dragScope, p8);
            this.label = 1;
            if (Animatable$default.animateTo(b8, tweenSpec, b9, anonymousClass1, this) == e8) {
                return e8;
            }
        }
        return I.f6474a;
    }
}
