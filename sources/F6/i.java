package F6;

import I6.g;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: g, reason: collision with root package name */
    private static final Executor f2872g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), G6.c.B("OkHttp ConnectionPool", true));

    /* renamed from: a, reason: collision with root package name */
    private final int f2873a;

    /* renamed from: b, reason: collision with root package name */
    private final long f2874b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f2875c;

    /* renamed from: d, reason: collision with root package name */
    private final Deque f2876d;

    /* renamed from: e, reason: collision with root package name */
    final I6.d f2877e;

    /* renamed from: f, reason: collision with root package name */
    boolean f2878f;

    /* loaded from: classes5.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long a8 = i.this.a(System.nanoTime());
                if (a8 == -1) {
                    return;
                }
                if (a8 > 0) {
                    long j8 = a8 / 1000000;
                    long j9 = a8 - (1000000 * j8);
                    synchronized (i.this) {
                        try {
                            i.this.wait(j8, (int) j9);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public i() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    private int e(I6.c cVar, long j8) {
        List list = cVar.f4287n;
        int i8 = 0;
        while (i8 < list.size()) {
            Reference reference = (Reference) list.get(i8);
            if (reference.get() != null) {
                i8++;
            } else {
                N6.f.i().q("A connection to " + cVar.p().a().l() + " was leaked. Did you forget to close a response body?", ((g.a) reference).f4316a);
                list.remove(i8);
                cVar.f4284k = true;
                if (list.isEmpty()) {
                    cVar.f4288o = j8 - this.f2874b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    long a(long j8) {
        synchronized (this) {
            try {
                I6.c cVar = null;
                long j9 = Long.MIN_VALUE;
                int i8 = 0;
                int i9 = 0;
                for (I6.c cVar2 : this.f2876d) {
                    if (e(cVar2, j8) > 0) {
                        i9++;
                    } else {
                        i8++;
                        long j10 = j8 - cVar2.f4288o;
                        if (j10 > j9) {
                            cVar = cVar2;
                            j9 = j10;
                        }
                    }
                }
                long j11 = this.f2874b;
                if (j9 < j11 && i8 <= this.f2873a) {
                    if (i8 > 0) {
                        return j11 - j9;
                    }
                    if (i9 > 0) {
                        return j11;
                    }
                    this.f2878f = false;
                    return -1L;
                }
                this.f2876d.remove(cVar);
                G6.c.e(cVar.q());
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(I6.c cVar) {
        if (!cVar.f4284k && this.f2873a != 0) {
            notifyAll();
            return false;
        }
        this.f2876d.remove(cVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Socket c(C1164a c1164a, I6.g gVar) {
        for (I6.c cVar : this.f2876d) {
            if (cVar.k(c1164a, null) && cVar.m() && cVar != gVar.c()) {
                return gVar.l(cVar);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public I6.c d(C1164a c1164a, I6.g gVar, B b8) {
        for (I6.c cVar : this.f2876d) {
            if (cVar.k(c1164a, b8)) {
                gVar.a(cVar, true);
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(I6.c cVar) {
        if (!this.f2878f) {
            this.f2878f = true;
            f2872g.execute(this.f2875c);
        }
        this.f2876d.add(cVar);
    }

    public i(int i8, long j8, TimeUnit timeUnit) {
        this.f2875c = new a();
        this.f2876d = new ArrayDeque();
        this.f2877e = new I6.d();
        this.f2873a = i8;
        this.f2874b = timeUnit.toNanos(j8);
        if (j8 > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j8);
    }
}
