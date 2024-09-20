package Y1;

import Y1.C1514c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class A extends z {

    /* renamed from: c, reason: collision with root package name */
    private final C f12744c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12745d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12746e;

    /* renamed from: f, reason: collision with root package name */
    private int f12747f;

    /* renamed from: g, reason: collision with root package name */
    private C1513b f12748g;

    /* renamed from: h, reason: collision with root package name */
    private C1513b f12749h;

    /* renamed from: i, reason: collision with root package name */
    private C1513b f12750i;

    /* renamed from: j, reason: collision with root package name */
    private C1513b f12751j;

    /* renamed from: k, reason: collision with root package name */
    private C1514c f12752k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(C c8, String str, String str2, String str3) {
        super(589824);
        this.f12744c = c8;
        this.f12745d = c8.D(str);
        this.f12746e = c8.D(str2);
        if (str3 != null) {
            this.f12747f = c8.D(str3);
        }
    }

    @Override // Y1.z
    public AbstractC1512a a(String str, boolean z8) {
        if (z8) {
            C1513b j8 = C1513b.j(this.f12744c, str, this.f12748g);
            this.f12748g = j8;
            return j8;
        }
        C1513b j9 = C1513b.j(this.f12744c, str, this.f12749h);
        this.f12749h = j9;
        return j9;
    }

    @Override // Y1.z
    public void b(C1514c c1514c) {
        c1514c.f12800c = this.f12752k;
        this.f12752k = c1514c;
    }

    @Override // Y1.z
    public AbstractC1512a d(int i8, E e8, String str, boolean z8) {
        if (z8) {
            C1513b i9 = C1513b.i(this.f12744c, i8, e8, str, this.f12750i);
            this.f12750i = i9;
            return i9;
        }
        C1513b i10 = C1513b.i(this.f12744c, i8, e8, str, this.f12751j);
        this.f12751j = i10;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(C1514c.a aVar) {
        aVar.b(this.f12752k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        int b8 = C1514c.b(this.f12744c, 0, this.f12747f) + 6 + C1513b.f(this.f12748g, this.f12749h, this.f12750i, this.f12751j);
        C1514c c1514c = this.f12752k;
        if (c1514c != null) {
            return b8 + c1514c.a(this.f12744c);
        }
        return b8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(C1515d c1515d) {
        int i8;
        c1515d.k(this.f12745d).k(this.f12746e);
        if (this.f12747f != 0) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        if (this.f12748g != null) {
            i8++;
        }
        if (this.f12749h != null) {
            i8++;
        }
        if (this.f12750i != null) {
            i8++;
        }
        if (this.f12751j != null) {
            i8++;
        }
        C1514c c1514c = this.f12752k;
        if (c1514c != null) {
            i8 += c1514c.d();
        }
        c1515d.k(i8);
        C1514c.f(this.f12744c, 0, this.f12747f, c1515d);
        C1513b.l(this.f12744c, this.f12748g, this.f12749h, this.f12750i, this.f12751j, c1515d);
        C1514c c1514c2 = this.f12752k;
        if (c1514c2 != null) {
            c1514c2.g(this.f12744c, c1515d);
        }
    }

    @Override // Y1.z
    public void c() {
    }
}
