package com.stripe.android.payments.bankaccount.navigation;

import L5.x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import com.stripe.android.payments.bankaccount.navigation.d;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity;
import g3.InterfaceC2712a;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 1)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class CollectBankAccountContract extends ActivityResultContract<a, d> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25047a = new b(null);

    /* loaded from: classes4.dex */
    public static abstract class a implements Parcelable {

        /* renamed from: g, reason: collision with root package name */
        public static final C0536a f25048g = new C0536a(null);

        /* renamed from: h, reason: collision with root package name */
        public static final int f25049h = 8;

        /* renamed from: a, reason: collision with root package name */
        private final String f25050a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25051b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25052c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC2712a f25053d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f25054e;

        /* renamed from: f, reason: collision with root package name */
        private final String f25055f;

        /* renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0536a {
            private C0536a() {
            }

            public final a a(Intent intent) {
                AbstractC3159y.i(intent, "intent");
                return (a) intent.getParcelableExtra("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_args");
            }

            public /* synthetic */ C0536a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends a {
            public static final Parcelable.Creator<b> CREATOR = new C0537a();

            /* renamed from: i, reason: collision with root package name */
            private final String f25056i;

            /* renamed from: j, reason: collision with root package name */
            private final String f25057j;

            /* renamed from: k, reason: collision with root package name */
            private final InterfaceC2712a f25058k;

            /* renamed from: l, reason: collision with root package name */
            private final String f25059l;

            /* renamed from: m, reason: collision with root package name */
            private final String f25060m;

            /* renamed from: n, reason: collision with root package name */
            private final String f25061n;

            /* renamed from: o, reason: collision with root package name */
            private final String f25062o;

            /* renamed from: p, reason: collision with root package name */
            private final Integer f25063p;

            /* renamed from: q, reason: collision with root package name */
            private final String f25064q;

            /* renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0537a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new b(parcel.readString(), parcel.readString(), (InterfaceC2712a) parcel.readParcelable(b.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String publishableKey, String str, InterfaceC2712a configuration, String str2, String elementsSessionId, String str3, String str4, Integer num, String str5) {
                super(publishableKey, str, null, configuration, false, str2, null);
                AbstractC3159y.i(publishableKey, "publishableKey");
                AbstractC3159y.i(configuration, "configuration");
                AbstractC3159y.i(elementsSessionId, "elementsSessionId");
                this.f25056i = publishableKey;
                this.f25057j = str;
                this.f25058k = configuration;
                this.f25059l = str2;
                this.f25060m = elementsSessionId;
                this.f25061n = str3;
                this.f25062o = str4;
                this.f25063p = num;
                this.f25064q = str5;
            }

            public final String K() {
                return this.f25064q;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public InterfaceC2712a c() {
                return this.f25058k;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String e() {
                return this.f25059l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return AbstractC3159y.d(this.f25056i, bVar.f25056i) && AbstractC3159y.d(this.f25057j, bVar.f25057j) && AbstractC3159y.d(this.f25058k, bVar.f25058k) && AbstractC3159y.d(this.f25059l, bVar.f25059l) && AbstractC3159y.d(this.f25060m, bVar.f25060m) && AbstractC3159y.d(this.f25061n, bVar.f25061n) && AbstractC3159y.d(this.f25062o, bVar.f25062o) && AbstractC3159y.d(this.f25063p, bVar.f25063p) && AbstractC3159y.d(this.f25064q, bVar.f25064q);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String f() {
                return this.f25056i;
            }

            public int hashCode() {
                int hashCode = this.f25056i.hashCode() * 31;
                String str = this.f25057j;
                int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f25058k.hashCode()) * 31;
                String str2 = this.f25059l;
                int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f25060m.hashCode()) * 31;
                String str3 = this.f25061n;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f25062o;
                int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Integer num = this.f25063p;
                int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
                String str5 = this.f25064q;
                return hashCode6 + (str5 != null ? str5.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String i() {
                return this.f25057j;
            }

            public final Integer j() {
                return this.f25063p;
            }

            public final String k() {
                return this.f25061n;
            }

            public final String n() {
                return this.f25060m;
            }

            public final String o() {
                return this.f25062o;
            }

            public String toString() {
                return "ForDeferredPaymentIntent(publishableKey=" + this.f25056i + ", stripeAccountId=" + this.f25057j + ", configuration=" + this.f25058k + ", hostedSurface=" + this.f25059l + ", elementsSessionId=" + this.f25060m + ", customerId=" + this.f25061n + ", onBehalfOf=" + this.f25062o + ", amount=" + this.f25063p + ", currency=" + this.f25064q + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                int intValue;
                AbstractC3159y.i(out, "out");
                out.writeString(this.f25056i);
                out.writeString(this.f25057j);
                out.writeParcelable(this.f25058k, i8);
                out.writeString(this.f25059l);
                out.writeString(this.f25060m);
                out.writeString(this.f25061n);
                out.writeString(this.f25062o);
                Integer num = this.f25063p;
                if (num == null) {
                    intValue = 0;
                } else {
                    out.writeInt(1);
                    intValue = num.intValue();
                }
                out.writeInt(intValue);
                out.writeString(this.f25064q);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends a {
            public static final Parcelable.Creator<c> CREATOR = new C0538a();

            /* renamed from: i, reason: collision with root package name */
            private final String f25065i;

            /* renamed from: j, reason: collision with root package name */
            private final String f25066j;

            /* renamed from: k, reason: collision with root package name */
            private final InterfaceC2712a f25067k;

            /* renamed from: l, reason: collision with root package name */
            private final String f25068l;

            /* renamed from: m, reason: collision with root package name */
            private final String f25069m;

            /* renamed from: n, reason: collision with root package name */
            private final String f25070n;

            /* renamed from: o, reason: collision with root package name */
            private final String f25071o;

            /* renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0538a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new c(parcel.readString(), parcel.readString(), (InterfaceC2712a) parcel.readParcelable(c.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String publishableKey, String str, InterfaceC2712a configuration, String str2, String elementsSessionId, String str3, String str4) {
                super(publishableKey, str, null, configuration, false, str2, null);
                AbstractC3159y.i(publishableKey, "publishableKey");
                AbstractC3159y.i(configuration, "configuration");
                AbstractC3159y.i(elementsSessionId, "elementsSessionId");
                this.f25065i = publishableKey;
                this.f25066j = str;
                this.f25067k = configuration;
                this.f25068l = str2;
                this.f25069m = elementsSessionId;
                this.f25070n = str3;
                this.f25071o = str4;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public InterfaceC2712a c() {
                return this.f25067k;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String e() {
                return this.f25068l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return AbstractC3159y.d(this.f25065i, cVar.f25065i) && AbstractC3159y.d(this.f25066j, cVar.f25066j) && AbstractC3159y.d(this.f25067k, cVar.f25067k) && AbstractC3159y.d(this.f25068l, cVar.f25068l) && AbstractC3159y.d(this.f25069m, cVar.f25069m) && AbstractC3159y.d(this.f25070n, cVar.f25070n) && AbstractC3159y.d(this.f25071o, cVar.f25071o);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String f() {
                return this.f25065i;
            }

            public int hashCode() {
                int hashCode = this.f25065i.hashCode() * 31;
                String str = this.f25066j;
                int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f25067k.hashCode()) * 31;
                String str2 = this.f25068l;
                int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f25069m.hashCode()) * 31;
                String str3 = this.f25070n;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f25071o;
                return hashCode4 + (str4 != null ? str4.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String i() {
                return this.f25066j;
            }

            public final String j() {
                return this.f25070n;
            }

            public final String k() {
                return this.f25069m;
            }

            public final String n() {
                return this.f25071o;
            }

            public String toString() {
                return "ForDeferredSetupIntent(publishableKey=" + this.f25065i + ", stripeAccountId=" + this.f25066j + ", configuration=" + this.f25067k + ", hostedSurface=" + this.f25068l + ", elementsSessionId=" + this.f25069m + ", customerId=" + this.f25070n + ", onBehalfOf=" + this.f25071o + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f25065i);
                out.writeString(this.f25066j);
                out.writeParcelable(this.f25067k, i8);
                out.writeString(this.f25068l);
                out.writeString(this.f25069m);
                out.writeString(this.f25070n);
                out.writeString(this.f25071o);
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends a {
            public static final Parcelable.Creator<d> CREATOR = new C0539a();

            /* renamed from: i, reason: collision with root package name */
            private final String f25072i;

            /* renamed from: j, reason: collision with root package name */
            private final String f25073j;

            /* renamed from: k, reason: collision with root package name */
            private final String f25074k;

            /* renamed from: l, reason: collision with root package name */
            private final InterfaceC2712a f25075l;

            /* renamed from: m, reason: collision with root package name */
            private final boolean f25076m;

            /* renamed from: n, reason: collision with root package name */
            private final String f25077n;

            /* renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$d$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0539a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new d(parcel.readString(), parcel.readString(), parcel.readString(), (InterfaceC2712a) parcel.readParcelable(d.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i8) {
                    return new d[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String publishableKey, String str, String clientSecret, InterfaceC2712a configuration, boolean z8, String str2) {
                super(publishableKey, str, clientSecret, configuration, z8, str2, null);
                AbstractC3159y.i(publishableKey, "publishableKey");
                AbstractC3159y.i(clientSecret, "clientSecret");
                AbstractC3159y.i(configuration, "configuration");
                this.f25072i = publishableKey;
                this.f25073j = str;
                this.f25074k = clientSecret;
                this.f25075l = configuration;
                this.f25076m = z8;
                this.f25077n = str2;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public boolean b() {
                return this.f25076m;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public InterfaceC2712a c() {
                return this.f25075l;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String d() {
                return this.f25074k;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String e() {
                return this.f25077n;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return AbstractC3159y.d(this.f25072i, dVar.f25072i) && AbstractC3159y.d(this.f25073j, dVar.f25073j) && AbstractC3159y.d(this.f25074k, dVar.f25074k) && AbstractC3159y.d(this.f25075l, dVar.f25075l) && this.f25076m == dVar.f25076m && AbstractC3159y.d(this.f25077n, dVar.f25077n);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String f() {
                return this.f25072i;
            }

            public int hashCode() {
                int hashCode = this.f25072i.hashCode() * 31;
                String str = this.f25073j;
                int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f25074k.hashCode()) * 31) + this.f25075l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f25076m)) * 31;
                String str2 = this.f25077n;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String i() {
                return this.f25073j;
            }

            public String toString() {
                return "ForPaymentIntent(publishableKey=" + this.f25072i + ", stripeAccountId=" + this.f25073j + ", clientSecret=" + this.f25074k + ", configuration=" + this.f25075l + ", attachToIntent=" + this.f25076m + ", hostedSurface=" + this.f25077n + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f25072i);
                out.writeString(this.f25073j);
                out.writeString(this.f25074k);
                out.writeParcelable(this.f25075l, i8);
                out.writeInt(this.f25076m ? 1 : 0);
                out.writeString(this.f25077n);
            }
        }

        /* loaded from: classes4.dex */
        public static final class e extends a {
            public static final Parcelable.Creator<e> CREATOR = new C0540a();

            /* renamed from: i, reason: collision with root package name */
            private final String f25078i;

            /* renamed from: j, reason: collision with root package name */
            private final String f25079j;

            /* renamed from: k, reason: collision with root package name */
            private final String f25080k;

            /* renamed from: l, reason: collision with root package name */
            private final InterfaceC2712a f25081l;

            /* renamed from: m, reason: collision with root package name */
            private final boolean f25082m;

            /* renamed from: n, reason: collision with root package name */
            private final String f25083n;

            /* renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$e$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0540a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new e(parcel.readString(), parcel.readString(), parcel.readString(), (InterfaceC2712a) parcel.readParcelable(e.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final e[] newArray(int i8) {
                    return new e[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String publishableKey, String str, String clientSecret, InterfaceC2712a configuration, boolean z8, String str2) {
                super(publishableKey, str, clientSecret, configuration, z8, str2, null);
                AbstractC3159y.i(publishableKey, "publishableKey");
                AbstractC3159y.i(clientSecret, "clientSecret");
                AbstractC3159y.i(configuration, "configuration");
                this.f25078i = publishableKey;
                this.f25079j = str;
                this.f25080k = clientSecret;
                this.f25081l = configuration;
                this.f25082m = z8;
                this.f25083n = str2;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public boolean b() {
                return this.f25082m;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public InterfaceC2712a c() {
                return this.f25081l;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String d() {
                return this.f25080k;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String e() {
                return this.f25083n;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return AbstractC3159y.d(this.f25078i, eVar.f25078i) && AbstractC3159y.d(this.f25079j, eVar.f25079j) && AbstractC3159y.d(this.f25080k, eVar.f25080k) && AbstractC3159y.d(this.f25081l, eVar.f25081l) && this.f25082m == eVar.f25082m && AbstractC3159y.d(this.f25083n, eVar.f25083n);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String f() {
                return this.f25078i;
            }

            public int hashCode() {
                int hashCode = this.f25078i.hashCode() * 31;
                String str = this.f25079j;
                int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f25080k.hashCode()) * 31) + this.f25081l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f25082m)) * 31;
                String str2 = this.f25083n;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            public String i() {
                return this.f25079j;
            }

            public String toString() {
                return "ForSetupIntent(publishableKey=" + this.f25078i + ", stripeAccountId=" + this.f25079j + ", clientSecret=" + this.f25080k + ", configuration=" + this.f25081l + ", attachToIntent=" + this.f25082m + ", hostedSurface=" + this.f25083n + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f25078i);
                out.writeString(this.f25079j);
                out.writeString(this.f25080k);
                out.writeParcelable(this.f25081l, i8);
                out.writeInt(this.f25082m ? 1 : 0);
                out.writeString(this.f25083n);
            }
        }

        public /* synthetic */ a(String str, String str2, String str3, InterfaceC2712a interfaceC2712a, boolean z8, String str4, AbstractC3151p abstractC3151p) {
            this(str, str2, str3, interfaceC2712a, z8, str4);
        }

        public boolean b() {
            return this.f25054e;
        }

        public abstract InterfaceC2712a c();

        public String d() {
            return this.f25052c;
        }

        public abstract String e();

        public abstract String f();

        public abstract String i();

        private a(String str, String str2, String str3, InterfaceC2712a interfaceC2712a, boolean z8, String str4) {
            this.f25050a = str;
            this.f25051b = str2;
            this.f25052c = str3;
            this.f25053d = interfaceC2712a;
            this.f25054e = z8;
            this.f25055f = str4;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final d f25084a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c((d) parcel.readParcelable(c.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(d collectBankAccountResult) {
            AbstractC3159y.i(collectBankAccountResult, "collectBankAccountResult");
            this.f25084a = collectBankAccountResult;
        }

        public final d b() {
            return this.f25084a;
        }

        public final Bundle c() {
            return BundleKt.bundleOf(x.a("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_result", this));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3159y.d(this.f25084a, ((c) obj).f25084a);
        }

        public int hashCode() {
            return this.f25084a.hashCode();
        }

        public String toString() {
            return "Result(collectBankAccountResult=" + this.f25084a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f25084a, i8);
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(input, "input");
        Intent putExtra = new Intent(context, (Class<?>) CollectBankAccountActivity.class).putExtra("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_args", input);
        AbstractC3159y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d parseResult(int i8, Intent intent) {
        d dVar;
        c cVar;
        if (intent != null && (cVar = (c) intent.getParcelableExtra("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_result")) != null) {
            dVar = cVar.b();
        } else {
            dVar = null;
        }
        if (dVar == null) {
            return new d.c(new IllegalArgumentException("Failed to retrieve a CollectBankAccountResult."));
        }
        return dVar;
    }
}
