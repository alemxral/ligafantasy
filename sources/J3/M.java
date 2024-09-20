package J3;

import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes4.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    private final float f4846a;

    /* renamed from: b, reason: collision with root package name */
    private final float f4847b;

    public /* synthetic */ M(float f8, float f9, AbstractC3151p abstractC3151p) {
        this(f8, f9);
    }

    public final float a() {
        return this.f4847b;
    }

    public final float b() {
        return this.f4846a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m8 = (M) obj;
        if (Dp.m5183equalsimpl0(this.f4846a, m8.f4846a) && Dp.m5183equalsimpl0(this.f4847b, m8.f4847b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Dp.m5184hashCodeimpl(this.f4846a) * 31) + Dp.m5184hashCodeimpl(this.f4847b);
    }

    public String toString() {
        return "PrimaryButtonShape(cornerRadius=" + Dp.m5189toStringimpl(this.f4846a) + ", borderStrokeWidth=" + Dp.m5189toStringimpl(this.f4847b) + ")";
    }

    private M(float f8, float f9) {
        this.f4846a = f8;
        this.f4847b = f9;
    }

    public /* synthetic */ M(float f8, float f9, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? Dp.Companion.m5198getUnspecifiedD9Ej5fM() : f8, (i8 & 2) != 0 ? Dp.Companion.m5198getUnspecifiedD9Ej5fM() : f9, null);
    }
}
