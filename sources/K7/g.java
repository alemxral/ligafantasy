package k7;

import R6.AbstractC1346m;
import R6.AbstractC1348o;
import R6.AbstractC1351s;
import R6.AbstractC1353u;
import R6.C1330a0;
import R6.C1337e;
import R6.C1338e0;
import R6.C1344k;
import R6.C1347n;
import R6.InterfaceC1335d;
import q7.AbstractC3664a;

/* loaded from: classes5.dex */
public class g extends AbstractC1346m {

    /* renamed from: a, reason: collision with root package name */
    private C1344k f33698a;

    /* renamed from: b, reason: collision with root package name */
    private C1347n f33699b;

    /* renamed from: c, reason: collision with root package name */
    private C1344k f33700c;

    /* renamed from: d, reason: collision with root package name */
    private byte[][] f33701d;

    /* renamed from: e, reason: collision with root package name */
    private byte[][] f33702e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f33703f;

    public g(int i8, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f33698a = new C1344k(0L);
        this.f33700c = new C1344k(i8);
        this.f33701d = AbstractC3664a.c(sArr);
        this.f33702e = AbstractC3664a.c(sArr2);
        this.f33703f = AbstractC3664a.a(sArr3);
    }

    public static g s(Object obj) {
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj != null) {
            return new g(AbstractC1353u.w(obj));
        }
        return null;
    }

    @Override // R6.AbstractC1346m, R6.InterfaceC1335d
    public AbstractC1351s d() {
        C1337e c1337e = new C1337e();
        InterfaceC1335d interfaceC1335d = this.f33698a;
        if (interfaceC1335d == null) {
            interfaceC1335d = this.f33699b;
        }
        c1337e.a(interfaceC1335d);
        c1337e.a(this.f33700c);
        C1337e c1337e2 = new C1337e();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            byte[][] bArr = this.f33701d;
            if (i9 >= bArr.length) {
                break;
            }
            c1337e2.a(new C1330a0(bArr[i9]));
            i9++;
        }
        c1337e.a(new C1338e0(c1337e2));
        C1337e c1337e3 = new C1337e();
        while (true) {
            byte[][] bArr2 = this.f33702e;
            if (i8 < bArr2.length) {
                c1337e3.a(new C1330a0(bArr2[i8]));
                i8++;
            } else {
                c1337e.a(new C1338e0(c1337e3));
                C1337e c1337e4 = new C1337e();
                c1337e4.a(new C1330a0(this.f33703f));
                c1337e.a(new C1338e0(c1337e4));
                return new C1338e0(c1337e);
            }
        }
    }

    public short[][] m() {
        return AbstractC3664a.d(this.f33701d);
    }

    public short[] p() {
        return AbstractC3664a.b(this.f33703f);
    }

    public short[][] q() {
        return AbstractC3664a.d(this.f33702e);
    }

    public int r() {
        return this.f33700c.B();
    }

    private g(AbstractC1353u abstractC1353u) {
        if (abstractC1353u.x(0) instanceof C1344k) {
            this.f33698a = C1344k.x(abstractC1353u.x(0));
        } else {
            this.f33699b = C1347n.B(abstractC1353u.x(0));
        }
        this.f33700c = C1344k.x(abstractC1353u.x(1));
        AbstractC1353u w8 = AbstractC1353u.w(abstractC1353u.x(2));
        this.f33701d = new byte[w8.size()];
        for (int i8 = 0; i8 < w8.size(); i8++) {
            this.f33701d[i8] = AbstractC1348o.x(w8.x(i8)).y();
        }
        AbstractC1353u abstractC1353u2 = (AbstractC1353u) abstractC1353u.x(3);
        this.f33702e = new byte[abstractC1353u2.size()];
        for (int i9 = 0; i9 < abstractC1353u2.size(); i9++) {
            this.f33702e[i9] = AbstractC1348o.x(abstractC1353u2.x(i9)).y();
        }
        this.f33703f = AbstractC1348o.x(((AbstractC1353u) abstractC1353u.x(4)).x(0)).y();
    }
}
