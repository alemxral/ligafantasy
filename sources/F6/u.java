package F6;

import F6.e;
import F6.o;
import F6.q;
import F6.z;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes5.dex */
public class u implements Cloneable, e.a {

    /* renamed from: B, reason: collision with root package name */
    static final List f2946B = G6.c.r(v.HTTP_2, v.HTTP_1_1);

    /* renamed from: C, reason: collision with root package name */
    static final List f2947C = G6.c.r(j.f2881f, j.f2883h);

    /* renamed from: A, reason: collision with root package name */
    final int f2948A;

    /* renamed from: a, reason: collision with root package name */
    final m f2949a;

    /* renamed from: b, reason: collision with root package name */
    final Proxy f2950b;

    /* renamed from: c, reason: collision with root package name */
    final List f2951c;

    /* renamed from: d, reason: collision with root package name */
    final List f2952d;

    /* renamed from: e, reason: collision with root package name */
    final List f2953e;

    /* renamed from: f, reason: collision with root package name */
    final List f2954f;

    /* renamed from: g, reason: collision with root package name */
    final o.c f2955g;

    /* renamed from: h, reason: collision with root package name */
    final ProxySelector f2956h;

    /* renamed from: i, reason: collision with root package name */
    final l f2957i;

    /* renamed from: j, reason: collision with root package name */
    final C1166c f2958j;

    /* renamed from: k, reason: collision with root package name */
    final H6.f f2959k;

    /* renamed from: l, reason: collision with root package name */
    final SocketFactory f2960l;

    /* renamed from: m, reason: collision with root package name */
    final SSLSocketFactory f2961m;

    /* renamed from: n, reason: collision with root package name */
    final O6.c f2962n;

    /* renamed from: o, reason: collision with root package name */
    final HostnameVerifier f2963o;

    /* renamed from: p, reason: collision with root package name */
    final f f2964p;

    /* renamed from: q, reason: collision with root package name */
    final InterfaceC1165b f2965q;

    /* renamed from: r, reason: collision with root package name */
    final InterfaceC1165b f2966r;

    /* renamed from: s, reason: collision with root package name */
    final i f2967s;

    /* renamed from: t, reason: collision with root package name */
    final n f2968t;

    /* renamed from: u, reason: collision with root package name */
    final boolean f2969u;

    /* renamed from: v, reason: collision with root package name */
    final boolean f2970v;

    /* renamed from: w, reason: collision with root package name */
    final boolean f2971w;

    /* renamed from: x, reason: collision with root package name */
    final int f2972x;

    /* renamed from: y, reason: collision with root package name */
    final int f2973y;

    /* renamed from: z, reason: collision with root package name */
    final int f2974z;

    /* loaded from: classes5.dex */
    final class a extends G6.a {
        a() {
        }

        @Override // G6.a
        public void a(q.a aVar, String str) {
            aVar.b(str);
        }

        @Override // G6.a
        public void b(q.a aVar, String str, String str2) {
            aVar.c(str, str2);
        }

        @Override // G6.a
        public void c(j jVar, SSLSocket sSLSocket, boolean z8) {
            jVar.a(sSLSocket, z8);
        }

        @Override // G6.a
        public int d(z.a aVar) {
            return aVar.f3044c;
        }

        @Override // G6.a
        public boolean e(i iVar, I6.c cVar) {
            return iVar.b(cVar);
        }

        @Override // G6.a
        public Socket f(i iVar, C1164a c1164a, I6.g gVar) {
            return iVar.c(c1164a, gVar);
        }

        @Override // G6.a
        public boolean g(C1164a c1164a, C1164a c1164a2) {
            return c1164a.d(c1164a2);
        }

        @Override // G6.a
        public I6.c h(i iVar, C1164a c1164a, I6.g gVar, B b8) {
            return iVar.d(c1164a, gVar, b8);
        }

        @Override // G6.a
        public void i(i iVar, I6.c cVar) {
            iVar.f(cVar);
        }

        @Override // G6.a
        public I6.d j(i iVar) {
            return iVar.f2877e;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: A, reason: collision with root package name */
        int f2975A;

        /* renamed from: b, reason: collision with root package name */
        Proxy f2977b;

        /* renamed from: j, reason: collision with root package name */
        C1166c f2985j;

        /* renamed from: k, reason: collision with root package name */
        H6.f f2986k;

        /* renamed from: m, reason: collision with root package name */
        SSLSocketFactory f2988m;

        /* renamed from: n, reason: collision with root package name */
        O6.c f2989n;

        /* renamed from: q, reason: collision with root package name */
        InterfaceC1165b f2992q;

        /* renamed from: r, reason: collision with root package name */
        InterfaceC1165b f2993r;

        /* renamed from: s, reason: collision with root package name */
        i f2994s;

        /* renamed from: t, reason: collision with root package name */
        n f2995t;

        /* renamed from: u, reason: collision with root package name */
        boolean f2996u;

        /* renamed from: v, reason: collision with root package name */
        boolean f2997v;

        /* renamed from: w, reason: collision with root package name */
        boolean f2998w;

        /* renamed from: x, reason: collision with root package name */
        int f2999x;

        /* renamed from: y, reason: collision with root package name */
        int f3000y;

        /* renamed from: z, reason: collision with root package name */
        int f3001z;

        /* renamed from: e, reason: collision with root package name */
        final List f2980e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        final List f2981f = new ArrayList();

        /* renamed from: a, reason: collision with root package name */
        m f2976a = new m();

        /* renamed from: c, reason: collision with root package name */
        List f2978c = u.f2946B;

        /* renamed from: d, reason: collision with root package name */
        List f2979d = u.f2947C;

        /* renamed from: g, reason: collision with root package name */
        o.c f2982g = o.k(o.f2914a);

        /* renamed from: h, reason: collision with root package name */
        ProxySelector f2983h = ProxySelector.getDefault();

        /* renamed from: i, reason: collision with root package name */
        l f2984i = l.f2905a;

        /* renamed from: l, reason: collision with root package name */
        SocketFactory f2987l = SocketFactory.getDefault();

        /* renamed from: o, reason: collision with root package name */
        HostnameVerifier f2990o = O6.d.f7787a;

        /* renamed from: p, reason: collision with root package name */
        f f2991p = f.f2753c;

        public b() {
            InterfaceC1165b interfaceC1165b = InterfaceC1165b.f2695a;
            this.f2992q = interfaceC1165b;
            this.f2993r = interfaceC1165b;
            this.f2994s = new i();
            this.f2995t = n.f2913a;
            this.f2996u = true;
            this.f2997v = true;
            this.f2998w = true;
            this.f2999x = 10000;
            this.f3000y = 10000;
            this.f3001z = 10000;
            this.f2975A = 0;
        }

        public u a() {
            return new u(this);
        }

        public b b(C1166c c1166c) {
            this.f2985j = c1166c;
            this.f2986k = null;
            return this;
        }
    }

