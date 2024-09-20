package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.stream.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2991u extends AbstractC2940j2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32612b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC2897b f32613c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2991u(AbstractC2897b abstractC2897b, InterfaceC2975q2 interfaceC2975q2, int i8) {
        super(interfaceC2975q2);
        this.f32612b = i8;
        this.f32613c = abstractC2897b;
    }

    @Override // j$.util.stream.InterfaceC2960n2, j$.util.stream.InterfaceC2975q2
    public final void accept(double d8) {
        switch (this.f32612b) {
            case 0:
                this.f32552a.accept((InterfaceC2975q2) ((DoubleFunction) ((C2996v) this.f32613c).f32618n).apply(d8));
                return;
            case 1:
                this.f32552a.accept(((DoubleUnaryOperator) ((C3000w) this.f32613c).f32626n).applyAsDouble(d8));
                return;
            case 2:
                ((C3004x) this.f32613c).getClass();
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d8);
                throw null;
            case 3:
                ((C3008y) this.f32613c).getClass();
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d8);
                throw null;
            case 4:
                ((A) this.f32613c).getClass();
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d8);
                throw null;
            default:
                ((DoubleConsumer) ((C3000w) this.f32613c).f32626n).accept(d8);
                this.f32552a.accept(d8);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC2940j2, j$.util.stream.InterfaceC2975q2
    public void k(long j8) {
        switch (this.f32612b) {
            case 4:
                this.f32552a.k(-1L);
                return;
            default:
                super.k(j8);
                return;
        }
    }
}
