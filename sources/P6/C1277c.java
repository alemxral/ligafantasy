package P6;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: P6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1277c extends a0 {

    /* renamed from: i, reason: collision with root package name */
    public static final a f8030i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    private static final ReentrantLock f8031j;

    /* renamed from: k, reason: collision with root package name */
    private static final Condition f8032k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f8033l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f8034m;

    /* renamed from: n, reason: collision with root package name */
    private static C1277c f8035n;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8036f;

    /* renamed from: g, reason: collision with root package name */
    private C1277c f8037g;

    /* renamed from: h, reason: collision with root package name */
    private long f8038h;

    /* renamed from: P6.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(C1277c c1277c) {
            ReentrantLock f8 = C1277c.f8030i.f();
            f8.lock();
            try {
                if (c1277c.f8036f) {
                    c1277c.f8036f = false;
                    for (C1277c c1277c2 = C1277c.f8035n; c1277c2 != null; c1277c2 = c1277c2.f8037g) {
                        if (c1277c2.f8037g == c1277c) {
                            c1277c2.f8037g = c1277c.f8037g;
                            c1277c.f8037g = null;
                            return false;
                        }
                    }
                    f8.unlock();
                    return true;
                }
                return false;
            } finally {
                f8.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(C1277c c1277c, long j8, boolean z8) {
            ReentrantLock f8 = C1277c.f8030i.f();
            f8.lock();
            try {
                if (!c1277c.f8036f) {
                    c1277c.f8036f = true;
                    if (C1277c.f8035n == null) {
                        C1277c.f8035n = new C1277c();
                        new b().start();
                    }
                    long nanoTime = System.nanoTime();
                    if (j8 != 0 && z8) {
                        c1277c.f8038h = Math.min(j8, c1277c.c() - nanoTime) + nanoTime;
                    } else if (j8 != 0) {
                        c1277c.f8038h = j8 + nanoTime;
                    } else if (z8) {
                        c1277c.f8038h = c1277c.c();
                    } else {
                        throw new AssertionError();
                    }
                    long y8 = c1277c.y(nanoTime);
                    C1277c c1277c2 = C1277c.f8035n;
                    AbstractC3159y.f(c1277c2);
                    while (c1277c2.f8037g != null) {
                        C1277c c1277c3 = c1277c2.f8037g;
                        AbstractC3159y.f(c1277c3);
                        if (y8 < c1277c3.y(nanoTime)) {
                            break;
                        }
                        c1277c2 = c1277c2.f8037g;
                        AbstractC3159y.f(c1277c2);
                    }
                    c1277c.f8037g = c1277c2.f8037g;
                    c1277c2.f8037g = c1277c;
                    if (c1277c2 == C1277c.f8035n) {
                        C1277c.f8030i.e().signal();
                    }
                    L5.I i8 = L5.I.f6474a;
                    f8.unlock();
                    return;
                }
                throw new IllegalStateException("Unbalanced enter/exit".toString());
            } catch (Throwable th) {
                f8.unlock();
                throw th;
            }
        }

        public final C1277c c() {
            C1277c c1277c = C1277c.f8035n;
            AbstractC3159y.f(c1277c);
            C1277c c1277c2 = c1277c.f8037g;
            if (c1277c2 != null) {
                long y8 = c1277c2.y(System.nanoTime());
                if (y8 <= 0) {
                    C1277c c1277c3 = C1277c.f8035n;
                    AbstractC3159y.f(c1277c3);
                    c1277c3.f8037g = c1277c2.f8037g;
                    c1277c2.f8037g = null;
                    return c1277c2;
                }
                e().await(y8, TimeUnit.NANOSECONDS);
                return null;
            }
            long nanoTime = System.nanoTime();
            e().await(C1277c.f8033l, TimeUnit.MILLISECONDS);
            C1277c c1277c4 = C1277c.f8035n;
            AbstractC3159y.f(c1277c4);
            if (c1277c4.f8037g == null && System.nanoTime() - nanoTime >= C1277c.f8034m) {
                return C1277c.f8035n;
            }
            return null;
        }

        public final Condition e() {
            return C1277c.f8032k;
        }

        public final ReentrantLock f() {
            return C1277c.f8031j;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P6.c$b */
    /* loaded from: classes5.dex */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock f8;
            C1277c c8;
            while (true) {
                try {
                    a aVar = C1277c.f8030i;
                    f8 = aVar.f();
                    f8.lock();
                    try {
                        c8 = aVar.c();
                    } finally {
                        f8.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (c8 == C1277c.f8035n) {
                    C1277c.f8035n = null;
                    return;
                }
                L5.I i8 = L5.I.f6474a;
                f8.unlock();
                if (c8 != null) {
                    c8.B();
                }
            }
        }
    }

    /* renamed from: P6.c$c, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0171c implements X {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X f8040b;

        C0171c(X x8) {
            this.f8040b = x8;
        }

        @Override // P6.X
        public void C(C1279e source, long j8) {
            AbstractC3159y.i(source, "source");
            AbstractC1276b.b(source.x(), 0L, j8);
            while (true) {
                long j9 = 0;
                if (j8 > 0) {
                    U u8 = source.f8043a;
                    AbstractC3159y.f(u8);
                    while (true) {
                        if (j9 >= 65536) {
                            break;
                        }
                        j9 += u8.f8002c - u8.f8001b;
                        if (j9 >= j8) {
                            j9 = j8;
                            break;
                        } else {
                            u8 = u8.f8005f;
                            AbstractC3159y.f(u8);
                        }
                    }
                    C1277c c1277c = C1277c.this;
                    X x8 = this.f8040b;
                    c1277c.v();
                    try {
                        x8.C(source, j9);
                        L5.I i8 = L5.I.f6474a;
                        if (!c1277c.w()) {
                            j8 -= j9;
                        } else {
                            throw c1277c.p(null);
                        }
                    } catch (IOException e8) {
                        if (!c1277c.w()) {
                            throw e8;
                        }
                        throw c1277c.p(e8);
                    } finally {
                        c1277c.w();
                    }
                } else {
                    return;
                }
            }
        }

        @Override // P6.X
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1277c timeout() {
            return C1277c.this;
        }

        @Override // P6.X, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C1277c c1277c = C1277c.this;
            X x8 = this.f8040b;
            c1277c.v();
            try {
                x8.close();
                L5.I i8 = L5.I.f6474a;
                if (!c1277c.w()) {
                } else {
                    throw c1277c.p(null);
                }
            } catch (IOException e8) {
                if (!c1277c.w()) {
                    throw e8;
                }
                throw c1277c.p(e8);
            } finally {
                c1277c.w();
            }
        }

        @Override // P6.X, java.io.Flushable
        public void flush() {
            C1277c c1277c = C1277c.this;
            X x8 = this.f8040b;
            c1277c.v();
            try {
                x8.flush();
                L5.I i8 = L5.I.f6474a;
                if (!c1277c.w()) {
                } else {
                    throw c1277c.p(null);
                }
            } catch (IOException e8) {
                if (!c1277c.w()) {
                    throw e8;
                }
                throw c1277c.p(e8);
            } finally {
                c1277c.w();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f8040b + ')';
        }
    }

    /* renamed from: P6.c$d */
    /* loaded from: classes5.dex */
    public static final class d implements Z {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Z f8042b;

        d(Z z8) {
            this.f8042b = z8;
        }

        @Override // P6.Z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1277c timeout() {
            return C1277c.this;
        }

        @Override // P6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C1277c c1277c = C1277c.this;
            Z z8 = this.f8042b;
            c1277c.v();
            try {
                z8.close();
                L5.I i8 = L5.I.f6474a;
                if (!c1277c.w()) {
                } else {
                    throw c1277c.p(null);
                }
            } catch (IOException e8) {
                if (!c1277c.w()) {
                    throw e8;
                }
                throw c1277c.p(e8);
            } finally {
                c1277c.w();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f8042b + ')';
        }

        @Override // P6.Z
        public long y(C1279e sink, long j8) {
            AbstractC3159y.i(sink, "sink");
            C1277c c1277c = C1277c.this;
            Z z8 = this.f8042b;
            c1277c.v();
            try {
                long y8 = z8.y(sink, j8);
                if (!c1277c.w()) {
                    return y8;
                }
                throw c1277c.p(null);
            } catch (IOException e8) {
                if (!c1277c.w()) {
                    throw e8;
                }
                throw c1277c.p(e8);
            } finally {
                c1277c.w();
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f8031j = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        AbstractC3159y.h(newCondition, "lock.newCondition()");
        f8032k = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f8033l = millis;
        f8034m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long y(long j8) {
        return this.f8038h - j8;
    }

    public final Z A(Z source) {
        AbstractC3159y.i(source, "source");
        return new d(source);
    }

    public final IOException p(IOException iOException) {
        return x(iOException);
    }

    public final void v() {
        long h8 = h();
        boolean e8 = e();
        if (h8 != 0 || e8) {
            f8030i.g(this, h8, e8);
        }
    }

    public final boolean w() {
        return f8030i.d(this);
    }

    protected IOException x(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final X z(X sink) {
        AbstractC3159y.i(sink, "sink");
        return new C0171c(sink);
    }

    protected void B() {
    }
}
