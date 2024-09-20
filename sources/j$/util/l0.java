package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class l0 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f32225a;

    /* renamed from: b, reason: collision with root package name */
    private int f32226b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32227c;

    /* renamed from: d, reason: collision with root package name */
    private final int f32228d;

    public l0(Object[] objArr, int i8, int i9, int i10) {
        this.f32225a = objArr;
        this.f32226b = i8;
        this.f32227c = i9;
        this.f32228d = i10 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f32228d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f32227c - this.f32226b;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i8;
        consumer.getClass();
        Object[] objArr = this.f32225a;
        int length = objArr.length;
        int i9 = this.f32227c;
        if (length < i9 || (i8 = this.f32226b) < 0) {
            return;
        }
        this.f32226b = i9;
        if (i8 >= i9) {
            return;
        }
        do {
            consumer.accept(objArr[i8]);
            i8++;
        } while (i8 < i9);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC2877d.e(this, 4)) {
            return null;
        }
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
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i8 = this.f32226b;
        if (i8 < 0 || i8 >= this.f32227c) {
            return false;
        }
        this.f32226b = i8 + 1;
        consumer.accept(this.f32225a[i8]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i8 = this.f32226b;
        int i9 = (this.f32227c + i8) >>> 1;
        if (i8 >= i9) {
            return null;
        }
        this.f32226b = i9;
        return new l0(this.f32225a, i8, i9, this.f32228d);
    }
}
