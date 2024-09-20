package com.stripe.android.payments.paymentlauncher;

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
import b3.InterfaceC1874i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 1)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class PaymentLauncherContract extends ActivityResultContract<a, com.stripe.android.payments.paymentlauncher.a> {

    /* loaded from: classes4.dex */
    public static abstract class a implements Parcelable {

        /* renamed from: g, reason: collision with root package name */
        public static final C0552a f25258g = new C0552a(null);

        /* renamed from: h, reason: collision with root package name */
        public static final int f25259h = 8;

        /* renamed from: a, reason: collision with root package name */
        private final String f25260a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25261b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25262c;

        /* renamed from: d, reason: collision with root package name */
        private final Set f25263d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f25264e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f25265f;

        /* renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0552a {
            private C0552a() {
            }

            public final a a(Intent intent) {
                AbstractC3159y.i(intent, "intent");
                return (a) intent.getParcelableExtra("extra_args");
            }

            public /* synthetic */ C0552a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends a {
            public static final Parcelable.Creator<b> CREATOR = new C0553a();

            /* renamed from: i, reason: collision with root package name */
            private final String f25266i;

            /* renamed from: j, reason: collision with root package name */
            private final String f25267j;

            /* renamed from: k, reason: collision with root package name */
            private final boolean f25268k;

            /* renamed from: l, reason: collision with root package name */
            private final Set f25269l;

            /* renamed from: m, reason: collision with root package name */
            private final boolean f25270m;

            /* renamed from: n, reason: collision with root package name */
            private final InterfaceC1874i f25271n;

            /* renamed from: o, reason: collision with root package name */
            private Integer f25272o;

            /* renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherContract$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0553a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    boolean z8 = parcel.readInt() != 0;
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new b(readString, readString2, z8, linkedHashSet, parcel.readInt() != 0, (InterfaceC1874i) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String publishableKey, String str, boolean z8, Set productUsage, boolean z9, InterfaceC1874i confirmStripeIntentParams, Integer num) {
                super(publishableKey, str, z8, productUsage, z9, num, null);
                AbstractC3159y.i(publishableKey, "publishableKey");
                AbstractC3159y.i(productUsage, "productUsage");
                AbstractC3159y.i(confirmStripeIntentParams, "confirmStripeIntentParams");
                this.f25266i = publishableKey;
                this.f25267j = str;
                this.f25268k = z8;
                this.f25269l = productUsage;
                this.f25270m = z9;
                this.f25271n = confirmStripeIntentParams;
                this.f25272o = num;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public boolean b() {
                return this.f25268k;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public boolean c() {
                return this.f25270m;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Set e() {
                return this.f25269l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return AbstractC3159y.d(this.f25266i, bVar.f25266i) && AbstractC3159y.d(this.f25267j, bVar.f25267j) && this.f25268k == bVar.f25268k && AbstractC3159y.d(this.f25269l, bVar.f25269l) && this.f25270m == bVar.f25270m && AbstractC3159y.d(this.f25271n, bVar.f25271n) && AbstractC3159y.d(this.f25272o, bVar.f25272o);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public String f() {
                return this.f25266i;
            }

            public int hashCode() {
                int hashCode = this.f25266i.hashCode() * 31;
                String str = this.f25267j;
                int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f25268k)) * 31) + this.f25269l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f25270m)) * 31) + this.f25271n.hashCode()) * 31;
                Integer num = this.f25272o;
                return hashCode2 + (num != null ? num.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Integer i() {
                return this.f25272o;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public String j() {
                return this.f25267j;
            }

            public final InterfaceC1874i n() {
                return this.f25271n;
            }

            public String toString() {
                return "IntentConfirmationArgs(publishableKey=" + this.f25266i + ", stripeAccountId=" + this.f25267j + ", enableLogging=" + this.f25268k + ", productUsage=" + this.f25269l + ", includePaymentSheetNextHandlers=" + this.f25270m + ", confirmStripeIntentParams=" + this.f25271n + ", statusBarColor=" + this.f25272o + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                int intValue;
                AbstractC3159y.i(out, "out");
                out.writeString(this.f25266i);
                out.writeString(this.f25267j);
                out.writeInt(this.f25268k ? 1 : 0);
                Set set = this.f25269l;
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
                out.writeInt(this.f25270m ? 1 : 0);
                out.writeParcelable(this.f25271n, i8);
                Integer num = this.f25272o;
                if (num == null) {
                    intValue = 0;
                } else {
                    out.writeInt(1);
                    intValue = num.intValue();
                }
                out.writeInt(intValue);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends a {
            public static final Parcelable.Creator<c> CREATOR = new C0554a();

            /* renamed from: i, reason: collision with root package name */
            private final String f25273i;

            /* renamed from: j, reason: collision with root package name */
            private final String f25274j;

            /* renamed from: k, reason: collision with root package name */
            private final boolean f25275k;

            /* renamed from: l, reason: collision with root package name */
            private final Set f25276l;

            /* renamed from: m, reason: collision with root package name */
            private final boolean f25277m;

            /* renamed from: n, reason: collision with root package name */
            private final String f25278n;

            /* renamed from: o, reason: collision with root package name */
            private Integer f25279o;

            /* renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherContract$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0554a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    boolean z8 = parcel.readInt() != 0;
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new c(readString, readString2, z8, linkedHashSet, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String publishableKey, String str, boolean z8, Set productUsage, boolean z9, String paymentIntentClientSecret, Integer num) {
                super(publishableKey, str, z8, productUsage, z9, num, null);
                AbstractC3159y.i(publishableKey, "publishableKey");
                AbstractC3159y.i(productUsage, "productUsage");
                AbstractC3159y.i(paymentIntentClientSecret, "paymentIntentClientSecret");
                this.f25273i = publishableKey;
                this.f25274j = str;
                this.f25275k = z8;
                this.f25276l = productUsage;
                this.f25277m = z9;
                this.f25278n = paymentIntentClientSecret;
                this.f25279o = num;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public boolean b() {
                return this.f25275k;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public boolean c() {
                return this.f25277m;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Set e() {
                return this.f25276l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return AbstractC3159y.d(this.f25273i, cVar.f25273i) && AbstractC3159y.d(this.f25274j, cVar.f25274j) && this.f25275k == cVar.f25275k && AbstractC3159y.d(this.f25276l, cVar.f25276l) && this.f25277m == cVar.f25277m && AbstractC3159y.d(this.f25278n, cVar.f25278n) && AbstractC3159y.d(this.f25279o, cVar.f25279o);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public String f() {
                return this.f25273i;
            }

            public int hashCode() {
                int hashCode = this.f25273i.hashCode() * 31;
                String str = this.f25274j;
                int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f25275k)) * 31) + this.f25276l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f25277m)) * 31) + this.f25278n.hashCode()) * 31;
                Integer num = this.f25279o;
                return hashCode2 + (num != null ? num.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Integer i() {
                return this.f25279o;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public String j() {
                return this.f25274j;
            }

            public final String n() {
                return this.f25278n;
            }

            public String toString() {
                return "PaymentIntentNextActionArgs(publishableKey=" + this.f25273i + ", stripeAccountId=" + this.f25274j + ", enableLogging=" + this.f25275k + ", productUsage=" + this.f25276l + ", includePaymentSheetNextHandlers=" + this.f25277m + ", paymentIntentClientSecret=" + this.f25278n + ", statusBarColor=" + this.f25279o + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                int intValue;
                AbstractC3159y.i(out, "out");
                out.writeString(this.f25273i);
                out.writeString(this.f25274j);
                out.writeInt(this.f25275k ? 1 : 0);
                Set set = this.f25276l;
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
                out.writeInt(this.f25277m ? 1 : 0);
                out.writeString(this.f25278n);
                Integer num = this.f25279o;
                if (num == null) {
                    intValue = 0;
                } else {
                    out.writeInt(1);
                    intValue = num.intValue();
                }
                out.writeInt(intValue);
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends a {
            public static final Parcelable.Creator<d> CREATOR = new C0555a();

            /* renamed from: i, reason: collision with root package name */
            private final String f25280i;

            /* renamed from: j, reason: collision with root package name */
            private final String f25281j;

            /* renamed from: k, reason: collision with root package name */
            private final boolean f25282k;

            /* renamed from: l, reason: collision with root package name */
            private final Set f25283l;

            /* renamed from: m, reason: collision with root package name */
            private final boolean f25284m;

            /* renamed from: n, reason: collision with root package name */
            private final String f25285n;

            /* renamed from: o, reason: collision with root package name */
            private Integer f25286o;

            /* renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherContract$a$d$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0555a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    boolean z8 = parcel.readInt() != 0;
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new d(readString, readString2, z8, linkedHashSet, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i8) {
                    return new d[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String publishableKey, String str, boolean z8, Set productUsage, boolean z9, String setupIntentClientSecret, Integer num) {
                super(publishableKey, str, z8, productUsage, z9, num, null);
                AbstractC3159y.i(publishableKey, "publishableKey");
                AbstractC3159y.i(productUsage, "productUsage");
                AbstractC3159y.i(setupIntentClientSecret, "setupIntentClientSecret");
                this.f25280i = publishableKey;
                this.f25281j = str;
                this.f25282k = z8;
                this.f25283l = productUsage;
                this.f25284m = z9;
                this.f25285n = setupIntentClientSecret;
                this.f25286o = num;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public boolean b() {
                return this.f25282k;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public boolean c() {
                return this.f25284m;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Set e() {
                return this.f25283l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return AbstractC3159y.d(this.f25280i, dVar.f25280i) && AbstractC3159y.d(this.f25281j, dVar.f25281j) && this.f25282k == dVar.f25282k && AbstractC3159y.d(this.f25283l, dVar.f25283l) && this.f25284m == dVar.f25284m && AbstractC3159y.d(this.f25285n, dVar.f25285n) && AbstractC3159y.d(this.f25286o, dVar.f25286o);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public String f() {
                return this.f25280i;
            }

            public int hashCode() {
                int hashCode = this.f25280i.hashCode() * 31;
                String str = this.f25281j;
                int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f25282k)) * 31) + this.f25283l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f25284m)) * 31) + this.f25285n.hashCode()) * 31;
                Integer num = this.f25286o;
                return hashCode2 + (num != null ? num.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Integer i() {
                return this.f25286o;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public String j() {
                return this.f25281j;
            }

            public final String n() {
                return this.f25285n;
            }

            public String toString() {
                return "SetupIntentNextActionArgs(publishableKey=" + this.f25280i + ", stripeAccountId=" + this.f25281j + ", enableLogging=" + this.f25282k + ", productUsage=" + this.f25283l + ", includePaymentSheetNextHandlers=" + this.f25284m + ", setupIntentClientSecret=" + this.f25285n + ", statusBarColor=" + this.f25286o + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                int intValue;
                AbstractC3159y.i(out, "out");
                out.writeString(this.f25280i);
                out.writeString(this.f25281j);
                out.writeInt(this.f25282k ? 1 : 0);
                Set set = this.f25283l;
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
                out.writeInt(this.f25284m ? 1 : 0);
                out.writeString(this.f25285n);
                Integer num = this.f25286o;
                if (num == null) {
                    intValue = 0;
                } else {
                    out.writeInt(1);
                    intValue = num.intValue();
                }
                out.writeInt(intValue);
            }
        }

        public /* synthetic */ a(String str, String str2, boolean z8, Set set, boolean z9, Integer num, AbstractC3151p abstractC3151p) {
            this(str, str2, z8, set, z9, num);
        }

        public abstract boolean b();

        public abstract boolean c();

        public abstract Set e();

        public abstract String f();

        public abstract Integer i();

        public abstract String j();

        public final Bundle k() {
            return BundleKt.bundleOf(x.a("extra_args", this));
        }

        private a(String str, String str2, boolean z8, Set set, boolean z9, Integer num) {
            this.f25260a = str;
            this.f25261b = str2;
            this.f25262c = z8;
            this.f25263d = set;
            this.f25264e = z9;
            this.f25265f = num;
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(input, "input");
        Intent putExtras = new Intent(context, (Class<?>) PaymentLauncherConfirmationActivity.class).putExtras(input.k());
        AbstractC3159y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.payments.paymentlauncher.a parseResult(int i8, Intent intent) {
        return com.stripe.android.payments.paymentlauncher.a.f25287a.a(intent);
    }
}
