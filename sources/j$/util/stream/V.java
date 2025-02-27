package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class V extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    private Spliterator f32437a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2975q2 f32438b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC2897b f32439c;

    /* renamed from: d, reason: collision with root package name */
    private long f32440d;

    V(V v8, Spliterator spliterator) {
        super(v8);
        this.f32437a = spliterator;
        this.f32438b = v8.f32438b;
        this.f32440d = v8.f32440d;
        this.f32439c = v8.f32439c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public V(AbstractC2897b abstractC2897b, Spliterator spliterator, InterfaceC2975q2 interfaceC2975q2) {
        super(null);
        this.f32438b = interfaceC2975q2;
        this.f32439c = abstractC2897b;
        this.f32437a = spliterator;
        this.f32440d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f32437a;
        long estimateSize = spliterator.estimateSize();
        long j8 = this.f32440d;
        if (j8 == 0) {
            j8 = AbstractC2912e.g(estimateSize);
            this.f32440d = j8;
        }
        boolean r8 = EnumC2916e3.SHORT_CIRCUIT.r(this.f32439c.G());
        InterfaceC2975q2 interfaceC2975q2 = this.f32438b;
        boolean z8 = false;
        V v8 = this;
        while (true) {
            if (r8 && interfaceC2975q2.m()) {
                break;
            }
            if (estimateSize <= j8 || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            V v9 = new V(v8, trySplit);
            v8.addToPendingCount(1);
            if (z8) {
                spliterator = trySplit;
            } else {
                V v10 = v8;
                v8 = v9;
                v9 = v10;
            }
            z8 = !z8;
            v8.fork();
            v8 = v9;
            estimateSize = spliterator.estimateSize();
        }
        v8.f32439c.w(spliterator, interfaceC2975q2);
        v8.f32437a = null;
        v8.propagateCompletion();
    }
}
