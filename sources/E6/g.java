package E6;

import C6.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final List f2378a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2379b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2380c;

    public g(List vendorBlacklist, List vendorWhitelist, List googleWhitelist) {
        AbstractC3159y.i(vendorBlacklist, "vendorBlacklist");
        AbstractC3159y.i(vendorWhitelist, "vendorWhitelist");
        AbstractC3159y.i(googleWhitelist, "googleWhitelist");
        this.f2378a = vendorBlacklist;
        this.f2379b = vendorWhitelist;
        this.f2380c = googleWhitelist;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3159y.d(this.f2378a, gVar.f2378a) && AbstractC3159y.d(this.f2379b, gVar.f2379b) && AbstractC3159y.d(this.f2380c, gVar.f2380c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f2380c.hashCode() + l.a(this.f2379b, this.f2378a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("PremiumProperties(vendorBlacklist=");
        a8.append(this.f2378a);
        a8.append(", vendorWhitelist=");
        a8.append(this.f2379b);
        a8.append(", googleWhitelist=");
        a8.append(this.f2380c);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ g(List list, List list2, List list3, int i8) {
        this((i8 & 1) != 0 ? new ArrayList() : null, (i8 & 2) != 0 ? new ArrayList() : null, (i8 & 4) != 0 ? new ArrayList() : null);
    }
}
