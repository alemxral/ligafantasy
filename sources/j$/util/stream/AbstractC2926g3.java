package j$.util.stream;

import j$.util.AbstractC2877d;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.g3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2926g3 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    final boolean f32531a;

    /* renamed from: b, reason: collision with root package name */
    final AbstractC2897b f32532b;

    /* renamed from: c, reason: collision with root package name */
    private Supplier f32533c;

    /* renamed from: d, reason: collision with root package name */
    Spliterator f32534d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC2975q2 f32535e;

    /* renamed from: f, reason: collision with root package name */
    BooleanSupplier f32536f;

    /* renamed from: g, reason: collision with root package name */
    long f32537g;

    /* renamed from: h, reason: collision with root package name */
    AbstractC2907d f32538h;

    /* renamed from: i, reason: collision with root package name */
    boolean f32539i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2926g3(AbstractC2897b abstractC2897b, Spliterator spliterator, boolean z8) {
        this.f32532b = abstractC2897b;
        this.f32533c = null;
        this.f32534d = spliterator;
        this.f32531a = z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2926g3(AbstractC2897b abstractC2897b, Supplier supplier, boolean z8) {
        this.f32532b = abstractC2897b;
        this.f32533c = supplier;
        this.f32534d = null;
        this.f32531a = z8;
    }

    private boolean b() {
        while (this.f32538h.count() == 0) {
            if (this.f32535e.m() || !this.f32536f.getAsBoolean()) {
                if (this.f32539i) {
                    return false;
                }
                this.f32535e.j();
                this.f32539i = true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        AbstractC2907d abstractC2907d = this.f32538h;
        if (abstractC2907d == null) {
            if (this.f32539i) {
                return false;
            }
            c();
            d();
            this.f32537g = 0L;
            this.f32535e.k(this.f32534d.getExactSizeIfKnown());
            return b();
        }
        long j8 = this.f32537g + 1;
        this.f32537g = j8;
        boolean z8 = j8 < abstractC2907d.count();
        if (z8) {
            return z8;
        }
        this.f32537g = 0L;
        this.f32538h.clear();
        return b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (this.f32534d == null) {
            this.f32534d = (Spliterator) this.f32533c.get();
            this.f32533c = null;
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int z8 = EnumC2916e3.z(this.f32532b.G()) & EnumC2916e3.f32501f;
        return (z8 & 64) != 0 ? (z8 & (-16449)) | (this.f32534d.characteristics() & 16448) : z8;
    }

    abstract void d();

    abstract AbstractC2926g3 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.f32534d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC2877d.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (EnumC2916e3.SIZED.r(this.f32532b.G())) {
            return this.f32534d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC2877d.e(this, i8);
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f32534d);
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.f32531a || this.f32538h != null || this.f32539i) {
            return null;
        }
        c();
        Spliterator trySplit = this.f32534d.trySplit();
        if (trySplit == null) {
            return null;
        }
        return e(trySplit);
    }
}
