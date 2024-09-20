package com.stripe.android.view;

import L5.C1224h;
import L5.InterfaceC1227k;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.view.C2461n0;
import f3.C2662c;
import i6.AbstractC2829k;
import j2.AbstractC3049A;
import j2.AbstractC3052D;
import k3.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import l6.AbstractC3351M;
import l6.InterfaceC3359g;
import r2.InterfaceC3684d;
import t2.AbstractC3790k;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PaymentAuthWebViewActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1227k f27449a = L5.l.b(new j());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1227k f27450b = L5.l.b(new a());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1227k f27451c = L5.l.b(new b());

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1227k f27452d = new ViewModelLazy(kotlin.jvm.internal.U.b(C2461n0.class), new h(this), new k(), new i(null, this));

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentBrowserAuthContract.a invoke() {
            PaymentBrowserAuthContract.b bVar = PaymentBrowserAuthContract.f23436a;
            Intent intent = PaymentAuthWebViewActivity.this.getIntent();
            AbstractC3159y.h(intent, "getIntent(...)");
            return bVar.a(intent);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3684d invoke() {
            InterfaceC3684d.a aVar = InterfaceC3684d.f37551a;
            PaymentBrowserAuthContract.a x8 = PaymentAuthWebViewActivity.this.x();
            boolean z8 = false;
            if (x8 != null && x8.e()) {
                z8 = true;
            }
            return aVar.a(z8);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function1 {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OnBackPressedCallback) obj);
            return L5.I.f6474a;
        }

        public final void invoke(OnBackPressedCallback addCallback) {
            AbstractC3159y.i(addCallback, "$this$addCallback");
            if (PaymentAuthWebViewActivity.this.v().f3148d.canGoBack()) {
                PaymentAuthWebViewActivity.this.v().f3148d.goBack();
            } else {
                PaymentAuthWebViewActivity.this.r();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f27456a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l6.v f27457b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PaymentAuthWebViewActivity f27458c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentAuthWebViewActivity f27459a;

            a(PaymentAuthWebViewActivity paymentAuthWebViewActivity) {
                this.f27459a = paymentAuthWebViewActivity;
            }

            public final Object b(boolean z8, P5.d dVar) {
                if (z8) {
                    CircularProgressIndicator progressBar = this.f27459a.v().f3146b;
                    AbstractC3159y.h(progressBar, "progressBar");
                    progressBar.setVisibility(8);
                }
                return L5.I.f6474a;
            }

            @Override // l6.InterfaceC3359g
            public /* bridge */ /* synthetic */ Object emit(Object obj, P5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(l6.v vVar, PaymentAuthWebViewActivity paymentAuthWebViewActivity, P5.d dVar) {
            super(2, dVar);
            this.f27457b = vVar;
            this.f27458c = paymentAuthWebViewActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f27457b, this.f27458c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f27456a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                l6.v vVar = this.f27457b;
                a aVar = new a(this.f27458c);
                this.f27456a = 1;
                if (vVar.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2463o0 f27460a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C2463o0 c2463o0) {
            super(0);
            this.f27460a = c2463o0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5559invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5559invoke() {
            this.f27460a.j(true);
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class f extends C3156v implements Function1 {
        f(Object obj) {
            super(1, obj, PaymentAuthWebViewActivity.class, "startActivity", "startActivity(Landroid/content/Intent;)V", 0);
        }

        public final void d(Intent intent) {
            ((PaymentAuthWebViewActivity) this.receiver).startActivity(intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((Intent) obj);
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class g extends C3156v implements Function1 {
        g(Object obj) {
            super(1, obj, PaymentAuthWebViewActivity.class, "onAuthComplete", "onAuthComplete$payments_core_release(Ljava/lang/Throwable;)V", 0);
        }

        public final void d(Throwable th) {
            ((PaymentAuthWebViewActivity) this.receiver).y(th);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((Throwable) obj);
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f27461a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f27461a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f27461a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f27462a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f27463b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f27462a = function0;
            this.f27463b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27462a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f27463b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends AbstractC3160z implements Function0 {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G2.o invoke() {
            G2.o c8 = G2.o.c(PaymentAuthWebViewActivity.this.getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(...)");
            return c8;
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends AbstractC3160z implements Function0 {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            Application application = PaymentAuthWebViewActivity.this.getApplication();
            AbstractC3159y.h(application, "getApplication(...)");
            InterfaceC3684d u8 = PaymentAuthWebViewActivity.this.u();
            PaymentBrowserAuthContract.a x8 = PaymentAuthWebViewActivity.this.x();
            if (x8 != null) {
                return new C2461n0.a(application, u8, x8);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        setResult(-1, w().d());
        finish();
    }

    private final Intent s(C2662c c2662c) {
        Intent putExtras = new Intent().putExtras(c2662c.o());
        AbstractC3159y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    private final void t() {
        u().b("PaymentAuthWebViewActivity#customizeToolbar()");
        C2461n0.b h8 = w().h();
        if (h8 != null) {
            u().b("PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar title");
            v().f3147c.setTitle(Z3.a.f13387a.b(this, h8.a(), h8.b()));
        }
        String g8 = w().g();
        if (g8 != null) {
            u().b("PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar background color");
            int parseColor = Color.parseColor(g8);
            v().f3147c.setBackgroundColor(parseColor);
            Z3.a.f13387a.e(this, parseColor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3684d u() {
        return (InterfaceC3684d) this.f27451c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final G2.o v() {
        return (G2.o) this.f27449a.getValue();
    }

    private final C2461n0 w() {
        return (C2461n0) this.f27452d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentBrowserAuthContract.a x() {
        return (PaymentBrowserAuthContract.a) this.f27450b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaymentBrowserAuthContract.a x8 = x();
        if (x8 == null) {
            setResult(0);
            finish();
            i.a aVar = k3.i.f33380a;
            Context applicationContext = getApplicationContext();
            AbstractC3159y.h(applicationContext, "getApplicationContext(...)");
            i.b.a(i.a.b(aVar, applicationContext, null, 2, null), i.d.f33383c, null, null, 6, null);
            return;
        }
        u().b("PaymentAuthWebViewActivity#onCreate()");
        setContentView(v().getRoot());
        setSupportActionBar(v().f3147c);
        t();
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        AbstractC3159y.h(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, new c(), 3, null);
        String d8 = x8.d();
        setResult(-1, s(w().f()));
        if (g6.n.u(d8)) {
            u().b("PaymentAuthWebViewActivity#onCreate() - clientSecret is blank");
            finish();
            i.a aVar2 = k3.i.f33380a;
            Context applicationContext2 = getApplicationContext();
            AbstractC3159y.h(applicationContext2, "getApplicationContext(...)");
            i.b.a(i.a.b(aVar2, applicationContext2, null, 2, null), i.f.f33412b, null, null, 6, null);
            return;
        }
        u().b("PaymentAuthWebViewActivity#onCreate() - PaymentAuthWebView init and loadUrl");
        l6.v a8 = AbstractC3351M.a(Boolean.FALSE);
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new d(a8, this, null), 3, null);
        C2463o0 c2463o0 = new C2463o0(u(), a8, d8, x8.x(), new f(this), new g(this));
        v().f3148d.setOnLoadBlank$payments_core_release(new e(c2463o0));
        v().f3148d.setWebViewClient(c2463o0);
        v().f3148d.setWebChromeClient(new C2459m0(this, u()));
        w().k();
        v().f3148d.loadUrl(x8.G(), w().e());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        AbstractC3159y.i(menu, "menu");
        u().b("PaymentAuthWebViewActivity#onCreateOptionsMenu()");
        getMenuInflater().inflate(AbstractC3052D.f32813b, menu);
        String c8 = w().c();
        if (c8 != null) {
            u().b("PaymentAuthWebViewActivity#customizeToolbar() - updating close button text");
            menu.findItem(AbstractC3049A.f32749a).setTitle(c8);
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        v().f3149e.removeAllViews();
        v().f3148d.destroy();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        AbstractC3159y.i(item, "item");
        u().b("PaymentAuthWebViewActivity#onOptionsItemSelected()");
        if (item.getItemId() == AbstractC3049A.f32749a) {
            r();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public final void y(Throwable th) {
        if (th != null) {
            i.a aVar = k3.i.f33380a;
            Context applicationContext = getApplicationContext();
            AbstractC3159y.h(applicationContext, "getApplicationContext(...)");
            k3.i b8 = i.a.b(aVar, applicationContext, null, 2, null);
            i.d dVar = i.d.f33382b;
            AbstractC3790k.a aVar2 = AbstractC3790k.f38210e;
            i.b.a(b8, dVar, aVar2.b(th), null, 4, null);
            w().j();
            setResult(-1, s(C2662c.c(w().f(), null, 2, aVar2.b(th), true, null, null, null, 113, null)));
        } else {
            w().i();
        }
        finish();
    }
}
