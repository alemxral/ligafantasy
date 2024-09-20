package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class L1 implements V1 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f32331a;

    /* renamed from: b, reason: collision with root package name */
    private Object f32332b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinaryOperator f32333c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L1(BinaryOperator binaryOperator) {
        this.f32333c = binaryOperator;
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
        if (this.f32331a) {
            this.f32331a = false;
        } else {
            obj = this.f32333c.apply(this.f32332b, obj);
        }
        this.f32332b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.V1
    public final void f(V1 v12) {
        L1 l12 = (L1) v12;
        if (l12.f32331a) {
            return;
        }
        o(l12.f32332b);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f32331a ? j$.util.B.a() : j$.util.B.d(this.f32332b);
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final void k(long j8) {
        this.f32331a = true;
        this.f32332b = null;
    }

    @Override // j$.util.stream.InterfaceC2975q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}
