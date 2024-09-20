package F6;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes5.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    final C1164a f2674a;

    /* renamed from: b, reason: collision with root package name */
    final Proxy f2675b;

    /* renamed from: c, reason: collision with root package name */
    final InetSocketAddress f2676c;

    public B(C1164a c1164a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c1164a != null) {
            if (proxy != null) {
                if (inetSocketAddress != null) {
                    this.f2674a = c1164a;
                    this.f2675b = proxy;
                    this.f2676c = inetSocketAddress;
                    return;
                }
                throw new NullPointerException("inetSocketAddress == null");
            }
            throw new NullPointerException("proxy == null");
        }
        throw new NullPointerException("address == null");
    }

    public C1164a a() {
        return this.f2674a;
    }

    public Proxy b() {
        return this.f2675b;
    }

    public boolean c() {
        if (this.f2674a.f2692i != null && this.f2675b.type() == Proxy.Type.HTTP) {
            return true;
        }
        return false;
    }

    public InetSocketAddress d() {
        return this.f2676c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof B) {
            B b8 = (B) obj;
            if (b8.f2674a.equals(this.f2674a) && b8.f2675b.equals(this.f2675b) && b8.f2676c.equals(this.f2676c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f2674a.hashCode()) * 31) + this.f2675b.hashCode()) * 31) + this.f2676c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f2676c + "}";
    }
}
