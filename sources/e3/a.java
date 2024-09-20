package E3;

import b3.EnumC1870e;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f1969a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC1870e f1970b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1971c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1972d;

    public a(String lastFour, EnumC1870e cardBrand, String str, boolean z8) {
        AbstractC3159y.i(lastFour, "lastFour");
        AbstractC3159y.i(cardBrand, "cardBrand");
        this.f1969a = lastFour;
        this.f1970b = cardBrand;
        this.f1971c = str;
        this.f1972d = z8;
    }

    public final EnumC1870e a() {
        return this.f1970b;
    }

    public final String b() {
        return this.f1971c;
    }

    public final String c() {
        return this.f1969a;
    }

    public final boolean d() {
        return this.f1972d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3159y.d(this.f1969a, aVar.f1969a) && this.f1970b == aVar.f1970b && AbstractC3159y.d(this.f1971c, aVar.f1971c) && this.f1972d == aVar.f1972d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f1969a.hashCode() * 31) + this.f1970b.hashCode()) * 31;
        String str = this.f1971c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + androidx.compose.foundation.a.a(this.f1972d);
    }

    public String toString() {
        return "Args(lastFour=" + this.f1969a + ", cardBrand=" + this.f1970b + ", cvc=" + this.f1971c + ", isTestMode=" + this.f1972d + ")";
    }

    public /* synthetic */ a(String str, EnumC1870e enumC1870e, String str2, boolean z8, int i8, AbstractC3151p abstractC3151p) {
        this(str, enumC1870e, (i8 & 4) != 0 ? null : str2, z8);
    }
}
