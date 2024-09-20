package b3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class M implements v2.f {
    public static final Parcelable.Creator<M> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f14373a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14374b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14375c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14376d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14377e;

    /* renamed from: f, reason: collision with root package name */
    private final String f14378f;

    /* renamed from: g, reason: collision with root package name */
    private final String f14379g;

    /* renamed from: h, reason: collision with root package name */
    private final String f14380h;

    /* renamed from: i, reason: collision with root package name */
    private final String f14381i;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new M(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final M[] newArray(int i8) {
            return new M[i8];
        }
    }

    public M(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f14373a = str;
        this.f14374b = str2;
        this.f14375c = str3;
        this.f14376d = str4;
        this.f14377e = str5;
        this.f14378f = str6;
        this.f14379g = str7;
        this.f14380h = str8;
        this.f14381i = str9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m8 = (M) obj;
        if (AbstractC3159y.d(this.f14373a, m8.f14373a) && AbstractC3159y.d(this.f14374b, m8.f14374b) && AbstractC3159y.d(this.f14375c, m8.f14375c) && AbstractC3159y.d(this.f14376d, m8.f14376d) && AbstractC3159y.d(this.f14377e, m8.f14377e) && AbstractC3159y.d(this.f14378f, m8.f14378f) && AbstractC3159y.d(this.f14379g, m8.f14379g) && AbstractC3159y.d(this.f14380h, m8.f14380h) && AbstractC3159y.d(this.f14381i, m8.f14381i)) {
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
        String str = this.f14373a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f14374b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f14375c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str4 = this.f14376d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.f14377e;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str6 = this.f14378f;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str7 = this.f14379g;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        String str8 = this.f14380h;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        String str9 = this.f14381i;
        if (str9 != null) {
            i8 = str9.hashCode();
        }
        return i16 + i8;
    }

    public String toString() {
        return "WeChat(statementDescriptor=" + this.f14373a + ", appId=" + this.f14374b + ", nonce=" + this.f14375c + ", packageValue=" + this.f14376d + ", partnerId=" + this.f14377e + ", prepayId=" + this.f14378f + ", sign=" + this.f14379g + ", timestamp=" + this.f14380h + ", qrCodeUrl=" + this.f14381i + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f14373a);
        out.writeString(this.f14374b);
        out.writeString(this.f14375c);
        out.writeString(this.f14376d);
        out.writeString(this.f14377e);
        out.writeString(this.f14378f);
        out.writeString(this.f14379g);
        out.writeString(this.f14380h);
        out.writeString(this.f14381i);
    }

    public /* synthetic */ M(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? null : str, str2, str3, str4, str5, str6, str7, str8, (i8 & 256) != 0 ? null : str9);
    }
}
