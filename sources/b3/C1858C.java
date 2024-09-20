package b3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: b3.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1858C implements v2.f, InterfaceC1863H {

    /* renamed from: a, reason: collision with root package name */
    private final com.stripe.android.model.a f14259a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14260b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14261c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f14258d = new a(null);
    public static final Parcelable.Creator<C1858C> CREATOR = new b();

    /* renamed from: b3.C$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: b3.C$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1858C createFromParcel(Parcel parcel) {
            com.stripe.android.model.a createFromParcel;
            AbstractC3159y.i(parcel, "parcel");
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = com.stripe.android.model.a.CREATOR.createFromParcel(parcel);
            }
            return new C1858C(createFromParcel, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1858C[] newArray(int i8) {
            return new C1858C[i8];
        }
    }

    public C1858C(com.stripe.android.model.a aVar, String str, String str2) {
        this.f14259a = aVar;
        this.f14260b = str;
        this.f14261c = str2;
    }

    public final com.stripe.android.model.a b() {
        return this.f14259a;
    }

    public final String c() {
        return this.f14260b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f14261c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1858C)) {
            return false;
        }
        C1858C c1858c = (C1858C) obj;
        if (AbstractC3159y.d(this.f14259a, c1858c.f14259a) && AbstractC3159y.d(this.f14260b, c1858c.f14260b) && AbstractC3159y.d(this.f14261c, c1858c.f14261c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        com.stripe.android.model.a aVar = this.f14259a;
        int i8 = 0;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        int i9 = hashCode * 31;
        String str = this.f14260b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.f14261c;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i10 + i8;
    }

    public String toString() {
        return "ShippingInformation(address=" + this.f14259a + ", name=" + this.f14260b + ", phone=" + this.f14261c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        com.stripe.android.model.a aVar = this.f14259a;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        out.writeString(this.f14260b);
        out.writeString(this.f14261c);
    }
}
