package com.stripe.android.stripe3ds2.views;

import L5.InterfaceC1223g;
import L5.InterfaceC1227k;
import L5.x;
import T3.q;
import X3.v;
import a4.C1557a;
import a4.C1563g;
import a4.C1565i;
import a4.C1569m;
import a4.C1574r;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.stripe3ds2.transaction.a;
import com.stripe.android.stripe3ds2.transaction.b;
import com.stripe.android.stripe3ds2.transaction.h;
import com.stripe.android.stripe3ds2.transaction.q;
import com.stripe.android.stripe3ds2.views.ChallengeActivity;
import com.stripe.android.stripe3ds2.views.ThreeDS2Button;
import com.stripe.android.stripe3ds2.views.b;
import com.stripe.android.stripe3ds2.views.d;
import i6.C2812b0;
import i6.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.InterfaceC3153s;
import kotlin.jvm.internal.T;
import kotlin.jvm.internal.U;

/* loaded from: classes4.dex */
public final class ChallengeActivity extends AppCompatActivity {

    /* renamed from: m, reason: collision with root package name */
    private static final a f26927m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    private static final I f26928n = C2812b0.b();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1227k f26929a = L5.l.b(new q());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1227k f26930b = L5.l.b(new c());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1227k f26931c = L5.l.b(new e());

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1227k f26932d = L5.l.b(new f());

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1227k f26933e = L5.l.b(new s());

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1227k f26934f = L5.l.b(new b());

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1227k f26935g = L5.l.b(new d());

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC1227k f26936h = new ViewModelLazy(U.b(com.stripe.android.stripe3ds2.views.b.class), new o(this), new t(), new p(null, this));

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC1227k f26937i = L5.l.b(new r());

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC1227k f26938j = L5.l.b(new g());

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC1227k f26939k = L5.l.b(new m());

    /* renamed from: l, reason: collision with root package name */
    private Dialog f26940l;

