package Y1;

import Y1.C1514c;

/* loaded from: classes4.dex */
public class h extends g {

    /* renamed from: A, reason: collision with root package name */
    private int f12817A;

    /* renamed from: B, reason: collision with root package name */
    private C1515d f12818B;

    /* renamed from: C, reason: collision with root package name */
    private int f12819C;

    /* renamed from: D, reason: collision with root package name */
    private C1515d f12820D;

    /* renamed from: E, reason: collision with root package name */
    private A f12821E;

    /* renamed from: F, reason: collision with root package name */
    private A f12822F;

    /* renamed from: G, reason: collision with root package name */
    private C1514c f12823G;

    /* renamed from: H, reason: collision with root package name */
    private int f12824H;

    /* renamed from: c, reason: collision with root package name */
    private int f12825c;

    /* renamed from: d, reason: collision with root package name */
    private final C f12826d;

    /* renamed from: e, reason: collision with root package name */
    private int f12827e;

    /* renamed from: f, reason: collision with root package name */
    private int f12828f;

    /* renamed from: g, reason: collision with root package name */
    private int f12829g;

    /* renamed from: h, reason: collision with root package name */
    private int f12830h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f12831i;

    /* renamed from: j, reason: collision with root package name */
    private o f12832j;

    /* renamed from: k, reason: collision with root package name */
    private o f12833k;

    /* renamed from: l, reason: collision with root package name */
    private v f12834l;

    /* renamed from: m, reason: collision with root package name */
    private v f12835m;

    /* renamed from: n, reason: collision with root package name */
    private int f12836n;

    /* renamed from: o, reason: collision with root package name */
    private C1515d f12837o;

    /* renamed from: p, reason: collision with root package name */
    private int f12838p;

    /* renamed from: q, reason: collision with root package name */
    private int f12839q;

    /* renamed from: r, reason: collision with root package name */
    private int f12840r;

    /* renamed from: s, reason: collision with root package name */
    private int f12841s;

    /* renamed from: t, reason: collision with root package name */
    private C1515d f12842t;

    /* renamed from: u, reason: collision with root package name */
    private C1513b f12843u;

    /* renamed from: v, reason: collision with root package name */
    private C1513b f12844v;

    /* renamed from: w, reason: collision with root package name */
    private C1513b f12845w;

    /* renamed from: x, reason: collision with root package name */
    private C1513b f12846x;

    /* renamed from: y, reason: collision with root package name */
    private x f12847y;

    /* renamed from: z, reason: collision with root package name */
    private int f12848z;

    public h(int i8) {
        this(null, i8);
    }

    private C1514c[] p() {
        C1514c.a aVar = new C1514c.a();
        aVar.b(this.f12823G);
        for (o oVar = this.f12832j; oVar != null; oVar = (o) oVar.f12876b) {
            oVar.e(aVar);
        }
        for (v vVar = this.f12834l; vVar != null; vVar = (v) vVar.f12927b) {
            vVar.H(aVar);
        }
        for (A a8 = this.f12821E; a8 != null; a8 = (A) a8.f13008b) {
            a8.e(aVar);
        }
        return aVar.d();
    }

    private byte[] s(byte[] bArr, boolean z8) {
        int i8;
        C1514c[] p8 = p();
        this.f12832j = null;
        this.f12833k = null;
        this.f12834l = null;
        this.f12835m = null;
        this.f12843u = null;
        this.f12844v = null;
        this.f12845w = null;
        this.f12846x = null;
        this.f12847y = null;
        int i9 = 0;
        this.f12848z = 0;
        this.f12817A = 0;
        this.f12818B = null;
        this.f12819C = 0;
        this.f12820D = null;
        this.f12821E = null;
        this.f12822F = null;
        this.f12823G = null;
        if (z8) {
            i8 = 3;
        } else {
            i8 = 0;
        }
        this.f12824H = i8;
        C1516e c1516e = new C1516e(bArr, 0, false);
        if (z8) {
            i9 = 8;
        }
        c1516e.a(this, p8, i9 | 256);
        return t();
    }

