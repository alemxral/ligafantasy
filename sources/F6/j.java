package F6;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    private static final g[] f2880e;

    /* renamed from: f, reason: collision with root package name */
    public static final j f2881f;

    /* renamed from: g, reason: collision with root package name */
    public static final j f2882g;

    /* renamed from: h, reason: collision with root package name */
    public static final j f2883h;

    /* renamed from: a, reason: collision with root package name */
    final boolean f2884a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f2885b;

    /* renamed from: c, reason: collision with root package name */
    final String[] f2886c;

    /* renamed from: d, reason: collision with root package name */
    final String[] f2887d;

    static {
        g[] gVarArr = {g.f2808Z0, g.f2819d1, g.f2810a1, g.f2822e1, g.f2840k1, g.f2837j1, g.f2778K0, g.f2780L0, g.f2833i0, g.f2836j0, g.f2769G, g.f2777K, g.f2838k};
        f2880e = gVarArr;
        a b8 = new a(true).b(gVarArr);
        C c8 = C.TLS_1_0;
        j a8 = b8.e(C.TLS_1_3, C.TLS_1_2, C.TLS_1_1, c8).d(true).a();
        f2881f = a8;
        f2882g = new a(a8).e(c8).d(true).a();
        f2883h = new a(false).a();
    }

    j(a aVar) {
        this.f2884a = aVar.f2888a;
        this.f2886c = aVar.f2889b;
        this.f2887d = aVar.f2890c;
        this.f2885b = aVar.f2891d;
    }

    private j e(SSLSocket sSLSocket, boolean z8) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.f2886c != null) {
            enabledCipherSuites = G6.c.v(g.f2811b, sSLSocket.getEnabledCipherSuites(), this.f2886c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f2887d != null) {
            enabledProtocols = G6.c.v(G6.c.f3223q, sSLSocket.getEnabledProtocols(), this.f2887d);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int s8 = G6.c.s(g.f2811b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z8 && s8 != -1) {
            enabledCipherSuites = G6.c.f(enabledCipherSuites, supportedCipherSuites[s8]);
        }
        return new a(this).c(enabledCipherSuites).f(enabledProtocols).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(SSLSocket sSLSocket, boolean z8) {
        j e8 = e(sSLSocket, z8);
        String[] strArr = e8.f2887d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = e8.f2886c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public List b() {
        String[] strArr = this.f2886c;
        if (strArr != null) {
            return g.b(strArr);
        }
        return null;
    }

    public boolean c(SSLSocket sSLSocket) {
        if (!this.f2884a) {
            return false;
        }
        String[] strArr = this.f2887d;
        if (strArr != null && !G6.c.x(G6.c.f3223q, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f2886c;
        if (strArr2 != null && !G6.c.x(g.f2811b, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return false;
        }
        return true;
    }

    public boolean d() {
        return this.f2884a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z8 = this.f2884a;
        if (z8 != jVar.f2884a) {
            return false;
        }
        if (z8 && (!Arrays.equals(this.f2886c, jVar.f2886c) || !Arrays.equals(this.f2887d, jVar.f2887d) || this.f2885b != jVar.f2885b)) {
            return false;
        }
        return true;
    }

    public boolean f() {
        return this.f2885b;
    }

    public List g() {
        String[] strArr = this.f2887d;
        if (strArr != null) {
            return C.b(strArr);
        }
        return null;
    }

    public int hashCode() {
        if (this.f2884a) {
            return ((((527 + Arrays.hashCode(this.f2886c)) * 31) + Arrays.hashCode(this.f2887d)) * 31) + (!this.f2885b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        String str;
        if (!this.f2884a) {
            return "ConnectionSpec()";
        }
        String str2 = "[all enabled]";
        if (this.f2886c == null) {
            str = "[all enabled]";
        } else {
            str = b().toString();
        }
        if (this.f2887d != null) {
            str2 = g().toString();
        }
        return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + str2 + ", supportsTlsExtensions=" + this.f2885b + ")";
    }

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f2888a;

        /* renamed from: b, reason: collision with root package name */
        String[] f2889b;

        /* renamed from: c, reason: collision with root package name */
        String[] f2890c;

        /* renamed from: d, reason: collision with root package name */
        boolean f2891d;

        a(boolean z8) {
            this.f2888a = z8;
        }

        public j a() {
            return new j(this);
        }

        public a b(g... gVarArr) {
            if (this.f2888a) {
                String[] strArr = new String[gVarArr.length];
                for (int i8 = 0; i8 < gVarArr.length; i8++) {
                    strArr[i8] = gVarArr[i8].f2871a;
                }
                return c(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a c(String... strArr) {
            if (this.f2888a) {
                if (strArr.length != 0) {
                    this.f2889b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a d(boolean z8) {
            if (this.f2888a) {
                this.f2891d = z8;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public a e(C... cArr) {
            if (this.f2888a) {
                String[] strArr = new String[cArr.length];
                for (int i8 = 0; i8 < cArr.length; i8++) {
                    strArr[i8] = cArr[i8].f2683a;
                }
                return f(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a f(String... strArr) {
            if (this.f2888a) {
                if (strArr.length != 0) {
                    this.f2890c = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a(j jVar) {
            this.f2888a = jVar.f2884a;
            this.f2889b = jVar.f2886c;
            this.f2890c = jVar.f2887d;
            this.f2891d = jVar.f2885b;
        }
    }
}
