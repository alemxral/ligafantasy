package b3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: b3.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1876k implements v2.f {
    public static final Parcelable.Creator<C1876k> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    private final List f14470a;

    /* renamed from: b3.k$a */
    /* loaded from: classes4.dex */
    public static final class a extends e {
        public static final Parcelable.Creator<a> CREATOR = new C0356a();

        /* renamed from: c, reason: collision with root package name */
        private final String f14471c;

        /* renamed from: d, reason: collision with root package name */
        private final String f14472d;

        /* renamed from: e, reason: collision with root package name */
        private final String f14473e;

        /* renamed from: b3.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0356a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String id, String last4, String str) {
            super(id, "bank_account", null);
            AbstractC3159y.i(id, "id");
            AbstractC3159y.i(last4, "last4");
            this.f14471c = id;
            this.f14472d = last4;
            this.f14473e = str;
        }

        @Override // b3.C1876k.e
        public String b() {
            return this.f14472d;
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
            if (AbstractC3159y.d(this.f14471c, aVar.f14471c) && AbstractC3159y.d(this.f14472d, aVar.f14472d) && AbstractC3159y.d(this.f14473e, aVar.f14473e)) {
                return true;
            }
            return false;
        }

        @Override // b3.C1876k.e
        public String getId() {
            return this.f14471c;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f14471c.hashCode() * 31) + this.f14472d.hashCode()) * 31;
            String str = this.f14473e;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "BankAccount(id=" + this.f14471c + ", last4=" + this.f14472d + ", bankName=" + this.f14473e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f14471c);
            out.writeString(this.f14472d);
            out.writeString(this.f14473e);
        }
    }

    /* renamed from: b3.k$b */
    /* loaded from: classes4.dex */
    public static final class b extends e {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final String f14474c;

        /* renamed from: d, reason: collision with root package name */
        private final String f14475d;

        /* renamed from: b3.k$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String id, String last4) {
            super(id, "card", null);
            AbstractC3159y.i(id, "id");
            AbstractC3159y.i(last4, "last4");
            this.f14474c = id;
            this.f14475d = last4;
        }

        @Override // b3.C1876k.e
        public String b() {
            return this.f14475d;
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
            if (AbstractC3159y.d(this.f14474c, bVar.f14474c) && AbstractC3159y.d(this.f14475d, bVar.f14475d)) {
                return true;
            }
            return false;
        }

        @Override // b3.C1876k.e
        public String getId() {
            return this.f14474c;
        }

        public int hashCode() {
            return (this.f14474c.hashCode() * 31) + this.f14475d.hashCode();
        }

        public String toString() {
            return "Card(id=" + this.f14474c + ", last4=" + this.f14475d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f14474c);
            out.writeString(this.f14475d);
        }
    }

    /* renamed from: b3.k$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1876k createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(parcel.readParcelable(C1876k.class.getClassLoader()));
            }
            return new C1876k(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1876k[] newArray(int i8) {
            return new C1876k[i8];
        }
    }

    /* renamed from: b3.k$d */
    /* loaded from: classes4.dex */
    public static final class d extends e {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final String f14476c;

        /* renamed from: d, reason: collision with root package name */
        private final String f14477d;

        /* renamed from: b3.k$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String id, String last4) {
            super(id, "card", null);
            AbstractC3159y.i(id, "id");
            AbstractC3159y.i(last4, "last4");
            this.f14476c = id;
            this.f14477d = last4;
        }

        @Override // b3.C1876k.e
        public String b() {
            return this.f14477d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (AbstractC3159y.d(this.f14476c, dVar.f14476c) && AbstractC3159y.d(this.f14477d, dVar.f14477d)) {
                return true;
            }
            return false;
        }

        @Override // b3.C1876k.e
        public String getId() {
            return this.f14476c;
        }

        public int hashCode() {
            return (this.f14476c.hashCode() * 31) + this.f14477d.hashCode();
        }

        public String toString() {
            return "Passthrough(id=" + this.f14476c + ", last4=" + this.f14477d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f14476c);
            out.writeString(this.f14477d);
        }
    }

    /* renamed from: b3.k$e */
    /* loaded from: classes4.dex */
    public static abstract class e implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f14478a;

        /* renamed from: b, reason: collision with root package name */
        private final String f14479b;

        public /* synthetic */ e(String str, String str2, AbstractC3151p abstractC3151p) {
            this(str, str2);
        }

        public abstract String b();

        public abstract String getId();

        private e(String str, String str2) {
            this.f14478a = str;
            this.f14479b = str2;
        }
    }

    public C1876k(List paymentDetails) {
        AbstractC3159y.i(paymentDetails, "paymentDetails");
        this.f14470a = paymentDetails;
    }

    public final List b() {
        return this.f14470a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1876k) && AbstractC3159y.d(this.f14470a, ((C1876k) obj).f14470a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f14470a.hashCode();
    }

    public String toString() {
        return "ConsumerPaymentDetails(paymentDetails=" + this.f14470a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        List list = this.f14470a;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i8);
        }
    }
}
