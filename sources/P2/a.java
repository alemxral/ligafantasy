package P2;

import K2.f;
import L5.I;
import L5.s;
import L5.t;
import L5.x;
import M5.Q;
import X5.n;
import b3.C1876k;
import b3.InterfaceC1877l;
import b3.r;
import com.stripe.android.model.p;
import e3.m;
import i6.M;
import java.util.Locale;
import java.util.Map;
import k3.i;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import t2.AbstractC3790k;
import x2.j;

/* loaded from: classes4.dex */
public final class a implements P2.c {

    /* renamed from: h, reason: collision with root package name */
    private static final C0169a f7850h = new C0169a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f7851i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f7852a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f7853b;

    /* renamed from: c, reason: collision with root package name */
    private final m f7854c;

    /* renamed from: d, reason: collision with root package name */
    private final O3.a f7855d;

    /* renamed from: e, reason: collision with root package name */
    private final P5.g f7856e;

    /* renamed from: f, reason: collision with root package name */
    private final Locale f7857f;

    /* renamed from: g, reason: collision with root package name */
    private final k3.i f7858g;

    /* renamed from: P2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0169a {
        private C0169a() {
        }

        public /* synthetic */ C0169a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f7859a;

        /* renamed from: c, reason: collision with root package name */
        int f7861c;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7859a = obj;
            this.f7861c |= Integer.MIN_VALUE;
            Object b8 = a.this.b(null, null, null, null, null, this);
            if (b8 == Q5.b.e()) {
                return b8;
            }
            return s.a(b8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f7862a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f7864c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f7865d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f7866e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f7867f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ r f7868g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, String str3, String str4, r rVar, P5.d dVar) {
            super(2, dVar);
            this.f7864c = str;
            this.f7865d = str2;
            this.f7866e = str3;
            this.f7867f = str4;
            this.f7868g = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f7864c, this.f7865d, this.f7866e, this.f7867f, this.f7868g, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c8;
            Object e8 = Q5.b.e();
            int i8 = this.f7862a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                    c8 = ((s) obj).k();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                O3.a aVar = a.this.f7855d;
                Locale locale = a.this.f7857f;
                j.c l8 = a.l(a.this, null, 1, null);
                String str = this.f7864c;
                String str2 = this.f7865d;
                String str3 = this.f7866e;
                String str4 = this.f7867f;
                r rVar = this.f7868g;
                this.f7862a = 1;
                c8 = aVar.c(str, str2, str3, str4, locale, "android_payment_element", rVar, l8, this);
                if (c8 == e8) {
                    return e8;
                }
            }
            return s.a(c8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f7869a;

        /* renamed from: c, reason: collision with root package name */
        int f7871c;

        d(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7869a = obj;
            this.f7871c |= Integer.MIN_VALUE;
            Object a8 = a.this.a(null, null, null, null, null, false, this);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return s.a(a8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f7872a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f7874c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p f7875d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f7876e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f7877f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f7878g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, p pVar, String str2, boolean z8, String str3, P5.d dVar) {
            super(2, dVar);
            this.f7874c = str;
            this.f7875d = pVar;
            this.f7876e = str2;
            this.f7877f = z8;
            this.f7878g = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f7874c, this.f7875d, this.f7876e, this.f7877f, this.f7878g, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0092  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r9.f7872a
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                L5.t.b(r10)
                L5.s r10 = (L5.s) r10
                java.lang.Object r10 = r10.k()
                goto L4b
            L15:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1d:
                L5.t.b(r10)
                P2.a r10 = P2.a.this
                O3.a r3 = P2.a.g(r10)
                java.lang.String r4 = r9.f7874c
                b3.l$a r5 = new b3.l$a
                com.stripe.android.model.p r10 = r9.f7875d
                java.util.Map r10 = r10.y()
                java.lang.String r1 = r9.f7876e
                boolean r6 = r9.f7877f
                r5.<init>(r10, r1, r6)
                P2.a r10 = P2.a.this
                java.lang.String r1 = r9.f7878g
                x2.j$c r7 = P2.a.f(r10, r1)
                r9.f7872a = r2
                java.lang.String r6 = "android_payment_element"
                r8 = r9
                java.lang.Object r10 = r3.b(r4, r5, r6, r7, r8)
                if (r10 != r0) goto L4b
                return r0
            L4b:
                com.stripe.android.model.p r0 = r9.f7875d
                java.lang.String r1 = r9.f7874c
                boolean r2 = L5.s.h(r10)
                if (r2 == 0) goto L86
                b3.k r10 = (b3.C1876k) r10     // Catch: java.lang.Throwable -> L7f
                java.util.List r10 = r10.b()     // Catch: java.lang.Throwable -> L7f
                java.lang.Object r10 = M5.AbstractC1246t.m0(r10)     // Catch: java.lang.Throwable -> L7f
                b3.k$e r10 = (b3.C1876k.e) r10     // Catch: java.lang.Throwable -> L7f
                b3.l$a$a r2 = b3.InterfaceC1877l.a.f14480d     // Catch: java.lang.Throwable -> L7f
                java.util.Map r3 = r0.y()     // Catch: java.lang.Throwable -> L7f
                java.util.Map r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L7f
                com.stripe.android.model.p$e r3 = com.stripe.android.model.p.f24568u     // Catch: java.lang.Throwable -> L7f
                java.lang.String r4 = r10.getId()     // Catch: java.lang.Throwable -> L7f
                com.stripe.android.model.p r1 = r3.l(r4, r1, r2)     // Catch: java.lang.Throwable -> L7f
                K2.f$a r2 = new K2.f$a     // Catch: java.lang.Throwable -> L7f
                r2.<init>(r10, r1, r0)     // Catch: java.lang.Throwable -> L7f
                java.lang.Object r10 = L5.s.b(r2)     // Catch: java.lang.Throwable -> L7f
                goto L8a
            L7f:
                r10 = move-exception
                L5.s$a r0 = L5.s.f6498b
                java.lang.Object r10 = L5.t.a(r10)
            L86:
                java.lang.Object r10 = L5.s.b(r10)
            L8a:
                P2.a r0 = P2.a.this
                java.lang.Throwable r1 = L5.s.e(r10)
                if (r1 == 0) goto La4
                k3.i r2 = P2.a.h(r0)
                k3.i$d r3 = k3.i.d.f33390j
                t2.k$a r0 = t2.AbstractC3790k.f38210e
                t2.k r4 = r0.b(r1)
                r6 = 4
                r7 = 0
                r5 = 0
                k3.i.b.a(r2, r3, r4, r5, r6, r7)
            La4:
                L5.s r10 = L5.s.a(r10)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: P2.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f7879a;

        /* renamed from: c, reason: collision with root package name */
        int f7881c;

        f(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7879a = obj;
            this.f7881c |= Integer.MIN_VALUE;
            Object e8 = a.this.e(null, null, this);
            if (e8 == Q5.b.e()) {
                return e8;
            }
            return s.a(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f7882a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f7884c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f7885d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, String str2, P5.d dVar) {
            super(2, dVar);
            this.f7884c = str;
            this.f7885d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f7884c, this.f7885d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object l8;
            Object e8 = Q5.b.e();
            int i8 = this.f7882a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                    l8 = ((s) obj).k();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                m mVar = a.this.f7854c;
                String str = this.f7884c;
                String str2 = this.f7885d;
                j.c k8 = a.this.k(str2);
                this.f7882a = 1;
                l8 = mVar.l(str, str2, k8, this);
                if (l8 == e8) {
                    return e8;
                }
            }
            return s.a(l8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f7886a;

        /* renamed from: c, reason: collision with root package name */
        int f7888c;

        h(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7886a = obj;
            this.f7888c |= Integer.MIN_VALUE;
            Object d8 = a.this.d(null, this);
            if (d8 == Q5.b.e()) {
                return d8;
            }
            return s.a(d8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f7889a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f7890b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f7892d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, P5.d dVar) {
            super(2, dVar);
            this.f7892d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            i iVar = new i(this.f7892d, dVar);
            iVar.f7890b = obj;
            return iVar;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            Object e8 = Q5.b.e();
            int i8 = this.f7889a;
            try {
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    a aVar = a.this;
                    String str = this.f7892d;
                    s.a aVar2 = s.f6498b;
                    O3.a aVar3 = aVar.f7855d;
                    j.c l8 = a.l(aVar, null, 1, null);
                    this.f7889a = 1;
                    obj = aVar3.a(str, "android_payment_element", l8, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
            } catch (Throwable th) {
                s.a aVar4 = s.f6498b;
                b8 = s.b(t.a(th));
            }
            if (obj != null) {
                b8 = s.b((b3.p) obj);
                return s.a(b8);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f7893a;

        /* renamed from: c, reason: collision with root package name */
        int f7895c;

        j(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7893a = obj;
            this.f7895c |= Integer.MIN_VALUE;
            Object c8 = a.this.c(null, null, null, null, this);
            if (c8 == Q5.b.e()) {
                return c8;
            }
            return s.a(c8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f7896a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f7898c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f7899d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ p f7900e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f7901f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, String str2, p pVar, String str3, P5.d dVar) {
            super(2, dVar);
            this.f7898c = str;
            this.f7899d = str2;
            this.f7900e = pVar;
            this.f7901f = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new k(this.f7898c, this.f7899d, this.f7900e, this.f7901f, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object p8;
            Object b8;
            Object e8 = Q5.b.e();
            int i8 = this.f7896a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                    p8 = ((s) obj).k();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                m mVar = a.this.f7854c;
                String str = this.f7898c;
                String str2 = this.f7899d;
                Map e9 = Q.e(x.a("payment_method_options", InterfaceC1877l.a.f14480d.a(this.f7900e.y())));
                j.c l8 = a.l(a.this, null, 1, null);
                this.f7896a = 1;
                p8 = mVar.p(str, str2, e9, l8, this);
                if (p8 == e8) {
                    return e8;
                }
            }
            a aVar = a.this;
            Throwable e10 = s.e(p8);
            if (e10 != null) {
                i.b.a(aVar.f7858g, i.d.f33391k, AbstractC3790k.f38210e.b(e10), null, 4, null);
            }
            String str3 = this.f7901f;
            String str4 = this.f7898c;
            p pVar = this.f7900e;
            if (s.h(p8)) {
                String str5 = (String) p8;
                b8 = s.b(new f.b(new C1876k.d(str5, str3), p.f24568u.l(str5, str4, InterfaceC1877l.a.f14480d.a(pVar.y()))));
            } else {
                b8 = s.b(p8);
            }
            return s.a(b8);
        }
    }

    public a(Function0 publishableKeyProvider, Function0 stripeAccountIdProvider, m stripeRepository, O3.a consumersApiService, P5.g workContext, Locale locale, k3.i errorReporter) {
        AbstractC3159y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3159y.i(stripeAccountIdProvider, "stripeAccountIdProvider");
        AbstractC3159y.i(stripeRepository, "stripeRepository");
        AbstractC3159y.i(consumersApiService, "consumersApiService");
        AbstractC3159y.i(workContext, "workContext");
        AbstractC3159y.i(errorReporter, "errorReporter");
        this.f7852a = publishableKeyProvider;
        this.f7853b = stripeAccountIdProvider;
        this.f7854c = stripeRepository;
        this.f7855d = consumersApiService;
        this.f7856e = workContext;
        this.f7857f = locale;
        this.f7858g = errorReporter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j.c k(String str) {
        String str2;
        if (str == null) {
            str2 = (String) this.f7852a.invoke();
        } else {
            str2 = str;
        }
        Object invoke = this.f7853b.invoke();
        if (str != null) {
            invoke = null;
        }
        return new j.c(str2, (String) invoke, null, 4, null);
    }

    static /* synthetic */ j.c l(a aVar, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = null;
        }
        return aVar.k(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // P2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.stripe.android.model.p r15, java.lang.String r16, com.stripe.android.model.StripeIntent r17, java.lang.String r18, java.lang.String r19, boolean r20, P5.d r21) {
        /*
            r14 = this;
            r8 = r14
            r0 = r21
            boolean r1 = r0 instanceof P2.a.d
            if (r1 == 0) goto L17
            r1 = r0
            P2.a$d r1 = (P2.a.d) r1
            int r2 = r1.f7871c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f7871c = r2
        L15:
            r9 = r1
            goto L1d
        L17:
            P2.a$d r1 = new P2.a$d
            r1.<init>(r0)
            goto L15
        L1d:
            java.lang.Object r0 = r9.f7869a
            java.lang.Object r10 = Q5.b.e()
            int r1 = r9.f7871c
            r11 = 1
            if (r1 == 0) goto L36
            if (r1 != r11) goto L2e
            L5.t.b(r0)
            goto L55
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            L5.t.b(r0)
            P5.g r12 = r8.f7856e
            P2.a$e r13 = new P2.a$e
            r7 = 0
            r0 = r13
            r1 = r14
            r2 = r18
            r3 = r15
            r4 = r16
            r5 = r20
            r6 = r19
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r9.f7871c = r11
            java.lang.Object r0 = i6.AbstractC2825i.g(r12, r13, r9)
            if (r0 != r10) goto L55
            return r10
        L55:
            L5.s r0 = (L5.s) r0
            java.lang.Object r0 = r0.k()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.a.a(com.stripe.android.model.p, java.lang.String, com.stripe.android.model.StripeIntent, java.lang.String, java.lang.String, boolean, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // P2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, b3.r r19, P5.d r20) {
        /*
            r14 = this;
            r8 = r14
            r0 = r20
            boolean r1 = r0 instanceof P2.a.b
            if (r1 == 0) goto L17
            r1 = r0
            P2.a$b r1 = (P2.a.b) r1
            int r2 = r1.f7861c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f7861c = r2
        L15:
            r9 = r1
            goto L1d
        L17:
            P2.a$b r1 = new P2.a$b
            r1.<init>(r0)
            goto L15
        L1d:
            java.lang.Object r0 = r9.f7859a
            java.lang.Object r10 = Q5.b.e()
            int r1 = r9.f7861c
            r11 = 1
            if (r1 == 0) goto L36
            if (r1 != r11) goto L2e
            L5.t.b(r0)
            goto L55
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            L5.t.b(r0)
            P5.g r12 = r8.f7856e
            P2.a$c r13 = new P2.a$c
            r7 = 0
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r9.f7861c = r11
            java.lang.Object r0 = i6.AbstractC2825i.g(r12, r13, r9)
            if (r0 != r10) goto L55
            return r10
        L55:
            L5.s r0 = (L5.s) r0
            java.lang.Object r0 = r0.k()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.a.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, b3.r, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // P2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(com.stripe.android.model.p r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, P5.d r18) {
        /*
            r13 = this;
            r7 = r13
            r0 = r18
            boolean r1 = r0 instanceof P2.a.j
            if (r1 == 0) goto L17
            r1 = r0
            P2.a$j r1 = (P2.a.j) r1
            int r2 = r1.f7895c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f7895c = r2
        L15:
            r8 = r1
            goto L1d
        L17:
            P2.a$j r1 = new P2.a$j
            r1.<init>(r0)
            goto L15
        L1d:
            java.lang.Object r0 = r8.f7893a
            java.lang.Object r9 = Q5.b.e()
            int r1 = r8.f7895c
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
            P5.g r11 = r7.f7856e
            P2.a$k r12 = new P2.a$k
            r6 = 0
            r0 = r12
            r1 = r13
            r2 = r17
            r3 = r15
            r4 = r14
            r5 = r16
            r0.<init>(r2, r3, r4, r5, r6)
            r8.f7895c = r10
            java.lang.Object r0 = i6.AbstractC2825i.g(r11, r12, r8)
            if (r0 != r9) goto L52
            return r9
        L52:
            L5.s r0 = (L5.s) r0
            java.lang.Object r0 = r0.k()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.a.c(com.stripe.android.model.p, java.lang.String, java.lang.String, java.lang.String, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // P2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(java.lang.String r6, P5.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof P2.a.h
            if (r0 == 0) goto L13
            r0 = r7
            P2.a$h r0 = (P2.a.h) r0
            int r1 = r0.f7888c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7888c = r1
            goto L18
        L13:
            P2.a$h r0 = new P2.a$h
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f7886a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f7888c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            L5.t.b(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            L5.t.b(r7)
            P5.g r7 = r5.f7856e
            P2.a$i r2 = new P2.a$i
            r4 = 0
            r2.<init>(r6, r4)
            r0.f7888c = r3
            java.lang.Object r7 = i6.AbstractC2825i.g(r7, r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            L5.s r7 = (L5.s) r7
            java.lang.Object r6 = r7.k()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.a.d(java.lang.String, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // P2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(java.lang.String r6, java.lang.String r7, P5.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof P2.a.f
            if (r0 == 0) goto L13
            r0 = r8
            P2.a$f r0 = (P2.a.f) r0
            int r1 = r0.f7881c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7881c = r1
            goto L18
        L13:
            P2.a$f r0 = new P2.a$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f7879a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f7881c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            L5.t.b(r8)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            L5.t.b(r8)
            P5.g r8 = r5.f7856e
            P2.a$g r2 = new P2.a$g
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.f7881c = r3
            java.lang.Object r8 = i6.AbstractC2825i.g(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            L5.s r8 = (L5.s) r8
            java.lang.Object r6 = r8.k()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.a.e(java.lang.String, java.lang.String, P5.d):java.lang.Object");
    }
}
