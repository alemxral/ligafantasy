package com.uptodown.activities;

import E4.j;
import M5.AbstractC1246t;
import T4.k0;
import T4.s0;
import T4.t0;
import U4.C1422b;
import U4.F1;
import U4.L0;
import U4.S0;
import U4.T0;
import U4.V0;
import W4.InterfaceC1490m;
import X4.C1495e;
import X4.C1498h;
import X4.C1500j;
import X4.C1501k;
import X4.C1503m;
import X4.C1505o;
import X4.O;
import X4.V;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.core.activities.InstallerActivity;
import com.uptodown.views.ScrollableTextView;
import com.uptodown.workers.DownloadApkWorker;
import com.uptodown.workers.GetUserDataWorker;
import i2.InterfaceC2774b;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import i6.X;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import l5.C3307A;
import l5.C3312F;
import l5.C3319g;
import l5.C3323k;
import l5.C3326n;
import l5.C3329q;
import l5.C3330r;
import l5.C3335w;
import p5.C3608f;

/* loaded from: classes4.dex */
public final class MainActivity extends AbstractActivityC2493e {

    /* renamed from: Y0, reason: collision with root package name */
    public static final C2479b f28386Y0 = new C2479b(null);

    /* renamed from: A0, reason: collision with root package name */
    private TabLayout f28387A0;

    /* renamed from: B0, reason: collision with root package name */
    private T0 f28388B0;

    /* renamed from: C0, reason: collision with root package name */
    private V0 f28389C0;

    /* renamed from: D0, reason: collision with root package name */
    private S0 f28390D0;

    /* renamed from: E0, reason: collision with root package name */
    private F1 f28391E0;

    /* renamed from: J0, reason: collision with root package name */
    private FrameLayout f28396J0;

    /* renamed from: K0, reason: collision with root package name */
    private k0 f28397K0;

    /* renamed from: L0, reason: collision with root package name */
    private FrameLayout f28398L0;

    /* renamed from: M0, reason: collision with root package name */
    private FrameLayout f28399M0;

    /* renamed from: N0, reason: collision with root package name */
    private int f28400N0;

    /* renamed from: P0, reason: collision with root package name */
    private RelativeLayout f28402P0;

    /* renamed from: S0, reason: collision with root package name */
    private final ActivityResultLauncher f28405S0;

    /* renamed from: T0, reason: collision with root package name */
    private final ActivityResultLauncher f28406T0;

    /* renamed from: U0, reason: collision with root package name */
    private final ActivityResultLauncher f28407U0;

    /* renamed from: V0, reason: collision with root package name */
    private final ActivityResultLauncher f28408V0;

    /* renamed from: W, reason: collision with root package name */
    private RelativeLayout f28409W;

    /* renamed from: W0, reason: collision with root package name */
    private final q f28410W0;

    /* renamed from: X, reason: collision with root package name */
    private int f28411X;

    /* renamed from: X0, reason: collision with root package name */
    private final ActivityResultLauncher f28412X0;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f28414Z;

    /* renamed from: p0, reason: collision with root package name */
    private RelativeLayout f28415p0;

    /* renamed from: q0, reason: collision with root package name */
    private Toolbar f28416q0;

    /* renamed from: r0, reason: collision with root package name */
    private AppBarLayout f28417r0;

    /* renamed from: s0, reason: collision with root package name */
    private SwitchCompat f28418s0;

    /* renamed from: t0, reason: collision with root package name */
    private SwitchCompat f28419t0;

    /* renamed from: u0, reason: collision with root package name */
    private TabLayout f28420u0;

    /* renamed from: v0, reason: collision with root package name */
    private C1498h f28421v0;

    /* renamed from: w0, reason: collision with root package name */
    private ViewPager2 f28422w0;

    /* renamed from: x0, reason: collision with root package name */
    private RelativeLayout f28423x0;

    /* renamed from: y0, reason: collision with root package name */
    private RelativeLayout f28424y0;

    /* renamed from: z0, reason: collision with root package name */
    private ProgressBar f28425z0;

    /* renamed from: Y, reason: collision with root package name */
    private ArrayList f28413Y = new ArrayList();

    /* renamed from: F0, reason: collision with root package name */
    private ArrayList f28392F0 = new ArrayList();

    /* renamed from: G0, reason: collision with root package name */
    private ArrayList f28393G0 = new ArrayList();

    /* renamed from: H0, reason: collision with root package name */
    private long f28394H0 = -1;

    /* renamed from: I0, reason: collision with root package name */
    private final int f28395I0 = 4;

    /* renamed from: O0, reason: collision with root package name */
    private final C3608f f28401O0 = new C3608f();

    /* renamed from: Q0, reason: collision with root package name */
    private final m f28403Q0 = new m();

    /* renamed from: R0, reason: collision with root package name */
    private InterfaceC1490m f28404R0 = new C2488k();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class A extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final A f28426a = new A();

