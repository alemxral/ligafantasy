package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.x1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3006x1 extends CountedCompleter implements InterfaceC2975q2 {

    /* renamed from: a, reason: collision with root package name */
    protected final Spliterator f32636a;

    /* renamed from: b, reason: collision with root package name */
    protected final AbstractC2897b f32637b;

    /* renamed from: c, reason: collision with root package name */
    protected final long f32638c;

    /* renamed from: d, reason: collision with root package name */
    protected long f32639d;

    /* renamed from: e, reason: collision with root package name */
    protected long f32640e;

    /* renamed from: f, reason: collision with root package name */
    protected int f32641f;

    /* renamed from: g, reason: collision with root package name */
    protected int f32642g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3006x1(Spliterator spliterator, AbstractC2897b abstractC2897b, int i8) {
        this.f32636a = spliterator;
        this.f32637b = abstractC2897b;
        this.f32638c = AbstractC2912e.g(spliterator.estimateSize());
        this.f32639d = 0L;
        this.f32640e = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3006x1(AbstractC3006x1 abstractC3006x1, Spliterator spliterator, long j8, long j9, int i8) {
        super(abstractC3006x1);
        this.f32636a = spliterator;
        this.f32637b = abstractC3006x1.f32637b;
        this.f32638c = abstractC3006x1.f32638c;
        this.f32639d = j8;
        this.f32640e = j9;
        if (j8 < 0 || j9 < 0 || (j8 + j9) - 1 >= i8) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j8), Long.valueOf(j8), Long.valueOf(j9), Integer.valueOf(i8)));
        }
    }

    public /* synthetic */ void accept(double d8) {
        AbstractC3013z0.a();
        throw null;
    }

    public /* synthetic */ void accept(int i8) {
        AbstractC3013z0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j8) {
        AbstractC3013z0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    abstract AbstractC3006x1 b(Spliterator spliterator, long j8, long j9);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f32636a;
        AbstractC3006x1 abstractC3006x1 = this;
        while (spliterator.estimateSize() > abstractC3006x1.f32638c && (trySplit = spliterator.trySplit()) != null) {
            abstractC3006x1.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            abstractC3006x1.b(trySplit, abstractC3006x1.f32639d, estimateSize).fork();
            abstractC3006x1 = abstractC3006x1.b(spliterator, abstractC3006x1.f32639d + estimateSize, abstractC3006x1.f32640e - estimateSize);
        }
        abstractC3006x1.f32637b.R(spliterator, abstractC3006x1);
        abstractC3006x1.propagateCompletion();
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final void k(long j8) {
        long j9 = this.f32640e;
        if (j8 > j9) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i8 = (int) this.f32639d;
        this.f32641f = i8;
        this.f32642g = i8 + ((int) j9);
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}
