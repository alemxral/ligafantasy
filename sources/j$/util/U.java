package j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class U implements W {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfDouble f32095a;

    private /* synthetic */ U(Spliterator.OfDouble ofDouble) {
        this.f32095a = ofDouble;
    }

    public static /* synthetic */ W a(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof V ? ((V) ofDouble).f32096a : new U(ofDouble);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f32095a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfDouble ofDouble = this.f32095a;
        if (obj instanceof U) {
            obj = ((U) obj).f32095a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f32095a.estimateSize();
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f32095a.forEachRemaining((Spliterator.OfDouble) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f32095a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.W
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f32095a.forEachRemaining(doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f32095a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f32095a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return this.f32095a.hasCharacteristics(i8);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32095a.hashCode();
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f32095a.tryAdvance((Spliterator.OfDouble) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f32095a.tryAdvance((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.W
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f32095a.tryAdvance(doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return g0.a(this.f32095a.trySplit());
    }

    @Override // j$.util.W, j$.util.f0, j$.util.Spliterator
    public final /* synthetic */ W trySplit() {
        return a(this.f32095a.trySplit());
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public final /* synthetic */ f0 trySplit() {
        return d0.a(this.f32095a.trySplit());
    }
}
