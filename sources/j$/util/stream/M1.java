package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class M1 extends AbstractC3013z0 {

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ BinaryOperator f32339h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ BiConsumer f32340i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Supplier f32341j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Collector f32342k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M1(EnumC2921f3 enumC2921f3, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        super(enumC2921f3);
        this.f32339h = binaryOperator;
        this.f32340i = biConsumer;
        this.f32341j = supplier;
        this.f32342k = collector;
    }

    @Override // j$.util.stream.AbstractC3013z0, j$.util.stream.K3
    public final int d() {
        if (this.f32342k.characteristics().contains(EnumC2932i.UNORDERED)) {
            return EnumC2916e3.f32513r;
        }
        return 0;
    }

    @Override // j$.util.stream.AbstractC3013z0
    public final V1 f0() {
        return new N1(this.f32341j, this.f32340i, this.f32339h);
    }
}
