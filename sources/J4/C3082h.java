package j4;

import androidx.compose.material.Colors;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: j4.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3082h {

    /* renamed from: a, reason: collision with root package name */
    private final long f33200a;

    /* renamed from: b, reason: collision with root package name */
    private final long f33201b;

    /* renamed from: c, reason: collision with root package name */
    private final long f33202c;

    /* renamed from: d, reason: collision with root package name */
    private final long f33203d;

    /* renamed from: e, reason: collision with root package name */
    private final long f33204e;

    /* renamed from: f, reason: collision with root package name */
    private final long f33205f;

    /* renamed from: g, reason: collision with root package name */
    private final long f33206g;

    /* renamed from: h, reason: collision with root package name */
    private final long f33207h;

    /* renamed from: i, reason: collision with root package name */
    private final Colors f33208i;

    public /* synthetic */ C3082h(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, Colors colors, AbstractC3151p abstractC3151p) {
        this(j8, j9, j10, j11, j12, j13, j14, j15, colors);
    }

    public static /* synthetic */ C3082h b(C3082h c3082h, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, Colors colors, int i8, Object obj) {
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        Colors colors2;
        if ((i8 & 1) != 0) {
            j16 = c3082h.f33200a;
        } else {
            j16 = j8;
        }
        if ((i8 & 2) != 0) {
            j17 = c3082h.f33201b;
        } else {
            j17 = j9;
        }
        if ((i8 & 4) != 0) {
            j18 = c3082h.f33202c;
        } else {
            j18 = j10;
        }
        if ((i8 & 8) != 0) {
            j19 = c3082h.f33203d;
        } else {
            j19 = j11;
        }
        if ((i8 & 16) != 0) {
            j20 = c3082h.f33204e;
        } else {
            j20 = j12;
        }
        if ((i8 & 32) != 0) {
            j21 = c3082h.f33205f;
        } else {
            j21 = j13;
        }
        if ((i8 & 64) != 0) {
            j22 = c3082h.f33206g;
        } else {
            j22 = j14;
        }
        long j24 = j22;
        if ((i8 & 128) != 0) {
            j23 = c3082h.f33207h;
        } else {
            j23 = j15;
        }
        if ((i8 & 256) != 0) {
            colors2 = c3082h.f33208i;
        } else {
            colors2 = colors;
        }
        return c3082h.a(j16, j17, j18, j19, j20, j21, j24, j23, colors2);
    }

    public final C3082h a(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, Colors materialColors) {
        AbstractC3159y.i(materialColors, "materialColors");
        return new C3082h(j8, j9, j10, j11, j12, j13, j14, j15, materialColors, null);
    }

    public final long c() {
        return this.f33207h;
    }

    public final long d() {
        return this.f33200a;
    }

    public final long e() {
        return this.f33201b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3082h)) {
            return false;
        }
        C3082h c3082h = (C3082h) obj;
        if (Color.m2972equalsimpl0(this.f33200a, c3082h.f33200a) && Color.m2972equalsimpl0(this.f33201b, c3082h.f33201b) && Color.m2972equalsimpl0(this.f33202c, c3082h.f33202c) && Color.m2972equalsimpl0(this.f33203d, c3082h.f33203d) && Color.m2972equalsimpl0(this.f33204e, c3082h.f33204e) && Color.m2972equalsimpl0(this.f33205f, c3082h.f33205f) && Color.m2972equalsimpl0(this.f33206g, c3082h.f33206g) && Color.m2972equalsimpl0(this.f33207h, c3082h.f33207h) && AbstractC3159y.d(this.f33208i, c3082h.f33208i)) {
            return true;
        }
        return false;
    }

    public final long f() {
        return this.f33202c;
    }

    public final Colors g() {
        return this.f33208i;
    }

    public final long h() {
        return this.f33203d;
    }

    public int hashCode() {
        return (((((((((((((((Color.m2978hashCodeimpl(this.f33200a) * 31) + Color.m2978hashCodeimpl(this.f33201b)) * 31) + Color.m2978hashCodeimpl(this.f33202c)) * 31) + Color.m2978hashCodeimpl(this.f33203d)) * 31) + Color.m2978hashCodeimpl(this.f33204e)) * 31) + Color.m2978hashCodeimpl(this.f33205f)) * 31) + Color.m2978hashCodeimpl(this.f33206g)) * 31) + Color.m2978hashCodeimpl(this.f33207h)) * 31) + this.f33208i.hashCode();
    }

    public final long i() {
        return this.f33206g;
    }

    public final long j() {
        return this.f33204e;
    }

    public final long k() {
        return this.f33205f;
    }

    public String toString() {
        return "StripeColors(component=" + Color.m2979toStringimpl(this.f33200a) + ", componentBorder=" + Color.m2979toStringimpl(this.f33201b) + ", componentDivider=" + Color.m2979toStringimpl(this.f33202c) + ", onComponent=" + Color.m2979toStringimpl(this.f33203d) + ", subtitle=" + Color.m2979toStringimpl(this.f33204e) + ", textCursor=" + Color.m2979toStringimpl(this.f33205f) + ", placeholderText=" + Color.m2979toStringimpl(this.f33206g) + ", appBarIcon=" + Color.m2979toStringimpl(this.f33207h) + ", materialColors=" + this.f33208i + ")";
    }

    private C3082h(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, Colors materialColors) {
        AbstractC3159y.i(materialColors, "materialColors");
        this.f33200a = j8;
        this.f33201b = j9;
        this.f33202c = j10;
        this.f33203d = j11;
        this.f33204e = j12;
        this.f33205f = j13;
        this.f33206g = j14;
        this.f33207h = j15;
        this.f33208i = materialColors;
    }
}
