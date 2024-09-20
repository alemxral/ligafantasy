package J7;

import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f5674a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5675b;

    public m(String disclosureLabel, String backLabel) {
        AbstractC3159y.i(disclosureLabel, "disclosureLabel");
        AbstractC3159y.i(backLabel, "backLabel");
        this.f5674a = disclosureLabel;
        this.f5675b = backLabel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (AbstractC3159y.d(this.f5674a, mVar.f5674a) && AbstractC3159y.d(this.f5675b, mVar.f5675b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5675b.hashCode() + (this.f5674a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("PartnersDisclosureLabels(disclosureLabel=");
        a8.append(this.f5674a);
        a8.append(", backLabel=");
        a8.append(this.f5675b);
        a8.append(')');
        return a8.toString();
    }
}
