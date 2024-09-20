package j$.util.stream;

import j$.util.AbstractC2877d;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.n3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2961n3 implements Spliterator, Consumer {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f32572d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Spliterator f32573a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f32574b;

    /* renamed from: c, reason: collision with root package name */
    private Object f32575c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2961n3(Spliterator spliterator) {
        this(spliterator, new ConcurrentHashMap());
    }

    private C2961n3(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f32573a = spliterator;
        this.f32574b = concurrentHashMap;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f32575c = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Consumer consumer, Object obj) {
        if (this.f32574b.putIfAbsent(obj != null ? obj : f32572d, Boolean.TRUE) == null) {
            consumer.accept(obj);
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return (this.f32573a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f32573a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.f32573a.forEachRemaining(new C2952m(2, this, consumer));
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f32573a.getComparator();
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
        while (this.f32573a.tryAdvance(this)) {
            Object obj = this.f32575c;
            if (obj == null) {
                obj = f32572d;
            }
            if (this.f32574b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.f32575c);
                this.f32575c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator trySplit = this.f32573a.trySplit();
        if (trySplit != null) {
            return new C2961n3(trySplit, this.f32574b);
        }
        return null;
    }
}
