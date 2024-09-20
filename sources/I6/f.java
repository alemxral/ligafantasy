package I6;

import F6.B;
import F6.C1164a;
import F6.o;
import F6.r;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final C1164a f4292a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4293b;

    /* renamed from: c, reason: collision with root package name */
    private final F6.e f4294c;

    /* renamed from: d, reason: collision with root package name */
    private final o f4295d;

    /* renamed from: f, reason: collision with root package name */
    private int f4297f;

    /* renamed from: e, reason: collision with root package name */
    private List f4296e = Collections.emptyList();

    /* renamed from: g, reason: collision with root package name */
    private List f4298g = Collections.emptyList();

    /* renamed from: h, reason: collision with root package name */
    private final List f4299h = new ArrayList();

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f4300a;

        /* renamed from: b, reason: collision with root package name */
        private int f4301b = 0;

        a(List list) {
            this.f4300a = list;
        }

        public List a() {
            return new ArrayList(this.f4300a);
        }

        public boolean b() {
            if (this.f4301b < this.f4300a.size()) {
                return true;
            }
            return false;
        }

        public B c() {
            if (b()) {
                List list = this.f4300a;
                int i8 = this.f4301b;
                this.f4301b = i8 + 1;
                return (B) list.get(i8);
            }
            throw new NoSuchElementException();
        }
    }

    public f(C1164a c1164a, d dVar, F6.e eVar, o oVar) {
        this.f4292a = c1164a;
        this.f4293b = dVar;
        this.f4294c = eVar;
        this.f4295d = oVar;
        h(c1164a.l(), c1164a.g());
    }

    static String b(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }

    private boolean d() {
        if (this.f4297f < this.f4296e.size()) {
            return true;
        }
        return false;
    }

    private Proxy f() {
        if (d()) {
            List list = this.f4296e;
            int i8 = this.f4297f;
            this.f4297f = i8 + 1;
            Proxy proxy = (Proxy) list.get(i8);
            g(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f4292a.l().k() + "; exhausted proxy configurations: " + this.f4296e);
    }

    private void g(Proxy proxy) {
        String k8;
        int w8;
        this.f4298g = new ArrayList();
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                k8 = b(inetSocketAddress);
                w8 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        } else {
            k8 = this.f4292a.l().k();
            w8 = this.f4292a.l().w();
        }
        if (w8 >= 1 && w8 <= 65535) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.f4298g.add(InetSocketAddress.createUnresolved(k8, w8));
                return;
            }
            this.f4295d.j(this.f4294c, k8);
            List lookup = this.f4292a.c().lookup(k8);
            if (!lookup.isEmpty()) {
                this.f4295d.i(this.f4294c, k8, lookup);
                int size = lookup.size();
                for (int i8 = 0; i8 < size; i8++) {
                    this.f4298g.add(new InetSocketAddress((InetAddress) lookup.get(i8), w8));
                }
                return;
            }
            throw new UnknownHostException(this.f4292a.c() + " returned no addresses for " + k8);
        }
        throw new SocketException("No route to " + k8 + ":" + w8 + "; port is out of range");
    }

    private void h(r rVar, Proxy proxy) {
        List r8;
        if (proxy != null) {
            this.f4296e = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f4292a.i().select(rVar.B());
            if (select != null && !select.isEmpty()) {
                r8 = G6.c.q(select);
            } else {
                r8 = G6.c.r(Proxy.NO_PROXY);
            }
            this.f4296e = r8;
        }
        this.f4297f = 0;
    }

    public void a(B b8, IOException iOException) {
        if (b8.b().type() != Proxy.Type.DIRECT && this.f4292a.i() != null) {
            this.f4292a.i().connectFailed(this.f4292a.l().B(), b8.b().address(), iOException);
        }
        this.f4293b.b(b8);
    }

    public boolean c() {
        if (!d() && this.f4299h.isEmpty()) {
            return false;
        }
        return true;
    }

    public a e() {
        if (c()) {
            ArrayList arrayList = new ArrayList();
            while (d()) {
                Proxy f8 = f();
                int size = this.f4298g.size();
                for (int i8 = 0; i8 < size; i8++) {
                    B b8 = new B(this.f4292a, f8, (InetSocketAddress) this.f4298g.get(i8));
                    if (this.f4293b.c(b8)) {
                        this.f4299h.add(b8);
                    } else {
                        arrayList.add(b8);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f4299h);
                this.f4299h.clear();
            }
            return new a(arrayList);
        }
        throw new NoSuchElementException();
    }
}
