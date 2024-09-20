package J7;

import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f5667a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5668b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5669c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5670d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5671e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5672f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5673g;

    public l(String title, String bodyText, String searchBarHint, String partnersLabel, String showAllVendorsMenu, String showIABVendorsMenu, String backLabel) {
        AbstractC3159y.i(title, "title");
        AbstractC3159y.i(bodyText, "bodyText");
        AbstractC3159y.i(searchBarHint, "searchBarHint");
        AbstractC3159y.i(partnersLabel, "partnersLabel");
        AbstractC3159y.i(showAllVendorsMenu, "showAllVendorsMenu");
        AbstractC3159y.i(showIABVendorsMenu, "showIABVendorsMenu");
        AbstractC3159y.i(backLabel, "backLabel");
        this.f5667a = title;
        this.f5668b = bodyText;
        this.f5669c = searchBarHint;
        this.f5670d = partnersLabel;
        this.f5671e = showAllVendorsMenu;
        this.f5672f = showIABVendorsMenu;
        this.f5673g = backLabel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (AbstractC3159y.d(this.f5667a, lVar.f5667a) && AbstractC3159y.d(this.f5668b, lVar.f5668b) && AbstractC3159y.d(this.f5669c, lVar.f5669c) && AbstractC3159y.d(this.f5670d, lVar.f5670d) && AbstractC3159y.d(this.f5671e, lVar.f5671e) && AbstractC3159y.d(this.f5672f, lVar.f5672f) && AbstractC3159y.d(this.f5673g, lVar.f5673g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5673g.hashCode() + t.a(this.f5672f, t.a(this.f5671e, t.a(this.f5670d, t.a(this.f5669c, t.a(this.f5668b, this.f5667a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("PartnerScreen(title=");
        a8.append(this.f5667a);
        a8.append(", bodyText=");
        a8.append(this.f5668b);
        a8.append(", searchBarHint=");
        a8.append(this.f5669c);
        a8.append(", partnersLabel=");
        a8.append(this.f5670d);
        a8.append(", showAllVendorsMenu=");
        a8.append(this.f5671e);
        a8.append(", showIABVendorsMenu=");
        a8.append(this.f5672f);
        a8.append(", backLabel=");
        a8.append(this.f5673g);
        a8.append(')');
        return a8.toString();
    }
}
