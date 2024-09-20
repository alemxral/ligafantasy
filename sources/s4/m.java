package S4;

import L5.I;
import L5.t;
import W4.K;
import X4.H;
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
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9554a;

    /* renamed from: b, reason: collision with root package name */
    private String f9555b;

    /* renamed from: c, reason: collision with root package name */
    private String f9556c;

    /* renamed from: d, reason: collision with root package name */
    private final K f9557d;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9558a;

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
            int i8 = this.f9558a;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                if (m.this.f9555b != null) {
                    m mVar = m.this;
                    this.f9558a = 1;
                    if (mVar.i(this) == e8) {
                        return e8;
                    }
                } else {
                    m mVar2 = m.this;
                    this.f9558a = 2;
                    if (mVar2.j(this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9560a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9562a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f9563b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ H f9564c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, H h8, P5.d dVar) {
                super(2, dVar);
                this.f9563b = mVar;
                this.f9564c = h8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9563b, this.f9564c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9562a == 0) {
                    t.b(obj);
                    this.f9563b.f9557d.a(this.f9564c);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.m$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0210b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9565a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f9566b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0210b(m mVar, P5.d dVar) {
                super(2, dVar);
                this.f9566b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0210b(this.f9566b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0210b) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9565a == 0) {
                    t.b(obj);
                    this.f9566b.f9557d.b();
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
            int i8 = this.f9560a;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                C3312F c3312f = new C3312F(m.this.f9554a);
                String str = m.this.f9555b;
                AbstractC3159y.f(str);
                X4.I u02 = c3312f.u0(str);
                if (!u02.b() && u02.d() != null) {
                    String d8 = u02.d();
                    AbstractC3159y.f(d8);
                    if (d8.length() > 0) {
                        H h8 = m.this.h(u02);
                        if (h8 != null) {
                            J0 c8 = C2812b0.c();
                            a aVar = new a(m.this, h8, null);
                            this.f9560a = 1;
                            if (AbstractC2825i.g(c8, aVar, this) == e8) {
                                return e8;
                            }
                        }
                    }
                }
                J0 c9 = C2812b0.c();
                C0210b c0210b = new C0210b(m.this, null);
                this.f9560a = 2;
                if (AbstractC2825i.g(c9, c0210b, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9567a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9569a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f9570b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ H f9571c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, H h8, P5.d dVar) {
                super(2, dVar);
                this.f9570b = mVar;
                this.f9571c = h8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9570b, this.f9571c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9569a == 0) {
                    t.b(obj);
                    this.f9570b.f9557d.a(this.f9571c);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9572a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f9573b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(m mVar, P5.d dVar) {
                super(2, dVar);
                this.f9573b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f9573b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9572a == 0) {
                    t.b(obj);
                    this.f9573b.f9557d.b();
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9567a;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                C3312F c3312f = new C3312F(m.this.f9554a);
                String str = m.this.f9556c;
                AbstractC3159y.f(str);
                X4.I v02 = c3312f.v0(str);
                if (!v02.b() && v02.d() != null) {
                    String d8 = v02.d();
                    AbstractC3159y.f(d8);
                    if (d8.length() > 0) {
                        H h8 = m.this.h(v02);
                        if (h8 != null) {
                            J0 c8 = C2812b0.c();
                            a aVar = new a(m.this, h8, null);
                            this.f9567a = 1;
                            if (AbstractC2825i.g(c8, aVar, this) == e8) {
                                return e8;
                            }
                        }
                    }
                }
                J0 c9 = C2812b0.c();
                b bVar = new b(m.this, null);
                this.f9567a = 2;
                if (AbstractC2825i.g(c9, bVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    public m(Context context, String str, String str2, K listener, M scope) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(scope, "scope");
        this.f9554a = context;
        this.f9555b = str;
        this.f9556c = str2;
        this.f9557d = listener;
        AbstractC2829k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final H h(X4.I i8) {
        int i9;
        JSONObject jSONObject;
        String d8 = i8.d();
        AbstractC3159y.f(d8);
        JSONObject jSONObject2 = new JSONObject(d8);
        if (!jSONObject2.isNull("success")) {
            i9 = jSONObject2.getInt("success");
        } else {
            i9 = 0;
        }
        if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
            jSONObject = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
        } else {
            jSONObject = null;
        }
        if (i9 != 1 || jSONObject == null) {
            return null;
        }
        H h8 = new H();
        h8.b(jSONObject);
        return h8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object i(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new b(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new c(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }
}
