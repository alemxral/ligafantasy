package K2;

import L5.s;
import N2.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.v;

/* loaded from: classes4.dex */
public final class k implements K2.e {

    /* renamed from: a, reason: collision with root package name */
    private final b.a f5911a;

    /* renamed from: b, reason: collision with root package name */
    private final v f5912b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3349K f5913c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f5914a;

        /* renamed from: c, reason: collision with root package name */
        int f5916c;

        a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5914a = obj;
            this.f5916c |= Integer.MIN_VALUE;
            Object b8 = k.this.b(null, null, this);
            if (b8 == Q5.b.e()) {
                return b8;
            }
            return s.a(b8);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f5917a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3349K invoke(N2.b bVar) {
            L2.b c8;
            InterfaceC3349K h8;
            if (bVar == null || (c8 = bVar.c()) == null || (h8 = c8.h()) == null) {
                return v4.g.n(null);
            }
            return h8;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f5918a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(O2.b bVar) {
            if (bVar != null) {
                return bVar.e();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f5919a;

        /* renamed from: c, reason: collision with root package name */
        int f5921c;

        d(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5919a = obj;
            this.f5921c |= Integer.MIN_VALUE;
            Object f8 = k.this.f(null, this);
            if (f8 == Q5.b.e()) {
                return f8;
            }
            return s.a(f8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f5922a;

        /* renamed from: c, reason: collision with root package name */
        int f5924c;

        e(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5922a = obj;
            this.f5924c |= Integer.MIN_VALUE;
            Object e8 = k.this.e(null, null, this);
            if (e8 == Q5.b.e()) {
                return e8;
            }
            return s.a(e8);
        }
    }

    public k(b.a linkComponentBuilder) {
        AbstractC3159y.i(linkComponentBuilder, "linkComponentBuilder");
        this.f5911a = linkComponentBuilder;
        v a8 = AbstractC3351M.a(null);
        this.f5912b = a8;
        this.f5913c = v4.g.m(v4.g.l(a8, b.f5917a), c.f5918a);
    }

    private final N2.b g(K2.d dVar) {
        N2.b bVar = (N2.b) this.f5912b.getValue();
        if (bVar != null) {
            if (!AbstractC3159y.d(bVar.a(), dVar)) {
                bVar = null;
            }
            if (bVar != null) {
                return bVar;
            }
        }
        N2.b build = this.f5911a.a(dVar).build();
        this.f5912b.setValue(build);
        return build;
    }

    @Override // K2.e
    public InterfaceC3358f a(K2.d configuration) {
        AbstractC3159y.i(configuration, "configuration");
        return g(configuration).c().f();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // K2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(K2.d r5, com.stripe.android.model.p r6, P5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof K2.k.a
            if (r0 == 0) goto L13
            r0 = r7
            K2.k$a r0 = (K2.k.a) r0
            int r1 = r0.f5916c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5916c = r1
            goto L18
        L13:
            K2.k$a r0 = new K2.k$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f5914a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f5916c
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
            N2.b r5 = r4.g(r5)
            L2.b r5 = r5.c()
            r0.f5916c = r3
            java.lang.Object r5 = r5.d(r6, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.k.b(K2.d, com.stripe.android.model.p, P5.d):java.lang.Object");
    }

    @Override // K2.e
    public N2.b c(K2.d configuration) {
        AbstractC3159y.i(configuration, "configuration");
        return g(configuration);
    }

    @Override // K2.e
    public InterfaceC3349K d() {
        return this.f5913c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // K2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(K2.d r5, T2.m r6, P5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof K2.k.e
            if (r0 == 0) goto L13
            r0 = r7
            K2.k$e r0 = (K2.k.e) r0
            int r1 = r0.f5924c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5924c = r1
            goto L18
        L13:
            K2.k$e r0 = new K2.k$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f5922a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f5924c
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
            N2.b r5 = r4.g(r5)
            L2.b r5 = r5.c()
            r0.f5924c = r3
            java.lang.Object r5 = r5.p(r6, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            boolean r6 = L5.s.h(r5)
            if (r6 == 0) goto L57
            O2.b r5 = (O2.b) r5
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)
        L57:
            java.lang.Object r5 = L5.s.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.k.e(K2.d, T2.m, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // K2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(K2.d r5, P5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof K2.k.d
            if (r0 == 0) goto L13
            r0 = r6
            K2.k$d r0 = (K2.k.d) r0
            int r1 = r0.f5921c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5921c = r1
            goto L18
        L13:
            K2.k$d r0 = new K2.k$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f5919a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f5921c
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
            N2.b r5 = r4.g(r5)
            L2.b r5 = r5.c()
            r0.f5921c = r3
            java.lang.Object r5 = r5.i(r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.k.f(K2.d, P5.d):java.lang.Object");
    }
}
