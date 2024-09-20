package S4;

import L5.I;
import L5.t;
import M5.AbstractC1246t;
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
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.T;
import l5.C3312F;
import l5.C3326n;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private Context f9256a;

    /* renamed from: b, reason: collision with root package name */
    private W4.n f9257b;

    /* renamed from: c, reason: collision with root package name */
    private final M f9258c;

    /* renamed from: d, reason: collision with root package name */
    private int f9259d;

    /* renamed from: e, reason: collision with root package name */
    private int f9260e;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9261a;

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
            int i8 = this.f9261a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                c cVar = c.this;
                this.f9261a = 1;
                if (cVar.t(this) == e8) {
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
        int f9263a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3312F f9265c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9266a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9267b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f9268c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C3312F f9269d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: S4.c$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0198a extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f9270a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ c f9271b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3312F f9272c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ T f9273d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0198a(c cVar, C3312F c3312f, T t8, P5.d dVar) {
                    super(2, dVar);
                    this.f9271b = cVar;
                    this.f9272c = c3312f;
                    this.f9273d = t8;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new C0198a(this.f9271b, this.f9272c, this.f9273d, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((C0198a) create(m8, dVar)).invokeSuspend(I.f6474a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f9270a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        c cVar = this.f9271b;
                        C3312F c3312f = this.f9272c;
                        ArrayList arrayList = (ArrayList) this.f9273d.f33747a;
                        this.f9270a = 1;
                        if (cVar.D(c3312f, arrayList, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f6474a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, T t8, C3312F c3312f, P5.d dVar) {
                super(2, dVar);
                this.f9267b = cVar;
                this.f9268c = t8;
                this.f9269d = c3312f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9267b, this.f9268c, this.f9269d, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC2855x0 d8;
                Q5.b.e();
                if (this.f9266a == 0) {
                    t.b(obj);
                    this.f9267b.f9257b.l((ArrayList) this.f9268c.f33747a);
                    d8 = AbstractC2829k.d(this.f9267b.A(), null, null, new C0198a(this.f9267b, this.f9269d, this.f9268c, null), 3, null);
                    return d8;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9265c = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f9265c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9263a;
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
                C3326n a8 = C3326n.f34490t.a(c.this.f9256a);
                a8.a();
                J s02 = a8.s0("categories");
                if (s02 != null && s02.a()) {
                    t8.f33747a = C1501k.b.b(C1501k.f12621g, s02.b(), 0, 2, null);
                } else {
                    X4.I p8 = this.f9265c.p();
                    if (p8.f()) {
                        C1501k.b bVar = C1501k.f12621g;
                        String d8 = p8.d();
                        AbstractC3159y.f(d8);
                        t8.f33747a = C1501k.b.b(bVar, d8, 0, 2, null);
                        String d9 = p8.d();
                        AbstractC3159y.f(d9);
                        J j8 = new J("categories", d9);
                        a8.L("categories");
                        a8.O0(j8);
                    }
                }
                a8.g();
                if (!((Collection) t8.f33747a).isEmpty()) {
                    c.this.f9260e++;
                    J0 c8 = C2812b0.c();
                    a aVar = new a(c.this, t8, this.f9265c, null);
                    this.f9263a = 1;
                    if (AbstractC2825i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S4.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0199c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f9274a;

        /* renamed from: b, reason: collision with root package name */
        int f9275b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9277a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9278b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3312F f9279c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, C3312F c3312f, P5.d dVar) {
                super(2, dVar);
                this.f9278b = cVar;
                this.f9279c = c3312f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9278b, this.f9279c, dVar);
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
                    int r1 = r6.f9277a
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
                    S4.c r7 = r6.f9278b
                    l5.F r1 = r6.f9279c
                    r6.f9277a = r5
                    java.lang.Object r7 = S4.c.e(r7, r1, r6)
                    if (r7 != r0) goto L3c
                    return r0
                L3c:
                    S4.c r7 = r6.f9278b
                    l5.F r1 = r6.f9279c
                    r6.f9277a = r4
                    java.lang.Object r7 = S4.c.a(r7, r1, r6)
                    if (r7 != r0) goto L49
                    return r0
                L49:
                    S4.c r7 = r6.f9278b
                    l5.F r1 = r6.f9279c
                    r6.f9277a = r3
                    java.lang.Object r7 = S4.c.d(r7, r1, r6)
                    if (r7 != r0) goto L56
                    return r0
                L56:
                    S4.c r7 = r6.f9278b
                    l5.F r1 = r6.f9279c
                    r6.f9277a = r2
                    java.lang.Object r7 = S4.c.k(r7, r1, r6)
                    if (r7 != r0) goto L63
                    return r0
                L63:
                    L5.I r7 = L5.I.f6474a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: S4.c.C0199c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.c$c$b */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9280a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9281b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c cVar, P5.d dVar) {
                super(2, dVar);
                this.f9281b = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f9281b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9280a == 0) {
                    t.b(obj);
                    this.f9281b.f9257b.e();
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.c$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0200c extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9282a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9283b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3312F f9284c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0200c(c cVar, C3312F c3312f, P5.d dVar) {
                super(2, dVar);
                this.f9283b = cVar;
                this.f9284c = c3312f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0200c(this.f9283b, this.f9284c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0200c) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f9282a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    c cVar = this.f9283b;
                    C3312F c3312f = this.f9284c;
                    this.f9282a = 1;
                    if (cVar.w(c3312f, this) == e8) {
                        return e8;
                    }
                }
                return I.f6474a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.c$c$d */
        /* loaded from: classes4.dex */
        public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9285a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9286b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3312F f9287c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(c cVar, C3312F c3312f, P5.d dVar) {
                super(2, dVar);
                this.f9286b = cVar;
                this.f9287c = c3312f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new d(this.f9286b, this.f9287c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((d) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f9285a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    c cVar = this.f9286b;
                    C3312F c3312f = this.f9287c;
                    this.f9285a = 1;
                    if (cVar.z(c3312f, this) == e8) {
                        return e8;
                    }
                }
                return I.f6474a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.c$c$e */
        /* loaded from: classes4.dex */
        public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9288a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9289b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3312F f9290c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(c cVar, C3312F c3312f, P5.d dVar) {
                super(2, dVar);
                this.f9289b = cVar;
                this.f9290c = c3312f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new e(this.f9289b, this.f9290c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f9288a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    c cVar = this.f9289b;
                    C3312F c3312f = this.f9290c;
                    this.f9288a = 1;
                    if (cVar.C(c3312f, this) == e8) {
                        return e8;
                    }
                }
                return I.f6474a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.c$c$f */
        /* loaded from: classes4.dex */
        public static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9291a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9292b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3312F f9293c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(c cVar, C3312F c3312f, P5.d dVar) {
                super(2, dVar);
                this.f9292b = cVar;
                this.f9293c = c3312f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new f(this.f9292b, this.f9293c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((f) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f9291a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    c cVar = this.f9292b;
                    C3312F c3312f = this.f9293c;
                    this.f9291a = 1;
                    if (cVar.x(c3312f, this) == e8) {
                        return e8;
                    }
                }
                return I.f6474a;
            }
        }

        C0199c(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0199c(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0199c) create(m8, dVar)).invokeSuspend(I.f6474a);
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
                int r1 = r11.f9275b
                r2 = 1
                r3 = 2
                r4 = 0
                if (r1 == 0) goto L28
                if (r1 == r2) goto L1f
                if (r1 != r3) goto L17
                java.lang.Object r0 = r11.f9274a
                l5.F r0 = (l5.C3312F) r0
                L5.t.b(r12)
                goto L73
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                java.lang.Object r1 = r11.f9274a
                l5.F r1 = (l5.C3312F) r1
                L5.t.b(r12)
                r12 = r1
                goto L5c
            L28:
                L5.t.b(r12)
                S4.c r12 = S4.c.this
                r1 = 0
                S4.c.r(r12, r1)
                l5.F r12 = new l5.F
                S4.c r1 = S4.c.this
                android.content.Context r1 = S4.c.b(r1)
                r12.<init>(r1)
                S4.c r1 = S4.c.this
                i6.M r5 = r1.A()
                S4.c$c$a r8 = new S4.c$c$a
                S4.c r1 = S4.c.this
                r8.<init>(r1, r12, r4)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                i6.x0 r1 = i6.AbstractC2825i.d(r5, r6, r7, r8, r9, r10)
                r11.f9274a = r12
                r11.f9275b = r2
                java.lang.Object r1 = r1.e(r11)
                if (r1 != r0) goto L5c
                return r0
            L5c:
                i6.J0 r1 = i6.C2812b0.c()
                S4.c$c$b r2 = new S4.c$c$b
                S4.c r5 = S4.c.this
                r2.<init>(r5, r4)
                r11.f9274a = r12
                r11.f9275b = r3
                java.lang.Object r1 = i6.AbstractC2825i.g(r1, r2, r11)
                if (r1 != r0) goto L72
                return r0
            L72:
                r0 = r12
            L73:
                S4.c r12 = S4.c.this
                int r12 = S4.c.j(r12)
                if (r12 < r3) goto Lbf
                S4.c r12 = S4.c.this
                i6.M r5 = r12.A()
                S4.c$c$c r8 = new S4.c$c$c
                S4.c r12 = S4.c.this
                r8.<init>(r12, r0, r4)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                i6.AbstractC2825i.d(r5, r6, r7, r8, r9, r10)
                S4.c r12 = S4.c.this
                i6.M r5 = r12.A()
                S4.c$c$d r8 = new S4.c$c$d
                S4.c r12 = S4.c.this
                r8.<init>(r12, r0, r4)
                i6.AbstractC2825i.d(r5, r6, r7, r8, r9, r10)
                S4.c r12 = S4.c.this
                i6.M r5 = r12.A()
                S4.c$c$e r8 = new S4.c$c$e
                S4.c r12 = S4.c.this
                r8.<init>(r12, r0, r4)
                i6.AbstractC2825i.d(r5, r6, r7, r8, r9, r10)
                S4.c r12 = S4.c.this
                i6.M r5 = r12.A()
                S4.c$c$f r8 = new S4.c$c$f
                S4.c r12 = S4.c.this
                r8.<init>(r12, r0, r4)
                i6.AbstractC2825i.d(r5, r6, r7, r8, r9, r10)
            Lbf:
                L5.I r12 = L5.I.f6474a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: S4.c.C0199c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f9294a;

        /* renamed from: b, reason: collision with root package name */
        int f9295b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3312F f9297d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9298a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9299b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f9300c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C3312F f9301d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ T f9302e;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: S4.c$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0201a extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f9303a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ c f9304b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3312F f9305c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ T f9306d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0201a(c cVar, C3312F c3312f, T t8, P5.d dVar) {
                    super(2, dVar);
                    this.f9304b = cVar;
                    this.f9305c = c3312f;
                    this.f9306d = t8;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new C0201a(this.f9304b, this.f9305c, this.f9306d, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((C0201a) create(m8, dVar)).invokeSuspend(I.f6474a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f9303a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        c cVar = this.f9304b;
                        C3312F c3312f = this.f9305c;
                        ArrayList arrayList = (ArrayList) this.f9306d.f33747a;
                        this.f9303a = 1;
                        if (cVar.E(c3312f, arrayList, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f6474a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, N n8, C3312F c3312f, T t8, P5.d dVar) {
                super(2, dVar);
                this.f9299b = cVar;
                this.f9300c = n8;
                this.f9301d = c3312f;
                this.f9302e = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9299b, this.f9300c, this.f9301d, this.f9302e, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC2855x0 d8;
                Q5.b.e();
                if (this.f9298a == 0) {
                    t.b(obj);
                    this.f9299b.f9257b.h(this.f9300c);
                    d8 = AbstractC2829k.d(this.f9299b.A(), null, null, new C0201a(this.f9299b, this.f9301d, this.f9302e, null), 3, null);
                    return d8;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9297d = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f9297d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C3326n a8;
            C3326n c3326n;
            Object e8 = Q5.b.e();
            int i8 = this.f9295b;
            if (i8 != 0) {
                if (i8 == 1) {
                    c3326n = (C3326n) this.f9294a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T t8 = new T();
                t8.f33747a = new ArrayList();
                a8 = C3326n.f34490t.a(c.this.f9256a);
                a8.a();
                J s02 = a8.s0("floating_categories");
                if (s02 != null && s02.a()) {
                    t8.f33747a = C1501k.f12621g.c(s02.b());
                } else {
                    X4.I v8 = this.f9297d.v();
                    if (v8.f()) {
                        C1501k.b bVar = C1501k.f12621g;
                        String d8 = v8.d();
                        AbstractC3159y.f(d8);
                        t8.f33747a = bVar.c(d8);
                        String d9 = v8.d();
                        AbstractC3159y.f(d9);
                        J j8 = new J("floating_categories", d9);
                        a8.L("floating_categories");
                        a8.O0(j8);
                    }
                }
                if (!((Collection) t8.f33747a).isEmpty()) {
                    N B8 = c.this.B((C1501k) AbstractC1246t.m0((List) t8.f33747a), this.f9297d, a8);
                    J0 c8 = C2812b0.c();
                    a aVar = new a(c.this, B8, this.f9297d, t8, null);
                    this.f9294a = a8;
                    this.f9295b = 1;
                    if (AbstractC2825i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                    c3326n = a8;
                }
                a8.g();
                return I.f6474a;
            }
            a8 = c3326n;
            a8.g();
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9307a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3312F f9309c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9310a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9311b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f9312c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, T t8, P5.d dVar) {
                super(2, dVar);
                this.f9311b = cVar;
                this.f9312c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9311b, this.f9312c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9310a == 0) {
                    t.b(obj);
                    this.f9311b.f9257b.d((ArrayList) this.f9312c.f33747a);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9309c = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f9309c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9307a;
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
                C3326n a8 = C3326n.f34490t.a(c.this.f9256a);
                a8.a();
                J s02 = a8.s0("home_features");
                if (s02 != null && s02.a()) {
                    t8.f33747a = this.f9309c.F0(s02.c());
                } else {
                    X4.I y8 = this.f9309c.y();
                    if (y8.f()) {
                        t8.f33747a = this.f9309c.F0(y8);
                        String d8 = y8.d();
                        AbstractC3159y.f(d8);
                        J j8 = new J("home_features", d8);
                        a8.L("home_features");
                        a8.O0(j8);
                    }
                }
                a8.g();
                if (!((Collection) t8.f33747a).isEmpty()) {
                    c.this.f9260e++;
                    c.this.f9259d = -1;
                    Iterator it = ((ArrayList) t8.f33747a).iterator();
                    int i9 = 0;
                    while (it.hasNext()) {
                        int i10 = i9 + 1;
                        if (g6.n.s(((C1498h) it.next()).y0(), c.this.f9256a.getPackageName(), true)) {
                            c.this.f9259d = i9;
                        }
                        i9 = i10;
                    }
                    if (c.this.f9259d > -1 && c.this.f9259d < ((ArrayList) t8.f33747a).size()) {
                        ((ArrayList) t8.f33747a).remove(c.this.f9259d);
                    }
                }
                J0 c8 = C2812b0.c();
                a aVar = new a(c.this, t8, null);
                this.f9307a = 1;
                if (AbstractC2825i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9313a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3312F f9315c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9316a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9317b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f9318c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, N n8, P5.d dVar) {
                super(2, dVar);
                this.f9317b = cVar;
                this.f9318c = n8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9317b, this.f9318c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9316a == 0) {
                    t.b(obj);
                    this.f9317b.f9257b.f(this.f9318c);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9315c = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f9315c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9313a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                ArrayList arrayList = new ArrayList();
                C3326n a8 = C3326n.f34490t.a(c.this.f9256a);
                a8.a();
                J s02 = a8.s0("last_updates");
                if (s02 != null && s02.a()) {
                    arrayList = this.f9315c.F0(s02.c());
                } else {
                    X4.I E8 = this.f9315c.E(20, 0);
                    if (E8.f()) {
                        arrayList = this.f9315c.F0(E8);
                        String d8 = E8.d();
                        AbstractC3159y.f(d8);
                        J j8 = new J("last_updates", d8);
                        a8.L("last_updates");
                        a8.O0(j8);
                    }
                }
                ArrayList arrayList2 = arrayList;
                a8.g();
                String string = c.this.f9256a.getString(R.string.latest_updates);
                AbstractC3159y.h(string, "context.getString(R.string.latest_updates)");
                N n8 = new N(new C1501k(-3, string, null, 4, null), arrayList2, 0, 4, null);
                n8.f(1);
                J0 c8 = C2812b0.c();
                a aVar = new a(c.this, n8, null);
                this.f9313a = 1;
                if (AbstractC2825i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9319a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3312F f9321c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9322a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ T f9323b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f9324c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(T t8, c cVar, P5.d dVar) {
                super(2, dVar);
                this.f9323b = t8;
                this.f9324c = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9323b, this.f9324c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9322a == 0) {
                    t.b(obj);
                    if (this.f9323b.f33747a != null) {
                        this.f9324c.f9257b.k((C1498h) this.f9323b.f33747a);
                    }
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9321c = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f9321c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9319a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T t8 = new T();
                C3326n a8 = C3326n.f34490t.a(c.this.f9256a);
                a8.a();
                J s02 = a8.s0("main_app");
                if (s02 != null && s02.a()) {
                    JSONObject jsonObjectData = new JSONObject(s02.b()).getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                    C1498h c1498h = new C1498h();
                    t8.f33747a = c1498h;
                    AbstractC3159y.h(jsonObjectData, "jsonObjectData");
                    c1498h.b(jsonObjectData);
                } else {
                    X4.I F8 = this.f9321c.F();
                    if (F8.f()) {
                        String d8 = F8.d();
                        AbstractC3159y.f(d8);
                        JSONObject jsonObjectData2 = new JSONObject(d8).getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        C1498h c1498h2 = new C1498h();
                        t8.f33747a = c1498h2;
                        AbstractC3159y.h(jsonObjectData2, "jsonObjectData");
                        c1498h2.b(jsonObjectData2);
                        String d9 = F8.d();
                        AbstractC3159y.f(d9);
                        J j8 = new J("main_app", d9);
                        a8.L("main_app");
                        a8.O0(j8);
                    }
                }
                a8.g();
                J0 c8 = C2812b0.c();
                a aVar = new a(t8, c.this, null);
                this.f9319a = 1;
                if (AbstractC2825i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9325a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3312F f9327c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9328a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9329b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f9330c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, N n8, P5.d dVar) {
                super(2, dVar);
                this.f9329b = cVar;
                this.f9330c = n8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9329b, this.f9330c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9328a == 0) {
                    t.b(obj);
                    this.f9329b.f9257b.c(this.f9330c);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9327c = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new h(this.f9327c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Object e8 = Q5.b.e();
            int i8 = this.f9325a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C3326n a8 = C3326n.f34490t.a(c.this.f9256a);
                a8.a();
                J s02 = a8.s0("new_releases");
                if (s02 != null && s02.a()) {
                    arrayList = this.f9327c.F0(s02.c());
                } else {
                    X4.I I8 = this.f9327c.I(20, 0);
                    if (I8.f()) {
                        ArrayList F02 = this.f9327c.F0(I8);
                        String d8 = I8.d();
                        AbstractC3159y.f(d8);
                        J j8 = new J("new_releases", d8);
                        a8.L("new_releases");
                        a8.O0(j8);
                        arrayList = F02;
                    } else {
                        arrayList = null;
                    }
                }
                a8.g();
                if (arrayList != null && !arrayList.isEmpty()) {
                    String string = c.this.f9256a.getString(R.string.new_releases);
                    AbstractC3159y.h(string, "context.getString(R.string.new_releases)");
                    N n8 = new N(new C1501k(-2, string, null, 4, null), arrayList, 0, 4, null);
                    n8.f(1);
                    J0 c8 = C2812b0.c();
                    a aVar = new a(c.this, n8, null);
                    this.f9325a = 1;
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
    public static final class i extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9331a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3312F f9333c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9334a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9335b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f9336c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, T t8, P5.d dVar) {
                super(2, dVar);
                this.f9335b = cVar;
                this.f9336c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9335b, this.f9336c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9334a == 0) {
                    t.b(obj);
                    this.f9335b.f9257b.g((ArrayList) this.f9336c.f33747a);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9333c = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new i(this.f9333c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9331a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T t8 = new T();
                C3326n a8 = C3326n.f34490t.a(c.this.f9256a);
                a8.a();
                J s02 = a8.s0("recent_featured");
                if (s02 != null && s02.a()) {
                    t8.f33747a = this.f9333c.F0(s02.c());
                } else {
                    X4.I T7 = this.f9333c.T(1, 0);
                    if (T7.f()) {
                        t8.f33747a = this.f9333c.F0(T7);
                        String d8 = T7.d();
                        AbstractC3159y.f(d8);
                        J j8 = new J("recent_featured", d8);
                        a8.L("recent_featured");
                        a8.O0(j8);
                    }
                }
                a8.g();
                Collection collection = (Collection) t8.f33747a;
                if (collection != null && !collection.isEmpty()) {
                    J0 c8 = C2812b0.c();
                    a aVar = new a(c.this, t8, null);
                    this.f9331a = 1;
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
    public static final class j extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f9337a;

        /* renamed from: b, reason: collision with root package name */
        Object f9338b;

        /* renamed from: c, reason: collision with root package name */
        int f9339c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3312F f9341e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9342a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9343b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f9344c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, N n8, P5.d dVar) {
                super(2, dVar);
                this.f9343b = cVar;
                this.f9344c = n8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9343b, this.f9344c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9342a == 0) {
                    t.b(obj);
                    this.f9343b.f9257b.a(this.f9344c);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9345a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9346b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f9347c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c cVar, T t8, P5.d dVar) {
                super(2, dVar);
                this.f9346b = cVar;
                this.f9347c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f9346b, this.f9347c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9345a == 0) {
                    t.b(obj);
                    this.f9346b.f9257b.j((C1498h) this.f9347c.f33747a);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9341e = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new j(this.f9341e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C3326n a8;
            ArrayList arrayList;
            C3326n c3326n;
            Object e8 = Q5.b.e();
            int i8 = this.f9339c;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        c3326n = (C3326n) this.f9337a;
                        t.b(obj);
                        a8 = c3326n;
                        a8.g();
                        return I.f6474a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a8 = (C3326n) this.f9338b;
                arrayList = (ArrayList) this.f9337a;
                t.b(obj);
            } else {
                t.b(obj);
                ArrayList arrayList2 = new ArrayList();
                a8 = C3326n.f34490t.a(c.this.f9256a);
                a8.a();
                J s02 = a8.s0("top_downloads");
                if (s02 != null && s02.a()) {
                    arrayList2 = this.f9341e.F0(s02.c());
                } else {
                    X4.I a02 = this.f9341e.a0(20, 0);
                    if (a02.f()) {
                        arrayList2 = this.f9341e.F0(a02);
                        String d8 = a02.d();
                        AbstractC3159y.f(d8);
                        J j8 = new J("top_downloads", d8);
                        a8.L("top_downloads");
                        a8.O0(j8);
                    }
                }
                arrayList = arrayList2;
                if (!arrayList.isEmpty()) {
                    String string = c.this.f9256a.getString(R.string.top_downloads_title);
                    AbstractC3159y.h(string, "context.getString(R.string.top_downloads_title)");
                    N n8 = new N(new C1501k(-1, string, null, 4, null), arrayList, 0, 4, null);
                    n8.f(8);
                    J0 c8 = C2812b0.c();
                    a aVar = new a(c.this, n8, null);
                    this.f9337a = arrayList;
                    this.f9338b = a8;
                    this.f9339c = 1;
                    if (AbstractC2825i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
                a8.g();
                return I.f6474a;
            }
            if (c.this.f9259d > -1) {
                T t8 = new T();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C1498h c1498h = (C1498h) it.next();
                    if (!g6.n.s(c1498h.y0(), c.this.f9256a.getPackageName(), true)) {
                        t8.f33747a = c1498h;
                        break;
                    }
                }
                if (t8.f33747a != null) {
                    J0 c9 = C2812b0.c();
                    b bVar = new b(c.this, t8, null);
                    this.f9337a = a8;
                    this.f9338b = null;
                    this.f9339c = 2;
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
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9348a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f9350c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3312F f9351d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9352a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9353b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f9354c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, ArrayList arrayList, P5.d dVar) {
                super(2, dVar);
                this.f9353b = cVar;
                this.f9354c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9353b, this.f9354c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9352a == 0) {
                    t.b(obj);
                    this.f9353b.f9257b.b(this.f9354c);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ArrayList arrayList, C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9350c = arrayList;
            this.f9351d = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new k(this.f9350c, this.f9351d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9348a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                ArrayList arrayList = new ArrayList();
                C3326n a8 = C3326n.f34490t.a(c.this.f9256a);
                a8.a();
                Iterator it = this.f9350c.iterator();
                while (it.hasNext()) {
                    C1501k category = (C1501k) it.next();
                    c cVar = c.this;
                    AbstractC3159y.h(category, "category");
                    arrayList.add(cVar.B(category, this.f9351d, a8));
                }
                a8.g();
                J0 c8 = C2812b0.c();
                a aVar = new a(c.this, arrayList, null);
                this.f9348a = 1;
                if (AbstractC2825i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9355a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f9356b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f9357c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3312F f9358d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f9359a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f9360b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f9361c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, ArrayList arrayList, P5.d dVar) {
                super(2, dVar);
                this.f9360b = cVar;
                this.f9361c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9360b, this.f9361c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f9359a == 0) {
                    t.b(obj);
                    this.f9360b.f9257b.i(this.f9361c);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(ArrayList arrayList, c cVar, C3312F c3312f, P5.d dVar) {
            super(2, dVar);
            this.f9356b = arrayList;
            this.f9357c = cVar;
            this.f9358d = c3312f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new l(this.f9356b, this.f9357c, this.f9358d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9355a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                if (!this.f9356b.isEmpty()) {
                    C3326n a8 = C3326n.f34490t.a(this.f9357c.f9256a);
                    a8.a();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.f9356b.iterator();
                    while (it.hasNext()) {
                        C1501k floatingCategory = (C1501k) it.next();
                        c cVar = this.f9357c;
                        AbstractC3159y.h(floatingCategory, "floatingCategory");
                        arrayList.add(cVar.B(floatingCategory, this.f9358d, a8));
                    }
                    a8.g();
                    J0 c8 = C2812b0.c();
                    a aVar = new a(this.f9357c, arrayList, null);
                    this.f9355a = 1;
                    if (AbstractC2825i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f6474a;
        }
    }

    public c(Context context, W4.n listener, M scope) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(scope, "scope");
        this.f9256a = context;
        this.f9257b = listener;
        this.f9258c = scope;
        this.f9259d = -1;
        AbstractC2829k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final N B(C1501k c1501k, C3312F c3312f, C3326n c3326n) {
        String str;
        X4.I b02;
        int i8 = 5;
        int i9 = 20;
        if (c1501k.n()) {
            str = "floating_category_top_" + c1501k.c();
        } else {
            str = "category_top_" + c1501k.c();
            int c8 = c1501k.c();
            if (c8 != 521) {
                if (c8 != 523) {
                    if (c8 != 524) {
                        i9 = 12;
                        i8 = 6;
                    }
                } else {
                    if (!UptodownApp.f27990B.S()) {
                        i8 = 4;
                    }
                    i9 = 8;
                }
            }
            i8 = 1;
        }
        ArrayList arrayList = new ArrayList();
        J s02 = c3326n.s0(str);
        if (s02 != null && s02.a()) {
            arrayList = c3312f.F0(s02.c());
        } else {
            if (c1501k.n()) {
                b02 = c3312f.d0(c1501k.c(), i9, 0);
            } else {
                b02 = c3312f.b0(c1501k.c(), i9, 0);
            }
            if (b02.f()) {
                arrayList = c3312f.F0(b02);
                String d8 = b02.d();
                AbstractC3159y.f(d8);
                J j8 = new J(str, d8);
                c3326n.L(str);
                c3326n.O0(j8);
            }
        }
        N n8 = new N(c1501k, arrayList, 0, 4, null);
        n8.f(i8);
        return n8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new j(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D(C3312F c3312f, ArrayList arrayList, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new k(arrayList, c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E(C3312F c3312f, ArrayList arrayList, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new l(arrayList, this, c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new b(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new C0199c(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new d(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new e(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new f(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object x(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new g(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new h(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z(C3312F c3312f, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new i(c3312f, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    public final M A() {
        return this.f9258c;
    }
}
