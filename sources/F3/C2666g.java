package f3;

import L5.s;
import android.content.Context;
import com.stripe.android.model.n;
import e3.m;
import j2.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import r2.InterfaceC3684d;

/* renamed from: f3.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2666g extends AbstractC2664e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f3.g$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f31052a;

        /* renamed from: c, reason: collision with root package name */
        int f31054c;

        a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31052a = obj;
            this.f31054c |= Integer.MIN_VALUE;
            Object l8 = C2666g.this.l(null, null, null, this);
            if (l8 == Q5.b.e()) {
                return l8;
            }
            return s.a(l8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f3.g$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f31055a;

        /* renamed from: c, reason: collision with root package name */
        int f31057c;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31055a = obj;
            this.f31057c |= Integer.MIN_VALUE;
            Object q8 = C2666g.this.q(null, null, null, this);
            if (q8 == Q5.b.e()) {
                return q8;
            }
            return s.a(q8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f3.g$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f31058a;

        /* renamed from: c, reason: collision with root package name */
        int f31060c;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31058a = obj;
            this.f31060c |= Integer.MIN_VALUE;
            Object s8 = C2666g.this.s(null, null, null, this);
            if (s8 == Q5.b.e()) {
                return s8;
            }
            return s.a(s8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2666g(Context context, final Function0 publishableKeyProvider, m stripeRepository, InterfaceC3684d logger, P5.g workContext) {
        super(context, new I5.a() { // from class: f3.f
            @Override // I5.a
            public final Object get() {
                String y8;
                y8 = C2666g.y(Function0.this);
                return y8;
            }
        }, stripeRepository, logger, workContext, null, 32, null);
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3159y.i(stripeRepository, "stripeRepository");
        AbstractC3159y.i(logger, "logger");
        AbstractC3159y.i(workContext, "workContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String y(Function0 tmp0) {
        AbstractC3159y.i(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // f3.AbstractC2664e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object l(java.lang.String r5, x2.j.c r6, java.lang.String r7, P5.d r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof f3.C2666g.a
            if (r0 == 0) goto L13
            r0 = r8
            f3.g$a r0 = (f3.C2666g.a) r0
            int r1 = r0.f31054c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31054c = r1
            goto L18
        L13:
            f3.g$a r0 = new f3.g$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f31052a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f31054c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r8)
            L5.s r8 = (L5.s) r8
            java.lang.Object r5 = r8.k()
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            L5.t.b(r8)
            e3.m r8 = r4.o()
            r0.f31054c = r3
            java.lang.Object r5 = r8.v(r5, r7, r6, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.C2666g.l(java.lang.String, x2.j$c, java.lang.String, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // f3.AbstractC2664e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object q(java.lang.String r4, x2.j.c r5, java.util.List r6, P5.d r7) {
        /*
            r3 = this;
            boolean r6 = r7 instanceof f3.C2666g.b
            if (r6 == 0) goto L13
            r6 = r7
            f3.g$b r6 = (f3.C2666g.b) r6
            int r0 = r6.f31057c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f31057c = r0
            goto L18
        L13:
            f3.g$b r6 = new f3.g$b
            r6.<init>(r7)
        L18:
            java.lang.Object r7 = r6.f31055a
            java.lang.Object r0 = Q5.b.e()
            int r1 = r6.f31057c
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            L5.t.b(r7)
            L5.s r7 = (L5.s) r7
            java.lang.Object r4 = r7.k()
            goto L47
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            L5.t.b(r7)
            e3.m r7 = r3.o()
            r6.f31057c = r2
            java.lang.Object r4 = r7.t(r4, r5, r6)
            if (r4 != r0) goto L47
            return r0
        L47:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.C2666g.q(java.lang.String, x2.j$c, java.util.List, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // f3.AbstractC2664e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object s(java.lang.String r5, x2.j.c r6, java.util.List r7, P5.d r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof f3.C2666g.c
            if (r0 == 0) goto L13
            r0 = r8
            f3.g$c r0 = (f3.C2666g.c) r0
            int r1 = r0.f31060c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31060c = r1
            goto L18
        L13:
            f3.g$c r0 = new f3.g$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f31058a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f31060c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r8)
            L5.s r8 = (L5.s) r8
            java.lang.Object r5 = r8.k()
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            L5.t.b(r8)
            e3.m r8 = r4.o()
            r0.f31060c = r3
            java.lang.Object r5 = r8.y(r5, r6, r7, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.C2666g.s(java.lang.String, x2.j$c, java.util.List, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f3.AbstractC2664e
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public t m(n stripeIntent, int i8, String str) {
        AbstractC3159y.i(stripeIntent, "stripeIntent");
        return new t(stripeIntent, i8, str);
    }
}
