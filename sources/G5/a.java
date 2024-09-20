package G5;

import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3196a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3197b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3198c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3199d;

    public a(String title, String sectionTitle, String description, String confirm) {
        AbstractC3159y.i(title, "title");
        AbstractC3159y.i(sectionTitle, "sectionTitle");
        AbstractC3159y.i(description, "description");
        AbstractC3159y.i(confirm, "confirm");
        this.f3196a = title;
        this.f3197b = sectionTitle;
        this.f3198c = description;
        this.f3199d = confirm;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3159y.d(this.f3196a, aVar.f3196a) && AbstractC3159y.d(this.f3197b, aVar.f3197b) && AbstractC3159y.d(this.f3198c, aVar.f3198c) && AbstractC3159y.d(this.f3199d, aVar.f3199d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f3199d.hashCode() + t.a(this.f3198c, t.a(this.f3197b, this.f3196a.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("Banner(title=");
        a8.append(this.f3196a);
        a8.append(", sectionTitle=");
        a8.append(this.f3197b);
        a8.append(", description=");
        a8.append(this.f3198c);
        a8.append(", confirm=");
        a8.append(this.f3199d);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, int i8) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : null, (i8 & 4) != 0 ? "" : str3, (i8 & 8) == 0 ? null : "");
    }
}
