package l3;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: l3.r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3188r {

    /* renamed from: a, reason: collision with root package name */
    private final String f33935a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33936b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f33937c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f33938d;

    /* renamed from: e, reason: collision with root package name */
    private final String f33939e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f33940f;

    public C3188r(String authUrl, String str, boolean z8, boolean z9, String str2, boolean z10) {
        AbstractC3159y.i(authUrl, "authUrl");
        this.f33935a = authUrl;
        this.f33936b = str;
        this.f33937c = z8;
        this.f33938d = z9;
        this.f33939e = str2;
        this.f33940f = z10;
    }

    public final String a() {
        return this.f33935a;
    }

    public final boolean b() {
        return this.f33940f;
    }

    public final String c() {
        return this.f33939e;
    }

    public final String d() {
        return this.f33936b;
    }

    public final boolean e() {
        return this.f33938d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3188r)) {
            return false;
        }
        C3188r c3188r = (C3188r) obj;
        if (AbstractC3159y.d(this.f33935a, c3188r.f33935a) && AbstractC3159y.d(this.f33936b, c3188r.f33936b) && this.f33937c == c3188r.f33937c && this.f33938d == c3188r.f33938d && AbstractC3159y.d(this.f33939e, c3188r.f33939e) && this.f33940f == c3188r.f33940f) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f33937c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f33935a.hashCode() * 31;
        String str = this.f33936b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int a8 = (((((hashCode2 + hashCode) * 31) + androidx.compose.foundation.a.a(this.f33937c)) * 31) + androidx.compose.foundation.a.a(this.f33938d)) * 31;
        String str2 = this.f33939e;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return ((a8 + i8) * 31) + androidx.compose.foundation.a.a(this.f33940f);
    }

    public String toString() {
        return "WebAuthParams(authUrl=" + this.f33935a + ", returnUrl=" + this.f33936b + ", shouldCancelSource=" + this.f33937c + ", shouldCancelIntentOnUserNavigation=" + this.f33938d + ", referrer=" + this.f33939e + ", forceInAppWebView=" + this.f33940f + ")";
    }

    public /* synthetic */ C3188r(String str, String str2, boolean z8, boolean z9, String str3, boolean z10, int i8, AbstractC3151p abstractC3151p) {
        this(str, str2, (i8 & 4) != 0 ? false : z8, (i8 & 8) != 0 ? true : z9, (i8 & 16) != 0 ? null : str3, (i8 & 32) != 0 ? false : z10);
    }
}
