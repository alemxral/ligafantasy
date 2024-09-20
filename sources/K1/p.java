package K1;

/* loaded from: classes4.dex */
public final class p extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final p f5811d = new p("HS256", x.REQUIRED);

    /* renamed from: e, reason: collision with root package name */
    public static final p f5812e;

    /* renamed from: f, reason: collision with root package name */
    public static final p f5813f;

    /* renamed from: g, reason: collision with root package name */
    public static final p f5814g;

    /* renamed from: h, reason: collision with root package name */
    public static final p f5815h;

    /* renamed from: i, reason: collision with root package name */
    public static final p f5816i;

    /* renamed from: j, reason: collision with root package name */
    public static final p f5817j;

    /* renamed from: k, reason: collision with root package name */
    public static final p f5818k;

    /* renamed from: l, reason: collision with root package name */
    public static final p f5819l;

    /* renamed from: m, reason: collision with root package name */
    public static final p f5820m;

    /* renamed from: n, reason: collision with root package name */
    public static final p f5821n;

    /* renamed from: o, reason: collision with root package name */
    public static final p f5822o;

    /* renamed from: p, reason: collision with root package name */
    public static final p f5823p;

    /* renamed from: q, reason: collision with root package name */
    public static final p f5824q;

    static {
        x xVar = x.OPTIONAL;
        f5812e = new p("HS384", xVar);
        f5813f = new p("HS512", xVar);
        x xVar2 = x.RECOMMENDED;
        f5814g = new p("RS256", xVar2);
        f5815h = new p("RS384", xVar);
        f5816i = new p("RS512", xVar);
        f5817j = new p("ES256", xVar2);
        f5818k = new p("ES256K", xVar);
        f5819l = new p("ES384", xVar);
        f5820m = new p("ES512", xVar);
        f5821n = new p("PS256", xVar);
        f5822o = new p("PS384", xVar);
        f5823p = new p("PS512", xVar);
        f5824q = new p("EdDSA", xVar);
    }

    public p(String str, x xVar) {
        super(str, xVar);
    }

    public static p c(String str) {
        p pVar = f5811d;
        if (str.equals(pVar.a())) {
            return pVar;
        }
        p pVar2 = f5812e;
        if (str.equals(pVar2.a())) {
            return pVar2;
        }
        p pVar3 = f5813f;
        if (str.equals(pVar3.a())) {
            return pVar3;
        }
        p pVar4 = f5814g;
        if (str.equals(pVar4.a())) {
            return pVar4;
        }
        p pVar5 = f5815h;
        if (str.equals(pVar5.a())) {
            return pVar5;
        }
        p pVar6 = f5816i;
        if (str.equals(pVar6.a())) {
            return pVar6;
        }
        p pVar7 = f5817j;
        if (str.equals(pVar7.a())) {
            return pVar7;
        }
        p pVar8 = f5818k;
        if (str.equals(pVar8.a())) {
            return pVar8;
        }
        p pVar9 = f5819l;
        if (str.equals(pVar9.a())) {
            return pVar9;
        }
        p pVar10 = f5820m;
        if (str.equals(pVar10.a())) {
            return pVar10;
        }
        p pVar11 = f5821n;
        if (str.equals(pVar11.a())) {
            return pVar11;
        }
        p pVar12 = f5822o;
        if (str.equals(pVar12.a())) {
            return pVar12;
        }
        p pVar13 = f5823p;
        if (str.equals(pVar13.a())) {
            return pVar13;
        }
        p pVar14 = f5824q;
        if (str.equals(pVar14.a())) {
            return pVar14;
        }
        return new p(str);
    }

    public p(String str) {
        super(str, null);
    }
}
