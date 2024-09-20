package J3;

import J3.V;
import L5.C1224h;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.U0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import q3.C3649b;
import y3.AbstractC3991f;
import z3.InterfaceC4021c;

/* renamed from: J3.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1203k implements V {

    /* renamed from: r, reason: collision with root package name */
    public static final h f5230r = new h(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f5231s = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3349K f5232a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f5233b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3349K f5234c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f5235d;

    /* renamed from: e, reason: collision with root package name */
    private final Function0 f5236e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3349K f5237f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f5238g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3349K f5239h;

    /* renamed from: i, reason: collision with root package name */
    private final Function0 f5240i;

    /* renamed from: j, reason: collision with root package name */
    private final Function1 f5241j;

    /* renamed from: k, reason: collision with root package name */
    private final Function1 f5242k;

    /* renamed from: l, reason: collision with root package name */
    private final Function1 f5243l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f5244m;

    /* renamed from: n, reason: collision with root package name */
    private final i6.M f5245n;

    /* renamed from: o, reason: collision with root package name */
    private final l6.v f5246o;

    /* renamed from: p, reason: collision with root package name */
    private final l6.v f5247p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3349K f5248q;

    /* renamed from: J3.k$a */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f5249a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0103a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1203k f5251a;

            C0103a(C1203k c1203k) {
                this.f5251a = c1203k;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List list, P5.d dVar) {
                Object value;
                l6.v vVar = this.f5251a.f5247p;
                do {
                    value = vVar.getValue();
                } while (!vVar.a(value, V.a.b((V.a) value, list, null, false, false, false, false, 62, null)));
                return L5.I.f6474a;
            }
        }

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f5249a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K interfaceC3349K = C1203k.this.f5232a;
                C0103a c0103a = new C0103a(C1203k.this);
                this.f5249a = 1;
                if (interfaceC3349K.collect(c0103a, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* renamed from: J3.k$b */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f5252a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1203k f5254a;

            a(C1203k c1203k) {
                this.f5254a = c1203k;
            }

            public final Object b(boolean z8, P5.d dVar) {
                Object value;
                l6.v vVar = this.f5254a.f5247p;
                do {
                    value = vVar.getValue();
                } while (!vVar.a(value, V.a.b((V.a) value, null, null, z8, false, false, false, 59, null)));
                return L5.I.f6474a;
            }

            @Override // l6.InterfaceC3359g
            public /* bridge */ /* synthetic */ Object emit(Object obj, P5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f5252a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K interfaceC3349K = C1203k.this.f5233b;
                a aVar = new a(C1203k.this);
                this.f5252a = 1;
                if (interfaceC3349K.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* renamed from: J3.k$c */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f5255a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1203k f5257a;

            a(C1203k c1203k) {
                this.f5257a = c1203k;
            }

            public final Object b(boolean z8, P5.d dVar) {
                Object value;
                l6.v vVar = this.f5257a.f5247p;
                do {
                    value = vVar.getValue();
                } while (!vVar.a(value, V.a.b((V.a) value, null, null, false, false, z8, false, 47, null)));
                return L5.I.f6474a;
            }

            @Override // l6.InterfaceC3359g
            public /* bridge */ /* synthetic */ Object emit(Object obj, P5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        c(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f5255a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K interfaceC3349K = C1203k.this.f5234c;
                a aVar = new a(C1203k.this);
                this.f5255a = 1;
                if (interfaceC3349K.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* renamed from: J3.k$d */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f5258a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1203k f5260a;

            a(C1203k c1203k) {
                this.f5260a = c1203k;
            }

            public final Object b(boolean z8, P5.d dVar) {
                Object value;
                l6.v vVar = this.f5260a.f5247p;
                do {
                    value = vVar.getValue();
                } while (!vVar.a(value, V.a.b((V.a) value, null, null, false, false, false, z8, 31, null)));
                return L5.I.f6474a;
            }

            @Override // l6.InterfaceC3359g
            public /* bridge */ /* synthetic */ Object emit(Object obj, P5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        d(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f5258a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K interfaceC3349K = C1203k.this.f5235d;
                a aVar = new a(C1203k.this);
                this.f5258a = 1;
                if (interfaceC3349K.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* renamed from: J3.k$e */
    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f5261a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$e$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1203k f5263a;

            a(C1203k c1203k) {
                this.f5263a = c1203k;
            }

            public final Object b(boolean z8, P5.d dVar) {
                Object value;
                l6.v vVar = this.f5263a.f5247p;
                do {
                    value = vVar.getValue();
                } while (!vVar.a(value, V.a.b((V.a) value, null, null, false, z8, false, false, 55, null)));
                return L5.I.f6474a;
            }

            @Override // l6.InterfaceC3359g
            public /* bridge */ /* synthetic */ Object emit(Object obj, P5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        e(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f5261a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K interfaceC3349K = C1203k.this.f5237f;
                a aVar = new a(C1203k.this);
                this.f5261a = 1;
                if (interfaceC3349K.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* renamed from: J3.k$f */
    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f5264a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$f$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1203k f5266a;

            a(C1203k c1203k) {
                this.f5266a = c1203k;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3991f abstractC3991f, P5.d dVar) {
                this.f5266a.f5246o.setValue(abstractC3991f);
                return L5.I.f6474a;
            }
        }

        /* renamed from: J3.k$f$b */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC3358f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f f5267a;

            /* renamed from: J3.k$f$b$a */
            /* loaded from: classes4.dex */
            public static final class a implements InterfaceC3359g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3359g f5268a;

                /* renamed from: J3.k$f$b$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0104a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f5269a;

                    /* renamed from: b, reason: collision with root package name */
                    int f5270b;

                    public C0104a(P5.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f5269a = obj;
                        this.f5270b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC3359g interfaceC3359g) {
                    this.f5268a = interfaceC3359g;
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
                        boolean r0 = r7 instanceof J3.C1203k.f.b.a.C0104a
                        if (r0 == 0) goto L13
                        r0 = r7
                        J3.k$f$b$a$a r0 = (J3.C1203k.f.b.a.C0104a) r0
                        int r1 = r0.f5270b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f5270b = r1
                        goto L18
                    L13:
                        J3.k$f$b$a$a r0 = new J3.k$f$b$a$a
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f5269a
                        java.lang.Object r1 = Q5.b.e()
                        int r2 = r0.f5270b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        L5.t.b(r7)
                        goto L56
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        L5.t.b(r7)
                        l6.g r7 = r5.f5268a
                        r2 = r6
                        y3.f r2 = (y3.AbstractC3991f) r2
                        boolean r4 = r2 instanceof y3.AbstractC3991f.C0916f
                        if (r4 != 0) goto L4d
                        y3.f$d r4 = y3.AbstractC3991f.d.f39758a
                        boolean r4 = kotlin.jvm.internal.AbstractC3159y.d(r2, r4)
                        if (r4 != 0) goto L4d
                        y3.f$c r4 = y3.AbstractC3991f.c.f39757a
                        boolean r2 = kotlin.jvm.internal.AbstractC3159y.d(r2, r4)
                        if (r2 == 0) goto L56
                    L4d:
                        r0.f5270b = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L56
                        return r1
                    L56:
                        L5.I r6 = L5.I.f6474a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: J3.C1203k.f.b.a.emit(java.lang.Object, P5.d):java.lang.Object");
                }
            }

            public b(InterfaceC3358f interfaceC3358f) {
                this.f5267a = interfaceC3358f;
            }

            @Override // l6.InterfaceC3358f
            public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
                Object collect = this.f5267a.collect(new a(interfaceC3359g), dVar);
                if (collect == Q5.b.e()) {
                    return collect;
                }
                return L5.I.f6474a;
            }
        }

        f(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f5264a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                b bVar = new b(C1203k.this.f5238g);
                a aVar = new a(C1203k.this);
                this.f5264a = 1;
                if (bVar.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* renamed from: J3.k$g */
    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f5272a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$g$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements X5.o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1203k f5274a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C1203k c1203k) {
                super(3);
                this.f5274a = c1203k;
            }

            @Override // X5.o
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final com.stripe.android.paymentsheet.p invoke(AbstractC3991f abstractC3991f, com.stripe.android.model.o oVar, List paymentOptionsItems) {
                AbstractC3159y.i(paymentOptionsItems, "paymentOptionsItems");
                return this.f5274a.n(abstractC3991f, oVar, paymentOptionsItems);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$g$b */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1203k f5275a;

            b(C1203k c1203k) {
                this.f5275a = c1203k;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.stripe.android.paymentsheet.p pVar, P5.d dVar) {
                Object value;
                l6.v vVar = this.f5275a.f5247p;
                do {
                    value = vVar.getValue();
                } while (!vVar.a(value, V.a.b((V.a) value, null, pVar, false, false, false, false, 61, null)));
                return L5.I.f6474a;
            }
        }

        g(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f5272a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K e9 = v4.g.e(C1203k.this.f5246o, C1203k.this.f5239h, C1203k.this.f5232a, new a(C1203k.this));
                b bVar = new b(C1203k.this);
                this.f5272a = 1;
                if (e9.collect(bVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* renamed from: J3.k$h */
    /* loaded from: classes4.dex */
    public static final class h {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$h$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3156v implements Function0 {
            a(Object obj) {
                super(0, obj, com.stripe.android.paymentsheet.B.class, "toggleEditing", "toggleEditing()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m30invoke();
                return L5.I.f6474a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m30invoke() {
                ((com.stripe.android.paymentsheet.B) this.receiver).x();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$h$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f5276a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Y2.d f5277b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(M3.a aVar, Y2.d dVar) {
                super(0);
                this.f5276a = aVar;
                this.f5277b = dVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m31invoke();
                return L5.I.f6474a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m31invoke() {
                this.f5276a.r().m(new InterfaceC4021c.a(C1201i.f5176r.a(this.f5276a, this.f5277b)));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$h$c */
        /* loaded from: classes4.dex */
        public /* synthetic */ class c extends C3156v implements Function1 {
            c(Object obj) {
                super(1, obj, com.stripe.android.paymentsheet.B.class, "modifyPaymentMethod", "modifyPaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V", 0);
            }

            public final void d(com.stripe.android.model.o p02) {
                AbstractC3159y.i(p02, "p0");
                ((com.stripe.android.paymentsheet.B) this.receiver).s(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((com.stripe.android.model.o) obj);
                return L5.I.f6474a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$h$d */
        /* loaded from: classes4.dex */
        public /* synthetic */ class d extends C3156v implements Function1 {
            d(Object obj) {
                super(1, obj, com.stripe.android.paymentsheet.B.class, "removePaymentMethod", "removePaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V", 0);
            }

            public final void d(com.stripe.android.model.o p02) {
                AbstractC3159y.i(p02, "p0");
                ((com.stripe.android.paymentsheet.B) this.receiver).u(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((com.stripe.android.model.o) obj);
                return L5.I.f6474a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.k$h$e */
        /* loaded from: classes4.dex */
        public /* synthetic */ class e extends C3156v implements Function1 {
            e(Object obj) {
                super(1, obj, M3.a.class, "handlePaymentMethodSelected", "handlePaymentMethodSelected(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", 0);
            }

            public final void d(AbstractC3991f abstractC3991f) {
                ((M3.a) this.receiver).E(abstractC3991f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((AbstractC3991f) obj);
                return L5.I.f6474a;
            }
        }

        private h() {
        }

        public final V a(M3.a viewModel, Y2.d paymentMethodMetadata, C3649b customerStateHolder, com.stripe.android.paymentsheet.B savedPaymentMethodMutator) {
            AbstractC3159y.i(viewModel, "viewModel");
            AbstractC3159y.i(paymentMethodMetadata, "paymentMethodMetadata");
            AbstractC3159y.i(customerStateHolder, "customerStateHolder");
            AbstractC3159y.i(savedPaymentMethodMutator, "savedPaymentMethodMutator");
            return new C1203k(savedPaymentMethodMutator.o(), savedPaymentMethodMutator.n(), savedPaymentMethodMutator.l(), savedPaymentMethodMutator.m(), new a(savedPaymentMethodMutator), viewModel.v(), viewModel.y(), customerStateHolder.b(), new b(viewModel, paymentMethodMetadata), new c(savedPaymentMethodMutator), new d(savedPaymentMethodMutator), new e(viewModel), paymentMethodMetadata.V().a());
        }

        public /* synthetic */ h(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C1203k(InterfaceC3349K paymentOptionsItems, InterfaceC3349K editing, InterfaceC3349K canEdit, InterfaceC3349K canRemove, Function0 toggleEdit, InterfaceC3349K isProcessing, InterfaceC3349K currentSelection, InterfaceC3349K mostRecentlySelectedSavedPaymentMethod, Function0 onAddCardPressed, Function1 onEditPaymentMethod, Function1 onDeletePaymentMethod, Function1 onPaymentMethodSelected, boolean z8) {
        AbstractC3159y.i(paymentOptionsItems, "paymentOptionsItems");
        AbstractC3159y.i(editing, "editing");
        AbstractC3159y.i(canEdit, "canEdit");
        AbstractC3159y.i(canRemove, "canRemove");
        AbstractC3159y.i(toggleEdit, "toggleEdit");
        AbstractC3159y.i(isProcessing, "isProcessing");
        AbstractC3159y.i(currentSelection, "currentSelection");
        AbstractC3159y.i(mostRecentlySelectedSavedPaymentMethod, "mostRecentlySelectedSavedPaymentMethod");
        AbstractC3159y.i(onAddCardPressed, "onAddCardPressed");
        AbstractC3159y.i(onEditPaymentMethod, "onEditPaymentMethod");
        AbstractC3159y.i(onDeletePaymentMethod, "onDeletePaymentMethod");
        AbstractC3159y.i(onPaymentMethodSelected, "onPaymentMethodSelected");
        this.f5232a = paymentOptionsItems;
        this.f5233b = editing;
        this.f5234c = canEdit;
        this.f5235d = canRemove;
        this.f5236e = toggleEdit;
        this.f5237f = isProcessing;
        this.f5238g = currentSelection;
        this.f5239h = mostRecentlySelectedSavedPaymentMethod;
        this.f5240i = onAddCardPressed;
        this.f5241j = onEditPaymentMethod;
        this.f5242k = onDeletePaymentMethod;
        this.f5243l = onPaymentMethodSelected;
        this.f5244m = z8;
        i6.M a8 = i6.N.a(C2812b0.d().plus(U0.b(null, 1, null)));
        this.f5245n = a8;
        this.f5246o = AbstractC3351M.a(null);
        l6.v a9 = AbstractC3351M.a(m());
        this.f5247p = a9;
        this.f5248q = a9;
        AbstractC2829k.d(a8, null, null, new a(null), 3, null);
        AbstractC2829k.d(a8, null, null, new b(null), 3, null);
        AbstractC2829k.d(a8, null, null, new c(null), 3, null);
        AbstractC2829k.d(a8, null, null, new d(null), 3, null);
        AbstractC2829k.d(a8, null, null, new e(null), 3, null);
        AbstractC2829k.d(a8, null, null, new f(null), 3, null);
        AbstractC2829k.d(a8, null, null, new g(null), 3, null);
    }

    private final V.a m() {
        List list = (List) this.f5232a.getValue();
        return new V.a(list, n((AbstractC3991f) this.f5238g.getValue(), (com.stripe.android.model.o) this.f5239h.getValue(), list), ((Boolean) this.f5233b.getValue()).booleanValue(), ((Boolean) this.f5237f.getValue()).booleanValue(), ((Boolean) this.f5234c.getValue()).booleanValue(), ((Boolean) this.f5235d.getValue()).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.paymentsheet.p n(AbstractC3991f abstractC3991f, com.stripe.android.model.o oVar, List list) {
        boolean d8;
        boolean d9;
        boolean z8;
        boolean z9 = true;
        if (abstractC3991f instanceof AbstractC3991f.C0916f) {
            d8 = true;
        } else {
            d8 = AbstractC3159y.d(abstractC3991f, AbstractC3991f.d.f39758a);
        }
        if (d8) {
            d9 = true;
        } else {
            d9 = AbstractC3159y.d(abstractC3991f, AbstractC3991f.c.f39757a);
        }
        if (!d9) {
            if (abstractC3991f instanceof AbstractC3991f.e) {
                z8 = true;
            } else {
                z8 = abstractC3991f instanceof AbstractC3991f.b;
            }
            if (!z8 && abstractC3991f != null) {
                z9 = false;
            }
            if (z9) {
                if (oVar != null) {
                    abstractC3991f = new AbstractC3991f.C0916f(oVar, null, null, 6, null);
                } else {
                    abstractC3991f = null;
                }
            } else {
                throw new L5.p();
            }
        }
        return com.stripe.android.paymentsheet.r.f26334a.c(list, abstractC3991f);
    }

    @Override // J3.V
    public boolean a() {
        return this.f5244m;
    }

    @Override // J3.V
    public void b(V.b viewAction) {
        AbstractC3159y.i(viewAction, "viewAction");
        if (viewAction instanceof V.b.C0095b) {
            this.f5242k.invoke(((V.b.C0095b) viewAction).a());
            return;
        }
        if (viewAction instanceof V.b.c) {
            this.f5241j.invoke(((V.b.c) viewAction).a());
            return;
        }
        if (viewAction instanceof V.b.d) {
            this.f5243l.invoke(((V.b.d) viewAction).a());
        } else if (AbstractC3159y.d(viewAction, V.b.a.f5113a)) {
            this.f5240i.invoke();
        } else if (AbstractC3159y.d(viewAction, V.b.e.f5119a)) {
            this.f5236e.invoke();
        }
    }

    @Override // J3.V
    public void close() {
        i6.N.d(this.f5245n, null, 1, null);
    }

    @Override // J3.V
    public InterfaceC3349K getState() {
        return this.f5248q;
    }
}
