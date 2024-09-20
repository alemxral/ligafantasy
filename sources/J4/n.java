package j4;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final int f33249a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33250b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33251c;

    /* renamed from: d, reason: collision with root package name */
    private final float f33252d;

    /* renamed from: e, reason: collision with root package name */
    private final long f33253e;

    /* renamed from: f, reason: collision with root package name */
    private final long f33254f;

    /* renamed from: g, reason: collision with root package name */
    private final long f33255g;

    /* renamed from: h, reason: collision with root package name */
    private final long f33256h;

    /* renamed from: i, reason: collision with root package name */
    private final long f33257i;

    /* renamed from: j, reason: collision with root package name */
    private final long f33258j;

    /* renamed from: k, reason: collision with root package name */
    private final Integer f33259k;

    /* renamed from: l, reason: collision with root package name */
    private final FontFamily f33260l;

    /* renamed from: m, reason: collision with root package name */
    private final FontFamily f33261m;

    /* renamed from: n, reason: collision with root package name */
    private final FontFamily f33262n;

    /* renamed from: o, reason: collision with root package name */
    private final FontFamily f33263o;

    /* renamed from: p, reason: collision with root package name */
    private final FontFamily f33264p;

    /* renamed from: q, reason: collision with root package name */
    private final FontFamily f33265q;

    /* renamed from: r, reason: collision with root package name */
    private final FontFamily f33266r;

    public /* synthetic */ n(int i8, int i9, int i10, float f8, long j8, long j9, long j10, long j11, long j12, long j13, Integer num, FontFamily fontFamily, FontFamily fontFamily2, FontFamily fontFamily3, FontFamily fontFamily4, FontFamily fontFamily5, FontFamily fontFamily6, FontFamily fontFamily7, AbstractC3151p abstractC3151p) {
        this(i8, i9, i10, f8, j8, j9, j10, j11, j12, j13, num, fontFamily, fontFamily2, fontFamily3, fontFamily4, fontFamily5, fontFamily6, fontFamily7);
    }

    public final n a(int i8, int i9, int i10, float f8, long j8, long j9, long j10, long j11, long j12, long j13, Integer num, FontFamily fontFamily, FontFamily fontFamily2, FontFamily fontFamily3, FontFamily fontFamily4, FontFamily fontFamily5, FontFamily fontFamily6, FontFamily fontFamily7) {
        return new n(i8, i9, i10, f8, j8, j9, j10, j11, j12, j13, num, fontFamily, fontFamily2, fontFamily3, fontFamily4, fontFamily5, fontFamily6, fontFamily7, null);
    }

    public final FontFamily c() {
        return this.f33260l;
    }

    public final FontFamily d() {
        return this.f33261m;
    }

    public final FontFamily e() {
        return this.f33266r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f33249a == nVar.f33249a && this.f33250b == nVar.f33250b && this.f33251c == nVar.f33251c && Float.compare(this.f33252d, nVar.f33252d) == 0 && TextUnit.m5362equalsimpl0(this.f33253e, nVar.f33253e) && TextUnit.m5362equalsimpl0(this.f33254f, nVar.f33254f) && TextUnit.m5362equalsimpl0(this.f33255g, nVar.f33255g) && TextUnit.m5362equalsimpl0(this.f33256h, nVar.f33256h) && TextUnit.m5362equalsimpl0(this.f33257i, nVar.f33257i) && TextUnit.m5362equalsimpl0(this.f33258j, nVar.f33258j) && AbstractC3159y.d(this.f33259k, nVar.f33259k) && AbstractC3159y.d(this.f33260l, nVar.f33260l) && AbstractC3159y.d(this.f33261m, nVar.f33261m) && AbstractC3159y.d(this.f33262n, nVar.f33262n) && AbstractC3159y.d(this.f33263o, nVar.f33263o) && AbstractC3159y.d(this.f33264p, nVar.f33264p) && AbstractC3159y.d(this.f33265q, nVar.f33265q) && AbstractC3159y.d(this.f33266r, nVar.f33266r)) {
            return true;
        }
        return false;
    }

    public final Integer f() {
        return this.f33259k;
    }

    public final float g() {
        return this.f33252d;
    }

    public final int h() {
        return this.f33251c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int floatToIntBits = ((((((((((((((((((this.f33249a * 31) + this.f33250b) * 31) + this.f33251c) * 31) + Float.floatToIntBits(this.f33252d)) * 31) + TextUnit.m5366hashCodeimpl(this.f33253e)) * 31) + TextUnit.m5366hashCodeimpl(this.f33254f)) * 31) + TextUnit.m5366hashCodeimpl(this.f33255g)) * 31) + TextUnit.m5366hashCodeimpl(this.f33256h)) * 31) + TextUnit.m5366hashCodeimpl(this.f33257i)) * 31) + TextUnit.m5366hashCodeimpl(this.f33258j)) * 31;
        Integer num = this.f33259k;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i9 = (floatToIntBits + hashCode) * 31;
        FontFamily fontFamily = this.f33260l;
        if (fontFamily == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = fontFamily.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        FontFamily fontFamily2 = this.f33261m;
        if (fontFamily2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = fontFamily2.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        FontFamily fontFamily3 = this.f33262n;
        if (fontFamily3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = fontFamily3.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        FontFamily fontFamily4 = this.f33263o;
        if (fontFamily4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = fontFamily4.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        FontFamily fontFamily5 = this.f33264p;
        if (fontFamily5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = fontFamily5.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        FontFamily fontFamily6 = this.f33265q;
        if (fontFamily6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = fontFamily6.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        FontFamily fontFamily7 = this.f33266r;
        if (fontFamily7 != null) {
            i8 = fontFamily7.hashCode();
        }
        return i15 + i8;
    }

    public final int i() {
        return this.f33250b;
    }

    public final int j() {
        return this.f33249a;
    }

    public final FontFamily k() {
        return this.f33262n;
    }

    public final FontFamily l() {
        return this.f33263o;
    }

    public final FontFamily m() {
        return this.f33264p;
    }

    public final long n() {
        return this.f33257i;
    }

    public final long o() {
        return this.f33256h;
    }

    public final long p() {
        return this.f33255g;
    }

    public final FontFamily q() {
        return this.f33265q;
    }

    public final long r() {
        return this.f33258j;
    }

    public final long s() {
        return this.f33254f;
    }

    public final long t() {
        return this.f33253e;
    }

    public String toString() {
        return "StripeTypography(fontWeightNormal=" + this.f33249a + ", fontWeightMedium=" + this.f33250b + ", fontWeightBold=" + this.f33251c + ", fontSizeMultiplier=" + this.f33252d + ", xxSmallFontSize=" + TextUnit.m5372toStringimpl(this.f33253e) + ", xSmallFontSize=" + TextUnit.m5372toStringimpl(this.f33254f) + ", smallFontSize=" + TextUnit.m5372toStringimpl(this.f33255g) + ", mediumFontSize=" + TextUnit.m5372toStringimpl(this.f33256h) + ", largeFontSize=" + TextUnit.m5372toStringimpl(this.f33257i) + ", xLargeFontSize=" + TextUnit.m5372toStringimpl(this.f33258j) + ", fontFamily=" + this.f33259k + ", body1FontFamily=" + this.f33260l + ", body2FontFamily=" + this.f33261m + ", h4FontFamily=" + this.f33262n + ", h5FontFamily=" + this.f33263o + ", h6FontFamily=" + this.f33264p + ", subtitle1FontFamily=" + this.f33265q + ", captionFontFamily=" + this.f33266r + ")";
    }

    private n(int i8, int i9, int i10, float f8, long j8, long j9, long j10, long j11, long j12, long j13, Integer num, FontFamily fontFamily, FontFamily fontFamily2, FontFamily fontFamily3, FontFamily fontFamily4, FontFamily fontFamily5, FontFamily fontFamily6, FontFamily fontFamily7) {
        this.f33249a = i8;
        this.f33250b = i9;
        this.f33251c = i10;
        this.f33252d = f8;
        this.f33253e = j8;
        this.f33254f = j9;
        this.f33255g = j10;
        this.f33256h = j11;
        this.f33257i = j12;
        this.f33258j = j13;
        this.f33259k = num;
        this.f33260l = fontFamily;
        this.f33261m = fontFamily2;
        this.f33262n = fontFamily3;
        this.f33263o = fontFamily4;
        this.f33264p = fontFamily5;
        this.f33265q = fontFamily6;
        this.f33266r = fontFamily7;
    }

    public /* synthetic */ n(int i8, int i9, int i10, float f8, long j8, long j9, long j10, long j11, long j12, long j13, Integer num, FontFamily fontFamily, FontFamily fontFamily2, FontFamily fontFamily3, FontFamily fontFamily4, FontFamily fontFamily5, FontFamily fontFamily6, FontFamily fontFamily7, int i11, AbstractC3151p abstractC3151p) {
        this(i8, i9, i10, f8, j8, j9, j10, j11, j12, j13, num, (i11 & 2048) != 0 ? null : fontFamily, (i11 & 4096) != 0 ? null : fontFamily2, (i11 & 8192) != 0 ? null : fontFamily3, (i11 & 16384) != 0 ? null : fontFamily4, (32768 & i11) != 0 ? null : fontFamily5, (65536 & i11) != 0 ? null : fontFamily6, (i11 & 131072) != 0 ? null : fontFamily7, null);
    }
}
