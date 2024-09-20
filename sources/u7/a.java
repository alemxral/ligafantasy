package u7;

import R6.AbstractC1355w;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import l7.AbstractC3374g;

/* loaded from: classes5.dex */
public class a implements PrivateKey, Key {

    /* renamed from: a, reason: collision with root package name */
    private transient AbstractC3374g f38557a;

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC1355w f38558b;

    public a(W6.b bVar) {
        a(bVar);
    }

    private void a(W6.b bVar) {
        this.f38558b = bVar.m();
        this.f38557a = (AbstractC3374g) s7.a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            try {
                return E7.a.a(this.f38557a.getEncoded(), ((a) obj).f38557a.getEncoded());
            } catch (IOException unused) {
                throw new IllegalStateException("unable to perform equals");
            }
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "LMS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return s7.b.a(this.f38557a, this.f38558b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        try {
            return E7.a.k(this.f38557a.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to calculate hashCode");
        }
    }
}
