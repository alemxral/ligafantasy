package l6;

import kotlin.jvm.internal.T;
import m6.C3440a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class q {

    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3359g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ T f34709a;

        public a(T t8) {
            this.f34709a = t8;
        }

        @Override // l6.InterfaceC3359g
        public Object emit(Object obj, P5.d dVar) {
            this.f34709a.f33747a = obj;
            throw new C3440a(this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC3359g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X5.n f34710a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f34711b;

        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f34712a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f34713b;

            /* renamed from: c, reason: collision with root package name */
            int f34714c;

            /* renamed from: e, reason: collision with root package name */
            Object f34716e;

            public a(P5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f34713b = obj;
                this.f34714c |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(X5.n nVar, T t8) {
            this.f34710a = nVar;
            this.f34711b = t8;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // l6.InterfaceC3359g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(java.lang.Object r5, P5.d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof l6.q.b.a
                if (r0 == 0) goto L13
                r0 = r6
                l6.q$b$a r0 = (l6.q.b.a) r0
                int r1 = r0.f34714c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f34714c = r1
                goto L18
            L13:
                l6.q$b$a r0 = new l6.q$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f34713b
                java.lang.Object r1 = Q5.b.e()
                int r2 = r0.f34714c
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f34716e
                java.lang.Object r0 = r0.f34712a
                l6.q$b r0 = (l6.q.b) r0
                L5.t.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                L5.t.b(r6)
                X5.n r6 = r4.f34710a
                r0.f34712a = r4
                r0.f34716e = r5
                r0.f34714c = r3
                r2 = 6
                kotlin.jvm.internal.AbstractC3157w.c(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.AbstractC3157w.c(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5d
                L5.I r5 = L5.I.f6474a
                return r5
            L5d:
                kotlin.jvm.internal.T r6 = r0.f34711b
                r6.f33747a = r5
                m6.a r5 = new m6.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: l6.q.b.emit(java.lang.Object, P5.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f34717a;

        /* renamed from: b, reason: collision with root package name */
        Object f34718b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34719c;

        /* renamed from: d, reason: collision with root package name */
        int f34720d;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34719c = obj;
            this.f34720d |= Integer.MIN_VALUE;
            return AbstractC3360h.u(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f34721a;

        /* renamed from: b, reason: collision with root package name */
        Object f34722b;

        /* renamed from: c, reason: collision with root package name */
        Object f34723c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f34724d;

        /* renamed from: e, reason: collision with root package name */
        int f34725e;

        d(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34724d = obj;
            this.f34725e |= Integer.MIN_VALUE;
            return AbstractC3360h.v(null, null, this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class e implements InterfaceC3359g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X5.n f34726a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f34727b;

        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f34728a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f34729b;

            /* renamed from: c, reason: collision with root package name */
            int f34730c;

            /* renamed from: e, reason: collision with root package name */
            Object f34732e;

            public a(P5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f34729b = obj;
                this.f34730c |= Integer.MIN_VALUE;
                return e.this.emit(null, this);
            }
        }

        public e(X5.n nVar, T t8) {
            this.f34726a = nVar;
            this.f34727b = t8;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // l6.InterfaceC3359g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(java.lang.Object r5, P5.d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof l6.q.e.a
                if (r0 == 0) goto L13
                r0 = r6
                l6.q$e$a r0 = (l6.q.e.a) r0
                int r1 = r0.f34730c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f34730c = r1
                goto L18
            L13:
                l6.q$e$a r0 = new l6.q$e$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f34729b
                java.lang.Object r1 = Q5.b.e()
                int r2 = r0.f34730c
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f34732e
                java.lang.Object r0 = r0.f34728a
                l6.q$e r0 = (l6.q.e) r0
                L5.t.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                L5.t.b(r6)
                X5.n r6 = r4.f34726a
                r0.f34728a = r4
                r0.f34732e = r5
                r0.f34730c = r3
                r2 = 6
                kotlin.jvm.internal.AbstractC3157w.c(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.AbstractC3157w.c(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5d
                L5.I r5 = L5.I.f6474a
                return r5
            L5d:
                kotlin.jvm.internal.T r6 = r0.f34727b
                r6.f33747a = r5
                m6.a r5 = new m6.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: l6.q.e.emit(java.lang.Object, P5.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f34733a;

        /* renamed from: b, reason: collision with root package name */
        Object f34734b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34735c;

        /* renamed from: d, reason: collision with root package name */
        int f34736d;

        f(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34735c = obj;
            this.f34736d |= Integer.MIN_VALUE;
            return AbstractC3360h.w(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(l6.InterfaceC3358f r4, P5.d r5) {
        /*
            boolean r0 = r5 instanceof l6.q.c
            if (r0 == 0) goto L13
            r0 = r5
            l6.q$c r0 = (l6.q.c) r0
            int r1 = r0.f34720d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34720d = r1
            goto L18
        L13:
            l6.q$c r0 = new l6.q$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f34719c
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f34720d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f34718b
            l6.q$a r4 = (l6.q.a) r4
            java.lang.Object r0 = r0.f34717a
            kotlin.jvm.internal.T r0 = (kotlin.jvm.internal.T) r0
            L5.t.b(r5)     // Catch: m6.C3440a -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            L5.t.b(r5)
            kotlin.jvm.internal.T r5 = new kotlin.jvm.internal.T
            r5.<init>()
            n6.F r2 = m6.s.f35920a
            r5.f33747a = r2
            l6.q$a r2 = new l6.q$a
            r2.<init>(r5)
            r0.f34717a = r5     // Catch: m6.C3440a -> L5b
            r0.f34718b = r2     // Catch: m6.C3440a -> L5b
            r0.f34720d = r3     // Catch: m6.C3440a -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: m6.C3440a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            m6.o.a(r5, r4)
        L62:
            java.lang.Object r4 = r0.f33747a
            n6.F r5 = m6.s.f35920a
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.q.a(l6.f, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(l6.InterfaceC3358f r4, X5.n r5, P5.d r6) {
        /*
            boolean r0 = r6 instanceof l6.q.d
            if (r0 == 0) goto L13
            r0 = r6
            l6.q$d r0 = (l6.q.d) r0
            int r1 = r0.f34725e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34725e = r1
            goto L18
        L13:
            l6.q$d r0 = new l6.q$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34724d
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f34725e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r4 = r0.f34723c
            l6.q$b r4 = (l6.q.b) r4
            java.lang.Object r5 = r0.f34722b
            kotlin.jvm.internal.T r5 = (kotlin.jvm.internal.T) r5
            java.lang.Object r0 = r0.f34721a
            X5.n r0 = (X5.n) r0
            L5.t.b(r6)     // Catch: m6.C3440a -> L35
            goto L6a
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3f:
            L5.t.b(r6)
            kotlin.jvm.internal.T r6 = new kotlin.jvm.internal.T
            r6.<init>()
            n6.F r2 = m6.s.f35920a
            r6.f33747a = r2
            l6.q$b r2 = new l6.q$b
            r2.<init>(r5, r6)
            r0.f34721a = r5     // Catch: m6.C3440a -> L62
            r0.f34722b = r6     // Catch: m6.C3440a -> L62
            r0.f34723c = r2     // Catch: m6.C3440a -> L62
            r0.f34725e = r3     // Catch: m6.C3440a -> L62
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: m6.C3440a -> L62
            if (r4 != r1) goto L5f
            return r1
        L5f:
            r0 = r5
            r5 = r6
            goto L6a
        L62:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L67:
            m6.o.a(r6, r4)
        L6a:
            java.lang.Object r4 = r5.f33747a
            n6.F r5 = m6.s.f35920a
            if (r4 == r5) goto L71
            return r4
        L71:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.q.b(l6.f, X5.n, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(l6.InterfaceC3358f r4, X5.n r5, P5.d r6) {
        /*
            boolean r0 = r6 instanceof l6.q.f
            if (r0 == 0) goto L13
            r0 = r6
            l6.q$f r0 = (l6.q.f) r0
            int r1 = r0.f34736d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34736d = r1
            goto L18
        L13:
            l6.q$f r0 = new l6.q$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34735c
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f34736d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f34734b
            l6.q$e r4 = (l6.q.e) r4
            java.lang.Object r5 = r0.f34733a
            kotlin.jvm.internal.T r5 = (kotlin.jvm.internal.T) r5
            L5.t.b(r6)     // Catch: m6.C3440a -> L31
            goto L5e
        L31:
            r6 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            L5.t.b(r6)
            kotlin.jvm.internal.T r6 = new kotlin.jvm.internal.T
            r6.<init>()
            l6.q$e r2 = new l6.q$e
            r2.<init>(r5, r6)
            r0.f34733a = r6     // Catch: m6.C3440a -> L57
            r0.f34734b = r2     // Catch: m6.C3440a -> L57
            r0.f34736d = r3     // Catch: m6.C3440a -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: m6.C3440a -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r5 = r6
            goto L5e
        L57:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5b:
            m6.o.a(r6, r4)
        L5e:
            java.lang.Object r4 = r5.f33747a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.q.c(l6.f, X5.n, P5.d):java.lang.Object");
    }
}
