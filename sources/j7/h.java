package J7;

import kotlin.jvm.internal.AbstractC3159y;
import y5.t;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f5610a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5611b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5612c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5613d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5614e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5615f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5616g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5617h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5618i;

    /* renamed from: j, reason: collision with root package name */
    public final String f5619j;

    /* renamed from: k, reason: collision with root package name */
    public final String f5620k;

    public h(String title, String body, String objected, String accept, String objectAllButton, String searchBarHint, String purposesLabel, String partnersLabel, String showAllVendorsMenu, String showIABVendorsMenu, String backLabel) {
        AbstractC3159y.i(title, "title");
        AbstractC3159y.i(body, "body");
        AbstractC3159y.i(objected, "objected");
        AbstractC3159y.i(accept, "accept");
        AbstractC3159y.i(objectAllButton, "objectAllButton");
        AbstractC3159y.i(searchBarHint, "searchBarHint");
        AbstractC3159y.i(purposesLabel, "purposesLabel");
        AbstractC3159y.i(partnersLabel, "partnersLabel");
        AbstractC3159y.i(showAllVendorsMenu, "showAllVendorsMenu");
        AbstractC3159y.i(showIABVendorsMenu, "showIABVendorsMenu");
        AbstractC3159y.i(backLabel, "backLabel");
        this.f5610a = title;
        this.f5611b = body;
        this.f5612c = objected;
        this.f5613d = accept;
        this.f5614e = objectAllButton;
        this.f5615f = searchBarHint;
        this.f5616g = purposesLabel;
        this.f5617h = partnersLabel;
        this.f5618i = showAllVendorsMenu;
        this.f5619j = showIABVendorsMenu;
        this.f5620k = backLabel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (AbstractC3159y.d(this.f5610a, hVar.f5610a) && AbstractC3159y.d(this.f5611b, hVar.f5611b) && AbstractC3159y.d(this.f5612c, hVar.f5612c) && AbstractC3159y.d(this.f5613d, hVar.f5613d) && AbstractC3159y.d(this.f5614e, hVar.f5614e) && AbstractC3159y.d(this.f5615f, hVar.f5615f) && AbstractC3159y.d(this.f5616g, hVar.f5616g) && AbstractC3159y.d(this.f5617h, hVar.f5617h) && AbstractC3159y.d(this.f5618i, hVar.f5618i) && AbstractC3159y.d(this.f5619j, hVar.f5619j) && AbstractC3159y.d(this.f5620k, hVar.f5620k)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5620k.hashCode() + t.a(this.f5619j, t.a(this.f5618i, t.a(this.f5617h, t.a(this.f5616g, t.a(this.f5615f, t.a(this.f5614e, t.a(this.f5613d, t.a(this.f5612c, t.a(this.f5611b, this.f5610a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        return "LegInterestScreen(title=" + this.f5610a + ", body=" + this.f5611b + ", objected=" + this.f5612c + ", accept=" + this.f5613d + ", objectAllButton=" + this.f5614e + ", searchBarHint=" + this.f5615f + ", purposesLabel=" + this.f5616g + ", partnersLabel=" + this.f5617h + ", showAllVendorsMenu=" + this.f5618i + ", showIABVendorsMenu=" + this.f5619j + ", backLabel=" + this.f5620k + ')';
    }
}
