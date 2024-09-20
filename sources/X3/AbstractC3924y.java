package x3;

import J3.InterfaceC1211t;
import N2.a;
import N2.b;
import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentsheet.C2432a;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.e;
import e4.C2604d0;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import r2.InterfaceC3684d;
import u2.C3801a;
import u3.InterfaceC3802a;
import x2.C3875e;
import x3.Y;
import x3.h0;

/* renamed from: x3.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3924y {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.y$a */
    /* loaded from: classes4.dex */
    public static final class a implements Y.a {

        /* renamed from: a, reason: collision with root package name */
        private Application f39400a;

        private a() {
        }

        @Override // x3.Y.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b(Application application) {
            this.f39400a = (Application) u5.h.b(application);
            return this;
        }

        @Override // x3.Y.a
        public Y build() {
            u5.h.a(this.f39400a, Application.class);
            return new f(new J2.f(), new u2.d(), new C3801a(), this.f39400a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.y$b */
    /* loaded from: classes4.dex */
    public static final class b implements a.InterfaceC0151a {

        /* renamed from: a, reason: collision with root package name */
        private final f f39401a;

        @Override // N2.a.InterfaceC0151a
        public N2.a build() {
            return new c(this.f39401a);
        }

        private b(f fVar) {
            this.f39401a = fVar;
        }
    }

    /* renamed from: x3.y$c */
    /* loaded from: classes4.dex */
    private static final class c implements N2.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f39402a;

        /* renamed from: b, reason: collision with root package name */
        private final c f39403b;

        /* renamed from: c, reason: collision with root package name */
        private u5.i f39404c;

        /* renamed from: d, reason: collision with root package name */
        private u5.i f39405d;

        private void b() {
            M2.b a8 = M2.b.a(this.f39402a.f39436g, this.f39402a.f39441l, this.f39402a.f39449t, this.f39402a.f39435f, this.f39402a.f39434e, this.f39402a.f39442m);
            this.f39404c = a8;
            this.f39405d = u5.d.c(a8);
        }

        @Override // N2.a
        public M2.c a() {
            return new M2.c((M2.e) this.f39405d.get());
        }

        private c(f fVar) {
            this.f39403b = this;
            this.f39402a = fVar;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.y$d */
    /* loaded from: classes4.dex */
    public static final class d implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f39406a;

        /* renamed from: b, reason: collision with root package name */
        private K2.d f39407b;

        @Override // N2.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(K2.d dVar) {
            this.f39407b = (K2.d) u5.h.b(dVar);
            return this;
        }

        @Override // N2.b.a
        public N2.b build() {
            u5.h.a(this.f39407b, K2.d.class);
            return new e(this.f39406a, this.f39407b);
        }

        private d(f fVar) {
            this.f39406a = fVar;
        }
    }

    /* renamed from: x3.y$e */
    /* loaded from: classes4.dex */
    private static final class e extends N2.b {

        /* renamed from: a, reason: collision with root package name */
        private final K2.d f39408a;

        /* renamed from: b, reason: collision with root package name */
        private final f f39409b;

        /* renamed from: c, reason: collision with root package name */
        private final e f39410c;

        /* renamed from: d, reason: collision with root package name */
        private u5.i f39411d;

        /* renamed from: e, reason: collision with root package name */
        private u5.i f39412e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f39413f;

        /* renamed from: g, reason: collision with root package name */
        private u5.i f39414g;

        /* renamed from: h, reason: collision with root package name */
        private u5.i f39415h;

        /* renamed from: i, reason: collision with root package name */
        private u5.i f39416i;

        /* renamed from: j, reason: collision with root package name */
        private T2.d f39417j;

        /* renamed from: k, reason: collision with root package name */
        private u5.i f39418k;

        private void d(K2.d dVar) {
            this.f39411d = u5.f.a(dVar);
            this.f39412e = u5.d.c(N2.f.a(this.f39409b.f39434e, this.f39409b.f39435f));
            this.f39413f = u5.d.c(P2.b.a(this.f39409b.f39439j, this.f39409b.f39428J, this.f39409b.f39446q, this.f39412e, this.f39409b.f39435f, this.f39409b.f39429K, this.f39409b.f39449t));
            M2.b a8 = M2.b.a(this.f39409b.f39436g, this.f39409b.f39441l, this.f39409b.f39449t, this.f39409b.f39435f, this.f39409b.f39434e, this.f39409b.f39442m);
            this.f39414g = a8;
            u5.i c8 = u5.d.c(a8);
            this.f39415h = c8;
            u5.i c9 = u5.d.c(L2.c.a(this.f39411d, this.f39413f, c8, this.f39409b.f39449t));
            this.f39416i = c9;
            T2.d a9 = T2.d.a(this.f39411d, c9, this.f39415h, this.f39409b.f39434e);
            this.f39417j = a9;
            this.f39418k = N2.d.b(a9);
        }

        @Override // N2.b
        public K2.d a() {
            return this.f39408a;
        }

        @Override // N2.b
        public N2.c b() {
            return (N2.c) this.f39418k.get();
        }

        @Override // N2.b
        public L2.b c() {
            return (L2.b) this.f39416i.get();
        }

        private e(f fVar, K2.d dVar) {
            this.f39410c = this;
            this.f39409b = fVar;
            this.f39408a = dVar;
            d(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.y$f */
    /* loaded from: classes4.dex */
    public static final class f implements Y {

        /* renamed from: A, reason: collision with root package name */
        private u5.i f39419A;

        /* renamed from: B, reason: collision with root package name */
        private u5.i f39420B;

        /* renamed from: C, reason: collision with root package name */
        private u5.i f39421C;

        /* renamed from: D, reason: collision with root package name */
        private u5.i f39422D;

        /* renamed from: E, reason: collision with root package name */
        private u5.i f39423E;

        /* renamed from: F, reason: collision with root package name */
        private u5.i f39424F;

        /* renamed from: G, reason: collision with root package name */
        private u5.i f39425G;

        /* renamed from: H, reason: collision with root package name */
        private u5.i f39426H;

        /* renamed from: I, reason: collision with root package name */
        private u5.i f39427I;

        /* renamed from: J, reason: collision with root package name */
        private u5.i f39428J;

        /* renamed from: K, reason: collision with root package name */
        private u5.i f39429K;

        /* renamed from: a, reason: collision with root package name */
        private final Application f39430a;

        /* renamed from: b, reason: collision with root package name */
        private final f f39431b;

        /* renamed from: c, reason: collision with root package name */
        private u5.i f39432c;

        /* renamed from: d, reason: collision with root package name */
        private u5.i f39433d;

        /* renamed from: e, reason: collision with root package name */
        private u5.i f39434e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f39435f;

        /* renamed from: g, reason: collision with root package name */
        private u5.i f39436g;

        /* renamed from: h, reason: collision with root package name */
        private u5.i f39437h;

        /* renamed from: i, reason: collision with root package name */
        private u5.i f39438i;

        /* renamed from: j, reason: collision with root package name */
        private u5.i f39439j;

        /* renamed from: k, reason: collision with root package name */
        private u5.i f39440k;

        /* renamed from: l, reason: collision with root package name */
        private u5.i f39441l;

        /* renamed from: m, reason: collision with root package name */
        private u5.i f39442m;

        /* renamed from: n, reason: collision with root package name */
        private u5.i f39443n;

        /* renamed from: o, reason: collision with root package name */
        private u5.i f39444o;

        /* renamed from: p, reason: collision with root package name */
        private u5.i f39445p;

        /* renamed from: q, reason: collision with root package name */
        private u5.i f39446q;

        /* renamed from: r, reason: collision with root package name */
        private u5.i f39447r;

        /* renamed from: s, reason: collision with root package name */
        private u5.i f39448s;

        /* renamed from: t, reason: collision with root package name */
        private u5.i f39449t;

        /* renamed from: u, reason: collision with root package name */
        private u5.i f39450u;

        /* renamed from: v, reason: collision with root package name */
        private u5.i f39451v;

        /* renamed from: w, reason: collision with root package name */
        private u5.i f39452w;

        /* renamed from: x, reason: collision with root package name */
        private u5.i f39453x;

        /* renamed from: y, reason: collision with root package name */
        private u5.i f39454y;

        /* renamed from: z, reason: collision with root package name */
        private u5.i f39455z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x3.y$f$a */
        /* loaded from: classes4.dex */
        public class a implements u5.i {
            a() {
            }

            @Override // I5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b.a get() {
                return new d(f.this.f39431b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x3.y$f$b */
        /* loaded from: classes4.dex */
        public class b implements u5.i {
            b() {
            }

            @Override // I5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a.InterfaceC0151a get() {
                return new b(f.this.f39431b);
            }
        }

        private C3875e F() {
            return C3892N.c(this.f39430a, this.f39438i);
        }

        private x2.m G() {
            return new x2.m((InterfaceC3684d) this.f39434e.get(), (P5.g) this.f39435f.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public l2.j H() {
            return new l2.j(this.f39430a, G());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C2432a I() {
            return new C2432a(P(), ((Boolean) this.f39425G.get()).booleanValue(), K(), L());
        }

        private void J(J2.f fVar, u2.d dVar, C3801a c3801a, Application application) {
            this.f39432c = u5.d.c(a0.a());
            u5.i c8 = u5.d.c(C3896S.a());
            this.f39433d = c8;
            this.f39434e = u5.d.c(u2.c.a(c3801a, c8));
            u5.i c9 = u5.d.c(u2.f.a(dVar));
            this.f39435f = c9;
            this.f39436g = x2.n.a(this.f39434e, c9);
            u5.e a8 = u5.f.a(application);
            this.f39437h = a8;
            C3897T a9 = C3897T.a(a8);
            this.f39438i = a9;
            this.f39439j = C3899V.a(a9);
            u5.i c10 = u5.d.c(c0.a());
            this.f39440k = c10;
            this.f39441l = e3.j.a(this.f39437h, this.f39439j, c10);
            u5.i c11 = u5.d.c(C3895Q.a());
            this.f39442m = c11;
            this.f39443n = u5.d.c(com.stripe.android.paymentsheet.analytics.b.a(this.f39432c, this.f39436g, this.f39441l, c11, this.f39435f));
            this.f39444o = u5.d.c(C3898U.a(this.f39437h, this.f39435f));
            this.f39445p = J2.g.a(fVar, this.f39437h, this.f39434e);
            e3.k a10 = e3.k.a(this.f39437h, this.f39439j, this.f39435f, this.f39440k, this.f39441l, this.f39436g, this.f39434e);
            this.f39446q = a10;
            this.f39447r = H3.h.a(a10, this.f39438i, this.f39435f);
            C3892N a11 = C3892N.a(this.f39437h, this.f39438i);
            this.f39448s = a11;
            k3.k a12 = k3.k.a(this.f39436g, a11);
            this.f39449t = a12;
            this.f39450u = u5.d.c(H3.b.a(this.f39446q, this.f39438i, this.f39434e, a12, this.f39435f, this.f39440k));
            a aVar = new a();
            this.f39451v = aVar;
            u5.i c12 = u5.d.c(K2.l.a(aVar));
            this.f39452w = c12;
            this.f39453x = I3.c.a(c12);
            this.f39454y = u5.d.c(L2.e.a(this.f39437h));
            this.f39455z = C2604d0.a(this.f39449t);
            this.f39419A = A2.g.a(this.f39437h);
            this.f39420B = u5.d.c(I3.e.a(this.f39444o, this.f39445p, this.f39447r, this.f39450u, X2.e.a(), this.f39434e, this.f39443n, this.f39449t, this.f39435f, this.f39453x, this.f39454y, this.f39455z, this.f39419A));
            this.f39421C = new b();
            K2.a a13 = K2.a.a(this.f39446q);
            this.f39422D = a13;
            this.f39423E = u5.d.c(K2.h.a(this.f39421C, a13, this.f39454y));
            this.f39424F = u5.d.c(C3893O.a());
            this.f39425G = u5.d.c(b0.a());
            this.f39426H = u5.d.c(X.a());
            this.f39427I = u5.d.c(C3894P.a());
            this.f39428J = W.a(this.f39438i);
            this.f39429K = u5.d.c(u2.b.a(c3801a));
        }

        private Function0 K() {
            return C3899V.c(this.f39438i);
        }

        private Function0 L() {
            return W.c(this.f39438i);
        }

        private PaymentAnalyticsRequestFactory M() {
            return new PaymentAnalyticsRequestFactory(this.f39430a, K(), (Set) this.f39440k.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public k3.j N() {
            return new k3.j(G(), F());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public A2.f O() {
            return new A2.f(this.f39430a);
        }

        private com.stripe.android.networking.a P() {
            return new com.stripe.android.networking.a(this.f39430a, K(), (P5.g) this.f39435f.get(), (Set) this.f39440k.get(), M(), G(), (InterfaceC3684d) this.f39434e.get());
        }

        @Override // x3.Y
        public h0.a a() {
            return new g(this.f39431b);
        }

        private f(J2.f fVar, u2.d dVar, C3801a c3801a, Application application) {
            this.f39431b = this;
            this.f39430a = application;
            J(fVar, dVar, c3801a, application);
        }
    }

    /* renamed from: x3.y$g */
    /* loaded from: classes4.dex */
    private static final class g implements h0.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f39458a;

        /* renamed from: b, reason: collision with root package name */
        private d0 f39459b;

        /* renamed from: c, reason: collision with root package name */
        private SavedStateHandle f39460c;

        @Override // x3.h0.a
        public h0 build() {
            u5.h.a(this.f39459b, d0.class);
            u5.h.a(this.f39460c, SavedStateHandle.class);
            return new h(this.f39458a, this.f39459b, this.f39460c);
        }

        @Override // x3.h0.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public g b(d0 d0Var) {
            this.f39459b = (d0) u5.h.b(d0Var);
            return this;
        }

        @Override // x3.h0.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public g a(SavedStateHandle savedStateHandle) {
            this.f39460c = (SavedStateHandle) u5.h.b(savedStateHandle);
            return this;
        }

        private g(f fVar) {
            this.f39458a = fVar;
        }
    }

    /* renamed from: x3.y$h */
    /* loaded from: classes4.dex */
    private static final class h implements h0 {

        /* renamed from: a, reason: collision with root package name */
        private final d0 f39461a;

        /* renamed from: b, reason: collision with root package name */
        private final SavedStateHandle f39462b;

        /* renamed from: c, reason: collision with root package name */
        private final f f39463c;

        /* renamed from: d, reason: collision with root package name */
        private final h f39464d;

        /* renamed from: e, reason: collision with root package name */
        private com.stripe.android.googlepaylauncher.k f39465e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f39466f;

        /* renamed from: g, reason: collision with root package name */
        private com.stripe.android.payments.paymentlauncher.f f39467g;

        /* renamed from: h, reason: collision with root package name */
        private u5.i f39468h;

        private void b(d0 d0Var, SavedStateHandle savedStateHandle) {
            com.stripe.android.googlepaylauncher.k a8 = com.stripe.android.googlepaylauncher.k.a(this.f39463c.f39437h, this.f39463c.f39445p, this.f39463c.f39441l, this.f39463c.f39436g);
            this.f39465e = a8;
            this.f39466f = J2.i.b(a8);
            com.stripe.android.payments.paymentlauncher.f a9 = com.stripe.android.payments.paymentlauncher.f.a(this.f39463c.f39433d, this.f39463c.f39440k);
            this.f39467g = a9;
            this.f39468h = com.stripe.android.payments.paymentlauncher.e.b(a9);
        }

        private e.d c() {
            return g0.a(this.f39461a, this.f39462b, this.f39463c.f39438i, (com.stripe.android.paymentsheet.paymentdatacollection.bacs.b) this.f39463c.f39424F.get(), (J2.h) this.f39466f.get(), (com.stripe.android.payments.paymentlauncher.d) this.f39468h.get(), this.f39463c.I(), this.f39463c.N(), this.f39463c.O());
        }

        private com.stripe.android.paymentsheet.h d() {
            return new com.stripe.android.paymentsheet.h((com.stripe.android.link.a) this.f39463c.f39423E.get(), (K2.e) this.f39463c.f39452w.get(), this.f39462b, (L2.d) this.f39463c.f39454y.get(), new b(this.f39463c));
        }

        private q3.q e() {
            return f0.a(this.f39461a, this.f39463c.f39430a, (P5.g) this.f39463c.f39435f.get());
        }

        @Override // x3.h0
        public com.stripe.android.paymentsheet.y a() {
            return new com.stripe.android.paymentsheet.y(e0.a(this.f39461a), (EventReporter) this.f39463c.f39443n.get(), (I3.h) this.f39463c.f39420B.get(), (H3.c) this.f39463c.f39450u.get(), e(), (InterfaceC3684d) this.f39463c.f39434e.get(), (P5.g) this.f39463c.f39435f.get(), this.f39462b, d(), c(), this.f39463c.H(), (InterfaceC1211t.a) this.f39463c.f39426H.get(), this.f39463c.N(), (InterfaceC3802a) this.f39463c.f39427I.get());
        }

        private h(f fVar, d0 d0Var, SavedStateHandle savedStateHandle) {
            this.f39464d = this;
            this.f39463c = fVar;
            this.f39461a = d0Var;
            this.f39462b = savedStateHandle;
            b(d0Var, savedStateHandle);
        }
    }

    public static Y.a a() {
        return new a();
    }
}
