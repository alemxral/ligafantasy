package R;

/* renamed from: R.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1312i {

    /* renamed from: a, reason: collision with root package name */
    private final String f8560a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8561b;

    public C1312i(String str) {
        this(str, null);
    }

    public C1312i(String str, String str2) {
        AbstractC1319p.m(str, "log tag cannot be null");
        AbstractC1319p.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f8560a = str;
        this.f8561b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
