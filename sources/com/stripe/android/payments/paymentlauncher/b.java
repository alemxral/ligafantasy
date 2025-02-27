package com.stripe.android.payments.paymentlauncher;

import L5.I;
import L5.InterfaceC1223g;
import L5.p;
import L5.r;
import L5.s;
import L5.t;
import L5.x;
import M5.AbstractC1246t;
import M5.Q;
import android.app.Application;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import b3.AbstractC1875j;
import b3.InterfaceC1874i;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.o;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.payments.paymentlauncher.a;
import com.stripe.android.view.InterfaceC2464p;
import e3.m;
import e6.InterfaceC2643c;
import f3.AbstractC2664e;
import f3.C2660a;
import f3.C2662c;
import i6.AbstractC2825i;
import i6.M;
import j2.AbstractC3059K;
import java.util.List;
import java.util.Map;
import k3.i;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import kotlin.jvm.internal.InterfaceC3153s;
import l3.AbstractC3176f;
import l3.InterfaceC3178h;
import l6.AbstractC3351M;
import l6.v;
import n3.AbstractC3459e;
import n3.y;
import p3.AbstractC3600b;
import t2.AbstractC3790k;
import t2.C3787h;
import t5.InterfaceC3795a;
import w4.AbstractC3849b;
import x2.InterfaceC3873c;
import x2.j;

/* loaded from: classes4.dex */
public final class b extends ViewModel {

    /* renamed from: o, reason: collision with root package name */
    public static final a f25291o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f25292p = 8;

    /* renamed from: q, reason: collision with root package name */
    private static final List f25293q = AbstractC1246t.e("payment_method");

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25294a;

    /* renamed from: b, reason: collision with root package name */
    private final m f25295b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3178h f25296c;

    /* renamed from: d, reason: collision with root package name */
    private final C2660a f25297d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.a f25298e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f25299f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3795a f25300g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3795a f25301h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3873c f25302i;

    /* renamed from: j, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f25303j;

    /* renamed from: k, reason: collision with root package name */
    private final P5.g f25304k;

    /* renamed from: l, reason: collision with root package name */
    private final SavedStateHandle f25305l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f25306m;

    /* renamed from: n, reason: collision with root package name */
    private final v f25307n;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.payments.paymentlauncher.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0560b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f25308a;

        /* renamed from: com.stripe.android.payments.paymentlauncher.b$b$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentLauncherContract.a f25309a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PaymentLauncherContract.a aVar) {
                super(0);
                this.f25309a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return this.f25309a.f();
            }
        }

        /* renamed from: com.stripe.android.payments.paymentlauncher.b$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0561b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentLauncherContract.a f25310a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0561b(PaymentLauncherContract.a aVar) {
                super(0);
                this.f25310a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return this.f25310a.j();
            }
        }

        public C0560b(Function0 argsSupplier) {
            AbstractC3159y.i(argsSupplier, "argsSupplier");
            this.f25308a = argsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
            return n.a(this, interfaceC2643c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3159y.i(modelClass, "modelClass");
            AbstractC3159y.i(extras, "extras");
            PaymentLauncherContract.a aVar = (PaymentLauncherContract.a) this.f25308a.invoke();
            Application a8 = A2.b.a(extras);
            SavedStateHandle createSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(extras);
            y.a a9 = AbstractC3459e.a().a(a8).d(aVar.b()).c(new a(aVar)).e(new C0561b(aVar)).b(aVar.e()).f(aVar.c()).build().a();
            boolean z8 = false;
            if (aVar instanceof PaymentLauncherContract.a.b) {
                InterfaceC1874i n8 = ((PaymentLauncherContract.a.b) aVar).n();
                if (!(n8 instanceof com.stripe.android.model.b)) {
                    if (!(n8 instanceof com.stripe.android.model.c)) {
                        throw new p();
                    }
                    b a10 = a9.b(z8).a(createSavedStateHandle).build().a();
                    AbstractC3159y.g(a10, "null cannot be cast to non-null type T of com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.Factory.create");
                    return a10;
                }
                z8 = true;
                b a102 = a9.b(z8).a(createSavedStateHandle).build().a();
                AbstractC3159y.g(a102, "null cannot be cast to non-null type T of com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.Factory.create");
                return a102;
            }
            if (!(aVar instanceof PaymentLauncherContract.a.c)) {
                if (!(aVar instanceof PaymentLauncherContract.a.d)) {
                    throw new p();
                }
                b a1022 = a9.b(z8).a(createSavedStateHandle).build().a();
                AbstractC3159y.g(a1022, "null cannot be cast to non-null type T of com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.Factory.create");
                return a1022;
            }
            z8 = true;
            b a10222 = a9.b(z8).a(createSavedStateHandle).build().a();
            AbstractC3159y.g(a10222, "null cannot be cast to non-null type T of com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.Factory.create");
            return a10222;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25311a;

        /* renamed from: c, reason: collision with root package name */
        int f25313c;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25311a = obj;
            this.f25313c |= Integer.MIN_VALUE;
            Object q8 = b.this.q(null, null, this);
            return q8 == Q5.b.e() ? q8 : s.a(q8);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f25314a;

