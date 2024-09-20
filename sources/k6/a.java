package K6;

import F6.A;
import F6.q;
import F6.r;
import F6.u;
import F6.x;
import F6.z;
import J6.h;
import J6.i;
import J6.k;
import P6.C1279e;
import P6.C1288n;
import P6.InterfaceC1280f;
import P6.InterfaceC1281g;
import P6.L;
import P6.X;
import P6.Z;
import P6.a0;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class a implements J6.c {

    /* renamed from: a, reason: collision with root package name */
    final u f5968a;

    /* renamed from: b, reason: collision with root package name */
    final I6.g f5969b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC1281g f5970c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC1280f f5971d;

    /* renamed from: e, reason: collision with root package name */
    int f5972e = 0;

    /* renamed from: f, reason: collision with root package name */
    private long f5973f = 262144;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public abstract class b implements Z {

        /* renamed from: a, reason: collision with root package name */
        protected final C1288n f5974a;

        /* renamed from: b, reason: collision with root package name */
        protected boolean f5975b;

        /* renamed from: c, reason: collision with root package name */
        protected long f5976c;

        private b() {
            this.f5974a = new C1288n(a.this.f5970c.timeout());
            this.f5976c = 0L;
        }

        protected final void a(boolean z8, IOException iOException) {
            a aVar = a.this;
            int i8 = aVar.f5972e;
            if (i8 == 6) {
                return;
            }
            if (i8 == 5) {
                aVar.d(this.f5974a);
                a aVar2 = a.this;
                aVar2.f5972e = 6;
                I6.g gVar = aVar2.f5969b;
                if (gVar != null) {
                    gVar.q(!z8, aVar2, this.f5976c, iOException);
                    return;
                }
                return;
            }
            throw new IllegalStateException("state: " + a.this.f5972e);
        }

        @Override // P6.Z
        public a0 timeout() {
            return this.f5974a;
        }

        @Override // P6.Z
        public long y(C1279e c1279e, long j8) {
            try {
                long y8 = a.this.f5970c.y(c1279e, j8);
                if (y8 > 0) {
                    this.f5976c += y8;
                }
                return y8;
            } catch (IOException e8) {
                a(false, e8);
                throw e8;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class c implements X {

        /* renamed from: a, reason: collision with root package name */
        private final C1288n f5978a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f5979b;

        c() {
            this.f5978a = new C1288n(a.this.f5971d.timeout());
        }

        @Override // P6.X
        public void C(C1279e c1279e, long j8) {
            if (!this.f5979b) {
                if (j8 == 0) {
                    return;
                }
                a.this.f5971d.writeHexadecimalUnsignedLong(j8);
                a.this.f5971d.writeUtf8("\r\n");
                a.this.f5971d.C(c1279e, j8);
                a.this.f5971d.writeUtf8("\r\n");
                return;
            }
            throw new IllegalStateException("closed");
        }

        @Override // P6.X, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f5979b) {
                return;
            }
            this.f5979b = true;
            a.this.f5971d.writeUtf8("0\r\n\r\n");
            a.this.d(this.f5978a);
            a.this.f5972e = 3;
        }

        @Override // P6.X, java.io.Flushable
        public synchronized void flush() {
            if (this.f5979b) {
                return;
            }
            a.this.f5971d.flush();
        }

        @Override // P6.X
        public a0 timeout() {
            return this.f5978a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class d extends b {

        /* renamed from: e, reason: collision with root package name */
        private final r f5981e;

        /* renamed from: f, reason: collision with root package name */
        private long f5982f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f5983g;

        d(r rVar) {
            super();
            this.f5982f = -1L;
            this.f5983g = true;
            this.f5981e = rVar;
        }

        private void b() {
            if (this.f5982f != -1) {
                a.this.f5970c.readUtf8LineStrict();
            }
            try {
                this.f5982f = a.this.f5970c.readHexadecimalUnsignedLong();
                String trim = a.this.f5970c.readUtf8LineStrict().trim();
                if (this.f5982f >= 0 && (trim.isEmpty() || trim.startsWith(";"))) {
                    if (this.f5982f == 0) {
                        this.f5983g = false;
                        J6.e.g(a.this.f5968a.h(), this.f5981e, a.this.k());
                        a(true, null);
                        return;
                    }
                    return;
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f5982f + trim + "\"");
            } catch (NumberFormatException e8) {
                throw new ProtocolException(e8.getMessage());
            }
        }

        @Override // P6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f5975b) {
                return;
            }
            if (this.f5983g && !G6.c.m(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f5975b = true;
        }

        @Override // K6.a.b, P6.Z
        public long y(C1279e c1279e, long j8) {
            if (j8 >= 0) {
                if (!this.f5975b) {
                    if (!this.f5983g) {
                        return -1L;
                    }
                    long j9 = this.f5982f;
                    if (j9 == 0 || j9 == -1) {
                        b();
                        if (!this.f5983g) {
                            return -1L;
                        }
                    }
                    long y8 = super.y(c1279e, Math.min(j8, this.f5982f));
                    if (y8 != -1) {
                        this.f5982f -= y8;
                        return y8;
                    }
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    a(false, protocolException);
                    throw protocolException;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class e implements X {

        /* renamed from: a, reason: collision with root package name */
        private final C1288n f5985a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f5986b;

        /* renamed from: c, reason: collision with root package name */
        private long f5987c;

        e(long j8) {
            this.f5985a = new C1288n(a.this.f5971d.timeout());
            this.f5987c = j8;
        }

        @Override // P6.X
        public void C(C1279e c1279e, long j8) {
            if (!this.f5986b) {
                G6.c.c(c1279e.x(), 0L, j8);
                if (j8 <= this.f5987c) {
                    a.this.f5971d.C(c1279e, j8);
                    this.f5987c -= j8;
                    return;
                }
                throw new ProtocolException("expected " + this.f5987c + " bytes but received " + j8);
            }
            throw new IllegalStateException("closed");
        }

        @Override // P6.X, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f5986b) {
                return;
            }
            this.f5986b = true;
            if (this.f5987c <= 0) {
                a.this.d(this.f5985a);
                a.this.f5972e = 3;
                return;
            }
            throw new ProtocolException("unexpected end of stream");
        }

        @Override // P6.X, java.io.Flushable
        public void flush() {
            if (this.f5986b) {
                return;
            }
            a.this.f5971d.flush();
        }

        @Override // P6.X
        public a0 timeout() {
            return this.f5985a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class f extends b {

        /* renamed from: e, reason: collision with root package name */
        private long f5989e;

        f(long j8) {
            super();
            this.f5989e = j8;
            if (j8 == 0) {
                a(true, null);
            }
        }

        @Override // P6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f5975b) {
                return;
            }
            if (this.f5989e != 0 && !G6.c.m(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f5975b = true;
        }

        @Override // K6.a.b, P6.Z
        public long y(C1279e c1279e, long j8) {
            if (j8 >= 0) {
                if (!this.f5975b) {
                    long j9 = this.f5989e;
                    if (j9 == 0) {
                        return -1L;
                    }
                    long y8 = super.y(c1279e, Math.min(j9, j8));
                    if (y8 != -1) {
                        long j10 = this.f5989e - y8;
                        this.f5989e = j10;
                        if (j10 == 0) {
                            a(true, null);
                        }
                        return y8;
                    }
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    a(false, protocolException);
                    throw protocolException;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class g extends b {

        /* renamed from: e, reason: collision with root package name */
        private boolean f5991e;

        g() {
            super();
        }

        @Override // P6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f5975b) {
                return;
            }
            if (!this.f5991e) {
                a(false, null);
            }
            this.f5975b = true;
        }

        @Override // K6.a.b, P6.Z
        public long y(C1279e c1279e, long j8) {
            if (j8 >= 0) {
                if (!this.f5975b) {
                    if (this.f5991e) {
                        return -1L;
                    }
                    long y8 = super.y(c1279e, j8);
                    if (y8 == -1) {
                        this.f5991e = true;
                        a(true, null);
                        return -1L;
                    }
                    return y8;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }
    }

    public a(u uVar, I6.g gVar, InterfaceC1281g interfaceC1281g, InterfaceC1280f interfaceC1280f) {
        this.f5968a = uVar;
        this.f5969b = gVar;
        this.f5970c = interfaceC1281g;
        this.f5971d = interfaceC1280f;
    }

    private String j() {
        String readUtf8LineStrict = this.f5970c.readUtf8LineStrict(this.f5973f);
        this.f5973f -= readUtf8LineStrict.length();
        return readUtf8LineStrict;
    }

    @Override // J6.c
    public A a(z zVar) {
        I6.g gVar = this.f5969b;
        gVar.f4307f.q(gVar.f4306e);
        String h8 = zVar.h("Content-Type");
        if (!J6.e.c(zVar)) {
            return new h(h8, 0L, L.d(h(0L)));
        }
        if ("chunked".equalsIgnoreCase(zVar.h("Transfer-Encoding"))) {
            return new h(h8, -1L, L.d(f(zVar.E().i())));
        }
        long b8 = J6.e.b(zVar);
        if (b8 != -1) {
            return new h(h8, b8, L.d(h(b8)));
        }
        return new h(h8, -1L, L.d(i()));
    }

    @Override // J6.c
    public X b(x xVar, long j8) {
        if ("chunked".equalsIgnoreCase(xVar.c("Transfer-Encoding"))) {
            return e();
        }
        if (j8 != -1) {
            return g(j8);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // J6.c
    public void c(x xVar) {
        l(xVar.d(), i.a(xVar, this.f5969b.c().p().b().type()));
    }

    void d(C1288n c1288n) {
        a0 i8 = c1288n.i();
        c1288n.j(a0.f8018e);
        i8.a();
        i8.b();
    }

    public X e() {
        if (this.f5972e == 1) {
            this.f5972e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f5972e);
    }

    public Z f(r rVar) {
        if (this.f5972e == 4) {
            this.f5972e = 5;
            return new d(rVar);
        }
        throw new IllegalStateException("state: " + this.f5972e);
    }

    @Override // J6.c
    public void finishRequest() {
        this.f5971d.flush();
    }

    @Override // J6.c
    public void flushRequest() {
        this.f5971d.flush();
    }

    public X g(long j8) {
        if (this.f5972e == 1) {
            this.f5972e = 2;
            return new e(j8);
        }
        throw new IllegalStateException("state: " + this.f5972e);
    }

    public Z h(long j8) {
        if (this.f5972e == 4) {
            this.f5972e = 5;
            return new f(j8);
        }
        throw new IllegalStateException("state: " + this.f5972e);
    }

    public Z i() {
        if (this.f5972e == 4) {
            I6.g gVar = this.f5969b;
            if (gVar != null) {
                this.f5972e = 5;
                gVar.i();
                return new g();
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.f5972e);
    }

    public q k() {
        q.a aVar = new q.a();
        while (true) {
            String j8 = j();
            if (j8.length() != 0) {
                G6.a.f3205a.a(aVar, j8);
            } else {
                return aVar.d();
            }
        }
    }

    public void l(q qVar, String str) {
        if (this.f5972e == 0) {
            this.f5971d.writeUtf8(str).writeUtf8("\r\n");
            int e8 = qVar.e();
            for (int i8 = 0; i8 < e8; i8++) {
                this.f5971d.writeUtf8(qVar.c(i8)).writeUtf8(": ").writeUtf8(qVar.f(i8)).writeUtf8("\r\n");
            }
            this.f5971d.writeUtf8("\r\n");
            this.f5972e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f5972e);
    }

    @Override // J6.c
    public z.a readResponseHeaders(boolean z8) {
        int i8 = this.f5972e;
        if (i8 != 1 && i8 != 3) {
            throw new IllegalStateException("state: " + this.f5972e);
        }
        try {
            k a8 = k.a(j());
            z.a i9 = new z.a().m(a8.f5519a).g(a8.f5520b).j(a8.f5521c).i(k());
            if (z8 && a8.f5520b == 100) {
                return null;
            }
            if (a8.f5520b == 100) {
                this.f5972e = 3;
                return i9;
            }
            this.f5972e = 4;
            return i9;
        } catch (EOFException e8) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f5969b);
            iOException.initCause(e8);
            throw iOException;
        }
    }
}
