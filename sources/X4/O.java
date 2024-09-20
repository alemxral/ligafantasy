package X4;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.uptodown.UptodownApp;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3326n;

/* loaded from: classes5.dex */
public final class O implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f12410a;

    /* renamed from: b, reason: collision with root package name */
    private long f12411b;

    /* renamed from: c, reason: collision with root package name */
    private String f12412c;

    /* renamed from: d, reason: collision with root package name */
    private long f12413d;

    /* renamed from: e, reason: collision with root package name */
    private int f12414e;

    /* renamed from: f, reason: collision with root package name */
    private String f12415f;

    /* renamed from: g, reason: collision with root package name */
    private int f12416g;

    /* renamed from: h, reason: collision with root package name */
    private int f12417h;

    /* renamed from: i, reason: collision with root package name */
    private String f12418i;

    /* renamed from: j, reason: collision with root package name */
    private String f12419j;

    /* renamed from: k, reason: collision with root package name */
    private C1509t f12420k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f12409l = new b(null);
    public static Parcelable.Creator<O> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public O createFromParcel(Parcel source) {
            AbstractC3159y.i(source, "source");
            return new O(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public O[] newArray(int i8) {
            return new O[i8];
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final int a(Context context) {
            C1496f S7;
            AbstractC3159y.i(context, "context");
            C3326n a8 = C3326n.f34490t.a(context);
            a8.a();
            Iterator it = a8.v0().iterator();
            int i8 = 0;
            while (it.hasNext()) {
                O o8 = (O) it.next();
                if (!new N4.f().p(context, o8.n()) && o8.k() == 0) {
                    if (g6.n.s(o8.n(), context.getPackageName(), true) && o8.u() > 0) {
                        if (o8.u() > 625) {
                            i8++;
                        }
                    } else if (o8.f() == 0 && (S7 = a8.S(o8.n())) != null && S7.i() == 0 && S7.i0(context)) {
                        i8++;
                    }
                }
            }
            a8.g();
            return i8;
        }

        public final int b(Context context) {
            C1496f S7;
            AbstractC3159y.i(context, "context");
            C3326n a8 = C3326n.f34490t.a(context);
            a8.a();
            Iterator it = a8.v0().iterator();
            int i8 = 0;
            while (it.hasNext()) {
                O o8 = (O) it.next();
                if (!new N4.f().p(context, o8.n())) {
                    if (g6.n.s(o8.n(), context.getPackageName(), true) && o8.u() > 0) {
                        if (o8.u() > 625) {
                            i8++;
                        }
                    } else if (o8.f() == 0 && (S7 = a8.S(o8.n())) != null && S7.i() == 0 && S7.i0(context)) {
                        i8++;
                    }
                }
            }
            a8.g();
            return i8;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public O(String packagename) {
        AbstractC3159y.i(packagename, "packagename");
        this.f12411b = -1L;
        this.f12410a = packagename;
    }

    public final void G(String str) {
        this.f12419j = str;
    }

    public final void I(String str) {
        this.f12418i = str;
    }

    public final void L(int i8) {
        this.f12417h = i8;
    }

    public final void Q(C1509t c1509t) {
        this.f12420k = c1509t;
    }

    public final void T(String str) {
        this.f12415f = str;
    }

    public final void V(int i8) {
        this.f12414e = i8;
    }

    public final void X(int i8) {
        this.f12416g = i8;
    }

    public final void Y(long j8) {
        this.f12413d = j8;
    }

    public final void Z(long j8) {
        this.f12411b = j8;
    }

    public final void a0(String str) {
        this.f12412c = str;
    }

    public final boolean b() {
        return UptodownApp.f27990B.P(this);
    }

    public final String c() {
        return this.f12419j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String e() {
        return this.f12418i;
    }

    public final int f() {
        return this.f12417h;
    }

    public final C1509t i() {
        return this.f12420k;
    }

    public final String j() {
        return this.f12415f;
    }

    public final int k() {
        return this.f12414e;
    }

    public final String n() {
        return this.f12410a;
    }

    public final int o() {
        return this.f12416g;
    }

    public final long s() {
        return this.f12413d;
    }

    public String toString() {
        return "Update{packagename='" + this.f12410a + "', versionCode='" + this.f12411b + "', versionName='" + this.f12412c + "', size=" + this.f12413d + ", notified=" + this.f12414e + ", nameApkFile='" + this.f12415f + "', progress=" + this.f12416g + ", ignoreVersion=" + this.f12417h + ", filehash='" + this.f12418i + "', fileId='" + this.f12419j + "'}";
    }

    public final long u() {
        return this.f12411b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeString(this.f12410a);
        parcel.writeLong(this.f12411b);
        parcel.writeString(this.f12412c);
        parcel.writeLong(this.f12413d);
        parcel.writeInt(this.f12414e);
        parcel.writeString(this.f12415f);
        parcel.writeInt(this.f12416g);
        parcel.writeInt(this.f12417h);
        parcel.writeString(this.f12418i);
        parcel.writeString(this.f12419j);
    }

    public final String z() {
        return this.f12412c;
    }

    public O(Parcel source) {
        AbstractC3159y.i(source, "source");
        this.f12411b = -1L;
        String readString = source.readString();
        AbstractC3159y.f(readString);
        this.f12410a = readString;
        this.f12411b = source.readLong();
        this.f12412c = source.readString();
        this.f12413d = source.readLong();
        this.f12414e = source.readInt();
        this.f12415f = source.readString();
        this.f12416g = source.readInt();
        this.f12417h = source.readInt();
        this.f12418i = source.readString();
        this.f12419j = source.readString();
    }
}
