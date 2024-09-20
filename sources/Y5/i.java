package y5;

import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final a f39880c = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f39881a;

    /* renamed from: b, reason: collision with root package name */
    public k f39882b;

    /* loaded from: classes5.dex */
    public static final class a {
        public final i a(String hash) {
            k kVar;
            AbstractC3159y.i(hash, "hash");
            List s02 = g6.n.s0(hash, new String[]{"-"}, false, 0, 6, null);
            if (s02.size() == 2) {
                int parseInt = Integer.parseInt((String) s02.get(0));
                int parseInt2 = Integer.parseInt((String) s02.get(1));
                if (parseInt2 != 1) {
                    if (parseInt2 != 2) {
                        kVar = k.NOT_ALLOWED;
                    } else {
                        kVar = k.REQUIRE_LI;
                    }
                } else {
                    kVar = k.REQUIRE_CONSENT;
                }
                return new i(parseInt, kVar);
            }
            StringBuilder sb = new StringBuilder();
            a aVar = i.f39880c;
            sb.append((Object) "f.i");
            sb.append(": TCModelError, hash: ");
            sb.append(hash);
            throw new A5.e(sb.toString());
        }
    }

    public i(int i8, k restrictionType) {
        AbstractC3159y.i(restrictionType, "restrictionType");
        this.f39881a = i8;
        this.f39882b = restrictionType;
    }

    public final String a() {
        if (this.f39881a > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f39881a);
            sb.append('-');
            sb.append(this.f39882b.f39891a);
            return sb.toString();
        }
        throw new A5.e(AbstractC3159y.q("f.i", ": TCModelError, cannot hash invalid PurposeRestriction"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f39881a == iVar.f39881a && this.f39882b == iVar.f39882b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f39882b.hashCode() + (this.f39881a * 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("PurposeRestriction(purposeId=");
        a8.append(this.f39881a);
        a8.append(", restrictionType=");
        a8.append(this.f39882b);
        a8.append(')');
        return a8.toString();
    }
}
