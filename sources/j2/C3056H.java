package j2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: j2.H, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3056H extends AbstractC3059K {
    public static final Parcelable.Creator<C3056H> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.model.u f32917b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32918c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32919d;

    /* renamed from: j2.H$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3056H createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C3056H(com.stripe.android.model.u.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3056H[] newArray(int i8) {
            return new C3056H[i8];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3056H(com.stripe.android.model.u intent, int i8, String str) {
        super(i8);
        AbstractC3159y.i(intent, "intent");
        this.f32917b = intent;
        this.f32918c = i8;
        this.f32919d = str;
    }

    @Override // j2.AbstractC3059K
    public String c() {
        return this.f32919d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3056H)) {
            return false;
        }
        C3056H c3056h = (C3056H) obj;
        if (AbstractC3159y.d(this.f32917b, c3056h.f32917b) && this.f32918c == c3056h.f32918c && AbstractC3159y.d(this.f32919d, c3056h.f32919d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f32917b.hashCode() * 31) + this.f32918c) * 31;
        String str = this.f32919d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @Override // j2.AbstractC3059K
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.u e() {
        return this.f32917b;
    }

    public String toString() {
        return "SetupIntentResult(intent=" + this.f32917b + ", outcomeFromFlow=" + this.f32918c + ", failureMessage=" + this.f32919d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        this.f32917b.writeToParcel(out, i8);
        out.writeInt(this.f32918c);
        out.writeString(this.f32919d);
    }
}
