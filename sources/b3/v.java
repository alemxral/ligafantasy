package b3;

import M5.AbstractC1246t;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public interface v extends Parcelable {
    List A();

    String F();

    String P();

    String S();

    String d();

    String getType();

    List q();

    /* loaded from: classes4.dex */
    public static final class a implements v {
        public static final Parcelable.Creator<a> CREATOR = new C0359a();

        /* renamed from: a, reason: collision with root package name */
        private final String f14557a;

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.model.i f14558b;

        /* renamed from: c, reason: collision with root package name */
        private final List f14559c;

        /* renamed from: d, reason: collision with root package name */
        private final String f14560d;

        /* renamed from: e, reason: collision with root package name */
        private final String f14561e;

        /* renamed from: b3.v$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0359a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a(parcel.readString(), com.stripe.android.model.i.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String str, com.stripe.android.model.i deferredIntentParams, List externalPaymentMethods, String str2, String str3) {
            AbstractC3159y.i(deferredIntentParams, "deferredIntentParams");
            AbstractC3159y.i(externalPaymentMethods, "externalPaymentMethods");
            this.f14557a = str;
            this.f14558b = deferredIntentParams;
            this.f14559c = externalPaymentMethods;
            this.f14560d = str2;
            this.f14561e = str3;
        }

        @Override // b3.v
        public List A() {
            return AbstractC1246t.m();
        }

        @Override // b3.v
        public String F() {
            return this.f14561e;
        }

        @Override // b3.v
        public String P() {
            return this.f14560d;
        }

        @Override // b3.v
        public String S() {
            return this.f14557a;
        }

        public final com.stripe.android.model.i b() {
            return this.f14558b;
        }

        @Override // b3.v
        public String d() {
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3159y.d(this.f14557a, aVar.f14557a) && AbstractC3159y.d(this.f14558b, aVar.f14558b) && AbstractC3159y.d(this.f14559c, aVar.f14559c) && AbstractC3159y.d(this.f14560d, aVar.f14560d) && AbstractC3159y.d(this.f14561e, aVar.f14561e)) {
                return true;
            }
            return false;
        }

        @Override // b3.v
        public String getType() {
            return "deferred_intent";
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            String str = this.f14557a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode3 = ((((hashCode * 31) + this.f14558b.hashCode()) * 31) + this.f14559c.hashCode()) * 31;
            String str2 = this.f14560d;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i9 = (hashCode3 + hashCode2) * 31;
            String str3 = this.f14561e;
            if (str3 != null) {
                i8 = str3.hashCode();
            }
            return i9 + i8;
        }

        @Override // b3.v
        public List q() {
            return this.f14559c;
        }

        public String toString() {
            return "DeferredIntentType(locale=" + this.f14557a + ", deferredIntentParams=" + this.f14558b + ", externalPaymentMethods=" + this.f14559c + ", defaultPaymentMethodId=" + this.f14560d + ", customerSessionClientSecret=" + this.f14561e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f14557a);
            this.f14558b.writeToParcel(out, i8);
            out.writeStringList(this.f14559c);
            out.writeString(this.f14560d);
            out.writeString(this.f14561e);
        }

        public /* synthetic */ a(String str, com.stripe.android.model.i iVar, List list, String str2, String str3, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? Locale.getDefault().toLanguageTag() : str, iVar, list, (i8 & 8) != 0 ? null : str2, (i8 & 16) != 0 ? null : str3);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements v {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f14562a;

        /* renamed from: b, reason: collision with root package name */
        private final String f14563b;

        /* renamed from: c, reason: collision with root package name */
        private final String f14564c;

        /* renamed from: d, reason: collision with root package name */
        private final String f14565d;

        /* renamed from: e, reason: collision with root package name */
        private final List f14566e;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String clientSecret, String str, String str2, String str3, List externalPaymentMethods) {
            AbstractC3159y.i(clientSecret, "clientSecret");
            AbstractC3159y.i(externalPaymentMethods, "externalPaymentMethods");
            this.f14562a = clientSecret;
            this.f14563b = str;
            this.f14564c = str2;
            this.f14565d = str3;
            this.f14566e = externalPaymentMethods;
        }

        @Override // b3.v
        public List A() {
            return AbstractC1246t.e("payment_method_preference." + getType() + ".payment_method");
        }

        @Override // b3.v
        public String F() {
            return this.f14564c;
        }

        @Override // b3.v
        public String P() {
            return this.f14565d;
        }

        @Override // b3.v
        public String S() {
            return this.f14563b;
        }

        @Override // b3.v
        public String d() {
            return this.f14562a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3159y.d(this.f14562a, bVar.f14562a) && AbstractC3159y.d(this.f14563b, bVar.f14563b) && AbstractC3159y.d(this.f14564c, bVar.f14564c) && AbstractC3159y.d(this.f14565d, bVar.f14565d) && AbstractC3159y.d(this.f14566e, bVar.f14566e)) {
                return true;
            }
            return false;
        }

        @Override // b3.v
        public String getType() {
            return "payment_intent";
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = this.f14562a.hashCode() * 31;
            String str = this.f14563b;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = (hashCode3 + hashCode) * 31;
            String str2 = this.f14564c;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f14565d;
            if (str3 != null) {
                i8 = str3.hashCode();
            }
            return ((i10 + i8) * 31) + this.f14566e.hashCode();
        }

        @Override // b3.v
        public List q() {
            return this.f14566e;
        }

        public String toString() {
            return "PaymentIntentType(clientSecret=" + this.f14562a + ", locale=" + this.f14563b + ", customerSessionClientSecret=" + this.f14564c + ", defaultPaymentMethodId=" + this.f14565d + ", externalPaymentMethods=" + this.f14566e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f14562a);
            out.writeString(this.f14563b);
            out.writeString(this.f14564c);
            out.writeString(this.f14565d);
            out.writeStringList(this.f14566e);
        }

        public /* synthetic */ b(String str, String str2, String str3, String str4, List list, int i8, AbstractC3151p abstractC3151p) {
            this(str, (i8 & 2) != 0 ? Locale.getDefault().toLanguageTag() : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, list);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements v {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f14567a;

        /* renamed from: b, reason: collision with root package name */
        private final String f14568b;

        /* renamed from: c, reason: collision with root package name */
        private final String f14569c;

        /* renamed from: d, reason: collision with root package name */
        private final String f14570d;

        /* renamed from: e, reason: collision with root package name */
        private final List f14571e;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String clientSecret, String str, String str2, String str3, List externalPaymentMethods) {
            AbstractC3159y.i(clientSecret, "clientSecret");
            AbstractC3159y.i(externalPaymentMethods, "externalPaymentMethods");
            this.f14567a = clientSecret;
            this.f14568b = str;
            this.f14569c = str2;
            this.f14570d = str3;
            this.f14571e = externalPaymentMethods;
        }

        @Override // b3.v
        public List A() {
            return AbstractC1246t.e("payment_method_preference." + getType() + ".payment_method");
        }

        @Override // b3.v
        public String F() {
            return this.f14569c;
        }

        @Override // b3.v
        public String P() {
            return this.f14570d;
        }

        @Override // b3.v
        public String S() {
            return this.f14568b;
        }

        @Override // b3.v
        public String d() {
            return this.f14567a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (AbstractC3159y.d(this.f14567a, cVar.f14567a) && AbstractC3159y.d(this.f14568b, cVar.f14568b) && AbstractC3159y.d(this.f14569c, cVar.f14569c) && AbstractC3159y.d(this.f14570d, cVar.f14570d) && AbstractC3159y.d(this.f14571e, cVar.f14571e)) {
                return true;
            }
            return false;
        }

        @Override // b3.v
        public String getType() {
            return "setup_intent";
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = this.f14567a.hashCode() * 31;
            String str = this.f14568b;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = (hashCode3 + hashCode) * 31;
            String str2 = this.f14569c;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f14570d;
            if (str3 != null) {
                i8 = str3.hashCode();
            }
            return ((i10 + i8) * 31) + this.f14571e.hashCode();
        }

        @Override // b3.v
        public List q() {
            return this.f14571e;
        }

        public String toString() {
            return "SetupIntentType(clientSecret=" + this.f14567a + ", locale=" + this.f14568b + ", customerSessionClientSecret=" + this.f14569c + ", defaultPaymentMethodId=" + this.f14570d + ", externalPaymentMethods=" + this.f14571e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f14567a);
            out.writeString(this.f14568b);
            out.writeString(this.f14569c);
            out.writeString(this.f14570d);
            out.writeStringList(this.f14571e);
        }

        public /* synthetic */ c(String str, String str2, String str3, String str4, List list, int i8, AbstractC3151p abstractC3151p) {
            this(str, (i8 & 2) != 0 ? Locale.getDefault().toLanguageTag() : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, list);
        }
    }
}
