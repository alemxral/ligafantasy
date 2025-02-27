package r3;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: r3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3686a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f37574a;

    /* renamed from: b, reason: collision with root package name */
    private final u.a f37575b;

    /* renamed from: c, reason: collision with root package name */
    private final String f37576c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f37577d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0860a f37573e = new C0860a(null);
    public static final Parcelable.Creator<C3686a> CREATOR = new b();

    /* renamed from: r3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0860a {
        private C0860a() {
        }

        public /* synthetic */ C0860a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: r3.a$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3686a createFromParcel(Parcel parcel) {
            u.a createFromParcel;
            boolean z8;
            AbstractC3159y.i(parcel, "parcel");
            String readString = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = u.a.CREATOR.createFromParcel(parcel);
            }
            u.a aVar = createFromParcel;
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                bool = Boolean.valueOf(z8);
            }
            return new C3686a(readString, aVar, readString2, bool);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3686a[] newArray(int i8) {
            return new C3686a[i8];
        }
    }

    public C3686a(String str, u.a aVar, String str2, Boolean bool) {
        this.f37574a = str;
        this.f37575b = aVar;
        this.f37576c = str2;
        this.f37577d = bool;
    }

    public final u.a b() {
        return this.f37575b;
    }

    public final String c() {
        return this.f37574a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f37576c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3686a)) {
            return false;
        }
        C3686a c3686a = (C3686a) obj;
        if (AbstractC3159y.d(this.f37574a, c3686a.f37574a) && AbstractC3159y.d(this.f37575b, c3686a.f37575b) && AbstractC3159y.d(this.f37576c, c3686a.f37576c) && AbstractC3159y.d(this.f37577d, c3686a.f37577d)) {
            return true;
        }
        return false;
    }

    public final Boolean f() {
        return this.f37577d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f37574a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        u.a aVar = this.f37575b;
        if (aVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aVar.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.f37576c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Boolean bool = this.f37577d;
        if (bool != null) {
            i8 = bool.hashCode();
        }
        return i11 + i8;
    }

    public String toString() {
        return "AddressDetails(name=" + this.f37574a + ", address=" + this.f37575b + ", phoneNumber=" + this.f37576c + ", isCheckboxSelected=" + this.f37577d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f37574a);
        u.a aVar = this.f37575b;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        out.writeString(this.f37576c);
        Boolean bool = this.f37577d;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ C3686a(String str, u.a aVar, String str2, Boolean bool, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : aVar, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : bool);
    }
}
