package m4;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes4.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    private final long f35116a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35117b;

    public /* synthetic */ M(long j8, long j9, AbstractC3151p abstractC3151p) {
        this(j8, j9);
    }

    public final long a() {
        return this.f35117b;
    }

    public final long b() {
        return this.f35116a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m8 = (M) obj;
        if (Color.m2972equalsimpl0(this.f35116a, m8.f35116a) && Color.m2972equalsimpl0(this.f35117b, m8.f35117b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Color.m2978hashCodeimpl(this.f35116a) * 31) + Color.m2978hashCodeimpl(this.f35117b);
    }

    public String toString() {
        return "OTPElementColors(selectedBorder=" + Color.m2979toStringimpl(this.f35116a) + ", placeholder=" + Color.m2979toStringimpl(this.f35117b) + ")";
    }

    private M(long j8, long j9) {
        this.f35116a = j8;
        this.f35117b = j9;
    }
}
