package androidx.compose.animation.core;

import L5.I;
import L5.t;
import X5.n;
import androidx.compose.runtime.MonotonicFrameClockKt;
import i6.M;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.Transition$animateTo$1$1", f = "Transition.kt", l = {435}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Transition$animateTo$1$1 extends l implements n {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Transition<S> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.animation.core.Transition$animateTo$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3160z implements Function1 {
        final /* synthetic */ float $durationScale;
        final /* synthetic */ Transition<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Transition<S> transition, float f8) {
            super(1);
            this.this$0 = transition;
            this.$durationScale = f8;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return I.f6474a;
        }

        public final void invoke(long j8) {
            if (this.this$0.isSeeking()) {
                return;
            }
            this.this$0.onFrame$animation_core_release(j8, this.$durationScale);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$1$1(Transition<S> transition, P5.d dVar) {
        super(2, dVar);
        this.this$0 = transition;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        Transition$animateTo$1$1 transition$animateTo$1$1 = new Transition$animateTo$1$1(this.this$0, dVar);
        transition$animateTo$1$1.L$0 = obj;
        return transition$animateTo$1$1;
    }

    @Override // X5.n
    public final Object invoke(M m8, P5.d dVar) {
        return ((Transition$animateTo$1$1) create(m8, dVar)).invokeSuspend(I.f6474a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        M m8;
        AnonymousClass1 anonymousClass1;
        Object e8 = Q5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                m8 = (M) this.L$0;
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            m8 = (M) this.L$0;
        }
        do {
            anonymousClass1 = new AnonymousClass1(this.this$0, SuspendAnimationKt.getDurationScale(m8.getCoroutineContext()));
            this.L$0 = m8;
            this.label = 1;
        } while (MonotonicFrameClockKt.withFrameNanos(anonymousClass1, this) != e8);
        return e8;
    }
}
