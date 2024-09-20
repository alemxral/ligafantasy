package j4;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;

/* renamed from: j4.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3084j {

    /* renamed from: a, reason: collision with root package name */
    private final float f33212a;

    /* renamed from: b, reason: collision with root package name */
    private final float f33213b;

    /* renamed from: c, reason: collision with root package name */
    private final float f33214c;

    public C3084j(float f8, float f9, float f10) {
        this.f33212a = f8;
        this.f33213b = f9;
        this.f33214c = f10;
    }

    public static /* synthetic */ C3084j b(C3084j c3084j, float f8, float f9, float f10, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = c3084j.f33212a;
        }
        if ((i8 & 2) != 0) {
            f9 = c3084j.f33213b;
        }
        if ((i8 & 4) != 0) {
            f10 = c3084j.f33214c;
        }
        return c3084j.a(f8, f9, f10);
    }

    public final C3084j a(float f8, float f9, float f10) {
        return new C3084j(f8, f9, f10);
    }

    public final float c() {
        return this.f33213b;
    }

    public final float d() {
        return this.f33214c;
    }

    public final float e() {
        return this.f33212a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3084j)) {
            return false;
        }
        C3084j c3084j = (C3084j) obj;
        if (Float.compare(this.f33212a, c3084j.f33212a) == 0 && Float.compare(this.f33213b, c3084j.f33213b) == 0 && Float.compare(this.f33214c, c3084j.f33214c) == 0) {
            return true;
        }
        return false;
    }

    public final Shape f() {
        return RoundedCornerShapeKt.m852RoundedCornerShape0680j_4(Dp.m5178constructorimpl(this.f33212a));
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.f33212a) * 31) + Float.floatToIntBits(this.f33213b)) * 31) + Float.floatToIntBits(this.f33214c);
    }

    public String toString() {
        return "StripeShapes(cornerRadius=" + this.f33212a + ", borderStrokeWidth=" + this.f33213b + ", borderStrokeWidthSelected=" + this.f33214c + ")";
    }
}
