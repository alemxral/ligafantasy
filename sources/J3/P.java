package J3;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    private final FontFamily f4862a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4863b;

    public /* synthetic */ P(FontFamily fontFamily, long j8, AbstractC3151p abstractC3151p) {
        this(fontFamily, j8);
    }

    public final FontFamily a() {
        return this.f4862a;
    }

    public final long b() {
        return this.f4863b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p8 = (P) obj;
        if (AbstractC3159y.d(this.f4862a, p8.f4862a) && TextUnit.m5362equalsimpl0(this.f4863b, p8.f4863b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        FontFamily fontFamily = this.f4862a;
        if (fontFamily == null) {
            hashCode = 0;
        } else {
            hashCode = fontFamily.hashCode();
        }
        return (hashCode * 31) + TextUnit.m5366hashCodeimpl(this.f4863b);
    }

    public String toString() {
        return "PrimaryButtonTypography(fontFamily=" + this.f4862a + ", fontSize=" + TextUnit.m5372toStringimpl(this.f4863b) + ")";
    }

    private P(FontFamily fontFamily, long j8) {
        this.f4862a = fontFamily;
        this.f4863b = j8;
    }

    public /* synthetic */ P(FontFamily fontFamily, long j8, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? null : fontFamily, (i8 & 2) != 0 ? TextUnit.Companion.m5376getUnspecifiedXSAIIZE() : j8, null);
    }
}
