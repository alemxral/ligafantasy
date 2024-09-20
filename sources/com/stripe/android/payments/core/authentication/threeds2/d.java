package com.stripe.android.payments.core.authentication.threeds2;

import L5.I;
import L5.s;
import L5.t;
import P5.g;
import X3.n;
import X3.p;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import b3.C1861F;
import b3.C1862G;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.model.x;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.authentication.threeds2.a;
import com.stripe.android.stripe3ds2.transaction.h;
import e3.m;
import f3.C2662c;
import i6.AbstractC2825i;
import i6.M;
import i6.X;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import x2.InterfaceC3873c;
import x2.j;

/* loaded from: classes4.dex */
public final class d extends ViewModel {

    /* renamed from: n, reason: collision with root package name */
    private static final a f25200n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f25201o = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Stripe3ds2TransactionContract.a f25202a;

    /* renamed from: b, reason: collision with root package name */
    private final m f25203b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3873c f25204c;

    /* renamed from: d, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f25205d;

    /* renamed from: e, reason: collision with root package name */
    private final W3.a f25206e;

    /* renamed from: f, reason: collision with root package name */
    private final p f25207f;

    /* renamed from: g, reason: collision with root package name */
    private final m3.d f25208g;

    /* renamed from: h, reason: collision with root package name */
    private final n f25209h;

    /* renamed from: i, reason: collision with root package name */
    private final g f25210i;

    /* renamed from: j, reason: collision with root package name */
    private final SavedStateHandle f25211j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f25212k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f25213l;

    /* renamed from: m, reason: collision with root package name */
    private final j.c f25214m;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f25215a;

        /* renamed from: b, reason: collision with root package name */
        Object f25216b;

        /* renamed from: c, reason: collision with root package name */
        Object f25217c;

        /* renamed from: d, reason: collision with root package name */
        int f25218d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f25219e;

