package m6;

import L5.I;
import i6.M;
import java.util.concurrent.atomic.AtomicInteger;
import k6.v;
import kotlin.jvm.functions.Function0;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;

/* loaded from: classes5.dex */
public abstract class k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f35895a;

        /* renamed from: b, reason: collision with root package name */
        Object f35896b;

        /* renamed from: c, reason: collision with root package name */
        int f35897c;

        /* renamed from: d, reason: collision with root package name */
        int f35898d;

        /* renamed from: e, reason: collision with root package name */
        int f35899e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f35900f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f[] f35901g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f35902h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ X5.o f35903i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC3359g f35904j;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: m6.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0827a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f35905a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f[] f35906b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f35907c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f35908d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ k6.d f35909e;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: m6.k$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0828a implements InterfaceC3359g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ k6.d f35910a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ int f35911b;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: m6.k$a$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes5.dex */
                public static final class C0829a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f35912a;

                    /* renamed from: c, reason: collision with root package name */
                    int f35914c;

                    C0829a(P5.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f35912a = obj;
                        this.f35914c |= Integer.MIN_VALUE;
                        return C0828a.this.emit(null, this);
                    }
                }

                C0828a(k6.d dVar, int i8) {
                    this.f35910a = dVar;
                    this.f35911b = i8;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // l6.InterfaceC3359g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, P5.d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof m6.k.a.C0827a.C0828a.C0829a
                        if (r0 == 0) goto L13
                        r0 = r8
                        m6.k$a$a$a$a r0 = (m6.k.a.C0827a.C0828a.C0829a) r0
                        int r1 = r0.f35914c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f35914c = r1
                        goto L18
                    L13:
                        m6.k$a$a$a$a r0 = new m6.k$a$a$a$a
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f35912a
                        java.lang.Object r1 = Q5.b.e()
                        int r2 = r0.f35914c
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        L5.t.b(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        L5.t.b(r8)
                        goto L4d
                    L38:
                        L5.t.b(r8)
                        k6.d r8 = r6.f35910a
                        M5.K r2 = new M5.K
                        int r5 = r6.f35911b
                        r2.<init>(r5, r7)
                        r0.f35914c = r4
                        java.lang.Object r7 = r8.i(r2, r0)
                        if (r7 != r1) goto L4d
                        return r1
                    L4d:
                        r0.f35914c = r3
                        java.lang.Object r7 = i6.g1.a(r0)
                        if (r7 != r1) goto L56
                        return r1
                    L56:
                        L5.I r7 = L5.I.f6474a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: m6.k.a.C0827a.C0828a.emit(java.lang.Object, P5.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0827a(InterfaceC3358f[] interfaceC3358fArr, int i8, AtomicInteger atomicInteger, k6.d dVar, P5.d dVar2) {
                super(2, dVar2);
                this.f35906b = interfaceC3358fArr;
                this.f35907c = i8;
                this.f35908d = atomicInteger;
                this.f35909e = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0827a(this.f35906b, this.f35907c, this.f35908d, this.f35909e, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0827a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AtomicInteger atomicInteger;
                Object e8 = Q5.b.e();
                int i8 = this.f35905a;
                try {
                    if (i8 != 0) {
                        if (i8 == 1) {
                            L5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        L5.t.b(obj);
                        InterfaceC3358f[] interfaceC3358fArr = this.f35906b;
                        int i9 = this.f35907c;
                        InterfaceC3358f interfaceC3358f = interfaceC3358fArr[i9];
                        C0828a c0828a = new C0828a(this.f35909e, i9);
                        this.f35905a = 1;
                        if (interfaceC3358f.collect(c0828a, this) == e8) {
                            return e8;
                        }
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        v.a.a(this.f35909e, null, 1, null);
                    }
                    return I.f6474a;
                } finally {
                    if (this.f35908d.decrementAndGet() == 0) {
                        v.a.a(this.f35909e, null, 1, null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3358f[] interfaceC3358fArr, Function0 function0, X5.o oVar, InterfaceC3359g interfaceC3359g, P5.d dVar) {
            super(2, dVar);
            this.f35901g = interfaceC3358fArr;
            this.f35902h = function0;
            this.f35903i = oVar;
            this.f35904j = interfaceC3359g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            a aVar = new a(this.f35901g, this.f35902h, this.f35903i, this.f35904j, dVar);
            aVar.f35900f = obj;
            return aVar;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00bc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ee A[EDGE_INSN: B:38:0x00ee->B:27:0x00ee BREAK  A[LOOP:0: B:19:0x00c9->B:37:?], SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0134 -> B:10:0x0136). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 313
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: m6.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object a(InterfaceC3359g interfaceC3359g, InterfaceC3358f[] interfaceC3358fArr, Function0 function0, X5.o oVar, P5.d dVar) {
        Object a8 = n.a(new a(interfaceC3358fArr, function0, oVar, interfaceC3359g, null), dVar);
        if (a8 == Q5.b.e()) {
            return a8;
        }
        return I.f6474a;
    }
}