        A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(g6.h it) {
            AbstractC3159y.i(it, "it");
            return (CharSequence) it.a().get(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class B extends ClickableSpan {
        B() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3159y.i(widget, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3159y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(MainActivity.this, R.color.main_blue));
            ds.setTypeface(E4.j.f2272g.t());
            ds.setUnderlineText(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class C extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C f28428a = new C();

        C() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(g6.h it) {
            AbstractC3159y.i(it, "it");
            return (CharSequence) it.a().get(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class D extends ClickableSpan {
        D() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3159y.i(widget, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3159y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(MainActivity.this, R.color.turbo_text_featured));
            ds.setTypeface(E4.j.f2272g.t());
            ds.setUnderlineText(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class E extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final E f28430a = new E();

        E() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(g6.h it) {
            AbstractC3159y.i(it, "it");
            return (CharSequence) it.a().get(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class F extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28431a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28433c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        F(String str, P5.d dVar) {
            super(2, dVar);
            this.f28433c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new F(this.f28433c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((F) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28431a == 0) {
                L5.t.b(obj);
                Fragment F52 = MainActivity.this.F5();
                if (F52 instanceof L0) {
                    ((L0) F52).Q6(this.f28433c);
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class G extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28434a;

        G(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new G(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((G) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28434a == 0) {
                L5.t.b(obj);
                Fragment F52 = MainActivity.this.F5();
                if (F52 instanceof L0) {
                    MainActivity.this.runOnUiThread(new L0.RunnableC1396d());
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class H extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28436a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q f28438c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Q f28439d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f28440a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Q f28441b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q f28442c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ MainActivity f28443d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Q q8, Q q9, MainActivity mainActivity, P5.d dVar) {
                super(2, dVar);
                this.f28441b = q8;
                this.f28442c = q9;
                this.f28443d = mainActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f28441b, this.f28442c, this.f28443d, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f28440a == 0) {
                    L5.t.b(obj);
                    if (this.f28441b.f33745a + this.f28442c.f33745a > 0) {
                        TabLayout tabLayout = this.f28443d.f28387A0;
                        AbstractC3159y.f(tabLayout);
                        TabLayout.Tab tabAt = tabLayout.getTabAt(3);
                        AbstractC3159y.f(tabAt);
                        return tabAt.setIcon(R.drawable.vector_user_profile_notification);
                    }
                    TabLayout tabLayout2 = this.f28443d.f28387A0;
                    AbstractC3159y.f(tabLayout2);
                    TabLayout.Tab tabAt2 = tabLayout2.getTabAt(3);
                    AbstractC3159y.f(tabAt2);
                    return tabAt2.setIcon(R.drawable.vector_user_profile);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f28444a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MainActivity f28445b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(MainActivity mainActivity, P5.d dVar) {
                super(2, dVar);
                this.f28445b = mainActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f28445b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f28444a == 0) {
                    L5.t.b(obj);
                    TabLayout tabLayout = this.f28445b.f28387A0;
                    AbstractC3159y.f(tabLayout);
                    TabLayout.Tab tabAt = tabLayout.getTabAt(3);
                    AbstractC3159y.f(tabAt);
                    return tabAt.setIcon(R.drawable.vector_user_profile);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        H(Q q8, Q q9, P5.d dVar) {
            super(2, dVar);
            this.f28438c = q8;
            this.f28439d = q9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new H(this.f28438c, this.f28439d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((H) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int Z7;
            Object e8 = Q5.b.e();
            int i8 = this.f28436a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        L5.t.b(obj);
                        return (TabLayout.Tab) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
                return (TabLayout.Tab) obj;
            }
            L5.t.b(obj);
            if (MainActivity.this.getApplicationContext() != null) {
                Q q8 = this.f28438c;
                O.b bVar = O.f12409l;
                Context applicationContext = MainActivity.this.getApplicationContext();
                AbstractC3159y.h(applicationContext, "applicationContext");
                q8.f33745a = bVar.a(applicationContext);
                C3326n.a aVar = C3326n.f34490t;
                Context applicationContext2 = MainActivity.this.getApplicationContext();
                AbstractC3159y.h(applicationContext2, "applicationContext");
                C3326n a8 = aVar.a(applicationContext2);
                a8.a();
                ArrayList c02 = a8.c0();
                a8.g();
                Iterator it = c02.iterator();
                while (it.hasNext()) {
                    C1505o c1505o = (C1505o) it.next();
                    if (c1505o.k() == 0 && (1 > (Z7 = c1505o.Z()) || Z7 >= 100 || c1505o.I() != 0)) {
                        this.f28439d.f33745a++;
                    }
                }
                J0 c8 = C2812b0.c();
                a aVar2 = new a(this.f28439d, this.f28438c, MainActivity.this, null);
                this.f28436a = 1;
                obj = AbstractC2825i.g(c8, aVar2, this);
                if (obj == e8) {
                    return e8;
                }
                return (TabLayout.Tab) obj;
            }
            J0 c9 = C2812b0.c();
            b bVar2 = new b(MainActivity.this, null);
            this.f28436a = 2;
            obj = AbstractC2825i.g(c9, bVar2, this);
            if (obj == e8) {
                return e8;
            }
            return (TabLayout.Tab) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class I extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28446a;

        I(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new I(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((I) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28446a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        L5.t.b(obj);
                        return L5.I.f6474a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                this.f28446a = 1;
                if (X.b(1000L, this) == e8) {
                    return e8;
                }
            }
            MainActivity mainActivity = MainActivity.this;
            this.f28446a = 2;
            if (mainActivity.H7(this) == e8) {
                return e8;
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class J extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28448a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K f28450c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        J(K k8, P5.d dVar) {
            super(2, dVar);
            this.f28450c = k8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new J(this.f28450c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((J) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28448a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                GetUserDataWorker.a aVar = GetUserDataWorker.f30019b;
                MainActivity mainActivity = MainActivity.this;
                K k8 = this.f28450c;
                this.f28448a = 1;
                if (aVar.b(mainActivity, k8, this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class K implements W4.I {
        K() {
        }

        @Override // W4.I
        public void a() {
            X4.Q e8 = X4.Q.f12424k.e(MainActivity.this);
            if (e8 != null && MainActivity.this.f28391E0 != null) {
                F1 f12 = MainActivity.this.f28391E0;
                AbstractC3159y.f(f12);
                f12.R0(e8);
                MainActivity.this.x7();
            }
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$a, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class RunnableC2478a implements Runnable {
        public RunnableC2478a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout = (LinearLayout) MainActivity.this.findViewById(R.id.ll_auto_update);
            if (linearLayout != null && linearLayout.getVisibility() == 0) {
                MainActivity.this.Q6();
            }
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$b, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2479b {
        private C2479b() {
        }

        public /* synthetic */ C2479b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$c, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class RunnableC2480c implements Runnable {
        public RunnableC2480c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainActivity.this.U6();
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$d, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class RunnableC2481d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f28454a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28455b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MainActivity f28456c;

        public RunnableC2481d(MainActivity mainActivity, int i8, String packagename) {
            AbstractC3159y.i(packagename, "packagename");
            this.f28456c = mainActivity;
            this.f28454a = i8;
            this.f28455b = packagename;
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment F52 = this.f28456c.F5();
            if (F52 instanceof L0) {
                this.f28456c.runOnUiThread(new L0.RunnableC1395c((L0) F52, this.f28455b, this.f28454a));
            }
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$e, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class RunnableC2482e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f28457a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28458b;

        public RunnableC2482e(int i8, String str) {
            this.f28457a = i8;
            this.f28458b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            O o8;
            if (this.f28458b != null) {
                C3326n.a aVar = C3326n.f34490t;
                Context baseContext = MainActivity.this.getBaseContext();
                AbstractC3159y.h(baseContext, "baseContext");
                C3326n a8 = aVar.a(baseContext);
                a8.a();
                o8 = a8.u0(this.f28458b);
                a8.g();
            } else {
                o8 = null;
            }
            MainActivity.this.F7(this.f28457a, o8);
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$f, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class RunnableC2483f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f28460a;

        /* renamed from: b, reason: collision with root package name */
        private final C1505o f28461b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MainActivity f28462c;

        public RunnableC2483f(MainActivity mainActivity, int i8, C1505o download) {
            AbstractC3159y.i(download, "download");
            this.f28462c = mainActivity;
            this.f28460a = i8;
            this.f28461b = download;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
        
            if (r0.i() == r5.f28461b.f()) goto L19;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r5 = this;
                int r0 = r5.f28460a
                r1 = 202(0xca, float:2.83E-43)
                if (r0 == r1) goto La
                r1 = 203(0xcb, float:2.84E-43)
                if (r0 != r1) goto Lf
            La:
                com.uptodown.activities.MainActivity r0 = r5.f28462c
                r0.I7()
            Lf:
                com.uptodown.activities.MainActivity r0 = r5.f28462c
                int r1 = r5.f28460a
                X4.o r2 = r5.f28461b
                r0.E7(r1, r2)
                com.uptodown.activities.MainActivity r0 = r5.f28462c
                X4.o r1 = r5.f28461b
                java.lang.String r1 = r1.Y()
                r0.K7(r1)
                com.uptodown.activities.MainActivity r0 = r5.f28462c
                X4.o r1 = r5.f28461b
                java.lang.String r1 = r1.Y()
                r0.G7(r1)
                com.uptodown.activities.MainActivity r0 = r5.f28462c
                X4.o r1 = r5.f28461b
                java.lang.String r1 = r1.Y()
                r0.J7(r1)
                com.uptodown.activities.MainActivity r0 = r5.f28462c
                X4.o r1 = r5.f28461b
                java.lang.String r1 = r1.Y()
                r0.B7(r1)
                com.uptodown.activities.MainActivity r0 = r5.f28462c
                p5.f r0 = com.uptodown.activities.MainActivity.w4(r0)
                X4.o r1 = r5.f28461b
                com.uptodown.activities.MainActivity r2 = r5.f28462c
                android.widget.RelativeLayout r2 = com.uptodown.activities.MainActivity.x4(r2)
                int r3 = r5.f28460a
                com.uptodown.activities.MainActivity r4 = r5.f28462c
                r0.W(r1, r2, r3, r4)
                com.uptodown.activities.MainActivity r0 = r5.f28462c
                androidx.fragment.app.Fragment r0 = r0.F5()
                boolean r0 = r0 instanceof U4.L0
                if (r0 != 0) goto L71
                l5.A r0 = l5.C3307A.f34459a
                java.util.ArrayList r0 = r0.d()
                java.lang.Object r0 = M5.AbstractC1246t.y0(r0)
                boolean r0 = r0 instanceof com.uptodown.activities.MainActivity
                if (r0 != 0) goto L9d
            L71:
                com.uptodown.activities.MainActivity r0 = r5.f28462c
                androidx.fragment.app.Fragment r0 = r0.F5()
                boolean r0 = r0 instanceof U4.L0
                if (r0 == 0) goto L9f
                com.uptodown.activities.MainActivity r0 = r5.f28462c
                androidx.fragment.app.Fragment r0 = r0.F5()
                java.lang.String r1 = "null cannot be cast to non-null type com.uptodown.fragments.AppDetailsFragment"
                kotlin.jvm.internal.AbstractC3159y.g(r0, r1)
                U4.L0 r0 = (U4.L0) r0
                X4.h r0 = r0.I3()
                if (r0 == 0) goto L9d
                long r0 = r0.i()
                X4.o r2 = r5.f28461b
                long r2 = r2.f()
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L9d
                goto L9f
            L9d:
                r0 = 1
                goto La0
            L9f:
                r0 = 0
            La0:
                com.uptodown.activities.MainActivity r1 = r5.f28462c
                int r2 = r5.f28460a
                X4.o r3 = r5.f28461b
                r1.X2(r2, r3, r0)
                if (r0 == 0) goto Lbe
                X4.o r0 = r5.f28461b
                int r0 = r0.Z()
                r1 = 100
                if (r0 != r1) goto Lbe
                l5.w r0 = l5.C3335w.f34532a
                com.uptodown.activities.MainActivity r1 = r5.f28462c
                X4.o r2 = r5.f28461b
                r0.j(r1, r2)
            Lbe:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.MainActivity.RunnableC2483f.run():void");
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$g, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class RunnableC2484g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f28463a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28464b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MainActivity f28465c;

        public RunnableC2484g(MainActivity mainActivity, int i8, String packagename) {
            AbstractC3159y.i(packagename, "packagename");
            this.f28465c = mainActivity;
            this.f28463a = i8;
            this.f28464b = packagename;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            C3326n a8 = C3326n.f34490t.a(this.f28465c);
            a8.a();
            C1505o a02 = a8.a0(this.f28464b);
            a8.g();
            this.f28465c.E7(this.f28463a, a02);
            this.f28465c.G7(this.f28464b);
            this.f28465c.J7(this.f28464b);
            this.f28465c.K7(this.f28464b);
            this.f28465c.B7(this.f28464b);
            if (this.f28465c.F5() instanceof L0) {
                if (this.f28465c.F5() instanceof L0) {
                    Fragment F52 = this.f28465c.F5();
                    AbstractC3159y.g(F52, "null cannot be cast to non-null type com.uptodown.fragments.AppDetailsFragment");
                    C1498h I32 = ((L0) F52).I3();
                    if (I32 != null) {
                        str = I32.y0();
                    } else {
                        str = null;
                    }
                    if (AbstractC3159y.d(str, this.f28464b)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            C3335w.f34532a.k(this.f28465c, this.f28464b);
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$h, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class AnimationAnimationListenerC2485h implements Animation.AnimationListener {
        AnimationAnimationListenerC2485h() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3159y.i(animation, "animation");
            int C52 = MainActivity.this.C5();
            if (C52 >= 0 && C52 < MainActivity.this.f28413Y.size()) {
                RelativeLayout relativeLayout = MainActivity.this.f28415p0;
                if (relativeLayout != null) {
                    relativeLayout.removeAllViews();
                }
                RelativeLayout c8 = ((V) MainActivity.this.f28413Y.get(C52)).c();
                RelativeLayout relativeLayout2 = MainActivity.this.f28415p0;
                if (relativeLayout2 != null) {
                    relativeLayout2.addView(c8);
                }
                c8.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_back_in));
            } else {
                ((V) MainActivity.this.f28413Y.get(MainActivity.this.f28411X)).c().setVisibility(8);
                MainActivity.this.finish();
            }
            MainActivity.this.f28414Z = false;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3159y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3159y.i(animation, "animation");
            MainActivity.this.f28414Z = true;
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$i, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class AnimationAnimationListenerC2486i implements Animation.AnimationListener {
        AnimationAnimationListenerC2486i() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3159y.i(animation, "animation");
            int G52 = MainActivity.this.G5();
            if (G52 < 0 || G52 >= MainActivity.this.f28413Y.size()) {
                MainActivity.this.O6();
                return;
            }
            RelativeLayout relativeLayout = MainActivity.this.f28415p0;
            AbstractC3159y.f(relativeLayout);
            relativeLayout.removeAllViews();
            RelativeLayout c8 = ((V) MainActivity.this.f28413Y.get(G52)).c();
            RelativeLayout relativeLayout2 = MainActivity.this.f28415p0;
            AbstractC3159y.f(relativeLayout2);
            relativeLayout2.addView(c8);
            Bundle bundle = new Bundle();
            bundle.putString("type", ((V) MainActivity.this.f28413Y.get(G52)).b());
            C3330r u22 = MainActivity.this.u2();
            if (u22 != null) {
                u22.b("wizard", bundle);
            }
            if (((V) MainActivity.this.f28413Y.get(MainActivity.this.f28411X)).a() == 2 && ((V) MainActivity.this.f28413Y.get(0)).a() == 1) {
                ((V) MainActivity.this.f28413Y.get(0)).c().removeAllViews();
                MainActivity.this.f28413Y.remove(0);
                MainActivity.this.f28411X = 0;
            }
            MainActivity.this.L7();
            c8.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_next_in));
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

    /* renamed from: com.uptodown.activities.MainActivity$j, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class AnimationAnimationListenerC2487j implements Animation.AnimationListener {
        AnimationAnimationListenerC2487j() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3159y.i(animation, "animation");
            FrameLayout frameLayout = MainActivity.this.f28396J0;
            AbstractC3159y.f(frameLayout);
            frameLayout.removeAllViews();
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

    /* renamed from: com.uptodown.activities.MainActivity$k, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2488k implements InterfaceC1490m {
        C2488k() {
        }

        @Override // W4.InterfaceC1490m
        public void a() {
            FrameLayout frameLayout = MainActivity.this.f28399M0;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
        }

        @Override // W4.InterfaceC1490m
        public void b() {
            MainActivity.this.a6();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28470a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f28472a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MainActivity f28473b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f28474c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MainActivity mainActivity, T t8, P5.d dVar) {
                super(2, dVar);
                this.f28473b = mainActivity;
                this.f28474c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f28473b, this.f28474c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f28472a == 0) {
                    L5.t.b(obj);
                    TabLayout tabLayout = this.f28473b.f28420u0;
                    AbstractC3159y.f(tabLayout);
                    TabLayout.Tab newTab = tabLayout.newTab();
                    AbstractC3159y.h(newTab, "parentCategoriesTabsLayout!!.newTab()");
                    View inflate = LayoutInflater.from(this.f28473b).inflate(R.layout.home_header_parent_category, (ViewGroup) this.f28473b.f28416q0, false);
                    AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView = (TextView) inflate;
                    textView.setTypeface(E4.j.f2272g.t());
                    textView.setText(this.f28473b.getString(R.string.for_you_category));
                    newTab.setCustomView(textView);
                    newTab.setTag(kotlin.coroutines.jvm.internal.b.c(0));
                    TabLayout tabLayout2 = this.f28473b.f28420u0;
                    AbstractC3159y.f(tabLayout2);
                    tabLayout2.addTab(newTab);
                    Iterator it = ((ArrayList) this.f28474c.f33747a).iterator();
                    while (it.hasNext()) {
                        C1501k c1501k = (C1501k) it.next();
                        TabLayout tabLayout3 = this.f28473b.f28420u0;
                        AbstractC3159y.f(tabLayout3);
                        TabLayout.Tab newTab2 = tabLayout3.newTab();
                        AbstractC3159y.h(newTab2, "parentCategoriesTabsLayout!!.newTab()");
                        View inflate2 = LayoutInflater.from(this.f28473b).inflate(R.layout.home_header_parent_category, (ViewGroup) this.f28473b.f28416q0, false);
                        AbstractC3159y.g(inflate2, "null cannot be cast to non-null type android.widget.TextView");
                        TextView textView2 = (TextView) inflate2;
                        textView2.setTypeface(E4.j.f2272g.u());
                        textView2.setText(c1501k.f());
                        newTab2.setCustomView(textView2);
                        newTab2.setTag(c1501k);
                        TabLayout tabLayout4 = this.f28473b.f28420u0;
                        AbstractC3159y.f(tabLayout4);
                        tabLayout4.addTab(newTab2);
                    }
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements TabLayout.OnTabSelectedListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MainActivity f28475a;

            b(MainActivity mainActivity) {
                this.f28475a = mainActivity;
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(TabLayout.Tab tab) {
                AbstractC3159y.i(tab, "tab");
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(TabLayout.Tab tab) {
                AbstractC3159y.i(tab, "tab");
                TabLayout tabLayout = this.f28475a.f28420u0;
                AbstractC3159y.f(tabLayout);
                View childAt = tabLayout.getChildAt(0);
                AbstractC3159y.g(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                View findViewById = ((ViewGroup) childAt).getChildAt(tab.getPosition()).findViewById(R.id.tv_home_header_parent_category);
                AbstractC3159y.h(findViewById, "parentCategoriesTabsLayo…e_header_parent_category)");
                ((TextView) findViewById).setTypeface(E4.j.f2272g.t());
                this.f28475a.r7();
                S0 s02 = this.f28475a.f28390D0;
                if (s02 != null) {
                    s02.B();
                }
                if (AbstractC3159y.d(tab.getTag(), 0)) {
                    this.f28475a.S7();
                    return;
                }
                Object tag = tab.getTag();
                AbstractC3159y.g(tag, "null cannot be cast to non-null type com.uptodown.models.Category");
                C1501k c1501k = (C1501k) tag;
                if (c1501k.c() != 523) {
                    this.f28475a.f28400N0 = tab.getPosition();
                }
                this.f28475a.U7(c1501k);
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(TabLayout.Tab tab) {
                AbstractC3159y.i(tab, "tab");
                TabLayout tabLayout = this.f28475a.f28420u0;
                AbstractC3159y.f(tabLayout);
                View childAt = tabLayout.getChildAt(0);
                AbstractC3159y.g(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                View findViewById = ((ViewGroup) childAt).getChildAt(tab.getPosition()).findViewById(R.id.tv_home_header_parent_category);
                AbstractC3159y.h(findViewById, "parentCategoriesTabsLayo…e_header_parent_category)");
                ((TextView) findViewById).setTypeface(E4.j.f2272g.u());
            }
        }

        l(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new l(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28470a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                T t8 = new T();
                t8.f33747a = new ArrayList();
                C3326n a8 = C3326n.f34490t.a(MainActivity.this);
                a8.a();
                X4.J s02 = a8.s0("categories");
                if (s02 != null && s02.a()) {
                    t8.f33747a = C1501k.b.b(C1501k.f12621g, s02.b(), 0, 2, null);
                } else {
                    X4.I p8 = new C3312F(MainActivity.this).p();
                    if (p8.f()) {
                        C1501k.b bVar = C1501k.f12621g;
                        String d8 = p8.d();
                        AbstractC3159y.f(d8);
                        t8.f33747a = C1501k.b.b(bVar, d8, 0, 2, null);
                        String d9 = p8.d();
                        AbstractC3159y.f(d9);
                        X4.J j8 = new X4.J("categories", d9);
                        a8.L("categories");
                        a8.O0(j8);
                    }
                }
                a8.g();
                if (!((Collection) t8.f33747a).isEmpty()) {
                    J0 c8 = C2812b0.c();
                    a aVar = new a(MainActivity.this, t8, null);
                    this.f28470a = 1;
                    if (AbstractC2825i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            TabLayout tabLayout = MainActivity.this.f28420u0;
            AbstractC3159y.f(tabLayout);
            tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new b(MainActivity.this));
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class m implements W4.r {
        m() {
        }

        @Override // W4.r
        public void c(int i8) {
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            if (MainActivity.this.T5()) {
                MainActivity.this.P7(appInfo, 0);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class n implements Animation.AnimationListener {
        n() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3159y.i(animation, "animation");
            FrameLayout frameLayout = MainActivity.this.f28398L0;
            AbstractC3159y.f(frameLayout);
            frameLayout.removeAllViews();
            MainActivity.this.f28398L0 = null;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28478a;

        /* loaded from: classes4.dex */
        public static final class a implements W4.p {
            a() {
            }

            @Override // W4.p
            public void a() {
            }

            @Override // W4.p
            public void b() {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f28480a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MainActivity f28481b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(MainActivity mainActivity, P5.d dVar) {
                super(2, dVar);
                this.f28481b = mainActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f28481b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f28480a == 0) {
                    L5.t.b(obj);
                    this.f28481b.a6();
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        o(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new o(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((o) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C1500j d8;
            Object e8 = Q5.b.e();
            int i8 = this.f28478a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    d8 = C1500j.f12617n.d(MainActivity.this);
                    if (d8 == null && !d8.d()) {
                        J0 c8 = C2812b0.c();
                        b bVar = new b(MainActivity.this, null);
                        this.f28478a = 2;
                        if (AbstractC2825i.g(c8, bVar, this) == e8) {
                            return e8;
                        }
                    } else {
                        MainActivity mainActivity = MainActivity.this;
                        new S4.b(mainActivity, mainActivity.f28404R0, LifecycleOwnerKt.getLifecycleScope(MainActivity.this));
                        new S4.e(MainActivity.this, new a(), LifecycleOwnerKt.getLifecycleScope(MainActivity.this));
                    }
                }
            } else {
                L5.t.b(obj);
                X4.Q e9 = X4.Q.f12424k.e(MainActivity.this);
                if (e9 == null || !e9.G()) {
                    this.f28478a = 1;
                    if (X.b(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS, this) == e8) {
                        return e8;
                    }
                    d8 = C1500j.f12617n.d(MainActivity.this);
                    if (d8 == null) {
                    }
                    MainActivity mainActivity2 = MainActivity.this;
                    new S4.b(mainActivity2, mainActivity2.f28404R0, LifecycleOwnerKt.getLifecycleScope(MainActivity.this));
                    new S4.e(MainActivity.this, new a(), LifecycleOwnerKt.getLifecycleScope(MainActivity.this));
                }
            }
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class p implements InterfaceC2774b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1500j f28482a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MainActivity f28483b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f28484c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ImageView f28485d;

        p(C1500j c1500j, MainActivity mainActivity, View view, ImageView imageView) {
            this.f28482a = c1500j;
            this.f28483b = mainActivity;
            this.f28484c = view;
            this.f28485d = imageView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(ImageView ivBanner, C1500j c1500j, MainActivity this$0) {
            AbstractC3159y.i(ivBanner, "$ivBanner");
            AbstractC3159y.i(this$0, "this$0");
            if (new C3323k().p(ivBanner)) {
                c1500j.j(this$0);
            }
        }

        @Override // i2.InterfaceC2774b
        public void a(Exception exc) {
            this.f28482a.g(this.f28483b);
            FrameLayout frameLayout = this.f28483b.f28399M0;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
        }

        @Override // i2.InterfaceC2774b
        public void b() {
            this.f28482a.h(this.f28483b);
            FrameLayout frameLayout = this.f28483b.f28399M0;
            if (frameLayout != null) {
                frameLayout.addView(this.f28484c);
            }
            Handler handler = new Handler(Looper.getMainLooper());
            final ImageView imageView = this.f28485d;
            final C1500j c1500j = this.f28482a;
            final MainActivity mainActivity = this.f28483b;
            handler.postDelayed(new Runnable() { // from class: A4.j1
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.p.d(imageView, c1500j, mainActivity);
                }
            }, 500L);
        }
    }

    /* loaded from: classes4.dex */
    public static final class q extends OnBackPressedCallback {
        q() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            RelativeLayout relativeLayout = MainActivity.this.f28402P0;
            if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
                C3608f c3608f = MainActivity.this.f28401O0;
                MainActivity mainActivity = MainActivity.this;
                RelativeLayout relativeLayout2 = mainActivity.f28402P0;
                AbstractC3159y.f(relativeLayout2);
                c3608f.f(mainActivity, relativeLayout2);
                return;
            }
            boolean popBackStackImmediate = MainActivity.this.getSupportFragmentManager().popBackStackImmediate();
            int backStackEntryCount = MainActivity.this.getSupportFragmentManager().getBackStackEntryCount();
            if (popBackStackImmediate && backStackEntryCount >= 0) {
                if (MainActivity.this.F5() instanceof L0) {
                    RelativeLayout H52 = MainActivity.this.H5();
                    if (H52 != null) {
                        H52.setVisibility(0);
                        return;
                    }
                    return;
                }
                RelativeLayout H53 = MainActivity.this.H5();
                if (H53 != null) {
                    H53.setVisibility(8);
                }
                if (MainActivity.this.F5() == null || (MainActivity.this.F5() instanceof S0) || (MainActivity.this.F5() instanceof T0)) {
                    TabLayout tabLayout = MainActivity.this.f28387A0;
                    if (tabLayout == null || tabLayout.getSelectedTabPosition() != 2) {
                        MainActivity.this.r7();
                        return;
                    }
                    return;
                }
                return;
            }
            RelativeLayout H54 = MainActivity.this.H5();
            if (H54 != null) {
                H54.setVisibility(8);
            }
            int size = MainActivity.this.f28392F0.size();
            if (size > 0) {
                Fragment fragment = (Fragment) AbstractC1246t.y0(MainActivity.this.f28392F0);
                MainActivity.this.f28392F0.remove(size - 1);
                if (fragment instanceof T0) {
                    T0 t02 = (T0) fragment;
                    if (t02.r() != null) {
                        C1501k r8 = t02.r();
                        AbstractC3159y.f(r8);
                        if (r8.c() == 523) {
                            MainActivity.this.s5(1);
                            return;
                        }
                    }
                    MainActivity.this.S7();
                    return;
                }
                if (!MainActivity.this.T5()) {
                    MainActivity.this.finish();
                    return;
                }
                if (MainActivity.this.f28415p0 != null) {
                    RelativeLayout relativeLayout3 = MainActivity.this.f28415p0;
                    AbstractC3159y.f(relativeLayout3);
                    if (relativeLayout3.getVisibility() == 0) {
                        MainActivity.this.p5();
                        return;
                    }
                }
                ViewPager2 viewPager2 = MainActivity.this.f28422w0;
                if (viewPager2 != null && viewPager2.getCurrentItem() == 0) {
                    MainActivity.this.finish();
                    return;
                } else {
                    MainActivity.this.s5(0);
                    return;
                }
            }
            if (!MainActivity.this.T5()) {
                MainActivity.this.finish();
                return;
            }
            if (MainActivity.this.f28415p0 != null) {
                RelativeLayout relativeLayout4 = MainActivity.this.f28415p0;
                AbstractC3159y.f(relativeLayout4);
                if (relativeLayout4.getVisibility() == 0) {
                    MainActivity.this.p5();
                    return;
                }
            }
            ViewPager2 viewPager22 = MainActivity.this.f28422w0;
            if (viewPager22 != null && viewPager22.getCurrentItem() == 0) {
                MainActivity.this.finish();
            } else {
                MainActivity.this.s5(0);
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class r extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28487a;

        r(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new r(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((r) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28487a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                MainActivity mainActivity = MainActivity.this;
                this.f28487a = 1;
                if (mainActivity.D5(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class s implements W4.r {
        s() {
        }

        @Override // W4.r
        public void c(int i8) {
            MainActivity.this.f28394H0 = -1L;
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            MainActivity.this.P7(appInfo, 1);
            MainActivity.this.f28394H0 = -1L;
        }
    }

    /* loaded from: classes4.dex */
    static final class t extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28490a;

        t(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new t(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((t) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28490a == 0) {
                L5.t.b(obj);
                Fragment F52 = MainActivity.this.F5();
                if (F52 instanceof L0) {
                    ((L0) F52).O5();
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class u implements Animation.AnimationListener {
        u() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3159y.i(animation, "animation");
            MainActivity.this.K5();
            MainActivity.this.N6();
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
    public static final class v implements TabLayout.OnTabSelectedListener {
        v() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            V0 v02;
            AbstractC3159y.i(tab, "tab");
            if (tab.getPosition() == 0) {
                if (MainActivity.this.f28390D0 != null) {
                    MainActivity.this.S7();
                    MainActivity.this.r7();
                    S0 s02 = MainActivity.this.f28390D0;
                    AbstractC3159y.f(s02);
                    s02.B();
                    return;
                }
                return;
            }
            if (tab.getPosition() == 1) {
                if (MainActivity.this.f28388B0 != null) {
                    MainActivity.this.r7();
                    T0 t02 = MainActivity.this.f28388B0;
                    AbstractC3159y.f(t02);
                    t02.s();
                    return;
                }
                return;
            }
            if (tab.getPosition() == 2 && (v02 = MainActivity.this.f28389C0) != null) {
                v02.F();
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            AbstractC3159y.i(tab, "tab");
            ViewPager2 viewPager2 = MainActivity.this.f28422w0;
            AbstractC3159y.f(viewPager2);
            viewPager2.setCurrentItem(tab.getPosition(), false);
            MainActivity.this.M6();
            TabLayout tabLayout = MainActivity.this.f28420u0;
            if (tabLayout != null) {
                tabLayout.setVisibility(0);
            }
            MainActivity.this.V2();
            MainActivity.this.r7();
            MainActivity.this.J5();
            int position = tab.getPosition();
            if (position == 0) {
                TabLayout tabLayout2 = MainActivity.this.f28420u0;
                AbstractC3159y.f(tabLayout2);
                if (tabLayout2.getSelectedTabPosition() != 0) {
                    TabLayout tabLayout3 = MainActivity.this.f28420u0;
                    AbstractC3159y.f(tabLayout3);
                    TabLayout tabLayout4 = MainActivity.this.f28420u0;
                    AbstractC3159y.f(tabLayout4);
                    tabLayout3.selectTab(tabLayout4.getTabAt(MainActivity.this.f28400N0));
                } else {
                    MainActivity.this.S7();
                }
                MainActivity.this.i7();
                return;
            }
            if (position == 1) {
                TabLayout tabLayout5 = MainActivity.this.f28420u0;
                AbstractC3159y.f(tabLayout5);
                int tabCount = tabLayout5.getTabCount();
                int i8 = 0;
                for (int i9 = 0; i9 < tabCount; i9++) {
                    TabLayout tabLayout6 = MainActivity.this.f28420u0;
                    AbstractC3159y.f(tabLayout6);
                    TabLayout.Tab tabAt = tabLayout6.getTabAt(i9);
                    AbstractC3159y.f(tabAt);
                    if (tabAt.getTag() instanceof C1501k) {
                        Object tag = tabAt.getTag();
                        AbstractC3159y.g(tag, "null cannot be cast to non-null type com.uptodown.models.Category");
                        if (((C1501k) tag).c() == 523) {
                            i8 = i9;
                        }
                    }
                }
                TabLayout tabLayout7 = MainActivity.this.f28420u0;
                AbstractC3159y.f(tabLayout7);
                TabLayout tabLayout8 = MainActivity.this.f28420u0;
                AbstractC3159y.f(tabLayout8);
                tabLayout7.selectTab(tabLayout8.getTabAt(i8));
                return;
            }
            if (position == 2) {
                MainActivity.this.L5();
                TabLayout tabLayout9 = MainActivity.this.f28420u0;
                if (tabLayout9 != null) {
                    tabLayout9.setVisibility(8);
                    return;
                }
                return;
            }
            MainActivity.this.w2();
            MainActivity.this.L5();
            TabLayout tabLayout10 = MainActivity.this.f28420u0;
            if (tabLayout10 != null) {
                tabLayout10.setVisibility(8);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            AbstractC3159y.i(tab, "tab");
        }
    }

    /* loaded from: classes4.dex */
    public static final class w extends FragmentStateAdapter {
        w(FragmentManager fragmentManager, Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public Fragment createFragment(int i8) {
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        MainActivity.this.f28391E0 = new F1();
                        F1 f12 = MainActivity.this.f28391E0;
                        AbstractC3159y.f(f12);
                        return f12;
                    }
                    C1501k c1501k = new C1501k(0, null, null, 7, null);
                    c1501k.Q(-1);
                    c1501k.T(MainActivity.this.getString(R.string.top_downloads_title));
                    MainActivity.this.f28389C0 = V0.f11510i.a(c1501k);
                    V0 v02 = MainActivity.this.f28389C0;
                    AbstractC3159y.f(v02);
                    return v02;
                }
                C1501k c1501k2 = new C1501k(0, null, null, 7, null);
                c1501k2.Q(523);
                c1501k2.T(MainActivity.this.getString(R.string.top_games_title));
                MainActivity.this.f28388B0 = T0.f11482n.a(c1501k2);
                T0 t02 = MainActivity.this.f28388B0;
                AbstractC3159y.f(t02);
                return t02;
            }
            MainActivity.this.f28390D0 = new S0();
            S0 s02 = MainActivity.this.f28390D0;
            AbstractC3159y.f(s02);
            return s02;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return MainActivity.this.f28395I0;
        }
    }

    /* loaded from: classes4.dex */
    public static final class x implements W4.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f28495a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MainActivity f28496b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ O f28497c;

        x(TextView textView, MainActivity mainActivity, O o8) {
            this.f28495a = textView;
            this.f28496b = mainActivity;
            this.f28497c = o8;
        }

        @Override // W4.r
        public void c(int i8) {
            this.f28495a.setText(this.f28496b.getResources().getString(R.string.msg_no_version_details, this.f28496b.getResources().getString(R.string.app_name) + " v." + this.f28497c.z()));
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            String t02 = appInfo.t0();
            if (t02 != null && t02.length() != 0) {
                this.f28495a.setText(appInfo.t0());
                return;
            }
            this.f28495a.setText(this.f28496b.getResources().getString(R.string.msg_no_version_details, this.f28496b.getResources().getString(R.string.app_name) + " v." + this.f28497c.z()));
        }
    }

    /* loaded from: classes4.dex */
    public static final class y implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f28498a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Animation f28499b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImageView f28500c;

        y(ImageView imageView, Animation animation, ImageView imageView2) {
            this.f28498a = imageView;
            this.f28499b = animation;
            this.f28500c = imageView2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(ImageView imageView, Animation animation, ImageView imageView2, Animation animation2) {
            imageView.startAnimation(animation);
            imageView2.startAnimation(animation2);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(final Animation animation) {
            Handler handler = new Handler(Looper.getMainLooper());
            final ImageView imageView = this.f28498a;
            final Animation animation2 = this.f28499b;
            final ImageView imageView2 = this.f28500c;
            handler.postDelayed(new Runnable() { // from class: A4.k1
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.y.b(imageView, animation2, imageView2, animation);
                }
            }, 1500L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes4.dex */
    public static final class z extends ClickableSpan {
        z() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3159y.i(widget, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3159y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(MainActivity.this, R.color.main_blue));
            ds.setTypeface(E4.j.f2272g.t());
            ds.setUnderlineText(false);
        }
    }

    public MainActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: A4.z0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MainActivity.B5(MainActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResul…ing(this)\n        }\n    }");
        this.f28405S0 = registerForActivityResult;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: A4.A0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MainActivity.N7(MainActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult2, "registerForActivityResul…tivity, callback) }\n    }");
        this.f28406T0 = registerForActivityResult2;
        ActivityResultLauncher registerForActivityResult3 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: A4.B0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MainActivity.Z6(MainActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult3, "registerForActivityResul…        }\n        }\n    }");
        this.f28407U0 = registerForActivityResult3;
        ActivityResultLauncher registerForActivityResult4 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: A4.C0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MainActivity.D6(MainActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult4, "registerForActivityResul…lse -> {}\n        }\n    }");
        this.f28408V0 = registerForActivityResult4;
        this.f28410W0 = new q();
        ActivityResultLauncher registerForActivityResult5 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: A4.D0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MainActivity.R5(MainActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult5, "registerForActivityResul…        }\n        }\n    }");
        this.f28412X0 = registerForActivityResult5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.L6();
    }

    private final Bitmap A7() {
        View rootView = getWindow().getDecorView().getRootView();
        Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
        AbstractC3159y.h(createBitmap, "createBitmap(view.width,…height, Config.ARGB_8888)");
        rootView.draw(new Canvas(createBitmap));
        float applyDimension = TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics());
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, rootView.getWidth() / 2, rootView.getHeight() / 2, true);
        AbstractC3159y.h(createScaledBitmap, "createScaledBitmap(bitma…2, view.height / 2, true)");
        return I5(createScaledBitmap, (int) applyDimension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B5(MainActivity this$0, ActivityResult activityResult) {
        AbstractC3159y.i(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            this$0.P2();
            UptodownApp.a.N0(UptodownApp.f27990B, this$0, false, false, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.K6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int C5() {
        int i8 = this.f28411X;
        if (i8 <= 0 || i8 >= this.f28413Y.size()) {
            return -1;
        }
        int i9 = this.f28411X - 1;
        this.f28411X = i9;
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.u4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D5(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new l(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D6(MainActivity this$0, ActivityResult activityResult) {
        X4.Q j32;
        AbstractC3159y.i(this$0, "this$0");
        if (activityResult.getResultCode() == 1 && (j32 = this$0.j3()) != null) {
            if (this$0.f28415p0 != null) {
                int size = this$0.f28413Y.size();
                int i8 = this$0.f28411X;
                if (size > i8 && ((V) this$0.f28413Y.get(i8)).a() == 5) {
                    this$0.q5();
                }
            }
            UptodownApp.a aVar = UptodownApp.f27990B;
            aVar.j0(this$0);
            aVar.i0(this$0);
            F1 f12 = this$0.f28391E0;
            if (f12 != null) {
                AbstractC3159y.f(f12);
                f12.R0(j32);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E6(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F6(MainActivity this$0, View view) {
        Integer num;
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            TabLayout tabLayout = this$0.f28387A0;
            if (tabLayout != null) {
                num = Integer.valueOf(tabLayout.getSelectedTabPosition());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                S0 s02 = this$0.f28390D0;
                if (s02 != null) {
                    s02.B();
                    return;
                }
                return;
            }
            if (num != null && num.intValue() == 1) {
                S0 s03 = this$0.f28390D0;
                if (s03 != null) {
                    s03.B();
                }
                this$0.s5(0);
                T0 t02 = this$0.f28388B0;
                if (t02 != null) {
                    t02.s();
                    return;
                }
                return;
            }
            if (num != null && num.intValue() == 2) {
                S0 s04 = this$0.f28390D0;
                if (s04 != null) {
                    s04.B();
                }
                this$0.s5(0);
                V0 v02 = this$0.f28389C0;
                if (v02 != null) {
                    v02.F();
                    return;
                }
                return;
            }
            if (num != null && num.intValue() == 3) {
                S0 s05 = this$0.f28390D0;
                if (s05 != null) {
                    s05.B();
                }
                this$0.s5(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int G5() {
        int i8 = this.f28411X;
        if (i8 >= 0 && i8 < this.f28413Y.size() - 1) {
            int i9 = this.f28411X + 1;
            this.f28411X = i9;
            return i9;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) SearchActivity.class), UptodownApp.f27990B.a(this$0));
        this$0.O5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.s7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object H7(P5.d dVar) {
        Q q8 = new Q();
        Object g8 = AbstractC2825i.g(C2812b0.b(), new H(new Q(), q8, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6474a;
    }

    private final Bitmap I5(Bitmap bitmap, int i8) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        AbstractC3159y.h(createBitmap, "createBitmap(bitmap.widt…height, Config.ARGB_8888)");
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        float f8 = i8;
        paint.setAntiAlias(true);
        canvas.drawRoundRect(rectF, f8, f8, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I6(final MainActivity this$0) {
        AbstractC3159y.i(this$0, "this$0");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: A4.X0
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.J6(MainActivity.this);
            }
        }, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J5() {
        FrameLayout frameLayout = this.f28399M0;
        if (frameLayout != null) {
            AbstractC3159y.f(frameLayout);
            if (frameLayout.getChildCount() > 0) {
                FrameLayout frameLayout2 = this.f28399M0;
                AbstractC3159y.f(frameLayout2);
                frameLayout2.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J6(MainActivity this$0) {
        AbstractC3159y.i(this$0, "this$0");
        ProgressBar progressBar = (ProgressBar) this$0.findViewById(R.id.pb_splash);
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K5() {
        RelativeLayout relativeLayout = this.f28409W;
        if (relativeLayout != null) {
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
            RelativeLayout relativeLayout2 = this.f28409W;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(8);
            }
            this.f28409W = null;
        }
    }

    private final void K6() {
        this.f28405S0.launch(new Intent(this, (Class<?>) GdprPrivacySettings.class), UptodownApp.f27990B.b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L5() {
        AppBarLayout appBarLayout = this.f28417r0;
        AbstractC3159y.f(appBarLayout);
        appBarLayout.setVisibility(0);
        AppBarLayout appBarLayout2 = this.f28417r0;
        AbstractC3159y.f(appBarLayout2);
        appBarLayout2.setExpanded(false);
        TabLayout tabLayout = this.f28420u0;
        AbstractC3159y.f(tabLayout);
        tabLayout.setVisibility(8);
    }

    private final void L6() {
        String string = getString(R.string.tos_title);
        AbstractC3159y.h(string, "getString(R.string.tos_title)");
        String string2 = getString(R.string.url_privacy);
        AbstractC3159y.h(string2, "getString(R.string.url_privacy)");
        new C3323k().q(this, string2, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L7() {
        if (this.f28415p0 != null && this.f28411X >= 0) {
            int size = this.f28413Y.size();
            int i8 = this.f28411X;
            if (size > i8 && ((V) this.f28413Y.get(i8)).a() == 4 && X() && V() && SettingsPreferences.f29309b.P(this)) {
                ((TextView) findViewById(R.id.tv_next_wp)).setBackground(ContextCompat.getDrawable(this, R.drawable.selector_wizard_accept_button));
                ((TextView) findViewById(R.id.tv_next_wp)).setTextColor(ContextCompat.getColor(this, R.color.text_color_wizard_button));
            }
        }
    }

    private final void M5() {
        AppBarLayout appBarLayout = this.f28417r0;
        AbstractC3159y.f(appBarLayout);
        appBarLayout.setVisibility(8);
        TabLayout tabLayout = this.f28420u0;
        AbstractC3159y.f(tabLayout);
        tabLayout.setVisibility(8);
    }

    private final void M7() {
        TextView textView = (TextView) findViewById(R.id.tv_accept_wizard_welcome);
        if (textView != null) {
            textView.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_wizard_accept_button));
        }
        if (textView != null) {
            textView.setEnabled(true);
        }
    }

    private final void N5(Bundle bundle) {
        FrameLayout frameLayout = this.f28398L0;
        if (frameLayout != null) {
            AbstractC3159y.f(frameLayout);
            if (frameLayout.getChildCount() > 0) {
                new C3330r(this).b("turbo_popup", bundle);
                if (SettingsPreferences.f29309b.N(this) && !UptodownApp.f27990B.S()) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.popup_turbo_out);
                    loadAnimation.setAnimationListener(new n());
                    FrameLayout frameLayout2 = this.f28398L0;
                    AbstractC3159y.f(frameLayout2);
                    frameLayout2.startAnimation(loadAnimation);
                    return;
                }
                FrameLayout frameLayout3 = this.f28398L0;
                AbstractC3159y.f(frameLayout3);
                frameLayout3.removeAllViews();
                this.f28398L0 = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N6() {
        if (!Y5()) {
            v5();
            x7();
            o7();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N7(MainActivity this$0, ActivityResult activityResult) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this$0), C2812b0.b(), null, new J(new K(), null), 2, null);
    }

    private final void O5() {
        Bundle bundle = new Bundle();
        bundle.putString("type", "ignored");
        w5(bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putString("type", "ignored");
        N5(bundle2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O6() {
        if (!Y5()) {
            return;
        }
        Iterator it = this.f28413Y.iterator();
        while (it.hasNext()) {
            ((V) it.next()).c().removeAllViews();
        }
        RelativeLayout relativeLayout = this.f28415p0;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = this.f28415p0;
        if (relativeLayout2 != null) {
            relativeLayout2.removeAllViews();
        }
        this.f28415p0 = null;
        SettingsPreferences.a aVar = SettingsPreferences.f29309b;
        boolean p02 = aVar.p0(4, this);
        boolean p03 = aVar.p0(5, this);
        if (p02 && p03) {
            aVar.m1(this, true);
        }
        Z5();
        N6();
    }

    private final void P5() {
        SettingsPreferences.a aVar = SettingsPreferences.f29309b;
        String e8 = aVar.e(this);
        if (e8 != null) {
            C1498h c1498h = new C1498h();
            c1498h.t1(Long.parseLong(e8));
            Y2(c1498h);
            aVar.x0(this, null);
            return;
        }
        if (!aVar.o0(this)) {
            aVar.b1(this, System.currentTimeMillis());
            RelativeLayout relativeLayout = this.f28415p0;
            AbstractC3159y.f(relativeLayout);
            relativeLayout.setVisibility(0);
            RelativeLayout relativeLayout2 = this.f28415p0;
            AbstractC3159y.f(relativeLayout2);
            relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: A4.Y0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.Q5(view);
                }
            });
            if (U()) {
                W1();
            } else {
                p0();
            }
            if (aVar.p0(1, this) && aVar.V(this)) {
                d6();
                if (!aVar.p0(4, this)) {
                    q6();
                }
                if (!aVar.p0(5, this)) {
                    l6();
                }
            } else {
                y6();
            }
            this.f28411X = 0;
            RelativeLayout relativeLayout3 = this.f28415p0;
            if (relativeLayout3 != null) {
                relativeLayout3.addView(((V) this.f28413Y.get(0)).c());
                return;
            }
            return;
        }
        W1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q5(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q7(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R5(MainActivity this$0, ActivityResult activityResult) {
        String str;
        Bundle extras;
        AbstractC3159y.i(this$0, "this$0");
        if (activityResult.getResultCode() == 10) {
            Intent data = activityResult.getData();
            if (data != null && (extras = data.getExtras()) != null) {
                str = extras.getString("realPath");
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                AbstractActivityC2489a.B2(this$0, new File(str), null, 2, null);
            }
        }
    }

    private final void R6() {
        if (this.f28409W != null) {
            if (SettingsPreferences.f29309b.N(this)) {
                Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_out_splash);
                loadAnimation.setAnimationListener(new u());
                RelativeLayout relativeLayout = this.f28409W;
                if (relativeLayout != null) {
                    relativeLayout.startAnimation(loadAnimation);
                    return;
                }
                return;
            }
            K5();
            N6();
        }
    }

    private final boolean S5() {
        TextView textView = (TextView) findViewById(R.id.tv_title_auto_update);
        if (textView != null && textView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    private final void S6() {
        int i8;
        if (!isFinishing() && this.f28415p0 != null && !SettingsPreferences.f29309b.o0(this)) {
            RelativeLayout relativeLayout = this.f28415p0;
            AbstractC3159y.f(relativeLayout);
            relativeLayout.setVisibility(0);
            RelativeLayout relativeLayout2 = this.f28415p0;
            AbstractC3159y.f(relativeLayout2);
            relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: A4.x0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.T6(view);
                }
            });
            Iterator it = this.f28413Y.iterator();
            while (it.hasNext()) {
                V v8 = (V) it.next();
                int a8 = v8.a();
                if (a8 != 1) {
                    if (a8 != 2) {
                        if (a8 != 3) {
                            if (a8 != 4) {
                                if (a8 == 5) {
                                    v8.e(m6());
                                }
                            } else {
                                v8.e(r6());
                            }
                        } else {
                            v8.e(e6());
                        }
                    } else {
                        C1498h c1498h = this.f28421v0;
                        if (c1498h != null) {
                            AbstractC3159y.f(c1498h);
                            v8.e(h6(c1498h));
                        }
                    }
                } else {
                    v8.e(z6());
                }
            }
            if (this.f28413Y.size() > 0 && (i8 = this.f28411X) >= 0 && i8 < this.f28413Y.size()) {
                RelativeLayout relativeLayout3 = this.f28415p0;
                AbstractC3159y.f(relativeLayout3);
                relativeLayout3.removeAllViews();
                RelativeLayout relativeLayout4 = this.f28415p0;
                AbstractC3159y.f(relativeLayout4);
                relativeLayout4.addView(((V) this.f28413Y.get(this.f28411X)).c());
                return;
            }
            O6();
            return;
        }
        O6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean T5() {
        if (!S5() && !W5()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T6(View view) {
    }

    private final void T7(S0 s02) {
        TabLayout tabLayout = this.f28420u0;
        AbstractC3159y.f(tabLayout);
        TabLayout tabLayout2 = this.f28420u0;
        AbstractC3159y.f(tabLayout2);
        tabLayout.selectTab(tabLayout2.getTabAt(0));
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        AbstractC3159y.h(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.replace(R.id.fl_home_fragment, s02);
        if (!isFinishing() && !getSupportFragmentManager().isDestroyed()) {
            try {
                beginTransaction.commitAllowingStateLoss();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        this.f28400N0 = 0;
        s5(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U6() {
        ProgressBar progressBar = this.f28425z0;
        if (progressBar != null) {
            AbstractC3159y.f(progressBar);
            if (progressBar.getVisibility() != 0) {
                ProgressBar progressBar2 = this.f28425z0;
                AbstractC3159y.f(progressBar2);
                progressBar2.setVisibility(0);
                S0 s02 = this.f28390D0;
                if (s02 != null) {
                    s02.y();
                }
                T0 t02 = this.f28388B0;
                if (t02 != null) {
                    t02.q();
                }
                V0 v02 = this.f28389C0;
                if (v02 != null) {
                    v02.y();
                }
            }
        }
    }

    private final boolean V5() {
        if (ContextCompat.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            return true;
        }
        return false;
    }

    private final void V6() {
        w wVar = new w(getSupportFragmentManager(), getLifecycle());
        ViewPager2 viewPager2 = this.f28422w0;
        if (viewPager2 != null) {
            viewPager2.setAdapter(wVar);
        }
        TabLayout tabLayout = this.f28387A0;
        if (tabLayout != null && this.f28422w0 != null) {
            AbstractC3159y.f(tabLayout);
            ViewPager2 viewPager22 = this.f28422w0;
            AbstractC3159y.f(viewPager22);
            new TabLayoutMediator(tabLayout, viewPager22, new TabLayoutMediator.TabConfigurationStrategy() { // from class: A4.T0
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i8) {
                    MainActivity.W6(MainActivity.this, tab, i8);
                }
            }).attach();
            TabLayout tabLayout2 = this.f28387A0;
            AbstractC3159y.f(tabLayout2);
            tabLayout2.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new v());
        }
    }

    private final boolean V7(Intent intent) {
        if ((intent.getFlags() & 1048576) == 1048576) {
            return true;
        }
        return false;
    }

    private final boolean W5() {
        TextView textView = (TextView) findViewById(R.id.tv_msg_status_526);
        if (textView != null && textView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W6(MainActivity this$0, TabLayout.Tab tab, int i8) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(tab, "tab");
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        tab.setContentDescription(this$0.getString(R.string.profile_title));
                        tab.setIcon(R.drawable.vector_user_profile);
                        return;
                    }
                    return;
                }
                tab.setContentDescription(this$0.getString(R.string.top_downloads_title));
                tab.setIcon(R.drawable.selector_icon_tab_top);
                return;
            }
            tab.setContentDescription(this$0.getString(R.string.top_games_title));
            tab.setIcon(R.drawable.selector_icon_tab_games);
            return;
        }
        tab.setContentDescription(this$0.getString(R.string.cd_home_tab));
        tab.setIcon(R.drawable.selector_icon_tab_home);
    }

    private final boolean X5() {
        File n8 = new C3323k().n(this);
        if (SettingsPreferences.f29309b.j0(this)) {
            X6();
            return true;
        }
        if (n8 != null) {
            e7();
            return true;
        }
        return false;
    }

    private final void X6() {
        setContentView(R.layout.status_526);
        TextView textView = (TextView) findViewById(R.id.tv_msg_status_526);
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.u());
        textView.setText(C3307A.f34459a.c(getString(R.string.msg_update_app_status_526)));
        TextView textView2 = (TextView) findViewById(R.id.tv_update_status_526);
        textView2.setTypeface(aVar.u());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: A4.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.Y6(MainActivity.this, view);
            }
        });
    }

    private final boolean Y5() {
        RelativeLayout relativeLayout = this.f28415p0;
        if (relativeLayout != null) {
            AbstractC3159y.f(relativeLayout);
            if (relativeLayout.getVisibility() == 0) {
                RelativeLayout relativeLayout2 = this.f28415p0;
                AbstractC3159y.f(relativeLayout2);
                if (relativeLayout2.getChildCount() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        File n8 = new C3323k().n(this$0);
        if (n8 != null) {
            UptodownApp.a.Z(UptodownApp.f27990B, n8, this$0, null, 4, null);
        } else {
            this$0.z7();
        }
    }

    private final void Z5() {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new o(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z6(MainActivity this$0, ActivityResult activityResult) {
        AbstractC3159y.i(this$0, "this$0");
        int resultCode = activityResult.getResultCode();
        if (resultCode != 1003) {
            if (resultCode != 1004) {
                this$0.x2();
                return;
            }
            UptodownApp.f27990B.e(this$0);
            this$0.finish();
            this$0.startActivity(this$0.getIntent());
            return;
        }
        C3326n a8 = C3326n.f34490t.a(this$0);
        a8.a();
        a8.o();
        a8.g();
        this$0.finish();
        this$0.startActivity(this$0.getIntent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a6() {
        X4.Q e8 = X4.Q.f12424k.e(this);
        if ((e8 == null || !e8.G()) && this.f28399M0 != null) {
            final C1500j d8 = C1500j.f12617n.d(this);
            if (d8 != null && d8.a(this)) {
                View inflate = getLayoutInflater().inflate(R.layout.ad_banner_floating, (ViewGroup) this.f28399M0, false);
                View findViewById = inflate.findViewById(R.id.tv_download_banner);
                AbstractC3159y.h(findViewById, "bannerView.findViewById(R.id.tv_download_banner)");
                ((TextView) findViewById).setTypeface(E4.j.f2272g.t());
                View findViewById2 = inflate.findViewById(R.id.rl_close_banner);
                AbstractC3159y.h(findViewById2, "bannerView.findViewById(R.id.rl_close_banner)");
                ((RelativeLayout) findViewById2).setOnClickListener(new View.OnClickListener() { // from class: A4.p0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MainActivity.b6(C1500j.this, this, view);
                    }
                });
                View findViewById3 = inflate.findViewById(R.id.iv_banner);
                AbstractC3159y.h(findViewById3, "bannerView.findViewById(R.id.iv_banner)");
                ImageView imageView = (ImageView) findViewById3;
                com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
                Resources resources = getResources();
                AbstractC3159y.h(resources, "resources");
                h8.l(d8.A(resources)).n(UptodownApp.f27990B.e0(this)).j(imageView, new p(d8, this, inflate, imageView));
                imageView.setOnClickListener(new View.OnClickListener() { // from class: A4.q0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MainActivity.c6(C1500j.this, this, view);
                    }
                });
                return;
            }
            FrameLayout frameLayout = this.f28399M0;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b6(C1500j c1500j, MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        c1500j.f(this$0);
        FrameLayout frameLayout = this$0.f28399M0;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b7(MainActivity this$0, C1498h appInfo, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(appInfo, "$appInfo");
        RelativeLayout relativeLayout = this$0.f28402P0;
        AbstractC3159y.f(relativeLayout);
        relativeLayout.setVisibility(8);
        this$0.f28401O0.E(0L);
        this$0.Y2(appInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c6(C1500j c1500j, MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            c1500j.e(this$0);
            FrameLayout frameLayout = this$0.f28399M0;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            this$0.G2(c1500j.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c7(MainActivity this$0, C1498h appInfo, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(appInfo, "$appInfo");
        RelativeLayout relativeLayout = this$0.f28402P0;
        AbstractC3159y.f(relativeLayout);
        relativeLayout.setVisibility(8);
        this$0.f28401O0.E(0L);
        this$0.Y2(appInfo);
    }

    private final void d6() {
        o5(e6(), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d7(MainActivity this$0, C1498h appInfo, Function0 updateCard, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(appInfo, "$appInfo");
        AbstractC3159y.i(updateCard, "$updateCard");
        this$0.f28401O0.g(appInfo, this$0);
        C3608f c3608f = this$0.f28401O0;
        RelativeLayout relativeLayout = this$0.f28402P0;
        AbstractC3159y.f(relativeLayout);
        c3608f.f(this$0, relativeLayout);
        updateCard.invoke();
    }

    private final RelativeLayout e6() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_continue, (ViewGroup) this.f28415p0, false);
        AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_welcome_to_wizard_continue);
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.u());
        ((TextView) relativeLayout.findViewById(R.id.tv_app_name_wizard_continue)).setTypeface(aVar.t());
        ((TextView) relativeLayout.findViewById(R.id.tv_continue_to_wizard_continue)).setTypeface(aVar.u());
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_next_wizard_continue);
        textView2.setTypeface(aVar.t());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: A4.Z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.f6(MainActivity.this, view);
            }
        });
        return relativeLayout;
    }

    private final void e7() {
        C3326n a8 = C3326n.f34490t.a(this);
        a8.a();
        String packageName = getPackageName();
        AbstractC3159y.h(packageName, "packageName");
        O u02 = a8.u0(packageName);
        a8.g();
        if (u02 != null && u02.o() == 100) {
            setContentView(R.layout.dialog_auto_update);
            TextView textView = (TextView) findViewById(R.id.tv_title_auto_update);
            j.a aVar = E4.j.f2272g;
            textView.setTypeface(aVar.t());
            ((TextView) findViewById(R.id.tv_desc_auto_update)).setTypeface(aVar.u());
            ((TextView) findViewById(R.id.tv_info_auto_update)).setTypeface(aVar.u());
            TextView textView2 = (TextView) findViewById(R.id.tv_installed_version_auto_update);
            textView2.setTypeface(aVar.u());
            PackageManager packageManager = getPackageManager();
            AbstractC3159y.h(packageManager, "packageManager");
            String packageName2 = getPackageName();
            AbstractC3159y.h(packageName2, "packageName");
            textView2.setText(getString(R.string.autoupdate_installed_version, N4.q.d(packageManager, packageName2, 0).versionName));
            TextView textView3 = (TextView) findViewById(R.id.tv_update_version_auto_update);
            textView3.setTypeface(aVar.t());
            textView3.setText(getString(R.string.autoupdate_update_version, u02.z()));
            TextView textView4 = (TextView) findViewById(R.id.tv_update_size_auto_update);
            textView4.setTypeface(aVar.u());
            textView4.setText(getString(R.string.autoupdate_update_size, new N4.g().c(u02.s())));
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_uptodown_version_details);
            ((TextView) findViewById(R.id.tv_uptodown_version_details_label)).setTypeface(aVar.u());
            final ImageView imageView = (ImageView) findViewById(R.id.iv_uptodown_version_details_label);
            final TextView textView5 = (TextView) findViewById(R.id.tv_uptodown_version_details);
            textView5.setTypeface(aVar.u());
            new S4.j(this, u02.n(), new x(textView5, this, u02), LifecycleOwnerKt.getLifecycleScope(this));
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: A4.g1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.f7(textView5, imageView, view);
                }
            });
            ((TextView) findViewById(R.id.tv_update)).setTypeface(aVar.t());
            ((RelativeLayout) findViewById(R.id.rl_update)).setOnClickListener(new View.OnClickListener() { // from class: A4.h1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.g7(MainActivity.this, view);
                }
            });
            ((TextView) findViewById(R.id.tv_cancel)).setTypeface(aVar.t());
            ((RelativeLayout) findViewById(R.id.rl_cancel)).setOnClickListener(new View.OnClickListener() { // from class: A4.i1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.h7(MainActivity.this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.q5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f7(TextView textView, ImageView imageView, View view) {
        if (textView.getVisibility() == 0) {
            textView.setVisibility(8);
            imageView.setScaleY(1.0f);
        } else {
            textView.setVisibility(0);
            imageView.setScaleY(-1.0f);
        }
    }

    private final void g6(C1498h c1498h) {
        this.f28421v0 = c1498h;
        o5(h6(c1498h), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g7(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        try {
            File n8 = new C3323k().n(this$0);
            if (n8 != null && n8.exists()) {
                this$0.d2(n8);
            } else {
                this$0.Q6();
            }
        } catch (Exception unused) {
            this$0.z7();
        }
    }

    private final RelativeLayout h6(C1498h c1498h) {
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_deep_link, (ViewGroup) this.f28415p0, false);
        AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.iv_header_feature_wizard_deep_link);
        ImageView imageView2 = (ImageView) relativeLayout.findViewById(R.id.iv_logo_wizard_deep_link);
        com.squareup.picasso.w l8 = com.squareup.picasso.s.h().l(c1498h.l0());
        UptodownApp.a aVar = UptodownApp.f27990B;
        l8.n(aVar.f0(this)).i(imageView2);
        com.squareup.picasso.s.h().l(c1498h.e0()).n(aVar.e0(this)).i(imageView);
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_name_app_wizard_deep_link);
        j.a aVar2 = E4.j.f2272g;
        textView.setTypeface(aVar2.t());
        textView.setText(c1498h.s0());
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_author_wizard_deep_link);
        textView2.setTypeface(aVar2.u());
        textView2.setText(c1498h.k());
        ((TextView) relativeLayout.findViewById(R.id.tv_app_name_wizard_deep_link)).setTypeface(aVar2.t());
        ((TextView) relativeLayout.findViewById(R.id.tv_welcome_to_wizard_deep_link)).setTypeface(aVar2.u());
        ((TextView) relativeLayout.findViewById(R.id.tv_slogan_to_wizard_deep_link)).setTypeface(aVar2.u());
        ((TextView) relativeLayout.findViewById(R.id.tv_terms_wizard_deep_link)).setTypeface(aVar2.u());
        ((RelativeLayout) relativeLayout.findViewById(R.id.rl_terms_wizard_deep_link)).setOnClickListener(new View.OnClickListener() { // from class: A4.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.i6(MainActivity.this, view);
            }
        });
        ((TextView) relativeLayout.findViewById(R.id.tv_privacy_settings_wizard_deep_link)).setTypeface(aVar2.u());
        ((RelativeLayout) relativeLayout.findViewById(R.id.rl_privacy_settings_wizard_deep_link)).setOnClickListener(new View.OnClickListener() { // from class: A4.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.j6(MainActivity.this, view);
            }
        });
        TextView textView3 = (TextView) relativeLayout.findViewById(R.id.tv_accept_wizard_deep_link);
        textView3.setTypeface(aVar2.t());
        textView3.setOnClickListener(new View.OnClickListener() { // from class: A4.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.k6(MainActivity.this, view);
            }
        });
        return relativeLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h7(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.L6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i7() {
        FrameLayout frameLayout = this.f28399M0;
        if (frameLayout != null) {
            AbstractC3159y.f(frameLayout);
            if (frameLayout.getChildCount() > 0) {
                FrameLayout frameLayout2 = this.f28399M0;
                AbstractC3159y.f(frameLayout2);
                frameLayout2.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.K6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j7(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.u4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k7(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.O6();
    }

    private final void l6() {
        o5(m6(), 5);
    }

    private final boolean l7() {
        boolean z8;
        FrameLayout frameLayout;
        X4.Q e8 = X4.Q.f12424k.e(this);
        if (System.currentTimeMillis() - SettingsPreferences.f29309b.D(this) >= TimeUnit.DAYS.toMillis(14L)) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (e8 != null || !z8 || (frameLayout = this.f28396J0) == null) {
            return false;
        }
        AbstractC3159y.f(frameLayout);
        frameLayout.removeAllViews();
        k0 c8 = k0.c(getLayoutInflater());
        this.f28397K0 = c8;
        AbstractC3159y.f(c8);
        TextView textView = c8.f10726h;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.u());
        c8.f10724f.setTypeface(aVar.u());
        c8.f10725g.setTypeface(aVar.t());
        c8.f10723e.setTypeface(aVar.t());
        String string = getString(R.string.reminder_login_msg_1);
        AbstractC3159y.h(string, "getString(R.string.reminder_login_msg_1)");
        List<C1503m> a8 = C1503m.f12631f.a(string, "\\[xx](.*?)\\[/xx]");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(new g6.j("\\[xx](.*?)\\[/xx]").g(string, A.f28426a));
        for (C1503m c1503m : a8) {
            int S7 = g6.n.S(spannableStringBuilder, c1503m.d(), 0, false, 6, null);
            int length = c1503m.d().length() + S7;
            if (S7 >= 0) {
                spannableStringBuilder.setSpan(new z(), S7, length, 33);
            }
        }
        c8.f10724f.setText(spannableStringBuilder);
        c8.f10723e.setOnClickListener(new View.OnClickListener() { // from class: A4.Q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.m7(MainActivity.this, view);
            }
        });
        c8.f10721c.setOnClickListener(new View.OnClickListener() { // from class: A4.S0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.n7(MainActivity.this, view);
            }
        });
        FrameLayout frameLayout2 = this.f28396J0;
        AbstractC3159y.f(frameLayout2);
        k0 k0Var = this.f28397K0;
        AbstractC3159y.f(k0Var);
        frameLayout2.addView(k0Var.getRoot());
        SettingsPreferences.a aVar2 = SettingsPreferences.f29309b;
        if (aVar2.N(this) && !UptodownApp.f27990B.S()) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in_bottom);
            k0 k0Var2 = this.f28397K0;
            AbstractC3159y.f(k0Var2);
            k0Var2.getRoot().startAnimation(loadAnimation);
        }
        aVar2.b1(this, System.currentTimeMillis());
        return true;
    }

    private final RelativeLayout m6() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_login, (ViewGroup) this.f28415p0, false);
        AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        RelativeLayout relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_header_wl);
        if (relativeLayout2 != null) {
            ((TextView) relativeLayout2.findViewById(R.id.tv_title_header_wizard)).setTypeface(E4.j.f2272g.t());
        }
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_title_wl);
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_login_google_wl);
        if (UptodownApp.f27990B.S()) {
            textView2.setVisibility(8);
        } else {
            textView2.setTypeface(aVar.t());
            textView2.setOnClickListener(new View.OnClickListener() { // from class: A4.r0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.n6(MainActivity.this, view);
                }
            });
        }
        TextView textView3 = (TextView) relativeLayout.findViewById(R.id.tv_login_email_wl);
        textView3.setTypeface(aVar.t());
        textView3.setOnClickListener(new View.OnClickListener() { // from class: A4.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.o6(MainActivity.this, view);
            }
        });
        ((TextView) relativeLayout.findViewById(R.id.tv_login_anonymous_wl)).setTypeface(aVar.u());
        ((TextView) relativeLayout.findViewById(R.id.tv_login_anonymous_wl)).setOnClickListener(new View.OnClickListener() { // from class: A4.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.p6(MainActivity.this, view);
            }
        });
        return relativeLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m7(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) LoginActivity.class), UptodownApp.f27990B.a(this$0));
        Bundle bundle = new Bundle();
        bundle.putString("type", "continue");
        this$0.w5(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.n3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n7(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putString("type", "closed");
        this$0.w5(bundle);
    }

    private final void o5(RelativeLayout relativeLayout, int i8) {
        V v8 = new V();
        v8.d(i8);
        v8.e(relativeLayout);
        this.f28413Y.add(v8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f28408V0.launch(new Intent(this$0, (Class<?>) LoginActivity.class), UptodownApp.f27990B.b(this$0));
    }

    private final void o7() {
        X4.Q e8 = X4.Q.f12424k.e(this);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (!SettingsPreferences.f29309b.a0(this) && e8 != null && e8.s() < 1720483200 && currentTimeMillis < 1723161600 && !isFinishing()) {
            AlertDialog s22 = s2();
            if (s22 != null) {
                s22.dismiss();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            T4.r c8 = T4.r.c(getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(layoutInflater)");
            String string = getString(R.string.terms_conditions_updated_popup);
            AbstractC3159y.h(string, "getString(R.string.terms_conditions_updated_popup)");
            List<C1503m> a8 = C1503m.f12631f.a(string, "\\[xx](.*?)\\[/xx]");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(new g6.j("\\[xx](.*?)\\[/xx]").g(string, C.f28428a));
            for (C1503m c1503m : a8) {
                int S7 = g6.n.S(spannableStringBuilder, c1503m.d(), 0, false, 6, null);
                int length = c1503m.d().length() + S7;
                if (S7 >= 0) {
                    spannableStringBuilder.setSpan(new B(), S7, length, 33);
                }
            }
            TextView textView = c8.f10808d;
            j.a aVar = E4.j.f2272g;
            textView.setTypeface(aVar.u());
            c8.f10808d.setText(spannableStringBuilder);
            c8.f10808d.setOnClickListener(new View.OnClickListener() { // from class: A4.u0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.p7(MainActivity.this, view);
                }
            });
            c8.f10807c.setVisibility(8);
            c8.f10809e.setTypeface(aVar.t());
            c8.f10809e.setOnClickListener(new View.OnClickListener() { // from class: A4.w0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.q7(MainActivity.this, view);
                }
            });
            builder.setView(c8.getRoot());
            builder.setCancelable(true);
            O2(builder.create());
            U2();
            Bundle bundle = new Bundle();
            bundle.putString("type", "shown");
            new C3330r(this).b("new_terms_popup", bundle);
            SettingsPreferences.f29309b.S0(this, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p5() {
        int i8;
        if (!this.f28414Z && this.f28413Y.size() > 0 && (i8 = this.f28411X) >= 0) {
            RelativeLayout c8 = ((V) this.f28413Y.get(i8)).c();
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_back_out);
            loadAnimation.setAnimationListener(new AnimationAnimationListenerC2485h());
            c8.startAnimation(loadAnimation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.q5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p7(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        C3323k c3323k = new C3323k();
        String string = this$0.getString(R.string.url_tos);
        AbstractC3159y.h(string, "getString(R.string.url_tos)");
        c3323k.q(this$0, string, this$0.getString(R.string.tos_title));
        AlertDialog s22 = this$0.s2();
        if (s22 != null) {
            s22.dismiss();
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "opened");
        new C3330r(this$0).b("new_terms_popup", bundle);
    }

    private final void q5() {
        SettingsPreferences.f29309b.n1(this, ((V) this.f28413Y.get(this.f28411X)).a());
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_next_out);
        loadAnimation.setAnimationListener(new AnimationAnimationListenerC2486i());
        ((V) this.f28413Y.get(this.f28411X)).c().startAnimation(loadAnimation);
    }

    private final void q6() {
        o5(r6(), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q7(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog s22 = this$0.s2();
        if (s22 != null) {
            s22.dismiss();
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "closed");
        new C3330r(this$0).b("new_terms_popup", bundle);
    }

    private final void r5(C1498h c1498h, boolean z8, int i8) {
        C3330r u22;
        C3330r u23;
        L0 a8 = L0.f11173K.a(c1498h, c1498h.i());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        AbstractC3159y.h(beginTransaction, "supportFragmentManager.beginTransaction()");
        if (((CoordinatorLayout) findViewById(R.id.rl_main_scrollable)) != null) {
            try {
                beginTransaction.replace(R.id.rl_main_scrollable, a8);
                beginTransaction.addToBackStack(null);
                if (z8) {
                    beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                }
                if (!isFinishing() && !getSupportFragmentManager().isDestroyed()) {
                    try {
                        beginTransaction.commitAllowingStateLoss();
                        return;
                    } catch (Exception e8) {
                        e8.printStackTrace();
                        if (i8 != -1 && (u22 = u2()) != null) {
                            u22.a("app_detail_transaction_commit_" + i8);
                        }
                        String string = getString(R.string.error_generico);
                        AbstractC3159y.h(string, "getString(R.string.error_generico)");
                        e2(string);
                        return;
                    }
                }
                return;
            } catch (Exception e9) {
                e9.printStackTrace();
                String string2 = getString(R.string.error_generico);
                AbstractC3159y.h(string2, "getString(R.string.error_generico)");
                e2(string2);
                return;
            }
        }
        if (i8 != -1 && (u23 = u2()) != null) {
            u23.a("container_view_not_found_" + i8);
        }
        String string3 = getString(R.string.error_generico);
        AbstractC3159y.h(string3, "getString(R.string.error_generico)");
        e2(string3);
    }

    private final RelativeLayout r6() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_permissions, (ViewGroup) this.f28415p0, false);
        AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        RelativeLayout relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_header_wp);
        if (relativeLayout2 != null) {
            ((TextView) relativeLayout2.findViewById(R.id.tv_title_header_wizard)).setTypeface(E4.j.f2272g.t());
        }
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_title_wp);
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        RelativeLayout relativeLayout3 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_notifications_wp);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33) {
            ((TextView) relativeLayout.findViewById(R.id.tv_notifications_title_wp)).setTypeface(aVar.t());
            ((TextView) relativeLayout.findViewById(R.id.tv_notifications_msg_wp)).setTypeface(aVar.u());
            SwitchCompat switchCompat = (SwitchCompat) relativeLayout.findViewById(R.id.sc_notifications_wp);
            this.f28419t0 = switchCompat;
            AbstractC3159y.f(switchCompat);
            switchCompat.setChecked(V5());
            SwitchCompat switchCompat2 = this.f28419t0;
            AbstractC3159y.f(switchCompat2);
            switchCompat2.setClickable(false);
            relativeLayout3.setOnClickListener(new View.OnClickListener() { // from class: A4.I0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.s6(MainActivity.this, view);
                }
            });
        } else if (relativeLayout3 != null) {
            relativeLayout3.setVisibility(8);
        }
        RelativeLayout relativeLayout4 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_unknown_sources_wp);
        ((ScrollableTextView) relativeLayout.findViewById(R.id.tv_unknown_sources_title_wp)).setTypeface(aVar.t());
        ((TextView) relativeLayout.findViewById(R.id.tv_unknown_sources_badge_wp)).setTypeface(aVar.t());
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_unknown_sources_msg_wp);
        textView2.setText(getString(R.string.msg_install_from_unknown_source, getString(R.string.app_name)));
        textView2.setTypeface(aVar.u());
        SwitchCompat switchCompat3 = (SwitchCompat) relativeLayout.findViewById(R.id.sc_unknown_sources_wp);
        this.f28418s0 = switchCompat3;
        AbstractC3159y.f(switchCompat3);
        switchCompat3.setChecked(X());
        SwitchCompat switchCompat4 = this.f28418s0;
        AbstractC3159y.f(switchCompat4);
        switchCompat4.setClickable(false);
        relativeLayout4.setOnClickListener(new View.OnClickListener() { // from class: A4.J0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.t6(MainActivity.this, view);
            }
        });
        boolean x8 = new C3319g().x(this);
        RelativeLayout relativeLayout5 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_autoupdate_wp);
        if (i8 > 31 && !UptodownApp.f27990B.S() && !x8) {
            SettingsPreferences.a aVar2 = SettingsPreferences.f29309b;
            if (!aVar2.P(this)) {
                aVar2.y0(this, true);
            }
            ((TextView) relativeLayout.findViewById(R.id.tv_autoupdate_title_wp)).setTypeface(aVar.t());
            ((TextView) relativeLayout.findViewById(R.id.tv_autoupdate_msg_wp)).setTypeface(aVar.u());
            final SwitchCompat switchCompat5 = (SwitchCompat) relativeLayout.findViewById(R.id.sc_autoupdate_wp);
            switchCompat5.setChecked(aVar2.O(this));
            switchCompat5.setClickable(false);
            relativeLayout5.setOnClickListener(new View.OnClickListener() { // from class: A4.K0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.u6(SwitchCompat.this, this, view);
                }
            });
        } else {
            SettingsPreferences.a aVar3 = SettingsPreferences.f29309b;
            if (!aVar3.P(this)) {
                aVar3.y0(this, false);
            }
            relativeLayout5.setVisibility(8);
            relativeLayout.findViewById(R.id.v_notifications_wp).setVisibility(4);
        }
        if (relativeLayout3.getVisibility() == 8 && relativeLayout5.getVisibility() == 8) {
            relativeLayout.findViewById(R.id.v_unknown_sources_separator).setVisibility(4);
        }
        TextView textView3 = (TextView) relativeLayout.findViewById(R.id.tv_next_wp);
        textView3.setTypeface(aVar.t());
        textView3.setOnClickListener(new View.OnClickListener() { // from class: A4.L0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.v6(MainActivity.this, view);
            }
        });
        TextView textView4 = (TextView) relativeLayout.findViewById(R.id.tv_back_wp);
        textView4.setTypeface(aVar.t());
        textView4.setOnClickListener(new View.OnClickListener() { // from class: A4.M0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.w6(MainActivity.this, view);
            }
        });
        return relativeLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r7() {
        AppBarLayout appBarLayout = this.f28417r0;
        AbstractC3159y.f(appBarLayout);
        appBarLayout.setVisibility(0);
        AppBarLayout appBarLayout2 = this.f28417r0;
        AbstractC3159y.f(appBarLayout2);
        appBarLayout2.setExpanded(true);
        TabLayout tabLayout = this.f28387A0;
        AbstractC3159y.f(tabLayout);
        int selectedTabPosition = tabLayout.getSelectedTabPosition();
        if (selectedTabPosition != 2 && selectedTabPosition != 3) {
            TabLayout tabLayout2 = this.f28420u0;
            AbstractC3159y.f(tabLayout2);
            tabLayout2.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        SwitchCompat switchCompat = this$0.f28419t0;
        if (switchCompat != null && !switchCompat.isChecked()) {
            this$0.m0();
        }
    }

    private final void s7() {
        CustomTabsIntent build = new CustomTabsIntent.Builder().build();
        AbstractC3159y.h(build, "builder.build()");
        build.intent.setData(Uri.parse(new C3323k().c(C3312F.f34471c.c(this))));
        this.f28406T0.launch(build.intent, UptodownApp.f27990B.b(this));
    }

    private final void t5() {
        long currentTimeMillis = System.currentTimeMillis();
        SettingsPreferences.a aVar = SettingsPreferences.f29309b;
        if (currentTimeMillis - aVar.C(this) >= TimeUnit.DAYS.toMillis(7L)) {
            aVar.V0(this, System.currentTimeMillis());
            if (Build.VERSION.SDK_INT >= 33) {
                if (!V5()) {
                    x5();
                    return;
                }
            } else if (!aVar.b0(this)) {
                x5();
                return;
            }
        }
        l7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        SwitchCompat switchCompat = this$0.f28418s0;
        if (switchCompat != null && !switchCompat.isChecked() && !this$0.X()) {
            this$0.o0();
        }
    }

    private final void t7() {
        Float f8;
        if (!isFinishing()) {
            s0 c8 = s0.c(getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f10877f;
            j.a aVar = E4.j.f2272g;
            textView.setTypeface(aVar.t());
            float height = c8.f10877f.getHeight();
            int color = ContextCompat.getColor(this, R.color.turbo_text_gradient_start);
            int color2 = ContextCompat.getColor(this, R.color.turbo_text_gradient_end);
            TextPaint paint = c8.f10877f.getPaint();
            if (paint != null) {
                f8 = Float.valueOf(paint.measureText(c8.f10877f.getText().toString()));
            } else {
                f8 = null;
            }
            AbstractC3159y.f(f8);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f8.floatValue(), height, new int[]{color, color2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            TextPaint paint2 = c8.f10877f.getPaint();
            if (paint2 != null) {
                paint2.setShader(linearGradient);
            }
            float dimension = getResources().getDimension(R.dimen.turbo_popup_lines_max_width);
            int i8 = getResources().getDisplayMetrics().widthPixels;
            float dimension2 = getResources().getDimension(R.dimen.margin_l);
            float f9 = (i8 - dimension2) - dimension2;
            if (dimension > f9) {
                int i9 = (int) f9;
                c8.f10875d.setMaxWidth(i9);
                c8.f10876e.setMaxWidth(i9);
            }
            c8.f10875d.setTypeface(aVar.u());
            String obj = c8.f10875d.getText().toString();
            List<C1503m> a8 = C1503m.f12631f.a(obj, "\\[xx](.*?)\\[/xx]");
            SpannableString spannableString = new SpannableString(new g6.j("\\[xx](.*?)\\[/xx]").g(obj, E.f28430a));
            for (C1503m c1503m : a8) {
                int S7 = g6.n.S(spannableString, c1503m.d(), 0, false, 6, null);
                int length = c1503m.d().length() + S7;
                if (S7 >= 0) {
                    spannableString.setSpan(new D(), S7, length, 33);
                }
            }
            c8.f10875d.setText(spannableString);
            c8.f10876e.setTypeface(E4.j.f2272g.t());
            c8.f10873b.setOnClickListener(new View.OnClickListener() { // from class: A4.E0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.u7(MainActivity.this, view);
                }
            });
            c8.f10876e.setOnClickListener(new View.OnClickListener() { // from class: A4.F0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.v7(MainActivity.this, view);
                }
            });
            Locale locale = Locale.getDefault();
            AbstractC3159y.h(locale, "getDefault()");
            if (TextUtils.getLayoutDirectionFromLocale(locale) == 1) {
                c8.f10874c.setCropType(0);
            }
            c8.f10874c.setOnClickListener(new View.OnClickListener() { // from class: A4.H0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.w7(view);
                }
            });
            FrameLayout frameLayout = this.f28398L0;
            AbstractC3159y.f(frameLayout);
            frameLayout.addView(c8.getRoot());
            SettingsPreferences.a aVar2 = SettingsPreferences.f29309b;
            if (aVar2.N(this) && !UptodownApp.f27990B.S()) {
                c8.getRoot().startAnimation(AnimationUtils.loadAnimation(this, R.anim.popup_turbo_in));
            }
            aVar2.h1(this, System.currentTimeMillis());
            Bundle bundle = new Bundle();
            bundle.putString("type", "shown");
            new C3330r(this).b("turbo_popup", bundle);
        }
    }

    private final void u4() {
        SettingsPreferences.a aVar = SettingsPreferences.f29309b;
        if (!aVar.V(this)) {
            aVar.G0(this, true);
            aVar.u0(this, true);
            aVar.A0(this, true);
            aVar.e1(this, true);
            UptodownApp.a aVar2 = UptodownApp.f27990B;
            UptodownApp.a.N0(aVar2, this, false, false, 6, null);
            aVar2.K(this);
        }
        P2();
        if (!aVar.k0(this)) {
            new C3323k().g(s2(), this);
        } else {
            q5();
        }
    }

    private final void u5() {
        if (!C3335w.f34532a.a(this)) {
            C3326n a8 = C3326n.f34490t.a(this);
            a8.a();
            S2(a8.q0());
            a8.g();
            for (int i8 = 0; v2().size() > 0 && i8 < 2; i8++) {
                Object remove = v2().remove(0);
                AbstractC3159y.h(remove, "preregistrationsToNotify.removeAt(0)");
                L2((X4.D) remove);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u6(SwitchCompat switchCompat, MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        boolean z8 = !switchCompat.isChecked();
        SettingsPreferences.a aVar = SettingsPreferences.f29309b;
        aVar.y0(this$0, z8);
        switchCompat.setChecked(aVar.O(this$0));
        this$0.L7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u7(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putString("type", "closed");
        this$0.N5(bundle);
    }

    private final void v5() {
        X4.Q e8 = X4.Q.f12424k.e(this);
        if ((e8 == null || !e8.G()) && SettingsPreferences.f29309b.H(this) == 0) {
            t7();
        } else {
            t5();
            u5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.q5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v7(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putString("type", "subscribe");
        this$0.N5(bundle);
        this$0.s7();
    }

    private final void w5(Bundle bundle) {
        FrameLayout frameLayout = this.f28396J0;
        if (frameLayout != null) {
            AbstractC3159y.f(frameLayout);
            if (frameLayout.getChildCount() > 0 && this.f28397K0 != null) {
                new C3330r(this).b("login_popup", bundle);
                if (SettingsPreferences.f29309b.N(this) && !UptodownApp.f27990B.S()) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_out_bottom);
                    loadAnimation.setAnimationListener(new AnimationAnimationListenerC2487j());
                    k0 k0Var = this.f28397K0;
                    AbstractC3159y.f(k0Var);
                    k0Var.getRoot().startAnimation(loadAnimation);
                    return;
                }
                FrameLayout frameLayout2 = this.f28396J0;
                AbstractC3159y.f(frameLayout2);
                frameLayout2.removeAllViews();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.p5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w7(View view) {
    }

    private final void x5() {
        if (!isFinishing()) {
            AlertDialog s22 = s2();
            if (s22 != null) {
                s22.dismiss();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            T4.r c8 = T4.r.c(getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f10808d;
            j.a aVar = E4.j.f2272g;
            textView.setTypeface(aVar.u());
            c8.f10808d.setText(getString(R.string.notification_permission_request));
            c8.f10809e.setTypeface(aVar.t());
            c8.f10809e.setOnClickListener(new View.OnClickListener() { // from class: A4.k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.y5(MainActivity.this, view);
                }
            });
            c8.f10807c.setTypeface(aVar.t());
            c8.f10807c.setOnClickListener(new View.OnClickListener() { // from class: A4.v0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.z5(MainActivity.this, view);
                }
            });
            builder.setView(c8.getRoot());
            builder.setCancelable(true);
            O2(builder.create());
            if (!isFinishing() && s2() != null) {
                AlertDialog s23 = s2();
                AbstractC3159y.f(s23);
                Window window = s23.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                AlertDialog s24 = s2();
                AbstractC3159y.f(s24);
                s24.show();
            }
        }
    }

    private final void x6() {
        q6();
        l6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y5(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog s22 = this$0.s2();
        AbstractC3159y.f(s22);
        s22.dismiss();
        if (Build.VERSION.SDK_INT >= 33) {
            this$0.m0();
        }
        SettingsPreferences.f29309b.U0(this$0, true);
    }

    private final void y6() {
        o5(z6(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y7(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog s22 = this$0.s2();
        if (s22 != null) {
            s22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z5(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog s22 = this$0.s2();
        AbstractC3159y.f(s22);
        s22.dismiss();
    }

    private final RelativeLayout z6() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_welcome, (ViewGroup) this.f28415p0, false);
        AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_welcome_to_wizard_welcome);
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.u());
        ((TextView) relativeLayout.findViewById(R.id.tv_app_name_wizard_welcome)).setTypeface(aVar.t());
        ((TextView) relativeLayout.findViewById(R.id.tv_slogan_to_wizard_welcome)).setTypeface(aVar.u());
        ((TextView) relativeLayout.findViewById(R.id.tv_terms_wizard_welcome)).setTypeface(aVar.t());
        ((RelativeLayout) relativeLayout.findViewById(R.id.rl_terms_wizard_welcome)).setOnClickListener(new View.OnClickListener() { // from class: A4.U0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.A6(MainActivity.this, view);
            }
        });
        ((TextView) relativeLayout.findViewById(R.id.tv_privacy_settings_wizard_welcome)).setTypeface(aVar.t());
        ((RelativeLayout) relativeLayout.findViewById(R.id.rl_privacy_settings_wizard_welcome)).setOnClickListener(new View.OnClickListener() { // from class: A4.V0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.B6(MainActivity.this, view);
            }
        });
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_accept_wizard_welcome);
        textView2.setTypeface(aVar.t());
        textView2.setEnabled(false);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: A4.W0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.C6(MainActivity.this, view);
            }
        });
        if (t2()) {
            textView2.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_wizard_accept_button));
            textView2.setEnabled(true);
        }
        return relativeLayout;
    }

    private final void z7() {
        String I8 = SettingsPreferences.f29309b.I(this);
        if (I8 == null) {
            I8 = "https://uptodown-android.uptodown.com/android";
        }
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(I8)));
    }

    public final void A5() {
        R6();
        if (!Y5()) {
            Z5();
        }
    }

    public final void B7(String str) {
        if (F5() instanceof C1422b) {
            Fragment F52 = F5();
            AbstractC3159y.g(F52, "null cannot be cast to non-null type com.uptodown.fragments.AlternativesFragment");
            ((C1422b) F52).y(str);
        }
    }

    public final Object C7(String str, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.c(), new F(str, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6474a;
    }

    public final Object D7(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.c(), new G(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6474a;
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a
    public void E2(C1498h appInfo) {
        AbstractC3159y.i(appInfo, "appInfo");
        super.E2(appInfo);
        if (this.f28415p0 != null && this.f28411X == 0 && this.f28413Y.size() == 1 && ((V) this.f28413Y.get(this.f28411X)).a() == 1) {
            g6(appInfo);
            q5();
        }
    }

    public final ActivityResultLauncher E5() {
        return this.f28405S0;
    }

    public final void E7(int i8, C1505o c1505o) {
        Fragment F52 = F5();
        if (F52 instanceof L0) {
            runOnUiThread(new L0.RunnableC1397e(i8, c1505o));
        } else if (F52 instanceof F1) {
            ((F1) F52).S0();
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a
    public void F2() {
        if (this.f28415p0 != null && this.f28411X == 0 && this.f28413Y.size() == 1 && ((V) this.f28413Y.get(this.f28411X)).a() == 1) {
            M7();
            x6();
        }
    }

    public final Fragment F5() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            List<Fragment> fragments = getSupportFragmentManager().getFragments();
            AbstractC3159y.h(fragments, "supportFragmentManager.fragments");
            return (Fragment) AbstractC1246t.y0(fragments);
        }
        if (!this.f28392F0.isEmpty()) {
            return (Fragment) AbstractC1246t.y0(this.f28392F0);
        }
        return null;
    }

    public final void F7(int i8, O o8) {
        Fragment F52 = F5();
        if (o8 != null && (F52 instanceof L0)) {
            runOnUiThread(new L0.RunnableC1394b(i8, o8));
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a
    public void G2(long j8) {
        O5();
        if (j8 > 0) {
            if (this.f28394H0 == -1) {
                this.f28394H0 = j8;
                new S4.i(this, j8, new s(), LifecycleOwnerKt.getLifecycleScope(this));
                return;
            }
            return;
        }
        I2();
    }

    public final void G7(String str) {
        if (F5() instanceof S0) {
            Fragment F52 = F5();
            AbstractC3159y.g(F52, "null cannot be cast to non-null type com.uptodown.fragments.HomeFragment");
            ((S0) F52).C(str);
        } else {
            S0 s02 = this.f28390D0;
            if (s02 != null) {
                AbstractC3159y.f(s02);
                s02.C(str);
            }
        }
    }

    public final RelativeLayout H5() {
        return this.f28424y0;
    }

    public final void I7() {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new I(null), 3, null);
    }

    public final void J7(String str) {
        if (F5() instanceof T0) {
            Fragment F52 = F5();
            AbstractC3159y.g(F52, "null cannot be cast to non-null type com.uptodown.fragments.ParentCategoryFragment");
            ((T0) F52).t(str);
        } else {
            T0 t02 = this.f28388B0;
            if (t02 != null) {
                AbstractC3159y.f(t02);
                t02.t(str);
            }
        }
    }

    public final void K7(String str) {
        if (F5() instanceof V0) {
            Fragment F52 = F5();
            AbstractC3159y.g(F52, "null cannot be cast to non-null type com.uptodown.fragments.TopByCategoryFragment");
            ((V0) F52).I(str);
        } else {
            V0 v02 = this.f28389C0;
            if (v02 != null) {
                AbstractC3159y.f(v02);
                v02.I(str);
            }
        }
    }

    public final void M6() {
        TabLayout tabLayout;
        TabLayout tabLayout2;
        RelativeLayout relativeLayout;
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStackImmediate((String) null, 1);
        }
        RelativeLayout relativeLayout2 = this.f28424y0;
        if (relativeLayout2 != null && relativeLayout2.getVisibility() == 0 && (relativeLayout = this.f28424y0) != null) {
            relativeLayout.setVisibility(8);
        }
        r7();
        TabLayout tabLayout3 = this.f28387A0;
        if (((tabLayout3 != null && tabLayout3.getSelectedTabPosition() == 1) || ((tabLayout = this.f28387A0) != null && tabLayout.getSelectedTabPosition() == 0)) && (tabLayout2 = this.f28420u0) != null) {
            tabLayout2.setVisibility(0);
        }
    }

    public final void O7(C1495e alternatives) {
        AbstractC3159y.i(alternatives, "alternatives");
        O5();
        L5();
        C1422b a8 = C1422b.f11596f.a(alternatives);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        AbstractC3159y.h(beginTransaction, "supportFragmentManager.beginTransaction()");
        if (((CoordinatorLayout) findViewById(R.id.rl_main_scrollable)) != null) {
            try {
                beginTransaction.setCustomAnimations(R.anim.slide_next_in, R.anim.slide_back_out);
                beginTransaction.add(R.id.rl_main_scrollable, a8);
                beginTransaction.addToBackStack(alternatives.c());
                if (F5() instanceof V0) {
                    beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                }
                if (!isFinishing() && !getSupportFragmentManager().isDestroyed()) {
                    try {
                        beginTransaction.commitAllowingStateLoss();
                        return;
                    } catch (Exception e8) {
                        e8.printStackTrace();
                        String string = getString(R.string.error_generico);
                        AbstractC3159y.h(string, "getString(R.string.error_generico)");
                        e2(string);
                        return;
                    }
                }
                return;
            } catch (Exception e9) {
                e9.printStackTrace();
                String string2 = getString(R.string.error_generico);
                AbstractC3159y.h(string2, "getString(R.string.error_generico)");
                e2(string2);
                return;
            }
        }
        String string3 = getString(R.string.error_generico);
        AbstractC3159y.h(string3, "getString(R.string.error_generico)");
        e2(string3);
    }

    public final void P6() {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new t(null), 2, null);
    }

    public final void P7(C1498h appInfo, int i8) {
        AbstractC3159y.i(appInfo, "appInfo");
        Fragment F52 = F5();
        RelativeLayout relativeLayout = this.f28424y0;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: A4.N0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.Q7(view);
                }
            });
        }
        RelativeLayout relativeLayout2 = this.f28424y0;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(0);
        }
        if (F52 instanceof L0) {
            C1498h I32 = ((L0) F52).I3();
            if (I32 == null || I32.i() != appInfo.i()) {
                r5(appInfo, true, i8);
            }
        } else {
            r5(appInfo, false, i8);
        }
        M5();
    }

    public final void Q6() {
        O6();
        if (!X5()) {
            S6();
            R6();
            C2();
            I7();
        }
    }

    public final void R7(C1501k category) {
        AbstractC3159y.i(category, "category");
        O5();
        L5();
        V0 a8 = V0.f11510i.a(category);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        AbstractC3159y.h(beginTransaction, "supportFragmentManager.beginTransaction()");
        if (((CoordinatorLayout) findViewById(R.id.rl_main_scrollable)) != null) {
            try {
                beginTransaction.setCustomAnimations(R.anim.slide_next_in, R.anim.slide_back_out);
                beginTransaction.add(R.id.rl_main_scrollable, a8);
                beginTransaction.addToBackStack(a8.x().f());
                if (F5() instanceof V0) {
                    beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                }
                if (!isFinishing() && !getSupportFragmentManager().isDestroyed()) {
                    try {
                        beginTransaction.commitAllowingStateLoss();
                        return;
                    } catch (Exception e8) {
                        e8.printStackTrace();
                        String string = getString(R.string.error_generico);
                        AbstractC3159y.h(string, "getString(R.string.error_generico)");
                        e2(string);
                        return;
                    }
                }
                return;
            } catch (Exception e9) {
                e9.printStackTrace();
                String string2 = getString(R.string.error_generico);
                AbstractC3159y.h(string2, "getString(R.string.error_generico)");
                e2(string2);
                return;
            }
        }
        String string3 = getString(R.string.error_generico);
        AbstractC3159y.h(string3, "getString(R.string.error_generico)");
        e2(string3);
    }

    public final void S7() {
        S0 s02 = this.f28390D0;
        if (s02 != null) {
            AbstractC3159y.f(s02);
            T7(s02);
        } else {
            S0 s03 = new S0();
            this.f28390D0 = s03;
            AbstractC3159y.f(s03);
            T7(s03);
        }
    }

    public final boolean U5() {
        RelativeLayout relativeLayout = this.f28423x0;
        if (relativeLayout != null) {
            AbstractC3159y.f(relativeLayout);
            if (relativeLayout.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void U7(C1501k parentCategory) {
        T0 t02;
        AbstractC3159y.i(parentCategory, "parentCategory");
        if (parentCategory.c() == 523) {
            s5(1);
            return;
        }
        this.f28392F0 = new ArrayList();
        TabLayout tabLayout = this.f28420u0;
        AbstractC3159y.f(tabLayout);
        int tabCount = tabLayout.getTabCount();
        int i8 = 1;
        while (true) {
            t02 = null;
            Object obj = null;
            if (i8 >= tabCount) {
                break;
            }
            TabLayout tabLayout2 = this.f28420u0;
            AbstractC3159y.f(tabLayout2);
            TabLayout.Tab tabAt = tabLayout2.getTabAt(i8);
            if (tabAt != null) {
                obj = tabAt.getTag();
            }
            AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.Category");
            if (((C1501k) obj).c() == parentCategory.c()) {
                TabLayout tabLayout3 = this.f28420u0;
                AbstractC3159y.f(tabLayout3);
                TabLayout tabLayout4 = this.f28420u0;
                AbstractC3159y.f(tabLayout4);
                tabLayout3.selectTab(tabLayout4.getTabAt(i8));
            }
            i8++;
        }
        Iterator it = this.f28393G0.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T0 t03 = (T0) it.next();
            if (t03.r() != null) {
                C1501k r8 = t03.r();
                AbstractC3159y.f(r8);
                if (r8.c() == parentCategory.c()) {
                    t02 = t03;
                    break;
                }
            }
        }
        if (t02 == null) {
            t02 = T0.f11482n.a(parentCategory);
            this.f28393G0.add(t02);
        }
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        AbstractC3159y.h(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.replace(R.id.fl_home_fragment, t02);
        if (this.f28392F0.size() < 1) {
            this.f28392F0.add(t02);
        }
        if (!isFinishing() && !getSupportFragmentManager().isDestroyed()) {
            try {
                beginTransaction.commitAllowingStateLoss();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        s5(0);
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a
    public void W2(long j8) {
        SettingsPreferences.f29309b.x0(this, String.valueOf(j8));
        Bitmap A72 = A7();
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_wizard);
        this.f28415p0 = relativeLayout;
        AbstractC3159y.f(relativeLayout);
        relativeLayout.setVisibility(0);
        RelativeLayout relativeLayout2 = this.f28415p0;
        AbstractC3159y.f(relativeLayout2);
        relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: A4.O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.j7(view);
            }
        });
        RelativeLayout relativeLayout3 = this.f28415p0;
        AbstractC3159y.f(relativeLayout3);
        relativeLayout3.removeAllViews();
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_kill, (ViewGroup) this.f28415p0, false);
        AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout4 = (RelativeLayout) inflate;
        TextView textView = (TextView) relativeLayout4.findViewById(R.id.tv_title_wizard_kill);
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        TextView textView2 = (TextView) relativeLayout4.findViewById(R.id.tv_slogan_to_wizard_kill);
        textView2.setTypeface(aVar.u());
        textView2.setText(getString(R.string.core_kill_this_app, getString(R.string.app_name)));
        ((TextView) relativeLayout4.findViewById(R.id.tv_slide_wizard_kill)).setTypeface(aVar.t());
        TextView textView3 = (TextView) relativeLayout4.findViewById(R.id.tv_accept_wizard_kill);
        textView3.setTypeface(aVar.u());
        textView3.setEnabled(true);
        textView3.setOnClickListener(new View.OnClickListener() { // from class: A4.P0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.k7(MainActivity.this, view);
            }
        });
        RelativeLayout relativeLayout5 = this.f28415p0;
        AbstractC3159y.f(relativeLayout5);
        relativeLayout5.addView(relativeLayout4);
        ImageView imageView = (ImageView) relativeLayout4.findViewById(R.id.iv_tap_screen_kill);
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_up_tap);
        loadAnimation.setStartOffset(500L);
        loadAnimation.setFillAfter(true);
        ImageView imageView2 = (ImageView) relativeLayout4.findViewById(R.id.iv_screenshot_kill);
        imageView2.setImageBitmap(A72);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this, R.anim.slide_up_out);
        loadAnimation2.setFillAfter(true);
        loadAnimation2.setStartOffset(500L);
        loadAnimation2.setAnimationListener(new y(imageView, loadAnimation, imageView2));
        imageView.startAnimation(loadAnimation);
        imageView2.startAnimation(loadAnimation2);
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a
    public void Y2(C1498h appInfo) {
        AbstractC3159y.i(appInfo, "appInfo");
        P7(appInfo, -1);
    }

    @Override // F4.r
    public void a0() {
        super.a0();
        SwitchCompat switchCompat = this.f28419t0;
        if (switchCompat != null) {
            switchCompat.setChecked(false);
        }
        L7();
    }

    public final void a7(final C1498h appInfo, final Function0 updateCard) {
        AbstractC3159y.i(appInfo, "appInfo");
        AbstractC3159y.i(updateCard, "updateCard");
        RelativeLayout relativeLayout = this.f28402P0;
        if (relativeLayout != null) {
            C3608f c3608f = this.f28401O0;
            AbstractC3159y.f(relativeLayout);
            c3608f.H(appInfo, this, relativeLayout);
            this.f28401O0.m().setOnClickListener(new View.OnClickListener() { // from class: A4.a1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.b7(MainActivity.this, appInfo, view);
                }
            });
            this.f28401O0.s().setOnClickListener(new View.OnClickListener() { // from class: A4.b1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.c7(MainActivity.this, appInfo, view);
                }
            });
            this.f28401O0.q().setOnClickListener(new View.OnClickListener() { // from class: A4.d1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.d7(MainActivity.this, appInfo, updateCard, view);
                }
            });
            RelativeLayout relativeLayout2 = this.f28402P0;
            AbstractC3159y.f(relativeLayout2);
            if (relativeLayout2.getVisibility() != 0) {
                RelativeLayout relativeLayout3 = this.f28402P0;
                AbstractC3159y.f(relativeLayout3);
                relativeLayout3.setVisibility(0);
                if (SettingsPreferences.f29309b.N(this) && !UptodownApp.f27990B.S()) {
                    this.f28401O0.p().startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_in_bottom));
                }
                this.f28401O0.p().setVisibility(0);
            }
            this.f28401O0.p().setVisibility(0);
        }
    }

    @Override // F4.r
    public void b0() {
        super.b0();
        SwitchCompat switchCompat = this.f28419t0;
        if (switchCompat != null) {
            switchCompat.setChecked(true);
        }
        L7();
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.r
    public void f0() {
        super.f0();
        h2();
    }

    @Override // F4.r
    public void g0() {
        super.g0();
        h2();
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.r
    public void h0() {
        super.h0();
        W1();
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    protected void h3() {
    }

    @Override // F4.r
    public void i0() {
        super.i0();
        W1();
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    public X4.Q j3() {
        String str;
        X4.Q e8 = X4.Q.f12424k.e(this);
        if (e8 != null) {
            str = e8.getId();
        } else {
            str = null;
        }
        if (str == null || !e8.z(this)) {
            return null;
        }
        return e8;
    }

    @Override // F4.r
    public void l0() {
        SwitchCompat switchCompat = this.f28418s0;
        if (switchCompat != null) {
            switchCompat.setChecked(X());
        }
        L7();
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e, com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        String str;
        long j8;
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.main);
        this.f28396J0 = (FrameLayout) findViewById(R.id.fl_sign_in_popup);
        this.f28398L0 = (FrameLayout) findViewById(R.id.fl_uptodown_turbo_popup);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_splash);
        this.f28409W = relativeLayout;
        AbstractC3159y.f(relativeLayout);
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: A4.G0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.E6(view);
            }
        });
        this.f28399M0 = (FrameLayout) findViewById(R.id.fl_banner_floating);
        this.f28402P0 = (RelativeLayout) findViewById(R.id.app_info_selected_popup);
        UptodownApp.a aVar = UptodownApp.f27990B;
        if (aVar.L()) {
            RelativeLayout relativeLayout2 = this.f28409W;
            AbstractC3159y.f(relativeLayout2);
            relativeLayout2.setVisibility(8);
            aVar.q0(false);
        }
        this.f28415p0 = (RelativeLayout) findViewById(R.id.rl_wizard);
        x2();
        this.f28416q0 = (Toolbar) findViewById(R.id.toolbar_main);
        this.f28417r0 = (AppBarLayout) findViewById(R.id.abl_toolbar);
        this.f28420u0 = (TabLayout) findViewById(R.id.tab_parent_categories);
        ((ImageView) findViewById(R.id.home_uptodown_logo)).setOnClickListener(new View.OnClickListener() { // from class: A4.R0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.F6(MainActivity.this, view);
            }
        });
        RelativeLayout relativeLayout3 = (RelativeLayout) findViewById(R.id.rl_main_search_view);
        ((TextView) findViewById(R.id.tv_main_search_view)).setTypeface(E4.j.f2272g.u());
        relativeLayout3.setOnClickListener(new View.OnClickListener() { // from class: A4.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.G6(MainActivity.this, view);
            }
        });
        ((ImageView) findViewById(R.id.home_uptodown_turbo)).setOnClickListener(new View.OnClickListener() { // from class: A4.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.H6(MainActivity.this, view);
            }
        });
        String str2 = null;
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new r(null), 3, null);
        P5();
        runOnUiThread(new Runnable() { // from class: A4.f1
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.I6(MainActivity.this);
            }
        });
        UptodownApp.a.N0(aVar, this, false, false, 6, null);
        if (!SettingsPreferences.f29309b.X(this)) {
            Context applicationContext = getApplicationContext();
            AbstractC3159y.h(applicationContext, "applicationContext");
            new S4.n(applicationContext);
        }
        if (getIntent() != null) {
            Intent intent = getIntent();
            AbstractC3159y.h(intent, "intent");
            if (!V7(intent)) {
                Uri data = getIntent().getData();
                if (data != null) {
                    String uri = data.toString();
                    AbstractC3159y.h(uri, "uri.toString()");
                    String j9 = new N4.f().j(data, this);
                    if (j9 != null && g6.n.r(j9, ".apk", false, 2, null)) {
                        String i8 = new C3329q().i(j9);
                        if (i8 != null) {
                            H2(i8, null);
                        } else {
                            Intent intent2 = new Intent(getApplicationContext(), (Class<?>) InstallerActivity.class);
                            intent2.setData(data);
                            this.f28412X0.launch(intent2);
                        }
                    } else if (j9 != null && N4.w.f7268b.a(j9)) {
                        Intent intent3 = new Intent(getApplicationContext(), (Class<?>) InstallerActivity.class);
                        intent3.setData(data);
                        startActivity(intent3);
                    } else if (g6.n.C(uri, "https://dw.uptodown.com/dwn/", false, 2, null)) {
                        DownloadApkWorker.a aVar2 = DownloadApkWorker.f29987k;
                        Context applicationContext2 = getApplicationContext();
                        AbstractC3159y.h(applicationContext2, "applicationContext");
                        aVar2.g(applicationContext2, uri);
                        startActivity(new Intent(this, (Class<?>) MyDownloads.class));
                    } else if (!aVar.U(this)) {
                        new S4.j(this, new C3323k().l(data), this.f28403Q0, LifecycleOwnerKt.getLifecycleScope(this));
                    }
                }
                Intent intent4 = getIntent();
                if (intent4 != null && (extras = intent4.getExtras()) != null) {
                    str = extras.getString("appId");
                } else {
                    str = null;
                }
                if (str != null) {
                    try {
                        j8 = Long.parseLong(str);
                    } catch (NumberFormatException e8) {
                        e8.printStackTrace();
                        j8 = -1;
                    }
                    long j10 = j8;
                    if (j10 > 0) {
                        Bundle extras2 = getIntent().getExtras();
                        if (extras2 != null) {
                            str2 = extras2.getString("packageName");
                        }
                        X4.x xVar = new X4.x();
                        xVar.j(j10);
                        xVar.m(str2);
                        xVar.n(this);
                        new S4.i(this, j10, this.f28403Q0, LifecycleOwnerKt.getLifecycleScope(this));
                    }
                } else {
                    X4.x b8 = X4.x.f12714f.b(this);
                    if (b8 != null && !b8.g()) {
                        new S4.i(this, b8.b(), this.f28403Q0, LifecycleOwnerKt.getLifecycleScope(this));
                    }
                }
            }
        }
        getOnBackPressedDispatcher().addCallback(this, this.f28410W0);
        ViewPager2 viewPager2 = (ViewPager2) findViewById(R.id.view_pager);
        this.f28422w0 = viewPager2;
        if (viewPager2 != null) {
            viewPager2.setOffscreenPageLimit(this.f28395I0);
        }
        ViewPager2 viewPager22 = this.f28422w0;
        if (viewPager22 != null) {
            viewPager22.setUserInputEnabled(false);
        }
        this.f28387A0 = (TabLayout) findViewById(R.id.tabs);
        this.f28424y0 = (RelativeLayout) findViewById(R.id.rl_app_detail_open);
        V6();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent event) {
        AbstractC3159y.i(event, "event");
        return super.onKeyDown(i8, event);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!X5()) {
            I7();
            C3335w.f34532a.g(this);
            if (U5()) {
                U6();
            }
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    public void p3() {
        F1 f12;
        if (this.f28415p0 != null) {
            int size = this.f28413Y.size();
            int i8 = this.f28411X;
            if (size > i8 && ((V) this.f28413Y.get(i8)).a() == 5) {
                q5();
                X4.Q j32 = j3();
                if (j32 != null && (f12 = this.f28391E0) != null) {
                    f12.R0(j32);
                }
            }
        }
    }

    public final void s5(int i8) {
        TabLayout tabLayout = this.f28387A0;
        AbstractC3159y.f(tabLayout);
        if (i8 < tabLayout.getTabCount()) {
            TabLayout tabLayout2 = this.f28387A0;
            AbstractC3159y.f(tabLayout2);
            if (tabLayout2.getSelectedTabPosition() != i8) {
                TabLayout tabLayout3 = this.f28387A0;
                AbstractC3159y.f(tabLayout3);
                TabLayout.Tab tabAt = tabLayout3.getTabAt(i8);
                if (tabAt != null) {
                    tabAt.select();
                }
            }
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    protected void t3() {
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    protected void u3() {
    }

    public final void x7() {
        X4.Q e8 = X4.Q.f12424k.e(this);
        if (!isFinishing() && e8 != null && e8.G()) {
            SettingsPreferences.a aVar = SettingsPreferences.f29309b;
            if (!aVar.n0(this)) {
                AlertDialog s22 = s2();
                if (s22 != null) {
                    s22.dismiss();
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                t0 c8 = t0.c(getLayoutInflater());
                AbstractC3159y.h(c8, "inflate(layoutInflater)");
                TextView textView = c8.f10898o;
                j.a aVar2 = E4.j.f2272g;
                textView.setTypeface(aVar2.t());
                String string = getString(R.string.uptodown_turbo);
                AbstractC3159y.h(string, "getString(R.string.uptodown_turbo)");
                int color = ContextCompat.getColor(this, R.color.turbo_text_gradient_start);
                int color2 = ContextCompat.getColor(this, R.color.turbo_text_gradient_end);
                TextView textView2 = c8.f10898o;
                AbstractC3159y.h(textView2, "uptodownTurboWelcomeBind….tvTitleTurboWelcomePopup");
                String obj = textView2.getText().toString();
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, textView2.getPaint().measureText(string), textView2.getHeight(), new int[]{color, color2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                SpannableString spannableString = new SpannableString(obj);
                int S7 = g6.n.S(obj, string, 0, false, 6, null);
                if (S7 >= 0) {
                    spannableString.setSpan(new C3323k.a.C0782a(linearGradient, getResources().getDimension(R.dimen.font_size_26)), S7, string.length() + S7, 33);
                }
                textView2.setText(spannableString);
                Spanned c9 = C3307A.f34459a.c(getString(R.string.turbo_welcome_popup_description, getString(R.string.turbo_welcome_popup_manage_subscription)));
                String string2 = getString(R.string.turbo_welcome_popup_manage_subscription);
                AbstractC3159y.h(string2, "getString(R.string.turbo…opup_manage_subscription)");
                SpannableString spannableString2 = new SpannableString(c9);
                int S8 = g6.n.S(c9, string2, 0, false, 6, null);
                if (S8 >= 0) {
                    spannableString2.setSpan(new StyleSpan(1), S8, string2.length() + S8, 33);
                }
                c8.f10892i.setText(spannableString2);
                c8.f10892i.setTypeface(aVar2.u());
                c8.f10896m.setTypeface(aVar2.t());
                c8.f10895l.setTypeface(aVar2.u());
                c8.f10891h.setTypeface(aVar2.t());
                c8.f10890g.setTypeface(aVar2.u());
                c8.f10894k.setTypeface(aVar2.t());
                c8.f10893j.setTypeface(aVar2.u());
                c8.f10897n.setTypeface(aVar2.t());
                c8.f10897n.setOnClickListener(new View.OnClickListener() { // from class: A4.y0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MainActivity.y7(MainActivity.this, view);
                    }
                });
                builder.setView(c8.getRoot());
                builder.setCancelable(true);
                O2(builder.create());
                if (!isFinishing() && s2() != null) {
                    AlertDialog s23 = s2();
                    AbstractC3159y.f(s23);
                    Window window = s23.getWindow();
                    if (window != null) {
                        window.setBackgroundDrawable(new ColorDrawable(0));
                    }
                    AlertDialog s24 = s2();
                    AbstractC3159y.f(s24);
                    s24.show();
                    aVar.l1(this, true);
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "shown");
                    new C3330r(this).b("turbo_welcome_popup", bundle);
                }
            }
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    protected void q3(X4.Q q8) {
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    protected void s3(X4.Q q8, String str) {
    }
}
