package L3;

import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3349K;

/* loaded from: classes4.dex */
public interface s {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f6400a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f6401b;

        /* renamed from: c, reason: collision with root package name */
        private final B3.d f6402c;

        /* renamed from: d, reason: collision with root package name */
        private final A3.a f6403d;

        /* renamed from: e, reason: collision with root package name */
        private final List f6404e;

        /* renamed from: f, reason: collision with root package name */
        private final W2.a f6405f;

        public a(String selectedPaymentMethodCode, boolean z8, B3.d usBankAccountFormArguments, A3.a formArguments, List formElements, W2.a aVar) {
            AbstractC3159y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
            AbstractC3159y.i(usBankAccountFormArguments, "usBankAccountFormArguments");
            AbstractC3159y.i(formArguments, "formArguments");
            AbstractC3159y.i(formElements, "formElements");
            this.f6400a = selectedPaymentMethodCode;
            this.f6401b = z8;
            this.f6402c = usBankAccountFormArguments;
            this.f6403d = formArguments;
            this.f6404e = formElements;
            this.f6405f = aVar;
        }

        public final A3.a a() {
            return this.f6403d;
        }

        public final List b() {
            return this.f6404e;
        }

        public final W2.a c() {
            return this.f6405f;
        }

        public final String d() {
            return this.f6400a;
        }

        public final B3.d e() {
            return this.f6402c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3159y.d(this.f6400a, aVar.f6400a) && this.f6401b == aVar.f6401b && AbstractC3159y.d(this.f6402c, aVar.f6402c) && AbstractC3159y.d(this.f6403d, aVar.f6403d) && AbstractC3159y.d(this.f6404e, aVar.f6404e) && AbstractC3159y.d(this.f6405f, aVar.f6405f)) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return this.f6401b;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((((((this.f6400a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f6401b)) * 31) + this.f6402c.hashCode()) * 31) + this.f6403d.hashCode()) * 31) + this.f6404e.hashCode()) * 31;
            W2.a aVar = this.f6405f;
            if (aVar == null) {
                hashCode = 0;
            } else {
                hashCode = aVar.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "State(selectedPaymentMethodCode=" + this.f6400a + ", isProcessing=" + this.f6401b + ", usBankAccountFormArguments=" + this.f6402c + ", formArguments=" + this.f6403d + ", formElements=" + this.f6404e + ", headerInformation=" + this.f6405f + ")";
        }
    }

    /* loaded from: classes4.dex */
    public interface b {

        /* loaded from: classes4.dex */
        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f6406a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                if (this == obj || (obj instanceof a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1206182106;
            }

            public String toString() {
                return "FieldInteraction";
            }
        }

        /* renamed from: L3.s$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0136b implements b {

            /* renamed from: a, reason: collision with root package name */
            private final w3.c f6407a;

            public C0136b(w3.c cVar) {
                this.f6407a = cVar;
            }

            public final w3.c a() {
                return this.f6407a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0136b) && AbstractC3159y.d(this.f6407a, ((C0136b) obj).f6407a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                w3.c cVar = this.f6407a;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            public String toString() {
                return "FormFieldValuesChanged(formValues=" + this.f6407a + ")";
            }
        }
    }

    boolean a();

    boolean b();

    void c(b bVar);

    void close();

    InterfaceC3349K getState();
}
