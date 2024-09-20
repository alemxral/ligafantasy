package y5;

import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class u extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final String f39939a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39940b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String fieldName, String fieldValue, String msg) {
        super("invalid value " + fieldValue + " passed for " + fieldName + ' ' + msg);
        AbstractC3159y.i(fieldName, "fieldName");
        AbstractC3159y.i(fieldValue, "fieldValue");
        AbstractC3159y.i(msg, "msg");
        this.f39939a = fieldName;
        this.f39940b = fieldValue;
        this.f39941c = msg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (AbstractC3159y.d(this.f39939a, uVar.f39939a) && AbstractC3159y.d(this.f39940b, uVar.f39940b) && AbstractC3159y.d(this.f39941c, uVar.f39941c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f39941c.hashCode() + t.a(this.f39940b, this.f39939a.hashCode() * 31, 31);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("TCModelError(fieldName=");
        a8.append(this.f39939a);
        a8.append(", fieldValue=");
        a8.append(this.f39940b);
        a8.append(", msg=");
        a8.append(this.f39941c);
        a8.append(')');
        return a8.toString();
    }
}
