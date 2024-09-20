package F6;

import F6.q;
import F6.x;
import F6.z;
import H6.d;
import P6.AbstractC1286l;
import P6.AbstractC1287m;
import P6.C1279e;
import P6.C1282h;
import P6.InterfaceC1280f;
import P6.InterfaceC1281g;
import P6.L;
import P6.X;
import P6.Z;
import androidx.browser.trusted.sharing.ShareTarget;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: F6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1166c implements Closeable, Flushable {

    /* renamed from: a, reason: collision with root package name */
    final H6.f f2696a;

    /* renamed from: b, reason: collision with root package name */
    final H6.d f2697b;

    /* renamed from: c, reason: collision with root package name */
    int f2698c;

    /* renamed from: d, reason: collision with root package name */
    int f2699d;

    /* renamed from: e, reason: collision with root package name */
    private int f2700e;

    /* renamed from: f, reason: collision with root package name */
    private int f2701f;

    /* renamed from: g, reason: collision with root package name */
    private int f2702g;

    /* renamed from: F6.c$a */
    /* loaded from: classes5.dex */
    class a implements H6.f {
        a() {
        }

        @Override // H6.f
        public void a(x xVar) {
            C1166c.this.h(xVar);
        }

        @Override // H6.f
        public void b(H6.c cVar) {
            C1166c.this.m(cVar);
        }

        @Override // H6.f
        public void c(z zVar, z zVar2) {
            C1166c.this.o(zVar, zVar2);
        }

        @Override // H6.f
        public H6.b d(z zVar) {
            return C1166c.this.f(zVar);
        }

        @Override // H6.f
        public z e(x xVar) {
            return C1166c.this.b(xVar);
        }

        @Override // H6.f
        public void trackConditionalCacheHit() {
            C1166c.this.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F6.c$b */
    /* loaded from: classes5.dex */
    public final class b implements H6.b {

        /* renamed from: a, reason: collision with root package name */
        private final d.c f2704a;

        /* renamed from: b, reason: collision with root package name */
        private X f2705b;

        /* renamed from: c, reason: collision with root package name */
        private X f2706c;

        /* renamed from: d, reason: collision with root package name */
        boolean f2707d;

        /* renamed from: F6.c$b$a */
        /* loaded from: classes5.dex */
        class a extends AbstractC1286l {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1166c f2709b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ d.c f2710c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(X x8, C1166c c1166c, d.c cVar) {
                super(x8);
                this.f2709b = c1166c;
                this.f2710c = cVar;
            }

            @Override // P6.AbstractC1286l, P6.X, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                synchronized (C1166c.this) {
                    try {
                        b bVar = b.this;
                        if (bVar.f2707d) {
                            return;
                        }
                        bVar.f2707d = true;
                        C1166c.this.f2698c++;
                        super.close();
                        this.f2710c.b();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        b(d.c cVar) {
            this.f2704a = cVar;
            X d8 = cVar.d(1);
            this.f2705b = d8;
            this.f2706c = new a(d8, C1166c.this, cVar);
        }

        @Override // H6.b
        public void abort() {
            synchronized (C1166c.this) {
                try {
                    if (this.f2707d) {
                        return;
                    }
                    this.f2707d = true;
                    C1166c.this.f2699d++;
                    G6.c.d(this.f2705b);
                    try {
                        this.f2704a.a();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // H6.b
        public X body() {
            return this.f2706c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F6.c$c, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0043c extends A {

        /* renamed from: a, reason: collision with root package name */
        final d.e f2712a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC1281g f2713b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2714c;

        /* renamed from: d, reason: collision with root package name */
        private final String f2715d;

        /* renamed from: F6.c$c$a */
        /* loaded from: classes5.dex */
        class a extends AbstractC1287m {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d.e f2716b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Z z8, d.e eVar) {
                super(z8);
                this.f2716b = eVar;
            }

            @Override // P6.AbstractC1287m, P6.Z, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f2716b.close();
                super.close();
            }
        }

        C0043c(d.e eVar, String str, String str2) {
            this.f2712a = eVar;
            this.f2714c = str;
            this.f2715d = str2;
            this.f2713b = L.d(new a(eVar.b(1), eVar));
        }

        @Override // F6.A
        public long a() {
            try {
                String str = this.f2715d;
                if (str == null) {
                    return -1L;
                }
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // F6.A
        public InterfaceC1281g f() {
            return this.f2713b;
        }
    }

    public C1166c(File file, long j8) {
        this(file, j8, M6.a.f7060a);
    }

    private void a(d.c cVar) {
        if (cVar != null) {
            try {
                cVar.a();
            } catch (IOException unused) {
            }
        }
    }

    public static String e(r rVar) {
        return C1282h.f(rVar.toString()).x().n();
    }

    static int g(InterfaceC1281g interfaceC1281g) {
        try {
            long readDecimalLong = interfaceC1281g.readDecimalLong();
            String readUtf8LineStrict = interfaceC1281g.readUtf8LineStrict();
            if (readDecimalLong >= 0 && readDecimalLong <= 2147483647L && readUtf8LineStrict.isEmpty()) {
                return (int) readDecimalLong;
            }
            throw new IOException("expected an int but was \"" + readDecimalLong + readUtf8LineStrict + "\"");
        } catch (NumberFormatException e8) {
            throw new IOException(e8.getMessage());
        }
    }

    z b(x xVar) {
        try {
            d.e l8 = this.f2697b.l(e(xVar.i()));
            if (l8 == null) {
                return null;
            }
            try {
                d dVar = new d(l8.b(0));
                z d8 = dVar.d(l8);
                if (!dVar.b(xVar, d8)) {
                    G6.c.d(d8.a());
                    return null;
                }
                return d8;
            } catch (IOException unused) {
                G6.c.d(l8);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2697b.close();
    }

    H6.b f(z zVar) {
        d.c cVar;
        String g8 = zVar.E().g();
        if (J6.f.a(zVar.E().g())) {
            try {
                h(zVar.E());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!g8.equals(ShareTarget.METHOD_GET) || J6.e.e(zVar)) {
            return null;
        }
        d dVar = new d(zVar);
        try {
            cVar = this.f2697b.g(e(zVar.E().i()));
            if (cVar == null) {
                return null;
            }
            try {
                dVar.f(cVar);
                return new b(cVar);
            } catch (IOException unused2) {
                a(cVar);
                return null;
            }
        } catch (IOException unused3) {
            cVar = null;
        }
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f2697b.flush();
    }

    void h(x xVar) {
        this.f2697b.A(e(xVar.i()));
    }

    synchronized void l() {
        this.f2701f++;
    }

    synchronized void m(H6.c cVar) {
        try {
            this.f2702g++;
            if (cVar.f3521a != null) {
                this.f2700e++;
            } else if (cVar.f3522b != null) {
                this.f2701f++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    void o(z zVar, z zVar2) {
        d.c cVar;
        d dVar = new d(zVar2);
        try {
            cVar = ((C0043c) zVar.a()).f2712a.a();
            if (cVar != null) {
                try {
                    dVar.f(cVar);
                    cVar.b();
                } catch (IOException unused) {
                    a(cVar);
                }
            }
        } catch (IOException unused2) {
            cVar = null;
        }
    }

    C1166c(File file, long j8, M6.a aVar) {
        this.f2696a = new a();
        this.f2697b = H6.d.e(aVar, file, 201105, 2, j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F6.c$d */
    /* loaded from: classes5.dex */
    public static final class d {

        /* renamed from: k, reason: collision with root package name */
        private static final String f2718k = N6.f.i().j() + "-Sent-Millis";

        /* renamed from: l, reason: collision with root package name */
        private static final String f2719l = N6.f.i().j() + "-Received-Millis";

        /* renamed from: a, reason: collision with root package name */
        private final String f2720a;

        /* renamed from: b, reason: collision with root package name */
        private final q f2721b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2722c;

        /* renamed from: d, reason: collision with root package name */
        private final v f2723d;

        /* renamed from: e, reason: collision with root package name */
        private final int f2724e;

        /* renamed from: f, reason: collision with root package name */
        private final String f2725f;

        /* renamed from: g, reason: collision with root package name */
        private final q f2726g;

        /* renamed from: h, reason: collision with root package name */
        private final p f2727h;

        /* renamed from: i, reason: collision with root package name */
        private final long f2728i;

        /* renamed from: j, reason: collision with root package name */
        private final long f2729j;

        d(Z z8) {
            C c8;
            try {
                InterfaceC1281g d8 = L.d(z8);
                this.f2720a = d8.readUtf8LineStrict();
                this.f2722c = d8.readUtf8LineStrict();
                q.a aVar = new q.a();
                int g8 = C1166c.g(d8);
                for (int i8 = 0; i8 < g8; i8++) {
                    aVar.b(d8.readUtf8LineStrict());
                }
                this.f2721b = aVar.d();
                J6.k a8 = J6.k.a(d8.readUtf8LineStrict());
                this.f2723d = a8.f5519a;
                this.f2724e = a8.f5520b;
                this.f2725f = a8.f5521c;
                q.a aVar2 = new q.a();
                int g9 = C1166c.g(d8);
                for (int i9 = 0; i9 < g9; i9++) {
                    aVar2.b(d8.readUtf8LineStrict());
                }
                String str = f2718k;
                String f8 = aVar2.f(str);
                String str2 = f2719l;
                String f9 = aVar2.f(str2);
                aVar2.g(str);
                aVar2.g(str2);
                this.f2728i = f8 != null ? Long.parseLong(f8) : 0L;
                this.f2729j = f9 != null ? Long.parseLong(f9) : 0L;
                this.f2726g = aVar2.d();
                if (a()) {
                    String readUtf8LineStrict = d8.readUtf8LineStrict();
                    if (readUtf8LineStrict.length() <= 0) {
                        g a9 = g.a(d8.readUtf8LineStrict());
                        List c9 = c(d8);
                        List c10 = c(d8);
                        if (!d8.exhausted()) {
                            c8 = C.a(d8.readUtf8LineStrict());
                        } else {
                            c8 = C.SSL_3_0;
                        }
                        this.f2727h = p.b(c8, a9, c9, c10);
                    } else {
                        throw new IOException("expected \"\" but was \"" + readUtf8LineStrict + "\"");
                    }
                } else {
                    this.f2727h = null;
                }
                z8.close();
            } catch (Throwable th) {
                z8.close();
                throw th;
            }
        }

        private boolean a() {
            return this.f2720a.startsWith("https://");
        }

        private List c(InterfaceC1281g interfaceC1281g) {
            int g8 = C1166c.g(interfaceC1281g);
            if (g8 == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(g8);
                for (int i8 = 0; i8 < g8; i8++) {
                    String readUtf8LineStrict = interfaceC1281g.readUtf8LineStrict();
                    C1279e c1279e = new C1279e();
                    c1279e.G(C1282h.c(readUtf8LineStrict));
                    arrayList.add(certificateFactory.generateCertificate(c1279e.inputStream()));
                }
                return arrayList;
            } catch (CertificateException e8) {
                throw new IOException(e8.getMessage());
            }
        }

        private void e(InterfaceC1280f interfaceC1280f, List list) {
            try {
                interfaceC1280f.writeDecimalLong(list.size()).writeByte(10);
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    interfaceC1280f.writeUtf8(C1282h.y(((Certificate) list.get(i8)).getEncoded()).a()).writeByte(10);
                }
            } catch (CertificateEncodingException e8) {
                throw new IOException(e8.getMessage());
            }
        }

        public boolean b(x xVar, z zVar) {
            if (this.f2720a.equals(xVar.i().toString()) && this.f2722c.equals(xVar.g()) && J6.e.o(zVar, this.f2721b, xVar)) {
                return true;
            }
            return false;
        }

        public z d(d.e eVar) {
            String a8 = this.f2726g.a("Content-Type");
            String a9 = this.f2726g.a("Content-Length");
            return new z.a().o(new x.a().h(this.f2720a).e(this.f2722c, null).d(this.f2721b).a()).m(this.f2723d).g(this.f2724e).j(this.f2725f).i(this.f2726g).b(new C0043c(eVar, a8, a9)).h(this.f2727h).p(this.f2728i).n(this.f2729j).c();
        }

        public void f(d.c cVar) {
            InterfaceC1280f c8 = L.c(cVar.d(0));
            c8.writeUtf8(this.f2720a).writeByte(10);
            c8.writeUtf8(this.f2722c).writeByte(10);
            c8.writeDecimalLong(this.f2721b.e()).writeByte(10);
            int e8 = this.f2721b.e();
            for (int i8 = 0; i8 < e8; i8++) {
                c8.writeUtf8(this.f2721b.c(i8)).writeUtf8(": ").writeUtf8(this.f2721b.f(i8)).writeByte(10);
            }
            c8.writeUtf8(new J6.k(this.f2723d, this.f2724e, this.f2725f).toString()).writeByte(10);
            c8.writeDecimalLong(this.f2726g.e() + 2).writeByte(10);
            int e9 = this.f2726g.e();
            for (int i9 = 0; i9 < e9; i9++) {
                c8.writeUtf8(this.f2726g.c(i9)).writeUtf8(": ").writeUtf8(this.f2726g.f(i9)).writeByte(10);
            }
            c8.writeUtf8(f2718k).writeUtf8(": ").writeDecimalLong(this.f2728i).writeByte(10);
            c8.writeUtf8(f2719l).writeUtf8(": ").writeDecimalLong(this.f2729j).writeByte(10);
            if (a()) {
                c8.writeByte(10);
                c8.writeUtf8(this.f2727h.a().c()).writeByte(10);
                e(c8, this.f2727h.e());
                e(c8, this.f2727h.d());
                c8.writeUtf8(this.f2727h.f().c()).writeByte(10);
            }
            c8.close();
        }

        d(z zVar) {
            this.f2720a = zVar.E().i().toString();
            this.f2721b = J6.e.n(zVar);
            this.f2722c = zVar.E().g();
            this.f2723d = zVar.x();
            this.f2724e = zVar.f();
            this.f2725f = zVar.r();
            this.f2726g = zVar.m();
            this.f2727h = zVar.g();
            this.f2728i = zVar.F();
            this.f2729j = zVar.A();
        }
    }
}
