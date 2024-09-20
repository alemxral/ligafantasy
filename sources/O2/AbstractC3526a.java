package o2;

import L5.I;
import L5.s;
import L5.t;
import X5.n;
import i6.M;
import i6.N;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;

/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3526a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0836a extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f36353a;

        /* renamed from: b, reason: collision with root package name */
        int f36354b;

        C0836a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36353a = obj;
            this.f36354b |= Integer.MIN_VALUE;
            Object a8 = AbstractC3526a.a(null, null, null, this);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return s.a(a8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o2.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f36355a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f36356b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f36357c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f36358d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o2.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0837a extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f36359a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f36360b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ n f36361c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0837a(n nVar, P5.d dVar) {
                super(2, dVar);
                this.f36361c = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                C0837a c0837a = new C0837a(this.f36361c, dVar);
                c0837a.f36360b = obj;
                return c0837a;
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0837a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f36359a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    M m8 = (M) this.f36360b;
                    n nVar = this.f36361c;
                    this.f36359a = 1;
                    obj = nVar.invoke(m8, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n nVar, Function1 function1, P5.d dVar) {
            super(2, dVar);
            this.f36357c = nVar;
            this.f36358d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            b bVar = new b(this.f36357c, this.f36358d, dVar);
            bVar.f36356b = obj;
            return bVar;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            Object e8 = Q5.b.e();
            int i8 = this.f36355a;
            try {
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    n nVar = this.f36357c;
                    s.a aVar = s.f6498b;
                    C0837a c0837a = new C0837a(nVar, null);
                    this.f36355a = 1;
                    obj = N.e(c0837a, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                b8 = s.b(obj);
            } catch (Throwable th) {
                s.a aVar2 = s.f6498b;
                b8 = s.b(t.a(th));
            }
            Function1 function1 = this.f36358d;
            Throwable e9 = s.e(b8);
            if (e9 != null && function1 != null) {
                function1.invoke(e9);
            }
            return s.a(b8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(P5.g r4, kotlin.jvm.functions.Function1 r5, X5.n r6, P5.d r7) {
        /*
            boolean r0 = r7 instanceof o2.AbstractC3526a.C0836a
            if (r0 == 0) goto L13
            r0 = r7
            o2.a$a r0 = (o2.AbstractC3526a.C0836a) r0
            int r1 = r0.f36354b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36354b = r1
            goto L18
        L13:
            o2.a$a r0 = new o2.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f36353a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f36354b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            L5.t.b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            L5.t.b(r7)
            o2.a$b r7 = new o2.a$b
            r2 = 0
            r7.<init>(r6, r5, r2)
            r0.f36354b = r3
            java.lang.Object r7 = i6.AbstractC2825i.g(r4, r7, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            L5.s r7 = (L5.s) r7
            java.lang.Object r4 = r7.k()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.AbstractC3526a.a(P5.g, kotlin.jvm.functions.Function1, X5.n, P5.d):java.lang.Object");
    }
}
