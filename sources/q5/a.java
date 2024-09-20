package Q5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8311a = new a("COROUTINE_SUSPENDED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final a f8312b = new a("UNDECIDED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final a f8313c = new a("RESUMED", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f8314d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ R5.a f8315e;

    static {
        a[] a8 = a();
        f8314d = a8;
        f8315e = R5.b.a(a8);
    }

    private a(String str, int i8) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f8311a, f8312b, f8313c};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f8314d.clone();
    }
}
