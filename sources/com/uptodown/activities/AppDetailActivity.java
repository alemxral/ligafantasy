package com.uptodown.activities;

import M5.AbstractC1246t;
import U4.C1422b;
import U4.L0;
import U4.V0;
import X4.C1495e;
import X4.C1498h;
import X4.C1501k;
import X4.C1505o;
import X4.O;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import i6.AbstractC2825i;
import i6.C2812b0;
import i6.M;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3326n;
import p5.C3608f;

/* loaded from: classes4.dex */
public final class AppDetailActivity extends AbstractActivityC2489a {

    /* renamed from: V, reason: collision with root package name */
    public static final a f28080V = new a(null);

    /* renamed from: O, reason: collision with root package name */
    private ArrayList f28081O = new ArrayList();

    /* renamed from: P, reason: collision with root package name */
    private ArrayList f28082P = new ArrayList();

    /* renamed from: Q, reason: collision with root package name */
    private ArrayList f28083Q = new ArrayList();

    /* renamed from: R, reason: collision with root package name */
    private final C3608f f28084R = new C3608f();

    /* renamed from: S, reason: collision with root package name */
    private RelativeLayout f28085S;

    /* renamed from: T, reason: collision with root package name */
    private final ActivityResultLauncher f28086T;

    /* renamed from: U, reason: collision with root package name */
    private final e f28087U;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f28088a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28089b;

