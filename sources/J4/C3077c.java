package j4;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: j4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3077c {

    /* renamed from: e, reason: collision with root package name */
    public static final int f33153e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final C3075a f33154a;

    /* renamed from: b, reason: collision with root package name */
    private final C3075a f33155b;

    /* renamed from: c, reason: collision with root package name */
    private final C3076b f33156c;

    /* renamed from: d, reason: collision with root package name */
    private final C3078d f33157d;

    public C3077c(C3075a colorsLight, C3075a colorsDark, C3076b shape, C3078d typography) {
        AbstractC3159y.i(colorsLight, "colorsLight");
        AbstractC3159y.i(colorsDark, "colorsDark");
        AbstractC3159y.i(shape, "shape");
        AbstractC3159y.i(typography, "typography");
        this.f33154a = colorsLight;
        this.f33155b = colorsDark;
        this.f33156c = shape;
        this.f33157d = typography;
    }

    public final C3077c a(C3075a colorsLight, C3075a colorsDark, C3076b shape, C3078d typography) {
        AbstractC3159y.i(colorsLight, "colorsLight");
        AbstractC3159y.i(colorsDark, "colorsDark");
        AbstractC3159y.i(shape, "shape");
        AbstractC3159y.i(typography, "typography");
        return new C3077c(colorsLight, colorsDark, shape, typography);
    }

    public final C3075a b() {
        return this.f33155b;
    }

    public final C3075a c() {
        return this.f33154a;
    }

    public final C3076b d() {
        return this.f33156c;
    }

    public final C3078d e() {
        return this.f33157d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3077c)) {
            return false;
        }
        C3077c c3077c = (C3077c) obj;
        if (AbstractC3159y.d(this.f33154a, c3077c.f33154a) && AbstractC3159y.d(this.f33155b, c3077c.f33155b) && AbstractC3159y.d(this.f33156c, c3077c.f33156c) && AbstractC3159y.d(this.f33157d, c3077c.f33157d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f33154a.hashCode() * 31) + this.f33155b.hashCode()) * 31) + this.f33156c.hashCode()) * 31) + this.f33157d.hashCode();
    }

    public String toString() {
        return "PrimaryButtonStyle(colorsLight=" + this.f33154a + ", colorsDark=" + this.f33155b + ", shape=" + this.f33156c + ", typography=" + this.f33157d + ")";
    }
}
