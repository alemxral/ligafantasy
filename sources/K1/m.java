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
public final class m extends b {

    /* renamed from: y, reason: collision with root package name */
    private static final Set f5767y;

    /* renamed from: o, reason: collision with root package name */
    private final d f5768o;

    /* renamed from: p, reason: collision with root package name */
    private final R1.d f5769p;

    /* renamed from: q, reason: collision with root package name */
    private final c f5770q;

    /* renamed from: r, reason: collision with root package name */
    private final Z1.c f5771r;

    /* renamed from: s, reason: collision with root package name */
    private final Z1.c f5772s;

    /* renamed from: t, reason: collision with root package name */
    private final Z1.c f5773t;

    /* renamed from: u, reason: collision with root package name */
    private final int f5774u;

    /* renamed from: v, reason: collision with root package name */
    private final Z1.c f5775v;

    /* renamed from: w, reason: collision with root package name */
    private final Z1.c f5776w;

    /* renamed from: x, reason: collision with root package name */
    private final String f5777x;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final i f5778a;

        /* renamed from: b, reason: collision with root package name */
        private final d f5779b;

        /* renamed from: c, reason: collision with root package name */
        private h f5780c;

        /* renamed from: d, reason: collision with root package name */
        private String f5781d;

        /* renamed from: e, reason: collision with root package name */
        private Set f5782e;

        /* renamed from: f, reason: collision with root package name */
        private URI f5783f;

        /* renamed from: g, reason: collision with root package name */
        private R1.d f5784g;

        /* renamed from: h, reason: collision with root package name */
        private URI f5785h;

        /* renamed from: i, reason: collision with root package name */
        private Z1.c f5786i;

        /* renamed from: j, reason: collision with root package name */
        private Z1.c f5787j;

        /* renamed from: k, reason: collision with root package name */
        private List f5788k;

        /* renamed from: l, reason: collision with root package name */
        private String f5789l;

        /* renamed from: m, reason: collision with root package name */
        private R1.d f5790m;

        /* renamed from: n, reason: collision with root package name */
        private c f5791n;

        /* renamed from: o, reason: collision with root package name */
        private Z1.c f5792o;

        /* renamed from: p, reason: collision with root package name */
        private Z1.c f5793p;

        /* renamed from: q, reason: collision with root package name */
        private Z1.c f5794q;

        /* renamed from: r, reason: collision with root package name */
        private int f5795r;

        /* renamed from: s, reason: collision with root package name */
        private Z1.c f5796s;

        /* renamed from: t, reason: collision with root package name */
        private Z1.c f5797t;

        /* renamed from: u, reason: collision with root package name */
        private String f5798u;

        /* renamed from: v, reason: collision with root package name */
        private Map f5799v;

        /* renamed from: w, reason: collision with root package name */
        private Z1.c f5800w;

        public a(i iVar, d dVar) {
            if (!iVar.a().equals(K1.a.f5704c.a())) {
                this.f5778a = iVar;
                if (dVar != null) {
                    this.f5779b = dVar;
                    return;
                }
                throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
            }
            throw new IllegalArgumentException("The JWE algorithm \"alg\" cannot be \"none\"");
        }

        public a a(Z1.c cVar) {
            this.f5792o = cVar;
            return this;
        }

        public a b(Z1.c cVar) {
            this.f5793p = cVar;
            return this;
        }

        public a c(Z1.c cVar) {
            this.f5797t = cVar;
            return this;
        }

        public m d() {
            return new m(this.f5778a, this.f5779b, this.f5780c, this.f5781d, this.f5782e, this.f5783f, this.f5784g, this.f5785h, this.f5786i, this.f5787j, this.f5788k, this.f5789l, this.f5790m, this.f5791n, this.f5792o, this.f5793p, this.f5794q, this.f5795r, this.f5796s, this.f5797t, this.f5798u, this.f5799v, this.f5800w);
        }

        public a e(c cVar) {
            this.f5791n = cVar;
            return this;
        }

        public a f(String str) {
            this.f5781d = str;
            return this;
        }

        public a g(Set set) {
            this.f5782e = set;
            return this;
        }

