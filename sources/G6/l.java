package g6;

import kotlin.jvm.internal.AbstractC3151p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final l f31310c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f31311d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f31312e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f31313f;

    /* renamed from: g, reason: collision with root package name */
    public static final l f31314g;

    /* renamed from: h, reason: collision with root package name */
    public static final l f31315h;

    /* renamed from: i, reason: collision with root package name */
    public static final l f31316i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ l[] f31317j;

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ R5.a f31318k;

    /* renamed from: a, reason: collision with root package name */
    private final int f31319a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31320b;

    static {
        int i8 = 2;
        f31310c = new l("IGNORE_CASE", 0, i8, 0, 2, null);
        int i9 = 2;
        AbstractC3151p abstractC3151p = null;
        int i10 = 0;
        f31311d = new l("MULTILINE", 1, 8, i10, i9, abstractC3151p);
        int i11 = 2;
        AbstractC3151p abstractC3151p2 = null;
        int i12 = 0;
        f31312e = new l("LITERAL", i8, 16, i12, i11, abstractC3151p2);
        f31313f = new l("UNIX_LINES", 3, 1, i10, i9, abstractC3151p);
        f31314g = new l("COMMENTS", 4, 4, i12, i11, abstractC3151p2);
        f31315h = new l("DOT_MATCHES_ALL", 5, 32, i10, i9, abstractC3151p);
        f31316i = new l("CANON_EQ", 6, 128, i12, i11, abstractC3151p2);
        l[] a8 = a();
        f31317j = a8;
        f31318k = R5.b.a(a8);
    }

    private l(String str, int i8, int i9, int i10) {
        this.f31319a = i9;
        this.f31320b = i10;
    }

    private static final /* synthetic */ l[] a() {
        return new l[]{f31310c, f31311d, f31312e, f31313f, f31314g, f31315h, f31316i};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f31317j.clone();
    }

    public int b() {
        return this.f31319a;
    }

    /* synthetic */ l(String str, int i8, int i9, int i10, int i11, AbstractC3151p abstractC3151p) {
        this(str, i8, i9, (i11 & 2) != 0 ? i9 : i10);
    }
}
