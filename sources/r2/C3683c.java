package r2;

import L5.x;
import M5.AbstractC1246t;
import M5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: r2.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3683c implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f37547a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37548b;

    /* renamed from: c, reason: collision with root package name */
    private final String f37549c;

    /* renamed from: d, reason: collision with root package name */
    private final String f37550d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f37546e = new a(null);
    public static final Parcelable.Creator<C3683c> CREATOR = new b();

    /* renamed from: r2.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: r2.c$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3683c createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C3683c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3683c[] newArray(int i8) {
            return new C3683c[i8];
        }
    }

    public C3683c(String name, String str, String str2, String str3) {
        AbstractC3159y.i(name, "name");
        this.f37547a = name;
        this.f37548b = str;
        this.f37549c = str2;
        this.f37550d = str3;
    }

    public final Map b() {
        return Q.e(x.a(MimeTypes.BASE_TYPE_APPLICATION, c()));
    }

    public final Map c() {
        return Q.k(x.a("name", this.f37547a), x.a("version", this.f37548b), x.a("url", this.f37549c), x.a("partner_id", this.f37550d));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        String str;
        String str2 = this.f37547a;
        String str3 = this.f37548b;
        String str4 = null;
        if (str3 != null) {
            str = "/" + str3;
        } else {
            str = null;
        }
        String str5 = this.f37549c;
        if (str5 != null) {
            str4 = " (" + str5 + ")";
        }
        return AbstractC1246t.w0(AbstractC1246t.r(str2, str, str4), "", null, null, 0, null, null, 62, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3683c)) {
            return false;
        }
        C3683c c3683c = (C3683c) obj;
        if (AbstractC3159y.d(this.f37547a, c3683c.f37547a) && AbstractC3159y.d(this.f37548b, c3683c.f37548b) && AbstractC3159y.d(this.f37549c, c3683c.f37549c) && AbstractC3159y.d(this.f37550d, c3683c.f37550d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.f37547a.hashCode() * 31;
        String str = this.f37548b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode3 + hashCode) * 31;
        String str2 = this.f37549c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f37550d;
        if (str3 != null) {
            i8 = str3.hashCode();
        }
        return i10 + i8;
    }

    public String toString() {
        return "AppInfo(name=" + this.f37547a + ", version=" + this.f37548b + ", url=" + this.f37549c + ", partnerId=" + this.f37550d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f37547a);
        out.writeString(this.f37548b);
        out.writeString(this.f37549c);
        out.writeString(this.f37550d);
    }
}
