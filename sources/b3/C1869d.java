package b3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: b3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1869d implements v2.f, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f14402a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f14403b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14404c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14405d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14406e;

    /* renamed from: f, reason: collision with root package name */
    private final String f14407f;

    /* renamed from: g, reason: collision with root package name */
    private final String f14408g;

    /* renamed from: h, reason: collision with root package name */
    private final String f14409h;

    /* renamed from: i, reason: collision with root package name */
    private final String f14410i;

    /* renamed from: j, reason: collision with root package name */
    private final String f14411j;

    /* renamed from: k, reason: collision with root package name */
    private final String f14412k;

    /* renamed from: l, reason: collision with root package name */
    private final String f14413l;

    /* renamed from: m, reason: collision with root package name */
    private final EnumC1870e f14414m;

    /* renamed from: n, reason: collision with root package name */
    private final EnumC1871f f14415n;

    /* renamed from: o, reason: collision with root package name */
    private final String f14416o;

    /* renamed from: p, reason: collision with root package name */
    private final String f14417p;

    /* renamed from: q, reason: collision with root package name */
    private final String f14418q;

    /* renamed from: r, reason: collision with root package name */
    private final String f14419r;

    /* renamed from: s, reason: collision with root package name */
    private final String f14420s;

    /* renamed from: t, reason: collision with root package name */
    private final String f14421t;

    /* renamed from: u, reason: collision with root package name */
    private final K f14422u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f14401v = new a(null);
    public static final Parcelable.Creator<C1869d> CREATOR = new b();

    /* renamed from: b3.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ EnumC1870e a(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -993787207:
                        if (str.equals("Diners Club")) {
                            return EnumC1870e.f14430t;
                        }
                        break;
                    case -298759312:
                        if (str.equals("American Express")) {
                            return EnumC1870e.f14427q;
                        }
                        break;
                    case -231891079:
                        if (str.equals("UnionPay")) {
                            return EnumC1870e.f14431u;
                        }
                        break;
                    case -46205774:
                        if (str.equals("MasterCard")) {
                            return EnumC1870e.f14426p;
                        }
                        break;
                    case 73257:
                        if (str.equals("JCB")) {
                            return EnumC1870e.f14429s;
                        }
                        break;
                    case 2666593:
                        if (str.equals("Visa")) {
                            return EnumC1870e.f14425o;
                        }
                        break;
                    case 337828873:
                        if (str.equals("Discover")) {
                            return EnumC1870e.f14428r;
                        }
                        break;
                }
            }
            return EnumC1870e.f14433w;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: b3.d$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1869d createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer valueOf2;
            EnumC1871f valueOf3;
            K valueOf4;
            AbstractC3159y.i(parcel, "parcel");
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Integer.valueOf(parcel.readInt());
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            EnumC1870e valueOf5 = EnumC1870e.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = EnumC1871f.valueOf(parcel.readString());
            }
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = K.valueOf(parcel.readString());
            }
            return new C1869d(valueOf, valueOf2, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, valueOf5, valueOf3, readString11, readString12, readString13, readString14, readString15, readString16, valueOf4);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1869d[] newArray(int i8) {
            return new C1869d[i8];
        }
    }

    public C1869d(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, EnumC1870e brand, EnumC1871f enumC1871f, String str11, String str12, String str13, String str14, String str15, String str16, K k8) {
        AbstractC3159y.i(brand, "brand");
        this.f14402a = num;
        this.f14403b = num2;
        this.f14404c = str;
        this.f14405d = str2;
        this.f14406e = str3;
        this.f14407f = str4;
        this.f14408g = str5;
        this.f14409h = str6;
        this.f14410i = str7;
        this.f14411j = str8;
        this.f14412k = str9;
        this.f14413l = str10;
        this.f14414m = brand;
        this.f14415n = enumC1871f;
        this.f14416o = str11;
        this.f14417p = str12;
        this.f14418q = str13;
        this.f14419r = str14;
        this.f14420s = str15;
        this.f14421t = str16;
        this.f14422u = k8;
    }

    public final K b() {
        return this.f14422u;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1869d)) {
            return false;
        }
        C1869d c1869d = (C1869d) obj;
        if (AbstractC3159y.d(this.f14402a, c1869d.f14402a) && AbstractC3159y.d(this.f14403b, c1869d.f14403b) && AbstractC3159y.d(this.f14404c, c1869d.f14404c) && AbstractC3159y.d(this.f14405d, c1869d.f14405d) && AbstractC3159y.d(this.f14406e, c1869d.f14406e) && AbstractC3159y.d(this.f14407f, c1869d.f14407f) && AbstractC3159y.d(this.f14408g, c1869d.f14408g) && AbstractC3159y.d(this.f14409h, c1869d.f14409h) && AbstractC3159y.d(this.f14410i, c1869d.f14410i) && AbstractC3159y.d(this.f14411j, c1869d.f14411j) && AbstractC3159y.d(this.f14412k, c1869d.f14412k) && AbstractC3159y.d(this.f14413l, c1869d.f14413l) && this.f14414m == c1869d.f14414m && this.f14415n == c1869d.f14415n && AbstractC3159y.d(this.f14416o, c1869d.f14416o) && AbstractC3159y.d(this.f14417p, c1869d.f14417p) && AbstractC3159y.d(this.f14418q, c1869d.f14418q) && AbstractC3159y.d(this.f14419r, c1869d.f14419r) && AbstractC3159y.d(this.f14420s, c1869d.f14420s) && AbstractC3159y.d(this.f14421t, c1869d.f14421t) && this.f14422u == c1869d.f14422u) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        Integer num = this.f14402a;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i9 = hashCode * 31;
        Integer num2 = this.f14403b;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str = this.f14404c;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str2 = this.f14405d;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str3 = this.f14406e;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str4 = this.f14407f;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str5 = this.f14408g;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        String str6 = this.f14409h;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        String str7 = this.f14410i;
        if (str7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str7.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        String str8 = this.f14411j;
        if (str8 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str8.hashCode();
        }
        int i18 = (i17 + hashCode10) * 31;
        String str9 = this.f14412k;
        if (str9 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str9.hashCode();
        }
        int i19 = (i18 + hashCode11) * 31;
        String str10 = this.f14413l;
        if (str10 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str10.hashCode();
        }
        int hashCode20 = (((i19 + hashCode12) * 31) + this.f14414m.hashCode()) * 31;
        EnumC1871f enumC1871f = this.f14415n;
        if (enumC1871f == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = enumC1871f.hashCode();
        }
        int i20 = (hashCode20 + hashCode13) * 31;
        String str11 = this.f14416o;
        if (str11 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str11.hashCode();
        }
        int i21 = (i20 + hashCode14) * 31;
        String str12 = this.f14417p;
        if (str12 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str12.hashCode();
        }
        int i22 = (i21 + hashCode15) * 31;
        String str13 = this.f14418q;
        if (str13 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str13.hashCode();
        }
        int i23 = (i22 + hashCode16) * 31;
        String str14 = this.f14419r;
        if (str14 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str14.hashCode();
        }
        int i24 = (i23 + hashCode17) * 31;
        String str15 = this.f14420s;
        if (str15 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str15.hashCode();
        }
        int i25 = (i24 + hashCode18) * 31;
        String str16 = this.f14421t;
        if (str16 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = str16.hashCode();
        }
        int i26 = (i25 + hashCode19) * 31;
        K k8 = this.f14422u;
        if (k8 != null) {
            i8 = k8.hashCode();
        }
        return i26 + i8;
    }

    public String toString() {
        return "Card(expMonth=" + this.f14402a + ", expYear=" + this.f14403b + ", name=" + this.f14404c + ", addressLine1=" + this.f14405d + ", addressLine1Check=" + this.f14406e + ", addressLine2=" + this.f14407f + ", addressCity=" + this.f14408g + ", addressState=" + this.f14409h + ", addressZip=" + this.f14410i + ", addressZipCheck=" + this.f14411j + ", addressCountry=" + this.f14412k + ", last4=" + this.f14413l + ", brand=" + this.f14414m + ", funding=" + this.f14415n + ", fingerprint=" + this.f14416o + ", country=" + this.f14417p + ", currency=" + this.f14418q + ", customerId=" + this.f14419r + ", cvcCheck=" + this.f14420s + ", id=" + this.f14421t + ", tokenizationMethod=" + this.f14422u + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        Integer num = this.f14402a;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.f14403b;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        out.writeString(this.f14404c);
        out.writeString(this.f14405d);
        out.writeString(this.f14406e);
        out.writeString(this.f14407f);
        out.writeString(this.f14408g);
        out.writeString(this.f14409h);
        out.writeString(this.f14410i);
        out.writeString(this.f14411j);
        out.writeString(this.f14412k);
        out.writeString(this.f14413l);
        out.writeString(this.f14414m.name());
        EnumC1871f enumC1871f = this.f14415n;
        if (enumC1871f == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(enumC1871f.name());
        }
        out.writeString(this.f14416o);
        out.writeString(this.f14417p);
        out.writeString(this.f14418q);
        out.writeString(this.f14419r);
        out.writeString(this.f14420s);
        out.writeString(this.f14421t);
        K k8 = this.f14422u;
        if (k8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(k8.name());
        }
    }
}
