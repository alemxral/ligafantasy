package k7;

import R6.AbstractC1346m;
import R6.AbstractC1348o;
import R6.AbstractC1351s;
import R6.AbstractC1353u;
import R6.C1330a0;
import R6.C1337e;
import R6.C1338e0;
import R6.C1344k;

/* renamed from: k7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3133a extends AbstractC1346m {

    /* renamed from: a, reason: collision with root package name */
    private int f33619a;

    /* renamed from: b, reason: collision with root package name */
    private int f33620b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f33621c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f33622d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f33623e;

    /* renamed from: f, reason: collision with root package name */
    private X6.a f33624f;

    public C3133a(int i8, int i9, D7.b bVar, D7.i iVar, D7.h hVar, X6.a aVar) {
        this.f33619a = i8;
        this.f33620b = i9;
        this.f33621c = bVar.e();
        this.f33622d = iVar.h();
        this.f33623e = hVar.a();
        this.f33624f = aVar;
    }

    public static C3133a r(Object obj) {
        if (obj instanceof C3133a) {
            return (C3133a) obj;
        }
        if (obj != null) {
            return new C3133a(AbstractC1353u.w(obj));
        }
        return null;
    }

    @Override // R6.AbstractC1346m, R6.InterfaceC1335d
    public AbstractC1351s d() {
        C1337e c1337e = new C1337e();
        c1337e.a(new C1344k(this.f33619a));
        c1337e.a(new C1344k(this.f33620b));
        c1337e.a(new C1330a0(this.f33621c));
        c1337e.a(new C1330a0(this.f33622d));
        c1337e.a(new C1330a0(this.f33623e));
        c1337e.a(this.f33624f);
        return new C1338e0(c1337e);
    }

    public X6.a m() {
        return this.f33624f;
    }

    public D7.b p() {
        return new D7.b(this.f33621c);
    }

    public D7.i q() {
        return new D7.i(p(), this.f33622d);
    }

    public int s() {
        return this.f33620b;
    }

    public int t() {
        return this.f33619a;
    }

    public D7.h u() {
        return new D7.h(this.f33623e);
    }

    private C3133a(AbstractC1353u abstractC1353u) {
        this.f33619a = ((C1344k) abstractC1353u.x(0)).B();
        this.f33620b = ((C1344k) abstractC1353u.x(1)).B();
        this.f33621c = ((AbstractC1348o) abstractC1353u.x(2)).y();
        this.f33622d = ((AbstractC1348o) abstractC1353u.x(3)).y();
        this.f33623e = ((AbstractC1348o) abstractC1353u.x(4)).y();
        this.f33624f = X6.a.p(abstractC1353u.x(5));
    }
}
