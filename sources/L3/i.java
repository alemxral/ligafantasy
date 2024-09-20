package L3;

import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3349K;
import q3.C3654g;

/* loaded from: classes4.dex */
public interface i {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f6244a;

        /* renamed from: b, reason: collision with root package name */
        private final C3654g f6245b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f6246c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f6247d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f6248e;

        public a(List paymentMethods, C3654g c3654g, boolean z8, boolean z9, boolean z10) {
            AbstractC3159y.i(paymentMethods, "paymentMethods");
            this.f6244a = paymentMethods;
            this.f6245b = c3654g;
            this.f6246c = z8;
            this.f6247d = z9;
            this.f6248e = z10;
        }

        public final boolean a() {
            return this.f6248e;
        }

        public final boolean b() {
            return this.f6247d;
        }

        public final C3654g c() {
            return this.f6245b;
        }

        public final List d() {
            return this.f6244a;
        }

        public final boolean e() {
            return this.f6246c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3159y.d(this.f6244a, aVar.f6244a) && AbstractC3159y.d(this.f6245b, aVar.f6245b) && this.f6246c == aVar.f6246c && this.f6247d == aVar.f6247d && this.f6248e == aVar.f6248e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f6244a.hashCode() * 31;
            C3654g c3654g = this.f6245b;
            if (c3654g == null) {
                hashCode = 0;
            } else {
                hashCode = c3654g.hashCode();
            }
            return ((((((hashCode2 + hashCode) * 31) + androidx.compose.foundation.a.a(this.f6246c)) * 31) + androidx.compose.foundation.a.a(this.f6247d)) * 31) + androidx.compose.foundation.a.a(this.f6248e);
        }

        public String toString() {
            return "State(paymentMethods=" + this.f6244a + ", currentSelection=" + this.f6245b + ", isEditing=" + this.f6246c + ", canRemove=" + this.f6247d + ", canEdit=" + this.f6248e + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class b {

        /* loaded from: classes4.dex */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final C3654g f6249a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3654g paymentMethod) {
                super(null);
                AbstractC3159y.i(paymentMethod, "paymentMethod");
                this.f6249a = paymentMethod;
            }

            public final C3654g a() {
                return this.f6249a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof a) && AbstractC3159y.d(this.f6249a, ((a) obj).f6249a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f6249a.hashCode();
            }

            public String toString() {
                return "DeletePaymentMethod(paymentMethod=" + this.f6249a + ")";
            }
        }

        /* renamed from: L3.i$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0133b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final C3654g f6250a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0133b(C3654g paymentMethod) {
                super(null);
                AbstractC3159y.i(paymentMethod, "paymentMethod");
                this.f6250a = paymentMethod;
            }

            public final C3654g a() {
                return this.f6250a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0133b) && AbstractC3159y.d(this.f6250a, ((C0133b) obj).f6250a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f6250a.hashCode();
            }

            public String toString() {
                return "EditPaymentMethod(paymentMethod=" + this.f6250a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            private final C3654g f6251a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C3654g paymentMethod) {
                super(null);
                AbstractC3159y.i(paymentMethod, "paymentMethod");
                this.f6251a = paymentMethod;
            }

            public final C3654g a() {
                return this.f6251a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof c) && AbstractC3159y.d(this.f6251a, ((c) obj).f6251a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f6251a.hashCode();
            }

            public String toString() {
                return "SelectPaymentMethod(paymentMethod=" + this.f6251a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final d f6252a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                if (this == obj || (obj instanceof d)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1354134144;
            }

            public String toString() {
                return "ToggleEdit";
            }
        }

        private b() {
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    boolean a();

    void b(b bVar);

    void close();

    InterfaceC3349K getState();
}
