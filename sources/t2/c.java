package T2;

import L5.I;
import L5.p;
import L5.t;
import M5.AbstractC1246t;
import T2.m;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import e6.InterfaceC2643c;
import i6.AbstractC2829k;
import i6.M;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3136a;
import l6.AbstractC3351M;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import l6.v;
import m4.C3399A;
import m4.J;
import m4.Q;
import m4.g0;
import m4.s0;
import r2.InterfaceC3684d;
import r4.C3688a;

/* loaded from: classes4.dex */
public final class c extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final T2.k f9710a;

    /* renamed from: b, reason: collision with root package name */
    private final L2.b f9711b;

    /* renamed from: c, reason: collision with root package name */
    private final M2.e f9712c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3684d f9713d;

    /* renamed from: e, reason: collision with root package name */
    private final T2.e f9714e;

    /* renamed from: f, reason: collision with root package name */
    private final v f9715f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f9716g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f9717h;

    /* renamed from: i, reason: collision with root package name */
    private final Set f9718i;

    /* renamed from: j, reason: collision with root package name */
    private final String f9719j;

    /* renamed from: k, reason: collision with root package name */
    private final String f9720k;

    /* renamed from: l, reason: collision with root package name */
    private final String f9721l;

    /* renamed from: m, reason: collision with root package name */
    private final s0 f9722m;

    /* renamed from: n, reason: collision with root package name */
    private final Q f9723n;

    /* renamed from: o, reason: collision with root package name */
    private final s0 f9724o;

    /* renamed from: p, reason: collision with root package name */
    private final g0 f9725p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3349K f9726q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3349K f9727r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC3349K f9728s;

    /* renamed from: t, reason: collision with root package name */
    private final v f9729t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC3349K f9730u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f9731v;

    /* loaded from: classes4.dex */
    public static final class a implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final T2.k f9732a;

        /* renamed from: b, reason: collision with root package name */
        private final N2.b f9733b;

        public a(T2.k signupMode, N2.b linkComponent) {
            AbstractC3159y.i(signupMode, "signupMode");
            AbstractC3159y.i(linkComponent, "linkComponent");
            this.f9732a = signupMode;
            this.f9733b = linkComponent;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
            return n.a(this, interfaceC2643c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3159y.i(modelClass, "modelClass");
            c a8 = this.f9733b.b().a(this.f9732a);
            AbstractC3159y.g(a8, "null cannot be cast to non-null type T of com.stripe.android.link.ui.inline.InlineSignupViewModel.Factory.create");
            return a8;
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9734a;

        static {
            int[] iArr = new int[T2.k.values().length];
            try {
                iArr[T2.k.f9954b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[T2.k.f9953a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9734a = iArr;
        }
    }

    /* renamed from: T2.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0214c extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0214c f9735a = new C0214c();

        C0214c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C3688a it) {
            AbstractC3159y.i(it, "it");
            if (!it.d()) {
                it = null;
            }
            if (it == null) {
                return null;
            }
            return it.c();
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f9736a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C3688a it) {
            AbstractC3159y.i(it, "it");
            if (!it.d()) {
                it = null;
            }
            if (it == null) {
                return null;
            }
            return it.c();
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f9737a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C3688a it) {
            AbstractC3159y.i(it, "it");
            if (!it.d()) {
                it = null;
            }
            if (it == null) {
                return null;
            }
            return it.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f9738a;

        /* renamed from: b, reason: collision with root package name */
        Object f9739b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f9740c;

        /* renamed from: e, reason: collision with root package name */
        int f9742e;

        f(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9740c = obj;
            this.f9742e |= Integer.MIN_VALUE;
            return c.this.t(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9743a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9744b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f9745c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f9746d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Function1 function1, c cVar, P5.d dVar) {
            super(2, dVar);
            this.f9745c = function1;
            this.f9746d = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            g gVar = new g(this.f9745c, this.f9746d, dVar);
            gVar.f9744b = obj;
            return gVar;
        }

        @Override // X5.n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, P5.d dVar) {
            return ((g) create(str, dVar)).invokeSuspend(I.f6474a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r5.f9743a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                L5.t.b(r6)
                goto L5c
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f9744b
                java.lang.String r1 = (java.lang.String) r1
                L5.t.b(r6)
                goto L40
            L22:
                L5.t.b(r6)
                java.lang.Object r6 = r5.f9744b
                r1 = r6
                java.lang.String r1 = (java.lang.String) r1
                if (r1 == 0) goto L55
                boolean r6 = g6.n.u(r1)
                if (r6 == 0) goto L33
                goto L55
            L33:
                r5.f9744b = r1
                r5.f9743a = r3
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = i6.X.b(r3, r5)
                if (r6 != r0) goto L40
                return r0
            L40:
                kotlin.jvm.functions.Function1 r6 = r5.f9745c
                U2.a r3 = U2.a.f11058b
                r6.invoke(r3)
                T2.c r6 = r5.f9746d
                r3 = 0
                r5.f9744b = r3
                r5.f9743a = r2
                java.lang.Object r6 = T2.c.g(r6, r1, r5)
                if (r6 != r0) goto L5c
                return r0
            L55:
                kotlin.jvm.functions.Function1 r6 = r5.f9745c
                U2.a r0 = U2.a.f11057a
                r6.invoke(r0)
            L5c:
                L5.I r6 = L5.I.f6474a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: T2.c.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements Function1 {

        /* loaded from: classes4.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f9748a;

            static {
                int[] iArr = new int[U2.a.values().length];
                try {
                    iArr[U2.a.f11057a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[U2.a.f11058b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[U2.a.f11059c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f9748a = iArr;
            }
        }

        h() {
            super(1);
        }

        public final void a(U2.a signUpState) {
            Object value;
            T2.e eVar;
            m i8;
            AbstractC3159y.i(signUpState, "signUpState");
            c.this.k();
            v vVar = c.this.f9715f;
            c cVar = c.this;
            do {
                value = vVar.getValue();
                eVar = (T2.e) value;
                int i9 = a.f9748a[signUpState.ordinal()];
                if (i9 != 1 && i9 != 2) {
                    if (i9 == 3) {
                        i8 = cVar.u((String) cVar.f9726q.getValue(), (String) cVar.f9727r.getValue(), (String) cVar.f9728s.getValue());
                    } else {
                        throw new p();
                    }
                } else {
                    i8 = eVar.i();
                }
            } while (!vVar.a(value, T2.e.b(eVar, i8, null, null, null, null, false, false, signUpState, 126, null)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U2.a) obj);
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f9749a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9750b;

        /* renamed from: d, reason: collision with root package name */
        int f9752d;

        i(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9750b = obj;
            this.f9752d |= Integer.MIN_VALUE;
            return c.this.A(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9753a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9754b;

        j(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            j jVar = new j(dVar);
            jVar.f9754b = obj;
            return jVar;
        }

        @Override // X5.n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, P5.d dVar) {
            return ((j) create(str, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            Q5.b.e();
            if (this.f9753a == 0) {
                t.b(obj);
                String str = (String) this.f9754b;
                if (str != null && !g6.n.u(str)) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                return kotlin.coroutines.jvm.internal.b.a(!z8);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9755a;

        k(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new k(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r5.f9755a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L22
                if (r1 == r4) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                L5.t.b(r6)
                goto L54
            L1e:
                L5.t.b(r6)
                goto L3c
            L22:
                L5.t.b(r6)
                T2.c r6 = T2.c.this
                T2.e r6 = T2.c.e(r6)
                boolean r6 = r6.l()
                if (r6 == 0) goto L47
                T2.c r6 = T2.c.this
                r5.f9755a = r4
                java.lang.Object r6 = T2.c.j(r6, r5)
                if (r6 != r0) goto L3c
                return r0
            L3c:
                T2.c r6 = T2.c.this
                r5.f9755a = r3
                java.lang.Object r6 = T2.c.i(r6, r4, r5)
                if (r6 != r0) goto L54
                return r0
            L47:
                T2.c r6 = T2.c.this
                r5.f9755a = r2
                r1 = 0
                r2 = 0
                java.lang.Object r6 = T2.c.z(r6, r1, r5, r4, r2)
                if (r6 != r0) goto L54
                return r0
            L54:
                L5.I r6 = L5.I.f6474a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: T2.c.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9757a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3136a implements X5.p {
            a(Object obj) {
                super(4, obj, c.class, "mapToUserInput", "mapToUserInput(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/link/ui/inline/UserInput;", 4);
            }

            @Override // X5.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(String str, String str2, String str3, P5.d dVar) {
                return l.h((c) this.receiver, str, str2, str3, dVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f9759a;

            b(c cVar) {
                this.f9759a = cVar;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(m mVar, P5.d dVar) {
                Object value;
                v vVar = this.f9759a.f9715f;
                do {
                    value = vVar.getValue();
                } while (!vVar.a(value, T2.e.b((T2.e) value, mVar, null, null, null, null, false, false, null, 254, null)));
                return I.f6474a;
            }
        }

        l(P5.d dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object h(c cVar, String str, String str2, String str3, P5.d dVar) {
            return cVar.u(str, str2, str3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new l(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9757a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3358f j8 = AbstractC3360h.j(c.this.f9726q, c.this.f9727r, c.this.f9728s, new a(c.this));
                b bVar = new b(c.this);
                this.f9757a = 1;
                if (j8.collect(bVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    public c(T2.k signupMode, K2.d config, L2.b linkAccountManager, M2.e linkEventsReporter, InterfaceC3684d logger) {
        boolean z8;
        boolean z9;
        boolean z10;
        s0 s0Var;
        AbstractC3159y.i(signupMode, "signupMode");
        AbstractC3159y.i(config, "config");
        AbstractC3159y.i(linkAccountManager, "linkAccountManager");
        AbstractC3159y.i(linkEventsReporter, "linkEventsReporter");
        AbstractC3159y.i(logger, "logger");
        this.f9710a = signupMode;
        this.f9711b = linkAccountManager;
        this.f9712c = linkEventsReporter;
        this.f9713d = logger;
        T2.e a8 = T2.e.f9764i.a(signupMode, config);
        this.f9714e = a8;
        v a9 = AbstractC3351M.a(a8);
        this.f9715f = a9;
        this.f9716g = a9;
        if (signupMode == T2.k.f9954b) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f9717h = z8;
        Set e8 = a8.e();
        this.f9718i = e8;
        String c8 = e8.contains(T2.j.f9948a) ? config.b().c() : null;
        this.f9719j = c8;
        String f8 = e8.contains(T2.j.f9949b) ? config.b().f() : null;
        String str = f8 == null ? "" : f8;
        this.f9720k = str;
        String e9 = e8.contains(T2.j.f9950c) ? config.b().e() : null;
        this.f9721l = e9;
        C3399A.a aVar = C3399A.f34918h;
        if (a8.k() && z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        s0 a10 = aVar.a(c8, z9);
        this.f9722m = a10;
        Q.a aVar2 = Q.f35180r;
        String b8 = config.b().b();
        if (a8.l() && z8) {
            z10 = true;
        } else {
            z10 = false;
        }
        Q b9 = Q.a.b(aVar2, str, b8, null, z10, false, 20, null);
        this.f9723n = b9;
        s0 a11 = J.f35087h.a(e9);
        this.f9724o = a11;
        if (p()) {
            s0Var = a11;
        } else {
            s0Var = null;
        }
        this.f9725p = new g0(null, AbstractC1246t.r(a10, b9, s0Var));
        this.f9726q = v4.g.m(a10.m(), C0214c.f9735a);
        this.f9727r = v4.g.m(b9.m(), e.f9737a);
        this.f9728s = v4.g.m(a11.m(), d.f9736a);
        v a12 = AbstractC3351M.a(null);
        this.f9729t = a12;
        this.f9730u = a12;
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A(P5.d r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof T2.c.i
            if (r0 == 0) goto L13
            r0 = r13
            T2.c$i r0 = (T2.c.i) r0
            int r1 = r0.f9752d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9752d = r1
            goto L18
        L13:
            T2.c$i r0 = new T2.c$i
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f9750b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f9752d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f9749a
            T2.c r0 = (T2.c) r0
            L5.t.b(r13)
            goto L4c
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L35:
            L5.t.b(r13)
            l6.K r13 = r12.f9727r
            T2.c$j r2 = new T2.c$j
            r4 = 0
            r2.<init>(r4)
            r0.f9749a = r12
            r0.f9752d = r3
            java.lang.Object r13 = l6.AbstractC3360h.v(r13, r2, r0)
            if (r13 != r1) goto L4b
            return r1
        L4b:
            r0 = r12
        L4c:
            l6.v r13 = r0.f9715f
        L4e:
            java.lang.Object r0 = r13.getValue()
            r1 = r0
            T2.e r1 = (T2.e) r1
            U2.a r9 = U2.a.f11059c
            r10 = 127(0x7f, float:1.78E-43)
            r11 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            T2.e r1 = T2.e.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r13.a(r0, r1)
            if (r0 == 0) goto L4e
            L5.I r13 = L5.I.f6474a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.c.A(P5.d):java.lang.Object");
    }

    private final void B() {
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new k(null), 3, null);
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new l(null), 3, null);
    }

    public static final /* synthetic */ m h(c cVar, String str, String str2, String str3) {
        return cVar.u(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        this.f9729t.setValue(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.String r19, P5.d r20) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.c.t(java.lang.String, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m u(String str, String str2, String str3) {
        boolean z8;
        T2.k g8 = this.f9714e.g();
        if (str == null || str2 == null || g8 == null) {
            return null;
        }
        boolean z9 = false;
        if (p() && (str3 == null || g6.n.u(str3))) {
            z8 = false;
        } else {
            z8 = true;
        }
        String z10 = this.f9723n.z(str2);
        String x8 = this.f9723n.x();
        if (this.f9719j != null) {
            z9 = true;
        }
        m.b bVar = new m.b(str, z10, x8, str3, w(g8, z9, true ^ g6.n.u(this.f9720k)));
        if (!z8) {
            return null;
        }
        return bVar;
    }

    private final void v(Throwable th) {
        S2.b a8 = S2.c.a(th);
        this.f9713d.a("Error: ", th);
        this.f9729t.setValue(a8);
    }

    private final T2.l w(T2.k kVar, boolean z8, boolean z9) {
        int i8 = b.f9734a[kVar.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                if (z8 && z9) {
                    return T2.l.f9959c;
                }
                if (z8) {
                    return T2.l.f9958b;
                }
                return T2.l.f9957a;
            }
            throw new p();
        }
        if (z8) {
            return T2.l.f9961e;
        }
        if (!z8) {
            return T2.l.f9960d;
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(boolean z8, P5.d dVar) {
        Object h8 = AbstractC3360h.h(AbstractC3360h.o(this.f9726q, z8 ? 1 : 0), new g(new h(), this, null), dVar);
        if (h8 == Q5.b.e()) {
            return h8;
        }
        return I.f6474a;
    }

    static /* synthetic */ Object z(c cVar, boolean z8, P5.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return cVar.y(z8, dVar);
    }

    public final s0 l() {
        return this.f9722m;
    }

    public final InterfaceC3349K m() {
        return this.f9730u;
    }

    public final s0 n() {
        return this.f9724o;
    }

    public final Q o() {
        return this.f9723n;
    }

    public final boolean p() {
        return this.f9714e.c().contains(T2.j.f9950c);
    }

    public final g0 q() {
        return this.f9725p;
    }

    public final T2.k r() {
        return this.f9710a;
    }

    public final InterfaceC3349K s() {
        return this.f9716g;
    }

    public final void x() {
        Object value;
        v vVar = this.f9715f;
        do {
            value = vVar.getValue();
        } while (!vVar.a(value, T2.e.b((T2.e) value, null, null, null, null, null, !r2.j(), false, null, 223, null)));
        if (((T2.e) this.f9715f.getValue()).j() && !this.f9731v) {
            this.f9731v = true;
            this.f9712c.j();
        }
    }
}