    @Override // Y1.g
    public final void a(int i8, int i9, String str, String str2, String str3, String[] strArr) {
        int i10;
        this.f12825c = i8;
        this.f12827e = i9;
        int i11 = i8 & 65535;
        this.f12828f = this.f12826d.f0(i11, str);
        if (str2 != null) {
            this.f12840r = this.f12826d.D(str2);
        }
        if (str3 == null) {
            i10 = 0;
        } else {
            i10 = this.f12826d.e(str3).f12753a;
        }
        this.f12829g = i10;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.f12830h = length;
            this.f12831i = new int[length];
            for (int i12 = 0; i12 < this.f12830h; i12++) {
                this.f12831i[i12] = this.f12826d.e(strArr[i12]).f12753a;
            }
        }
        if (this.f12824H == 1 && i11 >= 51) {
            this.f12824H = 2;
        }
    }

    @Override // Y1.g
    public final AbstractC1512a b(String str, boolean z8) {
        if (z8) {
            C1513b j8 = C1513b.j(this.f12826d, str, this.f12843u);
            this.f12843u = j8;
            return j8;
        }
        C1513b j9 = C1513b.j(this.f12826d, str, this.f12844v);
        this.f12844v = j9;
        return j9;
    }

    @Override // Y1.g
    public final void c(C1514c c1514c) {
        c1514c.f12800c = this.f12823G;
        this.f12823G = c1514c;
    }

    @Override // Y1.g
    public final n e(int i8, String str, String str2, String str3, Object obj) {
        o oVar = new o(this.f12826d, i8, str, str2, str3, obj);
        if (this.f12832j == null) {
            this.f12832j = oVar;
        } else {
            this.f12833k.f12876b = oVar;
        }
        this.f12833k = oVar;
        return oVar;
    }

    @Override // Y1.g
    public final void f(String str, String str2, String str3, int i8) {
        int i9;
        if (this.f12837o == null) {
            this.f12837o = new C1515d();
        }
        B e8 = this.f12826d.e(str);
        if (e8.f12759g == 0) {
            this.f12836n++;
            this.f12837o.k(e8.f12753a);
            C1515d c1515d = this.f12837o;
            int i10 = 0;
            if (str2 == null) {
                i9 = 0;
            } else {
                i9 = this.f12826d.e(str2).f12753a;
            }
            c1515d.k(i9);
            C1515d c1515d2 = this.f12837o;
            if (str3 != null) {
                i10 = this.f12826d.D(str3);
            }
            c1515d2.k(i10);
            this.f12837o.k(i8);
            e8.f12759g = this.f12836n;
        }
    }

    @Override // Y1.g
    public final u g(int i8, String str, String str2, String str3, String[] strArr) {
        v vVar = new v(this.f12826d, i8, str, str2, str3, strArr, this.f12824H);
        if (this.f12834l == null) {
            this.f12834l = vVar;
        } else {
            this.f12835m.f12927b = vVar;
        }
        this.f12835m = vVar;
        return vVar;
    }

    @Override // Y1.g
    public final w h(String str, int i8, String str2) {
        int D8;
        C c8 = this.f12826d;
        int i9 = c8.y(str).f12753a;
        if (str2 == null) {
            D8 = 0;
        } else {
            D8 = this.f12826d.D(str2);
        }
        x xVar = new x(c8, i9, i8, D8);
        this.f12847y = xVar;
        return xVar;
    }

    @Override // Y1.g
    public final void i(String str) {
        this.f12848z = this.f12826d.e(str).f12753a;
    }

    @Override // Y1.g
    public final void j(String str) {
        if (this.f12818B == null) {
            this.f12818B = new C1515d();
        }
        this.f12817A++;
        this.f12818B.k(this.f12826d.e(str).f12753a);
    }

    @Override // Y1.g
    public final void k(String str, String str2, String str3) {
        this.f12838p = this.f12826d.e(str).f12753a;
        if (str2 != null && str3 != null) {
            this.f12839q = this.f12826d.z(str2, str3);
        }
    }

    @Override // Y1.g
    public final void l(String str) {
        if (this.f12820D == null) {
            this.f12820D = new C1515d();
        }
        this.f12819C++;
        this.f12820D.k(this.f12826d.e(str).f12753a);
    }

    @Override // Y1.g
    public final z m(String str, String str2, String str3) {
        A a8 = new A(this.f12826d, str, str2, str3);
        if (this.f12821E == null) {
            this.f12821E = a8;
        } else {
            this.f12822F.f13008b = a8;
        }
        this.f12822F = a8;
        return a8;
    }

    @Override // Y1.g
    public final void n(String str, String str2) {
        if (str != null) {
            this.f12841s = this.f12826d.D(str);
        }
        if (str2 != null) {
            this.f12842t = new C1515d().a(str2, 0, Integer.MAX_VALUE);
        }
    }

    @Override // Y1.g
    public final AbstractC1512a o(int i8, E e8, String str, boolean z8) {
        if (z8) {
            C1513b i9 = C1513b.i(this.f12826d, i8, e8, str, this.f12845w);
            this.f12845w = i9;
            return i9;
        }
        C1513b i10 = C1513b.i(this.f12826d, i8, e8, str, this.f12846x);
        this.f12846x = i10;
        return i10;
    }

    protected ClassLoader q() {
        return getClass().getClassLoader();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String r(String str, String str2) {
        ClassLoader q8 = q();
        try {
            Class<?> cls = Class.forName(str.replace('/', '.'), false, q8);
            try {
                Class<?> cls2 = Class.forName(str2.replace('/', '.'), false, q8);
                if (cls.isAssignableFrom(cls2)) {
                    return str;
                }
                if (cls2.isAssignableFrom(cls)) {
                    return str2;
                }
                if (cls.isInterface() || cls2.isInterface()) {
                    return "java/lang/Object";
                }
                do {
                    cls = cls.getSuperclass();
                } while (!cls.isAssignableFrom(cls2));
                return cls.getName().replace('.', '/');
            } catch (ClassNotFoundException e8) {
                throw new TypeNotPresentException(str2, e8);
            }
        } catch (ClassNotFoundException e9) {
            throw new TypeNotPresentException(str, e9);
        }
    }

    public byte[] t() {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = (this.f12830h * 2) + 24;
        int i15 = 0;
        for (o oVar = this.f12832j; oVar != null; oVar = (o) oVar.f12876b) {
            i15++;
            i14 += oVar.f();
        }
        int i16 = 0;
        for (v vVar = this.f12834l; vVar != null; vVar = (v) vVar.f12927b) {
            i16++;
            i14 += vVar.K();
        }
        C1515d c1515d = this.f12837o;
        if (c1515d != null) {
            i14 += c1515d.f12804b + 8;
            this.f12826d.D("InnerClasses");
            i8 = 1;
        } else {
            i8 = 0;
        }
        if (this.f12838p != 0) {
            i8++;
            i14 += 10;
            this.f12826d.D("EnclosingMethod");
        }
        if ((this.f12827e & 4096) != 0 && (this.f12825c & 65535) < 49) {
            i8++;
            i14 += 6;
            this.f12826d.D("Synthetic");
        }
        if (this.f12840r != 0) {
            i8++;
            i14 += 8;
            this.f12826d.D("Signature");
        }
        if (this.f12841s != 0) {
            i8++;
            i14 += 8;
            this.f12826d.D("SourceFile");
        }
        C1515d c1515d2 = this.f12842t;
        if (c1515d2 != null) {
            i8++;
            i14 += c1515d2.f12804b + 6;
            this.f12826d.D("SourceDebugExtension");
        }
        if ((this.f12827e & 131072) != 0) {
            i8++;
            i14 += 6;
            this.f12826d.D("Deprecated");
        }
        C1513b c1513b = this.f12843u;
        if (c1513b != null) {
            i8++;
            i14 += c1513b.g("RuntimeVisibleAnnotations");
        }
        C1513b c1513b2 = this.f12844v;
        if (c1513b2 != null) {
            i8++;
            i14 += c1513b2.g("RuntimeInvisibleAnnotations");
        }
        C1513b c1513b3 = this.f12845w;
        if (c1513b3 != null) {
            i8++;
            i14 += c1513b3.g("RuntimeVisibleTypeAnnotations");
        }
        C1513b c1513b4 = this.f12846x;
        if (c1513b4 != null) {
            i8++;
            i14 += c1513b4.g("RuntimeInvisibleTypeAnnotations");
        }
        if (this.f12826d.L() > 0) {
            i8++;
            i14 += this.f12826d.L();
        }
        x xVar = this.f12847y;
        if (xVar != null) {
            i8 += xVar.j();
            i14 += this.f12847y.i();
        }
        if (this.f12848z != 0) {
            i8++;
            i14 += 8;
            this.f12826d.D("NestHost");
        }
        C1515d c1515d3 = this.f12818B;
        if (c1515d3 != null) {
            i8++;
            i14 += c1515d3.f12804b + 8;
            this.f12826d.D("NestMembers");
        }
        C1515d c1515d4 = this.f12820D;
        if (c1515d4 != null) {
            i8++;
            i14 += c1515d4.f12804b + 8;
            this.f12826d.D("PermittedSubclasses");
        }
        if ((this.f12827e & 65536) == 0 && this.f12821E == null) {
            i9 = 0;
            i10 = 0;
        } else {
            i9 = 0;
            i10 = 0;
            for (A a8 = this.f12821E; a8 != null; a8 = (A) a8.f13008b) {
                i10++;
                i9 += a8.f();
            }
            i8++;
            i14 += i9 + 8;
            this.f12826d.D("Record");
        }
        C1514c c1514c = this.f12823G;
        if (c1514c != null) {
            int d8 = i8 + c1514c.d();
            i14 += this.f12823G.a(this.f12826d);
            i8 = d8;
        }
        int Q8 = i14 + this.f12826d.Q();
        int P8 = this.f12826d.P();
        if (P8 <= 65535) {
            C1515d c1515d5 = new C1515d(Q8);
            c1515d5.i(-889275714).i(this.f12825c);
            this.f12826d.e0(c1515d5);
            if ((this.f12825c & 65535) < 49) {
                i11 = 4096;
            } else {
                i11 = 0;
            }
            c1515d5.k((~i11) & this.f12827e).k(this.f12828f).k(this.f12829g);
            c1515d5.k(this.f12830h);
            for (int i17 = 0; i17 < this.f12830h; i17++) {
                c1515d5.k(this.f12831i[i17]);
            }
            c1515d5.k(i15);
            for (o oVar2 = this.f12832j; oVar2 != null; oVar2 = (o) oVar2.f12876b) {
                oVar2.g(c1515d5);
            }
            c1515d5.k(i16);
            boolean z8 = false;
            boolean z9 = false;
            for (v vVar2 = this.f12834l; vVar2 != null; vVar2 = (v) vVar2.f12927b) {
                z8 |= vVar2.N();
                z9 |= vVar2.M();
                vVar2.R(c1515d5);
            }
            c1515d5.k(i8);
            if (this.f12837o != null) {
                C1515d k8 = c1515d5.k(this.f12826d.D("InnerClasses")).i(this.f12837o.f12804b + 2).k(this.f12836n);
                C1515d c1515d6 = this.f12837o;
                k8.h(c1515d6.f12803a, 0, c1515d6.f12804b);
            }
            if (this.f12838p != 0) {
                c1515d5.k(this.f12826d.D("EnclosingMethod")).i(4).k(this.f12838p).k(this.f12839q);
            }
            if ((this.f12827e & 4096) != 0 && (this.f12825c & 65535) < 49) {
                c1515d5.k(this.f12826d.D("Synthetic")).i(0);
            }
            if (this.f12840r != 0) {
                i12 = 2;
                c1515d5.k(this.f12826d.D("Signature")).i(2).k(this.f12840r);
            } else {
                i12 = 2;
            }
            if (this.f12841s != 0) {
                c1515d5.k(this.f12826d.D("SourceFile")).i(i12).k(this.f12841s);
            }
            C1515d c1515d7 = this.f12842t;
            if (c1515d7 != null) {
                int i18 = c1515d7.f12804b;
                i13 = 0;
                c1515d5.k(this.f12826d.D("SourceDebugExtension")).i(i18).h(this.f12842t.f12803a, 0, i18);
            } else {
                i13 = 0;
            }
            if ((this.f12827e & 131072) != 0) {
                c1515d5.k(this.f12826d.D("Deprecated")).i(i13);
            }
            C1513b.l(this.f12826d, this.f12843u, this.f12844v, this.f12845w, this.f12846x, c1515d5);
            this.f12826d.d0(c1515d5);
            x xVar2 = this.f12847y;
            if (xVar2 != null) {
                xVar2.k(c1515d5);
            }
            if (this.f12848z != 0) {
                c1515d5.k(this.f12826d.D("NestHost")).i(2).k(this.f12848z);
            }
            if (this.f12818B != null) {
                C1515d k9 = c1515d5.k(this.f12826d.D("NestMembers")).i(this.f12818B.f12804b + 2).k(this.f12817A);
                C1515d c1515d8 = this.f12818B;
                k9.h(c1515d8.f12803a, 0, c1515d8.f12804b);
            }
            if (this.f12820D != null) {
                C1515d k10 = c1515d5.k(this.f12826d.D("PermittedSubclasses")).i(this.f12820D.f12804b + 2).k(this.f12819C);
                C1515d c1515d9 = this.f12820D;
                k10.h(c1515d9.f12803a, 0, c1515d9.f12804b);
            }
            if ((this.f12827e & 65536) != 0 || this.f12821E != null) {
                c1515d5.k(this.f12826d.D("Record")).i(i9 + 2).k(i10);
                for (A a9 = this.f12821E; a9 != null; a9 = (A) a9.f13008b) {
                    a9.g(c1515d5);
                }
            }
            C1514c c1514c2 = this.f12823G;
            if (c1514c2 != null) {
                c1514c2.g(this.f12826d, c1515d5);
            }
            if (z9) {
                return s(c1515d5.f12803a, z8);
            }
            return c1515d5.f12803a;
        }
        throw new C1517f(this.f12826d.O(), P8);
    }

    public h(C1516e c1516e, int i8) {
        super(589824);
        this.f12826d = c1516e == null ? new C(this) : new C(this, c1516e);
        if ((i8 & 2) != 0) {
            this.f12824H = 4;
        } else if ((i8 & 1) != 0) {
            this.f12824H = 1;
        } else {
            this.f12824H = 0;
        }
    }

    @Override // Y1.g
    public final void d() {
    }
}
