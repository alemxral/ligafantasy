package Z6;

/* loaded from: classes5.dex */
public class j extends c {
    @Override // Y6.e
    public int a(byte[] bArr, int i8) {
        n();
        E7.f.i(this.f13424e, bArr, i8);
        E7.f.i(this.f13425f, bArr, i8 + 8);
        E7.f.i(this.f13426g, bArr, i8 + 16);
        E7.f.i(this.f13427h, bArr, i8 + 24);
        E7.f.i(this.f13428i, bArr, i8 + 32);
        E7.f.i(this.f13429j, bArr, i8 + 40);
        E7.f.i(this.f13430k, bArr, i8 + 48);
        E7.f.i(this.f13431l, bArr, i8 + 56);
        r();
        return 64;
    }

    @Override // Y6.e
    public String e() {
        return "SHA-512";
    }

    @Override // Y6.e
    public int f() {
        return 64;
    }

    @Override // Z6.c
    public void r() {
        super.r();
        this.f13424e = 7640891576956012808L;
        this.f13425f = -4942790177534073029L;
        this.f13426g = 4354685564936845355L;
        this.f13427h = -6534734903238641935L;
        this.f13428i = 5840696475078001361L;
        this.f13429j = -7276294671716946913L;
        this.f13430k = 2270897969802886507L;
        this.f13431l = 6620516959819538809L;
    }
}
