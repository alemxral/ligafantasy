package z6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class U {

    /* renamed from: c, reason: collision with root package name */
    public static final U f40520c = new U("OBJ", 0, '{', '}');

    /* renamed from: d, reason: collision with root package name */
    public static final U f40521d = new U("LIST", 1, '[', ']');

    /* renamed from: e, reason: collision with root package name */
    public static final U f40522e = new U("MAP", 2, '{', '}');

    /* renamed from: f, reason: collision with root package name */
    public static final U f40523f = new U("POLY_OBJ", 3, '[', ']');

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ U[] f40524g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ R5.a f40525h;

    /* renamed from: a, reason: collision with root package name */
    public final char f40526a;

    /* renamed from: b, reason: collision with root package name */
    public final char f40527b;

    static {
        U[] a8 = a();
        f40524g = a8;
        f40525h = R5.b.a(a8);
    }

    private U(String str, int i8, char c8, char c9) {
        this.f40526a = c8;
        this.f40527b = c9;
    }

    private static final /* synthetic */ U[] a() {
        return new U[]{f40520c, f40521d, f40522e, f40523f};
    }

    public static R5.a b() {
        return f40525h;
    }

    public static U valueOf(String str) {
        return (U) Enum.valueOf(U.class, str);
    }

    public static U[] values() {
        return (U[]) f40524g.clone();
    }
}
