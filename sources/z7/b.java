package z7;

import R6.C1347n;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import k7.e;
import k7.h;
import r7.C3698c;
import s7.d;

/* loaded from: classes5.dex */
public class b implements PublicKey, Key {

    /* renamed from: a, reason: collision with root package name */
    private transient C1347n f40556a;

    /* renamed from: b, reason: collision with root package name */
    private transient C3698c f40557b;

    public b(X6.b bVar) {
        a(bVar);
    }

    private void a(X6.b bVar) {
        this.f40556a = h.m(bVar.m().q()).p().m();
        this.f40557b = (C3698c) s7.c.a(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f40556a.r(bVar.f40556a) && E7.a.a(this.f40557b.b(), bVar.f40557b.b())) {
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
        X6.b bVar;
        try {
            if (this.f40557b.a() != null) {
                bVar = d.a(this.f40557b);
            } else {
                bVar = new X6.b(new X6.a(e.f33681r, new h(new X6.a(this.f40556a))), this.f40557b.b());
            }
            return bVar.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f40556a.hashCode() + (E7.a.k(this.f40557b.b()) * 37);
    }
}
