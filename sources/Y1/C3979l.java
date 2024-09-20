package y1;

/* renamed from: y1.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3979l {

    /* renamed from: a, reason: collision with root package name */
    private final String f39711a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39712b;

    private C3979l(String str, String str2) {
        this.f39711a = str;
        this.f39712b = str2;
    }

    public static C3979l a(String str, String str2) {
        E1.g.d(str, "Name is null or empty");
        E1.g.d(str2, "Version is null or empty");
        return new C3979l(str, str2);
    }

    public String b() {
        return this.f39711a;
    }

    public String c() {
        return this.f39712b;
    }
}
