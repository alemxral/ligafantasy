package S4;

import L5.I;
import L5.t;
import X4.C1498h;
import X4.C1501k;
import X4.J;
import X4.N;
import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.InterfaceC2855x0;
import i6.J0;
import i6.M;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.T;
import l5.C3312F;
import l5.C3326n;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9437a;

    /* renamed from: b, reason: collision with root package name */
    private final W4.q f9438b;

    /* renamed from: c, reason: collision with root package name */
    private final C1501k f9439c;

    /* renamed from: d, reason: collision with root package name */
    private final M f9440d;

    /* renamed from: e, reason: collision with root package name */
    private int f9441e;

    /* renamed from: f, reason: collision with root package name */
    private int f9442f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f9443g;

    /* renamed from: h, reason: collision with root package name */
    private C1498h f9444h;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9445a;

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
            int i8 = this.f9445a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                h hVar = h.this;
                this.f9445a = 1;
                if (hVar.u(this) == e8) {
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
        int f9447a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3312F f9449c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9450a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f9451b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f9452c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, T t8, P5.d dVar) {
                super(2, dVar);
                this.f9451b = hVar;
                this.f9452c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9451b, this.f9452c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9450a == 0) {
                    t.b(obj);
                    this.f9451b.f9438b.c((ArrayList) this.f9452c.f33747a);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9449c = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f9449c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9447a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T t8 = new T();
                t8.f33747a = new ArrayList();
                C3326n a8 = C3326n.f34490t.a(h.this.f9437a);
                a8.a();
                String str = "features_by_category_" + h.this.f9439c.c();
                J s02 = a8.s0(str);
                int i9 = 0;
                if (s02 != null && s02.a()) {
                    t8.f33747a = this.f9449c.F0(s02.c());
                } else {
                    X4.I e02 = this.f9449c.e0(h.this.f9439c.c(), 6, 0);
                    if (e02.f()) {
                        t8.f33747a = this.f9449c.F0(e02);
                        String d8 = e02.d();
                        AbstractC3159y.f(d8);
                        J j8 = new J(str, d8);
                        a8.L(str);
                        a8.O0(j8);
                    }
                }
                a8.g();
                if (!((Collection) t8.f33747a).isEmpty()) {
                    h.this.f9442f++;
                    h.this.f9441e = -1;
                    Iterator it = ((ArrayList) t8.f33747a).iterator();
                    while (it.hasNext()) {
                        int i10 = i9 + 1;
                        if (g6.n.s(((C1498h) it.next()).y0(), h.this.f9437a.getPackageName(), true)) {
                            h.this.f9441e = i9;
                        }
                        i9 = i10;
                    }
                    if (h.this.f9441e > -1 && h.this.f9441e < ((ArrayList) t8.f33747a).size()) {
                        ((ArrayList) t8.f33747a).remove(h.this.f9441e);
                    }
                    if (((ArrayList) t8.f33747a).size() > 5) {
                        h.this.f9444h = (C1498h) ((ArrayList) t8.f33747a).remove(5);
                        W4.q qVar = h.this.f9438b;
                        C1498h c1498h = h.this.f9444h;
                        AbstractC3159y.f(c1498h);
                        qVar.e(c1498h);
                    }
                }
                J0 c8 = C2812b0.c();
                a aVar = new a(h.this, t8, null);
                this.f9447a = 1;
                if (AbstractC2825i.g(c8, aVar, this) == e8) {
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
        Object f9453a;

        /* renamed from: b, reason: collision with root package name */
        int f9454b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9456a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f9457b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3312F f9458c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, C3312F c3312f, P5.d dVar) {
                super(2, dVar);
                this.f9457b = hVar;
                this.f9458c = c3312f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9457b, this.f9458c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0062 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0055 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = Q5.b.e()
                    int r1 = r6.f9456a
                    r2 = 4
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L2c
                    if (r1 == r5) goto L28
                    if (r1 == r4) goto L24
                    if (r1 == r3) goto L20
                    if (r1 != r2) goto L18
                    L5.t.b(r7)
                    goto L63
                L18:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L20:
                    L5.t.b(r7)
                    goto L56
                L24:
                    L5.t.b(r7)
                    goto L49
                L28:
                    L5.t.b(r7)
                    goto L3c
                L2c:
                    L5.t.b(r7)
                    S4.h r7 = r6.f9457b
                    l5.F r1 = r6.f9458c
                    r6.f9456a = r5
                    java.lang.Object r7 = S4.h.b(r7, r1, r6)
                    if (r7 != r0) goto L3c
                    return r0
                L3c:
                    S4.h r7 = r6.f9457b
                    l5.F r1 = r6.f9458c
                    r6.f9456a = r4
                    java.lang.Object r7 = S4.h.i(r7, r1, r6)
                    if (r7 != r0) goto L49
                    return r0
                L49:
                    S4.h r7 = r6.f9457b
                    l5.F r1 = r6.f9458c
                    r6.f9456a = r3
                    java.lang.Object r7 = S4.h.l(r7, r1, r6)
                    if (r7 != r0) goto L56
                    return r0
                L56:
                    S4.h r7 = r6.f9457b
                    l5.F r1 = r6.f9458c
                    r6.f9456a = r2
                    java.lang.Object r7 = S4.h.m(r7, r1, r6)
                    if (r7 != r0) goto L63
                    return r0
                L63:
                    L5.I r7 = L5.I.f6474a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: S4.h.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9459a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f9460b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h hVar, P5.d dVar) {
                super(2, dVar);
                this.f9460b = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f9460b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9459a == 0) {
                    t.b(obj);
                    this.f9460b.f9438b.f();
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.h$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0206c extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9461a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f9462b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3312F f9463c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0206c(h hVar, C3312F c3312f, P5.d dVar) {
                super(2, dVar);
                this.f9462b = hVar;
                this.f9463c = c3312f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0206c(this.f9462b, this.f9463c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0206c) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f9461a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    h hVar = this.f9462b;
                    C3312F c3312f = this.f9463c;
                    ArrayList arrayList = hVar.f9443g;
                    this.f9461a = 1;
                    if (hVar.B(c3312f, arrayList, this) == e8) {
                        return e8;
                    }
                }
                return I.f6474a;
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

        /* JADX WARN: Removed duplicated region for block: B:8:0x007b  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r11.f9454b
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L28
                if (r1 == r4) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r11.f9453a
                l5.F r0 = (l5.C3312F) r0
                L5.t.b(r12)
                goto L73
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                java.lang.Object r1 = r11.f9453a
                l5.F r1 = (l5.C3312F) r1
                L5.t.b(r12)
                r12 = r1
                goto L5c
            L28:
                L5.t.b(r12)
                S4.h r12 = S4.h.this
                r1 = 0
                S4.h.s(r12, r1)
                l5.F r12 = new l5.F
                S4.h r1 = S4.h.this
                android.content.Context r1 = S4.h.d(r1)
                r12.<init>(r1)
                S4.h r1 = S4.h.this
                i6.M r5 = r1.y()
                S4.h$c$a r8 = new S4.h$c$a
                S4.h r1 = S4.h.this
                r8.<init>(r1, r12, r3)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                i6.x0 r1 = i6.AbstractC2825i.d(r5, r6, r7, r8, r9, r10)
                r11.f9453a = r12
                r11.f9454b = r4
                java.lang.Object r1 = r1.e(r11)
                if (r1 != r0) goto L5c
                return r0
            L5c:
                i6.J0 r1 = i6.C2812b0.c()
                S4.h$c$b r5 = new S4.h$c$b
                S4.h r6 = S4.h.this
                r5.<init>(r6, r3)
                r11.f9453a = r12
                r11.f9454b = r2
                java.lang.Object r1 = i6.AbstractC2825i.g(r1, r5, r11)
                if (r1 != r0) goto L72
                return r0
            L72:
                r0 = r12
            L73:
                S4.h r12 = S4.h.this
                int r12 = S4.h.k(r12)
                if (r12 < r4) goto L8f
                S4.h r12 = S4.h.this
                i6.M r4 = r12.y()
                S4.h$c$c r7 = new S4.h$c$c
                S4.h r12 = S4.h.this
                r7.<init>(r12, r0, r3)
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                i6.AbstractC2825i.d(r4, r5, r6, r7, r8, r9)
            L8f:
                L5.I r12 = L5.I.f6474a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: S4.h.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9464a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3312F f9465b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f9466c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9467a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ArrayList f9468b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ h f9469c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ArrayList arrayList, h hVar, P5.d dVar) {
                super(2, dVar);
                this.f9468b = arrayList;
                this.f9469c = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9468b, this.f9469c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9467a == 0) {
                    t.b(obj);
                    if (!this.f9468b.isEmpty()) {
                        this.f9469c.f9438b.d(this.f9468b);
                    }
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3312F c3312f, h hVar, P5.d dVar) {
            super(2, dVar);
            this.f9465b = c3312f;
            this.f9466c = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f9465b, this.f9466c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            Object e8 = Q5.b.e();
            int i9 = this.f9464a;
            if (i9 != 0) {
                if (i9 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                ArrayList arrayList = new ArrayList();
                X4.I x8 = this.f9465b.x(this.f9466c.f9439c.c());
                if (!x8.b() && x8.d() != null) {
                    String d8 = x8.d();
                    AbstractC3159y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = x8.d();
                        AbstractC3159y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull("success")) {
                            i8 = jSONObject.getInt("success");
                        } else {
                            i8 = 0;
                        }
                        if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                            int length = jSONArray.length();
                            for (int i10 = 0; i10 < length; i10++) {
                                JSONObject jsonObjectFloatingCategory = jSONArray.getJSONObject(i10);
                                C1501k c1501k = new C1501k(0, null, null, 7, null);
                                AbstractC3159y.h(jsonObjectFloatingCategory, "jsonObjectFloatingCategory");
                                c1501k.z(jsonObjectFloatingCategory);
                                arrayList.add(c1501k);
                            }
                        }
                    }
                }
                J0 c8 = C2812b0.c();
                a aVar = new a(arrayList, this.f9466c, null);
                this.f9464a = 1;
                if (AbstractC2825i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9470a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3312F f9472c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9473a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f9474b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, P5.d dVar) {
                super(2, dVar);
                this.f9474b = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9474b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9473a == 0) {
                    t.b(obj);
                    this.f9474b.f9438b.j(this.f9474b.f9443g);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9472c = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f9472c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9470a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C3326n a8 = C3326n.f34490t.a(h.this.f9437a);
                a8.a();
                String str = "leaf_categories_" + h.this.f9439c.c();
                J s02 = a8.s0(str);
                if (s02 != null && s02.a()) {
                    h.this.f9443g = C1501k.f12621g.a(s02.b(), h.this.f9439c.c());
                } else {
                    X4.I q8 = this.f9472c.q(h.this.f9439c.c());
                    if (q8.f()) {
                        h hVar = h.this;
                        C1501k.b bVar = C1501k.f12621g;
                        String d8 = q8.d();
                        AbstractC3159y.f(d8);
                        hVar.f9443g = bVar.a(d8, h.this.f9439c.c());
                        String d9 = q8.d();
                        AbstractC3159y.f(d9);
                        J j8 = new J(str, d9);
                        a8.L(str);
                        a8.O0(j8);
                    }
                }
                a8.g();
                if (!h.this.f9443g.isEmpty()) {
                    h.this.f9442f++;
                    J0 c8 = C2812b0.c();
                    a aVar = new a(h.this, null);
                    this.f9470a = 1;
                    if (AbstractC2825i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9475a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3312F f9477c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9478a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f9479b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f9480c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, N n8, P5.d dVar) {
                super(2, dVar);
                this.f9479b = hVar;
                this.f9480c = n8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9479b, this.f9480c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9478a == 0) {
                    t.b(obj);
                    this.f9479b.f9438b.i(this.f9480c);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9477c = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f9477c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Object e8 = Q5.b.e();
            int i8 = this.f9475a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C3326n a8 = C3326n.f34490t.a(h.this.f9437a);
                a8.a();
                String str = "recent_by_category_" + h.this.f9439c.c();
                J s02 = a8.s0(str);
                if (s02 != null && s02.a()) {
                    arrayList = this.f9477c.F0(s02.c());
                } else {
                    X4.I S7 = this.f9477c.S(h.this.f9439c.c(), 20, 0);
                    if (S7.f()) {
                        ArrayList F02 = this.f9477c.F0(S7);
                        String d8 = S7.d();
                        AbstractC3159y.f(d8);
                        J j8 = new J(str, d8);
                        a8.L(str);
                        a8.O0(j8);
                        arrayList = F02;
                    } else {
                        arrayList = null;
                    }
                }
                a8.g();
                if (arrayList != null && !arrayList.isEmpty()) {
                    String string = h.this.f9437a.getString(R.string.the_latest_title);
                    AbstractC3159y.h(string, "context.getString(R.string.the_latest_title)");
                    C1501k c1501k = new C1501k(-2, string, null, 4, null);
                    c1501k.V(h.this.f9439c.c());
                    N n8 = new N(c1501k, arrayList, 0, 4, null);
                    n8.f(1);
                    J0 c8 = C2812b0.c();
                    a aVar = new a(h.this, n8, null);
                    this.f9475a = 1;
                    if (AbstractC2825i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f9481a;

        /* renamed from: b, reason: collision with root package name */
        Object f9482b;

        /* renamed from: c, reason: collision with root package name */
        int f9483c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3312F f9485e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9486a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f9487b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f9488c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, N n8, P5.d dVar) {
                super(2, dVar);
                this.f9487b = hVar;
                this.f9488c = n8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9487b, this.f9488c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9486a == 0) {
                    t.b(obj);
                    this.f9487b.f9438b.a(this.f9488c);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9489a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f9490b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f9491c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h hVar, T t8, P5.d dVar) {
                super(2, dVar);
                this.f9490b = hVar;
                this.f9491c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f9490b, this.f9491c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9489a == 0) {
                    t.b(obj);
                    this.f9490b.f9438b.g((C1498h) this.f9491c.f33747a);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9485e = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f9485e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C3326n a8;
            ArrayList arrayList;
            C3326n c3326n;
            Object e8 = Q5.b.e();
            int i8 = this.f9483c;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        c3326n = (C3326n) this.f9481a;
                        t.b(obj);
                        a8 = c3326n;
                        a8.g();
                        return I.f6474a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a8 = (C3326n) this.f9482b;
                arrayList = (ArrayList) this.f9481a;
                t.b(obj);
            } else {
                t.b(obj);
                ArrayList arrayList2 = new ArrayList();
                a8 = C3326n.f34490t.a(h.this.f9437a);
                a8.a();
                String str = "top_downloads_" + h.this.f9439c.c();
                J s02 = a8.s0(str);
                if (s02 != null && s02.a()) {
                    arrayList2 = this.f9485e.F0(s02.c());
                } else {
                    X4.I b02 = this.f9485e.b0(h.this.f9439c.c(), 20, 0);
                    if (b02.f()) {
                        arrayList2 = this.f9485e.F0(b02);
                        String d8 = b02.d();
                        AbstractC3159y.f(d8);
                        J j8 = new J(str, d8);
                        a8.L(str);
                        a8.O0(j8);
                    }
                }
                arrayList = arrayList2;
                if (!arrayList.isEmpty()) {
                    String string = h.this.f9437a.getString(R.string.top_downloads_title);
                    AbstractC3159y.h(string, "context.getString(R.string.top_downloads_title)");
                    N n8 = new N(h.this.f9439c, arrayList, 0, 4, null);
                    n8.b().T(string);
                    if (h.this.f9439c.c() == 523 && !UptodownApp.f27990B.S()) {
                        n8.f(4);
                    } else {
                        n8.f(5);
                    }
                    J0 c8 = C2812b0.c();
                    a aVar = new a(h.this, n8, null);
                    this.f9481a = arrayList;
                    this.f9482b = a8;
                    this.f9483c = 1;
                    if (AbstractC2825i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
                a8.g();
                return I.f6474a;
            }
            if (h.this.f9441e > -1) {
                T t8 = new T();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C1498h c1498h = (C1498h) it.next();
                    if (!g6.n.s(c1498h.y0(), h.this.f9437a.getPackageName(), true)) {
                        t8.f33747a = c1498h;
                        break;
                    }
                }
                if (t8.f33747a != null) {
                    J0 c9 = C2812b0.c();
                    b bVar = new b(h.this, t8, null);
                    this.f9481a = a8;
                    this.f9482b = null;
                    this.f9483c = 2;
                    if (AbstractC2825i.g(c9, bVar, this) == e8) {
                        return e8;
                    }
                    c3326n = a8;
                    a8 = c3326n;
                }
            }
            a8.g();
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S4.h$h, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0207h extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f9492a;

        /* renamed from: b, reason: collision with root package name */
        Object f9493b;

        /* renamed from: c, reason: collision with root package name */
        Object f9494c;

        /* renamed from: d, reason: collision with root package name */
        int f9495d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f9497f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C3312F f9498g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.h$h$a */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9499a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f9500b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f9501c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, N n8, P5.d dVar) {
                super(2, dVar);
                this.f9500b = hVar;
                this.f9501c = n8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9500b, this.f9501c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9499a == 0) {
                    t.b(obj);
                    if (this.f9500b.f9439c.c() != 523) {
                        this.f9500b.f9438b.h(this.f9501c);
                    }
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.h$h$b */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9502a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f9503b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f9504c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C3312F f9505d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: S4.h$h$b$a */
            /* loaded from: classes4.dex */
            public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f9506a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ h f9507b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3312F f9508c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(h hVar, C3312F c3312f, P5.d dVar) {
                    super(2, dVar);
                    this.f9507b = hVar;
                    this.f9508c = c3312f;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new a(this.f9507b, this.f9508c, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f9506a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        h hVar = this.f9507b;
                        C3312F c3312f = this.f9508c;
                        this.f9506a = 1;
                        if (hVar.v(c3312f, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f6474a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h hVar, ArrayList arrayList, C3312F c3312f, P5.d dVar) {
                super(2, dVar);
                this.f9503b = hVar;
                this.f9504c = arrayList;
                this.f9505d = c3312f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f9503b, this.f9504c, this.f9505d, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC2855x0 d8;
                Q5.b.e();
                if (this.f9502a == 0) {
                    t.b(obj);
                    if (this.f9503b.f9439c.c() == 523) {
                        this.f9503b.f9438b.b(this.f9504c);
                    }
                    d8 = AbstractC2829k.d(this.f9503b.y(), null, null, new a(this.f9503b, this.f9505d, null), 3, null);
                    return d8;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0207h(ArrayList arrayList, C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9497f = arrayList;
            this.f9498g = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0207h(this.f9497f, this.f9498g, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0207h) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            C3326n c3326n;
            Iterator it;
            Object e8 = Q5.b.e();
            int i8 = this.f9495d;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.f9494c;
                c3326n = (C3326n) this.f9493b;
                arrayList = (ArrayList) this.f9492a;
                t.b(obj);
            } else {
                t.b(obj);
                ArrayList arrayList2 = new ArrayList();
                C3326n a8 = C3326n.f34490t.a(h.this.f9437a);
                a8.a();
                arrayList = arrayList2;
                c3326n = a8;
                it = this.f9497f.iterator();
            }
            while (it.hasNext()) {
                C1501k leafCategory = (C1501k) it.next();
                h hVar = h.this;
                AbstractC3159y.h(leafCategory, "leafCategory");
                N A8 = hVar.A(leafCategory, this.f9498g, c3326n);
                arrayList.add(A8);
                J0 c8 = C2812b0.c();
                a aVar = new a(h.this, A8, null);
                this.f9492a = arrayList;
                this.f9493b = c3326n;
                this.f9494c = it;
                this.f9495d = 1;
                if (AbstractC2825i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            c3326n.g();
            J0 c9 = C2812b0.c();
            b bVar = new b(h.this, arrayList, this.f9498g, null);
            this.f9492a = null;
            this.f9493b = null;
            this.f9494c = null;
            this.f9495d = 2;
            obj = AbstractC2825i.g(c9, bVar, this);
            if (obj == e8) {
                return e8;
            }
            return obj;
        }
    }

    public h(Context context, W4.q listener, C1501k category, M scope) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(category, "category");
        AbstractC3159y.i(scope, "scope");
        this.f9437a = context;
        this.f9438b = listener;
        this.f9439c = category;
        this.f9440d = scope;
        this.f9441e = -1;
        this.f9443g = new ArrayList();
        AbstractC2829k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final N A(C1501k c1501k, C3312F c3312f, C3326n c3326n) {
        String str = "category_top_" + c1501k.c();
        int e8 = c1501k.e();
        int j8 = c1501k.j();
        ArrayList arrayList = new ArrayList();
        J s02 = c3326n.s0(str);
        if (s02 != null && s02.a()) {
            arrayList = c3312f.F0(s02.c());
        } else {
            X4.I c02 = c3312f.c0(c1501k.c(), e8, 0);
            if (c02.f()) {
                arrayList = c3312f.F0(c02);
                String d8 = c02.d();
                AbstractC3159y.f(d8);
                J j9 = new J(str, d8);
                c3326n.L(str);
                c3326n.O0(j9);
            }
        }
        N n8 = new N(c1501k, arrayList, 0, 4, null);
        n8.f(j8);
        return n8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(C3312F c3312f, ArrayList arrayList, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new C0207h(arrayList, c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new b(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new c(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new d(c3312f, this, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new e(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object x(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new f(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new g(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    public final M y() {
        return this.f9440d;
    }
}
