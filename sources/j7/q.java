package J7;

import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f5691a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5692b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5693c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5694d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5695e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5696f;

    public q(String title, String legalDescriptionTextLabel, String agreeToAllButton, String searchBarHint, String closeLabel, String backLabel) {
        AbstractC3159y.i(title, "title");
        AbstractC3159y.i(legalDescriptionTextLabel, "legalDescriptionTextLabel");
        AbstractC3159y.i(agreeToAllButton, "agreeToAllButton");
        AbstractC3159y.i(searchBarHint, "searchBarHint");
        AbstractC3159y.i(closeLabel, "closeLabel");
        AbstractC3159y.i(backLabel, "backLabel");
        this.f5691a = title;
        this.f5692b = legalDescriptionTextLabel;
        this.f5693c = agreeToAllButton;
        this.f5694d = searchBarHint;
        this.f5695e = closeLabel;
        this.f5696f = backLabel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (AbstractC3159y.d(this.f5691a, qVar.f5691a) && AbstractC3159y.d(this.f5692b, qVar.f5692b) && AbstractC3159y.d(this.f5693c, qVar.f5693c) && AbstractC3159y.d(this.f5694d, qVar.f5694d) && AbstractC3159y.d(this.f5695e, qVar.f5695e) && AbstractC3159y.d(this.f5696f, qVar.f5696f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5696f.hashCode() + t.a(this.f5695e, t.a(this.f5694d, t.a(this.f5693c, t.a(this.f5692b, this.f5691a.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("StacksScreen(title=");
        a8.append(this.f5691a);
        a8.append(", legalDescriptionTextLabel=");
        a8.append(this.f5692b);
        a8.append(", agreeToAllButton=");
        a8.append(this.f5693c);
        a8.append(", searchBarHint=");
        a8.append(this.f5694d);
        a8.append(", closeLabel=");
        a8.append(this.f5695e);
        a8.append(", backLabel=");
        a8.append(this.f5696f);
        a8.append(')');
        return a8.toString();
    }
}
