package androidx.compose.ui.graphics.colorspace;

import androidx.annotation.Size;

/* loaded from: classes.dex */
public final class WhitePoint {

    /* renamed from: x, reason: collision with root package name */
    private final float f13785x;

    /* renamed from: y, reason: collision with root package name */
    private final float f13786y;

    public WhitePoint(float f8, float f9) {
        this.f13785x = f8;
        this.f13786y = f9;
    }

    public static /* synthetic */ WhitePoint copy$default(WhitePoint whitePoint, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = whitePoint.f13785x;
        }
        if ((i8 & 2) != 0) {
            f9 = whitePoint.f13786y;
        }
        return whitePoint.copy(f8, f9);
    }

    public final float component1() {
        return this.f13785x;
    }

    public final float component2() {
        return this.f13786y;
    }

    public final WhitePoint copy(float f8, float f9) {
        return new WhitePoint(f8, f9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WhitePoint)) {
            return false;
        }
        WhitePoint whitePoint = (WhitePoint) obj;
        return Float.compare(this.f13785x, whitePoint.f13785x) == 0 && Float.compare(this.f13786y, whitePoint.f13786y) == 0;
    }

    public final float getX() {
        return this.f13785x;
    }

    public final float getY() {
        return this.f13786y;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f13785x) * 31) + Float.floatToIntBits(this.f13786y);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f13785x + ", y=" + this.f13786y + ')';
    }

    @Size(3)
    public final float[] toXyz$ui_graphics_release() {
        float f8 = this.f13785x;
        float f9 = this.f13786y;
        return new float[]{f8 / f9, 1.0f, ((1.0f - f8) - f9) / f9};
    }

    public WhitePoint(float f8, float f9, float f10) {
        this(f8, f9, f10, f8 + f9 + f10);
    }

    private WhitePoint(float f8, float f9, float f10, float f11) {
        this(f8 / f11, f9 / f11);
    }
}
