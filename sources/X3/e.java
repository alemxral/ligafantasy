package X3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f12231a;

    /* renamed from: b, reason: collision with root package name */
    private String f12232b;

    /* renamed from: c, reason: collision with root package name */
    private String f12233c;

    /* renamed from: d, reason: collision with root package name */
    private String f12234d;

    /* renamed from: e, reason: collision with root package name */
    private String f12235e;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new e(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e[] newArray(int i8) {
            return new e[i8];
        }
    }

    public e(String str, String str2, String str3, String str4, String str5) {
        this.f12231a = str;
        this.f12232b = str2;
        this.f12233c = str3;
        this.f12234d = str4;
        this.f12235e = str5;
    }

    public final String b() {
        return this.f12234d;
    }

    public final String c() {
        return this.f12232b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f12231a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3159y.d(this.f12231a, eVar.f12231a) && AbstractC3159y.d(this.f12232b, eVar.f12232b) && AbstractC3159y.d(this.f12233c, eVar.f12233c) && AbstractC3159y.d(this.f12234d, eVar.f12234d) && AbstractC3159y.d(this.f12235e, eVar.f12235e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f12231a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f12232b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f12233c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str4 = this.f12234d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.f12235e;
        if (str5 != null) {
            i8 = str5.hashCode();
        }
        return i12 + i8;
    }

    public String toString() {
        return "ChallengeParameters(threeDsServerTransactionId=" + this.f12231a + ", acsTransactionId=" + this.f12232b + ", acsRefNumber=" + this.f12233c + ", acsSignedContent=" + this.f12234d + ", threeDSRequestorAppURL=" + this.f12235e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f12231a);
        out.writeString(this.f12232b);
        out.writeString(this.f12233c);
        out.writeString(this.f12234d);
        out.writeString(this.f12235e);
    }

    public /* synthetic */ e(String str, String str2, String str3, String str4, String str5, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : str5);
    }
}
