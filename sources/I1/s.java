package i1;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final String f31518a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31519b;

    /* renamed from: c, reason: collision with root package name */
    private final int f31520c;

    /* renamed from: d, reason: collision with root package name */
    private long f31521d;

    /* renamed from: e, reason: collision with root package name */
    private C2771e f31522e;

    /* renamed from: f, reason: collision with root package name */
    private String f31523f;

    public s(String sessionId, String firstSessionId, int i8, long j8, C2771e dataCollectionStatus, String firebaseInstallationId) {
        AbstractC3159y.i(sessionId, "sessionId");
        AbstractC3159y.i(firstSessionId, "firstSessionId");
        AbstractC3159y.i(dataCollectionStatus, "dataCollectionStatus");
        AbstractC3159y.i(firebaseInstallationId, "firebaseInstallationId");
        this.f31518a = sessionId;
        this.f31519b = firstSessionId;
        this.f31520c = i8;
        this.f31521d = j8;
        this.f31522e = dataCollectionStatus;
        this.f31523f = firebaseInstallationId;
    }

    public final C2771e a() {
        return this.f31522e;
    }

    public final long b() {
        return this.f31521d;
    }

    public final String c() {
        return this.f31523f;
    }

    public final String d() {
        return this.f31519b;
    }

    public final String e() {
        return this.f31518a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (AbstractC3159y.d(this.f31518a, sVar.f31518a) && AbstractC3159y.d(this.f31519b, sVar.f31519b) && this.f31520c == sVar.f31520c && this.f31521d == sVar.f31521d && AbstractC3159y.d(this.f31522e, sVar.f31522e) && AbstractC3159y.d(this.f31523f, sVar.f31523f)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f31520c;
    }

    public final void g(String str) {
        AbstractC3159y.i(str, "<set-?>");
        this.f31523f = str;
    }

    public int hashCode() {
        return (((((((((this.f31518a.hashCode() * 31) + this.f31519b.hashCode()) * 31) + this.f31520c) * 31) + androidx.collection.a.a(this.f31521d)) * 31) + this.f31522e.hashCode()) * 31) + this.f31523f.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f31518a + ", firstSessionId=" + this.f31519b + ", sessionIndex=" + this.f31520c + ", eventTimestampUs=" + this.f31521d + ", dataCollectionStatus=" + this.f31522e + ", firebaseInstallationId=" + this.f31523f + ')';
    }

    public /* synthetic */ s(String str, String str2, int i8, long j8, C2771e c2771e, String str3, int i9, AbstractC3151p abstractC3151p) {
        this(str, str2, i8, j8, (i9 & 16) != 0 ? new C2771e(null, null, 0.0d, 7, null) : c2771e, (i9 & 32) != 0 ? "" : str3);
    }
}
