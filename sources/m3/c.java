package M3;

import L5.I;
import L5.t;
import P5.d;
import X5.o;
import X5.q;
import X5.s;
import b4.C1880b;
import b4.n;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.u;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import q3.w;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;
import y3.AbstractC3991f;
import z3.InterfaceC4021c;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final u.g f6950a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6951b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3349K f6952c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f6953d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3349K f6954e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3349K f6955f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f6956g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3349K f6957h;

    /* renamed from: i, reason: collision with root package name */
    private final Function0 f6958i;

    /* loaded from: classes4.dex */
    public static final class a extends l implements o {

        /* renamed from: a, reason: collision with root package name */
        int f6959a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f6960b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f6961c;

        public a(d dVar) {
            super(3, dVar);
        }

        @Override // X5.o
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3359g interfaceC3359g, Object obj, d dVar) {
            a aVar = new a(dVar);
            aVar.f6960b = interfaceC3359g;
            aVar.f6961c = obj;
            return aVar.invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f6959a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.f6960b;
                InterfaceC3358f interfaceC3358f = (InterfaceC3358f) this.f6961c;
                this.f6959a = 1;
                if (AbstractC3360h.r(interfaceC3359g, interfaceC3358f, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements s {

        /* renamed from: a, reason: collision with root package name */
        int f6962a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f6963b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f6964c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f6965d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f6966e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f6967f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ boolean f6968g;

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3358f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f f6970a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PrimaryButton.b f6971b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f6972c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C1880b f6973d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f6974e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC3991f f6975f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC4021c f6976g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f6977h;

            /* renamed from: M3.c$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0145a implements InterfaceC3359g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3359g f6978a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ PrimaryButton.b f6979b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ c f6980c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C1880b f6981d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ boolean f6982e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ AbstractC3991f f6983f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ InterfaceC4021c f6984g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ boolean f6985h;

                /* renamed from: M3.c$b$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0146a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f6986a;

                    /* renamed from: b, reason: collision with root package name */
                    int f6987b;

                    public C0146a(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f6986a = obj;
                        this.f6987b |= Integer.MIN_VALUE;
                        return C0145a.this.emit(null, this);
                    }
                }

                public C0145a(InterfaceC3359g interfaceC3359g, PrimaryButton.b bVar, c cVar, C1880b c1880b, boolean z8, AbstractC3991f abstractC3991f, InterfaceC4021c interfaceC4021c, boolean z9) {
                    this.f6978a = interfaceC3359g;
                    this.f6979b = bVar;
                    this.f6980c = cVar;
                    this.f6981d = c1880b;
                    this.f6982e = z8;
                    this.f6983f = abstractC3991f;
                    this.f6984g = interfaceC4021c;
                    this.f6985h = z9;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // l6.InterfaceC3359g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r11, P5.d r12) {
                    /*
                        r10 = this;
                        boolean r0 = r12 instanceof M3.c.b.a.C0145a.C0146a
                        if (r0 == 0) goto L13
                        r0 = r12
                        M3.c$b$a$a$a r0 = (M3.c.b.a.C0145a.C0146a) r0
                        int r1 = r0.f6987b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f6987b = r1
                        goto L18
                    L13:
                        M3.c$b$a$a$a r0 = new M3.c$b$a$a$a
                        r0.<init>(r12)
                    L18:
                        java.lang.Object r12 = r0.f6986a
                        java.lang.Object r1 = Q5.b.e()
                        int r2 = r0.f6987b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        L5.t.b(r12)
                        goto L90
                    L29:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r12)
                        throw r11
                    L31:
                        L5.t.b(r12)
                        l6.g r12 = r10.f6978a
                        z3.a r11 = (z3.C4019a) r11
                        com.stripe.android.paymentsheet.ui.PrimaryButton$b r2 = r10.f6979b
                        if (r2 == 0) goto L3d
                        goto L87
                    L3d:
                        com.stripe.android.paymentsheet.ui.PrimaryButton$b r2 = new com.stripe.android.paymentsheet.ui.PrimaryButton$b
                        z3.a$a r4 = r11.a()
                        if (r4 == 0) goto L4b
                        y2.b r4 = r4.a()
                        if (r4 != 0) goto L53
                    L4b:
                        M3.c r4 = r10.f6980c
                        b4.b r5 = r10.f6981d
                        y2.b r4 = M3.c.a(r4, r5)
                    L53:
                        M3.c r5 = r10.f6980c
                        kotlin.jvm.functions.Function0 r5 = M3.c.d(r5)
                        boolean r6 = r10.f6982e
                        if (r6 == 0) goto L6f
                        y3.f r6 = r10.f6983f
                        if (r6 == 0) goto L6f
                        M3.c r7 = r10.f6980c
                        z3.c r8 = r10.f6984g
                        boolean r9 = r10.f6985h
                        boolean r6 = M3.c.c(r7, r8, r9, r6)
                        if (r6 == 0) goto L6f
                        r6 = 1
                        goto L70
                    L6f:
                        r6 = 0
                    L70:
                        z3.a$a r7 = r11.a()
                        if (r7 == 0) goto L7b
                        boolean r7 = r7.b()
                        goto L7c
                    L7b:
                        r7 = 1
                    L7c:
                        r2.<init>(r4, r5, r6, r7)
                        boolean r11 = r11.b()
                        if (r11 == 0) goto L86
                        goto L87
                    L86:
                        r2 = 0
                    L87:
                        r0.f6987b = r3
                        java.lang.Object r11 = r12.emit(r2, r0)
                        if (r11 != r1) goto L90
                        return r1
                    L90:
                        L5.I r11 = L5.I.f6474a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: M3.c.b.a.C0145a.emit(java.lang.Object, P5.d):java.lang.Object");
                }
            }

            public a(InterfaceC3358f interfaceC3358f, PrimaryButton.b bVar, c cVar, C1880b c1880b, boolean z8, AbstractC3991f abstractC3991f, InterfaceC4021c interfaceC4021c, boolean z9) {
                this.f6970a = interfaceC3358f;
                this.f6971b = bVar;
                this.f6972c = cVar;
                this.f6973d = c1880b;
                this.f6974e = z8;
                this.f6975f = abstractC3991f;
                this.f6976g = interfaceC4021c;
                this.f6977h = z9;
            }

            @Override // l6.InterfaceC3358f
            public Object collect(InterfaceC3359g interfaceC3359g, d dVar) {
                Object collect = this.f6970a.collect(new C0145a(interfaceC3359g, this.f6971b, this.f6972c, this.f6973d, this.f6974e, this.f6975f, this.f6976g, this.f6977h), dVar);
                if (collect == Q5.b.e()) {
                    return collect;
                }
                return I.f6474a;
            }
        }

        b(d dVar) {
            super(7, dVar);
        }

        public final Object g(InterfaceC4021c interfaceC4021c, boolean z8, C1880b c1880b, AbstractC3991f abstractC3991f, PrimaryButton.b bVar, boolean z9, d dVar) {
            b bVar2 = new b(dVar);
            bVar2.f6963b = interfaceC4021c;
            bVar2.f6964c = z8;
            bVar2.f6965d = c1880b;
            bVar2.f6966e = abstractC3991f;
            bVar2.f6967f = bVar;
            bVar2.f6968g = z9;
            return bVar2.invokeSuspend(I.f6474a);
        }

        @Override // X5.s
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            return g((InterfaceC4021c) obj, ((Boolean) obj2).booleanValue(), (C1880b) obj3, (AbstractC3991f) obj4, (PrimaryButton.b) obj5, ((Boolean) obj6).booleanValue(), (d) obj7);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f6962a == 0) {
                t.b(obj);
                InterfaceC4021c interfaceC4021c = (InterfaceC4021c) this.f6963b;
                boolean z8 = this.f6964c;
                C1880b c1880b = (C1880b) this.f6965d;
                AbstractC3991f abstractC3991f = (AbstractC3991f) this.f6966e;
                return new a(interfaceC4021c.a(), (PrimaryButton.b) this.f6967f, c.this, c1880b, z8, abstractC3991f, interfaceC4021c, this.f6968g);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0147c extends l implements q {

        /* renamed from: a, reason: collision with root package name */
        int f6989a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f6990b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f6991c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f6992d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f6993e;

        C0147c(d dVar) {
            super(5, dVar);
        }

        public final Object g(InterfaceC4021c interfaceC4021c, boolean z8, AbstractC3991f abstractC3991f, PrimaryButton.b bVar, d dVar) {
            C0147c c0147c = new C0147c(dVar);
            c0147c.f6990b = interfaceC4021c;
            c0147c.f6991c = z8;
            c0147c.f6992d = abstractC3991f;
            c0147c.f6993e = bVar;
            return c0147c.invokeSuspend(I.f6474a);
        }

        @Override // X5.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return g((InterfaceC4021c) obj, ((Boolean) obj2).booleanValue(), (AbstractC3991f) obj3, (PrimaryButton.b) obj4, (d) obj5);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            Q5.b.e();
            if (this.f6989a == 0) {
                t.b(obj);
                InterfaceC4021c interfaceC4021c = (InterfaceC4021c) this.f6990b;
                boolean z9 = this.f6991c;
                AbstractC3991f abstractC3991f = (AbstractC3991f) this.f6992d;
                PrimaryButton.b bVar = (PrimaryButton.b) this.f6993e;
                if (bVar == null) {
                    InterfaceC3983b f8 = c.this.f();
                    Function0 function0 = c.this.f6958i;
                    if (z9 && abstractC3991f != null) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    PrimaryButton.b bVar2 = new PrimaryButton.b(f8, function0, z8, false);
                    if (!interfaceC4021c.e()) {
                        if (abstractC3991f == null || !abstractC3991f.b()) {
                            return null;
                        }
                        return bVar2;
                    }
                    return bVar2;
                }
                return bVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public c(u.g config, boolean z8, InterfaceC3349K currentScreenFlow, InterfaceC3349K buttonsEnabledFlow, InterfaceC3349K amountFlow, InterfaceC3349K selectionFlow, InterfaceC3349K customPrimaryButtonUiStateFlow, InterfaceC3349K cvcCompleteFlow, Function0 onClick) {
        AbstractC3159y.i(config, "config");
        AbstractC3159y.i(currentScreenFlow, "currentScreenFlow");
        AbstractC3159y.i(buttonsEnabledFlow, "buttonsEnabledFlow");
        AbstractC3159y.i(amountFlow, "amountFlow");
        AbstractC3159y.i(selectionFlow, "selectionFlow");
        AbstractC3159y.i(customPrimaryButtonUiStateFlow, "customPrimaryButtonUiStateFlow");
        AbstractC3159y.i(cvcCompleteFlow, "cvcCompleteFlow");
        AbstractC3159y.i(onClick, "onClick");
        this.f6950a = config;
        this.f6951b = z8;
        this.f6952c = currentScreenFlow;
        this.f6953d = buttonsEnabledFlow;
        this.f6954e = amountFlow;
        this.f6955f = selectionFlow;
        this.f6956g = customPrimaryButtonUiStateFlow;
        this.f6957h = cvcCompleteFlow;
        this.f6958i = onClick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3983b e(C1880b c1880b) {
        InterfaceC3983b a8;
        InterfaceC3983b b8;
        String L8 = this.f6950a.L();
        if (L8 == null || (b8 = AbstractC3984c.b(L8)) == null) {
            if (this.f6951b) {
                InterfaceC3983b a9 = AbstractC3984c.a(w.f37424S);
                if (c1880b == null || (a8 = c1880b.b()) == null) {
                    return a9;
                }
            } else {
                a8 = AbstractC3984c.a(n.f14676C0);
            }
            return a8;
        }
        return b8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3983b f() {
        InterfaceC3983b b8;
        String L8 = this.f6950a.L();
        if (L8 == null || (b8 = AbstractC3984c.b(L8)) == null) {
            return AbstractC3984c.a(n.f14729o);
        }
        return b8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g(InterfaceC4021c interfaceC4021c, boolean z8, AbstractC3991f abstractC3991f) {
        InterfaceC4021c.j jVar;
        InterfaceC4021c.j.b bVar;
        AbstractC3991f.C0916f c0916f;
        com.stripe.android.model.o v8;
        o.p pVar = null;
        if (interfaceC4021c instanceof InterfaceC4021c.j) {
            jVar = (InterfaceC4021c.j) interfaceC4021c;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            bVar = jVar.w();
        } else {
            bVar = null;
        }
        if (bVar instanceof InterfaceC4021c.j.b.C0928b) {
            if (abstractC3991f instanceof AbstractC3991f.C0916f) {
                c0916f = (AbstractC3991f.C0916f) abstractC3991f;
            } else {
                c0916f = null;
            }
            if (c0916f != null && (v8 = c0916f.v()) != null) {
                pVar = v8.f24399e;
            }
            if (pVar == o.p.f24519i) {
                return z8;
            }
        }
        return true;
    }

    public final InterfaceC3358f h() {
        return AbstractC3360h.K(K3.c.a(this.f6952c, this.f6953d, this.f6954e, this.f6955f, this.f6956g, this.f6957h, new b(null)), new a(null));
    }

    public final InterfaceC3358f i() {
        return AbstractC3360h.k(this.f6952c, this.f6953d, this.f6955f, this.f6956g, new C0147c(null));
    }
}
