package y5;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public Long f39874a;

    /* renamed from: b, reason: collision with root package name */
    public Map f39875b;

    public g(Long l8, Map cmpInfoMap) {
        AbstractC3159y.i(cmpInfoMap, "cmpInfoMap");
        this.f39874a = l8;
        this.f39875b = cmpInfoMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3159y.d(this.f39874a, gVar.f39874a) && AbstractC3159y.d(this.f39875b, gVar.f39875b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Long l8 = this.f39874a;
        if (l8 == null) {
            hashCode = 0;
        } else {
            hashCode = l8.hashCode();
        }
        return this.f39875b.hashCode() + (hashCode * 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("IabApprovedCmpList(lastUpdated=");
        a8.append(this.f39874a);
        a8.append(", cmpInfoMap=");
        a8.append(this.f39875b);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ g(Long l8, Map map, int i8) {
        this(null, (i8 & 2) != 0 ? new LinkedHashMap() : null);
    }
}
