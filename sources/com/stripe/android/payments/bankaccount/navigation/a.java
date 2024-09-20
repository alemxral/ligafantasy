package com.stripe.android.payments.bankaccount.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public interface a extends Parcelable {

    /* renamed from: com.stripe.android.payments.bankaccount.navigation.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0541a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0541a f25085a = new C0541a();
        public static final Parcelable.Creator<C0541a> CREATOR = new C0542a();

        /* renamed from: com.stripe.android.payments.bankaccount.navigation.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0542a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0541a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return C0541a.f25085a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0541a[] newArray(int i8) {
                return new C0541a[i8];
            }
        }

        private C0541a() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0541a);
        }

        public int hashCode() {
            return 1430639253;
        }

        public String toString() {
            return "Cancelled";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements a {
        public static final Parcelable.Creator<b> CREATOR = new C0543a();

        /* renamed from: a, reason: collision with root package name */
        private final StripeIntent f25086a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25087b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25088c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25089d;

        /* renamed from: com.stripe.android.payments.bankaccount.navigation.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0543a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new b((StripeIntent) parcel.readParcelable(b.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(StripeIntent intent, String paymentMethodId, String str, String str2) {
            AbstractC3159y.i(intent, "intent");
            AbstractC3159y.i(paymentMethodId, "paymentMethodId");
            this.f25086a = intent;
            this.f25087b = paymentMethodId;
            this.f25088c = str;
            this.f25089d = str2;
        }

        public final String b() {
            return this.f25089d;
        }

        public final StripeIntent c() {
            return this.f25086a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f25088c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f25086a, bVar.f25086a) && AbstractC3159y.d(this.f25087b, bVar.f25087b) && AbstractC3159y.d(this.f25088c, bVar.f25088c) && AbstractC3159y.d(this.f25089d, bVar.f25089d);
        }

        public final String f() {
            return this.f25087b;
        }

        public int hashCode() {
            int hashCode = ((this.f25086a.hashCode() * 31) + this.f25087b.hashCode()) * 31;
            String str = this.f25088c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25089d;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Completed(intent=" + this.f25086a + ", paymentMethodId=" + this.f25087b + ", last4=" + this.f25088c + ", bankName=" + this.f25089d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f25086a, i8);
            out.writeString(this.f25087b);
            out.writeString(this.f25088c);
            out.writeString(this.f25089d);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements a {
        public static final Parcelable.Creator<c> CREATOR = new C0544a();

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f25090a;

        /* renamed from: com.stripe.android.payments.bankaccount.navigation.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0544a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c((Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(Throwable error) {
            AbstractC3159y.i(error, "error");
            this.f25090a = error;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3159y.d(this.f25090a, ((c) obj).f25090a);
        }

        public int hashCode() {
            return this.f25090a.hashCode();
        }

        public String toString() {
            return "Failed(error=" + this.f25090a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeSerializable(this.f25090a);
        }
    }
}
