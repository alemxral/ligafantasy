package t7;

import t7.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final m f38289a;

    /* renamed from: b, reason: collision with root package name */
    private final h f38290b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f38291c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f38292d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(m mVar) {
        if (mVar != null) {
            this.f38289a = mVar;
            int c8 = mVar.c();
            this.f38290b = new h(mVar.b(), c8);
            this.f38291c = new byte[c8];
            this.f38292d = new byte[c8];
            return;
        }
        throw new NullPointerException("params == null");
    }

    private byte[] a(byte[] bArr, int i8, int i9, j jVar) {
        int c8 = this.f38289a.c();
        if (bArr != null) {
            if (bArr.length == c8) {
                if (jVar != null) {
                    if (jVar.d() != null) {
                        int i10 = i8 + i9;
                        if (i10 <= this.f38289a.d() - 1) {
                            if (i9 == 0) {
                                return bArr;
                            }
                            byte[] a8 = a(bArr, i8, i9 - 1, jVar);
                            j jVar2 = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(jVar.g()).n(jVar.e()).o(i10 - 1).f(0)).l();
                            byte[] c9 = this.f38290b.c(this.f38292d, jVar2.d());
                            byte[] c10 = this.f38290b.c(this.f38292d, ((j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar2.b())).h(jVar2.c())).p(jVar2.g()).n(jVar2.e()).o(jVar2.f()).f(1)).l()).d());
                            byte[] bArr2 = new byte[c8];
                            for (int i11 = 0; i11 < c8; i11++) {
                                bArr2[i11] = (byte) (a8[i11] ^ c10[i11]);
                            }
                            return this.f38290b.a(c9, bArr2);
                        }
                        throw new IllegalArgumentException("max chain length must not be greater than w");
                    }
                    throw new NullPointerException("otsHashAddress byte array == null");
                }
                throw new NullPointerException("otsHashAddress == null");
            }
            throw new IllegalArgumentException("startHash needs to be " + c8 + "bytes");
        }
        throw new NullPointerException("startHash == null");
    }

    private byte[] b(int i8) {
        if (i8 >= 0 && i8 < this.f38289a.a()) {
            return this.f38290b.c(this.f38291c, A.q(i8, 32));
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public h c() {
        return this.f38290b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public m d() {
        return this.f38289a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n e(j jVar) {
        if (jVar != null) {
            byte[][] bArr = new byte[this.f38289a.a()];
            for (int i8 = 0; i8 < this.f38289a.a(); i8++) {
                jVar = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(jVar.g()).n(i8).o(jVar.f()).f(jVar.a())).l();
                bArr[i8] = a(b(i8), 0, this.f38289a.d() - 1, jVar);
            }
            return new n(this.f38289a, bArr);
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] f() {
        return E7.a.d(this.f38292d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] g(byte[] bArr, j jVar) {
        return this.f38290b.c(bArr, ((j) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(jVar.g()).l()).d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length == this.f38289a.c()) {
                if (bArr2 != null) {
                    if (bArr2.length == this.f38289a.c()) {
                        this.f38291c = bArr;
                        this.f38292d = bArr2;
                        return;
                    }
                    throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
                }
                throw new NullPointerException("publicSeed == null");
            }
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        throw new NullPointerException("secretKeySeed == null");
    }
}
