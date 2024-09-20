package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final int f13617a;

    /* renamed from: b, reason: collision with root package name */
    private final float f13618b;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public RatingCompat[] newArray(int i8) {
            return new RatingCompat[i8];
        }
    }

    RatingCompat(int i8, float f8) {
        this.f13617a = i8;
        this.f13618b = f8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f13617a;
    }

    public String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f13617a);
        sb.append(" rating=");
        float f8 = this.f13618b;
        if (f8 < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f8);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f13617a);
        parcel.writeFloat(this.f13618b);
    }
}
