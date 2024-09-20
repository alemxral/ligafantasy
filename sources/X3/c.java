package X3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f12225a;

    /* renamed from: b, reason: collision with root package name */
    private final q f12226b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12227c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12228d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12229e;

    /* renamed from: f, reason: collision with root package name */
    private final String f12230f;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new c(parcel.readString(), q.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i8) {
            return new c[i8];
        }
    }

    public c(String deviceData, q sdkTransactionId, String sdkAppId, String sdkReferenceNumber, String sdkEphemeralPublicKey, String messageVersion) {
        AbstractC3159y.i(deviceData, "deviceData");
        AbstractC3159y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3159y.i(sdkAppId, "sdkAppId");
        AbstractC3159y.i(sdkReferenceNumber, "sdkReferenceNumber");
        AbstractC3159y.i(sdkEphemeralPublicKey, "sdkEphemeralPublicKey");
        AbstractC3159y.i(messageVersion, "messageVersion");
        this.f12225a = deviceData;
        this.f12226b = sdkTransactionId;
        this.f12227c = sdkAppId;
        this.f12228d = sdkReferenceNumber;
        this.f12229e = sdkEphemeralPublicKey;
        this.f12230f = messageVersion;
    }

    public final String b() {
        return this.f12225a;
    }

    public final String c() {
        return this.f12230f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f12227c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3159y.d(this.f12225a, cVar.f12225a) && AbstractC3159y.d(this.f12226b, cVar.f12226b) && AbstractC3159y.d(this.f12227c, cVar.f12227c) && AbstractC3159y.d(this.f12228d, cVar.f12228d) && AbstractC3159y.d(this.f12229e, cVar.f12229e) && AbstractC3159y.d(this.f12230f, cVar.f12230f)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f12229e;
    }

    public int hashCode() {
        return (((((((((this.f12225a.hashCode() * 31) + this.f12226b.hashCode()) * 31) + this.f12227c.hashCode()) * 31) + this.f12228d.hashCode()) * 31) + this.f12229e.hashCode()) * 31) + this.f12230f.hashCode();
    }

    public final String i() {
        return this.f12228d;
    }

    public final q j() {
        return this.f12226b;
    }

    public String toString() {
        return "AuthenticationRequestParameters(deviceData=" + this.f12225a + ", sdkTransactionId=" + this.f12226b + ", sdkAppId=" + this.f12227c + ", sdkReferenceNumber=" + this.f12228d + ", sdkEphemeralPublicKey=" + this.f12229e + ", messageVersion=" + this.f12230f + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f12225a);
        this.f12226b.writeToParcel(out, i8);
        out.writeString(this.f12227c);
        out.writeString(this.f12228d);
        out.writeString(this.f12229e);
        out.writeString(this.f12230f);
    }
}
