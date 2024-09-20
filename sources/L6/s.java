package l6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class s {

    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f34750a;

        /* renamed from: l6.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0789a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3359g f34751a;

            /* renamed from: l6.s$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0790a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f34752a;

                /* renamed from: b, reason: collision with root package name */
                int f34753b;

                public C0790a(P5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f34752a = obj;
                    this.f34753b |= Integer.MIN_VALUE;
                    return C0789a.this.emit(null, this);
                }
            }

            public C0789a(InterfaceC3359g interfaceC3359g) {
                this.f34751a = interfaceC3359g;
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
                    boolean r0 = r6 instanceof l6.s.a.C0789a.C0790a
                    if (r0 == 0) goto L13
                    r0 = r6
                    l6.s$a$a$a r0 = (l6.s.a.C0789a.C0790a) r0
                    int r1 = r0.f34753b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f34753b = r1
                    goto L18
                L13:
                    l6.s$a$a$a r0 = new l6.s$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f34752a
                    java.lang.Object r1 = Q5.b.e()
                    int r2 = r0.f34753b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    L5.t.b(r6)
                    goto L41
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    L5.t.b(r6)
                    l6.g r6 = r4.f34751a
                    if (r5 == 0) goto L41
                    r0.f34753b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    L5.I r5 = L5.I.f6474a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: l6.s.a.C0789a.emit(java.lang.Object, P5.d):java.lang.Object");
            }
        }

        public a(InterfaceC3358f interfaceC3358f) {
            this.f34750a = interfaceC3358f;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            Object collect = this.f34750a.collect(new C0789a(interfaceC3359g), dVar);
            if (collect == Q5.b.e()) {
                return collect;
            }
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f34755a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X5.n f34756b;

        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3359g f34757a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ X5.n f34758b;

            /* renamed from: l6.s$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0791a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f34759a;

                /* renamed from: b, reason: collision with root package name */
                int f34760b;

                /* renamed from: d, reason: collision with root package name */
                Object f34762d;

                /* renamed from: e, reason: collision with root package name */
                Object f34763e;

                public C0791a(P5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f34759a = obj;
                    this.f34760b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC3359g interfaceC3359g, X5.n nVar) {
                this.f34757a = interfaceC3359g;
                this.f34758b = nVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // l6.InterfaceC3359g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r6, P5.d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof l6.s.b.a.C0791a
                    if (r0 == 0) goto L13
                    r0 = r7
                    l6.s$b$a$a r0 = (l6.s.b.a.C0791a) r0
                    int r1 = r0.f34760b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f34760b = r1
                    goto L18
                L13:
                    l6.s$b$a$a r0 = new l6.s$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f34759a
                    java.lang.Object r1 = Q5.b.e()
                    int r2 = r0.f34760b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    L5.t.b(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f34763e
                    l6.g r6 = (l6.InterfaceC3359g) r6
                    java.lang.Object r2 = r0.f34762d
                    L5.t.b(r7)
                    goto L5c
                L3e:
                    L5.t.b(r7)
                    l6.g r7 = r5.f34757a
                    X5.n r2 = r5.f34758b
                    r0.f34762d = r6
                    r0.f34763e = r7
                    r0.f34760b = r4
                    r4 = 6
                    kotlin.jvm.internal.AbstractC3157w.c(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    kotlin.jvm.internal.AbstractC3157w.c(r4)
                    if (r2 != r1) goto L5a
                    return r1
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.f34762d = r7
                    r0.f34763e = r7
                    r0.f34760b = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L6a
                    return r1
                L6a:
                    L5.I r6 = L5.I.f6474a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: l6.s.b.a.emit(java.lang.Object, P5.d):java.lang.Object");
            }
        }

        public b(InterfaceC3358f interfaceC3358f, X5.n nVar) {
            this.f34755a = interfaceC3358f;
            this.f34756b = nVar;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            Object collect = this.f34755a.collect(new a(interfaceC3359g, this.f34756b), dVar);
            if (collect == Q5.b.e()) {
                return collect;
            }
            return L5.I.f6474a;
        }
    }

    public static final InterfaceC3358f a(InterfaceC3358f interfaceC3358f) {
        return new a(interfaceC3358f);
    }

    public static final InterfaceC3358f b(InterfaceC3358f interfaceC3358f, X5.n nVar) {
        return new b(interfaceC3358f, nVar);
    }
}
