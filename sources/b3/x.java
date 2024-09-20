package b3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class x implements v2.f {
    public static final Parcelable.Creator<x> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f14581a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14582b;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new x(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final x[] newArray(int i8) {
            return new x[i8];
        }
    }

    public x(String str, String str2) {
        this.f14581a = str;
        this.f14582b = str2;
    }

    public final String d() {
        return this.f14581a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (AbstractC3159y.d(this.f14581a, xVar.f14581a) && AbstractC3159y.d(this.f14582b, xVar.f14582b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f14581a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f14582b;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        return "FinancialConnectionsSession(clientSecret=" + this.f14581a + ", id=" + this.f14582b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f14581a);
        out.writeString(this.f14582b);
    }
}
