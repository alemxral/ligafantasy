package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class N extends AbstractC2902c {

    /* renamed from: j, reason: collision with root package name */
    private final H f32344j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f32345k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N(H h8, boolean z8, AbstractC2897b abstractC2897b, Spliterator spliterator) {
        super(abstractC2897b, spliterator);
        this.f32345k = z8;
        this.f32344j = h8;
    }

    N(N n8, Spliterator spliterator) {
        super(n8, spliterator);
        this.f32345k = n8.f32345k;
        this.f32344j = n8.f32344j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC2912e
    public final Object a() {
        AbstractC2897b abstractC2897b = this.f32494a;
        L3 l32 = (L3) this.f32344j.f32305d.get();
        abstractC2897b.R(this.f32495b, l32);
        Object obj = l32.get();
        if (!this.f32345k) {
            if (obj != null) {
                AtomicReference atomicReference = this.f32479h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
            }
            return null;
        }
        if (obj == null) {
            return null;
        }
        AbstractC2912e abstractC2912e = this;
        while (true) {
            if (abstractC2912e != null) {
                AbstractC2912e abstractC2912e2 = (AbstractC2912e) abstractC2912e.getCompleter();
                if (abstractC2912e2 != null && abstractC2912e2.f32497d != abstractC2912e) {
                    i();
                    break;
                }
                abstractC2912e = abstractC2912e2;
            } else {
                AtomicReference atomicReference2 = this.f32479h;
                while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
                }
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC2912e
    public final AbstractC2912e e(Spliterator spliterator) {
        return new N(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC2902c
    protected final Object j() {
        return this.f32344j.f32303b;
    }

    @Override // j$.util.stream.AbstractC2912e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.f32345k) {
            N n8 = (N) this.f32497d;
            N n9 = null;
            while (true) {
                if (n8 != n9) {
                    Object c8 = n8.c();
                    if (c8 != null && this.f32344j.f32304c.test(c8)) {
                        f(c8);
                        AbstractC2912e abstractC2912e = this;
                        while (true) {
                            if (abstractC2912e != null) {
                                AbstractC2912e abstractC2912e2 = (AbstractC2912e) abstractC2912e.getCompleter();
                                if (abstractC2912e2 != null && abstractC2912e2.f32497d != abstractC2912e) {
                                    i();
                                    break;
                                }
                                abstractC2912e = abstractC2912e2;
                            } else {
                                AtomicReference atomicReference = this.f32479h;
                                while (!atomicReference.compareAndSet(null, c8) && atomicReference.get() == null) {
                                }
                            }
                        }
                    } else {
                        n9 = n8;
                        n8 = (N) this.f32498e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
