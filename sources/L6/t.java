package l6;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3157w;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class t {

    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f[] f34764a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X5.p f34765b;

        /* renamed from: l6.t$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0792a extends kotlin.coroutines.jvm.internal.l implements X5.o {

            /* renamed from: a, reason: collision with root package name */
            int f34766a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f34767b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f34768c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ X5.p f34769d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0792a(P5.d dVar, X5.p pVar) {
                super(3, dVar);
                this.f34769d = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3359g interfaceC3359g;
                Object e8 = Q5.b.e();
                int i8 = this.f34766a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            L5.t.b(obj);
                            return L5.I.f6474a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3359g = (InterfaceC3359g) this.f34767b;
                    L5.t.b(obj);
                } else {
                    L5.t.b(obj);
                    interfaceC3359g = (InterfaceC3359g) this.f34767b;
                    Object[] objArr = (Object[]) this.f34768c;
                    X5.p pVar = this.f34769d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f34767b = interfaceC3359g;
                    this.f34766a = 1;
                    AbstractC3157w.c(6);
                    obj = pVar.invoke(obj2, obj3, obj4, this);
                    AbstractC3157w.c(7);
                    if (obj == e8) {
                        return e8;
                    }
                }
                this.f34767b = null;
                this.f34766a = 2;
                if (interfaceC3359g.emit(obj, this) == e8) {
                    return e8;
                }
                return L5.I.f6474a;
            }

            @Override // X5.o
            public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
                C0792a c0792a = new C0792a(dVar, this.f34769d);
                c0792a.f34767b = interfaceC3359g;
                c0792a.f34768c = objArr;
                return c0792a.invokeSuspend(L5.I.f6474a);
            }
        }

        public a(InterfaceC3358f[] interfaceC3358fArr, X5.p pVar) {
            this.f34764a = interfaceC3358fArr;
            this.f34765b = pVar;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            Object a8 = m6.k.a(interfaceC3359g, this.f34764a, t.a(), new C0792a(null, this.f34765b), dVar);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f[] f34770a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X5.q f34771b;

        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.o {

            /* renamed from: a, reason: collision with root package name */
            int f34772a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f34773b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f34774c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ X5.q f34775d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(P5.d dVar, X5.q qVar) {
                super(3, dVar);
                this.f34775d = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3359g interfaceC3359g;
                Object e8 = Q5.b.e();
                int i8 = this.f34772a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            L5.t.b(obj);
                            return L5.I.f6474a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3359g = (InterfaceC3359g) this.f34773b;
                    L5.t.b(obj);
                } else {
                    L5.t.b(obj);
                    interfaceC3359g = (InterfaceC3359g) this.f34773b;
                    Object[] objArr = (Object[]) this.f34774c;
                    X5.q qVar = this.f34775d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f34773b = interfaceC3359g;
                    this.f34772a = 1;
                    AbstractC3157w.c(6);
                    obj = qVar.invoke(obj2, obj3, obj4, obj5, this);
                    AbstractC3157w.c(7);
                    if (obj == e8) {
                        return e8;
                    }
                }
                this.f34773b = null;
                this.f34772a = 2;
                if (interfaceC3359g.emit(obj, this) == e8) {
                    return e8;
                }
                return L5.I.f6474a;
            }

            @Override // X5.o
            public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
                a aVar = new a(dVar, this.f34775d);
                aVar.f34773b = interfaceC3359g;
                aVar.f34774c = objArr;
                return aVar.invokeSuspend(L5.I.f6474a);
            }
        }

        public b(InterfaceC3358f[] interfaceC3358fArr, X5.q qVar) {
            this.f34770a = interfaceC3358fArr;
            this.f34771b = qVar;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            Object a8 = m6.k.a(interfaceC3359g, this.f34770a, t.a(), new a(null, this.f34771b), dVar);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f34776a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f34777b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ X5.o f34778c;

        public c(InterfaceC3358f interfaceC3358f, InterfaceC3358f interfaceC3358f2, X5.o oVar) {
            this.f34776a = interfaceC3358f;
            this.f34777b = interfaceC3358f2;
            this.f34778c = oVar;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            Object a8 = m6.k.a(interfaceC3359g, new InterfaceC3358f[]{this.f34776a, this.f34777b}, t.a(), new d(this.f34778c, null), dVar);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes5.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        int f34779a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f34780b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34781c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ X5.o f34782d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(X5.o oVar, P5.d dVar) {
            super(3, dVar);
            this.f34782d = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3359g interfaceC3359g;
            Object e8 = Q5.b.e();
            int i8 = this.f34779a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        L5.t.b(obj);
                        return L5.I.f6474a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC3359g = (InterfaceC3359g) this.f34780b;
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                interfaceC3359g = (InterfaceC3359g) this.f34780b;
                Object[] objArr = (Object[]) this.f34781c;
                X5.o oVar = this.f34782d;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f34780b = interfaceC3359g;
                this.f34779a = 1;
                obj = oVar.invoke(obj2, obj3, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f34780b = null;
            this.f34779a = 2;
            if (interfaceC3359g.emit(obj, this) == e8) {
                return e8;
            }
            return L5.I.f6474a;
        }

        @Override // X5.o
        public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
            d dVar2 = new d(this.f34782d, dVar);
            dVar2.f34780b = interfaceC3359g;
            dVar2.f34781c = objArr;
            return dVar2.invokeSuspend(L5.I.f6474a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f34783a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    public static final /* synthetic */ Function0 a() {
        return f();
    }

    public static final InterfaceC3358f b(InterfaceC3358f interfaceC3358f, InterfaceC3358f interfaceC3358f2, X5.o oVar) {
        return AbstractC3360h.y(interfaceC3358f, interfaceC3358f2, oVar);
    }

    public static final InterfaceC3358f c(InterfaceC3358f interfaceC3358f, InterfaceC3358f interfaceC3358f2, InterfaceC3358f interfaceC3358f3, X5.p pVar) {
        return new a(new InterfaceC3358f[]{interfaceC3358f, interfaceC3358f2, interfaceC3358f3}, pVar);
    }

    public static final InterfaceC3358f d(InterfaceC3358f interfaceC3358f, InterfaceC3358f interfaceC3358f2, InterfaceC3358f interfaceC3358f3, InterfaceC3358f interfaceC3358f4, X5.q qVar) {
        return new b(new InterfaceC3358f[]{interfaceC3358f, interfaceC3358f2, interfaceC3358f3, interfaceC3358f4}, qVar);
    }

    public static final InterfaceC3358f e(InterfaceC3358f interfaceC3358f, InterfaceC3358f interfaceC3358f2, X5.o oVar) {
        return new c(interfaceC3358f, interfaceC3358f2, oVar);
    }

    private static final Function0 f() {
        return e.f34783a;
    }
}
