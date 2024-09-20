package X3;

import android.os.Parcel;
import android.os.Parcelable;
import java.security.KeyPair;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f12275a;

    /* renamed from: b, reason: collision with root package name */
    private final KeyPair f12276b;

    /* renamed from: c, reason: collision with root package name */
    private final e f12277c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12278d;

    /* renamed from: e, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.n f12279e;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new m(parcel.readString(), (KeyPair) parcel.readSerializable(), e.CREATOR.createFromParcel(parcel), parcel.readInt(), com.stripe.android.stripe3ds2.transaction.n.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m[] newArray(int i8) {
            return new m[i8];
        }
    }

    public m(String sdkReferenceNumber, KeyPair sdkKeyPair, e challengeParameters, int i8, com.stripe.android.stripe3ds2.transaction.n intentData) {
        AbstractC3159y.i(sdkReferenceNumber, "sdkReferenceNumber");
        AbstractC3159y.i(sdkKeyPair, "sdkKeyPair");
        AbstractC3159y.i(challengeParameters, "challengeParameters");
        AbstractC3159y.i(intentData, "intentData");
        this.f12275a = sdkReferenceNumber;
        this.f12276b = sdkKeyPair;
        this.f12277c = challengeParameters;
        this.f12278d = i8;
        this.f12279e = intentData;
    }

    public final e b() {
        return this.f12277c;
    }

    public final com.stripe.android.stripe3ds2.transaction.n c() {
        return this.f12279e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final KeyPair e() {
        return this.f12276b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (AbstractC3159y.d(this.f12275a, mVar.f12275a) && AbstractC3159y.d(this.f12276b, mVar.f12276b) && AbstractC3159y.d(this.f12277c, mVar.f12277c) && this.f12278d == mVar.f12278d && AbstractC3159y.d(this.f12279e, mVar.f12279e)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f12275a;
    }

    public int hashCode() {
        return (((((((this.f12275a.hashCode() * 31) + this.f12276b.hashCode()) * 31) + this.f12277c.hashCode()) * 31) + this.f12278d) * 31) + this.f12279e.hashCode();
    }

    public final int i() {
        return this.f12278d;
    }

    public String toString() {
        return "InitChallengeArgs(sdkReferenceNumber=" + this.f12275a + ", sdkKeyPair=" + this.f12276b + ", challengeParameters=" + this.f12277c + ", timeoutMins=" + this.f12278d + ", intentData=" + this.f12279e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f12275a);
        out.writeSerializable(this.f12276b);
        this.f12277c.writeToParcel(out, i8);
        out.writeInt(this.f12278d);
        this.f12279e.writeToParcel(out, i8);
    }
}
