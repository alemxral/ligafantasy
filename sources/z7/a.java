package z7;

import R6.AbstractC1355w;
import R6.C1330a0;
import R6.C1347n;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import k7.e;
import k7.h;
import r7.C3697b;

/* loaded from: classes5.dex */
public class a implements PrivateKey, Key {

    /* renamed from: a, reason: collision with root package name */
    private transient C1347n f40553a;

    /* renamed from: b, reason: collision with root package name */
    private transient C3697b f40554b;

    /* renamed from: c, reason: collision with root package name */
    private transient AbstractC1355w f40555c;

    public a(W6.b bVar) {
        a(bVar);
    }

    private void a(W6.b bVar) {
        this.f40555c = bVar.m();
        this.f40553a = h.m(bVar.q().q()).p().m();
        this.f40554b = (C3697b) s7.a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f40553a.r(aVar.f40553a) && E7.a.a(this.f40554b.b(), aVar.f40554b.b())) {
            return true;
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        W6.b bVar;
        try {
            if (this.f40554b.a() != null) {
                bVar = s7.b.a(this.f40554b, this.f40555c);
            } else {
                bVar = new W6.b(new X6.a(e.f33681r, new h(new X6.a(this.f40553a))), new C1330a0(this.f40554b.b()), this.f40555c);
            }
            return bVar.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f40553a.hashCode() + (E7.a.k(this.f40554b.b()) * 37);
    }
}
