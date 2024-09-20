package L3;

import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3349K;
import q3.C3654g;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public interface n {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f6327a = new a("NONE", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f6328b = new a("EDIT_CARD_BRAND", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f6329c = new a("MANAGE_ONE", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f6330d = new a("MANAGE_ALL", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f6331e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ R5.a f6332f;

        static {
            a[] a8 = a();
            f6331e = a8;
            f6332f = R5.b.a(a8);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f6327a, f6328b, f6329c, f6330d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f6331e.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List f6333a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f6334b;

        /* renamed from: c, reason: collision with root package name */
        private final AbstractC3991f f6335c;

        /* renamed from: d, reason: collision with root package name */
        private final C3654g f6336d;

        /* renamed from: e, reason: collision with root package name */
        private final a f6337e;

        public b(List displayablePaymentMethods, boolean z8, AbstractC3991f abstractC3991f, C3654g c3654g, a availableSavedPaymentMethodAction) {
            AbstractC3159y.i(displayablePaymentMethods, "displayablePaymentMethods");
            AbstractC3159y.i(availableSavedPaymentMethodAction, "availableSavedPaymentMethodAction");
            this.f6333a = displayablePaymentMethods;
            this.f6334b = z8;
            this.f6335c = abstractC3991f;
            this.f6336d = c3654g;
            this.f6337e = availableSavedPaymentMethodAction;
        }

        public final a a() {
            return this.f6337e;
        }

        public final List b() {
            return this.f6333a;
        }

        public final C3654g c() {
            return this.f6336d;
        }

        public final AbstractC3991f d() {
            return this.f6335c;
        }

        public final boolean e() {
            return this.f6334b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3159y.d(this.f6333a, bVar.f6333a) && this.f6334b == bVar.f6334b && AbstractC3159y.d(this.f6335c, bVar.f6335c) && AbstractC3159y.d(this.f6336d, bVar.f6336d) && this.f6337e == bVar.f6337e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f6333a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f6334b)) * 31;
            AbstractC3991f abstractC3991f = this.f6335c;
            int i8 = 0;
            if (abstractC3991f == null) {
                hashCode = 0;
            } else {
                hashCode = abstractC3991f.hashCode();
            }
            int i9 = (hashCode2 + hashCode) * 31;
            C3654g c3654g = this.f6336d;
            if (c3654g != null) {
                i8 = c3654g.hashCode();
            }
            return ((i9 + i8) * 31) + this.f6337e.hashCode();
        }

        public String toString() {
            return "State(displayablePaymentMethods=" + this.f6333a + ", isProcessing=" + this.f6334b + ", selection=" + this.f6335c + ", displayedSavedPaymentMethod=" + this.f6336d + ", availableSavedPaymentMethodAction=" + this.f6337e + ")";
        }
    }

    /* loaded from: classes4.dex */
    public interface c {

        /* loaded from: classes4.dex */
        public static final class a implements c {

            /* renamed from: a, reason: collision with root package name */
            private final C3654g f6338a;

            public a(C3654g savedPaymentMethod) {
                AbstractC3159y.i(savedPaymentMethod, "savedPaymentMethod");
                this.f6338a = savedPaymentMethod;
            }

            public final C3654g a() {
                return this.f6338a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof a) && AbstractC3159y.d(this.f6338a, ((a) obj).f6338a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f6338a.hashCode();
            }

            public String toString() {
                return "EditPaymentMethod(savedPaymentMethod=" + this.f6338a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements c {

            /* renamed from: a, reason: collision with root package name */
            private final String f6339a;

            public b(String selectedPaymentMethodCode) {
                AbstractC3159y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
                this.f6339a = selectedPaymentMethodCode;
            }

            public final String a() {
                return this.f6339a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && AbstractC3159y.d(this.f6339a, ((b) obj).f6339a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f6339a.hashCode();
            }

            public String toString() {
                return "PaymentMethodSelected(selectedPaymentMethodCode=" + this.f6339a + ")";
            }
        }

        /* renamed from: L3.n$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0135c implements c {

            /* renamed from: b, reason: collision with root package name */
            public static final int f6340b = com.stripe.android.model.o.f24394u;

            /* renamed from: a, reason: collision with root package name */
            private final com.stripe.android.model.o f6341a;

            public C0135c(com.stripe.android.model.o savedPaymentMethod) {
                AbstractC3159y.i(savedPaymentMethod, "savedPaymentMethod");
                this.f6341a = savedPaymentMethod;
            }

            public final com.stripe.android.model.o a() {
                return this.f6341a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0135c) && AbstractC3159y.d(this.f6341a, ((C0135c) obj).f6341a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f6341a.hashCode();
            }

            public String toString() {
                return "SavedPaymentMethodSelected(savedPaymentMethod=" + this.f6341a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class d implements c {

            /* renamed from: a, reason: collision with root package name */
            public static final d f6342a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                if (this == obj || (obj instanceof d)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1370197407;
            }

            public String toString() {
                return "TransitionToManageOneSavedPaymentMethod";
            }
        }

        /* loaded from: classes4.dex */
        public static final class e implements c {

            /* renamed from: a, reason: collision with root package name */
            public static final e f6343a = new e();

            private e() {
            }

            public boolean equals(Object obj) {
                if (this == obj || (obj instanceof e)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1332425524;
            }

            public String toString() {
                return "TransitionToManageSavedPaymentMethods";
            }
        }
    }

    boolean a();

    void b(c cVar);

    InterfaceC3349K c();

    InterfaceC3349K getState();
}
