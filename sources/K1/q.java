package K1;

import j$.util.DesugarCollections;
import java.net.URI;
import java.text.ParseException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class q extends b {

    /* renamed from: p, reason: collision with root package name */
    private static final Set f5825p;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f5826o;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("jku");
        hashSet.add("jwk");
        hashSet.add("x5u");
        hashSet.add("x5t");
        hashSet.add("x5t#S256");
        hashSet.add("x5c");
        hashSet.add("kid");
        hashSet.add("typ");
        hashSet.add("cty");
        hashSet.add("crit");
        hashSet.add("b64");
        f5825p = DesugarCollections.unmodifiableSet(hashSet);
    }

    public q(p pVar, h hVar, String str, Set set, URI uri, R1.d dVar, URI uri2, Z1.c cVar, Z1.c cVar2, List list, String str2, boolean z8, Map map, Z1.c cVar3) {
        super(pVar, hVar, str, set, uri, dVar, uri2, cVar, cVar2, list, str2, map, cVar3);
        if (!pVar.a().equals(K1.a.f5704c.a())) {
            this.f5826o = z8;
            return;
        }
        throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
    }

    public static Set u() {
        return f5825p;
    }

    public static q w(Z1.c cVar) {
        return x(cVar.c(), cVar);
    }

    public static q x(String str, Z1.c cVar) {
        return y(Z1.k.n(str, 20000), cVar);
    }

    public static q y(Map map, Z1.c cVar) {
        K1.a g8 = e.g(map);
        if (g8 instanceof p) {
            a i8 = new a((p) g8).i(cVar);
            for (String str : map.keySet()) {
                if (!"alg".equals(str)) {
                    if ("typ".equals(str)) {
                        String h8 = Z1.k.h(map, str);
                        if (h8 != null) {
                            i8 = i8.j(new h(h8));
                        }
                    } else if ("cty".equals(str)) {
                        i8 = i8.c(Z1.k.h(map, str));
                    } else if ("crit".equals(str)) {
                        List j8 = Z1.k.j(map, str);
                        if (j8 != null) {
                            i8 = i8.d(new HashSet(j8));
                        }
                    } else if ("jku".equals(str)) {
                        i8 = i8.g(Z1.k.k(map, str));
                    } else if ("jwk".equals(str)) {
                        i8 = i8.f(b.r(Z1.k.f(map, str)));
                    } else if ("x5u".equals(str)) {
                        i8 = i8.n(Z1.k.k(map, str));
                    } else if ("x5t".equals(str)) {
                        i8 = i8.m(Z1.c.f(Z1.k.h(map, str)));
                    } else if ("x5t#S256".equals(str)) {
                        i8 = i8.l(Z1.c.f(Z1.k.h(map, str)));
                    } else if ("x5c".equals(str)) {
                        i8 = i8.k(Z1.n.b(Z1.k.e(map, str)));
                    } else if ("kid".equals(str)) {
                        i8 = i8.h(Z1.k.h(map, str));
                    } else if ("b64".equals(str)) {
                        i8 = i8.a(Z1.k.b(map, str));
                    } else {
                        i8 = i8.e(str, map.get(str));
                    }
                }
            }
            return i8.b();
        }
        throw new ParseException("Not a JWS header", 0);
    }

    @Override // K1.b, K1.e
    public Map j() {
        Map j8 = super.j();
        if (!v()) {
            j8.put("b64", Boolean.FALSE);
        }
        return j8;
    }

    @Override // K1.b
    public /* bridge */ /* synthetic */ R1.d k() {
        return super.k();
    }

    @Override // K1.b
    public /* bridge */ /* synthetic */ URI l() {
        return super.l();
    }

    @Override // K1.b
    public /* bridge */ /* synthetic */ String m() {
        return super.m();
    }

    @Override // K1.b
    public /* bridge */ /* synthetic */ List n() {
        return super.n();
    }

    @Override // K1.b
    public /* bridge */ /* synthetic */ Z1.c o() {
        return super.o();
    }

    @Override // K1.b
    public /* bridge */ /* synthetic */ Z1.c p() {
        return super.p();
    }

    @Override // K1.b
    public /* bridge */ /* synthetic */ URI q() {
        return super.q();
    }

    public p t() {
        return (p) super.a();
    }

    public boolean v() {
        return this.f5826o;
    }

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final p f5827a;

        /* renamed from: b, reason: collision with root package name */
        private h f5828b;

        /* renamed from: c, reason: collision with root package name */
        private String f5829c;

        /* renamed from: d, reason: collision with root package name */
        private Set f5830d;

        /* renamed from: e, reason: collision with root package name */
        private URI f5831e;

        /* renamed from: f, reason: collision with root package name */
        private R1.d f5832f;

        /* renamed from: g, reason: collision with root package name */
        private URI f5833g;

        /* renamed from: h, reason: collision with root package name */
        private Z1.c f5834h;

        /* renamed from: i, reason: collision with root package name */
        private Z1.c f5835i;

        /* renamed from: j, reason: collision with root package name */
        private List f5836j;

        /* renamed from: k, reason: collision with root package name */
        private String f5837k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f5838l;

        /* renamed from: m, reason: collision with root package name */
        private Map f5839m;

        /* renamed from: n, reason: collision with root package name */
        private Z1.c f5840n;

        public a(p pVar) {
            this.f5838l = true;
            if (!pVar.a().equals(K1.a.f5704c.a())) {
                this.f5827a = pVar;
                return;
            }
            throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
        }

        public a a(boolean z8) {
            this.f5838l = z8;
            return this;
        }

        public q b() {
            return new q(this.f5827a, this.f5828b, this.f5829c, this.f5830d, this.f5831e, this.f5832f, this.f5833g, this.f5834h, this.f5835i, this.f5836j, this.f5837k, this.f5838l, this.f5839m, this.f5840n);
        }

        public a c(String str) {
            this.f5829c = str;
            return this;
        }

        public a d(Set set) {
            this.f5830d = set;
            return this;
        }

        public a e(String str, Object obj) {
            if (!q.u().contains(str)) {
                if (this.f5839m == null) {
                    this.f5839m = new HashMap();
                }
                this.f5839m.put(str, obj);
                return this;
            }
            throw new IllegalArgumentException("The parameter name \"" + str + "\" matches a registered name");
        }

        public a f(R1.d dVar) {
            if (dVar != null && dVar.l()) {
                throw new IllegalArgumentException("The JWK must be public");
            }
            this.f5832f = dVar;
            return this;
        }

        public a g(URI uri) {
            this.f5831e = uri;
            return this;
        }

        public a h(String str) {
            this.f5837k = str;
            return this;
        }

        public a i(Z1.c cVar) {
            this.f5840n = cVar;
            return this;
        }

        public a j(h hVar) {
            this.f5828b = hVar;
            return this;
        }

        public a k(List list) {
            this.f5836j = list;
            return this;
        }

        public a l(Z1.c cVar) {
            this.f5835i = cVar;
            return this;
        }

        public a m(Z1.c cVar) {
            this.f5834h = cVar;
            return this;
        }

        public a n(URI uri) {
            this.f5833g = uri;
            return this;
        }

        public a(q qVar) {
            this(qVar.t());
            this.f5828b = qVar.f();
            this.f5829c = qVar.b();
            this.f5830d = qVar.c();
            this.f5831e = qVar.l();
            this.f5832f = qVar.k();
            this.f5833g = qVar.q();
            this.f5834h = qVar.p();
            this.f5835i = qVar.o();
            this.f5836j = qVar.n();
            this.f5837k = qVar.m();
            this.f5838l = qVar.v();
            this.f5839m = qVar.e();
        }
    }
}
