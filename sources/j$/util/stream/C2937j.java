package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.j */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2937j implements Collector {

    /* renamed from: a */
    public final /* synthetic */ java.util.stream.Collector f32549a;

    private /* synthetic */ C2937j(java.util.stream.Collector collector) {
        this.f32549a = collector;
    }

    public static /* synthetic */ Collector a(java.util.stream.Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C2942k ? ((C2942k) collector).f32554a : new C2937j(collector);
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return this.f32549a.accumulator();
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return AbstractC3013z0.R(this.f32549a.characteristics());
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return this.f32549a.combiner();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.Collector collector = this.f32549a;
        if (obj instanceof C2937j) {
            obj = ((C2937j) obj).f32549a;
        }
        return collector.equals(obj);
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return this.f32549a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.f32549a.hashCode();
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return this.f32549a.supplier();
    }
}
