package b3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: b3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1866a implements v2.f {
    public static final Parcelable.Creator<C1866a> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    private final C1868c f14382a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14383b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC0355a f14384c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14385d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: b3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class EnumC0355a {

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC0355a f14386c = new EnumC0355a("Visa", 0, "VISA", EnumC1870e.f14425o);

        /* renamed from: d, reason: collision with root package name */
        public static final EnumC0355a f14387d = new EnumC0355a("Mastercard", 1, "MASTERCARD", EnumC1870e.f14426p);

        /* renamed from: e, reason: collision with root package name */
        public static final EnumC0355a f14388e = new EnumC0355a("AmericanExpress", 2, "AMERICAN_EXPRESS", EnumC1870e.f14427q);

        /* renamed from: f, reason: collision with root package name */
        public static final EnumC0355a f14389f = new EnumC0355a("JCB", 3, "JCB", EnumC1870e.f14429s);

        /* renamed from: g, reason: collision with root package name */
        public static final EnumC0355a f14390g = new EnumC0355a("DinersClub", 4, "DINERS_CLUB", EnumC1870e.f14430t);

        /* renamed from: h, reason: collision with root package name */
        public static final EnumC0355a f14391h = new EnumC0355a("Discover", 5, "DISCOVER", EnumC1870e.f14428r);

        /* renamed from: i, reason: collision with root package name */
        public static final EnumC0355a f14392i = new EnumC0355a("UnionPay", 6, "UNIONPAY", EnumC1870e.f14431u);

        /* renamed from: j, reason: collision with root package name */
        public static final EnumC0355a f14393j = new EnumC0355a("CartesBancaires", 7, "CARTES_BANCAIRES", EnumC1870e.f14432v);

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumC0355a[] f14394k;

        /* renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ R5.a f14395l;

        /* renamed from: a, reason: collision with root package name */
        private final String f14396a;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC1870e f14397b;

        static {
            EnumC0355a[] a8 = a();
            f14394k = a8;
            f14395l = R5.b.a(a8);
        }

        private EnumC0355a(String str, int i8, String str2, EnumC1870e enumC1870e) {
            this.f14396a = str2;
            this.f14397b = enumC1870e;
        }

        private static final /* synthetic */ EnumC0355a[] a() {
            return new EnumC0355a[]{f14386c, f14387d, f14388e, f14389f, f14390g, f14391h, f14392i, f14393j};
        }

        public static R5.a d() {
            return f14395l;
        }

        public static EnumC0355a valueOf(String str) {
            return (EnumC0355a) Enum.valueOf(EnumC0355a.class, str);
        }

        public static EnumC0355a[] values() {
            return (EnumC0355a[]) f14394k.clone();
        }

        public final EnumC1870e b() {
            return this.f14397b;
        }

        public final String c() {
            return this.f14396a;
        }
    }

    /* renamed from: b3.a$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1866a createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C1866a(C1868c.CREATOR.createFromParcel(parcel), parcel.readInt(), EnumC0355a.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1866a[] newArray(int i8) {
            return new C1866a[i8];
        }
    }

    public C1866a(C1868c binRange, int i8, EnumC0355a brandInfo, String str) {
        AbstractC3159y.i(binRange, "binRange");
        AbstractC3159y.i(brandInfo, "brandInfo");
        this.f14382a = binRange;
        this.f14383b = i8;
        this.f14384c = brandInfo;
        this.f14385d = str;
    }

    public final C1868c b() {
        return this.f14382a;
    }

    public final EnumC1870e c() {
        return this.f14384c.b();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f14383b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1866a)) {
            return false;
        }
        C1866a c1866a = (C1866a) obj;
        if (AbstractC3159y.d(this.f14382a, c1866a.f14382a) && this.f14383b == c1866a.f14383b && this.f14384c == c1866a.f14384c && AbstractC3159y.d(this.f14385d, c1866a.f14385d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.f14382a.hashCode() * 31) + this.f14383b) * 31) + this.f14384c.hashCode()) * 31;
        String str = this.f14385d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "AccountRange(binRange=" + this.f14382a + ", panLength=" + this.f14383b + ", brandInfo=" + this.f14384c + ", country=" + this.f14385d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        this.f14382a.writeToParcel(out, i8);
        out.writeInt(this.f14383b);
        out.writeString(this.f14384c.name());
        out.writeString(this.f14385d);
    }

    public /* synthetic */ C1866a(C1868c c1868c, int i8, EnumC0355a enumC0355a, String str, int i9, AbstractC3151p abstractC3151p) {
        this(c1868c, i8, enumC0355a, (i9 & 8) != 0 ? null : str);
    }
}
