package l2;

import L5.I;
import L5.t;
import M5.AbstractC1246t;
import b3.C1866a;
import b3.C1868c;
import b3.EnumC1870e;
import i6.AbstractC2829k;
import i6.InterfaceC2855x0;
import i6.M;
import i6.N;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import l2.f;
import l6.InterfaceC3349K;

/* renamed from: l2.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3168c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3167b f33783a;

    /* renamed from: b, reason: collision with root package name */
    private final P5.g f33784b;

    /* renamed from: c, reason: collision with root package name */
    private final P5.g f33785c;

    /* renamed from: d, reason: collision with root package name */
    private final p f33786d;

    /* renamed from: e, reason: collision with root package name */
    private final a f33787e;

    /* renamed from: f, reason: collision with root package name */
    private final Function0 f33788f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f33789g;

    /* renamed from: h, reason: collision with root package name */
    private C3166a f33790h;

    /* renamed from: i, reason: collision with root package name */
    private List f33791i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC2855x0 f33792j;

    /* renamed from: l2.c$a */
    /* loaded from: classes4.dex */
    public interface a {
        void a(List list);
    }

    /* renamed from: l2.c$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33793a;

        static {
            int[] iArr = new int[EnumC1870e.values().length];
            try {
                iArr[EnumC1870e.f14433w.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1870e.f14431u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f33793a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l2.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0779c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f33794a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f.b f33795b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3168c f33796c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l2.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f33797a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3168c f33798b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f33799c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3168c c3168c, List list, P5.d dVar) {
                super(2, dVar);
                this.f33798b = c3168c;
                this.f33799c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f33798b, this.f33799c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f33797a == 0) {
                    t.b(obj);
                    C3168c c3168c = this.f33798b;
                    List list = this.f33799c;
                    if (list == null) {
                        list = AbstractC1246t.m();
                    }
                    c3168c.l(list);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0779c(f.b bVar, C3168c c3168c, P5.d dVar) {
            super(2, dVar);
            this.f33795b = bVar;
            this.f33796c = c3168c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0779c(this.f33795b, this.f33796c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0779c) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r6.f33794a
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                L5.t.b(r7)
                goto L55
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                L5.t.b(r7)
                goto L3b
            L1f:
                L5.t.b(r7)
                l2.f$b r7 = r6.f33795b
                l2.a r7 = r7.d()
                if (r7 == 0) goto L3e
                l2.c r7 = r6.f33796c
                l2.b r7 = l2.C3168c.a(r7)
                l2.f$b r1 = r6.f33795b
                r6.f33794a = r4
                java.lang.Object r7 = r7.b(r1, r6)
                if (r7 != r0) goto L3b
                return r0
            L3b:
                java.util.List r7 = (java.util.List) r7
                goto L3f
            L3e:
                r7 = r2
            L3f:
                l2.c r1 = r6.f33796c
                P5.g r1 = l2.C3168c.b(r1)
                l2.c$c$a r4 = new l2.c$c$a
                l2.c r5 = r6.f33796c
                r4.<init>(r5, r7, r2)
                r6.f33794a = r3
                java.lang.Object r7 = i6.AbstractC2825i.g(r1, r4, r6)
                if (r7 != r0) goto L55
                return r0
            L55:
                L5.I r7 = L5.I.f6474a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: l2.C3168c.C0779c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C3168c(InterfaceC3167b cardAccountRangeRepository, P5.g uiContext, P5.g workContext, p staticCardAccountRanges, a accountRangeResultListener, Function0 isCbcEligible) {
        AbstractC3159y.i(cardAccountRangeRepository, "cardAccountRangeRepository");
        AbstractC3159y.i(uiContext, "uiContext");
        AbstractC3159y.i(workContext, "workContext");
        AbstractC3159y.i(staticCardAccountRanges, "staticCardAccountRanges");
        AbstractC3159y.i(accountRangeResultListener, "accountRangeResultListener");
        AbstractC3159y.i(isCbcEligible, "isCbcEligible");
        this.f33783a = cardAccountRangeRepository;
        this.f33784b = uiContext;
        this.f33785c = workContext;
        this.f33786d = staticCardAccountRanges;
        this.f33787e = accountRangeResultListener;
        this.f33788f = isCbcEligible;
        this.f33789g = cardAccountRangeRepository.a();
        this.f33791i = AbstractC1246t.m();
    }

    private final boolean j(f.b bVar) {
        boolean z8;
        C1866a d8;
        C1868c b8;
        if (d() != null && bVar.d() != null && (((d8 = d()) == null || (b8 = d8.b()) == null || b8.b(bVar)) && AbstractC3159y.d(bVar.d(), this.f33790h))) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.f33790h = bVar.d();
        return z8;
    }

    private final boolean k(List list) {
        EnumC1870e enumC1870e;
        int i8;
        C1866a c1866a = (C1866a) AbstractC1246t.o0(list);
        if (c1866a != null) {
            enumC1870e = c1866a.c();
        } else {
            enumC1870e = null;
        }
        if (enumC1870e == null) {
            i8 = -1;
        } else {
            i8 = b.f33793a[enumC1870e.ordinal()];
        }
        if (i8 == 1 || i8 == 2) {
            return true;
        }
        return false;
    }

    public final void c() {
        InterfaceC2855x0 interfaceC2855x0 = this.f33792j;
        if (interfaceC2855x0 != null) {
            InterfaceC2855x0.a.a(interfaceC2855x0, null, 1, null);
        }
        this.f33792j = null;
    }

    public final C1866a d() {
        return (C1866a) AbstractC1246t.o0(this.f33791i);
    }

    public final List e() {
        return this.f33791i;
    }

    public final p f() {
        return this.f33786d;
    }

    public final InterfaceC3349K g() {
        return this.f33789g;
    }

    public final void h(f.b cardNumber) {
        List m8;
        AbstractC3159y.i(cardNumber, "cardNumber");
        boolean booleanValue = ((Boolean) this.f33788f.invoke()).booleanValue();
        if (booleanValue && cardNumber.f() < 8) {
            l(AbstractC1246t.m());
            return;
        }
        if (((Boolean) this.f33788f.invoke()).booleanValue()) {
            m8 = g.f33812a.a(cardNumber);
        } else {
            m8 = AbstractC1246t.m();
        }
        if (!m8.isEmpty()) {
            l(m8);
            return;
        }
        List b8 = this.f33786d.b(cardNumber);
        if (booleanValue) {
            i(cardNumber);
        } else if (!b8.isEmpty() && !k(b8)) {
            l(b8);
        } else {
            i(cardNumber);
        }
    }

    public final /* synthetic */ void i(f.b cardNumber) {
        InterfaceC2855x0 d8;
        AbstractC3159y.i(cardNumber, "cardNumber");
        if (j(cardNumber)) {
            c();
            this.f33791i = AbstractC1246t.m();
            d8 = AbstractC2829k.d(N.a(this.f33785c), null, null, new C0779c(cardNumber, this, null), 3, null);
            this.f33792j = d8;
        }
    }

    public final void l(List accountRanges) {
        AbstractC3159y.i(accountRanges, "accountRanges");
        this.f33791i = accountRanges;
        this.f33787e.a(accountRanges);
    }
}
