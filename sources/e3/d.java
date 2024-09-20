package E3;

import b3.EnumC1870e;
import com.stripe.android.model.o;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f1981c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f1982a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC1870e f1983b;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final d a(o.g gVar) {
            if (gVar != null) {
                return new d(gVar.f24469h, gVar.f24462a);
            }
            return null;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public d(String str, EnumC1870e brand) {
        AbstractC3159y.i(brand, "brand");
        this.f1982a = str;
        this.f1983b = brand;
    }

    public final EnumC1870e a() {
        return this.f1983b;
    }

    public final String b() {
        return this.f1982a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3159y.d(this.f1982a, dVar.f1982a) && this.f1983b == dVar.f1983b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f1982a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 31) + this.f1983b.hashCode();
    }

    public String toString() {
        return "CvcRecollectionData(lastFour=" + this.f1982a + ", brand=" + this.f1983b + ")";
    }
}
