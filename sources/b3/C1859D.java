package b3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Currency;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: b3.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1859D implements v2.f {
    public static final Parcelable.Creator<C1859D> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f14262a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14263b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14264c;

    /* renamed from: d, reason: collision with root package name */
    private final Currency f14265d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14266e;

    /* renamed from: b3.D$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1859D createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C1859D(parcel.readString(), parcel.readString(), parcel.readLong(), (Currency) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1859D[] newArray(int i8) {
            return new C1859D[i8];
        }
    }

    public C1859D(String label, String identifier, long j8, Currency currency, String str) {
        AbstractC3159y.i(label, "label");
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(currency, "currency");
        this.f14262a = label;
        this.f14263b = identifier;
        this.f14264c = j8;
        this.f14265d = currency;
        this.f14266e = str;
    }

    public final long b() {
        return this.f14264c;
    }

    public final Currency c() {
        return this.f14265d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f14266e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1859D)) {
            return false;
        }
        C1859D c1859d = (C1859D) obj;
        if (AbstractC3159y.d(this.f14262a, c1859d.f14262a) && AbstractC3159y.d(this.f14263b, c1859d.f14263b) && this.f14264c == c1859d.f14264c && AbstractC3159y.d(this.f14265d, c1859d.f14265d) && AbstractC3159y.d(this.f14266e, c1859d.f14266e)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f14262a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.f14262a.hashCode() * 31) + this.f14263b.hashCode()) * 31) + androidx.collection.a.a(this.f14264c)) * 31) + this.f14265d.hashCode()) * 31;
        String str = this.f14266e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "ShippingMethod(label=" + this.f14262a + ", identifier=" + this.f14263b + ", amount=" + this.f14264c + ", currency=" + this.f14265d + ", detail=" + this.f14266e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f14262a);
        out.writeString(this.f14263b);
        out.writeLong(this.f14264c);
        out.writeSerializable(this.f14265d);
        out.writeString(this.f14266e);
    }
}
