package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2942k implements java.util.stream.Collector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Collector f32554a;

    private /* synthetic */ C2942k(Collector collector) {
        this.f32554a = collector;
    }

    public static /* synthetic */ java.util.stream.Collector a(Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C2937j ? ((C2937j) collector).f32549a : new C2942k(collector);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return this.f32554a.accumulator();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return AbstractC3013z0.R(this.f32554a.characteristics());
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return this.f32554a.combiner();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.f32554a;
        if (obj instanceof C2942k) {
            obj = ((C2942k) obj).f32554a;
        }
        return collector.equals(obj);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return this.f32554a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.f32554a.hashCode();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return this.f32554a.supplier();
    }
}
