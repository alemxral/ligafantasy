package F3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f2490a = new e("Active", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final e f2491b = new e("Success", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final e f2492c = new e("Failed", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final e f2493d = new e("Canceled", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ e[] f2494e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ R5.a f2495f;

    static {
        e[] a8 = a();
        f2494e = a8;
        f2495f = R5.b.a(a8);
    }

    private e(String str, int i8) {
    }

    private static final /* synthetic */ e[] a() {
        return new e[]{f2490a, f2491b, f2492c, f2493d};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f2494e.clone();
    }
}
