package j$.util.stream;

import j$.util.AbstractC2877d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.t3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2990t3 extends AbstractC2926g3 implements j$.util.c0 {
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.Z2, java.lang.Object, j$.util.stream.d, java.util.function.LongConsumer] */
    @Override // j$.util.stream.AbstractC2926g3
    final void d() {
        ?? z22 = new Z2();
        this.f32538h = z22;
        Objects.requireNonNull(z22);
        this.f32535e = this.f32532b.S(new C2985s3(z22, 0));
        this.f32536f = new C2892a(5, this);
    }

    @Override // j$.util.stream.AbstractC2926g3
    final AbstractC2926g3 e(Spliterator spliterator) {
        return new AbstractC2926g3(this.f32532b, spliterator, this.f32531a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2877d.c(this, consumer);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.f32538h != null || this.f32539i) {
            do {
            } while (tryAdvance(longConsumer));
            return;
        }
        Objects.requireNonNull(longConsumer);
        c();
        Objects.requireNonNull(longConsumer);
        C2985s3 c2985s3 = new C2985s3(longConsumer, 1);
        this.f32532b.R(this.f32534d, c2985s3);
        this.f32539i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2877d.h(this, consumer);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        boolean a8 = a();
        if (a8) {
            X2 x22 = (X2) this.f32538h;
            long j8 = this.f32537g;
            int t8 = x22.t(j8);
            longConsumer.accept((x22.f32486c == 0 && t8 == 0) ? ((long[]) x22.f32457e)[(int) j8] : ((long[][]) x22.f32458f)[t8][(int) (j8 - x22.f32487d[t8])]);
        }
        return a8;
    }

    @Override // j$.util.stream.AbstractC2926g3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.c0) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC2926g3, j$.util.Spliterator
    public final j$.util.c0 trySplit() {
        return (j$.util.c0) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC2926g3, j$.util.Spliterator
    public final j$.util.f0 trySplit() {
        return (j$.util.c0) super.trySplit();
    }
}
