package J7;

import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f5597a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5598b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5599c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5600d;

    /* renamed from: e, reason: collision with root package name */
    public final List f5601e;

    public f(String identifier, String type, int i8, String domain, List purposes) {
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(type, "type");
        AbstractC3159y.i(domain, "domain");
        AbstractC3159y.i(purposes, "purposes");
        this.f5597a = identifier;
        this.f5598b = type;
        this.f5599c = i8;
        this.f5600d = domain;
        this.f5601e = purposes;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3159y.d(this.f5597a, fVar.f5597a) && AbstractC3159y.d(this.f5598b, fVar.f5598b) && this.f5599c == fVar.f5599c && AbstractC3159y.d(this.f5600d, fVar.f5600d) && AbstractC3159y.d(this.f5601e, fVar.f5601e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5601e.hashCode() + t.a(this.f5600d, C6.k.a(this.f5599c, t.a(this.f5598b, this.f5597a.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("Disclosure(identifier=");
        a8.append(this.f5597a);
        a8.append(", type=");
        a8.append(this.f5598b);
        a8.append(", maxAgeSeconds=");
        a8.append(this.f5599c);
        a8.append(", domain=");
        a8.append(this.f5600d);
        a8.append(", purposes=");
        a8.append(this.f5601e);
        a8.append(')');
        return a8.toString();
    }
}
