package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class k0 implements I, DoubleConsumer, InterfaceC3022z {

    /* renamed from: a, reason: collision with root package name */
    boolean f32222a = false;

    /* renamed from: b, reason: collision with root package name */
    double f32223b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ W f32224c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(W w8) {
        this.f32224c = w8;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d8) {
        this.f32222a = true;
        this.f32223b = d8;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.I, java.util.Iterator, j$.util.InterfaceC3022z
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (x0.f32686a) {
            x0.a(k0.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((DoubleConsumer) new F(consumer));
    }

    @Override // j$.util.S
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f32222a) {
            this.f32224c.tryAdvance((DoubleConsumer) this);
        }
        return this.f32222a;
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (!x0.f32686a) {
            return Double.valueOf(nextDouble());
        }
        x0.a(k0.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
        throw null;
    }

    @Override // j$.util.I
    public final double nextDouble() {
        if (!this.f32222a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f32222a = false;
        return this.f32223b;
    }
}