    /* loaded from: classes4.dex */
    private static final class a {
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
        public final b.a invoke() {
            return new b.a(ChallengeActivity.this.K().b(), ChallengeActivity.this.E(), ChallengeActivity.this.K().e(), ChallengeActivity.f26928n);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final U3.a invoke() {
            Context applicationContext = ChallengeActivity.this.getApplicationContext();
            AbstractC3159y.h(applicationContext, "getApplicationContext(...)");
            return new U3.a(applicationContext, new U3.e(ChallengeActivity.this.K().j()), null, null, null, null, null, 0, 252, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.stripe3ds2.transaction.k invoke() {
            return new q.b(ChallengeActivity.f26928n).a(ChallengeActivity.this.K().c().b(), ChallengeActivity.this.E());
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.stripe3ds2.views.c invoke() {
            return (com.stripe.android.stripe3ds2.views.c) ChallengeActivity.this.L().f8208b.getFragment();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Q3.c invoke() {
            return ChallengeActivity.this.G().H();
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3160z implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1574r invoke() {
            return new C1574r(ChallengeActivity.this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends OnBackPressedCallback {
        h() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            ChallengeActivity.this.M().u(a.C0669a.f26785a);
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3160z implements Function1 {
        i() {
            super(1);
        }

        public final void a(com.stripe.android.stripe3ds2.transaction.a aVar) {
            if (!ChallengeActivity.this.isFinishing()) {
                ChallengeActivity.this.C();
                ChallengeActivity challengeActivity = ChallengeActivity.this;
                Dialog a8 = challengeActivity.I().a();
                a8.show();
                challengeActivity.f26940l = a8;
                com.stripe.android.stripe3ds2.views.b M8 = ChallengeActivity.this.M();
                AbstractC3159y.f(aVar);
                M8.u(aVar);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.stripe3ds2.transaction.a) obj);
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends AbstractC3160z implements Function1 {
        j() {
            super(1);
        }

        public final void a(com.stripe.android.stripe3ds2.transaction.h hVar) {
            ChallengeActivity.this.setResult(-1, new Intent().putExtras(hVar.e()));
            if (!ChallengeActivity.this.isFinishing()) {
                ChallengeActivity.this.finish();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.stripe3ds2.transaction.h) obj);
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends AbstractC3160z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f26951b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(T t8) {
            super(1);
            this.f26951b = t8;
        }

        public final void a(Y3.b bVar) {
            String str;
            ChallengeActivity.this.B();
            if (bVar != null) {
                ChallengeActivity.this.N(bVar);
                T t8 = this.f26951b;
                Y3.g b02 = bVar.b0();
                if (b02 != null) {
                    str = b02.b();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                t8.f33747a = str;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Y3.b) obj);
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class l extends AbstractC3160z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f26953b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(T t8) {
            super(1);
            this.f26953b = t8;
        }

        public final void a(Boolean bool) {
            if (AbstractC3159y.d(bool, Boolean.TRUE)) {
                ChallengeActivity.this.M().n(new h.g((String) this.f26953b.f33747a, ChallengeActivity.this.K().f().b0(), ChallengeActivity.this.K().i()));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Boolean) obj);
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class m extends AbstractC3160z implements Function0 {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1565i invoke() {
            ChallengeActivity challengeActivity = ChallengeActivity.this;
            return new C1565i(challengeActivity, challengeActivity.K().n());
        }
    }

    /* loaded from: classes4.dex */
    static final class n implements Observer, InterfaceC3153s {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f26955a;

        n(Function1 function) {
            AbstractC3159y.i(function, "function");
            this.f26955a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC3153s)) {
                return AbstractC3159y.d(getFunctionDelegate(), ((InterfaceC3153s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3153s
        public final InterfaceC1223g getFunctionDelegate() {
            return this.f26955a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f26955a.invoke(obj);
        }
    }

    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26956a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentActivity componentActivity) {
            super(0);
            this.f26956a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f26956a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f26957a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26958b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f26957a = function0;
            this.f26958b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26957a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f26958b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class q extends AbstractC3160z implements Function0 {
        q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X3.j invoke() {
            return new X3.j(ChallengeActivity.this.K().k(), ChallengeActivity.this.F(), ChallengeActivity.this.K().b());
        }
    }

    /* loaded from: classes4.dex */
    static final class r extends AbstractC3160z implements Function0 {
        r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.stripe3ds2.views.d invoke() {
            d.a aVar = com.stripe.android.stripe3ds2.views.d.f27076h;
            Bundle extras = ChallengeActivity.this.getIntent().getExtras();
            if (extras == null) {
                extras = Bundle.EMPTY;
            }
            AbstractC3159y.f(extras);
            return aVar.a(extras);
        }
    }

    /* loaded from: classes4.dex */
    static final class s extends AbstractC3160z implements Function0 {
        s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Q3.b invoke() {
            Q3.b c8 = Q3.b.c(ChallengeActivity.this.getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(...)");
            return c8;
        }
    }

    /* loaded from: classes4.dex */
    static final class t extends AbstractC3160z implements Function0 {
        t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return new b.C0682b(ChallengeActivity.this.D(), ChallengeActivity.this.J(), ChallengeActivity.this.E(), ChallengeActivity.f26928n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(ThreeDS2Button threeDS2Button, ChallengeActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        threeDS2Button.setClickable(false);
        this$0.M().u(a.C0669a.f26785a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        Dialog dialog = this.f26940l;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        this.f26940l = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        H().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.stripe3ds2.transaction.b D() {
        return (com.stripe.android.stripe3ds2.transaction.b) this.f26934f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final U3.c E() {
        return (U3.c) this.f26930b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.stripe3ds2.transaction.k F() {
        return (com.stripe.android.stripe3ds2.transaction.k) this.f26935g.getValue();
    }

    private final C1574r H() {
        return (C1574r) this.f26938j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1565i I() {
        return (C1565i) this.f26939k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v J() {
        return (v) this.f26929a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.stripe3ds2.views.d K() {
        return (com.stripe.android.stripe3ds2.views.d) this.f26937i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(Y3.b bVar) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        AbstractC3159y.h(supportFragmentManager, "getSupportFragmentManager(...)");
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        AbstractC3159y.h(beginTransaction, "beginTransaction()");
        C1557a c1557a = C1557a.f13492a;
        beginTransaction.setCustomAnimations(c1557a.a(), c1557a.b(), c1557a.a(), c1557a.b());
        beginTransaction.replace(L().f8208b.getId(), com.stripe.android.stripe3ds2.views.c.class, BundleKt.bundleOf(x.a("arg_cres", bVar)));
        beginTransaction.commit();
    }

    private final void z() {
        final ThreeDS2Button a8 = new C1569m(this).a(K().n().i(), K().n().b(q.a.CANCEL));
        if (a8 != null) {
            a8.setOnClickListener(new View.OnClickListener() { // from class: a4.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChallengeActivity.A(ThreeDS2Button.this, this, view);
                }
            });
        }
    }

    public final com.stripe.android.stripe3ds2.views.c G() {
        return (com.stripe.android.stripe3ds2.views.c) this.f26931c.getValue();
    }

    public final Q3.b L() {
        return (Q3.b) this.f26933e.getValue();
    }

    public final com.stripe.android.stripe3ds2.views.b M() {
        return (com.stripe.android.stripe3ds2.views.b) this.f26936h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getSupportFragmentManager().setFragmentFactory(new C1563g(K().n(), J(), F(), E(), D(), K().f().b0(), K().i(), f26928n));
        super.onCreate(bundle);
        getOnBackPressedDispatcher().addCallback(new h());
        getWindow().setFlags(8192, 8192);
        setContentView(L().getRoot());
        M().l().observe(this, new n(new i()));
        M().j().observe(this, new n(new j()));
        z();
        T t8 = new T();
        t8.f33747a = "";
        M().h().observe(this, new n(new k(t8)));
        if (bundle == null) {
            M().p(K().f());
        }
        M().m().observe(this, new n(new l(t8)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        B();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        M().o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        M().s(true);
        C();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (M().k()) {
            M().q();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i8) {
        super.onTrimMemory(i8);
        M().o();
    }
}
