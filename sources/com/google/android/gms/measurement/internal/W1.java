package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class W1 extends AbstractC2258s2 {

    /* renamed from: l, reason: collision with root package name */
    private static final AtomicLong f16311l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    private V1 f16312c;

    /* renamed from: d, reason: collision with root package name */
    private V1 f16313d;

    /* renamed from: e, reason: collision with root package name */
    private final PriorityBlockingQueue f16314e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue f16315f;

    /* renamed from: g, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f16316g;

    /* renamed from: h, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f16317h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f16318i;

    /* renamed from: j, reason: collision with root package name */
    private final Semaphore f16319j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f16320k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public W1(Y1 y12) {
        super(y12);
        this.f16318i = new Object();
        this.f16319j = new Semaphore(2);
        this.f16314e = new PriorityBlockingQueue();
        this.f16315f = new LinkedBlockingQueue();
        this.f16316g = new T1(this, "Thread death: Uncaught exception on worker thread");
        this.f16317h = new T1(this, "Thread death: Uncaught exception on network thread");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean B(W1 w12) {
        boolean z8 = w12.f16320k;
        return false;
    }

    private final void D(U1 u12) {
        synchronized (this.f16318i) {
            try {
                this.f16314e.add(u12);
                V1 v12 = this.f16312c;
                if (v12 == null) {
                    V1 v13 = new V1(this, "Measurement Worker", this.f16314e);
                    this.f16312c = v13;
                    v13.setUncaughtExceptionHandler(this.f16316g);
                    this.f16312c.start();
                } else {
                    v12.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void A(Runnable runnable) {
        k();
        AbstractC1319p.l(runnable);
        D(new U1(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean C() {
        if (Thread.currentThread() == this.f16312c) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2253r2
    public final void g() {
        if (Thread.currentThread() == this.f16313d) {
        } else {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2253r2
    public final void h() {
        if (Thread.currentThread() == this.f16312c) {
        } else {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2258s2
    protected final boolean j() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object r(AtomicReference atomicReference, long j8, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f16764a.f().z(runnable);
            try {
                atomicReference.wait(j8);
            } catch (InterruptedException unused) {
                this.f16764a.d().w().a("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f16764a.d().w().a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final Future s(Callable callable) {
        k();
        AbstractC1319p.l(callable);
        U1 u12 = new U1(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f16312c) {
            if (!this.f16314e.isEmpty()) {
                this.f16764a.d().w().a("Callable skipped the worker queue.");
            }
            u12.run();
        } else {
            D(u12);
        }
        return u12;
    }

    public final Future t(Callable callable) {
        k();
        AbstractC1319p.l(callable);
        U1 u12 = new U1(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f16312c) {
            u12.run();
        } else {
            D(u12);
        }
        return u12;
    }

    public final void y(Runnable runnable) {
        k();
        AbstractC1319p.l(runnable);
        U1 u12 = new U1(this, runnable, false, "Task exception on network thread");
        synchronized (this.f16318i) {
            try {
                this.f16315f.add(u12);
                V1 v12 = this.f16313d;
                if (v12 == null) {
                    V1 v13 = new V1(this, "Measurement Network", this.f16315f);
                    this.f16313d = v13;
                    v13.setUncaughtExceptionHandler(this.f16317h);
                    this.f16313d.start();
                } else {
                    v12.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(Runnable runnable) {
        k();
        AbstractC1319p.l(runnable);
        D(new U1(this, runnable, false, "Task exception on worker thread"));
    }
}
