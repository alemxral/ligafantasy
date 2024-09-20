package y7;

import R6.Y;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import k7.e;
import k7.f;
import p7.C3626a;
import q7.AbstractC3664a;

/* loaded from: classes5.dex */
public class a implements PrivateKey {

    /* renamed from: a, reason: collision with root package name */
    private short[][] f40013a;

    /* renamed from: b, reason: collision with root package name */
    private short[] f40014b;

    /* renamed from: c, reason: collision with root package name */
    private short[][] f40015c;

    /* renamed from: d, reason: collision with root package name */
    private short[] f40016d;

    /* renamed from: e, reason: collision with root package name */
    private C3626a[] f40017e;

    /* renamed from: f, reason: collision with root package name */
    private int[] f40018f;

    public a(C7.a aVar) {
        this(aVar.c(), aVar.a(), aVar.d(), aVar.b(), aVar.f(), aVar.e());
    }

    public short[] a() {
        return this.f40014b;
    }

    public short[] b() {
        return this.f40016d;
    }

    public short[][] c() {
        return this.f40013a;
    }

    public short[][] d() {
        return this.f40015c;
    }

    public C3626a[] e() {
        return this.f40017e;
    }

    public boolean equals(Object obj) {
        boolean z8;
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3664a.j(this.f40013a, aVar.c()) && AbstractC3664a.j(this.f40015c, aVar.d()) && AbstractC3664a.i(this.f40014b, aVar.a()) && AbstractC3664a.i(this.f40016d, aVar.b()) && Arrays.equals(this.f40018f, aVar.f())) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.f40017e.length != aVar.e().length) {
            return false;
        }
        for (int length = this.f40017e.length - 1; length >= 0; length--) {
            z8 &= this.f40017e[length].equals(aVar.e()[length]);
        }
        return z8;
    }

    public int[] f() {
        return this.f40018f;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new W6.b(new X6.a(e.f33664a, Y.f8783a), new f(this.f40013a, this.f40014b, this.f40015c, this.f40016d, this.f40018f, this.f40017e)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        int length = (((((((((this.f40017e.length * 37) + E7.a.p(this.f40013a)) * 37) + E7.a.o(this.f40014b)) * 37) + E7.a.p(this.f40015c)) * 37) + E7.a.o(this.f40016d)) * 37) + E7.a.n(this.f40018f);
        for (int length2 = this.f40017e.length - 1; length2 >= 0; length2--) {
            length = (length * 37) + this.f40017e[length2].hashCode();
        }
        return length;
    }

    public a(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, C3626a[] c3626aArr) {
        this.f40013a = sArr;
        this.f40014b = sArr2;
        this.f40015c = sArr3;
        this.f40016d = sArr4;
        this.f40018f = iArr;
        this.f40017e = c3626aArr;
    }
}
