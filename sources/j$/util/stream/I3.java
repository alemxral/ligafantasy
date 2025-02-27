package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class I3 extends AbstractC2926g3 {
    @Override // j$.util.stream.AbstractC2926g3
    final void d() {
        C2896a3 c2896a3 = new C2896a3();
        this.f32538h = c2896a3;
        Objects.requireNonNull(c2896a3);
        this.f32535e = this.f32532b.S(new H3(c2896a3, 0));
        this.f32536f = new C2892a(6, this);
    }

    @Override // j$.util.stream.AbstractC2926g3
    final AbstractC2926g3 e(Spliterator spliterator) {
        return new AbstractC2926g3(this.f32532b, spliterator, this.f32531a);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f32538h != null || this.f32539i) {
            do {
            } while (tryAdvance(consumer));
            return;
        }
        Objects.requireNonNull(consumer);
        c();
        Objects.requireNonNull(consumer);
        H3 h32 = new H3(consumer, 1);
        this.f32532b.R(this.f32534d, h32);
        this.f32539i = true;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean a8 = a();
        if (a8) {
            C2896a3 c2896a3 = (C2896a3) this.f32538h;
            long j8 = this.f32537g;
            if (c2896a3.f32486c != 0) {
                if (j8 >= c2896a3.count()) {
                    throw new IndexOutOfBoundsException(Long.toString(j8));
                }
                for (int i8 = 0; i8 <= c2896a3.f32486c; i8++) {
                    long j9 = c2896a3.f32487d[i8];
                    Object[] objArr = c2896a3.f32465f[i8];
                    if (j8 < objArr.length + j9) {
                        obj = objArr[(int) (j8 - j9)];
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j8));
            }
            if (j8 >= c2896a3.f32485b) {
                throw new IndexOutOfBoundsException(Long.toString(j8));
            }
            obj = c2896a3.f32464e[(int) j8];
            consumer.o(obj);
        }
        return a8;
    }
}