    static {
        G6.a.f3205a = new a();
    }

    u(b bVar) {
        boolean z8;
        this.f2949a = bVar.f2976a;
        this.f2950b = bVar.f2977b;
        this.f2951c = bVar.f2978c;
        List list = bVar.f2979d;
        this.f2952d = list;
        this.f2953e = G6.c.q(bVar.f2980e);
        this.f2954f = G6.c.q(bVar.f2981f);
        this.f2955g = bVar.f2982g;
        this.f2956h = bVar.f2983h;
        this.f2957i = bVar.f2984i;
        this.f2958j = bVar.f2985j;
        this.f2959k = bVar.f2986k;
        this.f2960l = bVar.f2987l;
        Iterator it = list.iterator();
        loop0: while (true) {
            while (it.hasNext()) {
                z8 = z8 || ((j) it.next()).d();
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f2988m;
        if (sSLSocketFactory == null && z8) {
            X509TrustManager C8 = C();
            this.f2961m = B(C8);
            this.f2962n = O6.c.b(C8);
        } else {
            this.f2961m = sSLSocketFactory;
            this.f2962n = bVar.f2989n;
        }
        this.f2963o = bVar.f2990o;
        this.f2964p = bVar.f2991p.e(this.f2962n);
        this.f2965q = bVar.f2992q;
        this.f2966r = bVar.f2993r;
        this.f2967s = bVar.f2994s;
        this.f2968t = bVar.f2995t;
        this.f2969u = bVar.f2996u;
        this.f2970v = bVar.f2997v;
        this.f2971w = bVar.f2998w;
        this.f2972x = bVar.f2999x;
        this.f2973y = bVar.f3000y;
        this.f2974z = bVar.f3001z;
        this.f2948A = bVar.f2975A;
        if (!this.f2953e.contains(null)) {
            if (!this.f2954f.contains(null)) {
                return;
            }
            throw new IllegalStateException("Null network interceptor: " + this.f2954f);
        }
        throw new IllegalStateException("Null interceptor: " + this.f2953e);
    }

    private SSLSocketFactory B(X509TrustManager x509TrustManager) {
        try {
            SSLContext k8 = N6.f.i().k();
            k8.init(null, new TrustManager[]{x509TrustManager}, null);
            return k8.getSocketFactory();
        } catch (GeneralSecurityException e8) {
            throw G6.c.a("No System TLS", e8);
        }
    }

    private X509TrustManager C() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e8) {
            throw G6.c.a("No System TLS", e8);
        }
    }

    public SSLSocketFactory A() {
        return this.f2961m;
    }

    public int D() {
        return this.f2974z;
    }

    @Override // F6.e.a
    public e a(x xVar) {
        return w.d(this, xVar, false);
    }

    public InterfaceC1165b b() {
        return this.f2966r;
    }

    public C1166c c() {
        return this.f2958j;
    }

    public f d() {
        return this.f2964p;
    }

    public int e() {
        return this.f2972x;
    }

    public i f() {
        return this.f2967s;
    }

    public List g() {
        return this.f2952d;
    }

    public l h() {
        return this.f2957i;
    }

    public m i() {
        return this.f2949a;
    }

    public n j() {
        return this.f2968t;
    }

    public o.c k() {
        return this.f2955g;
    }

    public boolean l() {
        return this.f2970v;
    }

    public boolean m() {
        return this.f2969u;
    }

    public HostnameVerifier n() {
        return this.f2963o;
    }

    public List o() {
        return this.f2953e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public H6.f p() {
        C1166c c1166c = this.f2958j;
        if (c1166c != null) {
            return c1166c.f2696a;
        }
        return this.f2959k;
    }

    public List q() {
        return this.f2954f;
    }

    public int r() {
        return this.f2948A;
    }

    public List s() {
        return this.f2951c;
    }

    public Proxy t() {
        return this.f2950b;
    }

    public InterfaceC1165b v() {
        return this.f2965q;
    }

    public ProxySelector w() {
        return this.f2956h;
    }

    public int x() {
        return this.f2973y;
    }

    public boolean y() {
        return this.f2971w;
    }

    public SocketFactory z() {
        return this.f2960l;
    }
}
