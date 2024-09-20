package L6;

import P6.C1277c;
import P6.C1279e;
import P6.InterfaceC1281g;
import P6.X;
import P6.Z;
import P6.a0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    long f6655b;

    /* renamed from: c, reason: collision with root package name */
    final int f6656c;

    /* renamed from: d, reason: collision with root package name */
    final g f6657d;

    /* renamed from: e, reason: collision with root package name */
    private final List f6658e;

    /* renamed from: f, reason: collision with root package name */
    private List f6659f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6660g;

    /* renamed from: h, reason: collision with root package name */
    private final b f6661h;

    /* renamed from: i, reason: collision with root package name */
    final a f6662i;

    /* renamed from: a, reason: collision with root package name */
    long f6654a = 0;

    /* renamed from: j, reason: collision with root package name */
    final c f6663j = new c();

    /* renamed from: k, reason: collision with root package name */
    final c f6664k = new c();

    /* renamed from: l, reason: collision with root package name */
    L6.b f6665l = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class a implements X {

        /* renamed from: a, reason: collision with root package name */
        private final C1279e f6666a = new C1279e();

        /* renamed from: b, reason: collision with root package name */
        boolean f6667b;

        /* renamed from: c, reason: collision with root package name */
        boolean f6668c;

        a() {
        }

        private void a(boolean z8) {
            i iVar;
            long min;
            i iVar2;
            boolean z9;
            synchronized (i.this) {
                i.this.f6664k.v();
                while (true) {
                    try {
                        iVar = i.this;
                        if (iVar.f6655b > 0 || this.f6668c || this.f6667b || iVar.f6665l != null) {
                            break;
                        } else {
                            iVar.r();
                        }
                    } finally {
                        i.this.f6664k.C();
                    }
                }
                iVar.f6664k.C();
                i.this.c();
                min = Math.min(i.this.f6655b, this.f6666a.x());
                iVar2 = i.this;
                iVar2.f6655b -= min;
            }
            iVar2.f6664k.v();
            try {
                i iVar3 = i.this;
                g gVar = iVar3.f6657d;
                int i8 = iVar3.f6656c;
                if (z8 && min == this.f6666a.x()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                gVar.K(i8, z9, this.f6666a, min);
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // P6.X
        public void C(C1279e c1279e, long j8) {
            this.f6666a.C(c1279e, j8);
            while (this.f6666a.x() >= 16384) {
                a(false);
            }
        }

        @Override // P6.X, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (i.this) {
                try {
                    if (this.f6667b) {
                        return;
                    }
                    if (!i.this.f6662i.f6668c) {
                        if (this.f6666a.x() > 0) {
                            while (this.f6666a.x() > 0) {
                                a(true);
                            }
                        } else {
                            i iVar = i.this;
                            iVar.f6657d.K(iVar.f6656c, true, null, 0L);
                        }
                    }
                    synchronized (i.this) {
                        this.f6667b = true;
                    }
                    i.this.f6657d.flush();
                    i.this.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // P6.X, java.io.Flushable
        public void flush() {
            synchronized (i.this) {
                i.this.c();
            }
            while (this.f6666a.x() > 0) {
                a(false);
                i.this.f6657d.flush();
            }
        }

        @Override // P6.X
        public a0 timeout() {
            return i.this.f6664k;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class b implements Z {

        /* renamed from: a, reason: collision with root package name */
        private final C1279e f6670a = new C1279e();

        /* renamed from: b, reason: collision with root package name */
        private final C1279e f6671b = new C1279e();

        /* renamed from: c, reason: collision with root package name */
        private final long f6672c;

        /* renamed from: d, reason: collision with root package name */
        boolean f6673d;

        /* renamed from: e, reason: collision with root package name */
        boolean f6674e;

        b(long j8) {
            this.f6672c = j8;
        }

        private void a() {
            if (!this.f6673d) {
                if (i.this.f6665l == null) {
                    return;
                } else {
                    throw new n(i.this.f6665l);
                }
            }
            throw new IOException("stream closed");
        }

        private void e() {
            i.this.f6663j.v();
            while (this.f6671b.x() == 0 && !this.f6674e && !this.f6673d) {
                try {
                    i iVar = i.this;
                    if (iVar.f6665l != null) {
                        break;
                    } else {
                        iVar.r();
                    }
                } finally {
                    i.this.f6663j.C();
                }
            }
        }

        void b(InterfaceC1281g interfaceC1281g, long j8) {
            boolean z8;
            boolean z9;
            boolean z10;
            while (j8 > 0) {
                synchronized (i.this) {
                    z8 = this.f6674e;
                    z9 = false;
                    if (this.f6671b.x() + j8 > this.f6672c) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    interfaceC1281g.skip(j8);
                    i.this.f(L6.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z8) {
                    interfaceC1281g.skip(j8);
                    return;
                }
                long y8 = interfaceC1281g.y(this.f6670a, j8);
                if (y8 != -1) {
                    j8 -= y8;
                    synchronized (i.this) {
                        try {
                            if (this.f6671b.x() == 0) {
                                z9 = true;
                            }
                            this.f6671b.K(this.f6670a);
                            if (z9) {
                                i.this.notifyAll();
                            }
                        } finally {
                        }
                    }
                } else {
                    throw new EOFException();
                }
            }
        }

        @Override // P6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (i.this) {
                this.f6673d = true;
                this.f6671b.a();
                i.this.notifyAll();
            }
            i.this.b();
        }

        @Override // P6.Z
        public a0 timeout() {
            return i.this.f6663j;
        }

        @Override // P6.Z
        public long y(C1279e c1279e, long j8) {
            if (j8 >= 0) {
                synchronized (i.this) {
                    try {
                        e();
                        a();
                        if (this.f6671b.x() == 0) {
                            return -1L;
                        }
                        C1279e c1279e2 = this.f6671b;
                        long y8 = c1279e2.y(c1279e, Math.min(j8, c1279e2.x()));
                        i iVar = i.this;
                        long j9 = iVar.f6654a + y8;
                        iVar.f6654a = j9;
                        if (j9 >= iVar.f6657d.f6595n.d() / 2) {
                            i iVar2 = i.this;
                            iVar2.f6657d.O(iVar2.f6656c, iVar2.f6654a);
                            i.this.f6654a = 0L;
                        }
                        synchronized (i.this.f6657d) {
                            try {
                                g gVar = i.this.f6657d;
                                long j10 = gVar.f6593l + y8;
                                gVar.f6593l = j10;
                                if (j10 >= gVar.f6595n.d() / 2) {
                                    g gVar2 = i.this.f6657d;
                                    gVar2.O(0, gVar2.f6593l);
                                    i.this.f6657d.f6593l = 0L;
                                }
                            } finally {
                            }
                        }
                        return y8;
                    } finally {
                    }
                }
            }
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class c extends C1277c {
        c() {
        }

        @Override // P6.C1277c
        protected void B() {
            i.this.f(L6.b.CANCEL);
        }

        public void C() {
            if (!w()) {
            } else {
                throw x(null);
            }
        }

        @Override // P6.C1277c
        protected IOException x(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(int i8, g gVar, boolean z8, boolean z9, List list) {
        if (gVar != null) {
            if (list != null) {
                this.f6656c = i8;
                this.f6657d = gVar;
                this.f6655b = gVar.f6596o.d();
                b bVar = new b(gVar.f6595n.d());
                this.f6661h = bVar;
                a aVar = new a();
                this.f6662i = aVar;
                bVar.f6674e = z9;
                aVar.f6668c = z8;
                this.f6658e = list;
                return;
            }
            throw new NullPointerException("requestHeaders == null");
        }
        throw new NullPointerException("connection == null");
    }

    private boolean e(L6.b bVar) {
        synchronized (this) {
            try {
                if (this.f6665l != null) {
                    return false;
                }
                if (this.f6661h.f6674e && this.f6662i.f6668c) {
                    return false;
                }
                this.f6665l = bVar;
                notifyAll();
                this.f6657d.G(this.f6656c);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j8) {
        this.f6655b += j8;
        if (j8 > 0) {
            notifyAll();
        }
    }

    void b() {
        boolean z8;
        boolean k8;
        synchronized (this) {
            try {
                b bVar = this.f6661h;
                if (!bVar.f6674e && bVar.f6673d) {
                    a aVar = this.f6662i;
                    if (!aVar.f6668c) {
                        if (aVar.f6667b) {
                        }
                    }
                    z8 = true;
                    k8 = k();
                }
                z8 = false;
                k8 = k();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z8) {
            d(L6.b.CANCEL);
        } else if (!k8) {
            this.f6657d.G(this.f6656c);
        }
    }

    void c() {
        a aVar = this.f6662i;
        if (!aVar.f6667b) {
            if (!aVar.f6668c) {
                if (this.f6665l == null) {
                    return;
                } else {
                    throw new n(this.f6665l);
                }
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public void d(L6.b bVar) {
        if (!e(bVar)) {
            return;
        }
        this.f6657d.M(this.f6656c, bVar);
    }

    public void f(L6.b bVar) {
        if (!e(bVar)) {
            return;
        }
        this.f6657d.N(this.f6656c, bVar);
    }

    public int g() {
        return this.f6656c;
    }

    public X h() {
        synchronized (this) {
            try {
                if (!this.f6660g && !j()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f6662i;
    }

    public Z i() {
        return this.f6661h;
    }

    public boolean j() {
        boolean z8;
        if ((this.f6656c & 1) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.f6657d.f6582a == z8) {
            return true;
        }
        return false;
    }

    public synchronized boolean k() {
        try {
            if (this.f6665l != null) {
                return false;
            }
            b bVar = this.f6661h;
            if (!bVar.f6674e) {
                if (bVar.f6673d) {
                }
                return true;
            }
            a aVar = this.f6662i;
            if (aVar.f6668c || aVar.f6667b) {
                if (this.f6660g) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public a0 l() {
        return this.f6663j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(InterfaceC1281g interfaceC1281g, int i8) {
        this.f6661h.b(interfaceC1281g, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
        boolean k8;
        synchronized (this) {
            this.f6661h.f6674e = true;
            k8 = k();
            notifyAll();
        }
        if (!k8) {
            this.f6657d.G(this.f6656c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(List list) {
        boolean z8;
        synchronized (this) {
            z8 = true;
            try {
                this.f6660g = true;
                if (this.f6659f == null) {
                    this.f6659f = list;
                    z8 = k();
                    notifyAll();
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(this.f6659f);
                    arrayList.add(null);
                    arrayList.addAll(list);
                    this.f6659f = arrayList;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z8) {
            this.f6657d.G(this.f6656c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void p(L6.b bVar) {
        if (this.f6665l == null) {
            this.f6665l = bVar;
            notifyAll();
        }
    }

    public synchronized List q() {
        List list;
        if (j()) {
            this.f6663j.v();
            while (this.f6659f == null && this.f6665l == null) {
                try {
                    r();
                } catch (Throwable th) {
                    this.f6663j.C();
                    throw th;
                }
            }
            this.f6663j.C();
            list = this.f6659f;
            if (list != null) {
                this.f6659f = null;
            } else {
                throw new n(this.f6665l);
            }
        } else {
            throw new IllegalStateException("servers cannot read response headers");
        }
        return list;
    }

    void r() {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    public a0 s() {
        return this.f6664k;
    }
}
