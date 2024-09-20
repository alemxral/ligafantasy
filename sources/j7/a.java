package J7;

import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5522a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5523b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5524c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5525d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5526e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5527f;

    public a(String title, List body, String deleteDataLinkText, String accessDataLinkText, String privacyPolicyLinkText, String backLabel) {
        AbstractC3159y.i(title, "title");
        AbstractC3159y.i(body, "body");
        AbstractC3159y.i(deleteDataLinkText, "deleteDataLinkText");
        AbstractC3159y.i(accessDataLinkText, "accessDataLinkText");
        AbstractC3159y.i(privacyPolicyLinkText, "privacyPolicyLinkText");
        AbstractC3159y.i(backLabel, "backLabel");
        this.f5522a = title;
        this.f5523b = body;
        this.f5524c = deleteDataLinkText;
        this.f5525d = accessDataLinkText;
        this.f5526e = privacyPolicyLinkText;
        this.f5527f = backLabel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3159y.d(this.f5522a, aVar.f5522a) && AbstractC3159y.d(this.f5523b, aVar.f5523b) && AbstractC3159y.d(this.f5524c, aVar.f5524c) && AbstractC3159y.d(this.f5525d, aVar.f5525d) && AbstractC3159y.d(this.f5526e, aVar.f5526e) && AbstractC3159y.d(this.f5527f, aVar.f5527f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5527f.hashCode() + t.a(this.f5526e, t.a(this.f5525d, t.a(this.f5524c, C6.l.a(this.f5523b, this.f5522a.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("CCPAScreen(title=");
        a8.append(this.f5522a);
        a8.append(", body=");
        a8.append(this.f5523b);
        a8.append(", deleteDataLinkText=");
        a8.append(this.f5524c);
        a8.append(", accessDataLinkText=");
        a8.append(this.f5525d);
        a8.append(", privacyPolicyLinkText=");
        a8.append(this.f5526e);
        a8.append(", backLabel=");
        a8.append(this.f5527f);
        a8.append(')');
        return a8.toString();
    }
}
