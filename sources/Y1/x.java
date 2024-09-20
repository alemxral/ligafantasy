package Y1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class x extends w {

    /* renamed from: c, reason: collision with root package name */
    private final C f12983c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12984d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12985e;

    /* renamed from: f, reason: collision with root package name */
    private final int f12986f;

    /* renamed from: g, reason: collision with root package name */
    private int f12987g;

    /* renamed from: h, reason: collision with root package name */
    private final C1515d f12988h;

    /* renamed from: i, reason: collision with root package name */
    private int f12989i;

    /* renamed from: j, reason: collision with root package name */
    private final C1515d f12990j;

    /* renamed from: k, reason: collision with root package name */
    private int f12991k;

    /* renamed from: l, reason: collision with root package name */
    private final C1515d f12992l;

    /* renamed from: m, reason: collision with root package name */
    private int f12993m;

    /* renamed from: n, reason: collision with root package name */
    private final C1515d f12994n;

    /* renamed from: o, reason: collision with root package name */
    private int f12995o;

    /* renamed from: p, reason: collision with root package name */
    private final C1515d f12996p;

    /* renamed from: q, reason: collision with root package name */
    private int f12997q;

    /* renamed from: r, reason: collision with root package name */
    private final C1515d f12998r;

    /* renamed from: s, reason: collision with root package name */
    private int f12999s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(C c8, int i8, int i9, int i10) {
        super(589824);
        this.f12983c = c8;
        this.f12984d = i8;
        this.f12985e = i9;
        this.f12986f = i10;
        this.f12988h = new C1515d();
        this.f12990j = new C1515d();
        this.f12992l = new C1515d();
        this.f12994n = new C1515d();
        this.f12996p = new C1515d();
        this.f12998r = new C1515d();
    }

    @Override // Y1.w
    public void b(String str, int i8, String... strArr) {
        this.f12990j.k(this.f12983c.B(str).f12753a).k(i8);
        if (strArr == null) {
            this.f12990j.k(0);
        } else {
            this.f12990j.k(strArr.length);
            for (String str2 : strArr) {
                this.f12990j.k(this.f12983c.y(str2).f12753a);
            }
        }
        this.f12989i++;
    }

    @Override // Y1.w
    public void c(String str) {
        this.f12999s = this.f12983c.e(str).f12753a;
    }

    @Override // Y1.w
    public void d(String str, int i8, String... strArr) {
        this.f12992l.k(this.f12983c.B(str).f12753a).k(i8);
        if (strArr == null) {
            this.f12992l.k(0);
        } else {
            this.f12992l.k(strArr.length);
            for (String str2 : strArr) {
                this.f12992l.k(this.f12983c.y(str2).f12753a);
            }
        }
        this.f12991k++;
    }

    @Override // Y1.w
    public void e(String str) {
        this.f12998r.k(this.f12983c.B(str).f12753a);
        this.f12997q++;
    }

    @Override // Y1.w
    public void f(String str, String... strArr) {
        this.f12996p.k(this.f12983c.e(str).f12753a);
        this.f12996p.k(strArr.length);
        for (String str2 : strArr) {
            this.f12996p.k(this.f12983c.e(str2).f12753a);
        }
        this.f12995o++;
    }

    @Override // Y1.w
    public void g(String str, int i8, String str2) {
        int D8;
        C1515d k8 = this.f12988h.k(this.f12983c.y(str).f12753a).k(i8);
        if (str2 == null) {
            D8 = 0;
        } else {
            D8 = this.f12983c.D(str2);
        }
        k8.k(D8);
        this.f12987g++;
    }

    @Override // Y1.w
    public void h(String str) {
        this.f12994n.k(this.f12983c.e(str).f12753a);
        this.f12993m++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        this.f12983c.D("Module");
        int i8 = this.f12988h.f12804b + 22 + this.f12990j.f12804b + this.f12992l.f12804b + this.f12994n.f12804b + this.f12996p.f12804b;
        if (this.f12997q > 0) {
            this.f12983c.D("ModulePackages");
            i8 += this.f12998r.f12804b + 8;
        }
        if (this.f12999s > 0) {
            this.f12983c.D("ModuleMainClass");
            return i8 + 8;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        int i8;
        int i9 = 0;
        if (this.f12997q > 0) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        int i10 = i8 + 1;
        if (this.f12999s > 0) {
            i9 = 1;
        }
        return i10 + i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(C1515d c1515d) {
        C1515d k8 = c1515d.k(this.f12983c.D("Module")).i(this.f12988h.f12804b + 16 + this.f12990j.f12804b + this.f12992l.f12804b + this.f12994n.f12804b + this.f12996p.f12804b).k(this.f12984d).k(this.f12985e).k(this.f12986f).k(this.f12987g);
        C1515d c1515d2 = this.f12988h;
        C1515d k9 = k8.h(c1515d2.f12803a, 0, c1515d2.f12804b).k(this.f12989i);
        C1515d c1515d3 = this.f12990j;
        C1515d k10 = k9.h(c1515d3.f12803a, 0, c1515d3.f12804b).k(this.f12991k);
        C1515d c1515d4 = this.f12992l;
        C1515d k11 = k10.h(c1515d4.f12803a, 0, c1515d4.f12804b).k(this.f12993m);
        C1515d c1515d5 = this.f12994n;
        C1515d k12 = k11.h(c1515d5.f12803a, 0, c1515d5.f12804b).k(this.f12995o);
        C1515d c1515d6 = this.f12996p;
        k12.h(c1515d6.f12803a, 0, c1515d6.f12804b);
        if (this.f12997q > 0) {
            C1515d k13 = c1515d.k(this.f12983c.D("ModulePackages")).i(this.f12998r.f12804b + 2).k(this.f12997q);
            C1515d c1515d7 = this.f12998r;
            k13.h(c1515d7.f12803a, 0, c1515d7.f12804b);
        }
        if (this.f12999s > 0) {
            c1515d.k(this.f12983c.D("ModuleMainClass")).i(2).k(this.f12999s);
        }
    }

    @Override // Y1.w
    public void a() {
    }
}
