package l6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l6.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3366n {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l6.n$a */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f34640a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34641b;

        /* renamed from: c, reason: collision with root package name */
        int f34642c;

        a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34641b = obj;
            this.f34642c |= Integer.MIN_VALUE;
            return AbstractC3366n.c(null, null, null, this);
        }
    }

    /* renamed from: l6.n$b */
    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f34643a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X5.o f34644b;

        /* renamed from: l6.n$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f34645a;

            /* renamed from: b, reason: collision with root package name */
            int f34646b;

            /* renamed from: d, reason: collision with root package name */
            Object f34648d;

            /* renamed from: e, reason: collision with root package name */
            Object f34649e;

            public a(P5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f34645a = obj;
                this.f34646b |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        public b(InterfaceC3358f interfaceC3358f, X5.o oVar) {
            this.f34643a = interfaceC3358f;
            this.f34644b = oVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        @Override // l6.InterfaceC3358f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(l6.InterfaceC3359g r9, P5.d r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof l6.AbstractC3366n.b.a
                if (r0 == 0) goto L13
                r0 = r10
                l6.n$b$a r0 = (l6.AbstractC3366n.b.a) r0
                int r1 = r0.f34646b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f34646b = r1
                goto L18
            L13:
                l6.n$b$a r0 = new l6.n$b$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f34645a
                java.lang.Object r1 = Q5.b.e()
                int r2 = r0.f34646b
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L54
                if (r2 == r5) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r9 = r0.f34648d
                m6.t r9 = (m6.t) r9
                L5.t.b(r10)     // Catch: java.lang.Throwable -> L34
                goto L88
            L34:
                r10 = move-exception
                goto L92
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f34648d
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                L5.t.b(r10)
                goto Lac
            L46:
                java.lang.Object r9 = r0.f34649e
                l6.g r9 = (l6.InterfaceC3359g) r9
                java.lang.Object r2 = r0.f34648d
                l6.n$b r2 = (l6.AbstractC3366n.b) r2
                L5.t.b(r10)     // Catch: java.lang.Throwable -> L52
                goto L67
            L52:
                r9 = move-exception
                goto L98
            L54:
                L5.t.b(r10)
                l6.f r10 = r8.f34643a     // Catch: java.lang.Throwable -> L96
                r0.f34648d = r8     // Catch: java.lang.Throwable -> L96
                r0.f34649e = r9     // Catch: java.lang.Throwable -> L96
                r0.f34646b = r5     // Catch: java.lang.Throwable -> L96
                java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L96
                if (r10 != r1) goto L66
                return r1
            L66:
                r2 = r8
            L67:
                m6.t r10 = new m6.t
                P5.g r4 = r0.getContext()
                r10.<init>(r9, r4)
                X5.o r9 = r2.f34644b     // Catch: java.lang.Throwable -> L8e
                r0.f34648d = r10     // Catch: java.lang.Throwable -> L8e
                r0.f34649e = r6     // Catch: java.lang.Throwable -> L8e
                r0.f34646b = r3     // Catch: java.lang.Throwable -> L8e
                r2 = 6
                kotlin.jvm.internal.AbstractC3157w.c(r2)     // Catch: java.lang.Throwable -> L8e
                java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L8e
                r0 = 7
                kotlin.jvm.internal.AbstractC3157w.c(r0)     // Catch: java.lang.Throwable -> L8e
                if (r9 != r1) goto L87
                return r1
            L87:
                r9 = r10
            L88:
                r9.releaseIntercepted()
                L5.I r9 = L5.I.f6474a
                return r9
            L8e:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L92:
                r9.releaseIntercepted()
                throw r10
            L96:
                r9 = move-exception
                r2 = r8
            L98:
                l6.O r10 = new l6.O
                r10.<init>(r9)
                X5.o r2 = r2.f34644b
                r0.f34648d = r9
                r0.f34649e = r6
                r0.f34646b = r4
                java.lang.Object r10 = l6.AbstractC3366n.a(r10, r2, r9, r0)
                if (r10 != r1) goto Lac
                return r1
            Lac:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: l6.AbstractC3366n.b.collect(l6.g, P5.d):java.lang.Object");
        }
    }

    /* renamed from: l6.n$c */
    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X5.n f34650a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f34651b;

        /* renamed from: l6.n$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f34652a;

            /* renamed from: b, reason: collision with root package name */
            int f34653b;

            /* renamed from: d, reason: collision with root package name */
            Object f34655d;

            /* renamed from: e, reason: collision with root package name */
            Object f34656e;

            /* renamed from: f, reason: collision with root package name */
            Object f34657f;

            public a(P5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f34652a = obj;
                this.f34653b |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(X5.n nVar, InterfaceC3358f interfaceC3358f) {
            this.f34650a = nVar;
            this.f34651b = interfaceC3358f;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // l6.InterfaceC3358f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(l6.InterfaceC3359g r7, P5.d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof l6.AbstractC3366n.c.a
                if (r0 == 0) goto L13
                r0 = r8
                l6.n$c$a r0 = (l6.AbstractC3366n.c.a) r0
                int r1 = r0.f34653b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f34653b = r1
                goto L18
            L13:
                l6.n$c$a r0 = new l6.n$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f34652a
                java.lang.Object r1 = Q5.b.e()
                int r2 = r0.f34653b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                L5.t.b(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f34657f
                m6.t r7 = (m6.t) r7
                java.lang.Object r2 = r0.f34656e
                l6.g r2 = (l6.InterfaceC3359g) r2
                java.lang.Object r4 = r0.f34655d
                l6.n$c r4 = (l6.AbstractC3366n.c) r4
                L5.t.b(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                L5.t.b(r8)
                m6.t r8 = new m6.t
                P5.g r2 = r0.getContext()
                r8.<init>(r7, r2)
                X5.n r2 = r6.f34650a     // Catch: java.lang.Throwable -> L86
                r0.f34655d = r6     // Catch: java.lang.Throwable -> L86
                r0.f34656e = r7     // Catch: java.lang.Throwable -> L86
                r0.f34657f = r8     // Catch: java.lang.Throwable -> L86
                r0.f34653b = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                kotlin.jvm.internal.AbstractC3157w.c(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                kotlin.jvm.internal.AbstractC3157w.c(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                return r1
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.releaseIntercepted()
                l6.f r7 = r4.f34651b
                r8 = 0
                r0.f34655d = r8
                r0.f34656e = r8
                r0.f34657f = r8
                r0.f34653b = r3
                java.lang.Object r7 = r7.collect(r2, r0)
                if (r7 != r1) goto L83
                return r1
            L83:
                L5.I r7 = L5.I.f6474a
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: l6.AbstractC3366n.c.collect(l6.g, P5.d):java.lang.Object");
        }
    }

    public static final void b(InterfaceC3359g interfaceC3359g) {
        if (!(interfaceC3359g instanceof O)) {
        } else {
            throw ((O) interfaceC3359g).f34604a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(l6.InterfaceC3359g r4, X5.o r5, java.lang.Throwable r6, P5.d r7) {
        /*
            boolean r0 = r7 instanceof l6.AbstractC3366n.a
            if (r0 == 0) goto L13
            r0 = r7
            l6.n$a r0 = (l6.AbstractC3366n.a) r0
            int r1 = r0.f34642c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34642c = r1
            goto L18
        L13:
            l6.n$a r0 = new l6.n$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f34641b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f34642c
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.f34640a
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            L5.t.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L46
        L2e:
            r4 = move-exception
            goto L49
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            L5.t.b(r7)
            r0.f34640a = r6     // Catch: java.lang.Throwable -> L2e
            r0.f34642c = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r1) goto L46
            return r1
        L46:
            L5.I r4 = L5.I.f6474a
            return r4
        L49:
            if (r6 == 0) goto L50
            if (r6 == r4) goto L50
            L5.AbstractC1221e.a(r4, r6)
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.AbstractC3366n.c(l6.g, X5.o, java.lang.Throwable, P5.d):java.lang.Object");
    }

    public static final InterfaceC3358f d(InterfaceC3358f interfaceC3358f, X5.o oVar) {
        return new b(interfaceC3358f, oVar);
    }

    public static final InterfaceC3358f e(InterfaceC3358f interfaceC3358f, X5.n nVar) {
        return new c(nVar, interfaceC3358f);
    }
}
