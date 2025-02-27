package j$.util;

import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2873a implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.List f32099a;

    /* renamed from: b, reason: collision with root package name */
    private int f32100b;

    /* renamed from: c, reason: collision with root package name */
    private int f32101c;

    private C2873a(C2873a c2873a, int i8, int i9) {
        this.f32099a = c2873a.f32099a;
        this.f32100b = i8;
        this.f32101c = i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2873a(java.util.List list) {
        this.f32099a = list;
        this.f32100b = 0;
        this.f32101c = -1;
    }

    private int a() {
        int i8 = this.f32101c;
        if (i8 >= 0) {
            return i8;
        }
        int size = this.f32099a.size();
        this.f32101c = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return a() - this.f32100b;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int a8 = a();
        this.f32100b = a8;
        for (int i8 = this.f32100b; i8 < a8; i8++) {
            try {
                consumer.accept(this.f32099a.get(i8));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
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
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int a8 = a();
        int i8 = this.f32100b;
        if (i8 >= a8) {
            return false;
        }
        this.f32100b = i8 + 1;
        try {
            consumer.accept(this.f32099a.get(i8));
            return true;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int a8 = a();
        int i8 = this.f32100b;
        int i9 = (a8 + i8) >>> 1;
        if (i8 >= i9) {
            return null;
        }
        this.f32100b = i9;
        return new C2873a(this, i8, i9);
    }
}
