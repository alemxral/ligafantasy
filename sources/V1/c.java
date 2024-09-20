package V1;

/* loaded from: classes4.dex */
abstract class c extends b {

    /* renamed from: y, reason: collision with root package name */
    protected int f11868y;

    public c(int i8) {
        super(i8);
    }

    @Override // V1.b
    protected void j(boolean[] zArr) {
        int i8 = this.f11853g;
        s(zArr);
        v(i8, this.f11853g);
    }

    @Override // V1.b
    protected Object l(boolean[] zArr) {
        int i8 = this.f11853g;
        f();
        r();
        char c8 = this.f11847a;
        if (c8 != '.' && c8 != 'E' && c8 != 'e') {
            t();
            char c9 = this.f11847a;
            if (c9 >= 0 && c9 < '~' && !zArr[c9] && c9 != 26) {
                s(zArr);
                v(i8, this.f11853g);
                if (this.f11856j) {
                    return this.f11852f;
                }
                throw new e(this.f11853g, 1, this.f11852f);
            }
            v(i8, this.f11853g);
            return e(this.f11852f);
        }
        if (c8 == '.') {
            f();
            r();
        }
        char c10 = this.f11847a;
        if (c10 != 'E' && c10 != 'e') {
            t();
            char c11 = this.f11847a;
            if (c11 >= 0 && c11 < '~' && !zArr[c11] && c11 != 26) {
                s(zArr);
                v(i8, this.f11853g);
                if (this.f11856j) {
                    return this.f11852f;
                }
                throw new e(this.f11853g, 1, this.f11852f);
            }
            v(i8, this.f11853g);
            return c();
        }
        this.f11850d.a('E');
        f();
        char c12 = this.f11847a;
        if (c12 != '+' && c12 != '-' && (c12 < '0' || c12 > '9')) {
            s(zArr);
            v(i8, this.f11853g);
            if (this.f11856j) {
                if (!this.f11854h) {
                    b();
                }
                return this.f11852f;
            }
            throw new e(this.f11853g, 1, this.f11852f);
        }
        this.f11850d.a(c12);
        f();
        r();
        t();
        char c13 = this.f11847a;
        if (c13 >= 0 && c13 < '~' && !zArr[c13] && c13 != 26) {
            s(zArr);
            v(i8, this.f11853g);
            if (this.f11856j) {
                return this.f11852f;
            }
            throw new e(this.f11853g, 1, this.f11852f);
        }
        v(i8, this.f11853g);
        return c();
    }

    @Override // V1.b
    protected void o() {
        if (!this.f11857k && this.f11847a == '\'') {
            if (this.f11856j) {
                j(b.f11842t);
                return;
            }
            throw new e(this.f11853g, 0, Character.valueOf(this.f11847a));
        }
        int w8 = w(this.f11847a, this.f11853g + 1);
        if (w8 != -1) {
            u(this.f11853g + 1, w8);
            if (this.f11852f.indexOf(92) == -1) {
                a();
                this.f11853g = w8;
                f();
                return;
            } else {
                this.f11850d.b();
                p();
                return;
            }
        }
        throw new e(this.f11868y, 3, null);
    }

    protected abstract void u(int i8, int i9);

    protected abstract void v(int i8, int i9);

    protected abstract int w(char c8, int i8);
}
