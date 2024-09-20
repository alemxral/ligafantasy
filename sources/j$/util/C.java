package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class C {

    /* renamed from: c, reason: collision with root package name */
    private static final C f32075c = new C();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f32076a;

    /* renamed from: b, reason: collision with root package name */
    private final double f32077b;

    private C() {
        this.f32076a = false;
        this.f32077b = Double.NaN;
    }

    private C(double d8) {
        this.f32076a = true;
        this.f32077b = d8;
    }

    public static C a() {
        return f32075c;
    }

    public static C d(double d8) {
        return new C(d8);
    }

    public final double b() {
        if (this.f32076a) {
            return this.f32077b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f32076a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c8 = (C) obj;
        boolean z8 = this.f32076a;
        if (z8 && c8.f32076a) {
            if (Double.compare(this.f32077b, c8.f32077b) == 0) {
                return true;
            }
        } else if (z8 == c8.f32076a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f32076a) {
            return 0;
        }
        long doubleToLongBits = Double.doubleToLongBits(this.f32077b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        if (!this.f32076a) {
            return "OptionalDouble.empty";
        }
        return "OptionalDouble[" + this.f32077b + "]";
    }
}
