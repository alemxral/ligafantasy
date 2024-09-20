package E6;

import B6.l;
import M5.AbstractC1246t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f2362a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2363b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2364c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2365d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2366e;

    /* renamed from: f, reason: collision with root package name */
    public final List f2367f;

    /* renamed from: g, reason: collision with root package name */
    public final List f2368g;

    public d(int i8, String pCode, String name, String description, String privacyPolicyUrl, List nonIabPurposeConsentIds, List nonIabPurposeLegitimateInterestIds) {
        AbstractC3159y.i(pCode, "pCode");
        AbstractC3159y.i(name, "name");
        AbstractC3159y.i(description, "description");
        AbstractC3159y.i(privacyPolicyUrl, "privacyPolicyUrl");
        AbstractC3159y.i(nonIabPurposeConsentIds, "nonIabPurposeConsentIds");
        AbstractC3159y.i(nonIabPurposeLegitimateInterestIds, "nonIabPurposeLegitimateInterestIds");
        this.f2362a = i8;
        this.f2363b = pCode;
        this.f2364c = name;
        this.f2365d = description;
        this.f2366e = privacyPolicyUrl;
        this.f2367f = nonIabPurposeConsentIds;
        this.f2368g = nonIabPurposeLegitimateInterestIds;
    }

    public final l a() {
        return new l(this.f2362a, this.f2364c, this.f2365d, AbstractC1246t.a1(this.f2367f), AbstractC1246t.a1(this.f2368g), null, null, null, null, this.f2366e, null, null, 0, false, false, null, null, null, null, null, 914912);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f2362a == dVar.f2362a && AbstractC3159y.d(this.f2363b, dVar.f2363b) && AbstractC3159y.d(this.f2364c, dVar.f2364c) && AbstractC3159y.d(this.f2365d, dVar.f2365d) && AbstractC3159y.d(this.f2366e, dVar.f2366e) && AbstractC3159y.d(this.f2367f, dVar.f2367f) && AbstractC3159y.d(this.f2368g, dVar.f2368g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f2368g.hashCode() + C6.l.a(this.f2367f, t.a(this.f2366e, t.a(this.f2365d, t.a(this.f2364c, t.a(this.f2363b, this.f2362a * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("NonIABVendor(vendorId=");
        a8.append(this.f2362a);
        a8.append(", pCode=");
        a8.append(this.f2363b);
        a8.append(", name=");
        a8.append(this.f2364c);
        a8.append(", description=");
        a8.append(this.f2365d);
        a8.append(", privacyPolicyUrl=");
        a8.append(this.f2366e);
        a8.append(", nonIabPurposeConsentIds=");
        a8.append(this.f2367f);
        a8.append(", nonIabPurposeLegitimateInterestIds=");
        a8.append(this.f2368g);
        a8.append(')');
        return a8.toString();
    }
}
