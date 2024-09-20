package o4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f36467a = new c("Focused", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final c f36468b = new c("UnfocusedEmpty", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final c f36469c = new c("UnfocusedNotEmpty", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ c[] f36470d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ R5.a f36471e;

    static {
        c[] a8 = a();
        f36470d = a8;
        f36471e = R5.b.a(a8);
    }

    private c(String str, int i8) {
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f36467a, f36468b, f36469c};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f36470d.clone();
    }
}