        /* renamed from: g, reason: collision with root package name */
        int f25221g;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25219e = obj;
            this.f25221g |= Integer.MIN_VALUE;
            return d.this.e(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25222a;

        /* renamed from: c, reason: collision with root package name */
        int f25224c;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25222a = obj;
            this.f25224c |= Integer.MIN_VALUE;
            Object k8 = d.this.k(null, null, null, 0, this);
            return k8 == Q5.b.e() ? k8 : s.a(k8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.payments.core.authentication.threeds2.d$d, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0551d extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f25225a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X3.s f25226b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f25227c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f25228d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f25229e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j.c f25230f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0551d(X3.s sVar, x xVar, int i8, d dVar, j.c cVar, P5.d dVar2) {
            super(2, dVar2);
            this.f25226b = sVar;
            this.f25227c = xVar;
            this.f25228d = i8;
            this.f25229e = dVar;
            this.f25230f = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0551d(this.f25226b, this.f25227c, this.f25228d, this.f25229e, this.f25230f, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0551d) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            Object e8 = Q5.b.e();
            int i8 = this.f25225a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        b8 = ((s) obj).k();
                        return s.a(b8);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                X3.s sVar = this.f25226b;
                this.f25225a = 1;
                obj = sVar.b(this);
                if (obj == e8) {
                    return e8;
                }
            }
            X3.c cVar = (X3.c) obj;
            C1861F c1861f = new C1861F(this.f25227c.e(), cVar.e(), cVar.i(), cVar.j().b(), cVar.b(), cVar.f(), cVar.c(), this.f25228d, null);
            m mVar = this.f25229e.f25203b;
            j.c cVar2 = this.f25230f;
            this.f25225a = 2;
            b8 = mVar.b(c1861f, cVar2, this);
            if (b8 == e8) {
                return e8;
            }
            return s.a(b8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f25231a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f25232b;

        /* renamed from: d, reason: collision with root package name */
        int f25234d;

        e(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25232b = obj;
            this.f25234d |= Integer.MIN_VALUE;
            return d.this.m(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f25235a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1862G.a f25236b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ X3.s f25237c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f25238d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f25239e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f25240f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C1862G.a aVar, X3.s sVar, int i8, d dVar, String str, P5.d dVar2) {
            super(2, dVar2);
            this.f25236b = aVar;
            this.f25237c = sVar;
            this.f25238d = i8;
            this.f25239e = dVar;
            this.f25240f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f25236b, this.f25237c, this.f25238d, this.f25239e, this.f25240f, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f25235a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                long a8 = com.stripe.android.b.f23453q.a();
                this.f25235a = 1;
                if (X.b(a8, this) == e8) {
                    return e8;
                }
            }
            X3.e eVar = new X3.e(this.f25236b.e(), this.f25236b.c(), null, this.f25236b.b(), null, 20, null);
            X3.s sVar = this.f25237c;
            int i9 = this.f25238d;
            String d8 = this.f25239e.f25202a.s().d();
            if (d8 == null) {
                d8 = "";
            }
            return new a.b(sVar.a(eVar, i9, new com.stripe.android.stripe3ds2.transaction.n(d8, this.f25240f, this.f25239e.g().e(), this.f25239e.g().j())));
        }
    }

    public d(Stripe3ds2TransactionContract.a args, m stripeRepository, InterfaceC3873c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, W3.a threeDs2Service, p messageVersionRegistry, m3.d challengeResultProcessor, n initChallengeRepository, g workContext, SavedStateHandle savedStateHandle, boolean z8) {
        j.c k8;
        AbstractC3159y.i(args, "args");
        AbstractC3159y.i(stripeRepository, "stripeRepository");
        AbstractC3159y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3159y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3159y.i(threeDs2Service, "threeDs2Service");
        AbstractC3159y.i(messageVersionRegistry, "messageVersionRegistry");
        AbstractC3159y.i(challengeResultProcessor, "challengeResultProcessor");
        AbstractC3159y.i(initChallengeRepository, "initChallengeRepository");
        AbstractC3159y.i(workContext, "workContext");
        AbstractC3159y.i(savedStateHandle, "savedStateHandle");
        this.f25202a = args;
        this.f25203b = stripeRepository;
        this.f25204c = analyticsRequestExecutor;
        this.f25205d = paymentAnalyticsRequestFactory;
        this.f25206e = threeDs2Service;
        this.f25207f = messageVersionRegistry;
        this.f25208g = challengeResultProcessor;
        this.f25209h = initChallengeRepository;
        this.f25210i = workContext;
        this.f25211j = savedStateHandle;
        this.f25212k = z8;
        this.f25213l = savedStateHandle.contains("key_next_step");
        String c8 = args.f().c();
        if (c8 != null) {
            String str = c8.length() <= 0 ? null : c8;
            if (str != null) {
                k8 = new j.c(str, null, null, 6, null);
                this.f25214m = k8;
            }
        }
        k8 = args.k();
        this.f25214m = k8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(com.stripe.android.model.x r25, P5.d r26) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.d.e(com.stripe.android.model.x, P5.d):java.lang.Object");
    }

    private final com.stripe.android.payments.core.authentication.threeds2.a i(String str) {
        String str2;
        String str3;
        this.f25204c.a(PaymentAnalyticsRequestFactory.v(this.f25205d, PaymentAnalyticsEvent.f24842q0, null, null, null, null, null, 62, null));
        String id = this.f25202a.s().getId();
        if (id == null) {
            str2 = "";
        } else {
            str2 = id;
        }
        int c8 = com.stripe.android.b.f23453q.c(this.f25202a.s());
        String d8 = this.f25202a.s().d();
        if (d8 == null) {
            str3 = "";
        } else {
            str3 = d8;
        }
        return new a.c(new PaymentBrowserAuthContract.a(str2, c8, str3, str, null, this.f25202a.c(), null, this.f25202a.k().j(), true, false, this.f25202a.o(), this.f25214m.e(), this.f25212k, null, false, 25152, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(X3.s r14, com.stripe.android.model.x r15, x2.j.c r16, int r17, P5.d r18) {
        /*
            r13 = this;
            r7 = r13
            r0 = r18
            boolean r1 = r0 instanceof com.stripe.android.payments.core.authentication.threeds2.d.c
            if (r1 == 0) goto L17
            r1 = r0
            com.stripe.android.payments.core.authentication.threeds2.d$c r1 = (com.stripe.android.payments.core.authentication.threeds2.d.c) r1
            int r2 = r1.f25224c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f25224c = r2
        L15:
            r8 = r1
            goto L1d
        L17:
            com.stripe.android.payments.core.authentication.threeds2.d$c r1 = new com.stripe.android.payments.core.authentication.threeds2.d$c
            r1.<init>(r0)
            goto L15
        L1d:
            java.lang.Object r0 = r8.f25222a
            java.lang.Object r9 = Q5.b.e()
            int r1 = r8.f25224c
            r10 = 1
            if (r1 == 0) goto L36
            if (r1 != r10) goto L2e
            L5.t.b(r0)
            goto L52
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            L5.t.b(r0)
            P5.g r11 = r7.f25210i
            com.stripe.android.payments.core.authentication.threeds2.d$d r12 = new com.stripe.android.payments.core.authentication.threeds2.d$d
            r6 = 0
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r17
            r4 = r13
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.f25224c = r10
            java.lang.Object r0 = i6.AbstractC2825i.g(r11, r12, r8)
            if (r0 != r9) goto L52
            return r9
        L52:
            L5.s r0 = (L5.s) r0
            java.lang.Object r0 = r0.k()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.d.k(X3.s, com.stripe.android.model.x, x2.j$c, int, P5.d):java.lang.Object");
    }

    private final com.stripe.android.payments.core.authentication.threeds2.a o() {
        this.f25204c.a(PaymentAnalyticsRequestFactory.v(this.f25205d, PaymentAnalyticsEvent.f24820V, null, null, null, null, null, 62, null));
        return new a.C0550a(new C2662c(this.f25202a.s().d(), 0, null, false, null, null, this.f25202a.k().j(), 62, null));
    }

    public final boolean f() {
        return this.f25213l;
    }

    public final j.c g() {
        return this.f25214m;
    }

    public final Object h(X3.m mVar, P5.d dVar) {
        return this.f25209h.a(mVar, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:
    
        if (r11 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(b3.C1862G r11, X3.s r12, java.lang.String r13, int r14, P5.d r15) {
        /*
            r10 = this;
            b3.G$a r1 = r11.b()
            if (r1 == 0) goto L26
            boolean r11 = r1.f()
            if (r11 == 0) goto L20
            r0 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            java.lang.Object r11 = r0.n(r1, r2, r3, r4, r5)
            java.lang.Object r12 = Q5.b.e()
            if (r11 != r12) goto L1c
            return r11
        L1c:
            com.stripe.android.payments.core.authentication.threeds2.a r11 = (com.stripe.android.payments.core.authentication.threeds2.a) r11
            goto Lde
        L20:
            com.stripe.android.payments.core.authentication.threeds2.a r11 = r10.o()
            goto Lde
        L26:
            java.lang.String r12 = r11.e()
            if (r12 == 0) goto L36
            java.lang.String r11 = r11.e()
            com.stripe.android.payments.core.authentication.threeds2.a r11 = r10.i(r11)
            goto Lde
        L36:
            b3.G$d r11 = r11.c()
            if (r11 == 0) goto Lab
            java.lang.String r12 = r11.b()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Code: "
            r13.append(r14)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            java.lang.String r13 = r11.f()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Detail: "
            r14.append(r15)
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            java.lang.String r14 = r11.e()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "Description: "
            r15.append(r0)
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            java.lang.String r11 = r11.c()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "Component: "
            r15.append(r0)
            r15.append(r11)
            java.lang.String r11 = r15.toString()
            java.lang.String[] r11 = new java.lang.String[]{r12, r13, r14, r11}
            java.util.List r11 = M5.AbstractC1246t.p(r11)
            r0 = r11
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r7 = 62
            r8 = 0
            java.lang.String r1 = ", "
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r11 = M5.AbstractC1246t.w0(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 != 0) goto Lad
        Lab:
            java.lang.String r11 = "Invalid 3DS2 authentication response"
        Lad:
            com.stripe.android.payments.core.authentication.threeds2.a$a r12 = new com.stripe.android.payments.core.authentication.threeds2.a$a
            f3.c r13 = new f3.c
            t2.k$a r14 = t2.AbstractC3790k.f38210e
            java.lang.RuntimeException r15 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error encountered during 3DS2 authentication request. "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r15.<init>(r11)
            t2.k r3 = r14.b(r15)
            r8 = 123(0x7b, float:1.72E-43)
            r9 = 0
            r1 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r12.<init>(r13)
            r11 = r12
        Lde:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.d.j(b3.G, X3.s, java.lang.String, int, P5.d):java.lang.Object");
    }

    public final Object l(h hVar, P5.d dVar) {
        return this.f25208g.a(hVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(P5.d r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.stripe.android.payments.core.authentication.threeds2.d.e
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.payments.core.authentication.threeds2.d$e r0 = (com.stripe.android.payments.core.authentication.threeds2.d.e) r0
            int r1 = r0.f25234d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25234d = r1
            goto L18
        L13:
            com.stripe.android.payments.core.authentication.threeds2.d$e r0 = new com.stripe.android.payments.core.authentication.threeds2.d$e
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f25232b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f25234d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f25231a
            com.stripe.android.payments.core.authentication.threeds2.d r0 = (com.stripe.android.payments.core.authentication.threeds2.d) r0
            L5.t.b(r15)     // Catch: java.lang.Throwable -> L2d
            goto L68
        L2d:
            r15 = move-exception
            goto L71
        L2f:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L37:
            L5.t.b(r15)
            x2.c r15 = r14.f25204c
            com.stripe.android.networking.PaymentAnalyticsRequestFactory r4 = r14.f25205d
            com.stripe.android.networking.PaymentAnalyticsEvent r5 = com.stripe.android.networking.PaymentAnalyticsEvent.f24818T
            r11 = 62
            r12 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            x2.b r2 = com.stripe.android.networking.PaymentAnalyticsRequestFactory.v(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r15.a(r2)
            L5.s$a r15 = L5.s.f6498b     // Catch: java.lang.Throwable -> L6f
            com.stripe.android.model.x r15 = new com.stripe.android.model.x     // Catch: java.lang.Throwable -> L6f
            com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract$a r2 = r14.f25202a     // Catch: java.lang.Throwable -> L6f
            com.stripe.android.model.StripeIntent$a$j$b r2 = r2.f()     // Catch: java.lang.Throwable -> L6f
            r15.<init>(r2)     // Catch: java.lang.Throwable -> L6f
            r0.f25231a = r14     // Catch: java.lang.Throwable -> L6f
            r0.f25234d = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r15 = r14.e(r15, r0)     // Catch: java.lang.Throwable -> L6f
            if (r15 != r1) goto L67
            return r1
        L67:
            r0 = r14
        L68:
            com.stripe.android.payments.core.authentication.threeds2.a r15 = (com.stripe.android.payments.core.authentication.threeds2.a) r15     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r15 = L5.s.b(r15)     // Catch: java.lang.Throwable -> L2d
            goto L7b
        L6f:
            r15 = move-exception
            r0 = r14
        L71:
            L5.s$a r1 = L5.s.f6498b
            java.lang.Object r15 = L5.t.a(r15)
            java.lang.Object r15 = L5.s.b(r15)
        L7b:
            java.lang.Throwable r1 = L5.s.e(r15)
            if (r1 != 0) goto L82
            goto Laf
        L82:
            x2.c r15 = r0.f25204c
            com.stripe.android.networking.PaymentAnalyticsRequestFactory r4 = r0.f25205d
            com.stripe.android.networking.PaymentAnalyticsEvent r5 = com.stripe.android.networking.PaymentAnalyticsEvent.f24817S
            r11 = 62
            r12 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            x2.b r2 = com.stripe.android.networking.PaymentAnalyticsRequestFactory.v(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r15.a(r2)
            com.stripe.android.payments.core.authentication.threeds2.a$a r15 = new com.stripe.android.payments.core.authentication.threeds2.a$a
            f3.c r2 = new f3.c
            t2.k$a r4 = t2.AbstractC3790k.f38210e
            t2.k r7 = r4.b(r1)
            r12 = 123(0x7b, float:1.72E-43)
            r13 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r11 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15.<init>(r2)
        Laf:
            r1 = r15
            com.stripe.android.payments.core.authentication.threeds2.a r1 = (com.stripe.android.payments.core.authentication.threeds2.a) r1
            androidx.lifecycle.SavedStateHandle r1 = r0.f25211j
            java.lang.String r2 = "key_next_step"
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r3)
            r1.set(r2, r4)
            r0.f25213l = r3
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.d.m(P5.d):java.lang.Object");
    }

    public final Object n(C1862G.a aVar, X3.s sVar, String str, int i8, P5.d dVar) {
        return AbstractC2825i.g(this.f25210i, new f(aVar, sVar, i8, this, str, null), dVar);
    }
}
