package V1;

import T1.i;
import X1.f;

/* loaded from: classes4.dex */
class d extends c {

    /* renamed from: z, reason: collision with root package name */
    private String f11869z;

    public d(int i8) {
        super(i8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // V1.b
    public void f() {
        int i8 = this.f11853g + 1;
        this.f11853g = i8;
        if (i8 >= this.f11868y) {
            this.f11847a = (char) 26;
        } else {
            this.f11847a = this.f11869z.charAt(i8);
        }
    }

    @Override // V1.b
    protected void k() {
        int i8 = this.f11853g + 1;
        this.f11853g = i8;
        if (i8 < this.f11868y) {
            this.f11847a = this.f11869z.charAt(i8);
        } else {
            this.f11847a = (char) 26;
            throw new e(this.f11853g - 1, 3, "EOF");
        }
    }

    @Override // V1.b
    protected void n() {
        int i8 = this.f11853g + 1;
        this.f11853g = i8;
        if (i8 >= this.f11868y) {
            this.f11847a = (char) 26;
        } else {
            this.f11847a = this.f11869z.charAt(i8);
        }
    }

    @Override // V1.c
    protected void u(int i8, int i9) {
        this.f11852f = this.f11869z.substring(i8, i9);
    }

    @Override // V1.c
    protected void v(int i8, int i9) {
        while (i8 < i9 - 1 && Character.isWhitespace(this.f11869z.charAt(i8))) {
            i8++;
        }
        while (true) {
            int i10 = i9 - 1;
            if (i10 <= i8 || !Character.isWhitespace(this.f11869z.charAt(i10))) {
                break;
            } else {
                i9--;
            }
        }
        u(i8, i9);
    }

    @Override // V1.c
    protected int w(char c8, int i8) {
        return this.f11869z.indexOf(c8, i8);
    }

    public Object x(String str) {
        return y(str, i.f9691c.f12193b);
    }

    public Object y(String str, f fVar) {
        this.f11848b = fVar.f12196a;
        this.f11869z = str;
        this.f11868y = str.length();
        return d(fVar);
    }
}
