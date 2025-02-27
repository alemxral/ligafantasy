package p6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.T;

/* renamed from: p6.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3625n {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f37112b = AtomicReferenceFieldUpdater.newUpdater(C3625n.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f37113c = AtomicIntegerFieldUpdater.newUpdater(C3625n.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f37114d = AtomicIntegerFieldUpdater.newUpdater(C3625n.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f37115e = AtomicIntegerFieldUpdater.newUpdater(C3625n.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray f37116a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    private final AbstractRunnableC3619h b(AbstractRunnableC3619h abstractRunnableC3619h) {
        if (d() == 127) {
            return abstractRunnableC3619h;
        }
        if (abstractRunnableC3619h.f37100b.b() == 1) {
            f37115e.incrementAndGet(this);
        }
        int i8 = f37113c.get(this) & 127;
        while (this.f37116a.get(i8) != null) {
            Thread.yield();
        }
        this.f37116a.lazySet(i8, abstractRunnableC3619h);
        f37113c.incrementAndGet(this);
        return null;
    }

    private final void c(AbstractRunnableC3619h abstractRunnableC3619h) {
        if (abstractRunnableC3619h != null && abstractRunnableC3619h.f37100b.b() == 1) {
            f37115e.decrementAndGet(this);
        }
    }

    private final int d() {
        return f37113c.get(this) - f37114d.get(this);
    }

    private final AbstractRunnableC3619h i() {
        AbstractRunnableC3619h abstractRunnableC3619h;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f37114d;
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 - f37113c.get(this) == 0) {
                return null;
            }
            int i9 = i8 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 + 1) && (abstractRunnableC3619h = (AbstractRunnableC3619h) this.f37116a.getAndSet(i9, null)) != null) {
                c(abstractRunnableC3619h);
                return abstractRunnableC3619h;
            }
        }
    }

    private final boolean j(C3615d c3615d) {
        AbstractRunnableC3619h i8 = i();
        if (i8 == null) {
            return false;
        }
        c3615d.a(i8);
        return true;
    }

    private final AbstractRunnableC3619h k(boolean z8) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AbstractRunnableC3619h abstractRunnableC3619h;
        do {
            atomicReferenceFieldUpdater = f37112b;
            abstractRunnableC3619h = (AbstractRunnableC3619h) atomicReferenceFieldUpdater.get(this);
            if (abstractRunnableC3619h != null) {
                boolean z9 = true;
                if (abstractRunnableC3619h.f37100b.b() != 1) {
                    z9 = false;
                }
                if (z9 == z8) {
                }
            }
            int i8 = f37114d.get(this);
            int i9 = f37113c.get(this);
            while (i8 != i9) {
                if (z8 && f37115e.get(this) == 0) {
                    return null;
                }
                i9--;
                AbstractRunnableC3619h m8 = m(i9, z8);
                if (m8 != null) {
                    return m8;
                }
            }
            return null;
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, abstractRunnableC3619h, null));
        return abstractRunnableC3619h;
    }

    private final AbstractRunnableC3619h l(int i8) {
        int i9 = f37114d.get(this);
        int i10 = f37113c.get(this);
        boolean z8 = true;
        if (i8 != 1) {
            z8 = false;
        }
        while (i9 != i10) {
            if (z8 && f37115e.get(this) == 0) {
                return null;
            }
            int i11 = i9 + 1;
            AbstractRunnableC3619h m8 = m(i9, z8);
            if (m8 == null) {
                i9 = i11;
            } else {
                return m8;
            }
        }
        return null;
    }

    private final AbstractRunnableC3619h m(int i8, boolean z8) {
        int i9 = i8 & 127;
        AbstractRunnableC3619h abstractRunnableC3619h = (AbstractRunnableC3619h) this.f37116a.get(i9);
        if (abstractRunnableC3619h != null) {
            boolean z9 = true;
            if (abstractRunnableC3619h.f37100b.b() != 1) {
                z9 = false;
            }
            if (z9 == z8 && k6.i.a(this.f37116a, i9, abstractRunnableC3619h, null)) {
                if (z8) {
                    f37115e.decrementAndGet(this);
                }
                return abstractRunnableC3619h;
            }
        }
        return null;
    }

    private final long o(int i8, T t8) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AbstractRunnableC3619h abstractRunnableC3619h;
        do {
            atomicReferenceFieldUpdater = f37112b;
            abstractRunnableC3619h = (AbstractRunnableC3619h) atomicReferenceFieldUpdater.get(this);
            if (abstractRunnableC3619h == null) {
                return -2L;
            }
            int i9 = 1;
            if (abstractRunnableC3619h.f37100b.b() != 1) {
                i9 = 2;
            }
            if ((i9 & i8) == 0) {
                return -2L;
            }
            long a8 = AbstractC3623l.f37108f.a() - abstractRunnableC3619h.f37099a;
            long j8 = AbstractC3623l.f37104b;
            if (a8 < j8) {
                return j8 - a8;
            }
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, abstractRunnableC3619h, null));
        t8.f33747a = abstractRunnableC3619h;
        return -1L;
    }

    public final AbstractRunnableC3619h a(AbstractRunnableC3619h abstractRunnableC3619h, boolean z8) {
        if (z8) {
            return b(abstractRunnableC3619h);
        }
        AbstractRunnableC3619h abstractRunnableC3619h2 = (AbstractRunnableC3619h) f37112b.getAndSet(this, abstractRunnableC3619h);
        if (abstractRunnableC3619h2 == null) {
            return null;
        }
        return b(abstractRunnableC3619h2);
    }

    public final int e() {
        if (f37112b.get(this) != null) {
            return d() + 1;
        }
        return d();
    }

    public final void f(C3615d c3615d) {
        AbstractRunnableC3619h abstractRunnableC3619h = (AbstractRunnableC3619h) f37112b.getAndSet(this, null);
        if (abstractRunnableC3619h != null) {
            c3615d.a(abstractRunnableC3619h);
        }
        do {
        } while (j(c3615d));
    }

    public final AbstractRunnableC3619h g() {
        AbstractRunnableC3619h abstractRunnableC3619h = (AbstractRunnableC3619h) f37112b.getAndSet(this, null);
        if (abstractRunnableC3619h == null) {
            return i();
        }
        return abstractRunnableC3619h;
    }

    public final AbstractRunnableC3619h h() {
        return k(true);
    }

    public final long n(int i8, T t8) {
        AbstractRunnableC3619h l8;
        if (i8 == 3) {
            l8 = i();
        } else {
            l8 = l(i8);
        }
        if (l8 != null) {
            t8.f33747a = l8;
            return -1L;
        }
        return o(i8, t8);
    }
}
