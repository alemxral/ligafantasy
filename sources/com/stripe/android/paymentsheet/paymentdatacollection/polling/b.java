package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import L5.InterfaceC1223g;
import L5.t;
import N3.c;
import X5.n;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import e6.InterfaceC2643c;
import h6.AbstractC2760c;
import h6.C2758a;
import h6.EnumC2761d;
import i6.AbstractC2825i;
import i6.C2812b0;
import i6.I;
import i6.M;
import i6.X;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.C3136a;
import kotlin.jvm.internal.InterfaceC3153s;
import l6.AbstractC3351M;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import l6.v;

/* loaded from: classes4.dex */
public final class b extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final e f26284a;

    /* renamed from: b, reason: collision with root package name */
    private final N3.c f26285b;

    /* renamed from: c, reason: collision with root package name */
    private final F3.h f26286c;

    /* renamed from: d, reason: collision with root package name */
    private final I f26287d;

    /* renamed from: e, reason: collision with root package name */
    private final SavedStateHandle f26288e;

    /* renamed from: f, reason: collision with root package name */
    private final v f26289f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f26290g;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f26291a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f26293c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j8, P5.d dVar) {
            super(2, dVar);
            this.f26293c = j8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(this.f26293c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f26291a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                b bVar = b.this;
                long j8 = this.f26293c;
                this.f26291a = 1;
                if (bVar.m(j8, this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0645b extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f26294a;

        C0645b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0645b(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0645b) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f26294a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                b bVar = b.this;
                this.f26294a = 1;
                if (bVar.n(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f26296a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f26297b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f26298c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j8, b bVar, P5.d dVar) {
            super(2, dVar);
            this.f26297b = j8;
            this.f26298c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f26297b, this.f26298c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f26296a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return L5.I.f6474a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                long j8 = this.f26297b;
                this.f26296a = 1;
                if (X.c(j8, this) == e8) {
                    return e8;
                }
            }
            b bVar = this.f26298c;
            this.f26296a = 2;
            if (bVar.l(this) == e8) {
                return e8;
            }
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f26299a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f26300b;

        d(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            d dVar2 = new d(dVar);
            dVar2.f26300b = obj;
            return dVar2;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            M m8;
            Object e8 = Q5.b.e();
            int i8 = this.f26299a;
            if (i8 != 0) {
                if (i8 == 1) {
                    m8 = (M) this.f26300b;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                M m9 = (M) this.f26300b;
                long c8 = b.this.f26284a.c();
                this.f26300b = m9;
                this.f26299a = 1;
                if (X.c(c8, this) == e8) {
                    return e8;
                }
                m8 = m9;
            }
            b.this.f26285b.b(m8);
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final String f26302a;

        /* renamed from: b, reason: collision with root package name */
        private final long f26303b;

        /* renamed from: c, reason: collision with root package name */
        private final long f26304c;

        /* renamed from: d, reason: collision with root package name */
        private final int f26305d;

        /* renamed from: e, reason: collision with root package name */
        private final int f26306e;

        public /* synthetic */ e(String str, long j8, long j9, int i8, int i9, AbstractC3151p abstractC3151p) {
            this(str, j8, j9, i8, i9);
        }

        public final String a() {
            return this.f26302a;
        }

        public final int b() {
            return this.f26306e;
        }

        public final long c() {
            return this.f26304c;
        }

        public final int d() {
            return this.f26305d;
        }

        public final long e() {
            return this.f26303b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC3159y.d(this.f26302a, eVar.f26302a) && C2758a.j(this.f26303b, eVar.f26303b) && C2758a.j(this.f26304c, eVar.f26304c) && this.f26305d == eVar.f26305d && this.f26306e == eVar.f26306e;
        }

        public int hashCode() {
            return (((((((this.f26302a.hashCode() * 31) + C2758a.w(this.f26303b)) * 31) + C2758a.w(this.f26304c)) * 31) + this.f26305d) * 31) + this.f26306e;
        }

        public String toString() {
            return "Args(clientSecret=" + this.f26302a + ", timeLimit=" + C2758a.J(this.f26303b) + ", initialDelay=" + C2758a.J(this.f26304c) + ", maxAttempts=" + this.f26305d + ", ctaText=" + this.f26306e + ")";
        }

        private e(String clientSecret, long j8, long j9, int i8, int i9) {
            AbstractC3159y.i(clientSecret, "clientSecret");
            this.f26302a = clientSecret;
            this.f26303b = j8;
            this.f26304c = j9;
            this.f26305d = i8;
            this.f26306e = i9;
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f26307a;

        public f(Function0 argsSupplier) {
            AbstractC3159y.i(argsSupplier, "argsSupplier");
            this.f26307a = argsSupplier;
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
            e eVar = (e) this.f26307a.invoke();
            b a8 = G3.b.a().b(A2.b.a(extras)).a(new c.a(eVar.a(), eVar.d())).c(C2812b0.b()).build().a().b(eVar).a(SavedStateHandleSupport.createSavedStateHandle(extras)).build().a();
            AbstractC3159y.g(a8, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel.Factory.create");
            return a8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26308a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26309b;

        /* renamed from: d, reason: collision with root package name */
        int f26311d;

        g(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26309b = obj;
            this.f26311d |= Integer.MIN_VALUE;
            return b.this.l(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h implements InterfaceC3359g {
        h() {
        }

        public final Object b(long j8, P5.d dVar) {
            Object value;
            v vVar = b.this.f26289f;
            do {
                value = vVar.getValue();
            } while (!vVar.a(value, F3.f.b((F3.f) value, j8, 0, null, 6, null)));
            return L5.I.f6474a;
        }

        @Override // l6.InterfaceC3359g
        public /* bridge */ /* synthetic */ Object emit(Object obj, P5.d dVar) {
            return b(((C2758a) obj).L(), dVar);
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f26313a;

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3359g f26314a;

            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.b$i$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0646a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f26315a;

                /* renamed from: b, reason: collision with root package name */
                int f26316b;

                public C0646a(P5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f26315a = obj;
                    this.f26316b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC3359g interfaceC3359g) {
                this.f26314a = interfaceC3359g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // l6.InterfaceC3359g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, P5.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.stripe.android.paymentsheet.paymentdatacollection.polling.b.i.a.C0646a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.stripe.android.paymentsheet.paymentdatacollection.polling.b$i$a$a r0 = (com.stripe.android.paymentsheet.paymentdatacollection.polling.b.i.a.C0646a) r0
                    int r1 = r0.f26316b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f26316b = r1
                    goto L18
                L13:
                    com.stripe.android.paymentsheet.paymentdatacollection.polling.b$i$a$a r0 = new com.stripe.android.paymentsheet.paymentdatacollection.polling.b$i$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f26315a
                    java.lang.Object r1 = Q5.b.e()
                    int r2 = r0.f26316b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    L5.t.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    L5.t.b(r6)
                    l6.g r6 = r4.f26314a
                    com.stripe.android.model.StripeIntent$Status r5 = (com.stripe.android.model.StripeIntent.Status) r5
                    if (r5 == 0) goto L40
                    F3.e r5 = com.stripe.android.paymentsheet.paymentdatacollection.polling.c.b(r5)
                    if (r5 != 0) goto L42
                L40:
                    F3.e r5 = F3.e.f2490a
                L42:
                    r0.f26316b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    L5.I r5 = L5.I.f6474a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.paymentdatacollection.polling.b.i.a.emit(java.lang.Object, P5.d):java.lang.Object");
            }
        }

        public i(InterfaceC3358f interfaceC3358f) {
            this.f26313a = interfaceC3358f;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            Object collect = this.f26313a.collect(new a(interfaceC3359g), dVar);
            if (collect == Q5.b.e()) {
                return collect;
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f26318a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26319b;

        j(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            j jVar = new j(dVar);
            jVar.f26319b = obj;
            return jVar;
        }

        @Override // X5.n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(F3.e eVar, P5.d dVar) {
            return ((j) create(eVar, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f26318a == 0) {
                t.b(obj);
                if (((F3.e) this.f26319b) == F3.e.f2492c) {
                    b.this.f26285b.c();
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class k implements InterfaceC3359g, InterfaceC3153s {
        k() {
        }

        @Override // l6.InterfaceC3359g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object emit(F3.e eVar, P5.d dVar) {
            Object o8 = b.o(b.this, eVar, dVar);
            if (o8 == Q5.b.e()) {
                return o8;
            }
            return L5.I.f6474a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3359g) && (obj instanceof InterfaceC3153s)) {
                return AbstractC3159y.d(getFunctionDelegate(), ((InterfaceC3153s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3153s
        public final InterfaceC1223g getFunctionDelegate() {
            return new C3136a(2, b.this, b.class, "updatePollingState", "updatePollingState(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26322a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26323b;

        /* renamed from: d, reason: collision with root package name */
        int f26325d;

        l(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26323b = obj;
            this.f26325d |= Integer.MIN_VALUE;
            return b.this.q(this);
        }
    }

    /* loaded from: classes4.dex */
    static final class m extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f26326a;

        m(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new m(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f26326a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                long c8 = b.this.f26284a.c();
                this.f26326a = 1;
                if (X.c(c8, this) == e8) {
                    return e8;
                }
            }
            b.this.f26285b.b(ViewModelKt.getViewModelScope(b.this));
            return L5.I.f6474a;
        }
    }

    public b(e args, N3.c poller, F3.h timeProvider, I dispatcher, SavedStateHandle savedStateHandle) {
        AbstractC3159y.i(args, "args");
        AbstractC3159y.i(poller, "poller");
        AbstractC3159y.i(timeProvider, "timeProvider");
        AbstractC3159y.i(dispatcher, "dispatcher");
        AbstractC3159y.i(savedStateHandle, "savedStateHandle");
        this.f26284a = args;
        this.f26285b = poller;
        this.f26286c = timeProvider;
        this.f26287d = dispatcher;
        this.f26288e = savedStateHandle;
        v a8 = AbstractC3351M.a(new F3.f(args.e(), args.b(), null, 4, null));
        this.f26289f = a8;
        this.f26290g = a8;
        long i8 = i();
        AbstractC2825i.d(ViewModelKt.getViewModelScope(this), dispatcher, null, new a(i8, null), 2, null);
        AbstractC2825i.d(ViewModelKt.getViewModelScope(this), dispatcher, null, new C0645b(null), 2, null);
        AbstractC2825i.d(ViewModelKt.getViewModelScope(this), dispatcher, null, new c(i8, this, null), 2, null);
        AbstractC2825i.d(ViewModelKt.getViewModelScope(this), dispatcher, null, new d(null), 2, null);
    }

    private final long i() {
        Long l8 = (Long) this.f26288e.get("KEY_CURRENT_POLLING_START_TIME");
        if (l8 == null) {
            this.f26288e.set("KEY_CURRENT_POLLING_START_TIME", Long.valueOf(this.f26286c.a()));
        }
        if (l8 != null) {
            return ((C2758a) O5.a.c(C2758a.e(AbstractC2760c.t((l8.longValue() + C2758a.o(this.f26284a.e())) - this.f26286c.a(), EnumC2761d.f31404d)), C2758a.e(C2758a.f31395b.b()))).L();
        }
        return this.f26284a.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(P5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.stripe.android.paymentsheet.paymentdatacollection.polling.b.g
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.paymentsheet.paymentdatacollection.polling.b$g r0 = (com.stripe.android.paymentsheet.paymentdatacollection.polling.b.g) r0
            int r1 = r0.f26311d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26311d = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.paymentdatacollection.polling.b$g r0 = new com.stripe.android.paymentsheet.paymentdatacollection.polling.b$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f26309b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f26311d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            L5.t.b(r8)
            goto L65
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            java.lang.Object r2 = r0.f26308a
            com.stripe.android.paymentsheet.paymentdatacollection.polling.b r2 = (com.stripe.android.paymentsheet.paymentdatacollection.polling.b) r2
            L5.t.b(r8)
            goto L59
        L3c:
            L5.t.b(r8)
            N3.c r8 = r7.f26285b
            r8.c()
            h6.a$a r8 = h6.C2758a.f31395b
            r8 = 3
            h6.d r2 = h6.EnumC2761d.f31405e
            long r5 = h6.AbstractC2760c.s(r8, r2)
            r0.f26308a = r7
            r0.f26311d = r4
            java.lang.Object r8 = i6.X.c(r5, r0)
            if (r8 != r1) goto L58
            return r1
        L58:
            r2 = r7
        L59:
            r8 = 0
            r0.f26308a = r8
            r0.f26311d = r3
            java.lang.Object r8 = r2.q(r0)
            if (r8 != r1) goto L65
            return r1
        L65:
            L5.I r8 = L5.I.f6474a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.paymentdatacollection.polling.b.l(P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(long j8, P5.d dVar) {
        Object collect = com.stripe.android.paymentsheet.paymentdatacollection.polling.c.a(j8).collect(new h(), dVar);
        if (collect == Q5.b.e()) {
            return collect;
        }
        return L5.I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n(P5.d dVar) {
        Object collect = AbstractC3360h.E(new i(this.f26285b.getState()), new j(null)).collect(new k(), dVar);
        if (collect == Q5.b.e()) {
            return collect;
        }
        return L5.I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object o(b bVar, F3.e eVar, P5.d dVar) {
        bVar.s(eVar);
        return L5.I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(P5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.stripe.android.paymentsheet.paymentdatacollection.polling.b.l
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.paymentsheet.paymentdatacollection.polling.b$l r0 = (com.stripe.android.paymentsheet.paymentdatacollection.polling.b.l) r0
            int r1 = r0.f26325d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26325d = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.paymentdatacollection.polling.b$l r0 = new com.stripe.android.paymentsheet.paymentdatacollection.polling.b$l
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f26323b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f26325d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f26322a
            com.stripe.android.paymentsheet.paymentdatacollection.polling.b r0 = (com.stripe.android.paymentsheet.paymentdatacollection.polling.b) r0
            L5.t.b(r9)
            goto L46
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            L5.t.b(r9)
            N3.c r9 = r8.f26285b
            r0.f26322a = r8
            r0.f26325d = r3
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L45
            return r1
        L45:
            r0 = r8
        L46:
            com.stripe.android.model.StripeIntent$Status r9 = (com.stripe.android.model.StripeIntent.Status) r9
            com.stripe.android.model.StripeIntent$Status r1 = com.stripe.android.model.StripeIntent.Status.f24141h
            if (r9 != r1) goto L67
            l6.v r9 = r0.f26289f
        L4e:
            java.lang.Object r0 = r9.getValue()
            r1 = r0
            F3.f r1 = (F3.f) r1
            F3.e r5 = F3.e.f2491b
            r6 = 3
            r7 = 0
            r2 = 0
            r4 = 0
            F3.f r1 = F3.f.b(r1, r2, r4, r5, r6, r7)
            boolean r0 = r9.a(r0, r1)
            if (r0 == 0) goto L4e
            goto L81
        L67:
            l6.v r9 = r0.f26289f
        L69:
            java.lang.Object r0 = r9.getValue()
            r1 = r0
            F3.f r1 = (F3.f) r1
            F3.e r5 = F3.e.f2492c
            r6 = 3
            r7 = 0
            r2 = 0
            r4 = 0
            F3.f r1 = F3.f.b(r1, r2, r4, r5, r6, r7)
            boolean r0 = r9.a(r0, r1)
            if (r0 == 0) goto L69
        L81:
            L5.I r9 = L5.I.f6474a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.paymentdatacollection.polling.b.q(P5.d):java.lang.Object");
    }

    private final void s(F3.e eVar) {
        Object value;
        v vVar = this.f26289f;
        do {
            value = vVar.getValue();
        } while (!vVar.a(value, F3.f.b((F3.f) value, 0L, 0, eVar, 3, null)));
    }

    public final InterfaceC3349K j() {
        return this.f26290g;
    }

    public final void k() {
        Object value;
        v vVar = this.f26289f;
        do {
            value = vVar.getValue();
        } while (!vVar.a(value, F3.f.b((F3.f) value, 0L, 0, F3.e.f2493d, 3, null)));
        this.f26285b.c();
    }

    public final void p() {
        this.f26285b.c();
    }

    public final void r() {
        AbstractC2825i.d(ViewModelKt.getViewModelScope(this), this.f26287d, null, new m(null), 2, null);
    }
}
