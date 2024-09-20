package M5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f7040a = new f0("Ready", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f7041b = new f0("NotReady", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f7042c = new f0("Done", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f7043d = new f0("Failed", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ f0[] f7044e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ R5.a f7045f;

    static {
        f0[] a8 = a();
        f7044e = a8;
        f7045f = R5.b.a(a8);
    }

    private f0(String str, int i8) {
    }

    private static final /* synthetic */ f0[] a() {
        return new f0[]{f7040a, f7041b, f7042c, f7043d};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f7044e.clone();
    }
}
