package v4;

import L5.I;
import L5.t;
import M5.AbstractC1246t;
import X5.o;
import X5.p;
import X5.q;
import X5.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import l6.AbstractC3351M;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public abstract class g {

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f[] f38802a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f38803b;

        /* renamed from: v4.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0894a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f[] f38804a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0894a(InterfaceC3358f[] interfaceC3358fArr) {
                super(0);
                this.f38804a = interfaceC3358fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new Object[this.f38804a.length];
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements o {

            /* renamed from: a, reason: collision with root package name */
            int f38805a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f38806b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f38807c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ q f38808d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(P5.d dVar, q qVar) {
                super(3, dVar);
                this.f38808d = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f38805a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.f38806b;
                    Object[] objArr = (Object[]) this.f38807c;
                    Object invoke = this.f38808d.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
                    this.f38805a = 1;
                    if (interfaceC3359g.emit(invoke, this) == e8) {
                        return e8;
                    }
                }
                return I.f6474a;
            }

            @Override // X5.o
            public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
                b bVar = new b(dVar, this.f38808d);
                bVar.f38806b = interfaceC3359g;
                bVar.f38807c = objArr;
                return bVar.invokeSuspend(I.f6474a);
            }
        }

        public a(InterfaceC3358f[] interfaceC3358fArr, q qVar) {
            this.f38802a = interfaceC3358fArr;
            this.f38803b = qVar;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            InterfaceC3358f[] interfaceC3358fArr = this.f38802a;
            Object a8 = m6.k.a(interfaceC3359g, interfaceC3358fArr, new C0894a(interfaceC3358fArr), new b(null, this.f38803b), dVar);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f[] f38809a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f38810b;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f[] f38811a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3358f[] interfaceC3358fArr) {
                super(0);
                this.f38811a = interfaceC3358fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new Object[this.f38811a.length];
            }
        }

        /* renamed from: v4.g$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0895b extends kotlin.coroutines.jvm.internal.l implements o {

            /* renamed from: a, reason: collision with root package name */
            int f38812a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f38813b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f38814c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ r f38815d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0895b(P5.d dVar, r rVar) {
                super(3, dVar);
                this.f38815d = rVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f38812a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.f38813b;
                    Object[] objArr = (Object[]) this.f38814c;
                    Object invoke = this.f38815d.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
                    this.f38812a = 1;
                    if (interfaceC3359g.emit(invoke, this) == e8) {
                        return e8;
                    }
                }
                return I.f6474a;
            }

            @Override // X5.o
            public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
                C0895b c0895b = new C0895b(dVar, this.f38815d);
                c0895b.f38813b = interfaceC3359g;
                c0895b.f38814c = objArr;
                return c0895b.invokeSuspend(I.f6474a);
            }
        }

        public b(InterfaceC3358f[] interfaceC3358fArr, r rVar) {
            this.f38809a = interfaceC3358fArr;
            this.f38810b = rVar;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            InterfaceC3358f[] interfaceC3358fArr = this.f38809a;
            Object a8 = m6.k.a(interfaceC3359g, interfaceC3358fArr, new a(interfaceC3358fArr), new C0895b(null, this.f38810b), dVar);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f38816a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f38817b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f38818c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f38819d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f38820e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f38821f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f38822g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(r rVar, InterfaceC3349K interfaceC3349K, InterfaceC3349K interfaceC3349K2, InterfaceC3349K interfaceC3349K3, InterfaceC3349K interfaceC3349K4, InterfaceC3349K interfaceC3349K5, InterfaceC3349K interfaceC3349K6) {
            super(0);
            this.f38816a = rVar;
            this.f38817b = interfaceC3349K;
            this.f38818c = interfaceC3349K2;
            this.f38819d = interfaceC3349K3;
            this.f38820e = interfaceC3349K4;
            this.f38821f = interfaceC3349K5;
            this.f38822g = interfaceC3349K6;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f38816a.invoke(this.f38817b.getValue(), this.f38818c.getValue(), this.f38819d.getValue(), this.f38820e.getValue(), this.f38821f.getValue(), this.f38822g.getValue());
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class d extends C3156v implements o {
        d(Object obj) {
            super(3, obj, AbstractC3159y.a.class, "suspendConversion0", "combineAsStateFlow$suspendConversion0$1(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // X5.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, Object obj2, P5.d dVar) {
            return g.i((X5.n) this.receiver, obj, obj2, dVar);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X5.n f38823a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f38824b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f38825c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(X5.n nVar, InterfaceC3349K interfaceC3349K, InterfaceC3349K interfaceC3349K2) {
            super(0);
            this.f38823a = nVar;
            this.f38824b = interfaceC3349K;
            this.f38825c = interfaceC3349K2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f38823a.invoke(this.f38824b.getValue(), this.f38825c.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class f extends C3156v implements p {
        f(Object obj) {
            super(4, obj, AbstractC3159y.a.class, "suspendConversion0", "combineAsStateFlow$suspendConversion0$2(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // X5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, Object obj2, Object obj3, P5.d dVar) {
            return g.j((o) this.receiver, obj, obj2, obj3, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v4.g$g, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0896g extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f38826a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f38827b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f38828c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f38829d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0896g(o oVar, InterfaceC3349K interfaceC3349K, InterfaceC3349K interfaceC3349K2, InterfaceC3349K interfaceC3349K3) {
            super(0);
            this.f38826a = oVar;
            this.f38827b = interfaceC3349K;
            this.f38828c = interfaceC3349K2;
            this.f38829d = interfaceC3349K3;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f38826a.invoke(this.f38827b.getValue(), this.f38828c.getValue(), this.f38829d.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class h extends C3156v implements q {
        h(Object obj) {
            super(5, obj, AbstractC3159y.a.class, "suspendConversion0", "combineAsStateFlow$suspendConversion0$3(Lkotlin/jvm/functions/Function4;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // X5.q
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, P5.d dVar) {
            return g.k((p) this.receiver, obj, obj2, obj3, obj4, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f38830a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f38831b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f38832c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f38833d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f38834e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(p pVar, InterfaceC3349K interfaceC3349K, InterfaceC3349K interfaceC3349K2, InterfaceC3349K interfaceC3349K3, InterfaceC3349K interfaceC3349K4) {
            super(0);
            this.f38830a = pVar;
            this.f38831b = interfaceC3349K;
            this.f38832c = interfaceC3349K2;
            this.f38833d = interfaceC3349K3;
            this.f38834e = interfaceC3349K4;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f38830a.invoke(this.f38831b.getValue(), this.f38832c.getValue(), this.f38833d.getValue(), this.f38834e.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f38835a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f38836b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f38837c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f38838d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f38839e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f38840f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(q qVar, InterfaceC3349K interfaceC3349K, InterfaceC3349K interfaceC3349K2, InterfaceC3349K interfaceC3349K3, InterfaceC3349K interfaceC3349K4, InterfaceC3349K interfaceC3349K5) {
            super(0);
            this.f38835a = qVar;
            this.f38836b = interfaceC3349K;
            this.f38837c = interfaceC3349K2;
            this.f38838d = interfaceC3349K3;
            this.f38839e = interfaceC3349K4;
            this.f38840f = interfaceC3349K5;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f38835a.invoke(this.f38836b.getValue(), this.f38837c.getValue(), this.f38838d.getValue(), this.f38839e.getValue(), this.f38840f.getValue());
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements o {

        /* renamed from: a, reason: collision with root package name */
        int f38841a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f38842b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f38843c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f38844d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(P5.d dVar, Function1 function1) {
            super(3, dVar);
            this.f38844d = function1;
        }

        @Override // X5.o
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3359g interfaceC3359g, Object obj, P5.d dVar) {
            k kVar = new k(dVar, this.f38844d);
            kVar.f38842b = interfaceC3359g;
            kVar.f38843c = obj;
            return kVar.invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f38841a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.f38842b;
                InterfaceC3358f interfaceC3358f = (InterfaceC3358f) this.f38844d.invoke(this.f38843c);
                this.f38841a = 1;
                if (AbstractC3360h.r(interfaceC3359g, interfaceC3358f, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class l extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f38845a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f38846b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Function1 function1, InterfaceC3349K interfaceC3349K) {
            super(0);
            this.f38845a = function1;
            this.f38846b = interfaceC3349K;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ((InterfaceC3349K) this.f38845a.invoke(this.f38846b.getValue())).getValue();
        }
    }

    /* loaded from: classes4.dex */
    public static final class m implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f38847a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f38848b;

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3359g f38849a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f38850b;

            /* renamed from: v4.g$m$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0897a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f38851a;

                /* renamed from: b, reason: collision with root package name */
                int f38852b;

                public C0897a(P5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f38851a = obj;
                    this.f38852b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC3359g interfaceC3359g, Function1 function1) {
                this.f38849a = interfaceC3359g;
                this.f38850b = function1;
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
                    boolean r0 = r6 instanceof v4.g.m.a.C0897a
                    if (r0 == 0) goto L13
                    r0 = r6
                    v4.g$m$a$a r0 = (v4.g.m.a.C0897a) r0
                    int r1 = r0.f38852b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f38852b = r1
                    goto L18
                L13:
                    v4.g$m$a$a r0 = new v4.g$m$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f38851a
                    java.lang.Object r1 = Q5.b.e()
                    int r2 = r0.f38852b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    L5.t.b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    L5.t.b(r6)
                    l6.g r6 = r4.f38849a
                    kotlin.jvm.functions.Function1 r2 = r4.f38850b
                    java.lang.Object r5 = r2.invoke(r5)
                    r0.f38852b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    L5.I r5 = L5.I.f6474a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: v4.g.m.a.emit(java.lang.Object, P5.d):java.lang.Object");
            }
        }

        public m(InterfaceC3358f interfaceC3358f, Function1 function1) {
            this.f38847a = interfaceC3358f;
            this.f38848b = function1;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            Object collect = this.f38847a.collect(new a(interfaceC3359g, this.f38848b), dVar);
            if (collect == Q5.b.e()) {
                return collect;
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f38854a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f38855b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Function1 function1, InterfaceC3349K interfaceC3349K) {
            super(0);
            this.f38854a = function1;
            this.f38855b = interfaceC3349K;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f38854a.invoke(this.f38855b.getValue());
        }
    }

    public static final InterfaceC3349K d(InterfaceC3349K flow1, InterfaceC3349K flow2, X5.n transform) {
        AbstractC3159y.i(flow1, "flow1");
        AbstractC3159y.i(flow2, "flow2");
        AbstractC3159y.i(transform, "transform");
        return new v4.e(AbstractC3360h.i(flow1, flow2, new d(transform)), new e(transform, flow1, flow2));
    }

    public static final InterfaceC3349K e(InterfaceC3349K flow1, InterfaceC3349K flow2, InterfaceC3349K flow3, o transform) {
        AbstractC3159y.i(flow1, "flow1");
        AbstractC3159y.i(flow2, "flow2");
        AbstractC3159y.i(flow3, "flow3");
        AbstractC3159y.i(transform, "transform");
        return new v4.e(AbstractC3360h.j(flow1, flow2, flow3, new f(transform)), new C0896g(transform, flow1, flow2, flow3));
    }

    public static final InterfaceC3349K f(InterfaceC3349K flow1, InterfaceC3349K flow2, InterfaceC3349K flow3, InterfaceC3349K flow4, p transform) {
        AbstractC3159y.i(flow1, "flow1");
        AbstractC3159y.i(flow2, "flow2");
        AbstractC3159y.i(flow3, "flow3");
        AbstractC3159y.i(flow4, "flow4");
        AbstractC3159y.i(transform, "transform");
        return new v4.e(AbstractC3360h.k(flow1, flow2, flow3, flow4, new h(transform)), new i(transform, flow1, flow2, flow3, flow4));
    }

    public static final InterfaceC3349K g(InterfaceC3349K flow1, InterfaceC3349K flow2, InterfaceC3349K flow3, InterfaceC3349K flow4, InterfaceC3349K flow5, q transform) {
        AbstractC3159y.i(flow1, "flow1");
        AbstractC3159y.i(flow2, "flow2");
        AbstractC3159y.i(flow3, "flow3");
        AbstractC3159y.i(flow4, "flow4");
        AbstractC3159y.i(flow5, "flow5");
        AbstractC3159y.i(transform, "transform");
        return new v4.e(new a((InterfaceC3358f[]) AbstractC1246t.W0(AbstractC1246t.p(flow1, flow2, flow3, flow4, flow5)).toArray(new InterfaceC3358f[0]), transform), new j(transform, flow1, flow2, flow3, flow4, flow5));
    }

    public static final InterfaceC3349K h(InterfaceC3349K flow1, InterfaceC3349K flow2, InterfaceC3349K flow3, InterfaceC3349K flow4, InterfaceC3349K flow5, InterfaceC3349K flow6, r transform) {
        AbstractC3159y.i(flow1, "flow1");
        AbstractC3159y.i(flow2, "flow2");
        AbstractC3159y.i(flow3, "flow3");
        AbstractC3159y.i(flow4, "flow4");
        AbstractC3159y.i(flow5, "flow5");
        AbstractC3159y.i(flow6, "flow6");
        AbstractC3159y.i(transform, "transform");
        return new v4.e(new b((InterfaceC3358f[]) AbstractC1246t.W0(AbstractC1246t.p(flow1, flow2, flow3, flow4, flow5, flow6)).toArray(new InterfaceC3358f[0]), transform), new c(transform, flow1, flow2, flow3, flow4, flow5, flow6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object i(X5.n nVar, Object obj, Object obj2, P5.d dVar) {
        return nVar.invoke(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object j(o oVar, Object obj, Object obj2, Object obj3, P5.d dVar) {
        return oVar.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object k(p pVar, Object obj, Object obj2, Object obj3, Object obj4, P5.d dVar) {
        return pVar.invoke(obj, obj2, obj3, obj4);
    }

    public static final InterfaceC3349K l(InterfaceC3349K interfaceC3349K, Function1 transform) {
        AbstractC3159y.i(interfaceC3349K, "<this>");
        AbstractC3159y.i(transform, "transform");
        return new v4.e(AbstractC3360h.K(interfaceC3349K, new k(null, transform)), new l(transform, interfaceC3349K));
    }

    public static final InterfaceC3349K m(InterfaceC3349K interfaceC3349K, Function1 transform) {
        AbstractC3159y.i(interfaceC3349K, "<this>");
        AbstractC3159y.i(transform, "transform");
        return new v4.e(new m(interfaceC3349K, transform), new n(transform, interfaceC3349K));
    }

    public static final InterfaceC3349K n(Object obj) {
        return AbstractC3360h.b(AbstractC3351M.a(obj));
    }
}
