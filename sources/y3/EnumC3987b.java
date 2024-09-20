package y3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: y3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC3987b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC3987b f39732a = new EnumC3987b("Buy", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3987b f39733b = new EnumC3987b("Book", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3987b f39734c = new EnumC3987b("Checkout", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC3987b f39735d = new EnumC3987b("Donate", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC3987b f39736e = new EnumC3987b("Order", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC3987b f39737f = new EnumC3987b("Pay", 5);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC3987b f39738g = new EnumC3987b("Subscribe", 6);

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC3987b f39739h = new EnumC3987b("Plain", 7);

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumC3987b[] f39740i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ R5.a f39741j;

    static {
        EnumC3987b[] a8 = a();
        f39740i = a8;
        f39741j = R5.b.a(a8);
    }

    private EnumC3987b(String str, int i8) {
    }

    private static final /* synthetic */ EnumC3987b[] a() {
        return new EnumC3987b[]{f39732a, f39733b, f39734c, f39735d, f39736e, f39737f, f39738g, f39739h};
    }

    public static EnumC3987b valueOf(String str) {
        return (EnumC3987b) Enum.valueOf(EnumC3987b.class, str);
    }

    public static EnumC3987b[] values() {
        return (EnumC3987b[]) f39740i.clone();
    }
}
