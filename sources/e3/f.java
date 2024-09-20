package E3;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f1984a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f1985b;

    /* renamed from: c, reason: collision with root package name */
    private final g f1986c;

    public f(String lastFour, boolean z8, g cvcState) {
        AbstractC3159y.i(lastFour, "lastFour");
        AbstractC3159y.i(cvcState, "cvcState");
        this.f1984a = lastFour;
        this.f1985b = z8;
        this.f1986c = cvcState;
    }

    public static /* synthetic */ f b(f fVar, String str, boolean z8, g gVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = fVar.f1984a;
        }
        if ((i8 & 2) != 0) {
            z8 = fVar.f1985b;
        }
        if ((i8 & 4) != 0) {
            gVar = fVar.f1986c;
        }
        return fVar.a(str, z8, gVar);
    }

    public final f a(String lastFour, boolean z8, g cvcState) {
        AbstractC3159y.i(lastFour, "lastFour");
        AbstractC3159y.i(cvcState, "cvcState");
        return new f(lastFour, z8, cvcState);
    }

    public final g c() {
        return this.f1986c;
    }

    public final String d() {
        return this.f1984a;
    }

    public final boolean e() {
        return this.f1985b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3159y.d(this.f1984a, fVar.f1984a) && this.f1985b == fVar.f1985b && AbstractC3159y.d(this.f1986c, fVar.f1986c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f1984a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f1985b)) * 31) + this.f1986c.hashCode();
    }

    public String toString() {
        return "CvcRecollectionViewState(lastFour=" + this.f1984a + ", isTestMode=" + this.f1985b + ", cvcState=" + this.f1986c + ")";
    }
}
