package i1;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final String f31502a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31503b;

    /* renamed from: c, reason: collision with root package name */
    private final int f31504c;

    /* renamed from: d, reason: collision with root package name */
    private final long f31505d;

    public o(String sessionId, String firstSessionId, int i8, long j8) {
        AbstractC3159y.i(sessionId, "sessionId");
        AbstractC3159y.i(firstSessionId, "firstSessionId");
        this.f31502a = sessionId;
        this.f31503b = firstSessionId;
        this.f31504c = i8;
        this.f31505d = j8;
    }

    public final String a() {
        return this.f31503b;
    }

    public final String b() {
        return this.f31502a;
    }

    public final int c() {
        return this.f31504c;
    }

    public final long d() {
        return this.f31505d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (AbstractC3159y.d(this.f31502a, oVar.f31502a) && AbstractC3159y.d(this.f31503b, oVar.f31503b) && this.f31504c == oVar.f31504c && this.f31505d == oVar.f31505d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f31502a.hashCode() * 31) + this.f31503b.hashCode()) * 31) + this.f31504c) * 31) + androidx.collection.a.a(this.f31505d);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.f31502a + ", firstSessionId=" + this.f31503b + ", sessionIndex=" + this.f31504c + ", sessionStartTimestampUs=" + this.f31505d + ')';
    }
}
