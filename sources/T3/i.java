package T3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class i extends T3.a implements o, Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    private int f9978d;

    /* renamed from: e, reason: collision with root package name */
    private String f9979e;

    /* renamed from: f, reason: collision with root package name */
    private int f9980f;

    /* renamed from: g, reason: collision with root package name */
    private String f9981g;

    /* loaded from: classes4.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i[] newArray(int i8) {
            return new i[i8];
        }
    }

    private boolean I(i iVar) {
        if (this.f9978d == iVar.f9978d && Z3.c.a(this.f9979e, iVar.f9979e) && this.f9980f == iVar.f9980f && Z3.c.a(this.f9981g, iVar.f9981g)) {
            return true;
        }
        return false;
    }

    @Override // T3.o
    public int c() {
        return this.f9980f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof i) || !I((i) obj))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Z3.c.b(Integer.valueOf(this.f9978d), this.f9979e, Integer.valueOf(this.f9980f), this.f9981g);
    }

    @Override // T3.o
    public String i() {
        return this.f9981g;
    }

    @Override // T3.o
    public String n() {
        return this.f9979e;
    }

    @Override // T3.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeInt(this.f9978d);
        parcel.writeString(this.f9979e);
        parcel.writeInt(this.f9980f);
        parcel.writeString(this.f9981g);
    }

    private i(Parcel parcel) {
        super(parcel);
        this.f9978d = parcel.readInt();
        this.f9979e = parcel.readString();
        this.f9980f = parcel.readInt();
        this.f9981g = parcel.readString();
    }
}
