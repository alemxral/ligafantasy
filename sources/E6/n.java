package e6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f30902a = new n("PUBLIC", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final n f30903b = new n("PROTECTED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final n f30904c = new n("INTERNAL", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final n f30905d = new n("PRIVATE", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ n[] f30906e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ R5.a f30907f;

    static {
        n[] a8 = a();
        f30906e = a8;
        f30907f = R5.b.a(a8);
    }

    private n(String str, int i8) {
    }

    private static final /* synthetic */ n[] a() {
        return new n[]{f30902a, f30903b, f30904c, f30905d};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f30906e.clone();
    }
}
