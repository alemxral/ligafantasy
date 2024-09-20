package com.stripe.android.payments.core.authentication.threeds2;

import L5.I;
import L5.InterfaceC1227k;
import L5.l;
import L5.s;
import L5.t;
import X5.n;
import a4.C1564h;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.stripe3ds2.transaction.ChallengeContract;
import com.stripe.android.stripe3ds2.transaction.h;
import f3.C2662c;
import i6.AbstractC2829k;
import i6.InterfaceC2855x0;
import i6.M;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import t2.AbstractC3790k;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class Stripe3ds2TransactionActivity extends AppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    public Stripe3ds2TransactionContract.a f25156b;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1227k f25155a = l.b(new f());

    /* renamed from: c, reason: collision with root package name */
    private ViewModelProvider.Factory f25157c = new com.stripe.android.payments.core.authentication.threeds2.e(new g());

    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f25158a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComponentActivity componentActivity) {
            super(0);
            this.f25158a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f25158a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f25159a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f25160b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f25159a = function0;
            this.f25160b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25159a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f25160b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f25161a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ActivityResultLauncher f25163c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f25164d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ActivityResultLauncher f25165e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC1227k f25166f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ActivityResultLauncher activityResultLauncher, Function1 function1, ActivityResultLauncher activityResultLauncher2, InterfaceC1227k interfaceC1227k, P5.d dVar) {
            super(2, dVar);
            this.f25163c = activityResultLauncher;
            this.f25164d = function1;
            this.f25165e = activityResultLauncher2;
            this.f25166f = interfaceC1227k;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f25163c, this.f25164d, this.f25165e, this.f25166f, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r4.f25161a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                L5.t.b(r5)
                goto L53
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                L5.t.b(r5)
                goto L38
            L1e:
                L5.t.b(r5)
                com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity r5 = com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.this
                boolean r5 = r5.isFinishing()
                if (r5 != 0) goto L94
                L5.k r5 = r4.f25166f
                com.stripe.android.payments.core.authentication.threeds2.d r5 = com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.q(r5)
                r4.f25161a = r3
                java.lang.Object r5 = r5.m(r4)
                if (r5 != r0) goto L38
                return r0
            L38:
                com.stripe.android.payments.core.authentication.threeds2.a r5 = (com.stripe.android.payments.core.authentication.threeds2.a) r5
                boolean r1 = r5 instanceof com.stripe.android.payments.core.authentication.threeds2.a.b
                if (r1 == 0) goto L75
                L5.k r1 = r4.f25166f
                com.stripe.android.payments.core.authentication.threeds2.d r1 = com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.q(r1)
                com.stripe.android.payments.core.authentication.threeds2.a$b r5 = (com.stripe.android.payments.core.authentication.threeds2.a.b) r5
                X3.m r5 = r5.a()
                r4.f25161a = r2
                java.lang.Object r5 = r1.h(r5, r4)
                if (r5 != r0) goto L53
                return r0
            L53:
                com.stripe.android.stripe3ds2.transaction.m r5 = (com.stripe.android.stripe3ds2.transaction.m) r5
                boolean r0 = r5 instanceof com.stripe.android.stripe3ds2.transaction.m.c
                if (r0 == 0) goto L65
                androidx.activity.result.ActivityResultLauncher r0 = r4.f25163c
                com.stripe.android.stripe3ds2.transaction.m$c r5 = (com.stripe.android.stripe3ds2.transaction.m.c) r5
                com.stripe.android.stripe3ds2.views.d r5 = r5.b()
                r0.launch(r5)
                goto L94
            L65:
                boolean r0 = r5 instanceof com.stripe.android.stripe3ds2.transaction.m.b
                if (r0 == 0) goto L94
                kotlin.jvm.functions.Function1 r0 = r4.f25164d
                com.stripe.android.stripe3ds2.transaction.m$b r5 = (com.stripe.android.stripe3ds2.transaction.m.b) r5
                com.stripe.android.stripe3ds2.transaction.h r5 = r5.b()
                r0.invoke(r5)
                goto L94
            L75:
                boolean r0 = r5 instanceof com.stripe.android.payments.core.authentication.threeds2.a.c
                if (r0 == 0) goto L85
                androidx.activity.result.ActivityResultLauncher r0 = r4.f25165e
                com.stripe.android.payments.core.authentication.threeds2.a$c r5 = (com.stripe.android.payments.core.authentication.threeds2.a.c) r5
                com.stripe.android.auth.PaymentBrowserAuthContract$a r5 = r5.a()
                r0.launch(r5)
                goto L94
            L85:
                boolean r0 = r5 instanceof com.stripe.android.payments.core.authentication.threeds2.a.C0550a
                if (r0 == 0) goto L94
                com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity r0 = com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.this
                com.stripe.android.payments.core.authentication.threeds2.a$a r5 = (com.stripe.android.payments.core.authentication.threeds2.a.C0550a) r5
                f3.c r5 = r5.a()
                com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.p(r0, r5)
            L94:
                L5.I r5 = L5.I.f6474a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1227k f25168b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements n {

            /* renamed from: a, reason: collision with root package name */
            Object f25169a;

            /* renamed from: b, reason: collision with root package name */
            int f25170b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Stripe3ds2TransactionActivity f25171c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ h f25172d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC1227k f25173e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Stripe3ds2TransactionActivity stripe3ds2TransactionActivity, h hVar, InterfaceC1227k interfaceC1227k, P5.d dVar) {
                super(2, dVar);
                this.f25171c = stripe3ds2TransactionActivity;
                this.f25172d = hVar;
                this.f25173e = interfaceC1227k;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f25171c, this.f25172d, this.f25173e, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Stripe3ds2TransactionActivity stripe3ds2TransactionActivity;
                Object e8 = Q5.b.e();
                int i8 = this.f25170b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        stripe3ds2TransactionActivity = (Stripe3ds2TransactionActivity) this.f25169a;
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    Stripe3ds2TransactionActivity stripe3ds2TransactionActivity2 = this.f25171c;
                    com.stripe.android.payments.core.authentication.threeds2.d v8 = Stripe3ds2TransactionActivity.v(this.f25173e);
                    h hVar = this.f25172d;
                    this.f25169a = stripe3ds2TransactionActivity2;
                    this.f25170b = 1;
                    Object l8 = v8.l(hVar, this);
                    if (l8 == e8) {
                        return e8;
                    }
                    stripe3ds2TransactionActivity = stripe3ds2TransactionActivity2;
                    obj = l8;
                }
                stripe3ds2TransactionActivity.r((C2662c) obj);
                return I.f6474a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC1227k interfaceC1227k) {
            super(1);
            this.f25168b = interfaceC1227k;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2855x0 invoke(h challengeResult) {
            InterfaceC2855x0 d8;
            AbstractC3159y.i(challengeResult, "challengeResult");
            d8 = AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(Stripe3ds2TransactionActivity.this), null, null, new a(Stripe3ds2TransactionActivity.this, challengeResult, this.f25168b, null), 3, null);
            return d8;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return Stripe3ds2TransactionActivity.this.u();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G2.a invoke() {
            G2.a c8 = G2.a.c(Stripe3ds2TransactionActivity.this.getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(...)");
            return c8;
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3160z implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Stripe3ds2TransactionContract.a invoke() {
            return Stripe3ds2TransactionActivity.this.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(C2662c c2662c) {
        setResult(-1, new Intent().putExtras(c2662c.o()));
        finish();
    }

    private final G2.a t() {
        return (G2.a) this.f25155a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.stripe.android.payments.core.authentication.threeds2.d v(InterfaceC1227k interfaceC1227k) {
        return (com.stripe.android.payments.core.authentication.threeds2.d) interfaceC1227k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(Function1 onChallengeResult, h hVar) {
        AbstractC3159y.i(onChallengeResult, "$onChallengeResult");
        AbstractC3159y.f(hVar);
        onChallengeResult.invoke(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(Stripe3ds2TransactionActivity this$0, C2662c c2662c) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.f(c2662c);
        this$0.r(c2662c);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object b8;
        Stripe3ds2TransactionContract.a a8;
        Object b9;
        Integer num;
        try {
            s.a aVar = s.f6498b;
            Stripe3ds2TransactionContract.a.C0549a c0549a = Stripe3ds2TransactionContract.a.f25177j;
            Intent intent = getIntent();
            AbstractC3159y.h(intent, "getIntent(...)");
            a8 = c0549a.a(intent);
        } catch (Throwable th) {
            s.a aVar2 = s.f6498b;
            b8 = s.b(t.a(th));
        }
        if (a8 != null) {
            String f8 = a8.b().e().b().f();
            if (f8 != null) {
                try {
                    AbstractC3159y.f(f8);
                    b9 = s.b(Integer.valueOf(Color.parseColor(f8)));
                } catch (Throwable th2) {
                    s.a aVar3 = s.f6498b;
                    b9 = s.b(t.a(th2));
                }
                if (s.g(b9)) {
                    b9 = null;
                }
                num = (Integer) b9;
            } else {
                num = null;
            }
            getSupportFragmentManager().setFragmentFactory(new C1564h(a8.e().c(), a8.n(), num));
            b8 = s.b(a8);
            super.onCreate(bundle);
            Throwable e8 = s.e(b8);
            if (e8 == null) {
                y((Stripe3ds2TransactionContract.a) b8);
                setContentView(t().getRoot());
                Integer o8 = s().o();
                if (o8 != null) {
                    getWindow().setStatusBarColor(o8.intValue());
                }
                ViewModelLazy viewModelLazy = new ViewModelLazy(U.b(com.stripe.android.payments.core.authentication.threeds2.d.class), new a(this), new e(), new b(null, this));
                final d dVar = new d(viewModelLazy);
                ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ChallengeContract(), new ActivityResultCallback() { // from class: m3.e
                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(Object obj) {
                        Stripe3ds2TransactionActivity.w(Function1.this, (h) obj);
                    }
                });
                AbstractC3159y.h(registerForActivityResult, "registerForActivityResult(...)");
                ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new PaymentBrowserAuthContract(), new ActivityResultCallback() { // from class: m3.f
                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(Object obj) {
                        Stripe3ds2TransactionActivity.x(Stripe3ds2TransactionActivity.this, (C2662c) obj);
                    }
                });
                AbstractC3159y.h(registerForActivityResult2, "registerForActivityResult(...)");
                if (!v(viewModelLazy).f()) {
                    LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new c(registerForActivityResult, dVar, registerForActivityResult2, viewModelLazy, null));
                    return;
                }
                return;
            }
            r(new C2662c(null, 2, AbstractC3790k.f38210e.b(e8), false, null, null, null, 121, null));
            return;
        }
        throw new IllegalArgumentException("Error while attempting to initiate 3DS2 transaction.".toString());
    }

    public final Stripe3ds2TransactionContract.a s() {
        Stripe3ds2TransactionContract.a aVar = this.f25156b;
        if (aVar != null) {
            return aVar;
        }
        AbstractC3159y.y("args");
        return null;
    }

    public final ViewModelProvider.Factory u() {
        return this.f25157c;
    }

    public final void y(Stripe3ds2TransactionContract.a aVar) {
        AbstractC3159y.i(aVar, "<set-?>");
        this.f25156b = aVar;
    }
}
