package i1;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final i f31506a;

    /* renamed from: b, reason: collision with root package name */
    private final s f31507b;

    /* renamed from: c, reason: collision with root package name */
    private final C2768b f31508c;

    public p(i eventType, s sessionData, C2768b applicationInfo) {
        AbstractC3159y.i(eventType, "eventType");
        AbstractC3159y.i(sessionData, "sessionData");
        AbstractC3159y.i(applicationInfo, "applicationInfo");
        this.f31506a = eventType;
        this.f31507b = sessionData;
        this.f31508c = applicationInfo;
    }

    public final C2768b a() {
        return this.f31508c;
    }

    public final i b() {
        return this.f31506a;
    }

    public final s c() {
        return this.f31507b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f31506a == pVar.f31506a && AbstractC3159y.d(this.f31507b, pVar.f31507b) && AbstractC3159y.d(this.f31508c, pVar.f31508c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f31506a.hashCode() * 31) + this.f31507b.hashCode()) * 31) + this.f31508c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f31506a + ", sessionData=" + this.f31507b + ", applicationInfo=" + this.f31508c + ')';
    }
}
