package T2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f9957a = new l("Checkbox", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final l f9958b = new l("CheckboxWithPrefilledEmail", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final l f9959c = new l("CheckboxWithPrefilledEmailAndPhone", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final l f9960d = new l("Implied", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final l f9961e = new l("ImpliedWithPrefilledEmail", 4);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ l[] f9962f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ R5.a f9963g;

    static {
        l[] a8 = a();
        f9962f = a8;
        f9963g = R5.b.a(a8);
    }

    private l(String str, int i8) {
    }

    private static final /* synthetic */ l[] a() {
        return new l[]{f9957a, f9958b, f9959c, f9960d, f9961e};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f9962f.clone();
    }
}
