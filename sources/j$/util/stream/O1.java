package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class O1 extends W1 implements V1 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Supplier f32358b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BiConsumer f32359c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BiConsumer f32360d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O1(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.f32358b = supplier;
        this.f32359c = biConsumer;
        this.f32360d = biConsumer2;
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
        this.f32359c.accept(this.f32442a, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.V1
    public final void f(V1 v12) {
        this.f32360d.accept(this.f32442a, ((O1) v12).f32442a);
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final void k(long j8) {
        this.f32442a = this.f32358b.get();
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}
