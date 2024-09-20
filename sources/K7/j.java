package k7;

import R6.AbstractC1346m;
import R6.AbstractC1351s;
import R6.AbstractC1353u;
import R6.C1337e;
import R6.C1338e0;
import R6.C1344k;

/* loaded from: classes5.dex */
public class j extends AbstractC1346m {

    /* renamed from: a, reason: collision with root package name */
    private final C1344k f33709a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33710b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33711c;

    /* renamed from: d, reason: collision with root package name */
    private final X6.a f33712d;

    public j(int i8, int i9, X6.a aVar) {
        this.f33709a = new C1344k(0L);
        this.f33710b = i8;
        this.f33711c = i9;
        this.f33712d = aVar;
    }

    public static j p(Object obj) {
        if (obj instanceof j) {
            return (j) obj;
        }
        if (obj != null) {
            return new j(AbstractC1353u.w(obj));
        }
        return null;
    }

    @Override // R6.AbstractC1346m, R6.InterfaceC1335d
    public AbstractC1351s d() {
        C1337e c1337e = new C1337e();
        c1337e.a(this.f33709a);
        c1337e.a(new C1344k(this.f33710b));
        c1337e.a(new C1344k(this.f33711c));
        c1337e.a(this.f33712d);
        return new C1338e0(c1337e);
    }

    public int m() {
        return this.f33710b;
    }

    public int q() {
        return this.f33711c;
    }

    public X6.a r() {
        return this.f33712d;
    }

    private j(AbstractC1353u abstractC1353u) {
        this.f33709a = C1344k.x(abstractC1353u.x(0));
        this.f33710b = C1344k.x(abstractC1353u.x(1)).B();
        this.f33711c = C1344k.x(abstractC1353u.x(2)).B();
        this.f33712d = X6.a.p(abstractC1353u.x(3));
    }
}
