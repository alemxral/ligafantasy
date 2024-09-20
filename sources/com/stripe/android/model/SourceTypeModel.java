package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.os.EnvironmentCompat;
import b3.EnumC1870e;
import b3.EnumC1871f;
import b3.K;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class SourceTypeModel implements v2.f {

    /* loaded from: classes4.dex */
    public static final class Card extends SourceTypeModel {
        public static final Parcelable.Creator<Card> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f24090a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24091b;

        /* renamed from: c, reason: collision with root package name */
        private final EnumC1870e f24092c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24093d;

        /* renamed from: e, reason: collision with root package name */
        private final String f24094e;

        /* renamed from: f, reason: collision with root package name */
        private final String f24095f;

        /* renamed from: g, reason: collision with root package name */
        private final Integer f24096g;

        /* renamed from: h, reason: collision with root package name */
        private final Integer f24097h;

        /* renamed from: i, reason: collision with root package name */
        private final EnumC1871f f24098i;

        /* renamed from: j, reason: collision with root package name */
        private final String f24099j;

        /* renamed from: k, reason: collision with root package name */
        private final ThreeDSecureStatus f24100k;

        /* renamed from: l, reason: collision with root package name */
        private final K f24101l;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class ThreeDSecureStatus {

            /* renamed from: b, reason: collision with root package name */
            public static final a f24102b;

            /* renamed from: c, reason: collision with root package name */
            public static final ThreeDSecureStatus f24103c = new ThreeDSecureStatus("Required", 0, "required");

            /* renamed from: d, reason: collision with root package name */
            public static final ThreeDSecureStatus f24104d = new ThreeDSecureStatus("Optional", 1, "optional");

            /* renamed from: e, reason: collision with root package name */
            public static final ThreeDSecureStatus f24105e = new ThreeDSecureStatus("NotSupported", 2, "not_supported");

            /* renamed from: f, reason: collision with root package name */
            public static final ThreeDSecureStatus f24106f = new ThreeDSecureStatus("Recommended", 3, "recommended");

            /* renamed from: g, reason: collision with root package name */
            public static final ThreeDSecureStatus f24107g = new ThreeDSecureStatus("Unknown", 4, EnvironmentCompat.MEDIA_UNKNOWN);

            /* renamed from: h, reason: collision with root package name */
            private static final /* synthetic */ ThreeDSecureStatus[] f24108h;

            /* renamed from: i, reason: collision with root package name */
            private static final /* synthetic */ R5.a f24109i;

            /* renamed from: a, reason: collision with root package name */
            private final String f24110a;

            /* loaded from: classes4.dex */
            public static final class a {
                private a() {
                }

                public final ThreeDSecureStatus a(String str) {
                    Object obj;
                    Iterator<E> it = ThreeDSecureStatus.c().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (AbstractC3159y.d(((ThreeDSecureStatus) obj).f24110a, str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    return (ThreeDSecureStatus) obj;
                }

                public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                    this();
                }
            }

            static {
                ThreeDSecureStatus[] a8 = a();
                f24108h = a8;
                f24109i = R5.b.a(a8);
                f24102b = new a(null);
            }

            private ThreeDSecureStatus(String str, int i8, String str2) {
                this.f24110a = str2;
            }

            private static final /* synthetic */ ThreeDSecureStatus[] a() {
                return new ThreeDSecureStatus[]{f24103c, f24104d, f24105e, f24106f, f24107g};
            }

            public static R5.a c() {
                return f24109i;
            }

            public static ThreeDSecureStatus valueOf(String str) {
                return (ThreeDSecureStatus) Enum.valueOf(ThreeDSecureStatus.class, str);
            }

            public static ThreeDSecureStatus[] values() {
                return (ThreeDSecureStatus[]) f24108h.clone();
            }

            @Override // java.lang.Enum
            @Keep
            public String toString() {
                return this.f24110a;
            }
        }

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Card createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new Card(parcel.readString(), parcel.readString(), EnumC1870e.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : EnumC1871f.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : ThreeDSecureStatus.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : K.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Card[] newArray(int i8) {
                return new Card[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(String str, String str2, EnumC1870e brand, String str3, String str4, String str5, Integer num, Integer num2, EnumC1871f enumC1871f, String str6, ThreeDSecureStatus threeDSecureStatus, K k8) {
            super(null);
            AbstractC3159y.i(brand, "brand");
            this.f24090a = str;
            this.f24091b = str2;
            this.f24092c = brand;
            this.f24093d = str3;
            this.f24094e = str4;
            this.f24095f = str5;
            this.f24096g = num;
            this.f24097h = num2;
            this.f24098i = enumC1871f;
            this.f24099j = str6;
            this.f24100k = threeDSecureStatus;
            this.f24101l = k8;
        }

        public final K b() {
            return this.f24101l;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Card)) {
                return false;
            }
            Card card = (Card) obj;
            return AbstractC3159y.d(this.f24090a, card.f24090a) && AbstractC3159y.d(this.f24091b, card.f24091b) && this.f24092c == card.f24092c && AbstractC3159y.d(this.f24093d, card.f24093d) && AbstractC3159y.d(this.f24094e, card.f24094e) && AbstractC3159y.d(this.f24095f, card.f24095f) && AbstractC3159y.d(this.f24096g, card.f24096g) && AbstractC3159y.d(this.f24097h, card.f24097h) && this.f24098i == card.f24098i && AbstractC3159y.d(this.f24099j, card.f24099j) && this.f24100k == card.f24100k && this.f24101l == card.f24101l;
        }

        public int hashCode() {
            String str = this.f24090a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24091b;
            int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f24092c.hashCode()) * 31;
            String str3 = this.f24093d;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f24094e;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f24095f;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.f24096g;
            int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f24097h;
            int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
            EnumC1871f enumC1871f = this.f24098i;
            int hashCode8 = (hashCode7 + (enumC1871f == null ? 0 : enumC1871f.hashCode())) * 31;
            String str6 = this.f24099j;
            int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            ThreeDSecureStatus threeDSecureStatus = this.f24100k;
            int hashCode10 = (hashCode9 + (threeDSecureStatus == null ? 0 : threeDSecureStatus.hashCode())) * 31;
            K k8 = this.f24101l;
            return hashCode10 + (k8 != null ? k8.hashCode() : 0);
        }

        public String toString() {
            return "Card(addressLine1Check=" + this.f24090a + ", addressZipCheck=" + this.f24091b + ", brand=" + this.f24092c + ", country=" + this.f24093d + ", cvcCheck=" + this.f24094e + ", dynamicLast4=" + this.f24095f + ", expiryMonth=" + this.f24096g + ", expiryYear=" + this.f24097h + ", funding=" + this.f24098i + ", last4=" + this.f24099j + ", threeDSecureStatus=" + this.f24100k + ", tokenizationMethod=" + this.f24101l + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24090a);
            out.writeString(this.f24091b);
            out.writeString(this.f24092c.name());
            out.writeString(this.f24093d);
            out.writeString(this.f24094e);
            out.writeString(this.f24095f);
            Integer num = this.f24096g;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Integer num2 = this.f24097h;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
            EnumC1871f enumC1871f = this.f24098i;
            if (enumC1871f == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(enumC1871f.name());
            }
            out.writeString(this.f24099j);
            ThreeDSecureStatus threeDSecureStatus = this.f24100k;
            if (threeDSecureStatus == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(threeDSecureStatus.name());
            }
            K k8 = this.f24101l;
            if (k8 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(k8.name());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class a extends SourceTypeModel {
        public static final Parcelable.Creator<a> CREATOR = new C0479a();

        /* renamed from: a, reason: collision with root package name */
        private final String f24111a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24112b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24113c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24114d;

        /* renamed from: e, reason: collision with root package name */
        private final String f24115e;

        /* renamed from: f, reason: collision with root package name */
        private final String f24116f;

        /* renamed from: g, reason: collision with root package name */
        private final String f24117g;

        /* renamed from: com.stripe.android.model.SourceTypeModel$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0479a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            super(null);
            this.f24111a = str;
            this.f24112b = str2;
            this.f24113c = str3;
            this.f24114d = str4;
            this.f24115e = str5;
            this.f24116f = str6;
            this.f24117g = str7;
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
            return AbstractC3159y.d(this.f24111a, aVar.f24111a) && AbstractC3159y.d(this.f24112b, aVar.f24112b) && AbstractC3159y.d(this.f24113c, aVar.f24113c) && AbstractC3159y.d(this.f24114d, aVar.f24114d) && AbstractC3159y.d(this.f24115e, aVar.f24115e) && AbstractC3159y.d(this.f24116f, aVar.f24116f) && AbstractC3159y.d(this.f24117g, aVar.f24117g);
        }

        public int hashCode() {
            String str = this.f24111a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24112b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24113c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f24114d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f24115e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f24116f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f24117g;
            return hashCode6 + (str7 != null ? str7.hashCode() : 0);
        }

        public String toString() {
            return "SepaDebit(bankCode=" + this.f24111a + ", branchCode=" + this.f24112b + ", country=" + this.f24113c + ", fingerPrint=" + this.f24114d + ", last4=" + this.f24115e + ", mandateReference=" + this.f24116f + ", mandateUrl=" + this.f24117g + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24111a);
            out.writeString(this.f24112b);
            out.writeString(this.f24113c);
            out.writeString(this.f24114d);
            out.writeString(this.f24115e);
            out.writeString(this.f24116f);
            out.writeString(this.f24117g);
        }
    }

    private SourceTypeModel() {
    }

    public /* synthetic */ SourceTypeModel(AbstractC3151p abstractC3151p) {
        this();
    }
}
