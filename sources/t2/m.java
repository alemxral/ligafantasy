package T2;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class m {

    /* loaded from: classes4.dex */
    public static final class a extends m {

        /* renamed from: a, reason: collision with root package name */
        private final String f9964a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String email) {
            super(null);
            AbstractC3159y.i(email, "email");
            this.f9964a = email;
        }

        public final String a() {
            return this.f9964a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && AbstractC3159y.d(this.f9964a, ((a) obj).f9964a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f9964a.hashCode();
        }

        public String toString() {
            return "SignIn(email=" + this.f9964a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends m {

        /* renamed from: a, reason: collision with root package name */
        private final String f9965a;

        /* renamed from: b, reason: collision with root package name */
        private final String f9966b;

        /* renamed from: c, reason: collision with root package name */
        private final String f9967c;

        /* renamed from: d, reason: collision with root package name */
        private final String f9968d;

        /* renamed from: e, reason: collision with root package name */
        private final l f9969e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String email, String phone, String country, String str, l consentAction) {
            super(null);
            AbstractC3159y.i(email, "email");
            AbstractC3159y.i(phone, "phone");
            AbstractC3159y.i(country, "country");
            AbstractC3159y.i(consentAction, "consentAction");
            this.f9965a = email;
            this.f9966b = phone;
            this.f9967c = country;
            this.f9968d = str;
            this.f9969e = consentAction;
        }

        public final l a() {
            return this.f9969e;
        }

        public final String b() {
            return this.f9967c;
        }

        public final String c() {
            return this.f9965a;
        }

        public final String d() {
            return this.f9968d;
        }

        public final String e() {
            return this.f9966b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3159y.d(this.f9965a, bVar.f9965a) && AbstractC3159y.d(this.f9966b, bVar.f9966b) && AbstractC3159y.d(this.f9967c, bVar.f9967c) && AbstractC3159y.d(this.f9968d, bVar.f9968d) && this.f9969e == bVar.f9969e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((this.f9965a.hashCode() * 31) + this.f9966b.hashCode()) * 31) + this.f9967c.hashCode()) * 31;
            String str = this.f9968d;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return ((hashCode2 + hashCode) * 31) + this.f9969e.hashCode();
        }

        public String toString() {
            return "SignUp(email=" + this.f9965a + ", phone=" + this.f9966b + ", country=" + this.f9967c + ", name=" + this.f9968d + ", consentAction=" + this.f9969e + ")";
        }
    }

    public /* synthetic */ m(AbstractC3151p abstractC3151p) {
        this();
    }

    private m() {
    }
}
