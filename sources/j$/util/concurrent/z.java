package j$.util.concurrent;

import j$.util.AbstractC2877d;
import j$.util.Z;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class z implements Z {

    /* renamed from: a, reason: collision with root package name */
    long f32180a;

    /* renamed from: b, reason: collision with root package name */
    final long f32181b;

    /* renamed from: c, reason: collision with root package name */
    final int f32182c;

    /* renamed from: d, reason: collision with root package name */
    final int f32183d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(long j8, long j9, int i8, int i9) {
        this.f32180a = j8;
        this.f32181b = j9;
        this.f32182c = i8;
        this.f32183d = i9;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final z trySplit() {
        long j8 = this.f32180a;
        long j9 = (this.f32181b + j8) >>> 1;
        if (j9 <= j8) {
            return null;
        }
        this.f32180a = j9;
        return new z(j8, j9, this.f32182c, this.f32183d);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f32181b - this.f32180a;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2877d.b(this, consumer);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j8 = this.f32180a;
        long j9 = this.f32181b;
        if (j8 < j9) {
            this.f32180a = j9;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                intConsumer.accept(current.d(this.f32182c, this.f32183d));
                j8++;
            } while (j8 < j9);
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC2877d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC2877d.e(this, i8);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2877d.g(this, consumer);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j8 = this.f32180a;
        if (j8 >= this.f32181b) {
            return false;
        }
        intConsumer.accept(ThreadLocalRandom.current().d(this.f32182c, this.f32183d));
        this.f32180a = j8 + 1;
        return true;
    }
}
