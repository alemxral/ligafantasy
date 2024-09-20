package com.uptodown.activities;

import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import X4.Q;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.C2494f;
import com.uptodown.activities.LoginActivity;
import i6.AbstractC2825i;
import i6.C2812b0;
import i6.M;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import l5.AbstractC3337y;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class LoginActivity extends AbstractActivityC2493e {

    /* renamed from: q0, reason: collision with root package name */
    public static final a f28364q0 = new a(null);

    /* renamed from: Y, reason: collision with root package name */
    private Drawable f28367Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f28368Z;

    /* renamed from: W, reason: collision with root package name */
    private final InterfaceC1227k f28365W = L5.l.b(new b());

    /* renamed from: X, reason: collision with root package name */
    private final InterfaceC1227k f28366X = new ViewModelLazy(U.b(C2494f.class), new j(this), new i(this), new k(null, this));

    /* renamed from: p0, reason: collision with root package name */
    private final d f28369p0 = new d();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T4.L invoke() {
            return T4.L.c(LoginActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Animation.AnimationListener {
        c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3159y.i(animation, "animation");
            LoginActivity.this.O3().f10175c.getRoot().setVisibility(8);
            LoginActivity.this.m4();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3159y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3159y.i(animation, "animation");
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends OnBackPressedCallback {

        /* loaded from: classes4.dex */
        public static final class a implements Animation.AnimationListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LoginActivity f28373a;

            a(LoginActivity loginActivity) {
                this.f28373a = loginActivity;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                AbstractC3159y.i(animation, "animation");
                this.f28373a.O3().f10176d.getRoot().setVisibility(8);
                this.f28373a.l4();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                AbstractC3159y.i(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                AbstractC3159y.i(animation, "animation");
            }
        }

        d() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (LoginActivity.this.O3().f10176d.getRoot().getVisibility() == 0) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setInterpolator(new AccelerateInterpolator());
                alphaAnimation.setDuration(200L);
                alphaAnimation.setAnimationListener(new a(LoginActivity.this));
                LoginActivity.this.O3().f10176d.getRoot().startAnimation(alphaAnimation);
                return;
            }
            LoginActivity.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28374a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LoginActivity f28376a;

            a(LoginActivity loginActivity) {
                this.f28376a = loginActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (abstractC3337y instanceof AbstractC3337y.a) {
                    this.f28376a.O3().f10174b.f10172b.setVisibility(0);
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    Q e8 = Q.f12424k.e(this.f28376a);
                    if (e8 != null && e8.z(this.f28376a)) {
                        AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                        if (((C2494f.a) cVar.a()).a() != null) {
                            this.f28376a.e2(((C2494f.a) cVar.a()).a());
                        }
                        this.f28376a.u3();
                        this.f28376a.setResult(1);
                    } else {
                        AbstractC3337y.c cVar2 = (AbstractC3337y.c) abstractC3337y;
                        if (((C2494f.a) cVar2.a()).b() != null) {
                            this.f28376a.e2(((C2494f.a) cVar2.a()).b());
                        } else {
                            LoginActivity loginActivity = this.f28376a;
                            String string = loginActivity.getString(R.string.login_error_message);
                            AbstractC3159y.h(string, "getString(R.string.login_error_message)");
                            loginActivity.e2(string);
                        }
                    }
                    this.f28376a.O3().f10174b.f10172b.setVisibility(8);
                    if (e8 != null && e8.z(this.f28376a) && ((C2494f.a) ((AbstractC3337y.c) abstractC3337y).a()).a() == null) {
                        this.f28376a.getOnBackPressedDispatcher().onBackPressed();
                    }
                } else {
                    boolean z8 = abstractC3337y instanceof AbstractC3337y.b;
                }
                return L5.I.f6474a;
            }
        }

        e(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28374a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K e9 = LoginActivity.this.P3().e();
                a aVar = new a(LoginActivity.this);
                this.f28374a = 1;
                if (e9.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28377a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LoginActivity f28379a;

            a(LoginActivity loginActivity) {
                this.f28379a = loginActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (abstractC3337y instanceof AbstractC3337y.a) {
                    this.f28379a.O3().f10174b.f10172b.setVisibility(0);
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                    if (((C2494f.b) cVar.a()).c() == 1) {
                        String b8 = ((C2494f.b) cVar.a()).b();
                        if (b8 != null && b8.length() != 0) {
                            this.f28379a.e2(((C2494f.b) cVar.a()).b());
                        }
                        this.f28379a.j4();
                        this.f28379a.k4();
                    } else {
                        String a8 = ((C2494f.b) cVar.a()).a();
                        if (a8 != null && a8.length() != 0) {
                            this.f28379a.e2(((C2494f.b) cVar.a()).a());
                        } else {
                            LoginActivity loginActivity = this.f28379a;
                            String string = loginActivity.getString(R.string.signup_error_message);
                            AbstractC3159y.h(string, "getString(R.string.signup_error_message)");
                            loginActivity.e2(string);
                        }
                    }
                    this.f28379a.O3().f10174b.f10172b.setVisibility(8);
                } else {
                    boolean z8 = abstractC3337y instanceof AbstractC3337y.b;
                }
                return L5.I.f6474a;
            }
        }

        f(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28377a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K f8 = LoginActivity.this.P3().f();
                a aVar = new a(LoginActivity.this);
                this.f28377a = 1;
                if (f8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements Animation.AnimationListener {
        g() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3159y.i(animation, "animation");
            LoginActivity.this.O3().f10175c.getRoot().setVisibility(0);
            LoginActivity.this.O3().f10178f.setText(R.string.title_login);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3159y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3159y.i(animation, "animation");
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements Animation.AnimationListener {
        h() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3159y.i(animation, "animation");
            LoginActivity.this.O3().f10176d.getRoot().setVisibility(0);
            LoginActivity.this.O3().f10178f.setText(R.string.title_sign_up);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3159y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3159y.i(animation, "animation");
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28382a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f28382a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f28382a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28383a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f28383a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28383a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28384a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28385b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28384a = function0;
            this.f28385b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28384a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28385b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T4.L O3() {
        return (T4.L) this.f28365W.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2494f P3() {
        return (C2494f) this.f28366X.getValue();
    }

    private final void Q3() {
        Object systemService = getSystemService("input_method");
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        inputMethodManager.hideSoftInputFromWindow(O3().f10176d.f10731c.getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(O3().f10176d.f10733e.getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(O3().f10176d.f10732d.getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(O3().f10175c.f10181c.getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(O3().f10175c.f10180b.getWindowToken(), 0);
    }

    private final void R3() {
        TextView textView = (TextView) findViewById(R.id.tv_title_download_benefit);
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        ((TextView) findViewById(R.id.tv_desc_download_benefit)).setTypeface(aVar.u());
        ((TextView) findViewById(R.id.tv_title_discover_benefit)).setTypeface(aVar.t());
        ((TextView) findViewById(R.id.tv_desc_discover_benefit)).setTypeface(aVar.u());
        ((TextView) findViewById(R.id.tv_title_share_benefit)).setTypeface(aVar.t());
        ((TextView) findViewById(R.id.tv_desc_share_benefit)).setTypeface(aVar.u());
    }

    private final void S3() {
        setContentView(O3().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        this.f28367Y = drawable;
        if (drawable != null) {
            AbstractC3159y.f(drawable);
            T2(drawable, ContextCompat.getColor(this, R.color.toolbar_icon));
            O3().f10177e.setNavigationIcon(this.f28367Y);
            O3().f10177e.setNavigationContentDescription(getString(R.string.back));
        }
        O3().f10177e.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.U
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.T3(LoginActivity.this, view);
            }
        });
        TextView textView = O3().f10178f;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        O3().f10175c.f10188j.setTypeface(aVar.t());
        O3().f10175c.f10185g.setTypeface(aVar.u());
        O3().f10176d.f10738j.setTypeface(aVar.u());
        O3().f10174b.f10172b.setOnClickListener(new View.OnClickListener() { // from class: A4.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.U3(view);
            }
        });
        O3().f10175c.f10188j.setOnClickListener(new View.OnClickListener() { // from class: A4.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.Y3(LoginActivity.this, view);
            }
        });
        O3().f10175c.f10186h.setTypeface(aVar.t());
        O3().f10175c.f10186h.setOnClickListener(new View.OnClickListener() { // from class: A4.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.Z3(LoginActivity.this, view);
            }
        });
        O3().f10175c.f10181c.setTypeface(aVar.u());
        O3().f10175c.f10181c.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: A4.e0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                LoginActivity.a4(LoginActivity.this, view, z8);
            }
        });
        O3().f10175c.f10180b.setTypeface(aVar.u());
        O3().f10175c.f10180b.setImeOptions(6);
        O3().f10175c.f10180b.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: A4.f0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i8, KeyEvent keyEvent) {
                boolean b42;
                b42 = LoginActivity.b4(LoginActivity.this, textView2, i8, keyEvent);
                return b42;
            }
        });
        O3().f10175c.f10180b.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: A4.g0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                LoginActivity.c4(LoginActivity.this, view, z8);
            }
        });
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 23) {
            Drawable[] compoundDrawables = O3().f10175c.f10180b.getCompoundDrawables();
            AbstractC3159y.h(compoundDrawables, "binding.loginForm.etPassLogin.compoundDrawables");
            Drawable drawable2 = compoundDrawables[0];
            if (drawable2 != null) {
                AbstractC3159y.f(drawable2);
                drawable2.setColorFilter(ContextCompat.getColor(this, R.color.white), PorterDuff.Mode.SRC_ATOP);
            }
        }
        TextView textView2 = (TextView) findViewById(R.id.tv_pass_forget_login);
        if (textView2 != null) {
            textView2.setTypeface(aVar.t());
            textView2.setOnClickListener(new View.OnClickListener() { // from class: A4.V
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.d4(LoginActivity.this, view);
                }
            });
        }
        O3().f10176d.f10740l.setTypeface(aVar.t());
        O3().f10176d.f10740l.setOnClickListener(new View.OnClickListener() { // from class: A4.W
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.e4(LoginActivity.this, view);
            }
        });
        O3().f10176d.f10733e.setTypeface(aVar.u());
        O3().f10176d.f10733e.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: A4.X
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                LoginActivity.f4(LoginActivity.this, view, z8);
            }
        });
        O3().f10176d.f10737i.setTypeface(aVar.t());
        O3().f10176d.f10737i.setOnClickListener(new View.OnClickListener() { // from class: A4.Y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.V3(LoginActivity.this, view);
            }
        });
        O3().f10176d.f10731c.setTypeface(aVar.u());
        O3().f10176d.f10731c.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: A4.Z
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                LoginActivity.W3(LoginActivity.this, view, z8);
            }
        });
        O3().f10176d.f10732d.setTypeface(aVar.u());
        O3().f10176d.f10732d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: A4.a0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                LoginActivity.X3(LoginActivity.this, view, z8);
            }
        });
        if (i8 < 23) {
            Drawable[] compoundDrawables2 = O3().f10176d.f10732d.getCompoundDrawables();
            AbstractC3159y.h(compoundDrawables2, "binding.signUpForm.etPassSignUp.compoundDrawables");
            Drawable drawable3 = compoundDrawables2[0];
            if (drawable3 != null) {
                AbstractC3159y.f(drawable3);
                drawable3.setColorFilter(ContextCompat.getColor(this, R.color.white), PorterDuff.Mode.SRC_ATOP);
            }
        }
        O3().f10176d.f10730b.setTypeface(aVar.u());
        O3().f10176d.f10730b.setMovementMethod(LinkMovementMethod.getInstance());
        T4.L binding = O3();
        AbstractC3159y.h(binding, "binding");
        i3(binding);
        R3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3(LoginActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V3(LoginActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f28369p0.handleOnBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W3(LoginActivity this$0, View view, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        if (z8) {
            this$0.O3().f10176d.f10731c.setHint("");
        } else {
            this$0.O3().f10176d.f10731c.setHint(this$0.getString(R.string.hint_email_registro));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X3(LoginActivity this$0, View view, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        if (z8) {
            this$0.O3().f10176d.f10732d.setHint("");
        } else {
            this$0.O3().f10176d.f10732d.setHint(this$0.getString(R.string.hint_pass_login_registro));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y3(LoginActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.O3().f10176d.getRoot().getVisibility() != 0) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setInterpolator(new AccelerateInterpolator());
            alphaAnimation.setDuration(200L);
            alphaAnimation.setAnimationListener(new c());
            this$0.O3().f10175c.getRoot().startAnimation(alphaAnimation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z3(LoginActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.i4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a4(LoginActivity this$0, View view, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        if (z8) {
            this$0.O3().f10175c.f10181c.setHint("");
        } else {
            this$0.O3().f10175c.f10181c.setHint(this$0.getString(R.string.hint_nombre_usuario_login_registro));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b4(LoginActivity this$0, TextView textView, int i8, KeyEvent keyEvent) {
        AbstractC3159y.i(this$0, "this$0");
        if (i8 == 6) {
            this$0.i4();
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c4(LoginActivity this$0, View view, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        if (z8) {
            this$0.O3().f10175c.f10180b.setHint("");
        } else {
            this$0.O3().f10175c.f10180b.setHint(this$0.getString(R.string.hint_pass_login_registro));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d4(LoginActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.startActivity(new Intent(this$0.getApplicationContext(), (Class<?>) PasswordRecoveryActivity.class), UptodownApp.f27990B.a(this$0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e4(LoginActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.n4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f4(LoginActivity this$0, View view, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        if (z8) {
            this$0.O3().f10176d.f10733e.setHint("");
        } else {
            this$0.O3().f10176d.f10733e.setHint(this$0.getString(R.string.hint_nombre_usuario_login_registro));
        }
    }

    private final void g4(String str, String str2) {
        P3().c(this, str, str2);
    }

    private final void h4(String str, String str2, String str3) {
        P3().d(this, str, str2, str3);
    }

    private final void i4() {
        Q3();
        if (P3().g(O3().f10175c.f10181c.getText().toString(), O3().f10175c.f10180b.getText().toString())) {
            g4(O3().f10175c.f10181c.getText().toString(), O3().f10175c.f10180b.getText().toString());
            return;
        }
        Toast makeText = Toast.makeText(getApplicationContext(), R.string.faltan_datos_login, 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j4() {
        T4.L O32 = O3();
        O32.f10176d.f10733e.setText("");
        O32.f10175c.f10181c.setText("");
        O32.f10176d.f10731c.setText("");
        O32.f10176d.f10731c.setEnabled(true);
        O32.f10176d.f10732d.setText("");
        O32.f10175c.f10180b.setText("");
        O32.f10176d.f10730b.setChecked(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k4() {
        T4.L O32 = O3();
        O32.f10178f.setText(getString(R.string.title_login));
        O32.f10175c.getRoot().setVisibility(0);
        O32.f10176d.getRoot().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l4() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new g());
        TextView d32 = d3();
        if (d32 != null) {
            d32.setText(getString(R.string.title_login));
        }
        O3().f10175c.getRoot().setVisibility(0);
        O3().f10175c.getRoot().startAnimation(alphaAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m4() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new h());
        TextView d32 = d3();
        if (d32 != null) {
            d32.setText(getString(R.string.sign_up_with_google));
        }
        O3().f10176d.getRoot().setVisibility(0);
        O3().f10176d.getRoot().startAnimation(alphaAnimation);
    }

    private final void n4() {
        Q3();
        boolean i8 = P3().i(O3().f10176d.f10731c.getText().toString());
        if (P3().h(O3().f10176d.f10733e.getText().toString(), O3().f10176d.f10731c.getText().toString(), O3().f10176d.f10732d.getText().toString()) && i8 && O3().f10176d.f10730b.isChecked()) {
            h4(O3().f10176d.f10733e.getText().toString(), O3().f10176d.f10731c.getText().toString(), O3().f10176d.f10732d.getText().toString());
            return;
        }
        if (!O3().f10176d.f10730b.isChecked()) {
            Toast makeText = Toast.makeText(getApplicationContext(), R.string.falta_condiciones_uso, 1);
            makeText.setGravity(17, 0, 0);
            makeText.show();
        } else if (O3().f10176d.f10732d.length() < 6) {
            Toast makeText2 = Toast.makeText(getApplicationContext(), R.string.error_password_too_short, 1);
            makeText2.setGravity(17, 0, 0);
            makeText2.show();
        } else if (!i8) {
            Toast makeText3 = Toast.makeText(getApplicationContext(), R.string.error_email_not_valid, 1);
            makeText3.setGravity(17, 0, 0);
            makeText3.show();
        } else {
            Toast makeText4 = Toast.makeText(getApplicationContext(), getString(R.string.faltan_datos_registro), 1);
            makeText4.setGravity(17, 0, 0);
            makeText4.show();
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a, android.app.Activity
    public void finish() {
        if (this.f28368Z) {
            setResult(2);
        }
        super.finish();
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    protected void h3() {
        O3().f10174b.f10172b.setVisibility(8);
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    public void o3(String id, String str) {
        AbstractC3159y.i(id, "id");
        O3().f10175c.f10181c.setText(id);
        O3().f10175c.f10180b.setText(str);
        i4();
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e, com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getOnBackPressedDispatcher().addCallback(this, this.f28369p0);
        S3();
        AbstractC2825i.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new e(null), 2, null);
        AbstractC2825i.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new f(null), 2, null);
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        Drawable drawable = this.f28367Y;
        if (drawable != null) {
            AbstractC3159y.f(drawable);
            DrawableCompat.setTintList(drawable, null);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            getWindow().getDecorView().setSystemUiVisibility(0);
        }
        super.onDestroy();
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        String str;
        super.onResume();
        Q3();
        Q e8 = Q.f12424k.e(this);
        if (e8 != null) {
            str = e8.getId();
        } else {
            str = null;
        }
        if (str != null && e8.z(this)) {
            finish();
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    protected void q3(Q q8) {
        String str;
        if (q8 != null) {
            q8.L(this);
        }
        try {
            if (q8 != null) {
                str = q8.n();
            } else {
                str = null;
            }
            AccountManager.get(getBaseContext()).addAccountExplicitly(new Account(str, getString(R.string.account)), null, null);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    protected void s3(Q q8, String str) {
        String str2;
        h3();
        EditText editText = O3().f10176d.f10733e;
        String str3 = null;
        if (q8 != null) {
            str2 = q8.n();
        } else {
            str2 = null;
        }
        editText.setText(str2);
        EditText editText2 = O3().f10176d.f10731c;
        if (q8 != null) {
            str3 = q8.k();
        }
        editText2.setText(str3);
        O3().f10176d.f10731c.setEnabled(false);
        if (str != null) {
            Toast.makeText(this, str, 1).show();
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    protected void t3() {
        O3().f10174b.f10172b.setVisibility(0);
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    protected void u3() {
        Toast.makeText(this, R.string.login_successful, 0).show();
    }
}
