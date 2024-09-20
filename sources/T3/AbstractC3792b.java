package t3;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import r2.f;
import t2.AbstractC3790k;

/* renamed from: t3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3792b extends Throwable {

    /* renamed from: t3.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3792b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f38226a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final String f38227b = null;

        private a() {
            super(null);
        }

        @Override // t3.AbstractC3792b
        public String a() {
            return "externalPaymentMethodError";
        }

        @Override // t3.AbstractC3792b
        public String b() {
            return f38227b;
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1706746466;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ExternalPaymentMethod";
        }
    }

    /* renamed from: t3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0884b extends AbstractC3792b {

        /* renamed from: a, reason: collision with root package name */
        private final int f38228a;

        /* renamed from: b, reason: collision with root package name */
        private final String f38229b;

        public C0884b(int i8) {
            super(null);
            this.f38228a = i8;
            this.f38229b = String.valueOf(i8);
        }

        @Override // t3.AbstractC3792b
        public String a() {
            return "googlePay_" + b();
        }

        @Override // t3.AbstractC3792b
        public String b() {
            return this.f38229b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0884b) && this.f38228a == ((C0884b) obj).f38228a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f38228a;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "GooglePay(errorCodeInt=" + this.f38228a + ")";
        }
    }

    /* renamed from: t3.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3792b {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f38230a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC3790k f38231b;

        /* renamed from: c, reason: collision with root package name */
        private final String f38232c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable cause) {
            super(0 == true ? 1 : 0);
            AbstractC3159y.i(cause, "cause");
            this.f38230a = cause;
            AbstractC3790k b8 = AbstractC3790k.f38210e.b(getCause());
            this.f38231b = b8;
            f d8 = b8.d();
            this.f38232c = d8 != null ? d8.r() : null;
        }

        @Override // t3.AbstractC3792b
        public String a() {
            return this.f38231b.a();
        }

        @Override // t3.AbstractC3792b
        public String b() {
            return this.f38232c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3159y.d(this.f38230a, ((c) obj).f38230a)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.f38230a;
        }

        public int hashCode() {
            return this.f38230a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Stripe(cause=" + this.f38230a + ")";
        }
    }

    public /* synthetic */ AbstractC3792b(AbstractC3151p abstractC3151p) {
        this();
    }

    public abstract String a();

    public abstract String b();

    private AbstractC3792b() {
    }
}
