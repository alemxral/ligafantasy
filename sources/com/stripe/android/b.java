package com.stripe.android;

import L5.I;
import L5.p;
import L5.t;
import M5.AbstractC1246t;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import b3.InterfaceC1874i;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.stripe.android.a;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.view.InterfaceC2464p;
import e3.InterfaceC2579a;
import e3.m;
import f3.C2660a;
import f3.C2661b;
import f3.C2666g;
import f3.j;
import i6.AbstractC2825i;
import i6.M;
import j2.s;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l3.C3171a;
import l3.InterfaceC3178h;
import r2.InterfaceC3684d;
import t2.AbstractC3790k;
import w0.AbstractC3839a;
import x2.InterfaceC3873c;
import x2.j;

/* loaded from: classes4.dex */
public final class b implements s {

    /* renamed from: q, reason: collision with root package name */
    public static final a f23453q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f23454r = 8;

    /* renamed from: s, reason: collision with root package name */
    private static final List f23455s = AbstractC1246t.e("payment_method");

    /* renamed from: t, reason: collision with root package name */
    private static final long f23456t = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f23457a;

    /* renamed from: b, reason: collision with root package name */
    private final m f23458b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23459c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3873c f23460d;

    /* renamed from: e, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f23461e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC2579a f23462f;

    /* renamed from: g, reason: collision with root package name */
    private final P5.g f23463g;

    /* renamed from: h, reason: collision with root package name */
    private final C2661b f23464h;

    /* renamed from: i, reason: collision with root package name */
    private final C2666g f23465i;

    /* renamed from: j, reason: collision with root package name */
    private final j f23466j;

    /* renamed from: k, reason: collision with root package name */
    private final C2660a f23467k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f23468l;

    /* renamed from: m, reason: collision with root package name */
    private ActivityResultLauncher f23469m;

    /* renamed from: n, reason: collision with root package name */
    private final Function1 f23470n;

    /* renamed from: o, reason: collision with root package name */
    private final Map f23471o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3178h f23472p;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final long a() {
            return b.f23456t;
        }

        public final /* synthetic */ int b(InterfaceC1874i params) {
            AbstractC3159y.i(params, "params");
            if (params instanceof com.stripe.android.model.b) {
                return DefaultLoadControl.DEFAULT_MAX_BUFFER_MS;
            }
            if (params instanceof com.stripe.android.model.c) {
                return 50001;
            }
            throw new p();
        }

