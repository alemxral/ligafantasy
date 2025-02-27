package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class E {

    /* renamed from: c, reason: collision with root package name */
    private static final E f32081c = new E();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f32082a;

    /* renamed from: b, reason: collision with root package name */
    private final long f32083b;

    private E() {
        this.f32082a = false;
        this.f32083b = 0L;
    }

    private E(long j8) {
        this.f32082a = true;
        this.f32083b = j8;
    }

    public static E a() {
        return f32081c;
    }

    public static E d(long j8) {
        return new E(j8);
    }

    public final long b() {
        if (this.f32082a) {
            return this.f32083b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f32082a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e8 = (E) obj;
        boolean z8 = this.f32082a;
        if (z8 && e8.f32082a) {
            if (this.f32083b == e8.f32083b) {
                return true;
            }
        } else if (z8 == e8.f32082a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f32082a) {
            return 0;
        }
        long j8 = this.f32083b;
        return (int) (j8 ^ (j8 >>> 32));
    }

    public final String toString() {
        if (!this.f32082a) {
            return "OptionalLong.empty";
        }
        return "OptionalLong[" + this.f32083b + "]";
    }
}
