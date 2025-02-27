package com.stripe.android.googlepaylauncher;

import L5.I;
import L5.t;
import M5.a0;
import X5.n;
import android.app.Application;
import android.content.Intent;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import b3.InterfaceC1874i;
import com.stripe.android.googlepaylauncher.GooglePayLauncherContract;
import com.stripe.android.googlepaylauncher.d;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.b;
import com.stripe.android.model.c;
import com.stripe.android.model.p;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.view.InterfaceC2464p;
import e3.m;
import e6.InterfaceC2643c;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import j2.C3072l;
import j2.C3073m;
import j2.InterfaceC3069i;
import j2.r;
import j2.s;
import java.util.Set;
import k3.i;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3340B;
import l6.AbstractC3360h;
import l6.u;
import l6.z;
import r2.C3683c;
import r2.InterfaceC3684d;
import s0.C3723m;
import x2.InterfaceC3868F;
import x2.InterfaceC3873c;
import x2.j;

/* loaded from: classes4.dex */
public final class g extends ViewModel {

    /* renamed from: o, reason: collision with root package name */
    public static final b f23861o = new b(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f23862p = 8;

    /* renamed from: a, reason: collision with root package name */
    private final C3723m f23863a;

    /* renamed from: b, reason: collision with root package name */
    private final j.c f23864b;

    /* renamed from: c, reason: collision with root package name */
    private final GooglePayLauncherContract.a f23865c;

    /* renamed from: d, reason: collision with root package name */
    private final m f23866d;

    /* renamed from: e, reason: collision with root package name */
    private final s f23867e;

    /* renamed from: f, reason: collision with root package name */
    private final C3073m f23868f;

    /* renamed from: g, reason: collision with root package name */
    private final I2.g f23869g;

    /* renamed from: h, reason: collision with root package name */
    private final SavedStateHandle f23870h;

    /* renamed from: i, reason: collision with root package name */
    private final k3.i f23871i;

    /* renamed from: j, reason: collision with root package name */
    private final P5.g f23872j;

    /* renamed from: k, reason: collision with root package name */
    private final u f23873k;

    /* renamed from: l, reason: collision with root package name */
    private final z f23874l;

    /* renamed from: m, reason: collision with root package name */
    private final u f23875m;

    /* renamed from: n, reason: collision with root package name */
    private final z f23876n;

    /* loaded from: classes4.dex */
    static final class a extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f23877a;

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r4.f23877a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                L5.t.b(r5)
                goto L59
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                L5.t.b(r5)
                L5.s r5 = (L5.s) r5
                java.lang.Object r5 = r5.k()
                goto L3a
            L24:
                L5.t.b(r5)
                com.stripe.android.googlepaylauncher.g r5 = com.stripe.android.googlepaylauncher.g.this
                boolean r5 = com.stripe.android.googlepaylauncher.g.b(r5)
                if (r5 != 0) goto L59
                com.stripe.android.googlepaylauncher.g r5 = com.stripe.android.googlepaylauncher.g.this
                r4.f23877a = r3
                java.lang.Object r5 = com.stripe.android.googlepaylauncher.g.g(r5, r4)
                if (r5 != r0) goto L3a
                return r0
            L3a:
                com.stripe.android.googlepaylauncher.g r1 = com.stripe.android.googlepaylauncher.g.this
                java.lang.Throwable r3 = L5.s.e(r5)
                if (r3 != 0) goto L51
                com.google.android.gms.tasks.Task r5 = (com.google.android.gms.tasks.Task) r5
                l6.u r1 = com.stripe.android.googlepaylauncher.g.e(r1)
                r4.f23877a = r2
                java.lang.Object r5 = r1.emit(r5, r4)
                if (r5 != r0) goto L59
                return r0
            L51:
                com.stripe.android.googlepaylauncher.f$c r5 = new com.stripe.android.googlepaylauncher.f$c
                r5.<init>(r3)
                r1.u(r5)
            L59:
                L5.I r5 = L5.I.f6474a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final GooglePayLauncherContract.a f23879a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f23880b;

        /* renamed from: c, reason: collision with root package name */
        private final P5.g f23881c;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f23882a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(0);
                this.f23882a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return this.f23882a;
            }
        }

        /* loaded from: classes4.dex */
        static final class b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f23883a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(0);
                this.f23883a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return this.f23883a;
            }
        }

        public c(GooglePayLauncherContract.a args, boolean z8, P5.g workContext) {
            AbstractC3159y.i(args, "args");
            AbstractC3159y.i(workContext, "workContext");
            this.f23879a = args;
            this.f23880b = z8;
            this.f23881c = workContext;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC2643c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return androidx.lifecycle.n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3159y.i(modelClass, "modelClass");
            AbstractC3159y.i(extras, "extras");
            Application a8 = A2.b.a(extras);
            I2.d e8 = this.f23879a.c().e();
            InterfaceC3684d a9 = InterfaceC3684d.f37551a.a(this.f23880b);
            r a10 = r.f33047c.a(a8);
            String e9 = a10.e();
            String f8 = a10.f();
            Set d8 = a0.d("GooglePayLauncher");
            C3683c c3683c = null;
            InterfaceC3868F interfaceC3868F = null;
            InterfaceC3873c interfaceC3873c = null;
            InterfaceC3069i interfaceC3069i = null;
            byte b8 = 0 == true ? 1 : 0;
            byte b9 = 0 == true ? 1 : 0;
            byte b10 = 0 == true ? 1 : 0;
            com.stripe.android.networking.a aVar = new com.stripe.android.networking.a(a8, new b(e9), c3683c, a9, this.f23881c, d8, interfaceC3868F, interfaceC3873c, interfaceC3069i, b8, new PaymentAnalyticsRequestFactory(a8, e9, d8), b9, b10, null, null, 31684, null);
            com.stripe.android.googlepaylauncher.b bVar = new com.stripe.android.googlepaylauncher.b(a8, this.f23879a.c().e(), com.stripe.android.googlepaylauncher.a.a(this.f23879a.c().c()), this.f23879a.c().f(), this.f23879a.c().b(), null, a9, 32, null);
            k3.i b11 = i.a.b(k3.i.f33380a, a8, null, 2, null);
            return new g(new I2.a(a8).a(e8), new j.c(e9, f8, null, 4, null), this.f23879a, aVar, new com.stripe.android.b(a8, new a(e9), aVar, this.f23880b, this.f23881c, null, null, null, null, 480, 0 == true ? 1 : 0), new C3073m(new C3072l(e9, f8), this.f23879a.c().n()), bVar, SavedStateHandleSupport.createSavedStateHandle(extras), b11, this.f23881c);
        }

        public /* synthetic */ c(GooglePayLauncherContract.a aVar, boolean z8, P5.g gVar, int i8, AbstractC3151p abstractC3151p) {
            this(aVar, (i8 & 2) != 0 ? false : z8, (i8 & 4) != 0 ? C2812b0.b() : gVar);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23884a;

        static {
            int[] iArr = new int[d.b.values().length];
            try {
                iArr[d.b.f23846b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.b.f23847c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f23884a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f23885a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f23887c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC2464p f23888d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p pVar, InterfaceC2464p interfaceC2464p, P5.d dVar) {
            super(2, dVar);
            this.f23887c = pVar;
            this.f23888d = interfaceC2464p;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f23887c, this.f23888d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC1874i c8;
            Object e8 = Q5.b.e();
            int i8 = this.f23885a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                GooglePayLauncherContract.a aVar = g.this.f23865c;
                if (aVar instanceof GooglePayLauncherContract.c) {
                    c8 = b.a.c(com.stripe.android.model.b.f24200o, this.f23887c, g.this.f23865c.b(), null, null, null, null, null, null, 252, null);
                } else if (aVar instanceof GooglePayLauncherContract.d) {
                    c8 = c.a.c(com.stripe.android.model.c.f24228h, this.f23887c, g.this.f23865c.b(), null, null, 12, null);
                } else {
                    throw new L5.p();
                }
                s sVar = g.this.f23867e;
                InterfaceC2464p interfaceC2464p = this.f23888d;
                j.c cVar = g.this.f23864b;
                this.f23885a = 1;
                if (sVar.c(interfaceC2464p, c8, cVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f23889a;

        /* renamed from: b, reason: collision with root package name */
        Object f23890b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f23891c;

        /* renamed from: e, reason: collision with root package name */
        int f23893e;

        f(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23891c = obj;
            this.f23893e |= Integer.MIN_VALUE;
            Object i8 = g.this.i(null, this);
            return i8 == Q5.b.e() ? i8 : L5.s.a(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.googlepaylauncher.g$g, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0475g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f23894a;

        /* renamed from: c, reason: collision with root package name */
        int f23896c;

        C0475g(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23894a = obj;
            this.f23896c |= Integer.MIN_VALUE;
            return g.this.o(0, null, this);
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f23897a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f23899c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Intent f23900d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i8, Intent intent, P5.d dVar) {
            super(2, dVar);
            this.f23899c = i8;
            this.f23900d = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new h(this.f23899c, this.f23900d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f23897a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f6474a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                g gVar = g.this;
                int i9 = this.f23899c;
                Intent intent = this.f23900d;
                this.f23897a = 1;
                obj = gVar.o(i9, intent, this);
                if (obj == e8) {
                    return e8;
                }
            }
            u uVar = g.this.f23873k;
            this.f23897a = 2;
            if (uVar.emit((com.stripe.android.googlepaylauncher.f) obj, this) == e8) {
                return e8;
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f23901a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f23902b;

        /* renamed from: d, reason: collision with root package name */
        int f23904d;

        i(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23902b = obj;
            this.f23904d |= Integer.MIN_VALUE;
            Object s8 = g.this.s(this);
            return s8 == Q5.b.e() ? s8 : L5.s.a(s8);
        }
    }

    public g(C3723m paymentsClient, j.c requestOptions, GooglePayLauncherContract.a args, m stripeRepository, s paymentController, C3073m googlePayJsonFactory, I2.g googlePayRepository, SavedStateHandle savedStateHandle, k3.i errorReporter, P5.g workContext) {
        AbstractC3159y.i(paymentsClient, "paymentsClient");
        AbstractC3159y.i(requestOptions, "requestOptions");
        AbstractC3159y.i(args, "args");
        AbstractC3159y.i(stripeRepository, "stripeRepository");
        AbstractC3159y.i(paymentController, "paymentController");
        AbstractC3159y.i(googlePayJsonFactory, "googlePayJsonFactory");
        AbstractC3159y.i(googlePayRepository, "googlePayRepository");
        AbstractC3159y.i(savedStateHandle, "savedStateHandle");
        AbstractC3159y.i(errorReporter, "errorReporter");
        AbstractC3159y.i(workContext, "workContext");
        this.f23863a = paymentsClient;
        this.f23864b = requestOptions;
        this.f23865c = args;
        this.f23866d = stripeRepository;
        this.f23867e = paymentController;
        this.f23868f = googlePayJsonFactory;
        this.f23869g = googlePayRepository;
        this.f23870h = savedStateHandle;
        this.f23871i = errorReporter;
        this.f23872j = workContext;
        u b8 = AbstractC3340B.b(1, 0, null, 6, null);
        this.f23873k = b8;
        this.f23874l = AbstractC3360h.a(b8);
        u b9 = AbstractC3340B.b(1, 0, null, 6, null);
        this.f23875m = b9;
        this.f23876n = AbstractC3360h.a(b9);
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), workContext, null, new a(null), 2, null);
    }

    public static /* synthetic */ C3073m.e k(g gVar, StripeIntent stripeIntent, String str, Long l8, String str2, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            l8 = null;
        }
        if ((i8 & 8) != 0) {
            str2 = null;
        }
        return gVar.j(stripeIntent, str, l8, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n() {
        return AbstractC3159y.d(this.f23870h.get("has_launched"), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069 A[Catch: all -> 0x004e, TryCatch #2 {all -> 0x004e, blocks: (B:34:0x004a, B:35:0x0061, B:37:0x0069, B:44:0x0070, B:45:0x007b), top: B:33:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0070 A[Catch: all -> 0x004e, TryCatch #2 {all -> 0x004e, blocks: (B:34:0x004a, B:35:0x0061, B:37:0x0069, B:44:0x0070, B:45:0x007b), top: B:33:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(P5.d r8) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.g.s(P5.d):java.lang.Object");
    }

    private final void t(boolean z8) {
        this.f23870h.set("has_launched", Boolean.valueOf(z8));
    }

    public final void h(InterfaceC2464p host, p params) {
        AbstractC3159y.i(host, "host");
        AbstractC3159y.i(params, "params");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), this.f23872j, null, new e(params, host, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(com.stripe.android.googlepaylauncher.GooglePayLauncherContract.a r23, P5.d r24) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.g.i(com.stripe.android.googlepaylauncher.GooglePayLauncherContract$a, P5.d):java.lang.Object");
    }

    public final C3073m.e j(StripeIntent stripeIntent, String currencyCode, Long l8, String str) {
        long j8;
        AbstractC3159y.i(stripeIntent, "stripeIntent");
        AbstractC3159y.i(currencyCode, "currencyCode");
        if (stripeIntent instanceof com.stripe.android.model.n) {
            return new C3073m.e(currencyCode, C3073m.e.c.f33020d, this.f23865c.c().i(), stripeIntent.getId(), ((com.stripe.android.model.n) stripeIntent).e(), null, C3073m.e.a.f33014c);
        }
        if (stripeIntent instanceof com.stripe.android.model.u) {
            C3073m.e.c cVar = C3073m.e.c.f33019c;
            String i8 = this.f23865c.c().i();
            String id = stripeIntent.getId();
            if (l8 != null) {
                j8 = l8.longValue();
            } else {
                j8 = 0;
            }
            return new C3073m.e(currencyCode, cVar, i8, id, Long.valueOf(j8), str, C3073m.e.a.f33013b);
        }
        throw new L5.p();
    }

    public final z l() {
        return this.f23876n;
    }

    public final z m() {
        return this.f23874l;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(int r6, android.content.Intent r7, P5.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.stripe.android.googlepaylauncher.g.C0475g
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.googlepaylauncher.g$g r0 = (com.stripe.android.googlepaylauncher.g.C0475g) r0
            int r1 = r0.f23896c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23896c = r1
            goto L18
        L13:
            com.stripe.android.googlepaylauncher.g$g r0 = new com.stripe.android.googlepaylauncher.g$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f23894a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f23896c
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
            goto L90
        L3b:
            L5.t.b(r8)
            j2.s r8 = r5.f23867e
            boolean r8 = r8.b(r6, r7)
            if (r8 == 0) goto L51
            j2.s r6 = r5.f23867e
            r0.f23896c = r4
            java.lang.Object r6 = r6.d(r7, r0)
            if (r6 != r1) goto L90
            return r1
        L51:
            j2.s r8 = r5.f23867e
            boolean r8 = r8.a(r6, r7)
            if (r8 == 0) goto L64
            j2.s r6 = r5.f23867e
            r0.f23896c = r3
            java.lang.Object r6 = r6.e(r7, r0)
            if (r6 != r1) goto L90
            return r1
        L64:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Unexpected confirmation result."
            r7.<init>(r8)
            k3.i r8 = r5.f23871i
            k3.i$f r0 = k3.i.f.f33417g
            t2.k$a r1 = t2.AbstractC3790k.f38210e
            t2.k r1 = r1.b(r7)
            java.lang.String r2 = "request_code"
            java.lang.String r6 = java.lang.String.valueOf(r6)
            L5.r r6 = L5.x.a(r2, r6)
            java.util.Map r6 = M5.Q.e(r6)
            r8.a(r0, r1, r6)
            L5.s$a r6 = L5.s.f6498b
            java.lang.Object r6 = L5.t.a(r7)
            java.lang.Object r6 = L5.s.b(r6)
        L90:
            java.lang.Throwable r7 = L5.s.e(r6)
            if (r7 != 0) goto L9b
            j2.K r6 = (j2.AbstractC3059K) r6
            com.stripe.android.googlepaylauncher.f$b r6 = com.stripe.android.googlepaylauncher.f.b.f23859a
            goto La0
        L9b:
            com.stripe.android.googlepaylauncher.f$c r6 = new com.stripe.android.googlepaylauncher.f$c
            r6.<init>(r7)
        La0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.g.o(int, android.content.Intent, P5.d):java.lang.Object");
    }

    public final Object p(P5.d dVar) {
        return AbstractC3360h.u(this.f23869g.isReady(), dVar);
    }

    public final void q() {
        t(true);
        this.f23875m.d(null);
    }

    public final void r(int i8, Intent data) {
        AbstractC3159y.i(data, "data");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), this.f23872j, null, new h(i8, data, null), 2, null);
    }

    public final void u(com.stripe.android.googlepaylauncher.f result) {
        AbstractC3159y.i(result, "result");
        this.f23873k.d(result);
    }
}
