package z2;

import android.os.Parcel;
import android.os.Parcelable;
import g6.n;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: z2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4017a implements InterfaceC4018b {
    public static final Parcelable.Creator<C4017a> CREATOR = new C0921a();

    /* renamed from: a, reason: collision with root package name */
    private final String f40045a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40046b;

    /* renamed from: z2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0921a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4017a createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C4017a(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C4017a[] newArray(int i8) {
            return new C4017a[i8];
        }
    }

    public C4017a(String original, String replacement) {
        AbstractC3159y.i(original, "original");
        AbstractC3159y.i(replacement, "replacement");
        this.f40045a = original;
        this.f40046b = replacement;
    }

    @Override // z2.InterfaceC4018b
    public String O(String value) {
        AbstractC3159y.i(value, "value");
        return n.A(value, this.f40045a, this.f40046b, false, 4, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4017a)) {
            return false;
        }
        C4017a c4017a = (C4017a) obj;
        if (AbstractC3159y.d(this.f40045a, c4017a.f40045a) && AbstractC3159y.d(this.f40046b, c4017a.f40046b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f40045a.hashCode() * 31) + this.f40046b.hashCode();
    }

    public String toString() {
        return "Replace(original=" + this.f40045a + ", replacement=" + this.f40046b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f40045a);
        out.writeString(this.f40046b);
    }
}
