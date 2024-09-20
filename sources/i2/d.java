package I2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f3897b = new d("Production", 0, 1);

    /* renamed from: c, reason: collision with root package name */
    public static final d f3898c = new d("Test", 1, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ d[] f3899d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ R5.a f3900e;

    /* renamed from: a, reason: collision with root package name */
    private final int f3901a;

    static {
        d[] a8 = a();
        f3899d = a8;
        f3900e = R5.b.a(a8);
    }

    private d(String str, int i8, int i9) {
        this.f3901a = i9;
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f3897b, f3898c};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f3899d.clone();
    }

    public final int b() {
        return this.f3901a;
    }
}
