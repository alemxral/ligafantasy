package L5;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class w implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Object f6509a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f6510b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f6511c;

    public w(Object obj, Object obj2, Object obj3) {
        this.f6509a = obj;
        this.f6510b = obj2;
        this.f6511c = obj3;
    }

    public final Object a() {
        return this.f6509a;
    }

    public final Object b() {
        return this.f6510b;
    }

    public final Object c() {
        return this.f6511c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (AbstractC3159y.d(this.f6509a, wVar.f6509a) && AbstractC3159y.d(this.f6510b, wVar.f6510b) && AbstractC3159y.d(this.f6511c, wVar.f6511c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Object obj = this.f6509a;
        int i8 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i9 = hashCode * 31;
        Object obj2 = this.f6510b;
        if (obj2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = obj2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        Object obj3 = this.f6511c;
        if (obj3 != null) {
            i8 = obj3.hashCode();
        }
        return i10 + i8;
    }

    public String toString() {
        return '(' + this.f6509a + ", " + this.f6510b + ", " + this.f6511c + ')';
    }
}
