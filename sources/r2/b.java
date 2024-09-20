package R2;

import androidx.compose.material.Colors;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final long f8714a;

    /* renamed from: b, reason: collision with root package name */
    private final long f8715b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8716c;

    /* renamed from: d, reason: collision with root package name */
    private final long f8717d;

    /* renamed from: e, reason: collision with root package name */
    private final Colors f8718e;

    public /* synthetic */ b(long j8, long j9, long j10, long j11, Colors colors, AbstractC3151p abstractC3151p) {
        this(j8, j9, j10, j11, colors);
    }

    public static /* synthetic */ b b(b bVar, long j8, long j9, long j10, long j11, Colors colors, int i8, Object obj) {
        long j12;
        long j13;
        long j14;
        long j15;
        Colors colors2;
        if ((i8 & 1) != 0) {
            j12 = bVar.f8714a;
        } else {
            j12 = j8;
        }
        if ((i8 & 2) != 0) {
            j13 = bVar.f8715b;
        } else {
            j13 = j9;
        }
        if ((i8 & 4) != 0) {
            j14 = bVar.f8716c;
        } else {
            j14 = j10;
        }
        if ((i8 & 8) != 0) {
            j15 = bVar.f8717d;
        } else {
            j15 = j11;
        }
        if ((i8 & 16) != 0) {
            colors2 = bVar.f8718e;
        } else {
            colors2 = colors;
        }
        return bVar.a(j12, j13, j14, j15, colors2);
    }

    public final b a(long j8, long j9, long j10, long j11, Colors materialColors) {
        AbstractC3159y.i(materialColors, "materialColors");
        return new b(j8, j9, j10, j11, materialColors, null);
    }

    public final long c() {
        return this.f8715b;
    }

    public final long d() {
        return this.f8714a;
    }

    public final long e() {
        return this.f8717d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Color.m2972equalsimpl0(this.f8714a, bVar.f8714a) && Color.m2972equalsimpl0(this.f8715b, bVar.f8715b) && Color.m2972equalsimpl0(this.f8716c, bVar.f8716c) && Color.m2972equalsimpl0(this.f8717d, bVar.f8717d) && AbstractC3159y.d(this.f8718e, bVar.f8718e)) {
            return true;
        }
        return false;
    }

    public final long f() {
        return this.f8716c;
    }

    public final Colors g() {
        return this.f8718e;
    }

    public int hashCode() {
        return (((((((Color.m2978hashCodeimpl(this.f8714a) * 31) + Color.m2978hashCodeimpl(this.f8715b)) * 31) + Color.m2978hashCodeimpl(this.f8716c)) * 31) + Color.m2978hashCodeimpl(this.f8717d)) * 31) + this.f8718e.hashCode();
    }

    public String toString() {
        return "LinkColors(buttonLabel=" + Color.m2979toStringimpl(this.f8714a) + ", actionLabelLight=" + Color.m2979toStringimpl(this.f8715b) + ", errorText=" + Color.m2979toStringimpl(this.f8716c) + ", errorComponentBackground=" + Color.m2979toStringimpl(this.f8717d) + ", materialColors=" + this.f8718e + ")";
    }

    private b(long j8, long j9, long j10, long j11, Colors materialColors) {
        AbstractC3159y.i(materialColors, "materialColors");
        this.f8714a = j8;
        this.f8715b = j9;
        this.f8716c = j10;
        this.f8717d = j11;
        this.f8718e = materialColors;
    }
}