        public b(int i8, String str) {
            this.f28088a = i8;
            this.f28089b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            L0 n32;
            String str;
            if (this.f28089b != null && (n32 = AppDetailActivity.this.n3()) != null && n32.isResumed()) {
                C1498h I32 = n32.I3();
                if (I32 != null) {
                    str = I32.y0();
                } else {
                    str = null;
                }
                if (g6.n.t(str, this.f28089b, false, 2, null)) {
                    C3326n.a aVar = C3326n.f34490t;
                    Context baseContext = AppDetailActivity.this.getBaseContext();
                    AbstractC3159y.h(baseContext, "baseContext");
                    C3326n a8 = aVar.a(baseContext);
                    a8.a();
                    O u02 = a8.u0(this.f28089b);
                    a8.g();
                    if (u02 != null) {
                        AppDetailActivity.this.runOnUiThread(new L0.RunnableC1394b(this.f28088a, u02));
                    }
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final String f28091a;

        /* renamed from: b, reason: collision with root package name */
        private final int f28092b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AppDetailActivity f28093c;

        public c(AppDetailActivity appDetailActivity, String packagename, int i8) {
            AbstractC3159y.i(packagename, "packagename");
            this.f28093c = appDetailActivity;
            this.f28091a = packagename;
            this.f28092b = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<Fragment> fragments = this.f28093c.getSupportFragmentManager().getFragments();
            AbstractC3159y.h(fragments, "supportFragmentManager.fragments");
            Fragment fragment = (Fragment) AbstractC1246t.y0(fragments);
            if (fragment != null && (fragment instanceof L0)) {
                new L0.RunnableC1395c((L0) fragment, this.f28091a, this.f28092b);
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f28094a;

        /* renamed from: b, reason: collision with root package name */
        private final C1505o f28095b;

        public d(int i8, C1505o c1505o) {
            this.f28094a = i8;
            this.f28095b = c1505o;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            L0 n32 = AppDetailActivity.this.n3();
            if (n32 != null && n32.isResumed()) {
                AppDetailActivity.this.runOnUiThread(new L0.RunnableC1397e(this.f28094a, this.f28095b));
            }
            String str2 = null;
            if (AppDetailActivity.this.o3() != null) {
                V0 o32 = AppDetailActivity.this.o3();
                AbstractC3159y.f(o32);
                C1505o c1505o = this.f28095b;
                if (c1505o != null) {
                    str = c1505o.Y();
                } else {
                    str = null;
                }
                o32.I(str);
            }
            if (AppDetailActivity.this.m3() != null) {
                C1422b m32 = AppDetailActivity.this.m3();
                AbstractC3159y.f(m32);
                C1505o c1505o2 = this.f28095b;
                if (c1505o2 != null) {
                    str2 = c1505o2.Y();
                }
                m32.y(str2);
            }
            if (this.f28095b != null) {
                AppDetailActivity.this.k3().W(this.f28095b, AppDetailActivity.this.l3(), this.f28094a, AppDetailActivity.this);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends OnBackPressedCallback {
        e() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            RelativeLayout l32 = AppDetailActivity.this.l3();
            if (l32 != null && l32.getVisibility() == 0) {
                C3608f k32 = AppDetailActivity.this.k3();
                AppDetailActivity appDetailActivity = AppDetailActivity.this;
                RelativeLayout l33 = appDetailActivity.l3();
                AbstractC3159y.f(l33);
                k32.f(appDetailActivity, l33);
                return;
            }
            Log.d("utd_debug", "topByCategoryFragmentStack.size: " + AppDetailActivity.this.f28082P.size() + " appDetailsFragmentStack.size: " + AppDetailActivity.this.f28081O.size());
            if (AppDetailActivity.this.f28082P.size() > 0) {
                AppDetailActivity.this.f28082P.remove(AbstractC1246t.o(AppDetailActivity.this.f28082P));
                AppDetailActivity.this.getSupportFragmentManager().popBackStackImmediate();
                return;
            }
            if (AppDetailActivity.this.f28083Q.size() > 0) {
                AppDetailActivity.this.f28083Q.remove(AbstractC1246t.o(AppDetailActivity.this.f28083Q));
                AppDetailActivity.this.getSupportFragmentManager().popBackStackImmediate();
            } else {
                if (AppDetailActivity.this.f28081O.size() > 0) {
                    AppDetailActivity.this.f28081O.remove(AbstractC1246t.o(AppDetailActivity.this.f28081O));
                    AppDetailActivity.this.getSupportFragmentManager().popBackStackImmediate();
                    if (AppDetailActivity.this.f28081O.size() == 0) {
                        AppDetailActivity.this.finish();
                        return;
                    }
                    return;
                }
                AppDetailActivity.this.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28098a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28100c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, P5.d dVar) {
            super(2, dVar);
            this.f28100c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f28100c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28098a == 0) {
                L5.t.b(obj);
                L0 n32 = AppDetailActivity.this.n3();
                if (n32 != null && n32.isResumed()) {
                    n32.Q6(this.f28100c);
                    n32.O6(this.f28100c);
                }
                if (!AppDetailActivity.this.f28082P.isEmpty()) {
                    ((V0) AbstractC1246t.y0(AppDetailActivity.this.f28082P)).I(this.f28100c);
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28101a;

        g(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28101a == 0) {
                L5.t.b(obj);
                L0 n32 = AppDetailActivity.this.n3();
                if (n32 != null && n32.isResumed()) {
                    AppDetailActivity.this.runOnUiThread(new L0.RunnableC1396d());
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public AppDetailActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: A4.b
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                AppDetailActivity.j3(AppDetailActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResul…Activity)\n        }\n    }");
        this.f28086T = registerForActivityResult;
        this.f28087U = new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j3(AppDetailActivity this$0, ActivityResult activityResult) {
        AbstractC3159y.i(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            UptodownApp.a.N0(UptodownApp.f27990B, this$0, false, false, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1422b m3() {
        if (this.f28083Q.size() > 0) {
            return (C1422b) AbstractC1246t.y0(this.f28083Q);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final L0 n3() {
        if (this.f28081O.size() > 0) {
            return (L0) AbstractC1246t.y0(this.f28081O);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V0 o3() {
        if (this.f28082P.size() > 0) {
            return (V0) AbstractC1246t.y0(this.f28082P);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t3(AppDetailActivity this$0, C1498h appInfo, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(appInfo, "$appInfo");
        RelativeLayout relativeLayout = this$0.f28085S;
        AbstractC3159y.f(relativeLayout);
        relativeLayout.setVisibility(8);
        this$0.f28084R.E(0L);
        this$0.Y2(appInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(AppDetailActivity this$0, C1498h appInfo, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(appInfo, "$appInfo");
        RelativeLayout relativeLayout = this$0.f28085S;
        AbstractC3159y.f(relativeLayout);
        relativeLayout.setVisibility(8);
        this$0.f28084R.E(0L);
        this$0.Y2(appInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(AppDetailActivity this$0, C1498h appInfo, Function0 updateCard, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(appInfo, "$appInfo");
        AbstractC3159y.i(updateCard, "$updateCard");
        this$0.f28084R.g(appInfo, this$0);
        C3608f c3608f = this$0.f28084R;
        RelativeLayout relativeLayout = this$0.f28085S;
        AbstractC3159y.f(relativeLayout);
        c3608f.f(this$0, relativeLayout);
        updateCard.invoke();
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a
    public void Y2(C1498h appInfo) {
        AbstractC3159y.i(appInfo, "appInfo");
        L0 a8 = L0.f11173K.a(appInfo, appInfo.i());
        getSupportFragmentManager().beginTransaction().add(R.id.content, a8, (String) null).addToBackStack(String.valueOf(appInfo.i())).commit();
        this.f28081O.add(a8);
    }

    public final C3608f k3() {
        return this.f28084R;
    }

    public final RelativeLayout l3() {
        return this.f28085S;
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        C1498h c1498h;
        Bundle extras;
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        long j8 = -1;
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (extras.containsKey("appId")) {
                j8 = extras.getLong("appId");
            }
            if (extras.containsKey("appInfo")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = extras.getParcelable("appInfo", C1498h.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = extras.getParcelable("appInfo");
                }
                c1498h = (C1498h) parcelable;
                if (c1498h != null) {
                    j8 = c1498h.i();
                }
                L0 a8 = L0.f11173K.a(c1498h, j8);
                getSupportFragmentManager().beginTransaction().add(R.id.content, a8, (String) null).commit();
                getOnBackPressedDispatcher().addCallback(this, this.f28087U);
                this.f28081O.add(a8);
            }
        }
        c1498h = null;
        L0 a82 = L0.f11173K.a(c1498h, j8);
        getSupportFragmentManager().beginTransaction().add(R.id.content, a82, (String) null).commit();
        getOnBackPressedDispatcher().addCallback(this, this.f28087U);
        this.f28081O.add(a82);
    }

    public final ActivityResultLauncher p3() {
        return this.f28086T;
    }

    public final void q3() {
        L0 n32 = n3();
        if (n32 != null) {
            n32.O5();
        }
    }

    public final void r3(RelativeLayout relativeLayout) {
        this.f28085S = relativeLayout;
    }

    public final void s3(final C1498h appInfo, final Function0 updateCard) {
        AbstractC3159y.i(appInfo, "appInfo");
        AbstractC3159y.i(updateCard, "updateCard");
        RelativeLayout relativeLayout = this.f28085S;
        if (relativeLayout != null) {
            C3608f c3608f = this.f28084R;
            AbstractC3159y.f(relativeLayout);
            c3608f.H(appInfo, this, relativeLayout);
            this.f28084R.m().setOnClickListener(new View.OnClickListener() { // from class: A4.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppDetailActivity.t3(AppDetailActivity.this, appInfo, view);
                }
            });
            this.f28084R.s().setOnClickListener(new View.OnClickListener() { // from class: A4.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppDetailActivity.u3(AppDetailActivity.this, appInfo, view);
                }
            });
            this.f28084R.q().setOnClickListener(new View.OnClickListener() { // from class: A4.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppDetailActivity.v3(AppDetailActivity.this, appInfo, updateCard, view);
                }
            });
            RelativeLayout relativeLayout2 = this.f28085S;
            AbstractC3159y.f(relativeLayout2);
            if (relativeLayout2.getVisibility() != 0) {
                RelativeLayout relativeLayout3 = this.f28085S;
                AbstractC3159y.f(relativeLayout3);
                relativeLayout3.setVisibility(0);
                if (SettingsPreferences.f29309b.N(this) && !UptodownApp.f27990B.S()) {
                    this.f28084R.p().startAnimation(AnimationUtils.loadAnimation(this, com.uptodown.R.anim.slide_in_bottom));
                }
                this.f28084R.p().setVisibility(0);
            }
            this.f28084R.p().setVisibility(0);
        }
    }

    public final Object w3(String str, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.c(), new f(str, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6474a;
    }

    public final Object x3(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.c(), new g(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6474a;
    }

    public final void y3(C1495e alternatives) {
        AbstractC3159y.i(alternatives, "alternatives");
        C1422b a8 = C1422b.f11596f.a(alternatives);
        getSupportFragmentManager().beginTransaction().setCustomAnimations(com.uptodown.R.anim.slide_next_in, com.uptodown.R.anim.slide_back_out).add(R.id.content, a8, (String) null).addToBackStack(alternatives.c()).commit();
        this.f28083Q.add(a8);
    }

    public final void z3(C1501k category) {
        AbstractC3159y.i(category, "category");
        V0 a8 = V0.f11510i.a(category);
        getSupportFragmentManager().beginTransaction().setCustomAnimations(com.uptodown.R.anim.slide_next_in, com.uptodown.R.anim.slide_back_out).add(R.id.content, a8, (String) null).addToBackStack(String.valueOf(category.c())).commit();
        this.f28082P.add(a8);
    }
}
