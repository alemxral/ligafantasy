package G5;

import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f3200a;

    /* renamed from: b, reason: collision with root package name */
    public final a f3201b;

    public b(Integer num, a aVar) {
        this.f3200a = num;
        this.f3201b = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3159y.d(this.f3200a, bVar.f3200a) && AbstractC3159y.d(this.f3201b, bVar.f3201b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.f3200a;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i9 = hashCode * 31;
        a aVar = this.f3201b;
        if (aVar != null) {
            i8 = aVar.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("GBCPurpose(id=");
        a8.append(this.f3200a);
        a8.append(", banner=");
        a8.append(this.f3201b);
        a8.append(')');
        return a8.toString();
    }
}
