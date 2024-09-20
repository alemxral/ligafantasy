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
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Q;
import l5.C3312F;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9537a;

    /* renamed from: b, reason: collision with root package name */
    private final List f9538b;

    /* renamed from: c, reason: collision with root package name */
    private final W4.r f9539c;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9540a;

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
            int i8 = this.f9540a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                l lVar = l.this;
                this.f9540a = 1;
                if (lVar.e(this) == e8) {
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
        Object f9542a;

        /* renamed from: b, reason: collision with root package name */
        Object f9543b;

        /* renamed from: c, reason: collision with root package name */
        Object f9544c;

        /* renamed from: d, reason: collision with root package name */
        Object f9545d;

        /* renamed from: e, reason: collision with root package name */
        int f9546e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9548a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f9549b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C1498h f9550c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, C1498h c1498h, P5.d dVar) {
                super(2, dVar);
                this.f9549b = lVar;
                this.f9550c = c1498h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9549b, this.f9550c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9548a == 0) {
                    t.b(obj);
                    W4.r rVar = this.f9549b.f9539c;
                    if (rVar != null) {
                        rVar.f(this.f9550c);
                        return I.f6474a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.l$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0209b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9551a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f9552b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ X4.I f9553c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0209b(l lVar, X4.I i8, P5.d dVar) {
                super(2, dVar);
                this.f9552b = lVar;
                this.f9553c = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0209b(this.f9552b, this.f9553c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0209b) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9551a == 0) {
                    t.b(obj);
                    W4.r rVar = this.f9552b.f9539c;
                    if (rVar != null) {
                        rVar.c(this.f9553c.e());
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
            Q q8;
            C3312F c3312f;
            Iterator it;
            l lVar;
            JSONObject jSONObject;
            Object e8 = Q5.b.e();
            int i8 = this.f9546e;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.f9545d;
                lVar = (l) this.f9544c;
                c3312f = (C3312F) this.f9543b;
                q8 = (Q) this.f9542a;
                t.b(obj);
            } else {
                t.b(obj);
                Q q9 = new Q();
                C3312F c3312f2 = new C3312F(l.this.f9537a);
                List list = l.this.f9538b;
                l lVar2 = l.this;
                q8 = q9;
                c3312f = c3312f2;
                it = list.iterator();
                lVar = lVar2;
            }
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                if (longValue > 0) {
                    X4.I Q8 = c3312f.Q(longValue);
                    if (!Q8.b() && Q8.d() != null) {
                        String d8 = Q8.d();
                        AbstractC3159y.f(d8);
                        JSONObject jSONObject2 = new JSONObject(d8);
                        if (!jSONObject2.isNull("success")) {
                            q8.f33745a = jSONObject2.getInt("success");
                        }
                        if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            jSONObject = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        } else {
                            jSONObject = null;
                        }
                        if (q8.f33745a == 1 && jSONObject != null) {
                            C1498h a8 = C1498h.f12529L0.a(jSONObject);
                            if (a8.t0() != null) {
                                J0 c8 = C2812b0.c();
                                a aVar = new a(lVar, a8, null);
                                this.f9542a = q8;
                                this.f9543b = c3312f;
                                this.f9544c = lVar;
                                this.f9545d = it;
                                this.f9546e = 1;
                                if (AbstractC2825i.g(c8, aVar, this) == e8) {
                                    return e8;
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        J0 c9 = C2812b0.c();
                        C0209b c0209b = new C0209b(lVar, Q8, null);
                        this.f9542a = q8;
                        this.f9543b = c3312f;
                        this.f9544c = lVar;
                        this.f9545d = it;
                        this.f9546e = 2;
                        if (AbstractC2825i.g(c9, c0209b, this) == e8) {
                            return e8;
                        }
                    }
                }
            }
            return I.f6474a;
        }
    }

    public l(Context context, List appsIDs, W4.r rVar, M scope) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(appsIDs, "appsIDs");
        AbstractC3159y.i(scope, "scope");
        this.f9537a = context;
        this.f9538b = appsIDs;
        this.f9539c = rVar;
        AbstractC2829k.d(scope, null, null, new a(null), 3, null);
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
