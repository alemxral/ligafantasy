package com.stripe.android.paymentsheet;

import K2.b;
import L5.I;
import L5.InterfaceC1227k;
import N2.a;
import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.SavedStateHandle;
import i6.AbstractC2829k;
import i6.C2842q0;
import i6.M;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import l6.AbstractC3340B;
import l6.AbstractC3351M;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import p3.AbstractC3601c;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final com.stripe.android.link.a f25963a;

    /* renamed from: b, reason: collision with root package name */
    private final K2.e f25964b;

    /* renamed from: c, reason: collision with root package name */
    private final SavedStateHandle f25965c;

    /* renamed from: d, reason: collision with root package name */
    private final L2.d f25966d;

    /* renamed from: e, reason: collision with root package name */
    private final l6.u f25967e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3358f f25968f;

    /* renamed from: g, reason: collision with root package name */
    private final l6.v f25969g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3349K f25970h;

    /* renamed from: i, reason: collision with root package name */
    private final l6.v f25971i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3349K f25972j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC1227k f25973k;

    /* loaded from: classes4.dex */
    public static abstract class a {

        /* renamed from: com.stripe.android.paymentsheet.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0610a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0610a f25974a = new C0610a();

            private C0610a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0610a);
            }

            public int hashCode() {
                return -1384461919;
            }

            public String toString() {
                return "Cancelled";
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f25975a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 870884921;
            }

            public String toString() {
                return "CompleteWithoutLink";
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends a {

            /* renamed from: b, reason: collision with root package name */
            public static final int f25976b = AbstractC3601c.f37004b;

            /* renamed from: a, reason: collision with root package name */
            private final AbstractC3601c f25977a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(AbstractC3601c result) {
                super(null);
                AbstractC3159y.i(result, "result");
                this.f25977a = result;
            }

            public final AbstractC3601c a() {
                return this.f25977a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && AbstractC3159y.d(this.f25977a, ((c) obj).f25977a);
            }

            public int hashCode() {
                return this.f25977a.hashCode();
            }

            public String toString() {
                return "CompletedWithPaymentResult(result=" + this.f25977a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f25978a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -1190189758;
            }

            public String toString() {
                return "Launched";
            }
        }

        /* loaded from: classes4.dex */
        public static final class e extends a {

            /* renamed from: a, reason: collision with root package name */
            private final AbstractC3991f f25979a;

            public e(AbstractC3991f abstractC3991f) {
                super(null);
                this.f25979a = abstractC3991f;
            }

            public final AbstractC3991f a() {
                return this.f25979a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && AbstractC3159y.d(this.f25979a, ((e) obj).f25979a);
            }

            public int hashCode() {
                AbstractC3991f abstractC3991f = this.f25979a;
                if (abstractC3991f == null) {
                    return 0;
                }
                return abstractC3991f.hashCode();
            }

            public String toString() {
                return "PaymentDetailsCollected(paymentSelection=" + this.f25979a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class f extends a {

            /* renamed from: b, reason: collision with root package name */
            public static final int f25980b = com.stripe.android.model.o.f24394u;

            /* renamed from: a, reason: collision with root package name */
            private final com.stripe.android.model.o f25981a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(com.stripe.android.model.o paymentMethod) {
                super(null);
                AbstractC3159y.i(paymentMethod, "paymentMethod");
                this.f25981a = paymentMethod;
            }

            public final com.stripe.android.model.o a() {
                return this.f25981a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && AbstractC3159y.d(this.f25981a, ((f) obj).f25981a);
            }

            public int hashCode() {
                return this.f25981a.hashCode();
            }

            public String toString() {
                return "PaymentMethodCollected(paymentMethod=" + this.f25981a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class g extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final g f25982a = new g();

            private g() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public int hashCode() {
                return -66772493;
            }

            public String toString() {
                return "Ready";
            }
        }

        /* renamed from: com.stripe.android.paymentsheet.h$a$h, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0611h extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0611h f25983a = new C0611h();

            private C0611h() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0611h);
            }

            public int hashCode() {
                return 1573500113;
            }

            public String toString() {
                return "Started";
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25984a;

        static {
            int[] iArr = new int[O2.a.values().length];
            try {
                iArr[O2.a.f7747a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[O2.a.f7749c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[O2.a.f7748b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[O2.a.f7750d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[O2.a.f7751e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f25984a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f25985a;

        /* renamed from: b, reason: collision with root package name */
        Object f25986b;

        /* renamed from: c, reason: collision with root package name */
        Object f25987c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f25988d;

        /* renamed from: f, reason: collision with root package name */
        int f25990f;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25988d = obj;
            this.f25990f |= Integer.MIN_VALUE;
            return h.this.b(null, null, null, false, this);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0151a f25991a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a.InterfaceC0151a interfaceC0151a) {
            super(0);
            this.f25991a = interfaceC0151a;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M2.c invoke() {
            return this.f25991a.build().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f25992a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K2.d f25994c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(K2.d dVar, P5.d dVar2) {
            super(2, dVar2);
            this.f25994c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f25994c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f25992a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                    ((L5.s) obj).k();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                K2.e e9 = h.this.e();
                K2.d dVar = this.f25994c;
                this.f25992a = 1;
                if (e9.f(dVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f25995a;

        /* renamed from: b, reason: collision with root package name */
        Object f25996b;

        /* renamed from: c, reason: collision with root package name */
        Object f25997c;

        /* renamed from: d, reason: collision with root package name */
        Object f25998d;

        /* renamed from: e, reason: collision with root package name */
        Object f25999e;

        /* renamed from: f, reason: collision with root package name */
        boolean f26000f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f26001g;

        /* renamed from: i, reason: collision with root package name */
        int f26003i;

        f(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26001g = obj;
            this.f26003i |= Integer.MIN_VALUE;
            return h.this.k(null, null, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class g extends C3156v implements Function1 {
        g(Object obj) {
            super(1, obj, h.class, "onLinkActivityResult", "onLinkActivityResult(Lcom/stripe/android/link/LinkActivityResult;)V", 0);
        }

        public final void d(K2.b p02) {
            AbstractC3159y.i(p02, "p0");
            ((h) this.receiver).j(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((K2.b) obj);
            return I.f6474a;
        }
    }

    public h(com.stripe.android.link.a linkLauncher, K2.e linkConfigurationCoordinator, SavedStateHandle savedStateHandle, L2.d linkStore, a.InterfaceC0151a linkAnalyticsComponentBuilder) {
        AbstractC3159y.i(linkLauncher, "linkLauncher");
        AbstractC3159y.i(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        AbstractC3159y.i(savedStateHandle, "savedStateHandle");
        AbstractC3159y.i(linkStore, "linkStore");
        AbstractC3159y.i(linkAnalyticsComponentBuilder, "linkAnalyticsComponentBuilder");
        this.f25963a = linkLauncher;
        this.f25964b = linkConfigurationCoordinator;
        this.f25965c = savedStateHandle;
        this.f25966d = linkStore;
        l6.u b8 = AbstractC3340B.b(1, 5, null, 4, null);
        this.f25967e = b8;
        this.f25968f = b8;
        l6.v a8 = AbstractC3351M.a(null);
        this.f25969g = a8;
        this.f25970h = a8;
        l6.v a9 = AbstractC3351M.a(null);
        this.f25971i = a9;
        this.f25972j = AbstractC3360h.b(a9);
        this.f25973k = L5.l.b(new d(linkAnalyticsComponentBuilder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010e, code lost:
    
        if (r8 == null) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0146 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(K2.d r27, com.stripe.android.model.p r28, y3.AbstractC3991f.a r29, boolean r30, P5.d r31) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.h.b(K2.d, com.stripe.android.model.p, y3.f$a, boolean, P5.d):java.lang.Object");
    }

    private final AbstractC3601c c(K2.b bVar) {
        if (bVar instanceof b.C0112b) {
            return AbstractC3601c.C0846c.f37006c;
        }
        if (bVar instanceof b.a) {
            return AbstractC3601c.a.f37005c;
        }
        if (bVar instanceof b.c) {
            return new AbstractC3601c.d(((b.c) bVar).b());
        }
        throw new L5.p();
    }

    private final M2.c d() {
        return (M2.c) this.f25973k.getValue();
    }

    public final K2.e e() {
        return this.f25964b;
    }

    public final InterfaceC3358f f() {
        return this.f25968f;
    }

    public final InterfaceC3349K g() {
        return this.f25970h;
    }

    public final void h() {
        K2.d dVar = (K2.d) this.f25971i.getValue();
        if (dVar == null) {
            return;
        }
        this.f25963a.b(dVar);
        this.f25967e.d(a.d.f25978a);
    }

    public final void i() {
        K2.d dVar = (K2.d) this.f25972j.getValue();
        if (dVar != null) {
            AbstractC2829k.d(C2842q0.f31785a, null, null, new e(dVar, null), 3, null);
        }
    }

    public final void j(K2.b result) {
        b.C0112b c0112b;
        boolean z8;
        AbstractC3159y.i(result, "result");
        com.stripe.android.model.o oVar = null;
        if (result instanceof b.C0112b) {
            c0112b = (b.C0112b) result;
        } else {
            c0112b = null;
        }
        if (c0112b != null) {
            oVar = c0112b.v();
        }
        if ((result instanceof b.a) && ((b.a) result).b() == b.a.EnumC0111b.f5870a) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (oVar != null) {
            this.f25967e.d(new a.f(oVar));
            this.f25966d.c();
        } else {
            if (z8) {
                this.f25967e.d(a.C0610a.f25974a);
                return;
            }
            this.f25967e.d(new a.c(c(result)));
            this.f25966d.c();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(T2.m r19, y3.AbstractC3991f r20, boolean r21, P5.d r22) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.h.k(T2.m, y3.f, boolean, P5.d):java.lang.Object");
    }

    public final void l(ActivityResultCaller activityResultCaller) {
        AbstractC3159y.i(activityResultCaller, "activityResultCaller");
        this.f25963a.c(activityResultCaller, new g(this));
    }

    public final void m(I3.g gVar) {
        boolean z8;
        l6.v vVar = this.f25969g;
        if (gVar != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        vVar.setValue(Boolean.valueOf(z8));
        if (gVar == null) {
            return;
        }
        this.f25971i.setValue(gVar.b());
    }

    public final void n() {
        this.f25963a.e();
    }
}
