package S3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f9205a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9206b;

    /* renamed from: c, reason: collision with root package name */
    private final b f9207c;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new n(parcel.readString(), parcel.readString(), b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n[] newArray(int i8) {
            return new n[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f9208a = new b("LOW", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f9209b = new b("MEDIUM", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f9210c = new b("HIGH", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f9211d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ R5.a f9212e;

        static {
            b[] a8 = a();
            f9211d = a8;
            f9212e = R5.b.a(a8);
        }

        private b(String str, int i8) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f9208a, f9209b, f9210c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f9211d.clone();
        }
    }

    public n(String id, String message, b severity) {
        AbstractC3159y.i(id, "id");
        AbstractC3159y.i(message, "message");
        AbstractC3159y.i(severity, "severity");
        this.f9205a = id;
        this.f9206b = message;
        this.f9207c = severity;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (AbstractC3159y.d(this.f9205a, nVar.f9205a) && AbstractC3159y.d(this.f9206b, nVar.f9206b) && this.f9207c == nVar.f9207c) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.f9205a;
    }

    public int hashCode() {
        return (((this.f9205a.hashCode() * 31) + this.f9206b.hashCode()) * 31) + this.f9207c.hashCode();
    }

    public String toString() {
        return "Warning(id=" + this.f9205a + ", message=" + this.f9206b + ", severity=" + this.f9207c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f9205a);
        out.writeString(this.f9206b);
        out.writeString(this.f9207c.name());
    }
}
