package j$.util.function;

import java.util.function.DoubleUnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements DoubleUnaryOperator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DoubleUnaryOperator f32192b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DoubleUnaryOperator f32193c;

    public /* synthetic */ c(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2, int i8) {
        this.f32191a = i8;
        this.f32192b = doubleUnaryOperator;
        this.f32193c = doubleUnaryOperator2;
    }

    public final /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator) {
        switch (this.f32191a) {
            case 0:
                return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator);
            default:
                return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator);
        }
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final double applyAsDouble(double d8) {
        switch (this.f32191a) {
            case 0:
                return this.f32192b.applyAsDouble(this.f32193c.applyAsDouble(d8));
            default:
                return this.f32193c.applyAsDouble(this.f32192b.applyAsDouble(d8));
        }
    }

    public final /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator) {
        switch (this.f32191a) {
            case 0:
                return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator);
            default:
                return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator);
        }
    }
}
