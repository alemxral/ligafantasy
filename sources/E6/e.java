package E6;

import M5.AbstractC1246t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public List f2369a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2370b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2371c;

    public e(List nonIabVendorList, String updateAt, String nonIabVendorsHash) {
        AbstractC3159y.i(nonIabVendorList, "nonIabVendorList");
        AbstractC3159y.i(updateAt, "updateAt");
        AbstractC3159y.i(nonIabVendorsHash, "nonIabVendorsHash");
        this.f2369a = nonIabVendorList;
        this.f2370b = updateAt;
        this.f2371c = nonIabVendorsHash;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3159y.d(this.f2369a, eVar.f2369a) && AbstractC3159y.d(this.f2370b, eVar.f2370b) && AbstractC3159y.d(this.f2371c, eVar.f2371c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f2371c.hashCode() + t.a(this.f2370b, this.f2369a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("NonIabVendorsInfo(nonIabVendorList=");
        a8.append(this.f2369a);
        a8.append(", updateAt=");
        a8.append(this.f2370b);
        a8.append(", nonIabVendorsHash=");
        a8.append(this.f2371c);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ e(List list, String str, String str2, int i8) {
        this((i8 & 1) != 0 ? AbstractC1246t.m() : null, (i8 & 2) != 0 ? "" : null, (i8 & 4) != 0 ? "" : null);
    }
}
