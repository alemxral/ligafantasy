package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class D {

    /* renamed from: c, reason: collision with root package name */
    private static final D f32078c = new D();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f32079a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32080b;

    private D() {
        this.f32079a = false;
        this.f32080b = 0;
    }

    private D(int i8) {
        this.f32079a = true;
        this.f32080b = i8;
    }

    public static D a() {
        return f32078c;
    }

    public static D d(int i8) {
        return new D(i8);
    }

    public final int b() {
        if (this.f32079a) {
            return this.f32080b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f32079a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d8 = (D) obj;
        boolean z8 = this.f32079a;
        if (z8 && d8.f32079a) {
            if (this.f32080b == d8.f32080b) {
                return true;
            }
        } else if (z8 == d8.f32079a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f32079a) {
            return this.f32080b;
        }
        return 0;
    }

    public final String toString() {
        if (!this.f32079a) {
            return "OptionalInt.empty";
        }
        return "OptionalInt[" + this.f32080b + "]";
    }
}