        public a h(String str, Object obj) {
            if (!m.w().contains(str)) {
                if (this.f5799v == null) {
                    this.f5799v = new HashMap();
                }
                this.f5799v.put(str, obj);
                return this;
            }
            throw new IllegalArgumentException("The parameter name \"" + str + "\" matches a registered name");
        }

        public a i(R1.d dVar) {
            this.f5790m = dVar;
            return this;
        }

        public a j(Z1.c cVar) {
            this.f5796s = cVar;
            return this;
        }

        public a k(R1.d dVar) {
            if (dVar != null && dVar.l()) {
                throw new IllegalArgumentException("The JWK must be public");
            }
            this.f5784g = dVar;
            return this;
        }

        public a l(URI uri) {
            this.f5783f = uri;
            return this;
        }

        public a m(String str) {
            this.f5789l = str;
            return this;
        }

        public a n(Z1.c cVar) {
            this.f5800w = cVar;
            return this;
        }

        public a o(int i8) {
            if (i8 >= 0) {
                this.f5795r = i8;
                return this;
            }
            throw new IllegalArgumentException("The PBES2 count parameter must not be negative");
        }

        public a p(Z1.c cVar) {
            this.f5794q = cVar;
            return this;
        }

        public a q(String str) {
            this.f5798u = str;
            return this;
        }

        public a r(h hVar) {
            this.f5780c = hVar;
            return this;
        }

        public a s(List list) {
            this.f5788k = list;
            return this;
        }

        public a t(Z1.c cVar) {
            this.f5787j = cVar;
            return this;
        }

        public a u(Z1.c cVar) {
            this.f5786i = cVar;
            return this;
        }

        public a v(URI uri) {
            this.f5785h = uri;
            return this;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("enc");
        hashSet.add("epk");
        hashSet.add("zip");
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
        hashSet.add("apu");
        hashSet.add("apv");
        hashSet.add("p2s");
        hashSet.add("p2c");
        hashSet.add("iv");
        hashSet.add("tag");
        hashSet.add("skid");
        hashSet.add("authTag");
        f5767y = DesugarCollections.unmodifiableSet(hashSet);
    }

    public m(K1.a aVar, d dVar, h hVar, String str, Set set, URI uri, R1.d dVar2, URI uri2, Z1.c cVar, Z1.c cVar2, List list, String str2, R1.d dVar3, c cVar3, Z1.c cVar4, Z1.c cVar5, Z1.c cVar6, int i8, Z1.c cVar7, Z1.c cVar8, String str3, Map map, Z1.c cVar9) {
        super(aVar, hVar, str, set, uri, dVar2, uri2, cVar, cVar2, list, str2, map, cVar9);
        if (aVar.a().equals(K1.a.f5704c.a())) {
            throw new IllegalArgumentException("The JWE algorithm cannot be \"none\"");
        }
        if (dVar != null) {
            if (dVar3 != null && dVar3.l()) {
                throw new IllegalArgumentException("Ephemeral public key should not be a private key");
            }
            this.f5768o = dVar;
            this.f5769p = dVar3;
            this.f5770q = cVar3;
            this.f5771r = cVar4;
            this.f5772s = cVar5;
            this.f5773t = cVar6;
            this.f5774u = i8;
            this.f5775v = cVar7;
            this.f5776w = cVar8;
            this.f5777x = str3;
            return;
        }
        throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
    }

