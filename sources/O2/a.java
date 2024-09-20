package O2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7747a = new a("Verified", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final a f7748b = new a("NeedsVerification", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final a f7749c = new a("VerificationStarted", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final a f7750d = new a("SignedOut", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final a f7751e = new a("Error", 4);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ a[] f7752f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ R5.a f7753g;

    static {
        a[] a8 = a();
        f7752f = a8;
        f7753g = R5.b.a(a8);
    }

    private a(String str, int i8) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f7747a, f7748b, f7749c, f7750d, f7751e};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f7752f.clone();
    }
}