        /* renamed from: b, reason: collision with root package name */
        Object f25315b;

        /* renamed from: c, reason: collision with root package name */
        int f25316c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC1874i f25318e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2464p f25319f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f25320a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f25321b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ StripeIntent f25322c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, StripeIntent stripeIntent, P5.d dVar) {
                super(2, dVar);
                this.f25321b = bVar;
                this.f25322c = stripeIntent;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f25321b, this.f25322c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f25320a == 0) {
                    t.b(obj);
                    b.B(this.f25321b, new a.c(this.f25322c), this.f25322c, null, 4, null);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.payments.paymentlauncher.b$d$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0562b extends l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f25323a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f25324b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Throwable f25325c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map f25326d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0562b(b bVar, Throwable th, Map map, P5.d dVar) {
                super(2, dVar);
                this.f25324b = bVar;
                this.f25325c = th;
                this.f25326d = map;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0562b(this.f25324b, this.f25325c, this.f25326d, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0562b) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f25323a == 0) {
                    t.b(obj);
                    b.B(this.f25324b, new a.d(this.f25325c), null, this.f25326d, 2, null);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC1874i interfaceC1874i, InterfaceC2464p interfaceC2464p, P5.d dVar) {
            super(2, dVar);
            this.f25318e = interfaceC1874i;
            this.f25319f = interfaceC2464p;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f25318e, this.f25319f, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String x8;
            Map map;
            Object obj2;
            String id;
            Object e8 = Q5.b.e();
            int i8 = this.f25316c;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2 && i8 != 3 && i8 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return I.f6474a;
                }
                x8 = (String) this.f25315b;
                map = (Map) this.f25314a;
                t.b(obj);
                obj2 = ((s) obj).k();
            } else {
                t.b(obj);
                b.this.f25305l.set("key_has_started", kotlin.coroutines.jvm.internal.b.a(true));
                b.this.f25305l.set("confirm_action_requested", kotlin.coroutines.jvm.internal.b.a(true));
                Map w8 = b.this.w(this.f25318e);
                b.this.y(this.f25318e.x());
                if (b.this.f25306m) {
                    x8 = this.f25318e.x();
                } else {
                    x8 = this.f25318e.x();
                    if (x8 == null || g6.n.u(x8)) {
                        x8 = null;
                    }
                    if (x8 == null) {
                        x8 = b.this.f25297d.a();
                    }
                }
                b bVar = b.this;
                InterfaceC1874i interfaceC1874i = this.f25318e;
                this.f25314a = w8;
                this.f25315b = x8;
                this.f25316c = 1;
                Object q8 = bVar.q(interfaceC1874i, x8, this);
                if (q8 == e8) {
                    return e8;
                }
                map = w8;
                obj2 = q8;
            }
            b bVar2 = b.this;
            InterfaceC2464p interfaceC2464p = this.f25319f;
            Throwable e9 = s.e(obj2);
            if (e9 != null) {
                P5.g gVar = bVar2.f25304k;
                C0562b c0562b = new C0562b(bVar2, e9, map, null);
                this.f25314a = null;
                this.f25315b = null;
                this.f25316c = 4;
                if (AbstractC2825i.g(gVar, c0562b, this) == e8) {
                    return e8;
                }
            } else {
                StripeIntent stripeIntent = (StripeIntent) obj2;
                StripeIntent.a l8 = stripeIntent.l();
                if (l8 != null && (l8 instanceof StripeIntent.a.j.C0489a) && (id = stripeIntent.getId()) != null) {
                    Map map2 = bVar2.f25299f;
                    if (x8 == null) {
                        x8 = "";
                    }
                    map2.put(id, x8);
                }
                if (!stripeIntent.w()) {
                    P5.g gVar2 = bVar2.f25304k;
                    a aVar = new a(bVar2, stripeIntent, null);
                    this.f25314a = null;
                    this.f25315b = null;
                    this.f25316c = 2;
                    if (AbstractC2825i.g(gVar2, aVar, this) == e8) {
                        return e8;
                    }
                } else {
                    AbstractC3176f a8 = bVar2.f25296c.a(stripeIntent);
                    Object obj3 = bVar2.f25298e.get();
                    AbstractC3159y.h(obj3, "get(...)");
                    this.f25314a = null;
                    this.f25315b = null;
                    this.f25316c = 3;
                    if (a8.d(interfaceC2464p, stripeIntent, (j.c) obj3, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f25327a;

        /* renamed from: b, reason: collision with root package name */
        int f25328b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f25330d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2464p f25331e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f25332a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f25333b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Throwable f25334c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map f25335d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Throwable th, Map map, P5.d dVar) {
                super(2, dVar);
                this.f25333b = bVar;
                this.f25334c = th;
                this.f25335d = map;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f25333b, this.f25334c, this.f25335d, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f25332a == 0) {
                    t.b(obj);
                    b.B(this.f25333b, new a.d(this.f25334c), null, this.f25335d, 2, null);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, InterfaceC2464p interfaceC2464p, P5.d dVar) {
            super(2, dVar);
            this.f25330d = str;
            this.f25331e = interfaceC2464p;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f25330d, this.f25331e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Map x8;
            Object d8;
            Object e8 = Q5.b.e();
            int i8 = this.f25328b;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2 && i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return I.f6474a;
                }
                x8 = (Map) this.f25327a;
                t.b(obj);
                d8 = ((s) obj).k();
            } else {
                t.b(obj);
                b.this.f25305l.set("key_has_started", kotlin.coroutines.jvm.internal.b.a(true));
                b.this.f25305l.set("confirm_action_requested", kotlin.coroutines.jvm.internal.b.a(false));
                x8 = b.this.x(this.f25330d);
                m mVar = b.this.f25295b;
                String str = this.f25330d;
                Object obj2 = b.this.f25298e.get();
                AbstractC3159y.h(obj2, "get(...)");
                this.f25327a = x8;
                this.f25328b = 1;
                d8 = m.a.d(mVar, str, (j.c) obj2, null, this, 4, null);
                if (d8 == e8) {
                    return e8;
                }
            }
            b bVar = b.this;
            InterfaceC2464p interfaceC2464p = this.f25331e;
            Throwable e9 = s.e(d8);
            if (e9 != null) {
                P5.g gVar = bVar.f25304k;
                a aVar = new a(bVar, e9, x8, null);
                this.f25327a = null;
                this.f25328b = 3;
                if (AbstractC2825i.g(gVar, aVar, this) == e8) {
                    return e8;
                }
            } else {
                StripeIntent stripeIntent = (StripeIntent) d8;
                AbstractC3176f a8 = bVar.f25296c.a(stripeIntent);
                Object obj3 = bVar.f25298e.get();
                AbstractC3159y.h(obj3, "get(...)");
                this.f25327a = null;
                this.f25328b = 2;
                if (a8.d(interfaceC2464p, stripeIntent, (j.c) obj3, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f25336a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2662c f25338c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f25339a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f25340b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC3059K f25341c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, AbstractC3059K abstractC3059K, P5.d dVar) {
                super(2, dVar);
                this.f25340b = bVar;
                this.f25341c = abstractC3059K;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f25340b, this.f25341c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f25339a == 0) {
                    t.b(obj);
                    this.f25340b.C(this.f25341c);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.payments.paymentlauncher.b$f$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0563b extends l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f25342a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f25343b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Throwable f25344c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0563b(b bVar, Throwable th, P5.d dVar) {
                super(2, dVar);
                this.f25343b = bVar;
                this.f25344c = th;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0563b(this.f25343b, this.f25344c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0563b) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f25342a == 0) {
                    t.b(obj);
                    b.B(this.f25343b, new a.d(this.f25344c), null, null, 6, null);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C2662c c2662c, P5.d dVar) {
            super(2, dVar);
            this.f25338c = c2662c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f25338c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2664e abstractC2664e;
            Object p8;
            Object e8 = Q5.b.e();
            int i8 = this.f25336a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2 && i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return I.f6474a;
                }
                t.b(obj);
                p8 = ((s) obj).k();
            } else {
                t.b(obj);
                if (b.this.f25294a) {
                    abstractC2664e = (AbstractC2664e) b.this.f25300g.get();
                } else {
                    abstractC2664e = (AbstractC2664e) b.this.f25301h.get();
                }
                C2662c c2662c = this.f25338c;
                this.f25336a = 1;
                p8 = abstractC2664e.p(c2662c, this);
                if (p8 == e8) {
                    return e8;
                }
            }
            b bVar = b.this;
            Throwable e9 = s.e(p8);
            if (e9 == null) {
                P5.g gVar = bVar.f25304k;
                a aVar = new a(bVar, (AbstractC3059K) p8, null);
                this.f25336a = 2;
                if (AbstractC2825i.g(gVar, aVar, this) == e8) {
                    return e8;
                }
            } else {
                P5.g gVar2 = bVar.f25304k;
                C0563b c0563b = new C0563b(bVar, e9, null);
                this.f25336a = 3;
                if (AbstractC2825i.g(gVar2, c0563b, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class g implements ActivityResultCallback, InterfaceC3153s {
        g() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(C2662c p02) {
            AbstractC3159y.i(p02, "p0");
            b.this.z(p02);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof InterfaceC3153s)) {
                return AbstractC3159y.d(getFunctionDelegate(), ((InterfaceC3153s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3153s
        public final InterfaceC1223g getFunctionDelegate() {
            return new C3156v(1, b.this, b.class, "onPaymentFlowResult", "onPaymentFlowResult$payments_core_release(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements DefaultLifecycleObserver {
        h() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.a(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner owner) {
            AbstractC3159y.i(owner, "owner");
            b.this.f25296c.c();
            androidx.lifecycle.c.b(this, owner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.c(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.d(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.e(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.f(this, lifecycleOwner);
        }
    }

    public b(boolean z8, m stripeApiRepository, InterfaceC3178h nextActionHandlerRegistry, C2660a defaultReturnUrl, I5.a apiRequestOptionsProvider, Map threeDs1IntentReturnUrlMap, InterfaceC3795a lazyPaymentIntentFlowResultProcessor, InterfaceC3795a lazySetupIntentFlowResultProcessor, InterfaceC3873c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, P5.g uiContext, SavedStateHandle savedStateHandle, boolean z9) {
        AbstractC3159y.i(stripeApiRepository, "stripeApiRepository");
        AbstractC3159y.i(nextActionHandlerRegistry, "nextActionHandlerRegistry");
        AbstractC3159y.i(defaultReturnUrl, "defaultReturnUrl");
        AbstractC3159y.i(apiRequestOptionsProvider, "apiRequestOptionsProvider");
        AbstractC3159y.i(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
        AbstractC3159y.i(lazyPaymentIntentFlowResultProcessor, "lazyPaymentIntentFlowResultProcessor");
        AbstractC3159y.i(lazySetupIntentFlowResultProcessor, "lazySetupIntentFlowResultProcessor");
        AbstractC3159y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3159y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3159y.i(uiContext, "uiContext");
        AbstractC3159y.i(savedStateHandle, "savedStateHandle");
        this.f25294a = z8;
        this.f25295b = stripeApiRepository;
        this.f25296c = nextActionHandlerRegistry;
        this.f25297d = defaultReturnUrl;
        this.f25298e = apiRequestOptionsProvider;
        this.f25299f = threeDs1IntentReturnUrlMap;
        this.f25300g = lazyPaymentIntentFlowResultProcessor;
        this.f25301h = lazySetupIntentFlowResultProcessor;
        this.f25302i = analyticsRequestExecutor;
        this.f25303j = paymentAnalyticsRequestFactory;
        this.f25304k = uiContext;
        this.f25305l = savedStateHandle;
        this.f25306m = z9;
        this.f25307n = AbstractC3351M.a(null);
    }

    private final void A(com.stripe.android.payments.paymentlauncher.a aVar, StripeIntent stripeIntent, Map map) {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        String str;
        String str2;
        Map h8;
        o v8;
        o.p pVar;
        StripeIntent.Status status;
        String d8;
        v vVar = this.f25307n;
        if (s()) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f24797C;
        } else {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f24801E;
        }
        String str3 = null;
        if (stripeIntent != null && (d8 = stripeIntent.d()) != null) {
            str = AbstractC3600b.a(d8);
        } else {
            str = null;
        }
        r a8 = x.a("intent_id", str);
        if (stripeIntent != null && (status = stripeIntent.getStatus()) != null) {
            str2 = status.b();
        } else {
            str2 = null;
        }
        r a9 = x.a(NotificationCompat.CATEGORY_STATUS, str2);
        if (stripeIntent != null && (v8 = stripeIntent.v()) != null && (pVar = v8.f24399e) != null) {
            str3 = pVar.f24537a;
        }
        Map a10 = AbstractC3849b.a(Q.k(a8, a9, x.a("payment_method_type", str3)));
        if (aVar instanceof a.d) {
            h8 = i.f33380a.d(AbstractC3790k.f38210e.b(((a.d) aVar).c()));
        } else {
            h8 = Q.h();
        }
        this.f25302i.a(this.f25303j.g(paymentAnalyticsEvent, Q.q(Q.q(map, a10), h8)));
        vVar.setValue(aVar);
    }

    static /* synthetic */ void B(b bVar, com.stripe.android.payments.paymentlauncher.a aVar, StripeIntent stripeIntent, Map map, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            stripeIntent = null;
        }
        if ((i8 & 4) != 0) {
            map = Q.h();
        }
        bVar.A(aVar, stripeIntent, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(AbstractC3059K abstractC3059K) {
        com.stripe.android.payments.paymentlauncher.a cVar;
        int f8 = abstractC3059K.f();
        if (f8 != 1) {
            if (f8 != 2) {
                if (f8 != 3) {
                    if (f8 != 4) {
                        cVar = new a.d(new C3787h("Payment fails due to unknown error. \n" + abstractC3059K.c(), "unknownIntentOutcomeError"));
                    } else {
                        cVar = new a.d(new C3787h("Payment fails due to time out. \n" + abstractC3059K.c(), "timedOutIntentOutcomeError"));
                    }
                } else {
                    cVar = a.C0556a.f25288b;
                }
            } else {
                cVar = new a.d(new C3787h(abstractC3059K.c(), "failedIntentOutcomeError"));
            }
        } else {
            cVar = new a.c(abstractC3059K.e());
        }
        B(this, cVar, abstractC3059K.e(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(b3.InterfaceC1874i r6, java.lang.String r7, P5.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.stripe.android.payments.paymentlauncher.b.c
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.payments.paymentlauncher.b$c r0 = (com.stripe.android.payments.paymentlauncher.b.c) r0
            int r1 = r0.f25313c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25313c = r1
            goto L18
        L13:
            com.stripe.android.payments.paymentlauncher.b$c r0 = new com.stripe.android.payments.paymentlauncher.b$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f25311a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f25313c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            L5.t.b(r8)
            L5.s r8 = (L5.s) r8
            java.lang.Object r6 = r8.k()
            goto L83
        L3b:
            L5.t.b(r8)
            r6.W(r7)
            b3.i r6 = r6.C(r4)
            boolean r7 = r6 instanceof com.stripe.android.model.b
            java.lang.String r8 = "get(...)"
            if (r7 == 0) goto L65
            e3.m r7 = r5.f25295b
            com.stripe.android.model.b r6 = (com.stripe.android.model.b) r6
            I5.a r2 = r5.f25298e
            java.lang.Object r2 = r2.get()
            kotlin.jvm.internal.AbstractC3159y.h(r2, r8)
            x2.j$c r2 = (x2.j.c) r2
            java.util.List r8 = com.stripe.android.payments.paymentlauncher.b.f25293q
            r0.f25313c = r4
            java.lang.Object r6 = r7.s(r6, r2, r8, r0)
            if (r6 != r1) goto L83
            return r1
        L65:
            boolean r7 = r6 instanceof com.stripe.android.model.c
            if (r7 == 0) goto L84
            e3.m r7 = r5.f25295b
            com.stripe.android.model.c r6 = (com.stripe.android.model.c) r6
            I5.a r2 = r5.f25298e
            java.lang.Object r2 = r2.get()
            kotlin.jvm.internal.AbstractC3159y.h(r2, r8)
            x2.j$c r2 = (x2.j.c) r2
            java.util.List r8 = com.stripe.android.payments.paymentlauncher.b.f25293q
            r0.f25313c = r3
            java.lang.Object r6 = r7.e(r6, r2, r8, r0)
            if (r6 != r1) goto L83
            return r1
        L83:
            return r6
        L84:
            L5.p r6 = new L5.p
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.paymentlauncher.b.q(b3.i, java.lang.String, P5.d):java.lang.Object");
    }

    private final boolean s() {
        Boolean bool = (Boolean) this.f25305l.get("confirm_action_requested");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final boolean t() {
        Boolean bool = (Boolean) this.f25305l.get("key_has_started");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map w(InterfaceC1874i interfaceC1874i) {
        String str;
        com.stripe.android.model.p a8 = AbstractC1875j.a(interfaceC1874i);
        if (a8 != null) {
            str = a8.k();
        } else {
            str = null;
        }
        Map a9 = AbstractC3849b.a(Q.k(x.a("payment_method_type", str), x.a("intent_id", AbstractC3600b.a(interfaceC1874i.d()))));
        this.f25302i.a(this.f25303j.g(PaymentAnalyticsEvent.f24795B, a9));
        return a9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map x(String str) {
        Map e8 = Q.e(x.a("intent_id", AbstractC3600b.a(str)));
        this.f25302i.a(this.f25303j.g(PaymentAnalyticsEvent.f24799D, e8));
        return e8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(String str) {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        if (AbstractC3159y.d(str, this.f25297d.a())) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f24813O;
        } else if (str == null) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f24812N;
        } else {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f24814P;
        }
        this.f25302i.a(PaymentAnalyticsRequestFactory.v(this.f25303j, paymentAnalyticsEvent, null, null, null, null, null, 62, null));
    }

    public final void D(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner) {
        AbstractC3159y.i(activityResultCaller, "activityResultCaller");
        AbstractC3159y.i(lifecycleOwner, "lifecycleOwner");
        this.f25296c.b(activityResultCaller, new g());
        lifecycleOwner.getLifecycle().addObserver(new h());
    }

    public final void r(InterfaceC1874i confirmStripeIntentParams, InterfaceC2464p host) {
        AbstractC3159y.i(confirmStripeIntentParams, "confirmStripeIntentParams");
        AbstractC3159y.i(host, "host");
        if (t()) {
            return;
        }
        AbstractC2825i.d(ViewModelKt.getViewModelScope(this), null, null, new d(confirmStripeIntentParams, host, null), 3, null);
    }

    public final v u() {
        return this.f25307n;
    }

    public final void v(String clientSecret, InterfaceC2464p host) {
        AbstractC3159y.i(clientSecret, "clientSecret");
        AbstractC3159y.i(host, "host");
        if (t()) {
            return;
        }
        AbstractC2825i.d(ViewModelKt.getViewModelScope(this), null, null, new e(clientSecret, host, null), 3, null);
    }

    public final void z(C2662c paymentFlowResult) {
        AbstractC3159y.i(paymentFlowResult, "paymentFlowResult");
        AbstractC2825i.d(ViewModelKt.getViewModelScope(this), null, null, new f(paymentFlowResult, null), 3, null);
    }
}
