package w7;

import R6.AbstractC1355w;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import n7.C3504a;

/* loaded from: classes5.dex */
public class a implements Key, PrivateKey {

    /* renamed from: a, reason: collision with root package name */
    private transient C3504a f39040a;

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC1355w f39041b;

    public a(W6.b bVar) {
        a(bVar);
    }

    private void a(W6.b bVar) {
        this.f39041b = bVar.m();
        this.f39040a = (C3504a) s7.a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return E7.a.c(this.f39040a.a(), ((a) obj).f39040a.a());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return s7.b.a(this.f39040a, this.f39041b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return E7.a.o(this.f39040a.a());
    }
}
