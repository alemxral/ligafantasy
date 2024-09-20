package q3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC3653f {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3653f f37309b = new EnumC3653f("Client", 0, "client");

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3653f f37310c = new EnumC3653f("Server", 1, "server");

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC3653f f37311d = new EnumC3653f("None", 2, "none");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC3653f[] f37312e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ R5.a f37313f;

    /* renamed from: a, reason: collision with root package name */
    private final String f37314a;

    static {
        EnumC3653f[] a8 = a();
        f37312e = a8;
        f37313f = R5.b.a(a8);
    }

    private EnumC3653f(String str, int i8, String str2) {
        this.f37314a = str2;
    }

    private static final /* synthetic */ EnumC3653f[] a() {
        return new EnumC3653f[]{f37309b, f37310c, f37311d};
    }

    public static EnumC3653f valueOf(String str) {
        return (EnumC3653f) Enum.valueOf(EnumC3653f.class, str);
    }

    public static EnumC3653f[] values() {
        return (EnumC3653f[]) f37312e.clone();
    }

    public final String b() {
        return this.f37314a;
    }
}
