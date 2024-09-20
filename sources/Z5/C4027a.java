package z5;

import C6.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;
import y5.t;

/* renamed from: z5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4027a implements Parcelable {
    public static final C0930a CREATOR = new C0930a();

    /* renamed from: a, reason: collision with root package name */
    public final String f40410a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40411b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40412c;

    /* renamed from: d, reason: collision with root package name */
    public final String f40413d;

    /* renamed from: e, reason: collision with root package name */
    public final String f40414e;

    /* renamed from: f, reason: collision with root package name */
    public final String f40415f;

    /* renamed from: g, reason: collision with root package name */
    public final String f40416g;

    /* renamed from: h, reason: collision with root package name */
    public final String f40417h;

    /* renamed from: i, reason: collision with root package name */
    public final String f40418i;

    /* renamed from: j, reason: collision with root package name */
    public final String f40419j;

    /* renamed from: k, reason: collision with root package name */
    public final String f40420k;

    /* renamed from: l, reason: collision with root package name */
    public final String f40421l;

    /* renamed from: m, reason: collision with root package name */
    public final int f40422m;

    /* renamed from: n, reason: collision with root package name */
    public final R7.e f40423n;

    /* renamed from: o, reason: collision with root package name */
    public final String f40424o;

    /* renamed from: p, reason: collision with root package name */
    public final String f40425p;

    /* renamed from: z5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0930a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            AbstractC3159y.i(parcel, "parcel");
            AbstractC3159y.i(parcel, "parcel");
            String readString = parcel.readString();
            if (readString == null) {
                str = "";
            } else {
                str = readString;
            }
            String readString2 = parcel.readString();
            if (readString2 == null) {
                str2 = "";
            } else {
                str2 = readString2;
            }
            String readString3 = parcel.readString();
            if (readString3 == null) {
                str3 = "";
            } else {
                str3 = readString3;
            }
            String readString4 = parcel.readString();
            if (readString4 == null) {
                str4 = "";
            } else {
                str4 = readString4;
            }
            String readString5 = parcel.readString();
            if (readString5 == null) {
                str5 = "";
            } else {
                str5 = readString5;
            }
            String readString6 = parcel.readString();
            if (readString6 == null) {
                str6 = "";
            } else {
                str6 = readString6;
            }
            String readString7 = parcel.readString();
            if (readString7 == null) {
                str7 = "";
            } else {
                str7 = readString7;
            }
            String readString8 = parcel.readString();
            if (readString8 == null) {
                str8 = "";
            } else {
                str8 = readString8;
            }
            String readString9 = parcel.readString();
            if (readString9 == null) {
                str9 = "";
            } else {
                str9 = readString9;
            }
            String readString10 = parcel.readString();
            if (readString10 == null) {
                str10 = "";
            } else {
                str10 = readString10;
            }
            String readString11 = parcel.readString();
            if (readString11 == null) {
                str11 = "";
            } else {
                str11 = readString11;
            }
            String readString12 = parcel.readString();
            if (readString12 == null) {
                str12 = "";
            } else {
                str12 = readString12;
            }
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            R7.e eVar = R7.e.IAB_VENDOR;
            if (readInt2 != 1) {
                R7.e eVar2 = R7.e.NON_IAB_VENDOR;
                if (readInt2 != 2) {
                    eVar2 = R7.e.GOOGLE_VENDOR;
                    if (readInt2 != 3) {
                        eVar2 = R7.e.PUBLISHER_VENDOR;
                        if (readInt2 != 4) {
                            eVar2 = R7.e.PURPOSE;
                            if (readInt2 != 5) {
                                eVar2 = R7.e.SPECIAL_PURPOSE;
                                if (readInt2 != 6) {
                                    eVar2 = R7.e.FEATURES;
                                    if (readInt2 != 7) {
                                        eVar2 = R7.e.SPECIAL_FEATURE;
                                        if (readInt2 != 8) {
                                            eVar2 = R7.e.GOOGLE_BASIC_CONSENT_PURPOSE;
                                            if (readInt2 != 9) {
                                                R7.e eVar3 = R7.e.PURPOSE_PARTNER;
                                                if (readInt2 == 10) {
                                                    eVar = eVar3;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                eVar = eVar2;
            }
            String readString13 = parcel.readString();
            if (readString13 == null) {
                str13 = "";
            } else {
                str13 = readString13;
            }
            String readString14 = parcel.readString();
            if (readString14 == null) {
                str14 = "";
            } else {
                str14 = readString14;
            }
            return new C4027a(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, readInt, eVar, str13, str14);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i8) {
            return new C4027a[i8];
        }
    }

    public C4027a(String name, String str, String purposes, String legitimateInterests, String specialPurposes, String features, String specialFeatures, String dataDeclarations, String privacyPolicy, String cookieMaxAge, String usesNonCookieAccess, String dataRetention, int i8, R7.e switchItemType, String disclosuresUrl, String disclosuresErrorLabel) {
        AbstractC3159y.i(name, "name");
        AbstractC3159y.i(purposes, "purposes");
        AbstractC3159y.i(legitimateInterests, "legitimateInterests");
        AbstractC3159y.i(specialPurposes, "specialPurposes");
        AbstractC3159y.i(features, "features");
        AbstractC3159y.i(specialFeatures, "specialFeatures");
        AbstractC3159y.i(dataDeclarations, "dataDeclarations");
        AbstractC3159y.i(privacyPolicy, "privacyPolicy");
        AbstractC3159y.i(cookieMaxAge, "cookieMaxAge");
        AbstractC3159y.i(usesNonCookieAccess, "usesNonCookieAccess");
        AbstractC3159y.i(dataRetention, "dataRetention");
        AbstractC3159y.i(switchItemType, "switchItemType");
        AbstractC3159y.i(disclosuresUrl, "disclosuresUrl");
        AbstractC3159y.i(disclosuresErrorLabel, "disclosuresErrorLabel");
        this.f40410a = name;
        this.f40411b = str;
        this.f40412c = purposes;
        this.f40413d = legitimateInterests;
        this.f40414e = specialPurposes;
        this.f40415f = features;
        this.f40416g = specialFeatures;
        this.f40417h = dataDeclarations;
        this.f40418i = privacyPolicy;
        this.f40419j = cookieMaxAge;
        this.f40420k = usesNonCookieAccess;
        this.f40421l = dataRetention;
        this.f40422m = i8;
        this.f40423n = switchItemType;
        this.f40424o = disclosuresUrl;
        this.f40425p = disclosuresErrorLabel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4027a)) {
            return false;
        }
        C4027a c4027a = (C4027a) obj;
        if (AbstractC3159y.d(this.f40410a, c4027a.f40410a) && AbstractC3159y.d(this.f40411b, c4027a.f40411b) && AbstractC3159y.d(this.f40412c, c4027a.f40412c) && AbstractC3159y.d(this.f40413d, c4027a.f40413d) && AbstractC3159y.d(this.f40414e, c4027a.f40414e) && AbstractC3159y.d(this.f40415f, c4027a.f40415f) && AbstractC3159y.d(this.f40416g, c4027a.f40416g) && AbstractC3159y.d(this.f40417h, c4027a.f40417h) && AbstractC3159y.d(this.f40418i, c4027a.f40418i) && AbstractC3159y.d(this.f40419j, c4027a.f40419j) && AbstractC3159y.d(this.f40420k, c4027a.f40420k) && AbstractC3159y.d(this.f40421l, c4027a.f40421l) && this.f40422m == c4027a.f40422m && this.f40423n == c4027a.f40423n && AbstractC3159y.d(this.f40424o, c4027a.f40424o) && AbstractC3159y.d(this.f40425p, c4027a.f40425p)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f40410a.hashCode() * 31;
        String str = this.f40411b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f40425p.hashCode() + t.a(this.f40424o, (this.f40423n.hashCode() + k.a(this.f40422m, t.a(this.f40421l, t.a(this.f40420k, t.a(this.f40419j, t.a(this.f40418i, t.a(this.f40417h, t.a(this.f40416g, t.a(this.f40415f, t.a(this.f40414e, t.a(this.f40413d, t.a(this.f40412c, (hashCode2 + hashCode) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31, 31);
    }

    public String toString() {
        return "PartnersDetailDialogArgs(name=" + this.f40410a + ", description=" + ((Object) this.f40411b) + ", purposes=" + this.f40412c + ", legitimateInterests=" + this.f40413d + ", specialPurposes=" + this.f40414e + ", features=" + this.f40415f + ", specialFeatures=" + this.f40416g + ", dataDeclarations=" + this.f40417h + ", privacyPolicy=" + this.f40418i + ", cookieMaxAge=" + this.f40419j + ", usesNonCookieAccess=" + this.f40420k + ", dataRetention=" + this.f40421l + ", vendorId=" + this.f40422m + ", switchItemType=" + this.f40423n + ", disclosuresUrl=" + this.f40424o + ", disclosuresErrorLabel=" + this.f40425p + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeString(this.f40410a);
        parcel.writeString(this.f40411b);
        parcel.writeString(this.f40412c);
        parcel.writeString(this.f40413d);
        parcel.writeString(this.f40414e);
        parcel.writeString(this.f40415f);
        parcel.writeString(this.f40416g);
        parcel.writeString(this.f40417h);
        parcel.writeString(this.f40418i);
        parcel.writeString(this.f40419j);
        parcel.writeString(this.f40420k);
        parcel.writeString(this.f40421l);
        parcel.writeInt(this.f40422m);
        parcel.writeInt(this.f40423n.f8920a);
        parcel.writeString(this.f40424o);
        parcel.writeString(this.f40425p);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C4027a(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, int r31, R7.e r32, java.lang.String r33, java.lang.String r34, int r35) {
        /*
            Method dump skipped, instructions count: 176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.C4027a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, R7.e, java.lang.String, java.lang.String, int):void");
    }
}
