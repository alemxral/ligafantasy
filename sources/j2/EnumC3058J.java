package j2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j2.J, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC3058J {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3058J f32944b = new EnumC3058J("WeChatPayV1", 0, "wechat_pay_beta=v1");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC3058J[] f32945c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ R5.a f32946d;

    /* renamed from: a, reason: collision with root package name */
    private final String f32947a;

    static {
        EnumC3058J[] a8 = a();
        f32945c = a8;
        f32946d = R5.b.a(a8);
    }

    private EnumC3058J(String str, int i8, String str2) {
        this.f32947a = str2;
    }

    private static final /* synthetic */ EnumC3058J[] a() {
        return new EnumC3058J[]{f32944b};
    }

    public static EnumC3058J valueOf(String str) {
        return (EnumC3058J) Enum.valueOf(EnumC3058J.class, str);
    }

    public static EnumC3058J[] values() {
        return (EnumC3058J[]) f32945c.clone();
    }

    public final String b() {
        return this.f32947a;
    }
}
