package S3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0189a();

    /* renamed from: a, reason: collision with root package name */
    private final String f9008a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9009b;

    /* renamed from: S3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0189a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new a(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(String sdkAppId, int i8) {
        AbstractC3159y.i(sdkAppId, "sdkAppId");
        this.f9008a = sdkAppId;
        this.f9009b = i8;
    }

    public final String b() {
        return this.f9008a;
    }

    public final int c() {
        return this.f9009b;
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
        if (AbstractC3159y.d(this.f9008a, aVar.f9008a) && this.f9009b == aVar.f9009b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f9008a.hashCode() * 31) + this.f9009b;
    }

    public String toString() {
        return "AppInfo(sdkAppId=" + this.f9008a + ", version=" + this.f9009b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f9008a);
        out.writeInt(this.f9009b);
    }
}
