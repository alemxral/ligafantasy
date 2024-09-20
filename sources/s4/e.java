package S4;

import L5.I;
import L5.t;
import X4.C1498h;
import X4.C1510u;
import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3312F;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private Context f9398a;

    /* renamed from: b, reason: collision with root package name */
    private W4.p f9399b;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9400a;

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
            int i8 = this.f9400a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                e eVar = e.this;
                this.f9400a = 1;
                if (eVar.d(this) == e8) {
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
        int f9402a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9404a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f9405b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, P5.d dVar) {
                super(2, dVar);
                this.f9405b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9405b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9404a == 0) {
                    t.b(obj);
                    this.f9405b.f9399b.a();
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.e$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0203b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9406a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f9407b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0203b(e eVar, P5.d dVar) {
                super(2, dVar);
                this.f9407b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0203b(this.f9407b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0203b) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9406a == 0) {
                    t.b(obj);
                    this.f9407b.f9399b.a();
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9408a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f9409b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(e eVar, P5.d dVar) {
                super(2, dVar);
                this.f9409b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new c(this.f9409b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9408a == 0) {
                    t.b(obj);
                    this.f9409b.f9399b.a();
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9410a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f9411b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(e eVar, P5.d dVar) {
                super(2, dVar);
                this.f9411b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new d(this.f9411b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((d) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9410a == 0) {
                    t.b(obj);
                    this.f9411b.f9399b.b();
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.e$b$e, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0204e extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9412a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f9413b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0204e(e eVar, P5.d dVar) {
                super(2, dVar);
                this.f9413b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0204e(this.f9413b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0204e) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9412a == 0) {
                    t.b(obj);
                    this.f9413b.f9399b.a();
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9414a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f9415b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(e eVar, P5.d dVar) {
                super(2, dVar);
                this.f9415b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new f(this.f9415b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((f) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9414a == 0) {
                    t.b(obj);
                    this.f9415b.f9399b.a();
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9416a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f9417b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(e eVar, P5.d dVar) {
                super(2, dVar);
                this.f9417b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new g(this.f9417b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((g) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9416a == 0) {
                    t.b(obj);
                    this.f9417b.f9399b.a();
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class h extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9418a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f9419b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(e eVar, P5.d dVar) {
                super(2, dVar);
                this.f9419b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new h(this.f9419b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((h) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9418a == 0) {
                    t.b(obj);
                    this.f9419b.f9399b.a();
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class i extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9420a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f9421b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(e eVar, P5.d dVar) {
                super(2, dVar);
                this.f9421b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new i(this.f9421b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((i) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9420a == 0) {
                    t.b(obj);
                    this.f9421b.f9399b.a();
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class j extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9422a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f9423b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(e eVar, P5.d dVar) {
                super(2, dVar);
                this.f9423b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new j(this.f9423b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((j) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9422a == 0) {
                    t.b(obj);
                    this.f9423b.f9399b.a();
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
            JSONObject jSONObject;
            Object e8 = Q5.b.e();
            switch (this.f9402a) {
                case 0:
                    t.b(obj);
                    C1510u.a aVar = C1510u.f12703n;
                    C1510u d8 = aVar.d(e.this.f9398a);
                    if (d8 != null && !d8.d()) {
                        J0 c8 = C2812b0.c();
                        C0203b c0203b = new C0203b(e.this, null);
                        this.f9402a = 1;
                        if (AbstractC2825i.g(c8, c0203b, this) == e8) {
                            return e8;
                        }
                    } else {
                        C3312F c3312f = new C3312F(e.this.f9398a);
                        X4.I z8 = c3312f.z();
                        if (!z8.b() && z8.d() != null) {
                            String d9 = z8.d();
                            AbstractC3159y.f(d9);
                            JSONObject jSONObject2 = new JSONObject(d9);
                            if (!jSONObject2.isNull("success")) {
                                int i8 = jSONObject2.getInt("success");
                                if (i8 == 1) {
                                    if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                        JSONObject jsonObjectData = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                                        AbstractC3159y.h(jsonObjectData, "jsonObjectData");
                                        C1510u c9 = aVar.c(jsonObjectData);
                                        if (c9 != null) {
                                            long j8 = 1000;
                                            c9.y(System.currentTimeMillis() / j8);
                                            if (d8 == null) {
                                                c9.t(e.this.f9398a);
                                            } else if (c9.k() == d8.k()) {
                                                if (!g6.n.s(c9.n(), d8.n(), true)) {
                                                    d8.y(System.currentTimeMillis() / j8);
                                                    d8.B(c9.n());
                                                    d8.t(e.this.f9398a);
                                                } else {
                                                    c9.t(e.this.f9398a);
                                                }
                                            } else {
                                                c9.t(e.this.f9398a);
                                            }
                                            X4.I Q8 = c3312f.Q(c9.k());
                                            if (!Q8.b() && Q8.d() != null) {
                                                String d10 = Q8.d();
                                                AbstractC3159y.f(d10);
                                                JSONObject jSONObject3 = new JSONObject(d10);
                                                if (!jSONObject3.isNull("success")) {
                                                    i8 = jSONObject3.getInt("success");
                                                }
                                                if (!jSONObject3.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                                    jSONObject = jSONObject3.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                                                } else {
                                                    jSONObject = null;
                                                }
                                                if (i8 == 1 && jSONObject != null) {
                                                    if (!C1498h.f12529L0.a(jSONObject).k1()) {
                                                        aVar.a(e.this.f9398a);
                                                        J0 c10 = C2812b0.c();
                                                        c cVar = new c(e.this, null);
                                                        this.f9402a = 2;
                                                        if (AbstractC2825i.g(c10, cVar, this) == e8) {
                                                            return e8;
                                                        }
                                                    } else {
                                                        J0 c11 = C2812b0.c();
                                                        d dVar = new d(e.this, null);
                                                        this.f9402a = 3;
                                                        if (AbstractC2825i.g(c11, dVar, this) == e8) {
                                                            return e8;
                                                        }
                                                    }
                                                } else {
                                                    J0 c12 = C2812b0.c();
                                                    C0204e c0204e = new C0204e(e.this, null);
                                                    this.f9402a = 4;
                                                    if (AbstractC2825i.g(c12, c0204e, this) == e8) {
                                                        return e8;
                                                    }
                                                }
                                            } else {
                                                J0 c13 = C2812b0.c();
                                                f fVar = new f(e.this, null);
                                                this.f9402a = 5;
                                                if (AbstractC2825i.g(c13, fVar, this) == e8) {
                                                    return e8;
                                                }
                                            }
                                        } else {
                                            J0 c14 = C2812b0.c();
                                            g gVar = new g(e.this, null);
                                            this.f9402a = 6;
                                            if (AbstractC2825i.g(c14, gVar, this) == e8) {
                                                return e8;
                                            }
                                        }
                                    } else {
                                        J0 c15 = C2812b0.c();
                                        h hVar = new h(e.this, null);
                                        this.f9402a = 7;
                                        if (AbstractC2825i.g(c15, hVar, this) == e8) {
                                            return e8;
                                        }
                                    }
                                } else {
                                    aVar.a(e.this.f9398a);
                                    J0 c16 = C2812b0.c();
                                    i iVar = new i(e.this, null);
                                    this.f9402a = 8;
                                    if (AbstractC2825i.g(c16, iVar, this) == e8) {
                                        return e8;
                                    }
                                }
                            } else {
                                J0 c17 = C2812b0.c();
                                j jVar = new j(e.this, null);
                                this.f9402a = 9;
                                if (AbstractC2825i.g(c17, jVar, this) == e8) {
                                    return e8;
                                }
                            }
                        } else {
                            if (z8.e() == 404) {
                                aVar.a(e.this.f9398a);
                            }
                            J0 c18 = C2812b0.c();
                            a aVar2 = new a(e.this, null);
                            this.f9402a = 10;
                            if (AbstractC2825i.g(c18, aVar2, this) == e8) {
                                return e8;
                            }
                        }
                    }
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    t.b(obj);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return I.f6474a;
        }
    }

    public e(Context context, W4.p listener, M scope) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(scope, "scope");
        this.f9398a = context;
        this.f9399b = listener;
        AbstractC2829k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new b(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }
}