    public static m A(Map map, Z1.c cVar) {
        K1.a g8 = e.g(map);
        if (g8 instanceof i) {
            a n8 = new a((i) g8, B(map)).n(cVar);
            for (String str : map.keySet()) {
                if (!"alg".equals(str) && !"enc".equals(str)) {
                    if ("typ".equals(str)) {
                        String h8 = Z1.k.h(map, str);
                        if (h8 != null) {
                            n8 = n8.r(new h(h8));
                        }
                    } else if ("cty".equals(str)) {
                        n8 = n8.f(Z1.k.h(map, str));
                    } else if ("crit".equals(str)) {
                        List j8 = Z1.k.j(map, str);
                        if (j8 != null) {
                            n8 = n8.g(new HashSet(j8));
                        }
                    } else if ("jku".equals(str)) {
                        n8 = n8.l(Z1.k.k(map, str));
                    } else if ("jwk".equals(str)) {
                        n8 = n8.k(b.r(Z1.k.f(map, str)));
                    } else if ("x5u".equals(str)) {
                        n8 = n8.v(Z1.k.k(map, str));
                    } else if ("x5t".equals(str)) {
                        n8 = n8.u(Z1.c.f(Z1.k.h(map, str)));
                    } else if ("x5t#S256".equals(str)) {
                        n8 = n8.t(Z1.c.f(Z1.k.h(map, str)));
                    } else if ("x5c".equals(str)) {
                        n8 = n8.s(Z1.n.b(Z1.k.e(map, str)));
                    } else if ("kid".equals(str)) {
                        n8 = n8.m(Z1.k.h(map, str));
                    } else if ("epk".equals(str)) {
                        n8 = n8.i(R1.d.m(Z1.k.f(map, str)));
                    } else if ("zip".equals(str)) {
                        String h9 = Z1.k.h(map, str);
                        if (h9 != null) {
                            n8 = n8.e(new c(h9));
                        }
                    } else if ("apu".equals(str)) {
                        n8 = n8.a(Z1.c.f(Z1.k.h(map, str)));
                    } else if ("apv".equals(str)) {
                        n8 = n8.b(Z1.c.f(Z1.k.h(map, str)));
                    } else if ("p2s".equals(str)) {
                        n8 = n8.p(Z1.c.f(Z1.k.h(map, str)));
                    } else if ("p2c".equals(str)) {
                        n8 = n8.o(Z1.k.d(map, str));
                    } else if ("iv".equals(str)) {
                        n8 = n8.j(Z1.c.f(Z1.k.h(map, str)));
                    } else if ("tag".equals(str)) {
                        n8 = n8.c(Z1.c.f(Z1.k.h(map, str)));
                    } else if ("skid".equals(str)) {
                        n8 = n8.q(Z1.k.h(map, str));
                    } else {
                        n8 = n8.h(str, map.get(str));
                    }
                }
            }
            return n8.d();
        }
        throw new ParseException("The algorithm \"alg\" header parameter must be for encryption", 0);
    }

    private static d B(Map map) {
        return d.d(Z1.k.h(map, "enc"));
    }

    public static Set w() {
        return f5767y;
    }

    public static m x(Z1.c cVar) {
        return y(cVar.c(), cVar);
    }

    public static m y(String str, Z1.c cVar) {
        return A(Z1.k.n(str, 20000), cVar);
    }

    @Override // K1.b, K1.e
    public Map j() {
        Map j8 = super.j();
        d dVar = this.f5768o;
        if (dVar != null) {
            j8.put("enc", dVar.toString());
        }
        R1.d dVar2 = this.f5769p;
        if (dVar2 != null) {
            j8.put("epk", dVar2.n());
        }
        c cVar = this.f5770q;
        if (cVar != null) {
            j8.put("zip", cVar.toString());
        }
        Z1.c cVar2 = this.f5771r;
        if (cVar2 != null) {
            j8.put("apu", cVar2.toString());
        }
        Z1.c cVar3 = this.f5772s;
        if (cVar3 != null) {
            j8.put("apv", cVar3.toString());
        }
        Z1.c cVar4 = this.f5773t;
        if (cVar4 != null) {
            j8.put("p2s", cVar4.toString());
        }
        int i8 = this.f5774u;
        if (i8 > 0) {
            j8.put("p2c", Integer.valueOf(i8));
        }
        Z1.c cVar5 = this.f5775v;
        if (cVar5 != null) {
            j8.put("iv", cVar5.toString());
        }
        Z1.c cVar6 = this.f5776w;
        if (cVar6 != null) {
            j8.put("tag", cVar6.toString());
        }
        String str = this.f5777x;
        if (str != null) {
            j8.put("skid", str);
        }
        return j8;
    }

    public i t() {
        return (i) super.a();
    }

    public c u() {
        return this.f5770q;
    }

    public d v() {
        return this.f5768o;
    }
}
