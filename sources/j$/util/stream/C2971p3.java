package j$.util.stream;

import j$.util.AbstractC2877d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.p3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2971p3 extends AbstractC2926g3 implements j$.util.W {
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.Z2, java.lang.Object, java.util.function.DoubleConsumer, j$.util.stream.d] */
    @Override // j$.util.stream.AbstractC2926g3
    final void d() {
        ?? z22 = new Z2();
        this.f32538h = z22;
        Objects.requireNonNull(z22);
        this.f32535e = this.f32532b.S(new C2966o3(z22, 0));
        this.f32536f = new C2892a(3, this);
    }

    @Override // j$.util.stream.AbstractC2926g3
    final AbstractC2926g3 e(Spliterator spliterator) {
        return new AbstractC2926g3(this.f32532b, spliterator, this.f32531a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2877d.a(this, consumer);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.f32538h != null || this.f32539i) {
            do {
            } while (tryAdvance(doubleConsumer));
            return;
        }
        Objects.requireNonNull(doubleConsumer);
        c();
        Objects.requireNonNull(doubleConsumer);
        C2966o3 c2966o3 = new C2966o3(doubleConsumer, 1);
        this.f32532b.R(this.f32534d, c2966o3);
        this.f32539i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2877d.f(this, consumer);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        boolean a8 = a();
        if (a8) {
            T2 t22 = (T2) this.f32538h;
            long j8 = this.f32537g;
            int t8 = t22.t(j8);
            doubleConsumer.accept((t22.f32486c == 0 && t8 == 0) ? ((double[]) t22.f32457e)[(int) j8] : ((double[][]) t22.f32458f)[t8][(int) (j8 - t22.f32487d[t8])]);
        }
        return a8;
    }

    @Override // j$.util.stream.AbstractC2926g3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.W) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC2926g3, j$.util.Spliterator
    public final j$.util.W trySplit() {
        return (j$.util.W) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC2926g3, j$.util.Spliterator
    public final j$.util.f0 trySplit() {
        return (j$.util.W) super.trySplit();
    }
}
