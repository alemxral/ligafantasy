package androidx.compose.ui.graphics.colorspace;

import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes.dex */
public final class TransferParameters {

    /* renamed from: a, reason: collision with root package name */
    private final double f13779a;

    /* renamed from: b, reason: collision with root package name */
    private final double f13780b;

    /* renamed from: c, reason: collision with root package name */
    private final double f13781c;

    /* renamed from: d, reason: collision with root package name */
    private final double f13782d;

    /* renamed from: e, reason: collision with root package name */
    private final double f13783e;

    /* renamed from: f, reason: collision with root package name */
    private final double f13784f;
    private final double gamma;

    public TransferParameters(double d8, double d9, double d10, double d11, double d12, double d13, double d14) {
        this.gamma = d8;
        this.f13779a = d9;
        this.f13780b = d10;
        this.f13781c = d11;
        this.f13782d = d12;
        this.f13783e = d13;
        this.f13784f = d14;
        if (Double.isNaN(d9) || Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d8)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d12 < 0.0d || d12 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d12);
        }
        if (d12 == 0.0d && (d9 == 0.0d || d8 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d12 >= 1.0d && d11 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d9 == 0.0d || d8 == 0.0d) && d11 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d11 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d9 < 0.0d || d8 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final double component1() {
        return this.gamma;
    }

    public final double component2() {
        return this.f13779a;
    }

    public final double component3() {
        return this.f13780b;
    }

    public final double component4() {
        return this.f13781c;
    }

    public final double component5() {
        return this.f13782d;
    }

    public final double component6() {
        return this.f13783e;
    }

    public final double component7() {
        return this.f13784f;
    }

    public final TransferParameters copy(double d8, double d9, double d10, double d11, double d12, double d13, double d14) {
        return new TransferParameters(d8, d9, d10, d11, d12, d13, d14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferParameters)) {
            return false;
        }
        TransferParameters transferParameters = (TransferParameters) obj;
        return Double.compare(this.gamma, transferParameters.gamma) == 0 && Double.compare(this.f13779a, transferParameters.f13779a) == 0 && Double.compare(this.f13780b, transferParameters.f13780b) == 0 && Double.compare(this.f13781c, transferParameters.f13781c) == 0 && Double.compare(this.f13782d, transferParameters.f13782d) == 0 && Double.compare(this.f13783e, transferParameters.f13783e) == 0 && Double.compare(this.f13784f, transferParameters.f13784f) == 0;
    }

    public final double getA() {
        return this.f13779a;
    }

    public final double getB() {
        return this.f13780b;
    }

    public final double getC() {
        return this.f13781c;
    }

    public final double getD() {
        return this.f13782d;
    }

    public final double getE() {
        return this.f13783e;
    }

    public final double getF() {
        return this.f13784f;
    }

    public final double getGamma() {
        return this.gamma;
    }

    public int hashCode() {
        return (((((((((((androidx.compose.animation.core.b.a(this.gamma) * 31) + androidx.compose.animation.core.b.a(this.f13779a)) * 31) + androidx.compose.animation.core.b.a(this.f13780b)) * 31) + androidx.compose.animation.core.b.a(this.f13781c)) * 31) + androidx.compose.animation.core.b.a(this.f13782d)) * 31) + androidx.compose.animation.core.b.a(this.f13783e)) * 31) + androidx.compose.animation.core.b.a(this.f13784f);
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.gamma + ", a=" + this.f13779a + ", b=" + this.f13780b + ", c=" + this.f13781c + ", d=" + this.f13782d + ", e=" + this.f13783e + ", f=" + this.f13784f + ')';
    }

    public /* synthetic */ TransferParameters(double d8, double d9, double d10, double d11, double d12, double d13, double d14, int i8, AbstractC3151p abstractC3151p) {
        this(d8, d9, d10, d11, d12, (i8 & 32) != 0 ? 0.0d : d13, (i8 & 64) != 0 ? 0.0d : d14);
    }
}
