package n6;

import i6.InterfaceC2816d0;
import i6.InterfaceC2837o;
import i6.T;
import i6.W;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: n6.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3499m extends i6.I implements W {

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f36258f = AtomicIntegerFieldUpdater.newUpdater(C3499m.class, "runningWorkers");

    /* renamed from: a, reason: collision with root package name */
    private final i6.I f36259a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36260b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ W f36261c;

    /* renamed from: d, reason: collision with root package name */
    private final r f36262d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f36263e;
    private volatile int runningWorkers;

    /* renamed from: n6.m$a */
    /* loaded from: classes5.dex */
    private final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private Runnable f36264a;

        public a(Runnable runnable) {
            this.f36264a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i8 = 0;
            while (true) {
                try {
                    this.f36264a.run();
                } catch (Throwable th) {
                    i6.K.a(P5.h.f7981a, th);
                }
                Runnable G8 = C3499m.this.G();
                if (G8 == null) {
                    return;
                }
                this.f36264a = G8;
                i8++;
                if (i8 >= 16 && C3499m.this.f36259a.isDispatchNeeded(C3499m.this)) {
                    C3499m.this.f36259a.dispatch(C3499m.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3499m(i6.I i8, int i9) {
        W w8;
        this.f36259a = i8;
        this.f36260b = i9;
        if (i8 instanceof W) {
            w8 = (W) i8;
        } else {
            w8 = null;
        }
        this.f36261c = w8 == null ? T.a() : w8;
        this.f36262d = new r(false);
        this.f36263e = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable G() {
        while (true) {
            Runnable runnable = (Runnable) this.f36262d.d();
            if (runnable == null) {
                synchronized (this.f36263e) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f36258f;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f36262d.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }

    private final boolean H() {
        synchronized (this.f36263e) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f36258f;
            if (atomicIntegerFieldUpdater.get(this) >= this.f36260b) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // i6.I
    public void dispatch(P5.g gVar, Runnable runnable) {
        Runnable G8;
        this.f36262d.a(runnable);
        if (f36258f.get(this) < this.f36260b && H() && (G8 = G()) != null) {
            this.f36259a.dispatch(this, new a(G8));
        }
    }

    @Override // i6.I
    public void dispatchYield(P5.g gVar, Runnable runnable) {
        Runnable G8;
        this.f36262d.a(runnable);
        if (f36258f.get(this) < this.f36260b && H() && (G8 = G()) != null) {
            this.f36259a.dispatchYield(this, new a(G8));
        }
    }

    @Override // i6.I
    public i6.I limitedParallelism(int i8) {
        AbstractC3500n.a(i8);
        if (i8 >= this.f36260b) {
            return this;
        }
        return super.limitedParallelism(i8);
    }

    @Override // i6.W
    public void o(long j8, InterfaceC2837o interfaceC2837o) {
        this.f36261c.o(j8, interfaceC2837o);
    }

    @Override // i6.W
    public InterfaceC2816d0 w(long j8, Runnable runnable, P5.g gVar) {
        return this.f36261c.w(j8, runnable, gVar);
    }
}