        public final /* synthetic */ int c(StripeIntent intent) {
            AbstractC3159y.i(intent, "intent");
            if (intent instanceof n) {
                return DefaultLoadControl.DEFAULT_MAX_BUFFER_MS;
            }
            return 50001;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0452b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f23473a;

        /* renamed from: c, reason: collision with root package name */
        int f23475c;

        C0452b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23473a = obj;
            this.f23475c |= Integer.MIN_VALUE;
            Object m8 = b.this.m(null, null, this);
            return m8 == Q5.b.e() ? m8 : L5.s.a(m8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f23476a;

        /* renamed from: c, reason: collision with root package name */
        int f23478c;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23476a = obj;
            this.f23478c |= Integer.MIN_VALUE;
            Object n8 = b.this.n(null, null, this);
            return n8 == Q5.b.e() ? n8 : L5.s.a(n8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f23479a;

        /* renamed from: c, reason: collision with root package name */
        int f23481c;

        d(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23479a = obj;
            this.f23481c |= Integer.MIN_VALUE;
            Object d8 = b.this.d(null, this);
            return d8 == Q5.b.e() ? d8 : L5.s.a(d8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f23482a;

        /* renamed from: c, reason: collision with root package name */
        int f23484c;

        e(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23482a = obj;
            this.f23484c |= Integer.MIN_VALUE;
            Object e8 = b.this.e(null, this);
            return e8 == Q5.b.e() ? e8 : L5.s.a(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f23485a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2464p f23487c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Throwable f23488d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f23489e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC2464p interfaceC2464p, Throwable th, int i8, P5.d dVar) {
            super(2, dVar);
            this.f23487c = interfaceC2464p;
            this.f23488d = th;
            this.f23489e = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f23487c, this.f23488d, this.f23489e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f23485a == 0) {
                t.b(obj);
                ((com.stripe.android.a) b.this.f23470n.invoke(this.f23487c)).a(new a.AbstractC0444a.b(AbstractC3790k.f38210e.b(this.f23488d), this.f23489e));
                return I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3160z implements Function1 {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.a invoke(InterfaceC2464p host) {
            AbstractC3159y.i(host, "host");
            ActivityResultLauncher activityResultLauncher = b.this.f23469m;
            if (activityResultLauncher != null) {
                return new a.c(activityResultLauncher);
            }
            return new a.b(host);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f23491a;

        /* renamed from: b, reason: collision with root package name */
        Object f23492b;

        /* renamed from: c, reason: collision with root package name */
        Object f23493c;

        /* renamed from: d, reason: collision with root package name */
        Object f23494d;

        /* renamed from: e, reason: collision with root package name */
        Object f23495e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23496f;

        /* renamed from: h, reason: collision with root package name */
        int f23498h;

        h(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23496f = obj;
            this.f23498h |= Integer.MIN_VALUE;
            return b.this.c(null, null, null, this);
        }
    }

    public b(Context context, Function0 publishableKeyProvider, m stripeRepository, boolean z8, P5.g workContext, InterfaceC3873c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, InterfaceC2579a alipayRepository, P5.g uiContext) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3159y.i(stripeRepository, "stripeRepository");
        AbstractC3159y.i(workContext, "workContext");
        AbstractC3159y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3159y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3159y.i(alipayRepository, "alipayRepository");
        AbstractC3159y.i(uiContext, "uiContext");
        this.f23457a = publishableKeyProvider;
        this.f23458b = stripeRepository;
        this.f23459c = z8;
        this.f23460d = analyticsRequestExecutor;
        this.f23461e = paymentAnalyticsRequestFactory;
        this.f23462f = alipayRepository;
        this.f23463g = uiContext;
        this.f23464h = new C2661b(context);
        InterfaceC3684d.a aVar = InterfaceC3684d.f37551a;
        this.f23465i = new C2666g(context, publishableKeyProvider, stripeRepository, aVar.a(z8), workContext);
        this.f23466j = new j(context, publishableKeyProvider, stripeRepository, aVar.a(z8), workContext);
        this.f23467k = C2660a.f30995b.a(context);
        boolean c8 = AbstractC3839a.c(context);
        this.f23468l = c8;
        this.f23470n = new g();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f23471o = linkedHashMap;
        this.f23472p = C3171a.f33867h.a(context, paymentAnalyticsRequestFactory, z8, workContext, uiContext, linkedHashMap, publishableKeyProvider, paymentAnalyticsRequestFactory.y(), c8, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(Function0 tmp0) {
        AbstractC3159y.i(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(com.stripe.android.model.b r5, x2.j.c r6, P5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.b.C0452b
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.b$b r0 = (com.stripe.android.b.C0452b) r0
            int r1 = r0.f23475c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23475c = r1
            goto L18
        L13:
            com.stripe.android.b$b r0 = new com.stripe.android.b$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f23473a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f23475c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r7)
            L5.s r7 = (L5.s) r7
            java.lang.Object r5 = r7.k()
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            L5.t.b(r7)
            e3.m r7 = r4.f23458b
            com.stripe.android.model.b r5 = r5.C(r3)
            java.util.List r2 = com.stripe.android.b.f23455s
            r0.f23475c = r3
            java.lang.Object r5 = r7.s(r5, r6, r2, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.m(com.stripe.android.model.b, x2.j$c, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(com.stripe.android.model.c r5, x2.j.c r6, P5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.b.c
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.b$c r0 = (com.stripe.android.b.c) r0
            int r1 = r0.f23478c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23478c = r1
            goto L18
        L13:
            com.stripe.android.b$c r0 = new com.stripe.android.b$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f23476a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f23478c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r7)
            L5.s r7 = (L5.s) r7
            java.lang.Object r5 = r7.k()
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            L5.t.b(r7)
            e3.m r7 = r4.f23458b
            com.stripe.android.model.c r5 = r5.C(r3)
            java.util.List r2 = com.stripe.android.b.f23455s
            r0.f23478c = r3
            java.lang.Object r5 = r7.e(r5, r6, r2, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.n(com.stripe.android.model.c, x2.j$c, P5.d):java.lang.Object");
    }

    private final Object o(InterfaceC2464p interfaceC2464p, int i8, Throwable th, P5.d dVar) {
        Object g8 = AbstractC2825i.g(this.f23463g, new f(interfaceC2464p, th, i8, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    private final void q(String str) {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        if (AbstractC3159y.d(str, this.f23467k.a())) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f24813O;
        } else if (str == null) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f24812N;
        } else {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f24814P;
        }
        this.f23460d.a(PaymentAnalyticsRequestFactory.v(this.f23461e, paymentAnalyticsEvent, null, null, null, null, null, 62, null));
    }

    @Override // j2.s
    public boolean a(int i8, Intent intent) {
        return i8 == 50001 && intent != null;
    }

    @Override // j2.s
    public boolean b(int i8, Intent intent) {
        return i8 == 50000 && intent != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // j2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(com.stripe.android.view.InterfaceC2464p r10, b3.InterfaceC1874i r11, x2.j.c r12, P5.d r13) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.c(com.stripe.android.view.p, b3.i, x2.j$c, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(android.content.Intent r5, P5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.stripe.android.b.d
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.b$d r0 = (com.stripe.android.b.d) r0
            int r1 = r0.f23481c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23481c = r1
            goto L18
        L13:
            com.stripe.android.b$d r0 = new com.stripe.android.b$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f23479a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f23481c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r6)
            L5.s r6 = (L5.s) r6
            java.lang.Object r5 = r6.k()
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            L5.t.b(r6)
            f3.g r6 = r4.f23465i
            f3.c$a r2 = f3.C2662c.f30998h
            f3.c r5 = r2.b(r5)
            r0.f23481c = r3
            java.lang.Object r5 = r6.p(r5, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.d(android.content.Intent, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(android.content.Intent r5, P5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.stripe.android.b.e
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.b$e r0 = (com.stripe.android.b.e) r0
            int r1 = r0.f23484c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23484c = r1
            goto L18
        L13:
            com.stripe.android.b$e r0 = new com.stripe.android.b$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f23482a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f23484c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r6)
            L5.s r6 = (L5.s) r6
            java.lang.Object r5 = r6.k()
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            L5.t.b(r6)
            f3.j r6 = r4.f23466j
            f3.c$a r2 = f3.C2662c.f30998h
            f3.c r5 = r2.b(r5)
            r0.f23484c = r3
            java.lang.Object r5 = r6.p(r5, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.e(android.content.Intent, P5.d):java.lang.Object");
    }

    public Object p(InterfaceC2464p interfaceC2464p, StripeIntent stripeIntent, j.c cVar, P5.d dVar) {
        Object d8 = this.f23472p.a(stripeIntent).d(interfaceC2464p, stripeIntent, cVar, dVar);
        if (d8 == Q5.b.e()) {
            return d8;
        }
        return I.f6474a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ b(android.content.Context r13, final kotlin.jvm.functions.Function0 r14, e3.m r15, boolean r16, P5.g r17, x2.InterfaceC3873c r18, com.stripe.android.networking.PaymentAnalyticsRequestFactory r19, e3.InterfaceC2579a r20, P5.g r21, int r22, kotlin.jvm.internal.AbstractC3151p r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 8
            if (r1 == 0) goto L9
            r1 = 0
            r6 = 0
            goto Lb
        L9:
            r6 = r16
        Lb:
            r1 = r0 & 16
            if (r1 == 0) goto L15
            i6.I r1 = i6.C2812b0.b()
            r7 = r1
            goto L17
        L15:
            r7 = r17
        L17:
            r1 = r0 & 32
            if (r1 == 0) goto L28
            x2.m r1 = new x2.m
            r2.d$a r2 = r2.InterfaceC3684d.f37551a
            r2.d r2 = r2.a(r6)
            r1.<init>(r2, r7)
            r8 = r1
            goto L2a
        L28:
            r8 = r18
        L2a:
            r1 = r0 & 64
            if (r1 == 0) goto L44
            com.stripe.android.networking.PaymentAnalyticsRequestFactory r1 = new com.stripe.android.networking.PaymentAnalyticsRequestFactory
            android.content.Context r2 = r13.getApplicationContext()
            java.lang.String r3 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC3159y.h(r2, r3)
            j2.L r3 = new j2.L
            r4 = r14
            r3.<init>()
            r1.<init>(r2, r3)
            r9 = r1
            goto L47
        L44:
            r4 = r14
            r9 = r19
        L47:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L53
            e3.b r1 = new e3.b
            r5 = r15
            r1.<init>(r15)
            r10 = r1
            goto L56
        L53:
            r5 = r15
            r10 = r20
        L56:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L60
            i6.J0 r0 = i6.C2812b0.c()
            r11 = r0
            goto L62
        L60:
            r11 = r21
        L62:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.<init>(android.content.Context, kotlin.jvm.functions.Function0, e3.m, boolean, P5.g, x2.c, com.stripe.android.networking.PaymentAnalyticsRequestFactory, e3.a, P5.g, int, kotlin.jvm.internal.p):void");
    }
}
