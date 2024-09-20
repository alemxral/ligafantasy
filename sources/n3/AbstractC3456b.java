package n3;

import android.content.Context;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import l3.C3171a;
import l3.C3173c;
import l3.C3175e;
import l3.C3180j;
import l3.C3183m;
import l3.C3185o;
import l3.C3187q;
import l3.C3190t;
import m3.C3398c;
import n3.n;
import u2.C3801a;

/* renamed from: n3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3456b {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n3.b$a */
    /* loaded from: classes4.dex */
    public static final class a implements n.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f35990a;

        /* renamed from: b, reason: collision with root package name */
        private PaymentAnalyticsRequestFactory f35991b;

        /* renamed from: c, reason: collision with root package name */
        private Boolean f35992c;

        /* renamed from: d, reason: collision with root package name */
        private P5.g f35993d;

        /* renamed from: e, reason: collision with root package name */
        private P5.g f35994e;

        /* renamed from: f, reason: collision with root package name */
        private Map f35995f;

        /* renamed from: g, reason: collision with root package name */
        private Function0 f35996g;

        /* renamed from: h, reason: collision with root package name */
        private Set f35997h;

        /* renamed from: i, reason: collision with root package name */
        private Boolean f35998i;

        /* renamed from: j, reason: collision with root package name */
        private Boolean f35999j;

        private a() {
        }

        @Override // n3.n.a
        public n build() {
            u5.h.a(this.f35990a, Context.class);
            u5.h.a(this.f35991b, PaymentAnalyticsRequestFactory.class);
            u5.h.a(this.f35992c, Boolean.class);
            u5.h.a(this.f35993d, P5.g.class);
            u5.h.a(this.f35994e, P5.g.class);
            u5.h.a(this.f35995f, Map.class);
            u5.h.a(this.f35996g, Function0.class);
            u5.h.a(this.f35997h, Set.class);
            u5.h.a(this.f35998i, Boolean.class);
            u5.h.a(this.f35999j, Boolean.class);
            return new C0830b(new I(), new C3801a(), this.f35990a, this.f35991b, this.f35992c, this.f35993d, this.f35994e, this.f35995f, this.f35996g, this.f35997h, this.f35998i, this.f35999j);
        }

        @Override // n3.n.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public a g(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
            this.f35991b = (PaymentAnalyticsRequestFactory) u5.h.b(paymentAnalyticsRequestFactory);
            return this;
        }

        @Override // n3.n.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f35990a = (Context) u5.h.b(context);
            return this;
        }

        @Override // n3.n.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public a d(boolean z8) {
            this.f35992c = (Boolean) u5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // n3.n.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public a j(boolean z8) {
            this.f35999j = (Boolean) u5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // n3.n.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public a e(boolean z8) {
            this.f35998i = (Boolean) u5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // n3.n.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public a b(Set set) {
            this.f35997h = (Set) u5.h.b(set);
            return this;
        }

        @Override // n3.n.a
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public a c(Function0 function0) {
            this.f35996g = (Function0) u5.h.b(function0);
            return this;
        }

        @Override // n3.n.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public a f(Map map) {
            this.f35995f = (Map) u5.h.b(map);
            return this;
        }

        @Override // n3.n.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public a i(P5.g gVar) {
            this.f35994e = (P5.g) u5.h.b(gVar);
            return this;
        }

        @Override // n3.n.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public a h(P5.g gVar) {
            this.f35993d = (P5.g) u5.h.b(gVar);
            return this;
        }
    }

    /* renamed from: n3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0830b implements n {

        /* renamed from: a, reason: collision with root package name */
        private final C0830b f36000a;

        /* renamed from: b, reason: collision with root package name */
        private u5.i f36001b;

        /* renamed from: c, reason: collision with root package name */
        private u5.i f36002c;

        /* renamed from: d, reason: collision with root package name */
        private u5.i f36003d;

        /* renamed from: e, reason: collision with root package name */
        private u5.i f36004e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f36005f;

        /* renamed from: g, reason: collision with root package name */
        private u5.i f36006g;

        /* renamed from: h, reason: collision with root package name */
        private u5.i f36007h;

        /* renamed from: i, reason: collision with root package name */
        private u5.i f36008i;

        /* renamed from: j, reason: collision with root package name */
        private u5.i f36009j;

        /* renamed from: k, reason: collision with root package name */
        private u5.i f36010k;

        /* renamed from: l, reason: collision with root package name */
        private u5.i f36011l;

        /* renamed from: m, reason: collision with root package name */
        private u5.i f36012m;

        /* renamed from: n, reason: collision with root package name */
        private u5.i f36013n;

        /* renamed from: o, reason: collision with root package name */
        private u5.i f36014o;

        /* renamed from: p, reason: collision with root package name */
        private u5.i f36015p;

        /* renamed from: q, reason: collision with root package name */
        private u5.i f36016q;

        /* renamed from: r, reason: collision with root package name */
        private u5.i f36017r;

        /* renamed from: s, reason: collision with root package name */
        private u5.i f36018s;

        /* renamed from: t, reason: collision with root package name */
        private u5.i f36019t;

        /* renamed from: u, reason: collision with root package name */
        private u5.i f36020u;

        /* renamed from: v, reason: collision with root package name */
        private u5.i f36021v;

        /* renamed from: w, reason: collision with root package name */
        private u5.i f36022w;

        /* renamed from: x, reason: collision with root package name */
        private u5.i f36023x;

        /* renamed from: y, reason: collision with root package name */
        private u5.i f36024y;

        /* renamed from: z, reason: collision with root package name */
        private u5.i f36025z;

        private void b(I i8, C3801a c3801a, Context context, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Boolean bool, P5.g gVar, P5.g gVar2, Map map, Function0 function0, Set set, Boolean bool2, Boolean bool3) {
            u5.c cVar = new u5.c();
            this.f36001b = cVar;
            u5.i c8 = u5.d.c(r.a(cVar));
            this.f36002c = c8;
            this.f36003d = u5.d.c(C3175e.a(c8));
            u5.e a8 = u5.f.a(context);
            this.f36004e = a8;
            u5.i c9 = u5.d.c(p.a(a8));
            this.f36005f = c9;
            this.f36006g = u5.d.c(q.a(this.f36001b, c9));
            u5.e a9 = u5.f.a(bool);
            this.f36007h = a9;
            this.f36008i = u5.d.c(u2.c.a(c3801a, a9));
            u5.e a10 = u5.f.a(gVar);
            this.f36009j = a10;
            this.f36010k = x2.n.a(this.f36008i, a10);
            this.f36011l = u5.f.a(paymentAnalyticsRequestFactory);
            this.f36012m = u5.f.a(gVar2);
            this.f36013n = u5.f.a(function0);
            u5.e a11 = u5.f.a(bool2);
            this.f36014o = a11;
            this.f36015p = u5.d.c(C3183m.a(this.f36006g, this.f36002c, this.f36010k, this.f36011l, this.f36007h, this.f36012m, this.f36013n, a11));
            u5.i c10 = u5.d.c(C3185o.a(this.f36002c));
            this.f36016q = c10;
            this.f36017r = J.a(i8, c10);
            u5.e a12 = u5.f.a(map);
            this.f36018s = a12;
            u5.i c11 = u5.d.c(C3190t.a(this.f36006g, this.f36010k, this.f36011l, this.f36007h, this.f36012m, a12, this.f36013n, this.f36014o, this.f36005f, C3180j.a()));
            this.f36019t = c11;
            this.f36020u = u5.d.c(C3187q.a(c11, this.f36003d, this.f36004e));
            this.f36021v = u5.d.c(C3452A.a());
            u5.e a13 = u5.f.a(set);
            this.f36022w = a13;
            this.f36023x = u5.d.c(C3398c.a(this.f36021v, this.f36007h, this.f36013n, a13));
            this.f36024y = u5.g.b(11).c(StripeIntent.a.n.class, this.f36017r).c(StripeIntent.a.j.C0489a.class, this.f36019t).c(StripeIntent.a.i.class, this.f36019t).c(StripeIntent.a.C0480a.class, this.f36019t).c(StripeIntent.a.f.class, this.f36020u).c(StripeIntent.a.g.class, this.f36020u).c(StripeIntent.a.e.class, this.f36020u).c(StripeIntent.a.d.class, this.f36020u).c(StripeIntent.a.c.class, this.f36019t).c(StripeIntent.a.k.class, this.f36019t).c(StripeIntent.a.j.b.class, this.f36023x).b();
            u5.e a14 = u5.f.a(bool3);
            this.f36025z = a14;
            u5.c.a(this.f36001b, u5.d.c(C3173c.a(this.f36003d, this.f36015p, this.f36024y, a14, this.f36004e)));
        }

        @Override // n3.n
        public C3171a a() {
            return (C3171a) this.f36001b.get();
        }

        private C0830b(I i8, C3801a c3801a, Context context, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Boolean bool, P5.g gVar, P5.g gVar2, Map map, Function0 function0, Set set, Boolean bool2, Boolean bool3) {
            this.f36000a = this;
            b(i8, c3801a, context, paymentAnalyticsRequestFactory, bool, gVar, gVar2, map, function0, set, bool2, bool3);
        }
    }

    public static n.a a() {
        return new a();
    }
}
