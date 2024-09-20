package T3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class e extends T3.a implements b, Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    private String f9973d;

    /* renamed from: e, reason: collision with root package name */
    private int f9974e;

    /* loaded from: classes4.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i8) {
            return new e[i8];
        }
    }

    private boolean I(e eVar) {
        if (Z3.c.a(this.f9973d, eVar.f9973d) && this.f9974e == eVar.f9974e) {
            return true;
        }
        return false;
    }

    @Override // T3.b
    public int c() {
        return this.f9974e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // T3.b
    public String e() {
        return this.f9973d;
    }

    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof e) || !I((e) obj))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Z3.c.b(this.f9973d, Integer.valueOf(this.f9974e));
    }

    @Override // T3.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeString(this.f9973d);
        parcel.writeInt(this.f9974e);
    }

    private e(Parcel parcel) {
        super(parcel);
        this.f9973d = parcel.readString();
        this.f9974e = parcel.readInt();
    }
}
