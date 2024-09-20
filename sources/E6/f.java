package E6;

import J7.i;
import J7.n;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public g f2372a;

    /* renamed from: b, reason: collision with root package name */
    public a f2373b;

    /* renamed from: c, reason: collision with root package name */
    public e f2374c;

    /* renamed from: d, reason: collision with root package name */
    public J7.e f2375d;

    /* renamed from: e, reason: collision with root package name */
    public i f2376e;

    /* renamed from: f, reason: collision with root package name */
    public n f2377f;

    public f(g premiumProperties, a coreConfig, e nonIabVendorsInfo, J7.e coreUiLabels, i mobileUiLabels, n premiumUiLabels) {
        AbstractC3159y.i(premiumProperties, "premiumProperties");
        AbstractC3159y.i(coreConfig, "coreConfig");
        AbstractC3159y.i(nonIabVendorsInfo, "nonIabVendorsInfo");
        AbstractC3159y.i(coreUiLabels, "coreUiLabels");
        AbstractC3159y.i(mobileUiLabels, "mobileUiLabels");
        AbstractC3159y.i(premiumUiLabels, "premiumUiLabels");
        this.f2372a = premiumProperties;
        this.f2373b = coreConfig;
        this.f2374c = nonIabVendorsInfo;
        this.f2375d = coreUiLabels;
        this.f2376e = mobileUiLabels;
        this.f2377f = premiumUiLabels;
    }

    public final a a() {
        return this.f2373b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3159y.d(this.f2372a, fVar.f2372a) && AbstractC3159y.d(this.f2373b, fVar.f2373b) && AbstractC3159y.d(this.f2374c, fVar.f2374c) && AbstractC3159y.d(this.f2375d, fVar.f2375d) && AbstractC3159y.d(this.f2376e, fVar.f2376e) && AbstractC3159y.d(this.f2377f, fVar.f2377f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f2377f.hashCode() + ((this.f2376e.hashCode() + ((this.f2375d.hashCode() + ((this.f2374c.hashCode() + ((this.f2373b.hashCode() + (this.f2372a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("PortalConfig(premiumProperties=");
        a8.append(this.f2372a);
        a8.append(", coreConfig=");
        a8.append(this.f2373b);
        a8.append(", nonIabVendorsInfo=");
        a8.append(this.f2374c);
        a8.append(", coreUiLabels=");
        a8.append(this.f2375d);
        a8.append(", mobileUiLabels=");
        a8.append(this.f2376e);
        a8.append(", premiumUiLabels=");
        a8.append(this.f2377f);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ f(g gVar, a aVar, e eVar, J7.e eVar2, i iVar, n nVar, int i8) {
        this((i8 & 1) != 0 ? new g(null, null, null, 7) : gVar, (i8 & 2) != 0 ? new a(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, null, false, null, null, null, null, false, null, -1, 8191) : aVar, (i8 & 4) != 0 ? new e(null, null, null, 7) : eVar, (i8 & 8) != 0 ? new J7.e(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 262143) : eVar2, (i8 & 16) != 0 ? new i(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767) : null, (i8 & 32) != 0 ? new n(null, null, null, null, null, null, null, null, null, null, 1023) : nVar);
    }
}
