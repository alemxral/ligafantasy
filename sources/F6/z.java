package F6;

import F6.q;
import java.io.Closeable;

/* loaded from: classes5.dex */
public final class z implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    final x f3029a;

    /* renamed from: b, reason: collision with root package name */
    final v f3030b;

    /* renamed from: c, reason: collision with root package name */
    final int f3031c;

    /* renamed from: d, reason: collision with root package name */
    final String f3032d;

    /* renamed from: e, reason: collision with root package name */
    final p f3033e;

    /* renamed from: f, reason: collision with root package name */
    final q f3034f;

    /* renamed from: g, reason: collision with root package name */
    final A f3035g;

    /* renamed from: h, reason: collision with root package name */
    final z f3036h;

    /* renamed from: i, reason: collision with root package name */
    final z f3037i;

    /* renamed from: j, reason: collision with root package name */
    final z f3038j;

    /* renamed from: k, reason: collision with root package name */
    final long f3039k;

    /* renamed from: l, reason: collision with root package name */
    final long f3040l;

    /* renamed from: m, reason: collision with root package name */
    private volatile d f3041m;

    z(a aVar) {
        this.f3029a = aVar.f3042a;
        this.f3030b = aVar.f3043b;
        this.f3031c = aVar.f3044c;
        this.f3032d = aVar.f3045d;
        this.f3033e = aVar.f3046e;
        this.f3034f = aVar.f3047f.d();
        this.f3035g = aVar.f3048g;
        this.f3036h = aVar.f3049h;
        this.f3037i = aVar.f3050i;
        this.f3038j = aVar.f3051j;
        this.f3039k = aVar.f3052k;
        this.f3040l = aVar.f3053l;
    }

    public long A() {
        return this.f3040l;
    }

    public x E() {
        return this.f3029a;
    }

    public long F() {
        return this.f3039k;
    }

    public A a() {
        return this.f3035g;
    }

    public d b() {
        d dVar = this.f3041m;
        if (dVar == null) {
            d l8 = d.l(this.f3034f);
            this.f3041m = l8;
            return l8;
        }
        return dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        A a8 = this.f3035g;
        if (a8 != null) {
            a8.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public z e() {
        return this.f3037i;
    }

    public int f() {
        return this.f3031c;
    }

    public p g() {
        return this.f3033e;
    }

    public String h(String str) {
        return l(str, null);
    }

    public String l(String str, String str2) {
        String a8 = this.f3034f.a(str);
        if (a8 != null) {
            return a8;
        }
        return str2;
    }

    public q m() {
        return this.f3034f;
    }

    public boolean o() {
        int i8 = this.f3031c;
        if (i8 >= 200 && i8 < 300) {
            return true;
        }
        return false;
    }

    public String r() {
        return this.f3032d;
    }

    public z t() {
        return this.f3036h;
    }

    public String toString() {
        return "Response{protocol=" + this.f3030b + ", code=" + this.f3031c + ", message=" + this.f3032d + ", url=" + this.f3029a.i() + '}';
    }

    public a u() {
        return new a(this);
    }

    public z w() {
        return this.f3038j;
    }

    public v x() {
        return this.f3030b;
    }

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        x f3042a;

        /* renamed from: b, reason: collision with root package name */
        v f3043b;

        /* renamed from: c, reason: collision with root package name */
        int f3044c;

        /* renamed from: d, reason: collision with root package name */
        String f3045d;

        /* renamed from: e, reason: collision with root package name */
        p f3046e;

        /* renamed from: f, reason: collision with root package name */
        q.a f3047f;

        /* renamed from: g, reason: collision with root package name */
        A f3048g;

        /* renamed from: h, reason: collision with root package name */
        z f3049h;

        /* renamed from: i, reason: collision with root package name */
        z f3050i;

        /* renamed from: j, reason: collision with root package name */
        z f3051j;

        /* renamed from: k, reason: collision with root package name */
        long f3052k;

        /* renamed from: l, reason: collision with root package name */
        long f3053l;

        public a() {
            this.f3044c = -1;
            this.f3047f = new q.a();
        }

        private void e(z zVar) {
            if (zVar.f3035g == null) {
            } else {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private void f(String str, z zVar) {
            if (zVar.f3035g == null) {
                if (zVar.f3036h == null) {
                    if (zVar.f3037i == null) {
                        if (zVar.f3038j == null) {
                            return;
                        }
                        throw new IllegalArgumentException(str + ".priorResponse != null");
                    }
                    throw new IllegalArgumentException(str + ".cacheResponse != null");
                }
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            throw new IllegalArgumentException(str + ".body != null");
        }

        public a a(String str, String str2) {
            this.f3047f.a(str, str2);
            return this;
        }

        public a b(A a8) {
            this.f3048g = a8;
            return this;
        }

        public z c() {
            if (this.f3042a != null) {
                if (this.f3043b != null) {
                    if (this.f3044c >= 0) {
                        if (this.f3045d != null) {
                            return new z(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.f3044c);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }

        public a d(z zVar) {
            if (zVar != null) {
                f("cacheResponse", zVar);
            }
            this.f3050i = zVar;
            return this;
        }

        public a g(int i8) {
            this.f3044c = i8;
            return this;
        }

        public a h(p pVar) {
            this.f3046e = pVar;
            return this;
        }

        public a i(q qVar) {
            this.f3047f = qVar.d();
            return this;
        }

        public a j(String str) {
            this.f3045d = str;
            return this;
        }

        public a k(z zVar) {
            if (zVar != null) {
                f("networkResponse", zVar);
            }
            this.f3049h = zVar;
            return this;
        }

        public a l(z zVar) {
            if (zVar != null) {
                e(zVar);
            }
            this.f3051j = zVar;
            return this;
        }

        public a m(v vVar) {
            this.f3043b = vVar;
            return this;
        }

        public a n(long j8) {
            this.f3053l = j8;
            return this;
        }

        public a o(x xVar) {
            this.f3042a = xVar;
            return this;
        }

        public a p(long j8) {
            this.f3052k = j8;
            return this;
        }

        a(z zVar) {
            this.f3044c = -1;
            this.f3042a = zVar.f3029a;
            this.f3043b = zVar.f3030b;
            this.f3044c = zVar.f3031c;
            this.f3045d = zVar.f3032d;
            this.f3046e = zVar.f3033e;
            this.f3047f = zVar.f3034f.d();
            this.f3048g = zVar.f3035g;
            this.f3049h = zVar.f3036h;
            this.f3050i = zVar.f3037i;
            this.f3051j = zVar.f3038j;
            this.f3052k = zVar.f3039k;
            this.f3053l = zVar.f3040l;
        }
    }
}
