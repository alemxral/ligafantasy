package H3;

import H3.c;
import H3.d;
import L5.I;
import L5.s;
import L5.t;
import M5.AbstractC1246t;
import M5.a0;
import X5.n;
import b3.EnumC1870e;
import com.stripe.android.model.o;
import d3.AbstractC2554a;
import e3.m;
import i6.AbstractC2819f;
import i6.AbstractC2829k;
import i6.M;
import i6.U;
import j2.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k3.i;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3159y;
import r2.InterfaceC3684d;
import t2.AbstractC3790k;
import x2.j;

/* loaded from: classes4.dex */
public final class a implements H3.c {

    /* renamed from: a, reason: collision with root package name */
    private final m f3431a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f3432b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3684d f3433c;

    /* renamed from: d, reason: collision with root package name */
    private final i f3434d;

    /* renamed from: e, reason: collision with root package name */
    private final P5.g f3435e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f3436f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0054a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f3437a;

        /* renamed from: b, reason: collision with root package name */
        Object f3438b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f3439c;

        /* renamed from: e, reason: collision with root package name */
        int f3441e;

        C0054a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3439c = obj;
            this.f3441e |= Integer.MIN_VALUE;
            Object b8 = a.this.b(null, null, false, this);
            if (b8 == Q5.b.e()) {
                return b8;
            }
            return s.a(b8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f3442a;

        /* renamed from: b, reason: collision with root package name */
        Object f3443b;

        /* renamed from: c, reason: collision with root package name */
        Object f3444c;

        /* renamed from: d, reason: collision with root package name */
        Object f3445d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f3446e;

        /* renamed from: g, reason: collision with root package name */
        int f3448g;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3446e = obj;
            this.f3448g |= Integer.MIN_VALUE;
            Object l8 = a.this.l(null, null, null, this);
            if (l8 == Q5.b.e()) {
                return l8;
            }
            return s.a(l8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        Object f3449a;

        /* renamed from: b, reason: collision with root package name */
        Object f3450b;

        /* renamed from: c, reason: collision with root package name */
        int f3451c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ o f3452d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ H3.c f3453e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c.a f3454f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f3455g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o oVar, H3.c cVar, c.a aVar, List list, P5.d dVar) {
            super(2, dVar);
            this.f3452d = oVar;
            this.f3453e = cVar;
            this.f3454f = aVar;
            this.f3455g = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f3452d, this.f3453e, this.f3454f, this.f3455g, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Object obj2;
            List list;
            Object e8 = Q5.b.e();
            int i8 = this.f3451c;
            if (i8 != 0) {
                if (i8 == 1) {
                    str = (String) this.f3450b;
                    list = (List) this.f3449a;
                    t.b(obj);
                    obj2 = ((s) obj).k();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                String str2 = this.f3452d.f24395a;
                if (str2 != null) {
                    H3.c cVar = this.f3453e;
                    c.a aVar = this.f3454f;
                    List list2 = this.f3455g;
                    this.f3449a = list2;
                    this.f3450b = str2;
                    this.f3451c = 1;
                    Object b8 = cVar.b(aVar, str2, false, this);
                    if (b8 == e8) {
                        return e8;
                    }
                    str = str2;
                    obj2 = b8;
                    list = list2;
                } else {
                    return null;
                }
            }
            Throwable e9 = s.e(obj2);
            if (e9 != null) {
                list.add(new d.a(str, e9));
            }
            return s.a(obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f3456a;

        /* renamed from: c, reason: collision with root package name */
        int f3458c;

        d(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3456a = obj;
            this.f3458c |= Integer.MIN_VALUE;
            Object c8 = a.this.c(null, null, false, this);
            if (c8 == Q5.b.e()) {
                return c8;
            }
            return s.a(c8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f3459a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f3460b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f3461c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f3462d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c.a f3463e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f3464f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: H3.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0055a extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f3465a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f3466b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c.a f3467c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ o.p f3468d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0055a(a aVar, c.a aVar2, o.p pVar, P5.d dVar) {
                super(2, dVar);
                this.f3466b = aVar;
                this.f3467c = aVar2;
                this.f3468d = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0055a(this.f3466b, this.f3467c, this.f3468d, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0055a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object u8;
                Object e8 = Q5.b.e();
                int i8 = this.f3465a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        u8 = ((s) obj).k();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    m mVar = this.f3466b.f3431a;
                    com.stripe.android.model.l lVar = new com.stripe.android.model.l(this.f3467c.b(), this.f3468d, kotlin.coroutines.jvm.internal.b.c(100), null, null, 24, null);
                    Set set = this.f3466b.f3436f;
                    j.c cVar = new j.c(this.f3467c.a(), ((r) this.f3466b.f3432b.get()).f(), null, 4, null);
                    this.f3465a = 1;
                    u8 = mVar.u(lVar, set, cVar, this);
                    if (u8 == e8) {
                        return e8;
                    }
                }
                a aVar = this.f3466b;
                Throwable e9 = s.e(u8);
                if (e9 != null) {
                    aVar.f3433c.a("Failed to retrieve payment methods.", e9);
                    i.b.a(aVar.f3434d, i.d.f33384d, AbstractC3790k.f38210e.b(e9), null, 4, null);
                }
                a aVar2 = this.f3466b;
                if (s.h(u8)) {
                    i.b.a(aVar2.f3434d, i.e.f33403b, null, null, 6, null);
                }
                return s.a(u8);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(List list, a aVar, c.a aVar2, boolean z8, P5.d dVar) {
            super(2, dVar);
            this.f3461c = list;
            this.f3462d = aVar;
            this.f3463e = aVar2;
            this.f3464f = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            e eVar = new e(this.f3461c, this.f3462d, this.f3463e, this.f3464f, dVar);
            eVar.f3460b = obj;
            return eVar;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List list;
            U b8;
            Object e8 = Q5.b.e();
            int i8 = this.f3459a;
            if (i8 != 0) {
                if (i8 == 1) {
                    list = (List) this.f3460b;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                M m8 = (M) this.f3460b;
                List list2 = this.f3461c;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (a0.i(o.p.f24519i, o.p.f24509O, o.p.f24523m).contains((o.p) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                a aVar = this.f3462d;
                c.a aVar2 = this.f3463e;
                ArrayList arrayList2 = new ArrayList(AbstractC1246t.x(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b8 = AbstractC2829k.b(m8, null, null, new C0055a(aVar, aVar2, (o.p) it.next(), null), 3, null);
                    arrayList2.add(b8);
                }
                ArrayList arrayList3 = new ArrayList();
                this.f3460b = arrayList3;
                this.f3459a = 1;
                Object a8 = AbstractC2819f.a(arrayList2, this);
                if (a8 == e8) {
                    return e8;
                }
                list = arrayList3;
                obj = a8;
            }
            a aVar3 = this.f3462d;
            boolean z8 = this.f3464f;
            Iterator it2 = ((Iterable) obj).iterator();
            while (it2.hasNext()) {
                Object k8 = ((s) it2.next()).k();
                Throwable e9 = s.e(k8);
                if (e9 == null) {
                    list.addAll(aVar3.m((List) k8));
                } else if (!z8) {
                    return s.a(s.b(t.a(e9)));
                }
            }
            return s.a(s.b(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f3469a;

        /* renamed from: c, reason: collision with root package name */
        int f3471c;

        f(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3469a = obj;
            this.f3471c |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f3472a;

        /* renamed from: b, reason: collision with root package name */
        Object f3473b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f3474c;

        /* renamed from: e, reason: collision with root package name */
        int f3476e;

        g(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3474c = obj;
            this.f3476e |= Integer.MIN_VALUE;
            Object d8 = a.this.d(null, null, null, this);
            if (d8 == Q5.b.e()) {
                return d8;
            }
            return s.a(d8);
        }
    }

    public a(m stripeRepository, I5.a lazyPaymentConfig, InterfaceC3684d logger, i errorReporter, P5.g workContext, Set productUsageTokens) {
        AbstractC3159y.i(stripeRepository, "stripeRepository");
        AbstractC3159y.i(lazyPaymentConfig, "lazyPaymentConfig");
        AbstractC3159y.i(logger, "logger");
        AbstractC3159y.i(errorReporter, "errorReporter");
        AbstractC3159y.i(workContext, "workContext");
        AbstractC3159y.i(productUsageTokens, "productUsageTokens");
        this.f3431a = stripeRepository;
        this.f3432b = lazyPaymentConfig;
        this.f3433c = logger;
        this.f3434d = errorReporter;
        this.f3435e = workContext;
        this.f3436f = productUsageTokens;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(H3.c r21, H3.c.a r22, java.lang.String r23, P5.d r24) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H3.a.l(H3.c, H3.c$a, java.lang.String, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m(java.util.List r10) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r9.n(r10)
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            r1 = 4
            d3.a$g[] r1 = new d3.AbstractC2554a.g[r1]
            d3.a$g r2 = d3.AbstractC2554a.g.f30147d
            r3 = 0
            r1[r3] = r2
            d3.a$g r2 = d3.AbstractC2554a.g.f30148e
            r4 = 1
            r1[r4] = r2
            d3.a$g r2 = d3.AbstractC2554a.g.f30150g
            r5 = 2
            r1[r5] = r2
            d3.a$g r2 = d3.AbstractC2554a.g.f30152i
            r5 = 3
            r1[r5] = r2
            java.util.Set r1 = M5.a0.i(r1)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r10 = r10.iterator()
        L34:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L68
            java.lang.Object r5 = r10.next()
            r6 = r5
            com.stripe.android.model.o r6 = (com.stripe.android.model.o) r6
            com.stripe.android.model.o$p r7 = r6.f24399e
            com.stripe.android.model.o$p r8 = com.stripe.android.model.o.p.f24519i
            if (r7 != r8) goto L60
            r7 = r1
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            com.stripe.android.model.o$g r6 = r6.f24402h
            if (r6 == 0) goto L57
            d3.a r6 = r6.f24471j
            if (r6 == 0) goto L57
            d3.a$g r6 = r6.b()
            goto L58
        L57:
            r6 = 0
        L58:
            boolean r6 = M5.AbstractC1246t.d0(r7, r6)
            if (r6 == 0) goto L60
            r6 = 1
            goto L61
        L60:
            r6 = 0
        L61:
            r6 = r6 ^ r4
            if (r6 == 0) goto L34
            r2.add(r5)
            goto L34
        L68:
            r0.addAll(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H3.a.m(java.util.List):java.util.List");
    }

    private final List n(List list) {
        String str;
        Integer num;
        Integer num2;
        String str2;
        EnumC1870e enumC1870e;
        AbstractC2554a abstractC2554a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            AbstractC2554a.g gVar = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            o oVar = (o) next;
            if (oVar.f24399e == o.p.f24519i) {
                o.g gVar2 = oVar.f24402h;
                if (gVar2 != null && (abstractC2554a = gVar2.f24471j) != null) {
                    gVar = abstractC2554a.b();
                }
                if (gVar == AbstractC2554a.g.f30152i) {
                    arrayList.add(next);
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            o.g gVar3 = ((o) obj).f24402h;
            if (gVar3 != null) {
                str = gVar3.f24469h;
            } else {
                str = null;
            }
            if (gVar3 != null) {
                num = gVar3.f24465d;
            } else {
                num = null;
            }
            if (gVar3 != null) {
                num2 = gVar3.f24466e;
            } else {
                num2 = null;
            }
            if (gVar3 != null && (enumC1870e = gVar3.f24462a) != null) {
                str2 = enumC1870e.f();
            } else {
                str2 = null;
            }
            if (hashSet.add(str + "-" + num + "-" + num2 + "-" + str2)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // H3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(H3.c.a r13, P5.d r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof H3.a.f
            if (r0 == 0) goto L13
            r0 = r14
            H3.a$f r0 = (H3.a.f) r0
            int r1 = r0.f3471c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3471c = r1
            goto L18
        L13:
            H3.a$f r0 = new H3.a$f
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f3469a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f3471c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r14)
            L5.s r14 = (L5.s) r14
            java.lang.Object r13 = r14.k()
            goto L64
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L37:
            L5.t.b(r14)
            e3.m r14 = r12.f3431a
            java.lang.String r2 = r13.b()
            java.util.Set r4 = r12.f3436f
            x2.j$c r11 = new x2.j$c
            java.lang.String r6 = r13.a()
            I5.a r13 = r12.f3432b
            java.lang.Object r13 = r13.get()
            j2.r r13 = (j2.r) r13
            java.lang.String r7 = r13.f()
            r9 = 4
            r10 = 0
            r8 = 0
            r5 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r0.f3471c = r3
            java.lang.Object r13 = r14.g(r2, r4, r11, r0)
            if (r13 != r1) goto L64
            return r1
        L64:
            boolean r14 = L5.s.g(r13)
            if (r14 == 0) goto L6b
            r13 = 0
        L6b:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: H3.a.a(H3.c$a, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // H3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(H3.c.a r11, java.lang.String r12, boolean r13, P5.d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof H3.a.C0054a
            if (r0 == 0) goto L13
            r0 = r14
            H3.a$a r0 = (H3.a.C0054a) r0
            int r1 = r0.f3441e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3441e = r1
            goto L18
        L13:
            H3.a$a r0 = new H3.a$a
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f3439c
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f3441e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L28
            if (r2 != r3) goto L3b
        L28:
            java.lang.Object r11 = r0.f3438b
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r0.f3437a
            H3.a r11 = (H3.a) r11
            L5.t.b(r14)
            L5.s r14 = (L5.s) r14
            java.lang.Object r13 = r14.k()
            goto L82
        L3b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L43:
            L5.t.b(r14)
            if (r13 == 0) goto L57
            r0.f3437a = r10
            r0.f3438b = r12
            r0.f3441e = r4
            java.lang.Object r11 = r10.l(r10, r11, r12, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            r13 = r11
            goto L81
        L57:
            e3.m r13 = r10.f3431a
            java.util.Set r14 = r10.f3436f
            x2.j$c r2 = new x2.j$c
            java.lang.String r5 = r11.a()
            I5.a r11 = r10.f3432b
            java.lang.Object r11 = r11.get()
            j2.r r11 = (j2.r) r11
            java.lang.String r6 = r11.f()
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f3437a = r10
            r0.f3438b = r12
            r0.f3441e = r3
            java.lang.Object r13 = r13.A(r14, r12, r2, r0)
            if (r13 != r1) goto L81
            return r1
        L81:
            r11 = r10
        L82:
            java.lang.Throwable r14 = L5.s.e(r13)
            if (r14 == 0) goto La3
            r2.d r11 = r11.f3433c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to detach payment method "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = "."
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.a(r12, r14)
        La3:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: H3.a.b(H3.c$a, java.lang.String, boolean, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // H3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(H3.c.a r11, java.util.List r12, boolean r13, P5.d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof H3.a.d
            if (r0 == 0) goto L13
            r0 = r14
            H3.a$d r0 = (H3.a.d) r0
            int r1 = r0.f3458c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3458c = r1
            goto L18
        L13:
            H3.a$d r0 = new H3.a$d
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f3456a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f3458c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            L5.t.b(r14)
            goto L4a
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            L5.t.b(r14)
            P5.g r14 = r10.f3435e
            H3.a$e r2 = new H3.a$e
            r9 = 0
            r4 = r2
            r5 = r12
            r6 = r10
            r7 = r11
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f3458c = r3
            java.lang.Object r14 = i6.AbstractC2825i.g(r14, r2, r0)
            if (r14 != r1) goto L4a
            return r1
        L4a:
            L5.s r14 = (L5.s) r14
            java.lang.Object r11 = r14.k()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: H3.a.c(H3.c$a, java.util.List, boolean, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // H3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(H3.c.a r11, java.lang.String r12, com.stripe.android.model.t r13, P5.d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof H3.a.g
            if (r0 == 0) goto L13
            r0 = r14
            H3.a$g r0 = (H3.a.g) r0
            int r1 = r0.f3476e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3476e = r1
            goto L18
        L13:
            H3.a$g r0 = new H3.a$g
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f3474c
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f3476e
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r11 = r0.f3473b
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r0.f3472a
            H3.a r11 = (H3.a) r11
            L5.t.b(r14)
            L5.s r14 = (L5.s) r14
            java.lang.Object r13 = r14.k()
            goto L6c
        L38:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L40:
            L5.t.b(r14)
            e3.m r14 = r10.f3431a
            x2.j$c r2 = new x2.j$c
            java.lang.String r5 = r11.a()
            I5.a r11 = r10.f3432b
            java.lang.Object r11 = r11.get()
            j2.r r11 = (j2.r) r11
            java.lang.String r6 = r11.f()
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f3472a = r10
            r0.f3473b = r12
            r0.f3476e = r3
            java.lang.Object r13 = r14.j(r12, r13, r2, r0)
            if (r13 != r1) goto L6b
            return r1
        L6b:
            r11 = r10
        L6c:
            java.lang.Throwable r14 = L5.s.e(r13)
            if (r14 == 0) goto L8d
            r2.d r11 = r11.f3433c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to update payment method "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = "."
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.a(r12, r14)
        L8d:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: H3.a.d(H3.c$a, java.lang.String, com.stripe.android.model.t, P5.d):java.lang.Object");
    }
}
