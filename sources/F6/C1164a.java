package F6;

import F6.r;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: F6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1164a {

    /* renamed from: a, reason: collision with root package name */
    final r f2684a;

    /* renamed from: b, reason: collision with root package name */
    final n f2685b;

    /* renamed from: c, reason: collision with root package name */
    final SocketFactory f2686c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC1165b f2687d;

    /* renamed from: e, reason: collision with root package name */
    final List f2688e;

    /* renamed from: f, reason: collision with root package name */
    final List f2689f;

    /* renamed from: g, reason: collision with root package name */
    final ProxySelector f2690g;

    /* renamed from: h, reason: collision with root package name */
    final Proxy f2691h;

    /* renamed from: i, reason: collision with root package name */
    final SSLSocketFactory f2692i;

    /* renamed from: j, reason: collision with root package name */
    final HostnameVerifier f2693j;

    /* renamed from: k, reason: collision with root package name */
    final f f2694k;

    public C1164a(String str, int i8, n nVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, InterfaceC1165b interfaceC1165b, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        this.f2684a = new r.a().p(sSLSocketFactory != null ? "https" : "http").e(str).k(i8).a();
        if (nVar != null) {
            this.f2685b = nVar;
            if (socketFactory != null) {
                this.f2686c = socketFactory;
                if (interfaceC1165b != null) {
                    this.f2687d = interfaceC1165b;
                    if (list != null) {
                        this.f2688e = G6.c.q(list);
                        if (list2 != null) {
                            this.f2689f = G6.c.q(list2);
                            if (proxySelector != null) {
                                this.f2690g = proxySelector;
                                this.f2691h = proxy;
                                this.f2692i = sSLSocketFactory;
                                this.f2693j = hostnameVerifier;
                                this.f2694k = fVar;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    public f a() {
        return this.f2694k;
    }

    public List b() {
        return this.f2689f;
    }

    public n c() {
        return this.f2685b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(C1164a c1164a) {
        if (this.f2685b.equals(c1164a.f2685b) && this.f2687d.equals(c1164a.f2687d) && this.f2688e.equals(c1164a.f2688e) && this.f2689f.equals(c1164a.f2689f) && this.f2690g.equals(c1164a.f2690g) && G6.c.n(this.f2691h, c1164a.f2691h) && G6.c.n(this.f2692i, c1164a.f2692i) && G6.c.n(this.f2693j, c1164a.f2693j) && G6.c.n(this.f2694k, c1164a.f2694k) && l().w() == c1164a.l().w()) {
            return true;
        }
        return false;
    }

    public HostnameVerifier e() {
        return this.f2693j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1164a) {
            C1164a c1164a = (C1164a) obj;
            if (this.f2684a.equals(c1164a.f2684a) && d(c1164a)) {
                return true;
            }
        }
        return false;
    }

    public List f() {
        return this.f2688e;
    }

    public Proxy g() {
        return this.f2691h;
    }

    public InterfaceC1165b h() {
        return this.f2687d;
    }

    public int hashCode() {
        int i8;
        int i9;
        int i10;
        int hashCode = (((((((((((527 + this.f2684a.hashCode()) * 31) + this.f2685b.hashCode()) * 31) + this.f2687d.hashCode()) * 31) + this.f2688e.hashCode()) * 31) + this.f2689f.hashCode()) * 31) + this.f2690g.hashCode()) * 31;
        Proxy proxy = this.f2691h;
        int i11 = 0;
        if (proxy != null) {
            i8 = proxy.hashCode();
        } else {
            i8 = 0;
        }
        int i12 = (hashCode + i8) * 31;
        SSLSocketFactory sSLSocketFactory = this.f2692i;
        if (sSLSocketFactory != null) {
            i9 = sSLSocketFactory.hashCode();
        } else {
            i9 = 0;
        }
        int i13 = (i12 + i9) * 31;
        HostnameVerifier hostnameVerifier = this.f2693j;
        if (hostnameVerifier != null) {
            i10 = hostnameVerifier.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        f fVar = this.f2694k;
        if (fVar != null) {
            i11 = fVar.hashCode();
        }
        return i14 + i11;
    }

    public ProxySelector i() {
        return this.f2690g;
    }

    public SocketFactory j() {
        return this.f2686c;
    }

    public SSLSocketFactory k() {
        return this.f2692i;
    }

    public r l() {
        return this.f2684a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f2684a.k());
        sb.append(":");
        sb.append(this.f2684a.w());
        if (this.f2691h != null) {
            sb.append(", proxy=");
            sb.append(this.f2691h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f2690g);
        }
        sb.append("}");
        return sb.toString();
    }
}
