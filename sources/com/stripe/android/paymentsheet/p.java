package com.stripe.android.paymentsheet;

import L5.InterfaceC1227k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import q3.C3654g;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public abstract class p {

    /* loaded from: classes4.dex */
    public static final class a extends p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26067a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final e f26068b = e.f26086b;

        /* renamed from: c, reason: collision with root package name */
        private static final boolean f26069c = false;

        private a() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.p
        public e a() {
            return f26068b;
        }

        @Override // com.stripe.android.paymentsheet.p
        public boolean b() {
            return f26069c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f26070a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final e f26071b = e.f26087c;

        /* renamed from: c, reason: collision with root package name */
        private static final boolean f26072c = false;

        private b() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.p
        public e a() {
            return f26071b;
        }

        @Override // com.stripe.android.paymentsheet.p
        public boolean b() {
            return f26072c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f26073a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final e f26074b = e.f26088d;

        /* renamed from: c, reason: collision with root package name */
        private static final boolean f26075c = false;

        private c() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.p
        public e a() {
            return f26074b;
        }

        @Override // com.stripe.android.paymentsheet.p
        public boolean b() {
            return f26075c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends p {

        /* renamed from: a, reason: collision with root package name */
        private final C3654g f26076a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26077b;

        /* renamed from: c, reason: collision with root package name */
        private final e f26078c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC3983b f26079d;

        /* renamed from: e, reason: collision with root package name */
        private final com.stripe.android.model.o f26080e;

        /* renamed from: f, reason: collision with root package name */
        private final InterfaceC1227k f26081f;

        /* renamed from: g, reason: collision with root package name */
        private final InterfaceC1227k f26082g;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3160z implements Function0 {
            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(d.this.f() || d.this.f26077b);
            }
        }

        /* loaded from: classes4.dex */
        static final class b extends AbstractC3160z implements Function0 {
            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(d.this.d().f());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C3654g displayableSavedPaymentMethod, boolean z8) {
            super(null);
            AbstractC3159y.i(displayableSavedPaymentMethod, "displayableSavedPaymentMethod");
            this.f26076a = displayableSavedPaymentMethod;
            this.f26077b = z8;
            this.f26078c = e.f26085a;
            this.f26079d = displayableSavedPaymentMethod.b();
            this.f26080e = displayableSavedPaymentMethod.d();
            this.f26081f = L5.l.b(new b());
            this.f26082g = L5.l.b(new a());
        }

        @Override // com.stripe.android.paymentsheet.p
        public e a() {
            return this.f26078c;
        }

        @Override // com.stripe.android.paymentsheet.p
        public boolean b() {
            return ((Boolean) this.f26082g.getValue()).booleanValue();
        }

        public final C3654g d() {
            return this.f26076a;
        }

        public final com.stripe.android.model.o e() {
            return this.f26080e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC3159y.d(this.f26076a, dVar.f26076a) && this.f26077b == dVar.f26077b;
        }

        public final boolean f() {
            return ((Boolean) this.f26081f.getValue()).booleanValue();
        }

        public int hashCode() {
            return (this.f26076a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f26077b);
        }

        public String toString() {
            return "SavedPaymentMethod(displayableSavedPaymentMethod=" + this.f26076a + ", canRemovePaymentMethods=" + this.f26077b + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f26085a = new e("SavedPaymentMethod", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final e f26086b = new e("AddCard", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final e f26087c = new e("GooglePay", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final e f26088d = new e("Link", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ e[] f26089e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ R5.a f26090f;

        static {
            e[] a8 = a();
            f26089e = a8;
            f26090f = R5.b.a(a8);
        }

        private e(String str, int i8) {
        }

        private static final /* synthetic */ e[] a() {
            return new e[]{f26085a, f26086b, f26087c, f26088d};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f26089e.clone();
        }
    }

    private p() {
    }

    public abstract e a();

    public abstract boolean b();

    public /* synthetic */ p(AbstractC3151p abstractC3151p) {
        this();
    }
}
