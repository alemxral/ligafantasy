package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* loaded from: classes2.dex */
final class X extends AbstractC2945k2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32444b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC2897b f32445c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(AbstractC2897b abstractC2897b, InterfaceC2975q2 interfaceC2975q2, int i8) {
        super(interfaceC2975q2);
        this.f32444b = i8;
        this.f32445c = abstractC2897b;
    }

    @Override // j$.util.stream.InterfaceC2965o2, j$.util.stream.InterfaceC2975q2
    public final void accept(int i8) {
        switch (this.f32444b) {
            case 0:
                this.f32555a.accept((InterfaceC2975q2) ((IntFunction) ((C2996v) this.f32445c).f32618n).apply(i8));
                return;
            case 1:
                ((IntConsumer) ((Y) this.f32445c).f32447n).accept(i8);
                this.f32555a.accept(i8);
                return;
            case 2:
                ((C3004x) this.f32445c).getClass();
                IntUnaryOperator intUnaryOperator = null;
                intUnaryOperator.applyAsInt(i8);
                throw null;
            case 3:
                ((C3008y) this.f32445c).getClass();
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i8);
                throw null;
            case 4:
                ((A) this.f32445c).getClass();
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i8);
                throw null;
            default:
                ((C3004x) this.f32445c).getClass();
                IntPredicate intPredicate = null;
                intPredicate.test(i8);
                throw null;
        }
    }

    @Override // j$.util.stream.AbstractC2945k2, j$.util.stream.InterfaceC2975q2
    public void k(long j8) {
        switch (this.f32444b) {
            case 5:
                this.f32555a.k(-1L);
                return;
            default:
                super.k(j8);
                return;
        }
    }
}
