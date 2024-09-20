package y1;

import z1.C4016d;

/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3968a {

    /* renamed from: a, reason: collision with root package name */
    private final C3981n f39657a;

    private C3968a(C3981n c3981n) {
        this.f39657a = c3981n;
    }

    public static C3968a a(AbstractC3969b abstractC3969b) {
        C3981n c3981n = (C3981n) abstractC3969b;
        E1.g.b(abstractC3969b, "AdSession is null");
        E1.g.l(c3981n);
        E1.g.g(c3981n);
        C3968a c3968a = new C3968a(c3981n);
        c3981n.w().i(c3968a);
        return c3968a;
    }

    public void b() {
        E1.g.g(this.f39657a);
        E1.g.j(this.f39657a);
        if (!this.f39657a.t()) {
            try {
                this.f39657a.g();
            } catch (Exception unused) {
            }
        }
        if (this.f39657a.t()) {
            this.f39657a.A();
        }
    }

    public void c(C4016d c4016d) {
        E1.g.b(c4016d, "VastProperties is null");
        E1.g.f(this.f39657a);
        E1.g.j(this.f39657a);
        this.f39657a.l(c4016d.a());
    }
}
