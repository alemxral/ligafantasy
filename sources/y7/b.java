package y7;

import R6.Y;
import java.security.PublicKey;
import k7.e;
import k7.g;
import q7.AbstractC3664a;

/* loaded from: classes5.dex */
public class b implements PublicKey {

    /* renamed from: a, reason: collision with root package name */
    private short[][] f40019a;

    /* renamed from: b, reason: collision with root package name */
    private short[][] f40020b;

    /* renamed from: c, reason: collision with root package name */
    private short[] f40021c;

    /* renamed from: d, reason: collision with root package name */
    private int f40022d;

    public b(int i8, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f40022d = i8;
        this.f40019a = sArr;
        this.f40020b = sArr2;
        this.f40021c = sArr3;
    }

    public short[][] a() {
        return this.f40019a;
    }

    public short[] b() {
        return E7.a.e(this.f40021c);
    }

    public short[][] c() {
        short[][] sArr = new short[this.f40020b.length];
        int i8 = 0;
        while (true) {
            short[][] sArr2 = this.f40020b;
            if (i8 != sArr2.length) {
                sArr[i8] = E7.a.e(sArr2[i8]);
                i8++;
            } else {
                return sArr;
            }
        }
    }

    public int d() {
        return this.f40022d;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f40022d != bVar.d() || !AbstractC3664a.j(this.f40019a, bVar.a()) || !AbstractC3664a.j(this.f40020b, bVar.c()) || !AbstractC3664a.i(this.f40021c, bVar.b())) {
            return false;
        }
        return true;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return A7.a.a(new X6.a(e.f33664a, Y.f8783a), new g(this.f40022d, this.f40019a, this.f40020b, this.f40021c));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return (((((this.f40022d * 37) + E7.a.p(this.f40019a)) * 37) + E7.a.p(this.f40020b)) * 37) + E7.a.o(this.f40021c);
    }

    public b(C7.b bVar) {
        this(bVar.d(), bVar.a(), bVar.c(), bVar.b());
    }
}
