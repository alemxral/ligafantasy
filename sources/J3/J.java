package J3;

import android.R;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.motion.widget.Key;
import j4.AbstractC3079e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class J {

    /* renamed from: c, reason: collision with root package name */
    public static final a f4823c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f4824d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Context f4825a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4826b;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public J(Context context) {
        AbstractC3159y.i(context, "context");
        this.f4825a = context;
        this.f4826b = context.getResources().getInteger(R.integer.config_shortAnimTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(View view, Function0 function0) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, Key.ROTATION, 0.0f, 0.0f);
        ofFloat.setDuration(1500L);
        AbstractC3159y.f(ofFloat);
        ofFloat.addListener(new b(function0));
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(View view, int i8, Function0 function0) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", 0.0f, -((view.getLeft() + ((view.getRight() - view.getLeft()) / 2.0f)) - (i8 / 2.0f)));
        ofFloat.setDuration(this.f4826b);
        AbstractC3159y.f(ofFloat);
        ofFloat.addListener(new e(view, function0));
        ofFloat.start();
    }

    public final void d(View view, int i8, Function0 onAnimationEnd) {
        AbstractC3159y.i(view, "view");
        AbstractC3159y.i(onAnimationEnd, "onAnimationEnd");
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f4825a, AbstractC3079e.f33160a);
        loadAnimation.setAnimationListener(new c(view, this, i8, onAnimationEnd));
        view.startAnimation(loadAnimation);
    }

    public final void e(View view) {
        AbstractC3159y.i(view, "view");
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f4825a, AbstractC3079e.f33161b);
        loadAnimation.setAnimationListener(new d(view));
        view.startAnimation(loadAnimation);
    }

    /* loaded from: classes4.dex */
    public static final class b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f4827a;

        public b(Function0 function0) {
            this.f4827a = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4827a.invoke();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f4828a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f4829b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f4830c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f4831d;

        c(View view, J j8, int i8, Function0 function0) {
            this.f4828a = view;
            this.f4829b = j8;
            this.f4830c = i8;
            this.f4831d = function0;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f4828a.setVisibility(0);
            this.f4829b.f(this.f4828a, this.f4830c, this.f4831d);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f4828a.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f4832a;

        d(View view) {
            this.f4832a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f4832a.setVisibility(4);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f4832a.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements Animator.AnimatorListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f4834b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f4835c;

        public e(View view, Function0 function0) {
            this.f4834b = view;
            this.f4835c = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            J.this.c(this.f4834b, this.f4835c);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
