package k7;

import R6.AbstractC1346m;
import R6.AbstractC1348o;
import R6.AbstractC1351s;
import R6.AbstractC1353u;
import R6.C1330a0;
import R6.C1337e;
import R6.C1338e0;
import R6.C1344k;

/* renamed from: k7.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3134b extends AbstractC1346m {

    /* renamed from: a, reason: collision with root package name */
    private final int f33625a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33626b;

    /* renamed from: c, reason: collision with root package name */
    private final D7.a f33627c;

    /* renamed from: d, reason: collision with root package name */
    private final X6.a f33628d;

    public C3134b(int i8, int i9, D7.a aVar, X6.a aVar2) {
        this.f33625a = i8;
        this.f33626b = i9;
        this.f33627c = new D7.a(aVar.c());
        this.f33628d = aVar2;
    }

    public static C3134b q(Object obj) {
        if (obj instanceof C3134b) {
            return (C3134b) obj;
        }
        if (obj != null) {
            return new C3134b(AbstractC1353u.w(obj));
        }
        return null;
    }

    @Override // R6.AbstractC1346m, R6.InterfaceC1335d
    public AbstractC1351s d() {
        C1337e c1337e = new C1337e();
        c1337e.a(new C1344k(this.f33625a));
        c1337e.a(new C1344k(this.f33626b));
        c1337e.a(new C1330a0(this.f33627c.c()));
        c1337e.a(this.f33628d);
        return new C1338e0(c1337e);
    }

    public X6.a m() {
        return this.f33628d;
    }

    public D7.a p() {
        return this.f33627c;
    }

    public int r() {
        return this.f33625a;
    }

    public int s() {
        return this.f33626b;
    }

    private C3134b(AbstractC1353u abstractC1353u) {
        this.f33625a = ((C1344k) abstractC1353u.x(0)).B();
        this.f33626b = ((C1344k) abstractC1353u.x(1)).B();
        this.f33627c = new D7.a(((AbstractC1348o) abstractC1353u.x(2)).y());
        this.f33628d = X6.a.p(abstractC1353u.x(3));
    }
}
