package L6;

import F6.A;
import F6.q;
import F6.s;
import F6.u;
import F6.v;
import F6.x;
import F6.z;
import P6.AbstractC1287m;
import P6.C1279e;
import P6.C1282h;
import P6.L;
import P6.X;
import P6.Z;
import P6.a0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class f implements J6.c {

    /* renamed from: f, reason: collision with root package name */
    private static final C1282h f6563f;

    /* renamed from: g, reason: collision with root package name */
    private static final C1282h f6564g;

    /* renamed from: h, reason: collision with root package name */
    private static final C1282h f6565h;

    /* renamed from: i, reason: collision with root package name */
    private static final C1282h f6566i;

    /* renamed from: j, reason: collision with root package name */
    private static final C1282h f6567j;

    /* renamed from: k, reason: collision with root package name */
    private static final C1282h f6568k;

    /* renamed from: l, reason: collision with root package name */
    private static final C1282h f6569l;

    /* renamed from: m, reason: collision with root package name */
    private static final C1282h f6570m;

    /* renamed from: n, reason: collision with root package name */
    private static final List f6571n;

    /* renamed from: o, reason: collision with root package name */
    private static final List f6572o;

    /* renamed from: a, reason: collision with root package name */
    private final u f6573a;

    /* renamed from: b, reason: collision with root package name */
    private final s.a f6574b;

    /* renamed from: c, reason: collision with root package name */
    final I6.g f6575c;

    /* renamed from: d, reason: collision with root package name */
    private final g f6576d;

    /* renamed from: e, reason: collision with root package name */
    private i f6577e;

    /* loaded from: classes5.dex */
    class a extends AbstractC1287m {

        /* renamed from: b, reason: collision with root package name */
        boolean f6578b;

        /* renamed from: c, reason: collision with root package name */
        long f6579c;

        a(Z z8) {
            super(z8);
            this.f6578b = false;
            this.f6579c = 0L;
        }

        private void b(IOException iOException) {
            if (this.f6578b) {
                return;
            }
            this.f6578b = true;
            f fVar = f.this;
            fVar.f6575c.q(false, fVar, this.f6579c, iOException);
        }

        @Override // P6.AbstractC1287m, P6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            super.close();
            b(null);
        }

        @Override // P6.AbstractC1287m, P6.Z
        public long y(C1279e c1279e, long j8) {
            try {
                long y8 = a().y(c1279e, j8);
                if (y8 > 0) {
                    this.f6579c += y8;
                }
                return y8;
            } catch (IOException e8) {
                b(e8);
                throw e8;
            }
        }
    }

    static {
        C1282h f8 = C1282h.f("connection");
        f6563f = f8;
        C1282h f9 = C1282h.f("host");
        f6564g = f9;
        C1282h f10 = C1282h.f("keep-alive");
        f6565h = f10;
        C1282h f11 = C1282h.f("proxy-connection");
        f6566i = f11;
        C1282h f12 = C1282h.f("transfer-encoding");
        f6567j = f12;
        C1282h f13 = C1282h.f("te");
        f6568k = f13;
        C1282h f14 = C1282h.f("encoding");
        f6569l = f14;
        C1282h f15 = C1282h.f("upgrade");
        f6570m = f15;
        f6571n = G6.c.r(f8, f9, f10, f11, f13, f12, f14, f15, c.f6532f, c.f6533g, c.f6534h, c.f6535i);
        f6572o = G6.c.r(f8, f9, f10, f11, f13, f12, f14, f15);
    }

    public f(u uVar, s.a aVar, I6.g gVar, g gVar2) {
        this.f6573a = uVar;
        this.f6574b = aVar;
        this.f6575c = gVar;
        this.f6576d = gVar2;
    }

    public static List d(x xVar) {
        q d8 = xVar.d();
        ArrayList arrayList = new ArrayList(d8.e() + 4);
        arrayList.add(new c(c.f6532f, xVar.g()));
        arrayList.add(new c(c.f6533g, J6.i.c(xVar.i())));
        String c8 = xVar.c("Host");
        if (c8 != null) {
            arrayList.add(new c(c.f6535i, c8));
        }
        arrayList.add(new c(c.f6534h, xVar.i().A()));
        int e8 = d8.e();
        for (int i8 = 0; i8 < e8; i8++) {
            C1282h f8 = C1282h.f(d8.c(i8).toLowerCase(Locale.US));
            if (!f6571n.contains(f8)) {
                arrayList.add(new c(f8, d8.f(i8)));
            }
        }
        return arrayList;
    }

    public static z.a e(List list) {
        q.a aVar = new q.a();
        int size = list.size();
        J6.k kVar = null;
        for (int i8 = 0; i8 < size; i8++) {
            c cVar = (c) list.get(i8);
            if (cVar == null) {
                if (kVar != null && kVar.f5520b == 100) {
                    aVar = new q.a();
                    kVar = null;
                }
            } else {
                C1282h c1282h = cVar.f6536a;
                String M8 = cVar.f6537b.M();
                if (c1282h.equals(c.f6531e)) {
                    kVar = J6.k.a("HTTP/1.1 " + M8);
                } else if (!f6572o.contains(c1282h)) {
                    G6.a.f3205a.b(aVar, c1282h.M(), M8);
                }
            }
        }
        if (kVar != null) {
            return new z.a().m(v.HTTP_2).g(kVar.f5520b).j(kVar.f5521c).i(aVar.d());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // J6.c
    public A a(z zVar) {
        I6.g gVar = this.f6575c;
        gVar.f4307f.q(gVar.f4306e);
        return new J6.h(zVar.h("Content-Type"), J6.e.b(zVar), L.d(new a(this.f6577e.i())));
    }

    @Override // J6.c
    public X b(x xVar, long j8) {
        return this.f6577e.h();
    }

    @Override // J6.c
    public void c(x xVar) {
        boolean z8;
        if (this.f6577e != null) {
            return;
        }
        if (xVar.a() != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        i u8 = this.f6576d.u(d(xVar), z8);
        this.f6577e = u8;
        a0 l8 = u8.l();
        long readTimeoutMillis = this.f6574b.readTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        l8.g(readTimeoutMillis, timeUnit);
        this.f6577e.s().g(this.f6574b.writeTimeoutMillis(), timeUnit);
    }

    @Override // J6.c
    public void finishRequest() {
        this.f6577e.h().close();
    }

    @Override // J6.c
    public void flushRequest() {
        this.f6576d.flush();
    }

    @Override // J6.c
    public z.a readResponseHeaders(boolean z8) {
        z.a e8 = e(this.f6577e.q());
        if (z8 && G6.a.f3205a.d(e8) == 100) {
            return null;
        }
        return e8;
    }
}
