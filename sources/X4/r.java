package X4;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private String f12692a;

    /* renamed from: b, reason: collision with root package name */
    private String f12693b;

    /* renamed from: c, reason: collision with root package name */
    private long f12694c;

    /* renamed from: d, reason: collision with root package name */
    private String f12695d;

    public final String a() {
        return this.f12695d;
    }

    public final String b() {
        return this.f12692a;
    }

    public final String c() {
        String str = this.f12695d;
        if (str == null) {
            return null;
        }
        AbstractC3159y.f(str);
        String str2 = this.f12695d;
        AbstractC3159y.f(str2);
        String substring = str.substring(g6.n.X(str2, "/", 0, false, 6, null) + 1);
        AbstractC3159y.h(substring, "substring(...)");
        return substring;
    }

    public final String d() {
        return this.f12693b;
    }

    public final long e() {
        return this.f12694c;
    }

    public final void f(String str) {
        this.f12695d = str;
    }

    public final void g(String str) {
        this.f12692a = str;
    }

    public final void h(String str) {
        this.f12693b = str;
    }

    public final void i(long j8) {
        this.f12694c = j8;
    }

    public String toString() {
        return "FileInfo{md5='" + this.f12692a + "', sha256='" + this.f12693b + "', size=" + this.f12694c + ", absolutePath='" + this.f12695d + "'}";
    }
}
