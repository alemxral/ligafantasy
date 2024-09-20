package v7;

import D7.h;
import D7.i;
import java.io.IOException;
import java.security.PrivateKey;
import k7.C3133a;
import m7.C3442b;

/* loaded from: classes5.dex */
public class a implements PrivateKey {

    /* renamed from: a, reason: collision with root package name */
    private C3442b f38911a;

    public a(C3442b c3442b) {
        this.f38911a = c3442b;
    }

    public D7.b a() {
        return this.f38911a.b();
    }

    public i b() {
        return this.f38911a.c();
    }

    public D7.a c() {
        return this.f38911a.d();
    }

    public int d() {
        return this.f38911a.e();
    }

    public int e() {
        return this.f38911a.f();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (e() != aVar.e() || d() != aVar.d() || !a().equals(aVar.a()) || !b().equals(aVar.b()) || !f().equals(aVar.f()) || !c().equals(aVar.c())) {
            return false;
        }
        return true;
    }

    public h f() {
        return this.f38911a.g();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new W6.b(new X6.a(k7.e.f33677n), new C3133a(e(), d(), a(), b(), f(), g.a(this.f38911a.a()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (((((((((this.f38911a.e() * 37) + this.f38911a.f()) * 37) + this.f38911a.b().hashCode()) * 37) + this.f38911a.c().hashCode()) * 37) + this.f38911a.g().hashCode()) * 37) + this.f38911a.d().hashCode();
    }
}
