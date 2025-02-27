package L6;

import L6.h;
import P6.C1279e;
import P6.C1282h;
import P6.InterfaceC1280f;
import P6.InterfaceC1281g;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class g implements Closeable {

    /* renamed from: u, reason: collision with root package name */
    private static final ExecutorService f6581u = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), G6.c.B("OkHttp Http2Connection", true));

    /* renamed from: a, reason: collision with root package name */
    final boolean f6582a;

    /* renamed from: b, reason: collision with root package name */
    final h f6583b;

    /* renamed from: d, reason: collision with root package name */
    final String f6585d;

    /* renamed from: e, reason: collision with root package name */
    int f6586e;

    /* renamed from: f, reason: collision with root package name */
    int f6587f;

    /* renamed from: g, reason: collision with root package name */
    boolean f6588g;

    /* renamed from: h, reason: collision with root package name */
    private final ScheduledExecutorService f6589h;

    /* renamed from: i, reason: collision with root package name */
    private final ExecutorService f6590i;

    /* renamed from: j, reason: collision with root package name */
    final l f6591j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6592k;

    /* renamed from: m, reason: collision with root package name */
    long f6594m;

    /* renamed from: o, reason: collision with root package name */
    final m f6596o;

    /* renamed from: p, reason: collision with root package name */
    boolean f6597p;

    /* renamed from: q, reason: collision with root package name */
    final Socket f6598q;

    /* renamed from: r, reason: collision with root package name */
    final L6.j f6599r;

    /* renamed from: s, reason: collision with root package name */
    final j f6600s;

    /* renamed from: t, reason: collision with root package name */
    final Set f6601t;

    /* renamed from: c, reason: collision with root package name */
    final Map f6584c = new LinkedHashMap();

    /* renamed from: l, reason: collision with root package name */
    long f6593l = 0;

    /* renamed from: n, reason: collision with root package name */
    m f6595n = new m();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a extends G6.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6602b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L6.b f6603c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Object[] objArr, int i8, L6.b bVar) {
            super(str, objArr);
            this.f6602b = i8;
            this.f6603c = bVar;
        }

        @Override // G6.b
        public void e() {
            try {
                g.this.M(this.f6602b, this.f6603c);
            } catch (IOException unused) {
                g.this.l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b extends G6.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6605b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f6606c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Object[] objArr, int i8, long j8) {
            super(str, objArr);
            this.f6605b = i8;
            this.f6606c = j8;
        }

        @Override // G6.b
        public void e() {
            try {
                g.this.f6599r.x(this.f6605b, this.f6606c);
            } catch (IOException unused) {
                g.this.l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class c extends G6.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6608b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f6609c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Object[] objArr, int i8, List list) {
            super(str, objArr);
            this.f6608b = i8;
            this.f6609c = list;
        }

        @Override // G6.b
        public void e() {
            if (g.this.f6591j.onRequest(this.f6608b, this.f6609c)) {
                try {
                    g.this.f6599r.t(this.f6608b, L6.b.CANCEL);
                    synchronized (g.this) {
                        g.this.f6601t.remove(Integer.valueOf(this.f6608b));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class d extends G6.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6611b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f6612c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f6613d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Object[] objArr, int i8, List list, boolean z8) {
            super(str, objArr);
            this.f6611b = i8;
            this.f6612c = list;
            this.f6613d = z8;
        }

        @Override // G6.b
        public void e() {
            boolean onHeaders = g.this.f6591j.onHeaders(this.f6611b, this.f6612c, this.f6613d);
            if (onHeaders) {
                try {
                    g.this.f6599r.t(this.f6611b, L6.b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (onHeaders || this.f6613d) {
                synchronized (g.this) {
                    g.this.f6601t.remove(Integer.valueOf(this.f6611b));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class e extends G6.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6615b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1279e f6616c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6617d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f6618e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Object[] objArr, int i8, C1279e c1279e, int i9, boolean z8) {
            super(str, objArr);
            this.f6615b = i8;
            this.f6616c = c1279e;
            this.f6617d = i9;
            this.f6618e = z8;
        }

        @Override // G6.b
        public void e() {
            try {
                boolean b8 = g.this.f6591j.b(this.f6615b, this.f6616c, this.f6617d, this.f6618e);
                if (b8) {
                    g.this.f6599r.t(this.f6615b, L6.b.CANCEL);
                }
                if (b8 || this.f6618e) {
                    synchronized (g.this) {
                        g.this.f6601t.remove(Integer.valueOf(this.f6615b));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class f extends G6.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6620b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L6.b f6621c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Object[] objArr, int i8, L6.b bVar) {
            super(str, objArr);
            this.f6620b = i8;
            this.f6621c = bVar;
        }

        @Override // G6.b
        public void e() {
            g.this.f6591j.a(this.f6620b, this.f6621c);
            synchronized (g.this) {
                g.this.f6601t.remove(Integer.valueOf(this.f6620b));
            }
        }
    }

    /* renamed from: L6.g$g, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0138g {

        /* renamed from: a, reason: collision with root package name */
        Socket f6623a;

        /* renamed from: b, reason: collision with root package name */
        String f6624b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC1281g f6625c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC1280f f6626d;

        /* renamed from: e, reason: collision with root package name */
        h f6627e = h.f6631a;

        /* renamed from: f, reason: collision with root package name */
        l f6628f = l.f6691a;

        /* renamed from: g, reason: collision with root package name */
        boolean f6629g;

        /* renamed from: h, reason: collision with root package name */
        int f6630h;

        public C0138g(boolean z8) {
            this.f6629g = z8;
        }

        public g a() {
            return new g(this);
        }

        public C0138g b(h hVar) {
            this.f6627e = hVar;
            return this;
        }

        public C0138g c(int i8) {
            this.f6630h = i8;
            return this;
        }

        public C0138g d(Socket socket, String str, InterfaceC1281g interfaceC1281g, InterfaceC1280f interfaceC1280f) {
            this.f6623a = socket;
            this.f6624b = str;
            this.f6625c = interfaceC1281g;
            this.f6626d = interfaceC1280f;
            return this;
        }
    }

    /* loaded from: classes5.dex */
    final class i extends G6.b {

        /* renamed from: b, reason: collision with root package name */
        final boolean f6632b;

        /* renamed from: c, reason: collision with root package name */
        final int f6633c;

        /* renamed from: d, reason: collision with root package name */
        final int f6634d;

        i(boolean z8, int i8, int i9) {
            super("OkHttp %s ping %08x%08x", g.this.f6585d, Integer.valueOf(i8), Integer.valueOf(i9));
            this.f6632b = z8;
            this.f6633c = i8;
            this.f6634d = i9;
        }

        @Override // G6.b
        public void e() {
            g.this.L(this.f6632b, this.f6633c, this.f6634d);
        }
    }

    g(C0138g c0138g) {
        int i8;
        m mVar = new m();
        this.f6596o = mVar;
        this.f6597p = false;
        this.f6601t = new LinkedHashSet();
        this.f6591j = c0138g.f6628f;
        boolean z8 = c0138g.f6629g;
        this.f6582a = z8;
        this.f6583b = c0138g.f6627e;
        if (z8) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        this.f6587f = i8;
        if (z8) {
            this.f6587f = i8 + 2;
        }
        if (z8) {
            this.f6595n.i(7, 16777216);
        }
        String str = c0138g.f6624b;
        this.f6585d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, G6.c.B(G6.c.o("OkHttp %s Writer", str), false));
        this.f6589h = scheduledThreadPoolExecutor;
        if (c0138g.f6630h != 0) {
            i iVar = new i(false, 0, 0);
            int i9 = c0138g.f6630h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, i9, i9, TimeUnit.MILLISECONDS);
        }
        this.f6590i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), G6.c.B(G6.c.o("OkHttp %s Push Observer", str), true));
        mVar.i(7, 65535);
        mVar.i(5, 16384);
        this.f6594m = mVar.d();
        this.f6598q = c0138g.f6623a;
        this.f6599r = new L6.j(c0138g.f6626d, z8);
        this.f6600s = new j(new L6.h(c0138g.f6625c, z8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        try {
            L6.b bVar = L6.b.PROTOCOL_ERROR;
            h(bVar, bVar);
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:6:0x0006, B:8:0x000d, B:9:0x0016, B:11:0x001a, B:13:0x002d, B:15:0x0035, B:19:0x003f, B:21:0x0045, B:22:0x004e, B:36:0x0073, B:37:0x0078), top: B:5:0x0006, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private L6.i t(int r11, java.util.List r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            L6.j r7 = r10.f6599r
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L57
            int r0 = r10.f6587f     // Catch: java.lang.Throwable -> L13
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L16
            L6.b r0 = L6.b.REFUSED_STREAM     // Catch: java.lang.Throwable -> L13
            r10.H(r0)     // Catch: java.lang.Throwable -> L13
            goto L16
        L13:
            r11 = move-exception
            goto L79
        L16:
            boolean r0 = r10.f6588g     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L73
            int r8 = r10.f6587f     // Catch: java.lang.Throwable -> L13
            int r0 = r8 + 2
            r10.f6587f = r0     // Catch: java.lang.Throwable -> L13
            L6.i r9 = new L6.i     // Catch: java.lang.Throwable -> L13
            r4 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L13
            if (r13 == 0) goto L3e
            long r0 = r10.f6594m     // Catch: java.lang.Throwable -> L13
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L3e
            long r0 = r9.f6655b     // Catch: java.lang.Throwable -> L13
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L3c
            goto L3e
        L3c:
            r13 = 0
            goto L3f
        L3e:
            r13 = 1
        L3f:
            boolean r0 = r9.k()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L4e
            java.util.Map r0 = r10.f6584c     // Catch: java.lang.Throwable -> L13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L13
            r0.put(r1, r9)     // Catch: java.lang.Throwable -> L13
        L4e:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L13
            if (r11 != 0) goto L59
            L6.j r0 = r10.f6599r     // Catch: java.lang.Throwable -> L57
            r0.w(r6, r8, r11, r12)     // Catch: java.lang.Throwable -> L57
            goto L62
        L57:
            r11 = move-exception
            goto L7b
        L59:
            boolean r0 = r10.f6582a     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L6b
            L6.j r0 = r10.f6599r     // Catch: java.lang.Throwable -> L57
            r0.r(r11, r8, r12)     // Catch: java.lang.Throwable -> L57
        L62:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L57
            if (r13 == 0) goto L6a
            L6.j r11 = r10.f6599r
            r11.flush()
        L6a:
            return r9
        L6b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L57
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L57
            throw r11     // Catch: java.lang.Throwable -> L57
        L73:
            L6.a r11 = new L6.a     // Catch: java.lang.Throwable -> L13
            r11.<init>()     // Catch: java.lang.Throwable -> L13
            throw r11     // Catch: java.lang.Throwable -> L13
        L79:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L13
            throw r11     // Catch: java.lang.Throwable -> L57
        L7b:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L57
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: L6.g.t(int, java.util.List, boolean):L6.i");
    }

    void A(int i8, List list) {
        synchronized (this) {
            try {
                if (this.f6601t.contains(Integer.valueOf(i8))) {
                    N(i8, L6.b.PROTOCOL_ERROR);
                    return;
                }
                this.f6601t.add(Integer.valueOf(i8));
                try {
                    this.f6590i.execute(new c("OkHttp %s Push Request[%s]", new Object[]{this.f6585d, Integer.valueOf(i8)}, i8, list));
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void E(int i8, L6.b bVar) {
        this.f6590i.execute(new f("OkHttp %s Push Reset[%s]", new Object[]{this.f6585d, Integer.valueOf(i8)}, i8, bVar));
    }

    boolean F(int i8) {
        if (i8 != 0 && (i8 & 1) == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized L6.i G(int i8) {
        L6.i iVar;
        iVar = (L6.i) this.f6584c.remove(Integer.valueOf(i8));
        notifyAll();
        return iVar;
    }

    public void H(L6.b bVar) {
        synchronized (this.f6599r) {
            synchronized (this) {
                if (this.f6588g) {
                    return;
                }
                this.f6588g = true;
                this.f6599r.h(this.f6586e, bVar, G6.c.f3207a);
            }
        }
    }

    public void I() {
        J(true);
    }

    void J(boolean z8) {
        if (z8) {
            this.f6599r.b();
            this.f6599r.u(this.f6595n);
            if (this.f6595n.d() != 65535) {
                this.f6599r.x(0, r5 - 65535);
            }
        }
        new Thread(this.f6600s).start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.f6599r.m());
        r6 = r3;
        r8.f6594m -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void K(int r9, boolean r10, P6.C1279e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            L6.j r12 = r8.f6599r
            r12.e(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L60
            monitor-enter(r8)
        L12:
            long r3 = r8.f6594m     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L32
            java.util.Map r3 = r8.f6584c     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            if (r3 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            goto L12
        L28:
            r9 = move-exception
            goto L5e
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            throw r9     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
        L32:
            long r3 = java.lang.Math.min(r12, r3)     // Catch: java.lang.Throwable -> L28
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L28
            L6.j r3 = r8.f6599r     // Catch: java.lang.Throwable -> L28
            int r3 = r3.m()     // Catch: java.lang.Throwable -> L28
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L28
            long r4 = r8.f6594m     // Catch: java.lang.Throwable -> L28
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L28
            long r4 = r4 - r6
            r8.f6594m = r4     // Catch: java.lang.Throwable -> L28
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            long r12 = r12 - r6
            L6.j r4 = r8.f6599r
            if (r10 == 0) goto L53
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L53
            r5 = 1
            goto L54
        L53:
            r5 = 0
        L54:
            r4.e(r5, r9, r11, r3)
            goto Ld
        L58:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L28
            r9.<init>()     // Catch: java.lang.Throwable -> L28
            throw r9     // Catch: java.lang.Throwable -> L28
        L5e:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            throw r9
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: L6.g.K(int, boolean, P6.e, long):void");
    }

    void L(boolean z8, int i8, int i9) {
        boolean z9;
        if (!z8) {
            synchronized (this) {
                z9 = this.f6592k;
                this.f6592k = true;
            }
            if (z9) {
                l();
                return;
            }
        }
        try {
            this.f6599r.o(z8, i8, i9);
        } catch (IOException unused) {
            l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M(int i8, L6.b bVar) {
        this.f6599r.t(i8, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N(int i8, L6.b bVar) {
        try {
            this.f6589h.execute(new a("OkHttp %s stream %d", new Object[]{this.f6585d, Integer.valueOf(i8)}, i8, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(int i8, long j8) {
        try {
            this.f6589h.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f6585d, Integer.valueOf(i8)}, i8, j8));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        h(L6.b.NO_ERROR, L6.b.CANCEL);
    }

    public void flush() {
        this.f6599r.flush();
    }

    void g(long j8) {
        this.f6594m += j8;
        if (j8 > 0) {
            notifyAll();
        }
    }

    void h(L6.b bVar, L6.b bVar2) {
        L6.i[] iVarArr = null;
        try {
            H(bVar);
            e = null;
        } catch (IOException e8) {
            e = e8;
        }
        synchronized (this) {
            try {
                if (!this.f6584c.isEmpty()) {
                    iVarArr = (L6.i[]) this.f6584c.values().toArray(new L6.i[this.f6584c.size()]);
                    this.f6584c.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iVarArr != null) {
            for (L6.i iVar : iVarArr) {
                try {
                    iVar.d(bVar2);
                } catch (IOException e9) {
                    if (e != null) {
                        e = e9;
                    }
                }
            }
        }
        try {
            this.f6599r.close();
        } catch (IOException e10) {
            if (e == null) {
                e = e10;
            }
        }
        try {
            this.f6598q.close();
        } catch (IOException e11) {
            e = e11;
        }
        this.f6589h.shutdown();
        this.f6590i.shutdown();
        if (e != null) {
            throw e;
        }
    }

    synchronized L6.i m(int i8) {
        return (L6.i) this.f6584c.get(Integer.valueOf(i8));
    }

    public synchronized boolean o() {
        return this.f6588g;
    }

    public synchronized int r() {
        return this.f6596o.e(Integer.MAX_VALUE);
    }

    public L6.i u(List list, boolean z8) {
        return t(0, list, z8);
    }

    void w(int i8, InterfaceC1281g interfaceC1281g, int i9, boolean z8) {
        C1279e c1279e = new C1279e();
        long j8 = i9;
        interfaceC1281g.require(j8);
        interfaceC1281g.y(c1279e, j8);
        if (c1279e.x() == j8) {
            this.f6590i.execute(new e("OkHttp %s Push Data[%s]", new Object[]{this.f6585d, Integer.valueOf(i8)}, i8, c1279e, i9, z8));
            return;
        }
        throw new IOException(c1279e.x() + " != " + i9);
    }

    void x(int i8, List list, boolean z8) {
        try {
            this.f6590i.execute(new d("OkHttp %s Push Headers[%s]", new Object[]{this.f6585d, Integer.valueOf(i8)}, i8, list, z8));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class j extends G6.b implements h.b {

        /* renamed from: b, reason: collision with root package name */
        final L6.h f6636b;

        /* loaded from: classes5.dex */
        class a extends G6.b {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L6.i f6638b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Object[] objArr, L6.i iVar) {
                super(str, objArr);
                this.f6638b = iVar;
            }

            @Override // G6.b
            public void e() {
                try {
                    g.this.f6583b.b(this.f6638b);
                } catch (IOException e8) {
                    N6.f.i().p(4, "Http2Connection.Listener failure for " + g.this.f6585d, e8);
                    try {
                        this.f6638b.d(L6.b.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* loaded from: classes5.dex */
        class b extends G6.b {
            b(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // G6.b
            public void e() {
                g gVar = g.this;
                gVar.f6583b.a(gVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public class c extends G6.b {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f6641b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str, Object[] objArr, m mVar) {
                super(str, objArr);
                this.f6641b = mVar;
            }

            @Override // G6.b
            public void e() {
                try {
                    g.this.f6599r.a(this.f6641b);
                } catch (IOException unused) {
                    g.this.l();
                }
            }
        }

        j(L6.h hVar) {
            super("OkHttp %s", g.this.f6585d);
            this.f6636b = hVar;
        }

        private void f(m mVar) {
            try {
                g.this.f6589h.execute(new c("OkHttp %s ACK Settings", new Object[]{g.this.f6585d}, mVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // L6.h.b
        public void a(boolean z8, int i8, InterfaceC1281g interfaceC1281g, int i9) {
            if (g.this.F(i8)) {
                g.this.w(i8, interfaceC1281g, i9, z8);
                return;
            }
            L6.i m8 = g.this.m(i8);
            if (m8 == null) {
                g.this.N(i8, L6.b.PROTOCOL_ERROR);
                interfaceC1281g.skip(i9);
            } else {
                m8.m(interfaceC1281g, i9);
                if (z8) {
                    m8.n();
                }
            }
        }

        @Override // L6.h.b
        public void b(int i8, L6.b bVar, C1282h c1282h) {
            L6.i[] iVarArr;
            c1282h.F();
            synchronized (g.this) {
                iVarArr = (L6.i[]) g.this.f6584c.values().toArray(new L6.i[g.this.f6584c.size()]);
                g.this.f6588g = true;
            }
            for (L6.i iVar : iVarArr) {
                if (iVar.g() > i8 && iVar.j()) {
                    iVar.p(L6.b.REFUSED_STREAM);
                    g.this.G(iVar.g());
                }
            }
        }

        @Override // L6.h.b
        public void c(int i8, L6.b bVar) {
            if (g.this.F(i8)) {
                g.this.E(i8, bVar);
                return;
            }
            L6.i G8 = g.this.G(i8);
            if (G8 != null) {
                G8.p(bVar);
            }
        }

        @Override // L6.h.b
        public void d(boolean z8, m mVar) {
            L6.i[] iVarArr;
            long j8;
            synchronized (g.this) {
                try {
                    int d8 = g.this.f6596o.d();
                    if (z8) {
                        g.this.f6596o.a();
                    }
                    g.this.f6596o.h(mVar);
                    f(mVar);
                    int d9 = g.this.f6596o.d();
                    iVarArr = null;
                    if (d9 != -1 && d9 != d8) {
                        j8 = d9 - d8;
                        g gVar = g.this;
                        if (!gVar.f6597p) {
                            gVar.g(j8);
                            g.this.f6597p = true;
                        }
                        if (!g.this.f6584c.isEmpty()) {
                            iVarArr = (L6.i[]) g.this.f6584c.values().toArray(new L6.i[g.this.f6584c.size()]);
                        }
                    } else {
                        j8 = 0;
                    }
                    g.f6581u.execute(new b("OkHttp %s settings", g.this.f6585d));
                } finally {
                }
            }
            if (iVarArr != null && j8 != 0) {
                for (L6.i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(j8);
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // G6.b
        protected void e() {
            L6.b bVar;
            L6.b bVar2;
            L6.b bVar3 = L6.b.INTERNAL_ERROR;
            try {
                try {
                    this.f6636b.e(this);
                    do {
                    } while (this.f6636b.b(false, this));
                    bVar2 = L6.b.NO_ERROR;
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar3;
                    try {
                        g.this.h(bVar, bVar3);
                    } catch (IOException unused2) {
                    }
                    G6.c.d(this.f6636b);
                    throw th;
                }
                try {
                    bVar3 = L6.b.CANCEL;
                    g.this.h(bVar2, bVar3);
                    bVar = bVar2;
                } catch (IOException unused3) {
                    bVar3 = L6.b.PROTOCOL_ERROR;
                    g gVar = g.this;
                    gVar.h(bVar3, bVar3);
                    bVar = gVar;
                    G6.c.d(this.f6636b);
                }
                G6.c.d(this.f6636b);
            } catch (Throwable th2) {
                th = th2;
                g.this.h(bVar, bVar3);
                G6.c.d(this.f6636b);
                throw th;
            }
        }

        @Override // L6.h.b
        public void headers(boolean z8, int i8, int i9, List list) {
            if (g.this.F(i8)) {
                g.this.x(i8, list, z8);
                return;
            }
            synchronized (g.this) {
                try {
                    L6.i m8 = g.this.m(i8);
                    if (m8 == null) {
                        g gVar = g.this;
                        if (gVar.f6588g) {
                            return;
                        }
                        if (i8 <= gVar.f6586e) {
                            return;
                        }
                        if (i8 % 2 == gVar.f6587f % 2) {
                            return;
                        }
                        L6.i iVar = new L6.i(i8, g.this, false, z8, list);
                        g gVar2 = g.this;
                        gVar2.f6586e = i8;
                        gVar2.f6584c.put(Integer.valueOf(i8), iVar);
                        g.f6581u.execute(new a("OkHttp %s stream %d", new Object[]{g.this.f6585d, Integer.valueOf(i8)}, iVar));
                        return;
                    }
                    m8.o(list);
                    if (z8) {
                        m8.n();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // L6.h.b
        public void ping(boolean z8, int i8, int i9) {
            if (z8) {
                synchronized (g.this) {
                    g.this.f6592k = false;
                    g.this.notifyAll();
                }
                return;
            }
            try {
                g.this.f6589h.execute(new i(true, i8, i9));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // L6.h.b
        public void pushPromise(int i8, int i9, List list) {
            g.this.A(i9, list);
        }

        @Override // L6.h.b
        public void windowUpdate(int i8, long j8) {
            if (i8 == 0) {
                synchronized (g.this) {
                    g gVar = g.this;
                    gVar.f6594m += j8;
                    gVar.notifyAll();
                }
                return;
            }
            L6.i m8 = g.this.m(i8);
            if (m8 != null) {
                synchronized (m8) {
                    m8.a(j8);
                }
            }
        }

        @Override // L6.h.b
        public void ackSettings() {
        }

        @Override // L6.h.b
        public void priority(int i8, int i9, int i10, boolean z8) {
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class h {

        /* renamed from: a, reason: collision with root package name */
        public static final h f6631a = new a();

        /* loaded from: classes5.dex */
        final class a extends h {
            a() {
            }

            @Override // L6.g.h
            public void b(L6.i iVar) {
                iVar.d(L6.b.REFUSED_STREAM);
            }
        }

        public abstract void b(L6.i iVar);

        public void a(g gVar) {
        }
    }
}
