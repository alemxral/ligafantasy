package I6;

import F6.B;
import F6.C1164a;
import F6.i;
import F6.o;
import F6.s;
import F6.u;
import I6.f;
import L6.n;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final C1164a f4302a;

    /* renamed from: b, reason: collision with root package name */
    private f.a f4303b;

    /* renamed from: c, reason: collision with root package name */
    private B f4304c;

    /* renamed from: d, reason: collision with root package name */
    private final i f4305d;

    /* renamed from: e, reason: collision with root package name */
    public final F6.e f4306e;

    /* renamed from: f, reason: collision with root package name */
    public final o f4307f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f4308g;

    /* renamed from: h, reason: collision with root package name */
    private final f f4309h;

    /* renamed from: i, reason: collision with root package name */
    private int f4310i;

    /* renamed from: j, reason: collision with root package name */
    private c f4311j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f4312k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f4313l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f4314m;

    /* renamed from: n, reason: collision with root package name */
    private J6.c f4315n;

    /* loaded from: classes5.dex */
    public static final class a extends WeakReference {

        /* renamed from: a, reason: collision with root package name */
        public final Object f4316a;

        a(g gVar, Object obj) {
            super(gVar);
            this.f4316a = obj;
        }
    }

    public g(i iVar, C1164a c1164a, F6.e eVar, o oVar, Object obj) {
        this.f4305d = iVar;
        this.f4302a = c1164a;
        this.f4306e = eVar;
        this.f4307f = oVar;
        this.f4309h = new f(c1164a, o(), eVar, oVar);
        this.f4308g = obj;
    }

    private Socket d(boolean z8, boolean z9, boolean z10) {
        Socket socket;
        if (z10) {
            this.f4315n = null;
        }
        if (z9) {
            this.f4313l = true;
        }
        c cVar = this.f4311j;
        if (cVar == null) {
            return null;
        }
        if (z8) {
            cVar.f4284k = true;
        }
        if (this.f4315n != null) {
            return null;
        }
        if (!this.f4313l && !cVar.f4284k) {
            return null;
        }
        k(cVar);
        if (this.f4311j.f4287n.isEmpty()) {
            this.f4311j.f4288o = System.nanoTime();
            if (G6.a.f3205a.e(this.f4305d, this.f4311j)) {
                socket = this.f4311j.q();
                this.f4311j = null;
                return socket;
            }
        }
        socket = null;
        this.f4311j = null;
        return socket;
    }

    private c e(int i8, int i9, int i10, int i11, boolean z8) {
        c cVar;
        Socket m8;
        c cVar2;
        Socket socket;
        B b8;
        boolean z9;
        boolean z10;
        f.a aVar;
        synchronized (this.f4305d) {
            try {
                if (!this.f4313l) {
                    if (this.f4315n == null) {
                        if (!this.f4314m) {
                            cVar = this.f4311j;
                            m8 = m();
                            cVar2 = this.f4311j;
                            socket = null;
                            if (cVar2 != null) {
                                cVar = null;
                            } else {
                                cVar2 = null;
                            }
                            if (!this.f4312k) {
                                cVar = null;
                            }
                            if (cVar2 == null) {
                                G6.a.f3205a.h(this.f4305d, this.f4302a, this, null);
                                c cVar3 = this.f4311j;
                                if (cVar3 != null) {
                                    cVar2 = cVar3;
                                    z9 = true;
                                    b8 = null;
                                } else {
                                    b8 = this.f4304c;
                                }
                            } else {
                                b8 = null;
                            }
                            z9 = false;
                        } else {
                            throw new IOException("Canceled");
                        }
                    } else {
                        throw new IllegalStateException("codec != null");
                    }
                } else {
                    throw new IllegalStateException("released");
                }
            } finally {
            }
        }
        G6.c.e(m8);
        if (cVar != null) {
            this.f4307f.h(this.f4306e, cVar);
        }
        if (z9) {
            this.f4307f.g(this.f4306e, cVar2);
        }
        if (cVar2 != null) {
            return cVar2;
        }
        if (b8 == null && ((aVar = this.f4303b) == null || !aVar.b())) {
            this.f4303b = this.f4309h.e();
            z10 = true;
        } else {
            z10 = false;
        }
        synchronized (this.f4305d) {
            try {
                if (!this.f4314m) {
                    if (z10) {
                        List a8 = this.f4303b.a();
                        int size = a8.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size) {
                                break;
                            }
                            B b9 = (B) a8.get(i12);
                            G6.a.f3205a.h(this.f4305d, this.f4302a, this, b9);
                            c cVar4 = this.f4311j;
                            if (cVar4 != null) {
                                this.f4304c = b9;
                                cVar2 = cVar4;
                                z9 = true;
                                break;
                            }
                            i12++;
                        }
                    }
                    if (!z9) {
                        if (b8 == null) {
                            b8 = this.f4303b.c();
                        }
                        this.f4304c = b8;
                        this.f4310i = 0;
                        cVar2 = new c(this.f4305d, b8);
                        a(cVar2, false);
                    }
                } else {
                    throw new IOException("Canceled");
                }
            } finally {
            }
        }
        if (z9) {
            this.f4307f.g(this.f4306e, cVar2);
            return cVar2;
        }
        cVar2.c(i8, i9, i10, i11, z8, this.f4306e, this.f4307f);
        o().a(cVar2.p());
        synchronized (this.f4305d) {
            try {
                this.f4312k = true;
                G6.a.f3205a.i(this.f4305d, cVar2);
                if (cVar2.m()) {
                    socket = G6.a.f3205a.f(this.f4305d, this.f4302a, this);
                    cVar2 = this.f4311j;
                }
            } finally {
            }
        }
        G6.c.e(socket);
        this.f4307f.g(this.f4306e, cVar2);
        return cVar2;
    }

    private c f(int i8, int i9, int i10, int i11, boolean z8, boolean z9) {
        while (true) {
            c e8 = e(i8, i9, i10, i11, z8);
            synchronized (this.f4305d) {
                try {
                    if (e8.f4285l == 0) {
                        return e8;
                    }
                    if (!e8.l(z9)) {
                        i();
                    } else {
                        return e8;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void k(c cVar) {
        int size = cVar.f4287n.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (((Reference) cVar.f4287n.get(i8)).get() == this) {
                cVar.f4287n.remove(i8);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private Socket m() {
        c cVar = this.f4311j;
        if (cVar != null && cVar.f4284k) {
            return d(false, false, true);
        }
        return null;
    }

    private d o() {
        return G6.a.f3205a.j(this.f4305d);
    }

    public void a(c cVar, boolean z8) {
        if (this.f4311j == null) {
            this.f4311j = cVar;
            this.f4312k = z8;
            cVar.f4287n.add(new a(this, this.f4308g));
            return;
        }
        throw new IllegalStateException();
    }

    public J6.c b() {
        J6.c cVar;
        synchronized (this.f4305d) {
            cVar = this.f4315n;
        }
        return cVar;
    }

    public synchronized c c() {
        return this.f4311j;
    }

    public boolean g() {
        f.a aVar;
        if (this.f4304c == null && (((aVar = this.f4303b) == null || !aVar.b()) && !this.f4309h.c())) {
            return false;
        }
        return true;
    }

    public J6.c h(u uVar, s.a aVar, boolean z8) {
        try {
            J6.c o8 = f(aVar.connectTimeoutMillis(), aVar.readTimeoutMillis(), aVar.writeTimeoutMillis(), uVar.r(), uVar.y(), z8).o(uVar, aVar, this);
            synchronized (this.f4305d) {
                this.f4315n = o8;
            }
            return o8;
        } catch (IOException e8) {
            throw new e(e8);
        }
    }

    public void i() {
        c cVar;
        Socket d8;
        synchronized (this.f4305d) {
            cVar = this.f4311j;
            d8 = d(true, false, false);
            if (this.f4311j != null) {
                cVar = null;
            }
        }
        G6.c.e(d8);
        if (cVar != null) {
            this.f4307f.h(this.f4306e, cVar);
        }
    }

    public void j() {
        c cVar;
        Socket d8;
        synchronized (this.f4305d) {
            cVar = this.f4311j;
            d8 = d(false, true, false);
            if (this.f4311j != null) {
                cVar = null;
            }
        }
        G6.c.e(d8);
        if (cVar != null) {
            this.f4307f.h(this.f4306e, cVar);
        }
    }

    public Socket l(c cVar) {
        if (this.f4315n == null && this.f4311j.f4287n.size() == 1) {
            Reference reference = (Reference) this.f4311j.f4287n.get(0);
            Socket d8 = d(true, false, false);
            this.f4311j = cVar;
            cVar.f4287n.add(reference);
            return d8;
        }
        throw new IllegalStateException();
    }

    public B n() {
        return this.f4304c;
    }

    public void p(IOException iOException) {
        c cVar;
        boolean z8;
        Socket d8;
        synchronized (this.f4305d) {
            try {
                cVar = null;
                if (iOException instanceof n) {
                    L6.b bVar = ((n) iOException).f6694a;
                    L6.b bVar2 = L6.b.REFUSED_STREAM;
                    if (bVar == bVar2) {
                        this.f4310i++;
                    }
                    if (bVar != bVar2 || this.f4310i > 1) {
                        this.f4304c = null;
                        z8 = true;
                    }
                    z8 = false;
                } else {
                    c cVar2 = this.f4311j;
                    if (cVar2 != null && (!cVar2.m() || (iOException instanceof L6.a))) {
                        if (this.f4311j.f4285l == 0) {
                            B b8 = this.f4304c;
                            if (b8 != null && iOException != null) {
                                this.f4309h.a(b8, iOException);
                            }
                            this.f4304c = null;
                        }
                        z8 = true;
                    }
                    z8 = false;
                }
                c cVar3 = this.f4311j;
                d8 = d(z8, false, true);
                if (this.f4311j == null && this.f4312k) {
                    cVar = cVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        G6.c.e(d8);
        if (cVar != null) {
            this.f4307f.h(this.f4306e, cVar);
        }
    }

    public void q(boolean z8, J6.c cVar, long j8, IOException iOException) {
        c cVar2;
        Socket d8;
        boolean z9;
        this.f4307f.p(this.f4306e, j8);
        synchronized (this.f4305d) {
            if (cVar != null) {
                try {
                    if (cVar == this.f4315n) {
                        if (!z8) {
                            this.f4311j.f4285l++;
                        }
                        cVar2 = this.f4311j;
                        d8 = d(z8, false, true);
                        if (this.f4311j != null) {
                            cVar2 = null;
                        }
                        z9 = this.f4313l;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new IllegalStateException("expected " + this.f4315n + " but was " + cVar);
        }
        G6.c.e(d8);
        if (cVar2 != null) {
            this.f4307f.h(this.f4306e, cVar2);
        }
        if (iOException != null) {
            this.f4307f.b(this.f4306e, iOException);
        } else if (z9) {
            this.f4307f.a(this.f4306e);
        }
    }

    public String toString() {
        c c8 = c();
        if (c8 != null) {
            return c8.toString();
        }
        return this.f4302a.toString();
    }
}
