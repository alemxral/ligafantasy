package X6;

import R6.AbstractC1346m;
import R6.AbstractC1351s;
import R6.AbstractC1353u;
import R6.C1337e;
import R6.C1338e0;
import R6.C1347n;
import R6.InterfaceC1335d;

/* loaded from: classes5.dex */
public class a extends AbstractC1346m {

    /* renamed from: a, reason: collision with root package name */
    private C1347n f12735a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC1335d f12736b;

    public a(C1347n c1347n) {
        this.f12735a = c1347n;
    }

    public static a p(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(AbstractC1353u.w(obj));
        }
        return null;
    }

    @Override // R6.AbstractC1346m, R6.InterfaceC1335d
    public AbstractC1351s d() {
        C1337e c1337e = new C1337e(2);
        c1337e.a(this.f12735a);
        InterfaceC1335d interfaceC1335d = this.f12736b;
        if (interfaceC1335d != null) {
            c1337e.a(interfaceC1335d);
        }
        return new C1338e0(c1337e);
    }

    public C1347n m() {
        return this.f12735a;
    }

    public InterfaceC1335d q() {
        return this.f12736b;
    }

    public a(C1347n c1347n, InterfaceC1335d interfaceC1335d) {
        this.f12735a = c1347n;
        this.f12736b = interfaceC1335d;
    }

    private a(AbstractC1353u abstractC1353u) {
        if (abstractC1353u.size() >= 1 && abstractC1353u.size() <= 2) {
            this.f12735a = C1347n.B(abstractC1353u.x(0));
            this.f12736b = abstractC1353u.size() == 2 ? abstractC1353u.x(1) : null;
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC1353u.size());
        }
    }
}
