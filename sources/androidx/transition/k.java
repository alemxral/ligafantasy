package androidx.transition;

import androidx.transition.Transition;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class k {
    static {
        Transition.TransitionNotification transitionNotification = Transition.TransitionNotification.ON_START;
    }

    public static /* synthetic */ void a(Transition.TransitionListener transitionListener, Transition transition, boolean z8) {
        transitionListener.onTransitionCancel(transition);
    }

    public static /* synthetic */ void b(Transition.TransitionListener transitionListener, Transition transition, boolean z8) {
        transitionListener.onTransitionPause(transition);
    }

    public static /* synthetic */ void c(Transition.TransitionListener transitionListener, Transition transition, boolean z8) {
        transitionListener.onTransitionResume(transition);
    }
}
