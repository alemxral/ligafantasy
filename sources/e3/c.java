package E3;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public interface c {

    /* loaded from: classes4.dex */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final String f1979a;

        public a(String cvc) {
            AbstractC3159y.i(cvc, "cvc");
            this.f1979a = cvc;
        }

        public final String a() {
            return this.f1979a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && AbstractC3159y.d(this.f1979a, ((a) obj).f1979a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f1979a.hashCode();
        }

        public String toString() {
            return "Completed(cvc=" + this.f1979a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f1980a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -481114568;
        }

        public String toString() {
            return "Incomplete";
        }
    }
}
