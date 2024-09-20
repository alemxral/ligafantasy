package v7;

import D7.h;
import D7.i;
import java.io.IOException;
import java.security.PrivateKey;
import k7.C3135c;
import m7.C3446f;

/* loaded from: classes5.dex */
public class c implements Y6.b, PrivateKey {

    /* renamed from: a, reason: collision with root package name */
    private C3446f f38913a;

    public c(C3446f c3446f) {
        this.f38913a = c3446f;
    }

    public D7.b a() {
        return this.f38913a.a();
    }

    public i b() {
        return this.f38913a.b();
    }

    public int c() {
        return this.f38913a.c();
    }

    public int d() {
        return this.f38913a.d();
    }

    public h e() {
        return this.f38913a.e();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (d() != cVar.d() || c() != cVar.c() || !a().equals(cVar.a()) || !b().equals(cVar.b()) || !g().equals(cVar.g()) || !e().equals(cVar.e()) || !f().equals(cVar.f())) {
            return false;
        }
        return true;
    }

    public h f() {
        return this.f38913a.f();
    }

    public D7.a g() {
        return this.f38913a.g();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new W6.b(new X6.a(k7.e.f33676m), new C3135c(this.f38913a.d(), this.f38913a.c(), this.f38913a.a(), this.f38913a.b(), this.f38913a.e(), this.f38913a.f(), this.f38913a.g())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (((((((((((this.f38913a.c() * 37) + this.f38913a.d()) * 37) + this.f38913a.a().hashCode()) * 37) + this.f38913a.b().hashCode()) * 37) + this.f38913a.e().hashCode()) * 37) + this.f38913a.f().hashCode()) * 37) + this.f38913a.g().hashCode();
    }
}
