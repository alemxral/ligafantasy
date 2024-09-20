package b3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class L {

    /* renamed from: b, reason: collision with root package name */
    public static final L f14365b = new L("Automatic", 0, "automatic");

    /* renamed from: c, reason: collision with root package name */
    public static final L f14366c = new L("Skip", 1, "skip");

    /* renamed from: d, reason: collision with root package name */
    public static final L f14367d = new L("Microdeposits", 2, "microdeposits");

    /* renamed from: e, reason: collision with root package name */
    public static final L f14368e = new L("Instant", 3, "instant");

    /* renamed from: f, reason: collision with root package name */
    public static final L f14369f = new L("InstantOrSkip", 4, "instant_or_skip");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ L[] f14370g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ R5.a f14371h;

    /* renamed from: a, reason: collision with root package name */
    private final String f14372a;

    static {
        L[] a8 = a();
        f14370g = a8;
        f14371h = R5.b.a(a8);
    }

    private L(String str, int i8, String str2) {
        this.f14372a = str2;
    }

    private static final /* synthetic */ L[] a() {
        return new L[]{f14365b, f14366c, f14367d, f14368e, f14369f};
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) f14370g.clone();
    }

    public final String b() {
        return this.f14372a;
    }
}
