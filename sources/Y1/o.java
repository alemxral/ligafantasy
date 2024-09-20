package Y1;

import Y1.C1514c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class o extends n {

    /* renamed from: c, reason: collision with root package name */
    private final C f12877c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12878d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12879e;

    /* renamed from: f, reason: collision with root package name */
    private final int f12880f;

    /* renamed from: g, reason: collision with root package name */
    private int f12881g;

    /* renamed from: h, reason: collision with root package name */
    private int f12882h;

    /* renamed from: i, reason: collision with root package name */
    private C1513b f12883i;

    /* renamed from: j, reason: collision with root package name */
    private C1513b f12884j;

    /* renamed from: k, reason: collision with root package name */
    private C1513b f12885k;

    /* renamed from: l, reason: collision with root package name */
    private C1513b f12886l;

    /* renamed from: m, reason: collision with root package name */
    private C1514c f12887m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(C c8, int i8, String str, String str2, String str3, Object obj) {
        super(589824);
        this.f12877c = c8;
        this.f12878d = i8;
        this.f12879e = c8.D(str);
        this.f12880f = c8.D(str2);
        if (str3 != null) {
            this.f12881g = c8.D(str3);
        }
        if (obj != null) {
            this.f12882h = c8.d(obj).f12753a;
        }
    }

    @Override // Y1.n
    public AbstractC1512a a(String str, boolean z8) {
        if (z8) {
            C1513b j8 = C1513b.j(this.f12877c, str, this.f12883i);
            this.f12883i = j8;
            return j8;
        }
        C1513b j9 = C1513b.j(this.f12877c, str, this.f12884j);
        this.f12884j = j9;
        return j9;
    }

    @Override // Y1.n
    public void b(C1514c c1514c) {
        c1514c.f12800c = this.f12887m;
        this.f12887m = c1514c;
    }

    @Override // Y1.n
    public AbstractC1512a d(int i8, E e8, String str, boolean z8) {
        if (z8) {
            C1513b i9 = C1513b.i(this.f12877c, i8, e8, str, this.f12885k);
            this.f12885k = i9;
            return i9;
        }
        C1513b i10 = C1513b.i(this.f12877c, i8, e8, str, this.f12886l);
        this.f12886l = i10;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(C1514c.a aVar) {
        aVar.b(this.f12887m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        int i8;
        if (this.f12882h != 0) {
            this.f12877c.D("ConstantValue");
            i8 = 16;
        } else {
            i8 = 8;
        }
        int b8 = i8 + C1514c.b(this.f12877c, this.f12878d, this.f12881g) + C1513b.f(this.f12883i, this.f12884j, this.f12885k, this.f12886l);
        C1514c c1514c = this.f12887m;
        if (c1514c != null) {
            return b8 + c1514c.a(this.f12877c);
        }
        return b8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(C1515d c1515d) {
        boolean z8;
        int i8;
        int i9 = 0;
        if (this.f12877c.R() < 49) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            i8 = 4096;
        } else {
            i8 = 0;
        }
        c1515d.k((~i8) & this.f12878d).k(this.f12879e).k(this.f12880f);
        if (this.f12882h != 0) {
            i9 = 1;
        }
        int i10 = this.f12878d;
        if ((i10 & 4096) != 0 && z8) {
            i9++;
        }
        if (this.f12881g != 0) {
            i9++;
        }
        if ((131072 & i10) != 0) {
            i9++;
        }
        if (this.f12883i != null) {
            i9++;
        }
        if (this.f12884j != null) {
            i9++;
        }
        if (this.f12885k != null) {
            i9++;
        }
        if (this.f12886l != null) {
            i9++;
        }
        C1514c c1514c = this.f12887m;
        if (c1514c != null) {
            i9 += c1514c.d();
        }
        c1515d.k(i9);
        if (this.f12882h != 0) {
            c1515d.k(this.f12877c.D("ConstantValue")).i(2).k(this.f12882h);
        }
        C1514c.f(this.f12877c, this.f12878d, this.f12881g, c1515d);
        C1513b.l(this.f12877c, this.f12883i, this.f12884j, this.f12885k, this.f12886l, c1515d);
        C1514c c1514c2 = this.f12887m;
        if (c1514c2 != null) {
            c1514c2.g(this.f12877c, c1515d);
        }
    }

    @Override // Y1.n
    public void c() {
    }
}
