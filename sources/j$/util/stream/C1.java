package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class C1 extends W1 implements V1, InterfaceC2970p2 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Supplier f32267b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ObjLongConsumer f32268c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinaryOperator f32269d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1(Supplier supplier, ObjLongConsumer objLongConsumer, BinaryOperator binaryOperator) {
        this.f32267b = supplier;
        this.f32268c = objLongConsumer;
        this.f32269d = binaryOperator;
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
    public final void accept(long j8) {
        this.f32268c.accept(this.f32442a, j8);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        i((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.V1
    public final void f(V1 v12) {
        this.f32442a = this.f32269d.apply(this.f32442a, ((C1) v12).f32442a);
    }

    @Override // j$.util.stream.InterfaceC2970p2
    public final /* synthetic */ void i(Long l8) {
        AbstractC3013z0.i(this, l8);
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final void k(long j8) {
        this.f32442a = this.f32267b.get();
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}
