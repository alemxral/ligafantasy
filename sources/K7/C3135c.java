package k7;

import R6.AbstractC1346m;
import R6.AbstractC1348o;
import R6.AbstractC1351s;
import R6.AbstractC1353u;
import R6.C1330a0;
import R6.C1337e;
import R6.C1338e0;
import R6.C1344k;

/* renamed from: k7.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3135c extends AbstractC1346m {

    /* renamed from: a, reason: collision with root package name */
    private int f33629a;

    /* renamed from: b, reason: collision with root package name */
    private int f33630b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f33631c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f33632d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f33633e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f33634f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f33635g;

    public C3135c(int i8, int i9, D7.b bVar, D7.i iVar, D7.h hVar, D7.h hVar2, D7.a aVar) {
        this.f33629a = i8;
        this.f33630b = i9;
        this.f33631c = bVar.e();
        this.f33632d = iVar.h();
        this.f33633e = aVar.c();
        this.f33634f = hVar.a();
        this.f33635g = hVar2.a();
    }

    public static C3135c q(Object obj) {
        if (obj instanceof C3135c) {
            return (C3135c) obj;
        }
        if (obj != null) {
            return new C3135c(AbstractC1353u.w(obj));
        }
        return null;
    }

    @Override // R6.AbstractC1346m, R6.InterfaceC1335d
    public AbstractC1351s d() {
        C1337e c1337e = new C1337e();
        c1337e.a(new C1344k(this.f33629a));
        c1337e.a(new C1344k(this.f33630b));
        c1337e.a(new C1330a0(this.f33631c));
        c1337e.a(new C1330a0(this.f33632d));
        c1337e.a(new C1330a0(this.f33634f));
        c1337e.a(new C1330a0(this.f33635g));
        c1337e.a(new C1330a0(this.f33633e));
        return new C1338e0(c1337e);
    }

    public D7.b m() {
        return new D7.b(this.f33631c);
    }

    public D7.i p() {
        return new D7.i(m(), this.f33632d);
    }

    public int r() {
        return this.f33630b;
    }

    public int s() {
        return this.f33629a;
    }

    public D7.h t() {
        return new D7.h(this.f33634f);
    }

    public D7.h u() {
        return new D7.h(this.f33635g);
    }

    public D7.a v() {
        return new D7.a(this.f33633e);
    }

    private C3135c(AbstractC1353u abstractC1353u) {
        this.f33629a = ((C1344k) abstractC1353u.x(0)).B();
        this.f33630b = ((C1344k) abstractC1353u.x(1)).B();
        this.f33631c = ((AbstractC1348o) abstractC1353u.x(2)).y();
        this.f33632d = ((AbstractC1348o) abstractC1353u.x(3)).y();
        this.f33634f = ((AbstractC1348o) abstractC1353u.x(4)).y();
        this.f33635g = ((AbstractC1348o) abstractC1353u.x(5)).y();
        this.f33633e = ((AbstractC1348o) abstractC1353u.x(6)).y();
    }
}
