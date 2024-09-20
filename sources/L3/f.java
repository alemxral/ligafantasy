package L3;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import q3.C3654g;

/* loaded from: classes4.dex */
public interface f {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C3654g f6215a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f6216b;

        public a(C3654g paymentMethod, boolean z8) {
            AbstractC3159y.i(paymentMethod, "paymentMethod");
            this.f6215a = paymentMethod;
            this.f6216b = z8;
        }

        public final C3654g a() {
            return this.f6215a;
        }

        public final boolean b() {
            return this.f6216b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3159y.d(this.f6215a, aVar.f6215a) && this.f6216b == aVar.f6216b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f6215a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f6216b);
        }

        public String toString() {
            return "State(paymentMethod=" + this.f6215a + ", isLiveMode=" + this.f6216b + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class b {

        /* loaded from: classes4.dex */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f6217a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                if (this == obj || (obj instanceof a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1323407824;
            }

            public String toString() {
                return "DeletePaymentMethod";
            }
        }

        private b() {
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    void a(b bVar);

    a getState();
}
