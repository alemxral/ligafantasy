package m6;

import L5.I;
import M5.AbstractC1246t;
import i6.M;
import i6.N;
import i6.O;
import i6.Q;
import java.util.ArrayList;
import k6.EnumC3132a;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3360h;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;

/* loaded from: classes5.dex */
public abstract class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public final P5.g f35862a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35863b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC3132a f35864c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f35865a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f35866b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3359g f35867c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f35868d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3359g interfaceC3359g, e eVar, P5.d dVar) {
            super(2, dVar);
            this.f35867c = interfaceC3359g;
            this.f35868d = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            a aVar = new a(this.f35867c, this.f35868d, dVar);
            aVar.f35866b = obj;
            return aVar;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f35865a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                M m8 = (M) this.f35866b;
                InterfaceC3359g interfaceC3359g = this.f35867c;
                k6.u m9 = this.f35868d.m(m8);
                this.f35865a = 1;
                if (AbstractC3360h.q(interfaceC3359g, m9, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f35869a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f35870b;

        b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            b bVar = new b(dVar);
            bVar.f35870b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f35869a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                k6.s sVar = (k6.s) this.f35870b;
                e eVar = e.this;
                this.f35869a = 1;
                if (eVar.h(sVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }

        @Override // X5.n
        public final Object invoke(k6.s sVar, P5.d dVar) {
            return ((b) create(sVar, dVar)).invokeSuspend(I.f6474a);
        }
    }

    public e(P5.g gVar, int i8, EnumC3132a enumC3132a) {
        this.f35862a = gVar;
        this.f35863b = i8;
        this.f35864c = enumC3132a;
    }

    static /* synthetic */ Object g(e eVar, InterfaceC3359g interfaceC3359g, P5.d dVar) {
        Object e8 = N.e(new a(interfaceC3359g, eVar, null), dVar);
        if (e8 == Q5.b.e()) {
            return e8;
        }
        return I.f6474a;
    }

    @Override // m6.p
    public InterfaceC3358f b(P5.g gVar, int i8, EnumC3132a enumC3132a) {
        P5.g plus = gVar.plus(this.f35862a);
        if (enumC3132a == EnumC3132a.SUSPEND) {
            int i9 = this.f35863b;
            if (i9 != -3) {
                if (i8 != -3) {
                    if (i9 != -2) {
                        if (i8 != -2) {
                            i8 += i9;
                            if (i8 < 0) {
                                i8 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i8 = i9;
            }
            enumC3132a = this.f35864c;
        }
        if (AbstractC3159y.d(plus, this.f35862a) && i8 == this.f35863b && enumC3132a == this.f35864c) {
            return this;
        }
        return i(plus, i8, enumC3132a);
    }

    @Override // l6.InterfaceC3358f
    public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
        return g(this, interfaceC3359g, dVar);
    }

    protected String f() {
        return null;
    }

    protected abstract Object h(k6.s sVar, P5.d dVar);

    protected abstract e i(P5.g gVar, int i8, EnumC3132a enumC3132a);

    public InterfaceC3358f j() {
        return null;
    }

    public final X5.n k() {
        return new b(null);
    }

    public final int l() {
        int i8 = this.f35863b;
        if (i8 == -3) {
            return -2;
        }
        return i8;
    }

    public k6.u m(M m8) {
        return k6.q.c(m8, this.f35862a, l(), this.f35864c, O.ATOMIC, null, k(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String f8 = f();
        if (f8 != null) {
            arrayList.add(f8);
        }
        if (this.f35862a != P5.h.f7981a) {
            arrayList.add("context=" + this.f35862a);
        }
        if (this.f35863b != -3) {
            arrayList.add("capacity=" + this.f35863b);
        }
        if (this.f35864c != EnumC3132a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f35864c);
        }
        return Q.a(this) + '[' + AbstractC1246t.w0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
