package Q7;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class e implements Parcelable {
    public static final a CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f8377a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8378b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8379c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8380d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8381e;

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
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
            return new e(str, str2, str3, str4, str5);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i8) {
            return new e[i8];
        }
    }

    public e(String name, String type, String maxAge, String domain, String purposes) {
        AbstractC3159y.i(name, "name");
        AbstractC3159y.i(type, "type");
        AbstractC3159y.i(maxAge, "maxAge");
        AbstractC3159y.i(domain, "domain");
        AbstractC3159y.i(purposes, "purposes");
        this.f8377a = name;
        this.f8378b = type;
        this.f8379c = maxAge;
        this.f8380d = domain;
        this.f8381e = purposes;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3159y.d(this.f8377a, eVar.f8377a) && AbstractC3159y.d(this.f8378b, eVar.f8378b) && AbstractC3159y.d(this.f8379c, eVar.f8379c) && AbstractC3159y.d(this.f8380d, eVar.f8380d) && AbstractC3159y.d(this.f8381e, eVar.f8381e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f8381e.hashCode() + t.a(this.f8380d, t.a(this.f8379c, t.a(this.f8378b, this.f8377a.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("DisclosureInfo(name=");
        a8.append(this.f8377a);
        a8.append(", type=");
        a8.append(this.f8378b);
        a8.append(", maxAge=");
        a8.append(this.f8379c);
        a8.append(", domain=");
        a8.append(this.f8380d);
        a8.append(", purposes=");
        a8.append(this.f8381e);
        a8.append(')');
        return a8.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeString(this.f8377a);
        parcel.writeString(this.f8378b);
        parcel.writeString(this.f8379c);
        parcel.writeString(this.f8380d);
        parcel.writeString(this.f8381e);
    }
}
