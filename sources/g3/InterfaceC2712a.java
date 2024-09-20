package g3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: g3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2712a extends Parcelable {

    /* renamed from: g3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0747a implements Parcelable, InterfaceC2712a {
        public static final Parcelable.Creator<C0747a> CREATOR = new C0748a();

        /* renamed from: a, reason: collision with root package name */
        private final String f31184a;

        /* renamed from: g3.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0748a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0747a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new C0747a(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0747a[] newArray(int i8) {
                return new C0747a[i8];
            }
        }

        public C0747a(String str) {
            this.f31184a = str;
        }

        public final String b() {
            return this.f31184a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0747a) && AbstractC3159y.d(this.f31184a, ((C0747a) obj).f31184a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f31184a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "InstantDebits(email=" + this.f31184a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f31184a);
        }
    }

    /* renamed from: g3.a$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable, InterfaceC2712a {
        public static final Parcelable.Creator<b> CREATOR = new C0749a();

        /* renamed from: a, reason: collision with root package name */
        private final String f31185a;

        /* renamed from: b, reason: collision with root package name */
        private final String f31186b;

        /* renamed from: g3.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0749a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String name, String str) {
            AbstractC3159y.i(name, "name");
            this.f31185a = name;
            this.f31186b = str;
        }

        public final String b() {
            return this.f31186b;
        }

        public final String c() {
            return this.f31185a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3159y.d(this.f31185a, bVar.f31185a) && AbstractC3159y.d(this.f31186b, bVar.f31186b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f31185a.hashCode() * 31;
            String str = this.f31186b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "USBankAccount(name=" + this.f31185a + ", email=" + this.f31186b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f31185a);
            out.writeString(this.f31186b);
        }
    }
}
