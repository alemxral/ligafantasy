package x3;

import J3.InterfaceC1211t;
import N2.a;
import N2.b;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import java.util.Set;
import r2.InterfaceC3684d;
import u2.C3801a;
import x3.InterfaceC3886H;
import x3.InterfaceC3889K;

/* renamed from: x3.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3915p {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.p$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3886H.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f39343a;

        /* renamed from: b, reason: collision with root package name */
        private Set f39344b;

        private a() {
        }

        @Override // x3.InterfaceC3886H.a
        public InterfaceC3886H build() {
            u5.h.a(this.f39343a, Context.class);
            u5.h.a(this.f39344b, Set.class);
            return new f(new C3887I(), new u2.d(), new C3801a(), this.f39343a, this.f39344b);
        }

        @Override // x3.InterfaceC3886H.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f39343a = (Context) u5.h.b(context);
            return this;
        }

        @Override // x3.InterfaceC3886H.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Set set) {
            this.f39344b = (Set) u5.h.b(set);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.p$b */
    /* loaded from: classes4.dex */
    public static final class b implements a.InterfaceC0151a {

        /* renamed from: a, reason: collision with root package name */
        private final f f39345a;

        @Override // N2.a.InterfaceC0151a
        public N2.a build() {
            return new c(this.f39345a);
        }

        private b(f fVar) {
            this.f39345a = fVar;
        }
    }

    /* renamed from: x3.p$c */
    /* loaded from: classes4.dex */
    private static final class c implements N2.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f39346a;

        /* renamed from: b, reason: collision with root package name */
        private final c f39347b;

        /* renamed from: c, reason: collision with root package name */
        private u5.i f39348c;

        /* renamed from: d, reason: collision with root package name */
        private u5.i f39349d;

        private void b() {
            M2.b a8 = M2.b.a(this.f39346a.f39370g, this.f39346a.f39375l, this.f39346a.f39380q, this.f39346a.f39369f, this.f39346a.f39368e, this.f39346a.f39376m);
            this.f39348c = a8;
            this.f39349d = u5.d.c(a8);
        }

        @Override // N2.a
        public M2.c a() {
            return new M2.c((M2.e) this.f39349d.get());
        }

        private c(f fVar) {
            this.f39347b = this;
            this.f39346a = fVar;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.p$d */
    /* loaded from: classes4.dex */
    public static final class d implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f39350a;

        /* renamed from: b, reason: collision with root package name */
        private K2.d f39351b;

        @Override // N2.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(K2.d dVar) {
            this.f39351b = (K2.d) u5.h.b(dVar);
            return this;
        }

        @Override // N2.b.a
        public N2.b build() {
            u5.h.a(this.f39351b, K2.d.class);
            return new e(this.f39350a, this.f39351b);
        }

        private d(f fVar) {
            this.f39350a = fVar;
        }
    }

    /* renamed from: x3.p$e */
    /* loaded from: classes4.dex */
    private static final class e extends N2.b {

        /* renamed from: a, reason: collision with root package name */
        private final K2.d f39352a;

        /* renamed from: b, reason: collision with root package name */
        private final f f39353b;

        /* renamed from: c, reason: collision with root package name */
        private final e f39354c;

        /* renamed from: d, reason: collision with root package name */
        private u5.i f39355d;

        /* renamed from: e, reason: collision with root package name */
        private u5.i f39356e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f39357f;

        /* renamed from: g, reason: collision with root package name */
        private u5.i f39358g;

        /* renamed from: h, reason: collision with root package name */
        private u5.i f39359h;

        /* renamed from: i, reason: collision with root package name */
        private u5.i f39360i;

        /* renamed from: j, reason: collision with root package name */
        private T2.d f39361j;

        /* renamed from: k, reason: collision with root package name */
        private u5.i f39362k;

        private void d(K2.d dVar) {
            this.f39355d = u5.f.a(dVar);
            this.f39356e = u5.d.c(N2.f.a(this.f39353b.f39368e, this.f39353b.f39369f));
            this.f39357f = u5.d.c(P2.b.a(this.f39353b.f39373j, this.f39353b.f39389z, this.f39353b.f39378o, this.f39356e, this.f39353b.f39369f, this.f39353b.f39363A, this.f39353b.f39380q));
            M2.b a8 = M2.b.a(this.f39353b.f39370g, this.f39353b.f39375l, this.f39353b.f39380q, this.f39353b.f39369f, this.f39353b.f39368e, this.f39353b.f39376m);
            this.f39358g = a8;
            u5.i c8 = u5.d.c(a8);
            this.f39359h = c8;
            u5.i c9 = u5.d.c(L2.c.a(this.f39355d, this.f39357f, c8, this.f39353b.f39380q));
            this.f39360i = c9;
            T2.d a9 = T2.d.a(this.f39355d, c9, this.f39359h, this.f39353b.f39368e);
            this.f39361j = a9;
            this.f39362k = N2.d.b(a9);
        }

        @Override // N2.b
        public K2.d a() {
            return this.f39352a;
        }

        @Override // N2.b
        public N2.c b() {
            return (N2.c) this.f39362k.get();
        }

        @Override // N2.b
        public L2.b c() {
            return (L2.b) this.f39360i.get();
        }

        private e(f fVar, K2.d dVar) {
            this.f39354c = this;
            this.f39353b = fVar;
            this.f39352a = dVar;
            d(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.p$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC3886H {

        /* renamed from: A, reason: collision with root package name */
        private u5.i f39363A;

        /* renamed from: a, reason: collision with root package name */
        private final Context f39364a;

        /* renamed from: b, reason: collision with root package name */
        private final f f39365b;

        /* renamed from: c, reason: collision with root package name */
        private u5.i f39366c;

        /* renamed from: d, reason: collision with root package name */
        private u5.i f39367d;

        /* renamed from: e, reason: collision with root package name */
        private u5.i f39368e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f39369f;

        /* renamed from: g, reason: collision with root package name */
        private u5.i f39370g;

        /* renamed from: h, reason: collision with root package name */
        private u5.i f39371h;

        /* renamed from: i, reason: collision with root package name */
        private u5.i f39372i;

        /* renamed from: j, reason: collision with root package name */
        private u5.i f39373j;

        /* renamed from: k, reason: collision with root package name */
        private u5.i f39374k;

        /* renamed from: l, reason: collision with root package name */
        private u5.i f39375l;

        /* renamed from: m, reason: collision with root package name */
        private u5.i f39376m;

        /* renamed from: n, reason: collision with root package name */
        private u5.i f39377n;

        /* renamed from: o, reason: collision with root package name */
        private u5.i f39378o;

        /* renamed from: p, reason: collision with root package name */
        private u5.i f39379p;

        /* renamed from: q, reason: collision with root package name */
        private u5.i f39380q;

        /* renamed from: r, reason: collision with root package name */
        private u5.i f39381r;

        /* renamed from: s, reason: collision with root package name */
        private u5.i f39382s;

        /* renamed from: t, reason: collision with root package name */
        private u5.i f39383t;

        /* renamed from: u, reason: collision with root package name */
        private u5.i f39384u;

        /* renamed from: v, reason: collision with root package name */
        private u5.i f39385v;

        /* renamed from: w, reason: collision with root package name */
        private u5.i f39386w;

        /* renamed from: x, reason: collision with root package name */
        private u5.i f39387x;

        /* renamed from: y, reason: collision with root package name */
        private u5.i f39388y;

        /* renamed from: z, reason: collision with root package name */
        private u5.i f39389z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x3.p$f$a */
        /* loaded from: classes4.dex */
        public class a implements u5.i {
            a() {
            }

            @Override // I5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a.InterfaceC0151a get() {
                return new b(f.this.f39365b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x3.p$f$b */
        /* loaded from: classes4.dex */
        public class b implements u5.i {
            b() {
            }

            @Override // I5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b.a get() {
                return new d(f.this.f39365b);
            }
        }

        private x2.m t() {
            return new x2.m((InterfaceC3684d) this.f39368e.get(), (P5.g) this.f39369f.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public l2.j u() {
            return new l2.j(this.f39364a, t());
        }

        private void v(C3887I c3887i, u2.d dVar, C3801a c3801a, Context context, Set set) {
            this.f39366c = u5.d.c(C3888J.a(c3887i));
            u5.i c8 = u5.d.c(C3896S.a());
            this.f39367d = c8;
            this.f39368e = u5.d.c(u2.c.a(c3801a, c8));
            u5.i c9 = u5.d.c(u2.f.a(dVar));
            this.f39369f = c9;
            this.f39370g = x2.n.a(this.f39368e, c9);
            u5.e a8 = u5.f.a(context);
            this.f39371h = a8;
            C3897T a9 = C3897T.a(a8);
            this.f39372i = a9;
            this.f39373j = C3899V.a(a9);
            u5.e a10 = u5.f.a(set);
            this.f39374k = a10;
            this.f39375l = e3.j.a(this.f39371h, this.f39373j, a10);
            u5.i c10 = u5.d.c(C3895Q.a());
            this.f39376m = c10;
            this.f39377n = u5.d.c(com.stripe.android.paymentsheet.analytics.b.a(this.f39366c, this.f39370g, this.f39375l, c10, this.f39369f));
            this.f39378o = e3.k.a(this.f39371h, this.f39373j, this.f39369f, this.f39374k, this.f39375l, this.f39370g, this.f39368e);
            C3892N a11 = C3892N.a(this.f39371h, this.f39372i);
            this.f39379p = a11;
            k3.k a12 = k3.k.a(this.f39370g, a11);
            this.f39380q = a12;
            this.f39381r = u5.d.c(H3.b.a(this.f39378o, this.f39372i, this.f39368e, a12, this.f39369f, this.f39374k));
            this.f39382s = new a();
            this.f39383t = K2.a.a(this.f39378o);
            u5.i c11 = u5.d.c(L2.e.a(this.f39371h));
            this.f39384u = c11;
            this.f39385v = u5.d.c(K2.h.a(this.f39382s, this.f39383t, c11));
            b bVar = new b();
            this.f39386w = bVar;
            this.f39387x = u5.d.c(K2.l.a(bVar));
            this.f39388y = u5.d.c(X.a());
            this.f39389z = W.a(this.f39372i);
            this.f39363A = u5.d.c(u2.b.a(c3801a));
        }

        @Override // x3.InterfaceC3886H
        public InterfaceC3889K.a a() {
            return new g(this.f39365b);
        }

        private f(C3887I c3887i, u2.d dVar, C3801a c3801a, Context context, Set set) {
            this.f39365b = this;
            this.f39364a = context;
            v(c3887i, dVar, c3801a, context, set);
        }
    }

    /* renamed from: x3.p$g */
    /* loaded from: classes4.dex */
    private static final class g implements InterfaceC3889K.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f39392a;

        /* renamed from: b, reason: collision with root package name */
        private Application f39393b;

        /* renamed from: c, reason: collision with root package name */
        private SavedStateHandle f39394c;

        /* renamed from: d, reason: collision with root package name */
        private PaymentOptionContract.a f39395d;

        @Override // x3.InterfaceC3889K.a
        public InterfaceC3889K build() {
            u5.h.a(this.f39393b, Application.class);
            u5.h.a(this.f39394c, SavedStateHandle.class);
            u5.h.a(this.f39395d, PaymentOptionContract.a.class);
            return new h(this.f39392a, this.f39393b, this.f39394c, this.f39395d);
        }

        @Override // x3.InterfaceC3889K.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public g b(Application application) {
            this.f39393b = (Application) u5.h.b(application);
            return this;
        }

        @Override // x3.InterfaceC3889K.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public g c(PaymentOptionContract.a aVar) {
            this.f39395d = (PaymentOptionContract.a) u5.h.b(aVar);
            return this;
        }

        @Override // x3.InterfaceC3889K.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public g a(SavedStateHandle savedStateHandle) {
            this.f39394c = (SavedStateHandle) u5.h.b(savedStateHandle);
            return this;
        }

        private g(f fVar) {
            this.f39392a = fVar;
        }
    }

    /* renamed from: x3.p$h */
    /* loaded from: classes4.dex */
    private static final class h implements InterfaceC3889K {

        /* renamed from: a, reason: collision with root package name */
        private final PaymentOptionContract.a f39396a;

        /* renamed from: b, reason: collision with root package name */
        private final SavedStateHandle f39397b;

        /* renamed from: c, reason: collision with root package name */
        private final f f39398c;

        /* renamed from: d, reason: collision with root package name */
        private final h f39399d;

        private com.stripe.android.paymentsheet.h b() {
            return new com.stripe.android.paymentsheet.h((com.stripe.android.link.a) this.f39398c.f39385v.get(), (K2.e) this.f39398c.f39387x.get(), this.f39397b, (L2.d) this.f39398c.f39384u.get(), new b(this.f39398c));
        }

        @Override // x3.InterfaceC3889K
        public com.stripe.android.paymentsheet.t a() {
            return new com.stripe.android.paymentsheet.t(this.f39396a, (EventReporter) this.f39398c.f39377n.get(), (H3.c) this.f39398c.f39381r.get(), (P5.g) this.f39398c.f39369f.get(), this.f39397b, b(), this.f39398c.u(), (InterfaceC1211t.a) this.f39398c.f39388y.get());
        }

        private h(f fVar, Application application, SavedStateHandle savedStateHandle, PaymentOptionContract.a aVar) {
            this.f39399d = this;
            this.f39398c = fVar;
            this.f39396a = aVar;
            this.f39397b = savedStateHandle;
        }
    }

    public static InterfaceC3886H.a a() {
        return new a();
    }
}
