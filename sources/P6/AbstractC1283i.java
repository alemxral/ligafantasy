package P6;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: P6.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1283i implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f8058a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8059b;

    /* renamed from: c, reason: collision with root package name */
    private int f8060c;

    /* renamed from: d, reason: collision with root package name */
    private final ReentrantLock f8061d = c0.b();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P6.i$a */
    /* loaded from: classes5.dex */
    public static final class a implements X {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC1283i f8062a;

        /* renamed from: b, reason: collision with root package name */
        private long f8063b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f8064c;

        public a(AbstractC1283i fileHandle, long j8) {
            AbstractC3159y.i(fileHandle, "fileHandle");
            this.f8062a = fileHandle;
            this.f8063b = j8;
        }

        @Override // P6.X
        public void C(C1279e source, long j8) {
            AbstractC3159y.i(source, "source");
            if (!this.f8064c) {
                this.f8062a.F(this.f8063b, source, j8);
                this.f8063b += j8;
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // P6.X, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f8064c) {
                return;
            }
            this.f8064c = true;
            ReentrantLock h8 = this.f8062a.h();
            h8.lock();
            try {
                AbstractC1283i abstractC1283i = this.f8062a;
                abstractC1283i.f8060c--;
                if (this.f8062a.f8060c == 0 && this.f8062a.f8059b) {
                    L5.I i8 = L5.I.f6474a;
                    h8.unlock();
                    this.f8062a.l();
                }
            } finally {
                h8.unlock();
            }
        }

        @Override // P6.X, java.io.Flushable
        public void flush() {
            if (!this.f8064c) {
                this.f8062a.m();
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // P6.X
        public a0 timeout() {
            return a0.f8018e;
        }
    }

    /* renamed from: P6.i$b */
    /* loaded from: classes5.dex */
    private static final class b implements Z {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC1283i f8065a;

        /* renamed from: b, reason: collision with root package name */
        private long f8066b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f8067c;

        public b(AbstractC1283i fileHandle, long j8) {
            AbstractC3159y.i(fileHandle, "fileHandle");
            this.f8065a = fileHandle;
            this.f8066b = j8;
        }

        @Override // P6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f8067c) {
                return;
            }
            this.f8067c = true;
            ReentrantLock h8 = this.f8065a.h();
            h8.lock();
            try {
                AbstractC1283i abstractC1283i = this.f8065a;
                abstractC1283i.f8060c--;
                if (this.f8065a.f8060c == 0 && this.f8065a.f8059b) {
                    L5.I i8 = L5.I.f6474a;
                    h8.unlock();
                    this.f8065a.l();
                }
            } finally {
                h8.unlock();
            }
        }

        @Override // P6.Z
        public a0 timeout() {
            return a0.f8018e;
        }

        @Override // P6.Z
        public long y(C1279e sink, long j8) {
            AbstractC3159y.i(sink, "sink");
            if (!this.f8067c) {
                long u8 = this.f8065a.u(this.f8066b, sink, j8);
                if (u8 != -1) {
                    this.f8066b += u8;
                }
                return u8;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    public AbstractC1283i(boolean z8) {
        this.f8058a = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(long j8, C1279e c1279e, long j9) {
        AbstractC1276b.b(c1279e.x(), 0L, j9);
        long j10 = j9 + j8;
        while (j8 < j10) {
            U u8 = c1279e.f8043a;
            AbstractC3159y.f(u8);
            int min = (int) Math.min(j10 - j8, u8.f8002c - u8.f8001b);
            t(j8, u8.f8000a, u8.f8001b, min);
            u8.f8001b += min;
            long j11 = min;
            j8 += j11;
            c1279e.w(c1279e.x() - j11);
            if (u8.f8001b == u8.f8002c) {
                c1279e.f8043a = u8.b();
                V.b(u8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long u(long j8, C1279e c1279e, long j9) {
        if (j9 >= 0) {
            long j10 = j9 + j8;
            long j11 = j8;
            while (true) {
                if (j11 >= j10) {
                    break;
                }
                U F8 = c1279e.F(1);
                int o8 = o(j11, F8.f8000a, F8.f8002c, (int) Math.min(j10 - j11, 8192 - r7));
                if (o8 == -1) {
                    if (F8.f8001b == F8.f8002c) {
                        c1279e.f8043a = F8.b();
                        V.b(F8);
                    }
                    if (j8 == j11) {
                        return -1L;
                    }
                } else {
                    F8.f8002c += o8;
                    long j12 = o8;
                    j11 += j12;
                    c1279e.w(c1279e.x() + j12);
                }
            }
            return j11 - j8;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
    }

    public static /* synthetic */ X x(AbstractC1283i abstractC1283i, long j8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                j8 = 0;
            }
            return abstractC1283i.w(j8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
    }

    public final long A() {
        ReentrantLock reentrantLock = this.f8061d;
        reentrantLock.lock();
        try {
            if (!this.f8059b) {
                L5.I i8 = L5.I.f6474a;
                reentrantLock.unlock();
                return r();
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Z E(long j8) {
        ReentrantLock reentrantLock = this.f8061d;
        reentrantLock.lock();
        try {
            if (!this.f8059b) {
                this.f8060c++;
                reentrantLock.unlock();
                return new b(this, j8);
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f8061d;
        reentrantLock.lock();
        try {
            if (this.f8059b) {
                return;
            }
            this.f8059b = true;
            if (this.f8060c != 0) {
                return;
            }
            L5.I i8 = L5.I.f6474a;
            reentrantLock.unlock();
            l();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() {
        if (this.f8058a) {
            ReentrantLock reentrantLock = this.f8061d;
            reentrantLock.lock();
            try {
                if (!this.f8059b) {
                    L5.I i8 = L5.I.f6474a;
                    reentrantLock.unlock();
                    m();
                    return;
                }
                throw new IllegalStateException("closed".toString());
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        throw new IllegalStateException("file handle is read-only".toString());
    }

    public final ReentrantLock h() {
        return this.f8061d;
    }

    protected abstract void l();

    protected abstract void m();

    protected abstract int o(long j8, byte[] bArr, int i8, int i9);

    protected abstract long r();

    protected abstract void t(long j8, byte[] bArr, int i8, int i9);

    public final X w(long j8) {
        if (this.f8058a) {
            ReentrantLock reentrantLock = this.f8061d;
            reentrantLock.lock();
            try {
                if (!this.f8059b) {
                    this.f8060c++;
                    reentrantLock.unlock();
                    return new a(this, j8);
                }
                throw new IllegalStateException("closed".toString());
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        throw new IllegalStateException("file handle is read-only".toString());
    }
}
