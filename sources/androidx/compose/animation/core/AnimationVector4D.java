package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AnimationVector4D extends AnimationVector {
    public static final int $stable = 8;
    private final int size;

    /* renamed from: v1, reason: collision with root package name */
    private float f13733v1;

    /* renamed from: v2, reason: collision with root package name */
    private float f13734v2;

    /* renamed from: v3, reason: collision with root package name */
    private float f13735v3;

    /* renamed from: v4, reason: collision with root package name */
    private float f13736v4;

    public AnimationVector4D(float f8, float f9, float f10, float f11) {
        super(null);
        this.f13733v1 = f8;
        this.f13734v2 = f9;
        this.f13735v3 = f10;
        this.f13736v4 = f11;
        this.size = 4;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnimationVector4D) {
            AnimationVector4D animationVector4D = (AnimationVector4D) obj;
            if (animationVector4D.f13733v1 == this.f13733v1 && animationVector4D.f13734v2 == this.f13734v2 && animationVector4D.f13735v3 == this.f13735v3 && animationVector4D.f13736v4 == this.f13736v4) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int i8) {
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        return 0.0f;
                    }
                    return this.f13736v4;
                }
                return this.f13735v3;
            }
            return this.f13734v2;
        }
        return this.f13733v1;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.size;
    }

    public final float getV1() {
        return this.f13733v1;
    }

    public final float getV2() {
        return this.f13734v2;
    }

    public final float getV3() {
        return this.f13735v3;
    }

    public final float getV4() {
        return this.f13736v4;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f13733v1) * 31) + Float.floatToIntBits(this.f13734v2)) * 31) + Float.floatToIntBits(this.f13735v3)) * 31) + Float.floatToIntBits(this.f13736v4);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.f13733v1 = 0.0f;
        this.f13734v2 = 0.0f;
        this.f13735v3 = 0.0f;
        this.f13736v4 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int i8, float f8) {
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        this.f13736v4 = f8;
                        return;
                    }
                    return;
                }
                this.f13735v3 = f8;
                return;
            }
            this.f13734v2 = f8;
            return;
        }
        this.f13733v1 = f8;
    }

    public final void setV1$animation_core_release(float f8) {
        this.f13733v1 = f8;
    }

    public final void setV2$animation_core_release(float f8) {
        this.f13734v2 = f8;
    }

    public final void setV3$animation_core_release(float f8) {
        this.f13735v3 = f8;
    }

    public final void setV4$animation_core_release(float f8) {
        this.f13736v4 = f8;
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.f13733v1 + ", v2 = " + this.f13734v2 + ", v3 = " + this.f13735v3 + ", v4 = " + this.f13736v4;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public AnimationVector4D newVector$animation_core_release() {
        return new AnimationVector4D(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
