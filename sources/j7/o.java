package J7;

import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f5686a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5687b;

    public o(String label, String link) {
        AbstractC3159y.i(label, "label");
        AbstractC3159y.i(link, "link");
        this.f5686a = label;
        this.f5687b = link;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (AbstractC3159y.d(this.f5686a, oVar.f5686a) && AbstractC3159y.d(this.f5687b, oVar.f5687b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5687b.hashCode() + (this.f5686a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("PublisherCustomLink(label=");
        a8.append(this.f5686a);
        a8.append(", link=");
        a8.append(this.f5687b);
        a8.append(')');
        return a8.toString();
    }
}
