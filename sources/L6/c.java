package L6;

import P6.C1282h;
import com.mbridge.msdk.thrid.okhttp.internal.http2.Header;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final C1282h f6530d = C1282h.f(":");

    /* renamed from: e, reason: collision with root package name */
    public static final C1282h f6531e = C1282h.f(Header.RESPONSE_STATUS_UTF8);

    /* renamed from: f, reason: collision with root package name */
    public static final C1282h f6532f = C1282h.f(Header.TARGET_METHOD_UTF8);

    /* renamed from: g, reason: collision with root package name */
    public static final C1282h f6533g = C1282h.f(Header.TARGET_PATH_UTF8);

    /* renamed from: h, reason: collision with root package name */
    public static final C1282h f6534h = C1282h.f(Header.TARGET_SCHEME_UTF8);

    /* renamed from: i, reason: collision with root package name */
    public static final C1282h f6535i = C1282h.f(Header.TARGET_AUTHORITY_UTF8);

    /* renamed from: a, reason: collision with root package name */
    public final C1282h f6536a;

    /* renamed from: b, reason: collision with root package name */
    public final C1282h f6537b;

    /* renamed from: c, reason: collision with root package name */
    final int f6538c;

    public c(String str, String str2) {
        this(C1282h.f(str), C1282h.f(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f6536a.equals(cVar.f6536a) || !this.f6537b.equals(cVar.f6537b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f6536a.hashCode()) * 31) + this.f6537b.hashCode();
    }

    public String toString() {
        return G6.c.o("%s: %s", this.f6536a.M(), this.f6537b.M());
    }

    public c(C1282h c1282h, String str) {
        this(c1282h, C1282h.f(str));
    }

    public c(C1282h c1282h, C1282h c1282h2) {
        this.f6536a = c1282h;
        this.f6537b = c1282h2;
        this.f6538c = c1282h.F() + 32 + c1282h2.F();
    }
}
