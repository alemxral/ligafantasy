package e4;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: e4.r0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C2631r0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f30798a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30799b;

    /* renamed from: c, reason: collision with root package name */
    private final int f30800c;

    public C2631r0(String url, int i8, int i9) {
        AbstractC3159y.i(url, "url");
        this.f30798a = url;
        this.f30799b = i8;
        this.f30800c = i9;
    }

    public final int a() {
        return this.f30800c;
    }

    public final int b() {
        return this.f30799b;
    }

    public final String c() {
        return this.f30798a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2631r0)) {
            return false;
        }
        C2631r0 c2631r0 = (C2631r0) obj;
        if (AbstractC3159y.d(this.f30798a, c2631r0.f30798a) && this.f30799b == c2631r0.f30799b && this.f30800c == c2631r0.f30800c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f30798a.hashCode() * 31) + this.f30799b) * 31) + this.f30800c;
    }

    public String toString() {
        return "LinkAnnotation(url=" + this.f30798a + ", start=" + this.f30799b + ", end=" + this.f30800c + ")";
    }
}
