package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class i0 implements M, IntConsumer, InterfaceC3022z {

    /* renamed from: a, reason: collision with root package name */
    boolean f32211a = false;

    /* renamed from: b, reason: collision with root package name */
    int f32212b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Z f32213c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(Z z8) {
        this.f32213c = z8;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i8) {
        this.f32211a = true;
        this.f32212b = i8;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.M, java.util.Iterator, j$.util.InterfaceC3022z
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            forEachRemaining((IntConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (x0.f32686a) {
            x0.a(i0.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((IntConsumer) new J(consumer));
    }

    @Override // j$.util.S
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        while (hasNext()) {
            intConsumer.accept(nextInt());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f32211a) {
            this.f32213c.tryAdvance((IntConsumer) this);
        }
        return this.f32211a;
    }

    @Override // java.util.Iterator
    public final Integer next() {
        if (!x0.f32686a) {
            return Integer.valueOf(nextInt());
        }
        x0.a(i0.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }

    @Override // j$.util.M
    public final int nextInt() {
        if (!this.f32211a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f32211a = false;
        return this.f32212b;
    }
}
