package I3;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import t2.AbstractC3790k;

/* loaded from: classes4.dex */
public abstract class j extends Throwable {

    /* loaded from: classes4.dex */
    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        private final n.e f4045a;

        /* renamed from: b, reason: collision with root package name */
        private final String f4046b;

        /* renamed from: c, reason: collision with root package name */
        private final String f4047c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n.e confirmationMethod) {
            super(null);
            AbstractC3159y.i(confirmationMethod, "confirmationMethod");
            this.f4045a = confirmationMethod;
            this.f4046b = "invalidConfirmationMethod";
            this.f4047c = g6.n.e("\n            PaymentIntent with confirmation_method='automatic' is required.\n            The current PaymentIntent has confirmation_method '" + confirmationMethod + "'.\n            See https://stripe.com/docs/api/payment_intents/object#payment_intent_object-confirmation_method.\n        ");
        }

        @Override // I3.j
        public String a() {
            return this.f4046b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f4045a == ((a) obj).f4045a) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f4047c;
        }

        public int hashCode() {
            return this.f4045a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InvalidConfirmationMethod(confirmationMethod=" + this.f4045a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends j {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4048a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final String f4049b = "missingAmountOrCurrency";

        /* renamed from: c, reason: collision with root package name */
        private static final String f4050c = "PaymentIntent must contain amount and currency.";

        private b() {
            super(null);
        }

        @Override // I3.j
        public String a() {
            return f4049b;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return f4050c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends j {

        /* renamed from: a, reason: collision with root package name */
        private final String f4051a;

        /* renamed from: b, reason: collision with root package name */
        private final String f4052b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String requested) {
            super(null);
            AbstractC3159y.i(requested, "requested");
            this.f4051a = requested;
            this.f4052b = "noPaymentMethodTypesAvailable";
        }

        @Override // I3.j
        public String a() {
            return this.f4052b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3159y.d(this.f4051a, ((c) obj).f4051a)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "None of the requested payment methods (" + this.f4051a + ") are supported.";
        }

        public int hashCode() {
            return this.f4051a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "NoPaymentMethodTypesAvailable(requested=" + this.f4051a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends j {

        /* renamed from: a, reason: collision with root package name */
        private final StripeIntent.Status f4053a;

        /* renamed from: b, reason: collision with root package name */
        private final String f4054b;

        public d(StripeIntent.Status status) {
            super(null);
            this.f4053a = status;
            this.f4054b = "paymentIntentInTerminalState";
        }

        @Override // I3.j
        public String a() {
            return this.f4054b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && this.f4053a == ((d) obj).f4053a) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return g6.n.e("\n                PaymentSheet cannot set up a PaymentIntent in status '" + this.f4053a + "'.\n                See https://stripe.com/docs/api/payment_intents/object#payment_intent_object-status.\n            ");
        }

        public int hashCode() {
            StripeIntent.Status status = this.f4053a;
            if (status == null) {
                return 0;
            }
            return status.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "PaymentIntentInTerminalState(status=" + this.f4053a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends j {

        /* renamed from: a, reason: collision with root package name */
        private final StripeIntent.Status f4055a;

        /* renamed from: b, reason: collision with root package name */
        private final String f4056b;

        public e(StripeIntent.Status status) {
            super(null);
            this.f4055a = status;
            this.f4056b = "setupIntentInTerminalState";
        }

        @Override // I3.j
        public String a() {
            return this.f4056b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof e) && this.f4055a == ((e) obj).f4055a) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return g6.n.e("\n                PaymentSheet cannot set up a SetupIntent in status '" + this.f4055a + "'.\n                See https://stripe.com/docs/api/setup_intents/object#setup_intent_object-status.\n            ");
        }

        public int hashCode() {
            StripeIntent.Status status = this.f4055a;
            if (status == null) {
                return 0;
            }
            return status.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "SetupIntentInTerminalState(status=" + this.f4055a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends j {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f4057a;

        /* renamed from: b, reason: collision with root package name */
        private final String f4058b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Throwable cause) {
            super(null);
            AbstractC3159y.i(cause, "cause");
            this.f4057a = cause;
            this.f4058b = getCause().getMessage();
        }

        @Override // I3.j
        public String a() {
            return AbstractC3790k.f38210e.b(getCause()).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof f) && AbstractC3159y.d(this.f4057a, ((f) obj).f4057a)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.f4057a;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f4058b;
        }

        public int hashCode() {
            return this.f4057a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Unknown(cause=" + this.f4057a + ")";
        }
    }

    public /* synthetic */ j(AbstractC3151p abstractC3151p) {
        this();
    }

    public abstract String a();

    private j() {
    }
}
