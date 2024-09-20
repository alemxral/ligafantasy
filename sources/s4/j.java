package S4;

import L5.I;
import L5.t;
import X4.C1498h;
import android.content.Context;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3312F;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9522a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9523b;

    /* renamed from: c, reason: collision with root package name */
    private final W4.r f9524c;

    /* renamed from: d, reason: collision with root package name */
    private final M f9525d;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9526a;

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9526a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                j jVar = j.this;
                this.f9526a = 1;
                if (jVar.f(this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9528a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9530a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f9531b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, P5.d dVar) {
                super(2, dVar);
                this.f9531b = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9531b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9530a == 0) {
                    t.b(obj);
                    this.f9531b.f9524c.c(-1);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9528a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                Context context = j.this.f9522a;
                AbstractC3159y.f(context);
                long j8 = new C1498h().j(new C3312F(context).m(j.this.f9523b));
                if (j8 > 0) {
                    return new i(j.this.f9522a, j8, j.this.f9524c, j.this.f9525d);
                }
                J0 c8 = C2812b0.c();
                a aVar = new a(j.this, null);
                this.f9528a = 1;
                if (AbstractC2825i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    public j(Context context, String packagename, W4.r listener, M scope) {
        AbstractC3159y.i(packagename, "packagename");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(scope, "scope");
        this.f9522a = context;
        this.f9523b = packagename;
        this.f9524c = listener;
        this.f9525d = scope;
        AbstractC2829k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new b(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }
}
