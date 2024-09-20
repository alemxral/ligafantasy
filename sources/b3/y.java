package b3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static final y f14583b = new y("Passthrough", 0, "passthrough");

    /* renamed from: c, reason: collision with root package name */
    public static final y f14584c = new y("PaymentMethod", 1, "payment_method_mode");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ y[] f14585d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ R5.a f14586e;

    /* renamed from: a, reason: collision with root package name */
    private final String f14587a;

    static {
        y[] a8 = a();
        f14585d = a8;
        f14586e = R5.b.a(a8);
    }

    private y(String str, int i8, String str2) {
        this.f14587a = str2;
    }

    private static final /* synthetic */ y[] a() {
        return new y[]{f14583b, f14584c};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f14585d.clone();
    }

    public final String b() {
        return this.f14587a;
    }
}
