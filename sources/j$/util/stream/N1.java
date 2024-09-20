package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class N1 extends W1 implements V1 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Supplier f32349b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BiConsumer f32350c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinaryOperator f32351d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N1(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator) {
        this.f32349b = supplier;
        this.f32350c = biConsumer;
        this.f32351d = binaryOperator;
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ void accept(double d8) {
        AbstractC3013z0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ void accept(int i8) {
        AbstractC3013z0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2975q2, j$.util.stream.InterfaceC2970p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        AbstractC3013z0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        this.f32350c.accept(this.f32442a, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.V1
    public final void f(V1 v12) {
        this.f32442a = this.f32351d.apply(this.f32442a, ((N1) v12).f32442a);
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final void k(long j8) {
        this.f32442a = this.f32349b.get();
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}
