package I3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class g implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final K2.d f4037a;

    /* renamed from: b, reason: collision with root package name */
    private final b f4038b;

    /* renamed from: c, reason: collision with root package name */
    private final T2.k f4039c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f4036d = K2.d.f5877h;
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g createFromParcel(Parcel parcel) {
            T2.k valueOf;
            AbstractC3159y.i(parcel, "parcel");
            K2.d dVar = (K2.d) parcel.readParcelable(g.class.getClassLoader());
            b valueOf2 = b.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = T2.k.valueOf(parcel.readString());
            }
            return new g(dVar, valueOf2, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g[] newArray(int i8) {
            return new g[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4040a = new b("LoggedIn", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f4041b = new b("NeedsVerification", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f4042c = new b("LoggedOut", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f4043d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ R5.a f4044e;

        static {
            b[] a8 = a();
            f4043d = a8;
            f4044e = R5.b.a(a8);
        }

        private b(String str, int i8) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f4040a, f4041b, f4042c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f4043d.clone();
        }
    }

    public g(K2.d configuration, b loginState, T2.k kVar) {
        AbstractC3159y.i(configuration, "configuration");
        AbstractC3159y.i(loginState, "loginState");
        this.f4037a = configuration;
        this.f4038b = loginState;
        this.f4039c = kVar;
    }

    public final K2.d b() {
        return this.f4037a;
    }

    public final T2.k c() {
        return this.f4039c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3159y.d(this.f4037a, gVar.f4037a) && this.f4038b == gVar.f4038b && this.f4039c == gVar.f4039c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f4037a.hashCode() * 31) + this.f4038b.hashCode()) * 31;
        T2.k kVar = this.f4039c;
        if (kVar == null) {
            hashCode = 0;
        } else {
            hashCode = kVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "LinkState(configuration=" + this.f4037a + ", loginState=" + this.f4038b + ", signupMode=" + this.f4039c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeParcelable(this.f4037a, i8);
        out.writeString(this.f4038b.name());
        T2.k kVar = this.f4039c;
        if (kVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(kVar.name());
        }
    }
}
