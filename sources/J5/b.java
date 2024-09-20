package J5;

import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f5489a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5490b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5491c;

    public b(String country, String region, String city) {
        AbstractC3159y.i(country, "country");
        AbstractC3159y.i(region, "region");
        AbstractC3159y.i(city, "city");
        this.f5489a = country;
        this.f5490b = region;
        this.f5491c = city;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3159y.d(this.f5489a, bVar.f5489a) && AbstractC3159y.d(this.f5490b, bVar.f5490b) && AbstractC3159y.d(this.f5491c, bVar.f5491c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5491c.hashCode() + t.a(this.f5490b, this.f5489a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("GeoIP(country=");
        a8.append(this.f5489a);
        a8.append(", region=");
        a8.append(this.f5490b);
        a8.append(", city=");
        a8.append(this.f5491c);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ b(String str, String str2, String str3, int i8) {
        this((i8 & 1) != 0 ? "" : null, (i8 & 2) != 0 ? "" : null, (i8 & 4) == 0 ? null : "");
    }
}
