package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2957n implements Collector {

    /* renamed from: a, reason: collision with root package name */
    private final Supplier f32566a;

    /* renamed from: b, reason: collision with root package name */
    private final BiConsumer f32567b;

    /* renamed from: c, reason: collision with root package name */
    private final BinaryOperator f32568c;

    /* renamed from: d, reason: collision with root package name */
    private final Function f32569d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f32570e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2957n(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator) {
        this(supplier, biConsumer, binaryOperator, new C2947l(2), Collectors.f32272a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2957n(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, Set set) {
        this.f32566a = supplier;
        this.f32567b = biConsumer;
        this.f32568c = binaryOperator;
        this.f32569d = function;
        this.f32570e = set;
    }

    @Override // j$.util.stream.Collector
    public final BiConsumer accumulator() {
        return this.f32567b;
    }

    @Override // j$.util.stream.Collector
    public final Set characteristics() {
        return this.f32570e;
    }

    @Override // j$.util.stream.Collector
    public final BinaryOperator combiner() {
        return this.f32568c;
    }

    @Override // j$.util.stream.Collector
    public final Function finisher() {
        return this.f32569d;
    }

    @Override // j$.util.stream.Collector
    public final Supplier supplier() {
        return this.f32566a;
    }
}
