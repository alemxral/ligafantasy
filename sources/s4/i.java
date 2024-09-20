package S4;

import L5.I;
import L5.t;
import X4.C1498h;
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
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9509a;

    /* renamed from: b, reason: collision with root package name */
    private final long f9510b;

    /* renamed from: c, reason: collision with root package name */
    private final W4.r f9511c;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9512a;

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
            int i8 = this.f9512a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                i iVar = i.this;
                this.f9512a = 1;
                if (iVar.e(this) == e8) {
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
        int f9514a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9516a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f9517b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C1498h f9518c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, C1498h c1498h, P5.d dVar) {
                super(2, dVar);
                this.f9517b = iVar;
                this.f9518c = c1498h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9517b, this.f9518c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9516a == 0) {
                    t.b(obj);
                    W4.r rVar = this.f9517b.f9511c;
                    if (rVar != null) {
                        rVar.f(this.f9518c);
                        return I.f6474a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.i$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0208b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9519a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f9520b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ X4.I f9521c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0208b(i iVar, X4.I i8, P5.d dVar) {
                super(2, dVar);
                this.f9520b = iVar;
                this.f9521c = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0208b(this.f9520b, this.f9521c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0208b) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9519a == 0) {
                    t.b(obj);
                    W4.r rVar = this.f9520b.f9511c;
                    if (rVar != null) {
                        rVar.c(this.f9521c.e());
                        return I.f6474a;
                    }
                    return null;
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
            int i8;
            JSONObject jSONObject;
            Object e8 = Q5.b.e();
            int i9 = this.f9514a;
            if (i9 != 0) {
                if (i9 != 1 && i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                X4.I Q8 = new C3312F(i.this.f9509a).Q(i.this.f9510b);
                if (!Q8.b() && Q8.d() != null) {
                    String d8 = Q8.d();
                    AbstractC3159y.f(d8);
                    JSONObject jSONObject2 = new JSONObject(d8);
                    if (!jSONObject2.isNull("success")) {
                        i8 = jSONObject2.getInt("success");
                    } else {
                        i8 = 0;
                    }
                    if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        jSONObject = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                    } else {
                        jSONObject = null;
                    }
                    if (i8 == 1 && jSONObject != null) {
                        C1498h a8 = C1498h.f12529L0.a(jSONObject);
                        J0 c8 = C2812b0.c();
                        a aVar = new a(i.this, a8, null);
                        this.f9514a = 1;
                        if (AbstractC2825i.g(c8, aVar, this) == e8) {
                            return e8;
                        }
                    }
                } else if (Q8.b()) {
                    J0 c9 = C2812b0.c();
                    C0208b c0208b = new C0208b(i.this, Q8, null);
                    this.f9514a = 2;
                    if (AbstractC2825i.g(c9, c0208b, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f6474a;
        }
    }

    public i(Context context, long j8, W4.r rVar, M scope) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(scope, "scope");
        this.f9509a = context;
        this.f9510b = j8;
        this.f9511c = rVar;
        if (j8 > 0) {
            AbstractC2829k.d(scope, null, null, new a(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new b(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }
}
