package T3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class k extends T3.a implements p, Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    private String f9982d;

    /* renamed from: e, reason: collision with root package name */
    private String f9983e;

    /* renamed from: f, reason: collision with root package name */
    private String f9984f;

    /* renamed from: g, reason: collision with root package name */
    private String f9985g;

    /* loaded from: classes4.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i8) {
            return new k[i8];
        }
    }

    private boolean I(k kVar) {
        if (Z3.c.a(this.f9982d, kVar.f9982d) && Z3.c.a(this.f9983e, kVar.f9983e) && Z3.c.a(this.f9984f, kVar.f9984f) && Z3.c.a(this.f9985g, kVar.f9985g)) {
            return true;
        }
        return false;
    }

    @Override // T3.p
    public String b() {
        return this.f9983e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // T3.p
    public String e() {
        return this.f9982d;
    }

    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof k) || !I((k) obj))) {
            return false;
        }
        return true;
    }

    @Override // T3.p
    public String f() {
        return this.f9984f;
    }

    public int hashCode() {
        return Z3.c.b(this.f9982d, this.f9983e, this.f9984f, this.f9985g);
    }

    @Override // T3.p
    public String s() {
        return this.f9985g;
    }

    @Override // T3.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeString(this.f9982d);
        parcel.writeString(this.f9983e);
        parcel.writeString(this.f9984f);
        parcel.writeString(this.f9985g);
    }

    private k(Parcel parcel) {
        super(parcel);
        this.f9982d = parcel.readString();
        this.f9983e = parcel.readString();
        this.f9984f = parcel.readString();
        this.f9985g = parcel.readString();
    }
}
