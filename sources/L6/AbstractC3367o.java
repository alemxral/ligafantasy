package l6;

import kotlin.jvm.internal.Q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l6.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3367o {

    /* renamed from: l6.o$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f34658a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f34659b;

        public a(InterfaceC3358f interfaceC3358f, int i8) {
            this.f34658a = interfaceC3358f;
            this.f34659b = i8;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            Object collect = this.f34658a.collect(new b(new Q(), this.f34659b, interfaceC3359g), dVar);
            if (collect == Q5.b.e()) {
                return collect;
            }
            return L5.I.f6474a;
        }
    }

    /* renamed from: l6.o$b */
    /* loaded from: classes5.dex */
    static final class b implements InterfaceC3359g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q f34660a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f34661b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3359g f34662c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l6.o$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f34663a;

            /* renamed from: c, reason: collision with root package name */
            int f34665c;

            a(P5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f34663a = obj;
                this.f34665c |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        b(Q q8, int i8, InterfaceC3359g interfaceC3359g) {
            this.f34660a = q8;
            this.f34661b = i8;
            this.f34662c = interfaceC3359g;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // l6.InterfaceC3359g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, P5.d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof l6.AbstractC3367o.b.a
                if (r0 == 0) goto L13
                r0 = r7
                l6.o$b$a r0 = (l6.AbstractC3367o.b.a) r0
                int r1 = r0.f34665c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f34665c = r1
                goto L18
            L13:
                l6.o$b$a r0 = new l6.o$b$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f34663a
                java.lang.Object r1 = Q5.b.e()
                int r2 = r0.f34665c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                L5.t.b(r7)
                goto L47
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                L5.t.b(r7)
                kotlin.jvm.internal.Q r7 = r5.f34660a
                int r2 = r7.f33745a
                int r4 = r5.f34661b
                if (r2 < r4) goto L4a
                l6.g r7 = r5.f34662c
                r0.f34665c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                L5.I r6 = L5.I.f6474a
                return r6
            L4a:
                int r2 = r2 + r3
                r7.f33745a = r2
                L5.I r6 = L5.I.f6474a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l6.AbstractC3367o.b.emit(java.lang.Object, P5.d):java.lang.Object");
        }
    }

    /* renamed from: l6.o$c */
    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f34666a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X5.n f34667b;

        public c(InterfaceC3358f interfaceC3358f, X5.n nVar) {
            this.f34666a = interfaceC3358f;
            this.f34667b = nVar;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            Object collect = this.f34666a.collect(new d(new kotlin.jvm.internal.O(), interfaceC3359g, this.f34667b), dVar);
            if (collect == Q5.b.e()) {
                return collect;
            }
            return L5.I.f6474a;
        }
    }

    /* renamed from: l6.o$d */
    /* loaded from: classes5.dex */
    static final class d implements InterfaceC3359g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.O f34668a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3359g f34669b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ X5.n f34670c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l6.o$d$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f34671a;

            /* renamed from: b, reason: collision with root package name */
            Object f34672b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f34673c;

            /* renamed from: e, reason: collision with root package name */
            int f34675e;

            a(P5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f34673c = obj;
                this.f34675e |= Integer.MIN_VALUE;
                return d.this.emit(null, this);
            }
        }

        d(kotlin.jvm.internal.O o8, InterfaceC3359g interfaceC3359g, X5.n nVar) {
            this.f34668a = o8;
            this.f34669b = interfaceC3359g;
            this.f34670c = nVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // l6.InterfaceC3359g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r7, P5.d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof l6.AbstractC3367o.d.a
                if (r0 == 0) goto L13
                r0 = r8
                l6.o$d$a r0 = (l6.AbstractC3367o.d.a) r0
                int r1 = r0.f34675e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f34675e = r1
                goto L18
            L13:
                l6.o$d$a r0 = new l6.o$d$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f34673c
                java.lang.Object r1 = Q5.b.e()
                int r2 = r0.f34675e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                L5.t.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f34672b
                java.lang.Object r2 = r0.f34671a
                l6.o$d r2 = (l6.AbstractC3367o.d) r2
                L5.t.b(r8)
                goto L6c
            L41:
                L5.t.b(r8)
                goto L59
            L45:
                L5.t.b(r8)
                kotlin.jvm.internal.O r8 = r6.f34668a
                boolean r8 = r8.f33743a
                if (r8 == 0) goto L5c
                l6.g r8 = r6.f34669b
                r0.f34675e = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                L5.I r7 = L5.I.f6474a
                return r7
            L5c:
                X5.n r8 = r6.f34670c
                r0.f34671a = r6
                r0.f34672b = r7
                r0.f34675e = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.O r8 = r2.f34668a
                r8.f33743a = r5
                l6.g r8 = r2.f34669b
                r2 = 0
                r0.f34671a = r2
                r0.f34672b = r2
                r0.f34675e = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                L5.I r7 = L5.I.f6474a
                return r7
            L8b:
                L5.I r7 = L5.I.f6474a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: l6.AbstractC3367o.d.emit(java.lang.Object, P5.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l6.o$e */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f34676a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34677b;

        /* renamed from: c, reason: collision with root package name */
        int f34678c;

        e(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34677b = obj;
            this.f34678c |= Integer.MIN_VALUE;
            return AbstractC3367o.d(null, null, this);
        }
    }

    /* renamed from: l6.o$f */
    /* loaded from: classes5.dex */
    public static final class f implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f34679a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f34680b;

        /* renamed from: l6.o$f$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f34681a;

            /* renamed from: b, reason: collision with root package name */
            int f34682b;

            /* renamed from: d, reason: collision with root package name */
            Object f34684d;

            public a(P5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f34681a = obj;
                this.f34682b |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(InterfaceC3358f interfaceC3358f, int i8) {
            this.f34679a = interfaceC3358f;
            this.f34680b = i8;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
        
            r8 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        
            m6.o.a(r8, r7);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        @Override // l6.InterfaceC3358f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(l6.InterfaceC3359g r7, P5.d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof l6.AbstractC3367o.f.a
                if (r0 == 0) goto L13
                r0 = r8
                l6.o$f$a r0 = (l6.AbstractC3367o.f.a) r0
                int r1 = r0.f34682b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f34682b = r1
                goto L18
            L13:
                l6.o$f$a r0 = new l6.o$f$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f34681a
                java.lang.Object r1 = Q5.b.e()
                int r2 = r0.f34682b
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r7 = r0.f34684d
                l6.g r7 = (l6.InterfaceC3359g) r7
                L5.t.b(r8)     // Catch: m6.C3440a -> L2d
                goto L56
            L2d:
                r8 = move-exception
                goto L53
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                L5.t.b(r8)
                kotlin.jvm.internal.Q r8 = new kotlin.jvm.internal.Q
                r8.<init>()
                l6.f r2 = r6.f34679a     // Catch: m6.C3440a -> L2d
                l6.o$g r4 = new l6.o$g     // Catch: m6.C3440a -> L2d
                int r5 = r6.f34680b     // Catch: m6.C3440a -> L2d
                r4.<init>(r8, r5, r7)     // Catch: m6.C3440a -> L2d
                r0.f34684d = r7     // Catch: m6.C3440a -> L2d
                r0.f34682b = r3     // Catch: m6.C3440a -> L2d
                java.lang.Object r7 = r2.collect(r4, r0)     // Catch: m6.C3440a -> L2d
                if (r7 != r1) goto L56
                return r1
            L53:
                m6.o.a(r8, r7)
            L56:
                L5.I r7 = L5.I.f6474a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: l6.AbstractC3367o.f.collect(l6.g, P5.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l6.o$g */
    /* loaded from: classes5.dex */
    public static final class g implements InterfaceC3359g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q f34685a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f34686b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3359g f34687c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l6.o$g$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f34688a;

            /* renamed from: c, reason: collision with root package name */
            int f34690c;

            a(P5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f34688a = obj;
                this.f34690c |= Integer.MIN_VALUE;
                return g.this.emit(null, this);
            }
        }

        g(Q q8, int i8, InterfaceC3359g interfaceC3359g) {
            this.f34685a = q8;
            this.f34686b = i8;
            this.f34687c = interfaceC3359g;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // l6.InterfaceC3359g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, P5.d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof l6.AbstractC3367o.g.a
                if (r0 == 0) goto L13
                r0 = r7
                l6.o$g$a r0 = (l6.AbstractC3367o.g.a) r0
                int r1 = r0.f34690c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f34690c = r1
                goto L18
            L13:
                l6.o$g$a r0 = new l6.o$g$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f34688a
                java.lang.Object r1 = Q5.b.e()
                int r2 = r0.f34690c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                L5.t.b(r7)
                goto L5f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                L5.t.b(r7)
                goto L51
            L38:
                L5.t.b(r7)
                kotlin.jvm.internal.Q r7 = r5.f34685a
                int r2 = r7.f33745a
                int r2 = r2 + r4
                r7.f33745a = r2
                int r7 = r5.f34686b
                if (r2 >= r7) goto L54
                l6.g r7 = r5.f34687c
                r0.f34690c = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                L5.I r6 = L5.I.f6474a
                return r6
            L54:
                l6.g r7 = r5.f34687c
                r0.f34690c = r3
                java.lang.Object r6 = l6.AbstractC3367o.a(r7, r6, r0)
                if (r6 != r1) goto L5f
                return r1
            L5f:
                L5.I r6 = L5.I.f6474a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l6.AbstractC3367o.g.emit(java.lang.Object, P5.d):java.lang.Object");
        }
    }

    /* renamed from: l6.o$h */
    /* loaded from: classes5.dex */
    public static final class h implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f34691a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X5.n f34692b;

        /* renamed from: l6.o$h$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f34693a;

            /* renamed from: b, reason: collision with root package name */
            int f34694b;

            /* renamed from: d, reason: collision with root package name */
            Object f34696d;

            public a(P5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f34693a = obj;
                this.f34694b |= Integer.MIN_VALUE;
                return h.this.collect(null, this);
            }
        }

        public h(InterfaceC3358f interfaceC3358f, X5.n nVar) {
            this.f34691a = interfaceC3358f;
            this.f34692b = nVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // l6.InterfaceC3358f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(l6.InterfaceC3359g r6, P5.d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof l6.AbstractC3367o.h.a
                if (r0 == 0) goto L13
                r0 = r7
                l6.o$h$a r0 = (l6.AbstractC3367o.h.a) r0
                int r1 = r0.f34694b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f34694b = r1
                goto L18
            L13:
                l6.o$h$a r0 = new l6.o$h$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f34693a
                java.lang.Object r1 = Q5.b.e()
                int r2 = r0.f34694b
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r6 = r0.f34696d
                l6.o$i r6 = (l6.AbstractC3367o.i) r6
                L5.t.b(r7)     // Catch: m6.C3440a -> L2d
                goto L53
            L2d:
                r7 = move-exception
                goto L50
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                L5.t.b(r7)
                l6.f r7 = r5.f34691a
                l6.o$i r2 = new l6.o$i
                X5.n r4 = r5.f34692b
                r2.<init>(r4, r6)
                r0.f34696d = r2     // Catch: m6.C3440a -> L4e
                r0.f34694b = r3     // Catch: m6.C3440a -> L4e
                java.lang.Object r6 = r7.collect(r2, r0)     // Catch: m6.C3440a -> L4e
                if (r6 != r1) goto L53
                return r1
            L4e:
                r7 = move-exception
                r6 = r2
            L50:
                m6.o.a(r7, r6)
            L53:
                L5.I r6 = L5.I.f6474a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l6.AbstractC3367o.h.collect(l6.g, P5.d):java.lang.Object");
        }
    }

    /* renamed from: l6.o$i */
    /* loaded from: classes5.dex */
    public static final class i implements InterfaceC3359g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X5.n f34697a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3359g f34698b;

        /* renamed from: l6.o$i$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f34699a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f34700b;

            /* renamed from: c, reason: collision with root package name */
            int f34701c;

            /* renamed from: e, reason: collision with root package name */
            Object f34703e;

            public a(P5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f34700b = obj;
                this.f34701c |= Integer.MIN_VALUE;
                return i.this.emit(null, this);
            }
        }

        public i(X5.n nVar, InterfaceC3359g interfaceC3359g) {
            this.f34697a = nVar;
            this.f34698b = interfaceC3359g;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // l6.InterfaceC3359g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(java.lang.Object r8, P5.d r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof l6.AbstractC3367o.i.a
                if (r0 == 0) goto L13
                r0 = r9
                l6.o$i$a r0 = (l6.AbstractC3367o.i.a) r0
                int r1 = r0.f34701c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f34701c = r1
                goto L18
            L13:
                l6.o$i$a r0 = new l6.o$i$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f34700b
                java.lang.Object r1 = Q5.b.e()
                int r2 = r0.f34701c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f34699a
                l6.o$i r8 = (l6.AbstractC3367o.i) r8
                L5.t.b(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.f34703e
                java.lang.Object r2 = r0.f34699a
                l6.o$i r2 = (l6.AbstractC3367o.i) r2
                L5.t.b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                L5.t.b(r9)
                X5.n r9 = r7.f34697a
                r0.f34699a = r7
                r0.f34703e = r8
                r0.f34701c = r4
                r2 = 6
                kotlin.jvm.internal.AbstractC3157w.c(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                kotlin.jvm.internal.AbstractC3157w.c(r2)
                if (r9 != r1) goto L60
                return r1
            L60:
                r2 = r9
                r9 = r8
                r8 = r7
            L63:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L7b
                l6.g r2 = r8.f34698b
                r0.f34699a = r8
                r5 = 0
                r0.f34703e = r5
                r0.f34701c = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L7c
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                L5.I r8 = L5.I.f6474a
                return r8
            L81:
                m6.a r9 = new m6.a
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: l6.AbstractC3367o.i.emit(java.lang.Object, P5.d):java.lang.Object");
        }
    }

    public static final InterfaceC3358f b(InterfaceC3358f interfaceC3358f, int i8) {
        if (i8 >= 0) {
            return new a(interfaceC3358f, i8);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i8).toString());
    }

    public static final InterfaceC3358f c(InterfaceC3358f interfaceC3358f, X5.n nVar) {
        return new c(interfaceC3358f, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(l6.InterfaceC3359g r4, java.lang.Object r5, P5.d r6) {
        /*
            boolean r0 = r6 instanceof l6.AbstractC3367o.e
            if (r0 == 0) goto L13
            r0 = r6
            l6.o$e r0 = (l6.AbstractC3367o.e) r0
            int r1 = r0.f34678c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34678c = r1
            goto L18
        L13:
            l6.o$e r0 = new l6.o$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34677b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f34678c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.f34676a
            l6.g r4 = (l6.InterfaceC3359g) r4
            L5.t.b(r6)
            goto L43
        L35:
            L5.t.b(r6)
            r0.f34676a = r4
            r0.f34678c = r3
            java.lang.Object r5 = r4.emit(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            m6.a r5 = new m6.a
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.AbstractC3367o.d(l6.g, java.lang.Object, P5.d):java.lang.Object");
    }

    public static final InterfaceC3358f e(InterfaceC3358f interfaceC3358f, int i8) {
        if (i8 > 0) {
            return new f(interfaceC3358f, i8);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " should be positive").toString());
    }

    public static final InterfaceC3358f f(InterfaceC3358f interfaceC3358f, X5.n nVar) {
        return new h(interfaceC3358f, nVar);
    }
}
