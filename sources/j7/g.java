package J7;

import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f5602a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5603b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5604c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5605d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5606e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5607f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5608g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5609h;

    public g(String title, String body, String settings, String accept, String reject, String consentLink, String privacyPolicyLink, String privacyPolicyLinkText) {
        AbstractC3159y.i(title, "title");
        AbstractC3159y.i(body, "body");
        AbstractC3159y.i(settings, "settings");
        AbstractC3159y.i(accept, "accept");
        AbstractC3159y.i(reject, "reject");
        AbstractC3159y.i(consentLink, "consentLink");
        AbstractC3159y.i(privacyPolicyLink, "privacyPolicyLink");
        AbstractC3159y.i(privacyPolicyLinkText, "privacyPolicyLinkText");
        this.f5602a = title;
        this.f5603b = body;
        this.f5604c = settings;
        this.f5605d = accept;
        this.f5606e = reject;
        this.f5607f = consentLink;
        this.f5608g = privacyPolicyLink;
        this.f5609h = privacyPolicyLinkText;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3159y.d(this.f5602a, gVar.f5602a) && AbstractC3159y.d(this.f5603b, gVar.f5603b) && AbstractC3159y.d(this.f5604c, gVar.f5604c) && AbstractC3159y.d(this.f5605d, gVar.f5605d) && AbstractC3159y.d(this.f5606e, gVar.f5606e) && AbstractC3159y.d(this.f5607f, gVar.f5607f) && AbstractC3159y.d(this.f5608g, gVar.f5608g) && AbstractC3159y.d(this.f5609h, gVar.f5609h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5609h.hashCode() + t.a(this.f5608g, t.a(this.f5607f, t.a(this.f5606e, t.a(this.f5605d, t.a(this.f5604c, t.a(this.f5603b, this.f5602a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("InitScreen(title=");
        a8.append(this.f5602a);
        a8.append(", body=");
        a8.append(this.f5603b);
        a8.append(", settings=");
        a8.append(this.f5604c);
        a8.append(", accept=");
        a8.append(this.f5605d);
        a8.append(", reject=");
        a8.append(this.f5606e);
        a8.append(", consentLink=");
        a8.append(this.f5607f);
        a8.append(", privacyPolicyLink=");
        a8.append(this.f5608g);
        a8.append(", privacyPolicyLinkText=");
        a8.append(this.f5609h);
        a8.append(')');
        return a8.toString();
    }
}
