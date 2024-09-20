package com.stripe.android.customersheet;

import J3.G;
import J3.H;
import J3.InterfaceC1211t;
import M5.AbstractC1246t;
import c4.InterfaceC1925a;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.o;
import com.stripe.android.payments.bankaccount.navigation.c;
import com.stripe.android.payments.bankaccount.navigation.d;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private final List f23649a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f23650b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23651c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f23652d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f23653e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1925a f23654f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f23655g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f23656h;

    /* loaded from: classes4.dex */
    public static final class a extends e {

        /* renamed from: A, reason: collision with root package name */
        private final com.stripe.android.payments.bankaccount.navigation.d f23657A;

        /* renamed from: B, reason: collision with root package name */
        private final InterfaceC1925a f23658B;

        /* renamed from: C, reason: collision with root package name */
        private final k3.i f23659C;

        /* renamed from: i, reason: collision with root package name */
        private final String f23660i;

        /* renamed from: j, reason: collision with root package name */
        private final List f23661j;

        /* renamed from: k, reason: collision with root package name */
        private final w3.c f23662k;

        /* renamed from: l, reason: collision with root package name */
        private final List f23663l;

        /* renamed from: m, reason: collision with root package name */
        private final A3.a f23664m;

        /* renamed from: n, reason: collision with root package name */
        private final B3.d f23665n;

        /* renamed from: o, reason: collision with root package name */
        private final AbstractC3991f f23666o;

        /* renamed from: p, reason: collision with root package name */
        private final boolean f23667p;

        /* renamed from: q, reason: collision with root package name */
        private final boolean f23668q;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f23669r;

        /* renamed from: s, reason: collision with root package name */
        private final InterfaceC3983b f23670s;

        /* renamed from: t, reason: collision with root package name */
        private final boolean f23671t;

        /* renamed from: u, reason: collision with root package name */
        private final InterfaceC3983b f23672u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f23673v;

        /* renamed from: w, reason: collision with root package name */
        private final PrimaryButton.b f23674w;

        /* renamed from: x, reason: collision with root package name */
        private final InterfaceC3983b f23675x;

        /* renamed from: y, reason: collision with root package name */
        private final boolean f23676y;

        /* renamed from: z, reason: collision with root package name */
        private final boolean f23677z;

        public /* synthetic */ a(String str, List list, w3.c cVar, List list2, A3.a aVar, B3.d dVar, AbstractC3991f abstractC3991f, boolean z8, boolean z9, boolean z10, InterfaceC3983b interfaceC3983b, boolean z11, InterfaceC3983b interfaceC3983b2, boolean z12, PrimaryButton.b bVar, InterfaceC3983b interfaceC3983b3, boolean z13, boolean z14, com.stripe.android.payments.bankaccount.navigation.d dVar2, InterfaceC1925a interfaceC1925a, k3.i iVar, int i8, AbstractC3151p abstractC3151p) {
            this(str, list, cVar, list2, aVar, dVar, abstractC3991f, z8, z9, z10, (i8 & 1024) != 0 ? null : interfaceC3983b, z11, interfaceC3983b2, z12, bVar, (32768 & i8) != 0 ? null : interfaceC3983b3, (65536 & i8) != 0 ? false : z13, (i8 & 131072) != 0 ? false : z14, dVar2, interfaceC1925a, iVar);
        }

        public final B3.d A() {
            return this.f23665n;
        }

        @Override // com.stripe.android.customersheet.e
        public InterfaceC1925a c() {
            return this.f23658B;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f23660i, aVar.f23660i) && AbstractC3159y.d(this.f23661j, aVar.f23661j) && AbstractC3159y.d(this.f23662k, aVar.f23662k) && AbstractC3159y.d(this.f23663l, aVar.f23663l) && AbstractC3159y.d(this.f23664m, aVar.f23664m) && AbstractC3159y.d(this.f23665n, aVar.f23665n) && AbstractC3159y.d(this.f23666o, aVar.f23666o) && this.f23667p == aVar.f23667p && this.f23668q == aVar.f23668q && this.f23669r == aVar.f23669r && AbstractC3159y.d(this.f23670s, aVar.f23670s) && this.f23671t == aVar.f23671t && AbstractC3159y.d(this.f23672u, aVar.f23672u) && this.f23673v == aVar.f23673v && AbstractC3159y.d(this.f23674w, aVar.f23674w) && AbstractC3159y.d(this.f23675x, aVar.f23675x) && this.f23676y == aVar.f23676y && this.f23677z == aVar.f23677z && AbstractC3159y.d(this.f23657A, aVar.f23657A) && AbstractC3159y.d(this.f23658B, aVar.f23658B) && AbstractC3159y.d(this.f23659C, aVar.f23659C);
        }

        @Override // com.stripe.android.customersheet.e
        public boolean f() {
            return this.f23668q;
        }

        @Override // com.stripe.android.customersheet.e
        public boolean g() {
            return this.f23669r;
        }

        public int hashCode() {
            int hashCode = ((this.f23660i.hashCode() * 31) + this.f23661j.hashCode()) * 31;
            w3.c cVar = this.f23662k;
            int hashCode2 = (((((((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f23663l.hashCode()) * 31) + this.f23664m.hashCode()) * 31) + this.f23665n.hashCode()) * 31;
            AbstractC3991f abstractC3991f = this.f23666o;
            int hashCode3 = (((((((hashCode2 + (abstractC3991f == null ? 0 : abstractC3991f.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f23667p)) * 31) + androidx.compose.foundation.a.a(this.f23668q)) * 31) + androidx.compose.foundation.a.a(this.f23669r)) * 31;
            InterfaceC3983b interfaceC3983b = this.f23670s;
            int hashCode4 = (((((((hashCode3 + (interfaceC3983b == null ? 0 : interfaceC3983b.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f23671t)) * 31) + this.f23672u.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f23673v)) * 31;
            PrimaryButton.b bVar = this.f23674w;
            int hashCode5 = (hashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            InterfaceC3983b interfaceC3983b2 = this.f23675x;
            int hashCode6 = (((((hashCode5 + (interfaceC3983b2 == null ? 0 : interfaceC3983b2.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f23676y)) * 31) + androidx.compose.foundation.a.a(this.f23677z)) * 31;
            com.stripe.android.payments.bankaccount.navigation.d dVar = this.f23657A;
            return ((((hashCode6 + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.f23658B.hashCode()) * 31) + this.f23659C.hashCode();
        }

        public final a j(String paymentMethodCode, List supportedPaymentMethods, w3.c cVar, List formElements, A3.a formArguments, B3.d usBankAccountFormArguments, AbstractC3991f abstractC3991f, boolean z8, boolean z9, boolean z10, InterfaceC3983b interfaceC3983b, boolean z11, InterfaceC3983b primaryButtonLabel, boolean z12, PrimaryButton.b bVar, InterfaceC3983b interfaceC3983b2, boolean z13, boolean z14, com.stripe.android.payments.bankaccount.navigation.d dVar, InterfaceC1925a cbcEligibility, k3.i errorReporter) {
            AbstractC3159y.i(paymentMethodCode, "paymentMethodCode");
            AbstractC3159y.i(supportedPaymentMethods, "supportedPaymentMethods");
            AbstractC3159y.i(formElements, "formElements");
            AbstractC3159y.i(formArguments, "formArguments");
            AbstractC3159y.i(usBankAccountFormArguments, "usBankAccountFormArguments");
            AbstractC3159y.i(primaryButtonLabel, "primaryButtonLabel");
            AbstractC3159y.i(cbcEligibility, "cbcEligibility");
            AbstractC3159y.i(errorReporter, "errorReporter");
            return new a(paymentMethodCode, supportedPaymentMethods, cVar, formElements, formArguments, usBankAccountFormArguments, abstractC3991f, z8, z9, z10, interfaceC3983b, z11, primaryButtonLabel, z12, bVar, interfaceC3983b2, z13, z14, dVar, cbcEligibility, errorReporter);
        }

        public final com.stripe.android.payments.bankaccount.navigation.d l() {
            return this.f23657A;
        }

        public final PrimaryButton.b m() {
            return this.f23674w;
        }

        public final boolean n() {
            return this.f23677z;
        }

        public final AbstractC3991f o() {
            return this.f23666o;
        }

        public final boolean p() {
            return this.f23667p;
        }

        public final InterfaceC3983b q() {
            return this.f23670s;
        }

        public final A3.a r() {
            return this.f23664m;
        }

        public final List s() {
            return this.f23663l;
        }

        public final w3.c t() {
            return this.f23662k;
        }

        public String toString() {
            return "AddPaymentMethod(paymentMethodCode=" + this.f23660i + ", supportedPaymentMethods=" + this.f23661j + ", formFieldValues=" + this.f23662k + ", formElements=" + this.f23663l + ", formArguments=" + this.f23664m + ", usBankAccountFormArguments=" + this.f23665n + ", draftPaymentSelection=" + this.f23666o + ", enabled=" + this.f23667p + ", isLiveMode=" + this.f23668q + ", isProcessing=" + this.f23669r + ", errorMessage=" + this.f23670s + ", isFirstPaymentMethod=" + this.f23671t + ", primaryButtonLabel=" + this.f23672u + ", primaryButtonEnabled=" + this.f23673v + ", customPrimaryButtonUiState=" + this.f23674w + ", mandateText=" + this.f23675x + ", showMandateAbovePrimaryButton=" + this.f23676y + ", displayDismissConfirmationModal=" + this.f23677z + ", bankAccountResult=" + this.f23657A + ", cbcEligibility=" + this.f23658B + ", errorReporter=" + this.f23659C + ")";
        }

        public final InterfaceC3983b u() {
            return this.f23675x;
        }

        public final String v() {
            return this.f23660i;
        }

        public final boolean w() {
            return this.f23673v;
        }

        public final InterfaceC3983b x() {
            return this.f23672u;
        }

        public final boolean y() {
            return this.f23676y;
        }

        public final List z() {
            return this.f23661j;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String paymentMethodCode, List supportedPaymentMethods, w3.c cVar, List formElements, A3.a formArguments, B3.d usBankAccountFormArguments, AbstractC3991f abstractC3991f, boolean z8, boolean z9, boolean z10, InterfaceC3983b interfaceC3983b, boolean z11, InterfaceC3983b primaryButtonLabel, boolean z12, PrimaryButton.b bVar, InterfaceC3983b interfaceC3983b2, boolean z13, boolean z14, com.stripe.android.payments.bankaccount.navigation.d dVar, InterfaceC1925a cbcEligibility, k3.i errorReporter) {
            super(AbstractC1246t.m(), z9, z10, false, !z11, cbcEligibility, true, false, null);
            AbstractC3159y.i(paymentMethodCode, "paymentMethodCode");
            AbstractC3159y.i(supportedPaymentMethods, "supportedPaymentMethods");
            AbstractC3159y.i(formElements, "formElements");
            AbstractC3159y.i(formArguments, "formArguments");
            AbstractC3159y.i(usBankAccountFormArguments, "usBankAccountFormArguments");
            AbstractC3159y.i(primaryButtonLabel, "primaryButtonLabel");
            AbstractC3159y.i(cbcEligibility, "cbcEligibility");
            AbstractC3159y.i(errorReporter, "errorReporter");
            this.f23660i = paymentMethodCode;
            this.f23661j = supportedPaymentMethods;
            this.f23662k = cVar;
            this.f23663l = formElements;
            this.f23664m = formArguments;
            this.f23665n = usBankAccountFormArguments;
            this.f23666o = abstractC3991f;
            this.f23667p = z8;
            this.f23668q = z9;
            this.f23669r = z10;
            this.f23670s = interfaceC3983b;
            this.f23671t = z11;
            this.f23672u = primaryButtonLabel;
            this.f23673v = z12;
            this.f23674w = bVar;
            this.f23675x = interfaceC3983b2;
            this.f23676y = z13;
            this.f23677z = z14;
            this.f23657A = dVar;
            this.f23658B = cbcEligibility;
            this.f23659C = errorReporter;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends e {

        /* renamed from: i, reason: collision with root package name */
        private final InterfaceC1211t f23678i;

        /* renamed from: j, reason: collision with root package name */
        private final boolean f23679j;

        /* renamed from: k, reason: collision with root package name */
        private final InterfaceC1925a f23680k;

        /* renamed from: l, reason: collision with root package name */
        private final List f23681l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f23682m;

        /* renamed from: n, reason: collision with root package name */
        private final boolean f23683n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1211t editPaymentMethodInteractor, boolean z8, InterfaceC1925a cbcEligibility, List savedPaymentMethods, boolean z9, boolean z10) {
            super(savedPaymentMethods, z8, false, false, true, cbcEligibility, z9, z10, null);
            AbstractC3159y.i(editPaymentMethodInteractor, "editPaymentMethodInteractor");
            AbstractC3159y.i(cbcEligibility, "cbcEligibility");
            AbstractC3159y.i(savedPaymentMethods, "savedPaymentMethods");
            this.f23678i = editPaymentMethodInteractor;
            this.f23679j = z8;
            this.f23680k = cbcEligibility;
            this.f23681l = savedPaymentMethods;
            this.f23682m = z9;
            this.f23683n = z10;
        }

        @Override // com.stripe.android.customersheet.e
        public boolean a() {
            return this.f23682m;
        }

        @Override // com.stripe.android.customersheet.e
        public InterfaceC1925a c() {
            return this.f23680k;
        }

        @Override // com.stripe.android.customersheet.e
        public List d() {
            return this.f23681l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f23678i, bVar.f23678i) && this.f23679j == bVar.f23679j && AbstractC3159y.d(this.f23680k, bVar.f23680k) && AbstractC3159y.d(this.f23681l, bVar.f23681l) && this.f23682m == bVar.f23682m && this.f23683n == bVar.f23683n;
        }

        @Override // com.stripe.android.customersheet.e
        public boolean f() {
            return this.f23679j;
        }

        public int hashCode() {
            return (((((((((this.f23678i.hashCode() * 31) + androidx.compose.foundation.a.a(this.f23679j)) * 31) + this.f23680k.hashCode()) * 31) + this.f23681l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f23682m)) * 31) + androidx.compose.foundation.a.a(this.f23683n);
        }

        public final InterfaceC1211t j() {
            return this.f23678i;
        }

        public String toString() {
            return "EditPaymentMethod(editPaymentMethodInteractor=" + this.f23678i + ", isLiveMode=" + this.f23679j + ", cbcEligibility=" + this.f23680k + ", savedPaymentMethods=" + this.f23681l + ", allowsRemovalOfLastSavedPaymentMethod=" + this.f23682m + ", canRemovePaymentMethods=" + this.f23683n + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends e {

        /* renamed from: i, reason: collision with root package name */
        private final boolean f23684i;

        public c(boolean z8) {
            super(AbstractC1246t.m(), z8, false, false, false, InterfaceC1925a.c.f14970a, true, false, null);
            this.f23684i = z8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f23684i == ((c) obj).f23684i;
        }

        @Override // com.stripe.android.customersheet.e
        public boolean f() {
            return this.f23684i;
        }

        public int hashCode() {
            return androidx.compose.foundation.a.a(this.f23684i);
        }

        public String toString() {
            return "Loading(isLiveMode=" + this.f23684i + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends e {

        /* renamed from: i, reason: collision with root package name */
        private final String f23685i;

        /* renamed from: j, reason: collision with root package name */
        private final List f23686j;

        /* renamed from: k, reason: collision with root package name */
        private final AbstractC3991f f23687k;

        /* renamed from: l, reason: collision with root package name */
        private final boolean f23688l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f23689m;

        /* renamed from: n, reason: collision with root package name */
        private final boolean f23690n;

        /* renamed from: o, reason: collision with root package name */
        private final boolean f23691o;

        /* renamed from: p, reason: collision with root package name */
        private final boolean f23692p;

        /* renamed from: q, reason: collision with root package name */
        private final String f23693q;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f23694r;

        /* renamed from: s, reason: collision with root package name */
        private final boolean f23695s;

        /* renamed from: t, reason: collision with root package name */
        private final String f23696t;

        /* renamed from: u, reason: collision with root package name */
        private final o f23697u;

        /* renamed from: v, reason: collision with root package name */
        private final InterfaceC3983b f23698v;

        /* renamed from: w, reason: collision with root package name */
        private final InterfaceC1925a f23699w;

        public /* synthetic */ d(String str, List list, AbstractC3991f abstractC3991f, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str2, boolean z13, boolean z14, String str3, o oVar, InterfaceC3983b interfaceC3983b, InterfaceC1925a interfaceC1925a, int i8, AbstractC3151p abstractC3151p) {
            this(str, list, abstractC3991f, z8, z9, z10, z11, z12, str2, z13, z14, (i8 & 2048) != 0 ? null : str3, (i8 & 4096) != 0 ? null : oVar, (i8 & 8192) != 0 ? null : interfaceC3983b, interfaceC1925a);
        }

        public static /* synthetic */ d k(d dVar, String str, List list, AbstractC3991f abstractC3991f, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str2, boolean z13, boolean z14, String str3, o oVar, InterfaceC3983b interfaceC3983b, InterfaceC1925a interfaceC1925a, int i8, Object obj) {
            String str4;
            List list2;
            AbstractC3991f abstractC3991f2;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            String str5;
            boolean z20;
            boolean z21;
            String str6;
            o oVar2;
            InterfaceC3983b interfaceC3983b2;
            InterfaceC1925a interfaceC1925a2;
            if ((i8 & 1) != 0) {
                str4 = dVar.f23685i;
            } else {
                str4 = str;
            }
            if ((i8 & 2) != 0) {
                list2 = dVar.f23686j;
            } else {
                list2 = list;
            }
            if ((i8 & 4) != 0) {
                abstractC3991f2 = dVar.f23687k;
            } else {
                abstractC3991f2 = abstractC3991f;
            }
            if ((i8 & 8) != 0) {
                z15 = dVar.f23688l;
            } else {
                z15 = z8;
            }
            if ((i8 & 16) != 0) {
                z16 = dVar.f23689m;
            } else {
                z16 = z9;
            }
            if ((i8 & 32) != 0) {
                z17 = dVar.f23690n;
            } else {
                z17 = z10;
            }
            if ((i8 & 64) != 0) {
                z18 = dVar.f23691o;
            } else {
                z18 = z11;
            }
            if ((i8 & 128) != 0) {
                z19 = dVar.f23692p;
            } else {
                z19 = z12;
            }
            if ((i8 & 256) != 0) {
                str5 = dVar.f23693q;
            } else {
                str5 = str2;
            }
            if ((i8 & 512) != 0) {
                z20 = dVar.f23694r;
            } else {
                z20 = z13;
            }
            if ((i8 & 1024) != 0) {
                z21 = dVar.f23695s;
            } else {
                z21 = z14;
            }
            if ((i8 & 2048) != 0) {
                str6 = dVar.f23696t;
            } else {
                str6 = str3;
            }
            if ((i8 & 4096) != 0) {
                oVar2 = dVar.f23697u;
            } else {
                oVar2 = oVar;
            }
            if ((i8 & 8192) != 0) {
                interfaceC3983b2 = dVar.f23698v;
            } else {
                interfaceC3983b2 = interfaceC3983b;
            }
            if ((i8 & 16384) != 0) {
                interfaceC1925a2 = dVar.f23699w;
            } else {
                interfaceC1925a2 = interfaceC1925a;
            }
            return dVar.j(str4, list2, abstractC3991f2, z15, z16, z17, z18, z19, str5, z20, z21, str6, oVar2, interfaceC3983b2, interfaceC1925a2);
        }

        @Override // com.stripe.android.customersheet.e
        public boolean a() {
            return this.f23694r;
        }

        @Override // com.stripe.android.customersheet.e
        public InterfaceC1925a c() {
            return this.f23699w;
        }

        @Override // com.stripe.android.customersheet.e
        public List d() {
            return this.f23686j;
        }

        @Override // com.stripe.android.customersheet.e
        public boolean e() {
            return this.f23690n;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC3159y.d(this.f23685i, dVar.f23685i) && AbstractC3159y.d(this.f23686j, dVar.f23686j) && AbstractC3159y.d(this.f23687k, dVar.f23687k) && this.f23688l == dVar.f23688l && this.f23689m == dVar.f23689m && this.f23690n == dVar.f23690n && this.f23691o == dVar.f23691o && this.f23692p == dVar.f23692p && AbstractC3159y.d(this.f23693q, dVar.f23693q) && this.f23694r == dVar.f23694r && this.f23695s == dVar.f23695s && AbstractC3159y.d(this.f23696t, dVar.f23696t) && AbstractC3159y.d(this.f23697u, dVar.f23697u) && AbstractC3159y.d(this.f23698v, dVar.f23698v) && AbstractC3159y.d(this.f23699w, dVar.f23699w);
        }

        @Override // com.stripe.android.customersheet.e
        public boolean f() {
            return this.f23688l;
        }

        @Override // com.stripe.android.customersheet.e
        public boolean g() {
            return this.f23689m;
        }

        public int hashCode() {
            String str = this.f23685i;
            int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f23686j.hashCode()) * 31;
            AbstractC3991f abstractC3991f = this.f23687k;
            int hashCode2 = (((((((((((hashCode + (abstractC3991f == null ? 0 : abstractC3991f.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f23688l)) * 31) + androidx.compose.foundation.a.a(this.f23689m)) * 31) + androidx.compose.foundation.a.a(this.f23690n)) * 31) + androidx.compose.foundation.a.a(this.f23691o)) * 31) + androidx.compose.foundation.a.a(this.f23692p)) * 31;
            String str2 = this.f23693q;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f23694r)) * 31) + androidx.compose.foundation.a.a(this.f23695s)) * 31;
            String str3 = this.f23696t;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            o oVar = this.f23697u;
            int hashCode5 = (hashCode4 + (oVar == null ? 0 : oVar.hashCode())) * 31;
            InterfaceC3983b interfaceC3983b = this.f23698v;
            return ((hashCode5 + (interfaceC3983b != null ? interfaceC3983b.hashCode() : 0)) * 31) + this.f23699w.hashCode();
        }

        public final d j(String str, List savedPaymentMethods, AbstractC3991f abstractC3991f, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str2, boolean z13, boolean z14, String str3, o oVar, InterfaceC3983b interfaceC3983b, InterfaceC1925a cbcEligibility) {
            AbstractC3159y.i(savedPaymentMethods, "savedPaymentMethods");
            AbstractC3159y.i(cbcEligibility, "cbcEligibility");
            return new d(str, savedPaymentMethods, abstractC3991f, z8, z9, z10, z11, z12, str2, z13, z14, str3, oVar, interfaceC3983b, cbcEligibility);
        }

        public boolean l() {
            return this.f23695s;
        }

        public final String m() {
            return this.f23696t;
        }

        public final InterfaceC3983b n() {
            return this.f23698v;
        }

        public final AbstractC3991f o() {
            return this.f23687k;
        }

        public final boolean p() {
            return !g();
        }

        public final String q() {
            return this.f23693q;
        }

        public final boolean r() {
            return this.f23692p;
        }

        public final String s() {
            return this.f23685i;
        }

        public final boolean t() {
            return this.f23691o;
        }

        public String toString() {
            return "SelectPaymentMethod(title=" + this.f23685i + ", savedPaymentMethods=" + this.f23686j + ", paymentSelection=" + this.f23687k + ", isLiveMode=" + this.f23688l + ", isProcessing=" + this.f23689m + ", isEditing=" + this.f23690n + ", isGooglePayEnabled=" + this.f23691o + ", primaryButtonVisible=" + this.f23692p + ", primaryButtonLabel=" + this.f23693q + ", allowsRemovalOfLastSavedPaymentMethod=" + this.f23694r + ", canRemovePaymentMethods=" + this.f23695s + ", errorMessage=" + this.f23696t + ", unconfirmedPaymentMethod=" + this.f23697u + ", mandateText=" + this.f23698v + ", cbcEligibility=" + this.f23699w + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, List savedPaymentMethods, AbstractC3991f abstractC3991f, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str2, boolean z13, boolean z14, String str3, o oVar, InterfaceC3983b interfaceC3983b, InterfaceC1925a cbcEligibility) {
            super(savedPaymentMethods, z8, z9, z10, false, cbcEligibility, z13, z14, null);
            AbstractC3159y.i(savedPaymentMethods, "savedPaymentMethods");
            AbstractC3159y.i(cbcEligibility, "cbcEligibility");
            this.f23685i = str;
            this.f23686j = savedPaymentMethods;
            this.f23687k = abstractC3991f;
            this.f23688l = z8;
            this.f23689m = z9;
            this.f23690n = z10;
            this.f23691o = z11;
            this.f23692p = z12;
            this.f23693q = str2;
            this.f23694r = z13;
            this.f23695s = z14;
            this.f23696t = str3;
            this.f23697u = oVar;
            this.f23698v = interfaceC3983b;
            this.f23699w = cbcEligibility;
        }
    }

    public /* synthetic */ e(List list, boolean z8, boolean z9, boolean z10, boolean z11, InterfaceC1925a interfaceC1925a, boolean z12, boolean z13, AbstractC3151p abstractC3151p) {
        this(list, z8, z9, z10, z11, interfaceC1925a, z12, z13);
    }

    public boolean a() {
        return this.f23655g;
    }

    public boolean b() {
        return this.f23653e;
    }

    public InterfaceC1925a c() {
        return this.f23654f;
    }

    public List d() {
        return this.f23649a;
    }

    public boolean e() {
        return this.f23652d;
    }

    public abstract boolean f();

    public boolean g() {
        return this.f23651c;
    }

    public final boolean h(o3.d isFinancialConnectionsAvailable) {
        c.C0545c e8;
        FinancialConnectionsSession b8;
        AbstractC3159y.i(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
        if (this instanceof a) {
            a aVar = (a) this;
            if (AbstractC3159y.d(aVar.v(), o.p.f24509O.f24537a) && isFinancialConnectionsAvailable.invoke() && (aVar.l() instanceof d.b) && (e8 = ((d.b) aVar.l()).b().e()) != null && (b8 = e8.b()) != null) {
                b8.getPaymentAccount();
                return false;
            }
            return false;
        }
        return false;
    }

    public final G i(Function0 onEditIconPressed) {
        AbstractC3159y.i(onEditIconPressed, "onEditIconPressed");
        return H.f4820a.a(b(), f(), new G.a.C0093a(e(), B2.f.a(a(), d(), c()), onEditIconPressed));
    }

    private e(List list, boolean z8, boolean z9, boolean z10, boolean z11, InterfaceC1925a interfaceC1925a, boolean z12, boolean z13) {
        this.f23649a = list;
        this.f23650b = z8;
        this.f23651c = z9;
        this.f23652d = z10;
        this.f23653e = z11;
        this.f23654f = interfaceC1925a;
        this.f23655g = z12;
        this.f23656h = z13;
    }
}
