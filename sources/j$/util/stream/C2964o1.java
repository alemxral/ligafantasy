package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2964o1 extends AbstractC2969p1 {
    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f32583a == null) {
            return;
        }
        if (this.f32586d == null) {
            Spliterator spliterator = this.f32585c;
            if (spliterator != null) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            ArrayDeque b8 = b();
            while (true) {
                L0 a8 = AbstractC2969p1.a(b8);
                if (a8 == null) {
                    this.f32583a = null;
                    return;
                }
                a8.forEach(consumer);
            }
        }
        do {
        } while (tryAdvance(consumer));
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        L0 a8;
        if (!c()) {
            return false;
        }
        boolean tryAdvance = this.f32586d.tryAdvance(consumer);
        if (!tryAdvance) {
            if (this.f32585c == null && (a8 = AbstractC2969p1.a(this.f32587e)) != null) {
                Spliterator spliterator = a8.spliterator();
                this.f32586d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
            this.f32583a = null;
        }
        return tryAdvance;
    }
}
