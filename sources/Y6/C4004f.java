package y6;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: y6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4004f {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f39968a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39969b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f39970c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f39971d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f39972e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f39973f;

    /* renamed from: g, reason: collision with root package name */
    private final String f39974g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f39975h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f39976i;

    /* renamed from: j, reason: collision with root package name */
    private final String f39977j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f39978k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f39979l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f39980m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f39981n;

    public C4004f(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, String prettyPrintIndent, boolean z14, boolean z15, String classDiscriminator, boolean z16, boolean z17, s sVar, boolean z18, boolean z19) {
        AbstractC3159y.i(prettyPrintIndent, "prettyPrintIndent");
        AbstractC3159y.i(classDiscriminator, "classDiscriminator");
        this.f39968a = z8;
        this.f39969b = z9;
        this.f39970c = z10;
        this.f39971d = z11;
        this.f39972e = z12;
        this.f39973f = z13;
        this.f39974g = prettyPrintIndent;
        this.f39975h = z14;
        this.f39976i = z15;
        this.f39977j = classDiscriminator;
        this.f39978k = z16;
        this.f39979l = z17;
        this.f39980m = z18;
        this.f39981n = z19;
    }

    public final boolean a() {
        return this.f39978k;
    }

    public final boolean b() {
        return this.f39971d;
    }

    public final boolean c() {
        return this.f39981n;
    }

    public final String d() {
        return this.f39977j;
    }

    public final boolean e() {
        return this.f39975h;
    }

    public final boolean f() {
        return this.f39980m;
    }

    public final boolean g() {
        return this.f39968a;
    }

    public final boolean h() {
        return this.f39973f;
    }

    public final boolean i() {
        return this.f39969b;
    }

    public final s j() {
        return null;
    }

    public final boolean k() {
        return this.f39972e;
    }

    public final String l() {
        return this.f39974g;
    }

    public final boolean m() {
        return this.f39979l;
    }

    public final boolean n() {
        return this.f39976i;
    }

    public final boolean o() {
        return this.f39970c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f39968a + ", ignoreUnknownKeys=" + this.f39969b + ", isLenient=" + this.f39970c + ", allowStructuredMapKeys=" + this.f39971d + ", prettyPrint=" + this.f39972e + ", explicitNulls=" + this.f39973f + ", prettyPrintIndent='" + this.f39974g + "', coerceInputValues=" + this.f39975h + ", useArrayPolymorphism=" + this.f39976i + ", classDiscriminator='" + this.f39977j + "', allowSpecialFloatingPointValues=" + this.f39978k + ", useAlternativeNames=" + this.f39979l + ", namingStrategy=" + ((Object) null) + ", decodeEnumsCaseInsensitive=" + this.f39980m + ", allowTrailingComma=" + this.f39981n + ')';
    }

    public /* synthetic */ C4004f(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, String str, boolean z14, boolean z15, String str2, boolean z16, boolean z17, s sVar, boolean z18, boolean z19, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? false : z9, (i8 & 4) != 0 ? false : z10, (i8 & 8) != 0 ? false : z11, (i8 & 16) != 0 ? false : z12, (i8 & 32) != 0 ? true : z13, (i8 & 64) != 0 ? "    " : str, (i8 & 128) != 0 ? false : z14, (i8 & 256) != 0 ? false : z15, (i8 & 512) != 0 ? "type" : str2, (i8 & 1024) != 0 ? false : z16, (i8 & 2048) == 0 ? z17 : true, (i8 & 4096) != 0 ? null : sVar, (i8 & 8192) != 0 ? false : z18, (i8 & 16384) == 0 ? z19 : false);
    }
}
