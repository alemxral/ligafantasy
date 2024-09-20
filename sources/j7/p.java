package J7;

import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f5688a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5689b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5690c;

    public p(int i8, String label, String state) {
        AbstractC3159y.i(label, "label");
        AbstractC3159y.i(state, "state");
        this.f5688a = i8;
        this.f5689b = label;
        this.f5690c = state;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f5688a == pVar.f5688a && AbstractC3159y.d(this.f5689b, pVar.f5689b) && AbstractC3159y.d(this.f5690c, pVar.f5690c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5690c.hashCode() + t.a(this.f5689b, this.f5688a * 31, 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("StackInfo(id=");
        a8.append(this.f5688a);
        a8.append(", label=");
        a8.append(this.f5689b);
        a8.append(", state=");
        a8.append(this.f5690c);
        a8.append(')');
        return a8.toString();
    }
}
