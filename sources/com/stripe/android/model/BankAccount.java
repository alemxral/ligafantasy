package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class BankAccount implements v2.f, Parcelable {
    public static final Parcelable.Creator<BankAccount> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f23969a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23970b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f23971c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23972d;

    /* renamed from: e, reason: collision with root package name */
    private final String f23973e;

    /* renamed from: f, reason: collision with root package name */
    private final String f23974f;

    /* renamed from: g, reason: collision with root package name */
    private final String f23975g;

    /* renamed from: h, reason: collision with root package name */
    private final String f23976h;

    /* renamed from: i, reason: collision with root package name */
    private final String f23977i;

    /* renamed from: j, reason: collision with root package name */
    private final Status f23978j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final a f23979b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f23980c = new Status("New", 0, "new");

        /* renamed from: d, reason: collision with root package name */
        public static final Status f23981d = new Status("Validated", 1, "validated");

        /* renamed from: e, reason: collision with root package name */
        public static final Status f23982e = new Status("Verified", 2, "verified");

        /* renamed from: f, reason: collision with root package name */
        public static final Status f23983f = new Status("VerificationFailed", 3, "verification_failed");

        /* renamed from: g, reason: collision with root package name */
        public static final Status f23984g = new Status("Errored", 4, "errored");

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ Status[] f23985h;

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ R5.a f23986i;

        /* renamed from: a, reason: collision with root package name */
        private final String f23987a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final Status a(String str) {
                Object obj;
                Iterator<E> it = Status.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((Status) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (Status) obj;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            Status[] a8 = a();
            f23985h = a8;
            f23986i = R5.b.a(a8);
            f23979b = new a(null);
        }

        private Status(String str, int i8, String str2) {
            this.f23987a = str2;
        }

        private static final /* synthetic */ Status[] a() {
            return new Status[]{f23980c, f23981d, f23982e, f23983f, f23984g};
        }

        public static R5.a c() {
            return f23986i;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f23985h.clone();
        }

        public final String b() {
            return this.f23987a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f23987a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final a f23988b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f23989c = new Type("Company", 0, "company");

        /* renamed from: d, reason: collision with root package name */
        public static final Type f23990d = new Type("Individual", 1, "individual");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ Type[] f23991e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ R5.a f23992f;

        /* renamed from: a, reason: collision with root package name */
        private final String f23993a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final Type a(String str) {
                Object obj;
                Iterator<E> it = Type.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((Type) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (Type) obj;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            Type[] a8 = a();
            f23991e = a8;
            f23992f = R5.b.a(a8);
            f23988b = new a(null);
        }

        private Type(String str, int i8, String str2) {
            this.f23993a = str2;
        }

        private static final /* synthetic */ Type[] a() {
            return new Type[]{f23989c, f23990d};
        }

        public static R5.a c() {
            return f23992f;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f23991e.clone();
        }

        public final String b() {
            return this.f23993a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f23993a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BankAccount createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new BankAccount(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BankAccount[] newArray(int i8) {
            return new BankAccount[i8];
        }
    }

    public BankAccount(String str, String str2, Type type, String str3, String str4, String str5, String str6, String str7, String str8, Status status) {
        this.f23969a = str;
        this.f23970b = str2;
        this.f23971c = type;
        this.f23972d = str3;
        this.f23973e = str4;
        this.f23974f = str5;
        this.f23975g = str6;
        this.f23976h = str7;
        this.f23977i = str8;
        this.f23978j = status;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankAccount)) {
            return false;
        }
        BankAccount bankAccount = (BankAccount) obj;
        return AbstractC3159y.d(this.f23969a, bankAccount.f23969a) && AbstractC3159y.d(this.f23970b, bankAccount.f23970b) && this.f23971c == bankAccount.f23971c && AbstractC3159y.d(this.f23972d, bankAccount.f23972d) && AbstractC3159y.d(this.f23973e, bankAccount.f23973e) && AbstractC3159y.d(this.f23974f, bankAccount.f23974f) && AbstractC3159y.d(this.f23975g, bankAccount.f23975g) && AbstractC3159y.d(this.f23976h, bankAccount.f23976h) && AbstractC3159y.d(this.f23977i, bankAccount.f23977i) && this.f23978j == bankAccount.f23978j;
    }

    public int hashCode() {
        String str = this.f23969a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f23970b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Type type = this.f23971c;
        int hashCode3 = (hashCode2 + (type == null ? 0 : type.hashCode())) * 31;
        String str3 = this.f23972d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f23973e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f23974f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f23975g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f23976h;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f23977i;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Status status = this.f23978j;
        return hashCode9 + (status != null ? status.hashCode() : 0);
    }

    public String toString() {
        return "BankAccount(id=" + this.f23969a + ", accountHolderName=" + this.f23970b + ", accountHolderType=" + this.f23971c + ", bankName=" + this.f23972d + ", countryCode=" + this.f23973e + ", currency=" + this.f23974f + ", fingerprint=" + this.f23975g + ", last4=" + this.f23976h + ", routingNumber=" + this.f23977i + ", status=" + this.f23978j + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f23969a);
        out.writeString(this.f23970b);
        Type type = this.f23971c;
        if (type == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(type.name());
        }
        out.writeString(this.f23972d);
        out.writeString(this.f23973e);
        out.writeString(this.f23974f);
        out.writeString(this.f23975g);
        out.writeString(this.f23976h);
        out.writeString(this.f23977i);
        Status status = this.f23978j;
        if (status == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(status.name());
        }
    }
}
