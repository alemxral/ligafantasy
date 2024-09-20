package n6;

import androidx.core.internal.view.SupportMenu;
import i6.N0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: n6.C, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3483C extends AbstractC3491e implements N0 {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f36218d = AtomicIntegerFieldUpdater.newUpdater(AbstractC3483C.class, "cleanedAndPointers");

    /* renamed from: c, reason: collision with root package name */
    public final long f36219c;
    private volatile int cleanedAndPointers;

    public AbstractC3483C(long j8, AbstractC3483C abstractC3483C, int i8) {
        super(abstractC3483C);
        this.f36219c = j8;
        this.cleanedAndPointers = i8 << 16;
    }

    @Override // n6.AbstractC3491e
    public boolean h() {
        if (f36218d.get(this) == n() && !i()) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (f36218d.addAndGet(this, SupportMenu.CATEGORY_MASK) == n() && !i()) {
            return true;
        }
        return false;
    }

    public abstract int n();

    public abstract void o(int i8, Throwable th, P5.g gVar);

    public final void p() {
        if (f36218d.incrementAndGet(this) == n()) {
            k();
        }
    }

    public final boolean q() {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f36218d;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 == n() && !i()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, 65536 + i8));
        return true;
    }
}
