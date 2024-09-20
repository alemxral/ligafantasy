package V3;

import M5.AbstractC1246t;
import M5.a0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final a f11891e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set f11892f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f11893g;

    /* renamed from: h, reason: collision with root package name */
    public static final e f11894h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f11895i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f11896j;

    /* renamed from: k, reason: collision with root package name */
    public static final e f11897k;

    /* renamed from: l, reason: collision with root package name */
    public static final e f11898l;

    /* renamed from: m, reason: collision with root package name */
    public static final e f11899m;

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ e[] f11900n;

    /* renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ R5.a f11901o;

    /* renamed from: a, reason: collision with root package name */
    private final List f11902a;

    /* renamed from: b, reason: collision with root package name */
    private final V3.a f11903b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11904c;

    /* renamed from: d, reason: collision with root package name */
    private final R1.h f11905d;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        List e8 = AbstractC1246t.e("F055545342");
        V3.a aVar = V3.a.f11879c;
        f11893g = new e("TestRsa", 0, e8, aVar, "ds-test-rsa.txt", null, 8, null);
        int i8 = 8;
        AbstractC3151p abstractC3151p = null;
        R1.h hVar = null;
        f11894h = new e("TestEc", 1, AbstractC1246t.e("F155545342"), V3.a.f11878b, "ds-test-ec.txt", hVar, i8, abstractC3151p);
        f11895i = new e("Visa", 2, AbstractC1246t.e("A000000003"), aVar, "ds-visa.crt", hVar, i8, abstractC3151p);
        f11896j = new e("Mastercard", 3, AbstractC1246t.e("A000000004"), aVar, "ds-mastercard.crt", hVar, i8, abstractC3151p);
        f11897k = new e("Amex", 4, AbstractC1246t.e("A000000025"), aVar, "ds-amex.pem", hVar, i8, abstractC3151p);
        f11898l = new e("Discover", 5, AbstractC1246t.p("A000000152", "A000000324"), aVar, "ds-discover.cer", null);
        f11899m = new e("CartesBancaires", 6, AbstractC1246t.e("A000000042"), aVar, "ds-cartesbancaires.pem", hVar, i8, abstractC3151p);
        e[] a8 = a();
        f11900n = a8;
        f11901o = R5.b.a(a8);
        f11891e = new a(null);
        f11892f = a0.i(".crt", ".cer", ".pem");
    }

    private e(String str, int i8, List list, V3.a aVar, String str2, R1.h hVar) {
        this.f11902a = list;
        this.f11903b = aVar;
        this.f11904c = str2;
        this.f11905d = hVar;
    }

    private static final /* synthetic */ e[] a() {
        return new e[]{f11893g, f11894h, f11895i, f11896j, f11897k, f11898l, f11899m};
    }

    public static R5.a b() {
        return f11901o;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f11900n.clone();
    }

    public final List c() {
        return this.f11902a;
    }

    public final R1.h d() {
        return this.f11905d;
    }

    /* synthetic */ e(String str, int i8, List list, V3.a aVar, String str2, R1.h hVar, int i9, AbstractC3151p abstractC3151p) {
        this(str, i8, list, aVar, str2, (i9 & 8) != 0 ? R1.h.f8677b : hVar);
    }
}
