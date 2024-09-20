package J3;

import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3349K;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public interface V {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f5107a;

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.paymentsheet.p f5108b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f5109c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f5110d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f5111e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f5112f;

        public a(List paymentOptionsItems, com.stripe.android.paymentsheet.p pVar, boolean z8, boolean z9, boolean z10, boolean z11) {
            AbstractC3159y.i(paymentOptionsItems, "paymentOptionsItems");
            this.f5107a = paymentOptionsItems;
            this.f5108b = pVar;
            this.f5109c = z8;
            this.f5110d = z9;
            this.f5111e = z10;
            this.f5112f = z11;
        }

        public static /* synthetic */ a b(a aVar, List list, com.stripe.android.paymentsheet.p pVar, boolean z8, boolean z9, boolean z10, boolean z11, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                list = aVar.f5107a;
            }
            if ((i8 & 2) != 0) {
                pVar = aVar.f5108b;
            }
            com.stripe.android.paymentsheet.p pVar2 = pVar;
            if ((i8 & 4) != 0) {
                z8 = aVar.f5109c;
            }
            boolean z12 = z8;
            if ((i8 & 8) != 0) {
                z9 = aVar.f5110d;
            }
            boolean z13 = z9;
            if ((i8 & 16) != 0) {
                z10 = aVar.f5111e;
            }
            boolean z14 = z10;
            if ((i8 & 32) != 0) {
                z11 = aVar.f5112f;
            }
            return aVar.a(list, pVar2, z12, z13, z14, z11);
        }

        public final a a(List paymentOptionsItems, com.stripe.android.paymentsheet.p pVar, boolean z8, boolean z9, boolean z10, boolean z11) {
            AbstractC3159y.i(paymentOptionsItems, "paymentOptionsItems");
            return new a(paymentOptionsItems, pVar, z8, z9, z10, z11);
        }

        public final boolean c() {
            return this.f5111e;
        }

        public final List d() {
            return this.f5107a;
        }

        public final com.stripe.android.paymentsheet.p e() {
            return this.f5108b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3159y.d(this.f5107a, aVar.f5107a) && AbstractC3159y.d(this.f5108b, aVar.f5108b) && this.f5109c == aVar.f5109c && this.f5110d == aVar.f5110d && this.f5111e == aVar.f5111e && this.f5112f == aVar.f5112f) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return this.f5109c;
        }

        public final boolean g() {
            return this.f5110d;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f5107a.hashCode() * 31;
            com.stripe.android.paymentsheet.p pVar = this.f5108b;
            if (pVar == null) {
                hashCode = 0;
            } else {
                hashCode = pVar.hashCode();
            }
            return ((((((((hashCode2 + hashCode) * 31) + androidx.compose.foundation.a.a(this.f5109c)) * 31) + androidx.compose.foundation.a.a(this.f5110d)) * 31) + androidx.compose.foundation.a.a(this.f5111e)) * 31) + androidx.compose.foundation.a.a(this.f5112f);
        }

        public String toString() {
            return "State(paymentOptionsItems=" + this.f5107a + ", selectedPaymentOptionsItem=" + this.f5108b + ", isEditing=" + this.f5109c + ", isProcessing=" + this.f5110d + ", canEdit=" + this.f5111e + ", canRemove=" + this.f5112f + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class b {

        /* loaded from: classes4.dex */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f5113a = new a();

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
                return 792087598;
            }

            public String toString() {
                return "AddCardPressed";
            }
        }

        /* renamed from: J3.V$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0095b extends b {

            /* renamed from: b, reason: collision with root package name */
            public static final int f5114b = com.stripe.android.model.o.f24394u;

            /* renamed from: a, reason: collision with root package name */
            private final com.stripe.android.model.o f5115a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0095b(com.stripe.android.model.o paymentMethod) {
                super(null);
                AbstractC3159y.i(paymentMethod, "paymentMethod");
                this.f5115a = paymentMethod;
            }

            public final com.stripe.android.model.o a() {
                return this.f5115a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0095b) && AbstractC3159y.d(this.f5115a, ((C0095b) obj).f5115a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f5115a.hashCode();
            }

            public String toString() {
                return "DeletePaymentMethod(paymentMethod=" + this.f5115a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends b {

            /* renamed from: b, reason: collision with root package name */
            public static final int f5116b = com.stripe.android.model.o.f24394u;

            /* renamed from: a, reason: collision with root package name */
            private final com.stripe.android.model.o f5117a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(com.stripe.android.model.o paymentMethod) {
                super(null);
                AbstractC3159y.i(paymentMethod, "paymentMethod");
                this.f5117a = paymentMethod;
            }

            public final com.stripe.android.model.o a() {
                return this.f5117a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof c) && AbstractC3159y.d(this.f5117a, ((c) obj).f5117a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f5117a.hashCode();
            }

            public String toString() {
                return "EditPaymentMethod(paymentMethod=" + this.f5117a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends b {

            /* renamed from: a, reason: collision with root package name */
            private final AbstractC3991f f5118a;

            public d(AbstractC3991f abstractC3991f) {
                super(null);
                this.f5118a = abstractC3991f;
            }

            public final AbstractC3991f a() {
                return this.f5118a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof d) && AbstractC3159y.d(this.f5118a, ((d) obj).f5118a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                AbstractC3991f abstractC3991f = this.f5118a;
                if (abstractC3991f == null) {
                    return 0;
                }
                return abstractC3991f.hashCode();
            }

            public String toString() {
                return "SelectPaymentMethod(selection=" + this.f5118a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class e extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final e f5119a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object obj) {
                if (this == obj || (obj instanceof e)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 2007142043;
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
