package j$.util.stream;

import j$.util.AbstractC2877d;
import j$.util.C3020x;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class E implements G {

    /* renamed from: a */
    public final /* synthetic */ DoubleStream f32277a;

    private /* synthetic */ E(DoubleStream doubleStream) {
        this.f32277a = doubleStream;
    }

    public static /* synthetic */ G w(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof F ? ((F) doubleStream).f32285a : new E(doubleStream);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G a() {
        return w(this.f32277a.filter(null));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ j$.util.C average() {
        return AbstractC2877d.j(this.f32277a.average());
    }

    @Override // j$.util.stream.G
    public final G b(C2892a c2892a) {
        DoubleStream doubleStream = this.f32277a;
        C2892a c2892a2 = new C2892a(8);
        c2892a2.f32460b = c2892a;
        return w(doubleStream.flatMap(c2892a2));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ Stream boxed() {
        return C2901b3.w(this.f32277a.boxed());
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f32277a.close();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f32277a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ long count() {
        return this.f32277a.count();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G distinct() {
        return w(this.f32277a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.f32277a;
        if (obj instanceof E) {
            obj = ((E) obj).f32277a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ boolean f() {
        return this.f32277a.allMatch(null);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ j$.util.C findAny() {
        return AbstractC2877d.j(this.f32277a.findAny());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ j$.util.C findFirst() {
        return AbstractC2877d.j(this.f32277a.findFirst());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f32277a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f32277a.forEachOrdered(doubleConsumer);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ InterfaceC2968p0 g() {
        return C2958n0.w(this.f32277a.mapToLong(null));
    }

    public final /* synthetic */ int hashCode() {
        return this.f32277a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC2927h
    public final /* synthetic */ boolean isParallel() {
        return this.f32277a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.G
    public final /* synthetic */ j$.util.I iterator() {
        return j$.util.G.a(this.f32277a.iterator());
    }

    @Override // j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.f32277a.iterator();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ boolean l() {
        return this.f32277a.anyMatch(null);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G limit(long j8) {
        return w(this.f32277a.limit(j8));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G map(DoubleUnaryOperator doubleUnaryOperator) {
        return w(this.f32277a.map(doubleUnaryOperator));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return C2901b3.w(this.f32277a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ j$.util.C max() {
        return AbstractC2877d.j(this.f32277a.max());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ j$.util.C min() {
        return AbstractC2877d.j(this.f32277a.min());
    }

    @Override // j$.util.stream.InterfaceC2927h
    public final /* synthetic */ InterfaceC2927h onClose(Runnable runnable) {
        return C2917f.w(this.f32277a.onClose(runnable));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G parallel() {
        return w(this.f32277a.parallel());
    }

    @Override // j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final /* synthetic */ InterfaceC2927h parallel() {
        return C2917f.w(this.f32277a.parallel());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G peek(DoubleConsumer doubleConsumer) {
        return w(this.f32277a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ IntStream q() {
        return IntStream.VivifiedWrapper.convert(this.f32277a.mapToInt(null));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ double reduce(double d8, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f32277a.reduce(d8, doubleBinaryOperator);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ j$.util.C reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC2877d.j(this.f32277a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G sequential() {
        return w(this.f32277a.sequential());
    }

    @Override // j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final /* synthetic */ InterfaceC2927h sequential() {
        return C2917f.w(this.f32277a.sequential());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G skip(long j8) {
        return w(this.f32277a.skip(j8));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G sorted() {
        return w(this.f32277a.sorted());
    }

    @Override // j$.util.stream.InterfaceC2927h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.g0.a(this.f32277a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.G, j$.util.stream.InterfaceC2927h
    public final /* synthetic */ j$.util.W spliterator() {
        return j$.util.U.a(this.f32277a.spliterator());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ double sum() {
        return this.f32277a.sum();
    }

    @Override // j$.util.stream.G
    public final C3020x summaryStatistics() {
        this.f32277a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ double[] toArray() {
        return this.f32277a.toArray();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ boolean u() {
        return this.f32277a.noneMatch(null);
    }

    @Override // j$.util.stream.InterfaceC2927h
    public final /* synthetic */ InterfaceC2927h unordered() {
        return C2917f.w(this.f32277a.unordered());
    }
}
