package n4;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: n4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3468d {

    /* renamed from: d, reason: collision with root package name */
    public static final int f36130d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Shape f36131a;

    /* renamed from: b, reason: collision with root package name */
    private final long f36132b;

    /* renamed from: c, reason: collision with root package name */
    private final long f36133c;

    public /* synthetic */ C3468d(Shape shape, long j8, long j9, AbstractC3151p abstractC3151p) {
        this(shape, j8, j9);
    }

    public final long a() {
        return this.f36133c;
    }

    public final long b() {
        return this.f36132b;
    }

    public final Shape c() {
        return this.f36131a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3468d)) {
            return false;
        }
        C3468d c3468d = (C3468d) obj;
        if (AbstractC3159y.d(this.f36131a, c3468d.f36131a) && Color.m2972equalsimpl0(this.f36132b, c3468d.f36132b) && Color.m2972equalsimpl0(this.f36133c, c3468d.f36133c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f36131a.hashCode() * 31) + Color.m2978hashCodeimpl(this.f36132b)) * 31) + Color.m2978hashCodeimpl(this.f36133c);
    }

    public String toString() {
        return "StripeBottomSheetLayoutInfo(sheetShape=" + this.f36131a + ", sheetBackgroundColor=" + Color.m2979toStringimpl(this.f36132b) + ", scrimColor=" + Color.m2979toStringimpl(this.f36133c) + ")";
    }

    private C3468d(Shape sheetShape, long j8, long j9) {
        AbstractC3159y.i(sheetShape, "sheetShape");
        this.f36131a = sheetShape;
        this.f36132b = j8;
        this.f36133c = j9;
    }
}
