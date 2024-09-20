package J7;

import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public e f5697a;

    /* renamed from: b, reason: collision with root package name */
    public n f5698b;

    /* renamed from: c, reason: collision with root package name */
    public i f5699c;

    public r(e coreUiLabels, n premiumUiLabels, i mobileUiLabels) {
        AbstractC3159y.i(coreUiLabels, "coreUiLabels");
        AbstractC3159y.i(premiumUiLabels, "premiumUiLabels");
        AbstractC3159y.i(mobileUiLabels, "mobileUiLabels");
        this.f5697a = coreUiLabels;
        this.f5698b = premiumUiLabels;
        this.f5699c = mobileUiLabels;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (AbstractC3159y.d(this.f5697a, rVar.f5697a) && AbstractC3159y.d(this.f5698b, rVar.f5698b) && AbstractC3159y.d(this.f5699c, rVar.f5699c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5699c.hashCode() + ((this.f5698b.hashCode() + (this.f5697a.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("TranslationsText(coreUiLabels=");
        a8.append(this.f5697a);
        a8.append(", premiumUiLabels=");
        a8.append(this.f5698b);
        a8.append(", mobileUiLabels=");
        a8.append(this.f5699c);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ r(e eVar, n nVar, i iVar, int i8) {
        this((i8 & 1) != 0 ? new e(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 262143) : null, (i8 & 2) != 0 ? new n(null, null, null, null, null, null, null, null, null, null, 1023) : null, (i8 & 4) != 0 ? new i(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767) : null);
    }
}
