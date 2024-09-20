package r3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final b f37579a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37580b;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new d(b.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d[] newArray(int i8) {
            return new d[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR;

        /* renamed from: a, reason: collision with root package name */
        public static final b f37581a = new b("HIDDEN", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f37582b = new b("OPTIONAL", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f37583c = new b("REQUIRED", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f37584d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ R5.a f37585e;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return b.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        static {
            b[] b8 = b();
            f37584d = b8;
            f37585e = R5.b.a(b8);
            CREATOR = new a();
        }

        private b(String str, int i8) {
        }

        private static final /* synthetic */ b[] b() {
            return new b[]{f37581a, f37582b, f37583c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f37584d.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(name());
        }
    }

    public d(b phone, String str) {
        AbstractC3159y.i(phone, "phone");
        this.f37579a = phone;
        this.f37580b = str;
    }

    public final String b() {
        return this.f37580b;
    }

    public final b c() {
        return this.f37579a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f37579a == dVar.f37579a && AbstractC3159y.d(this.f37580b, dVar.f37580b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f37579a.hashCode() * 31;
        String str = this.f37580b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "AdditionalFieldsConfiguration(phone=" + this.f37579a + ", checkboxLabel=" + this.f37580b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        this.f37579a.writeToParcel(out, i8);
        out.writeString(this.f37580b);
    }
}
