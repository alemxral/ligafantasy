package j4;

import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: j4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3078d {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f33158a;

    /* renamed from: b, reason: collision with root package name */
    private final long f33159b;

    public /* synthetic */ C3078d(Integer num, long j8, AbstractC3151p abstractC3151p) {
        this(num, j8);
    }

    public final Integer a() {
        return this.f33158a;
    }

    public final long b() {
        return this.f33159b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3078d)) {
            return false;
        }
        C3078d c3078d = (C3078d) obj;
        if (AbstractC3159y.d(this.f33158a, c3078d.f33158a) && TextUnit.m5362equalsimpl0(this.f33159b, c3078d.f33159b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.f33158a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return (hashCode * 31) + TextUnit.m5366hashCodeimpl(this.f33159b);
    }

    public String toString() {
        return "PrimaryButtonTypography(fontFamily=" + this.f33158a + ", fontSize=" + TextUnit.m5372toStringimpl(this.f33159b) + ")";
    }

    private C3078d(Integer num, long j8) {
        this.f33158a = num;
        this.f33159b = j8;
    }
}
