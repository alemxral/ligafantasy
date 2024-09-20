package X4;

import N4.w;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Y;
import l5.C3326n;
import l5.C3329q;
import l5.C3332t;

/* renamed from: X4.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1505o implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private int f12661a;

    /* renamed from: b, reason: collision with root package name */
    private String f12662b;

    /* renamed from: c, reason: collision with root package name */
    private String f12663c;

    /* renamed from: d, reason: collision with root package name */
    private int f12664d;

    /* renamed from: e, reason: collision with root package name */
    private int f12665e;

    /* renamed from: f, reason: collision with root package name */
    private int f12666f;

    /* renamed from: g, reason: collision with root package name */
    private long f12667g;

    /* renamed from: h, reason: collision with root package name */
    private long f12668h;

    /* renamed from: i, reason: collision with root package name */
    private String f12669i;

    /* renamed from: j, reason: collision with root package name */
    private long f12670j;

    /* renamed from: k, reason: collision with root package name */
    private int f12671k;

    /* renamed from: l, reason: collision with root package name */
    private long f12672l;

    /* renamed from: m, reason: collision with root package name */
    private int f12673m;

    /* renamed from: n, reason: collision with root package name */
    private String f12674n;

    /* renamed from: o, reason: collision with root package name */
    private String f12675o;

    /* renamed from: p, reason: collision with root package name */
    private String f12676p;

    /* renamed from: q, reason: collision with root package name */
    private String f12677q;

    /* renamed from: r, reason: collision with root package name */
    private int f12678r;

    /* renamed from: s, reason: collision with root package name */
    private String f12679s;

    /* renamed from: t, reason: collision with root package name */
    private String f12680t;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList f12681u;

    /* renamed from: v, reason: collision with root package name */
    private String f12682v;

    /* renamed from: w, reason: collision with root package name */
    private long f12683w;

    /* renamed from: x, reason: collision with root package name */
    private long f12684x;

    /* renamed from: y, reason: collision with root package name */
    public static final b f12660y = new b(null);
    public static Parcelable.Creator<C1505o> CREATOR = new a();

    /* renamed from: X4.o$a */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1505o createFromParcel(Parcel source) {
            AbstractC3159y.i(source, "source");
            return new C1505o(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1505o[] newArray(int i8) {
            return new C1505o[i8];
        }
    }

    /* renamed from: X4.o$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final C1505o a(Context context, File file) {
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(file, "file");
            w.a aVar = N4.w.f7268b;
            String name = file.getName();
            AbstractC3159y.h(name, "file.name");
            if (aVar.a(name)) {
                C1505o c1505o = new C1505o();
                c1505o.D0(file.getName());
                K4.f e8 = new N4.w().e(file, context);
                c1505o.z0(0);
                c1505o.F0(100);
                c1505o.G0(file.length());
                c1505o.o0(file.getAbsolutePath());
                if (e8 != null) {
                    c1505o.E0(e8.a());
                    c1505o.J0(e8.b());
                }
                return c1505o;
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                AbstractC3159y.h(packageManager, "context.packageManager");
                String absolutePath = file.getAbsolutePath();
                AbstractC3159y.h(absolutePath, "file.absolutePath");
                PackageInfo c8 = N4.q.c(packageManager, absolutePath, 128);
                if (c8 == null) {
                    return null;
                }
                C1505o c1505o2 = new C1505o();
                c1505o2.D0(file.getName());
                c1505o2.E0(c8.packageName);
                c1505o2.J0(new N4.f().m(c8));
                c1505o2.F0(100);
                c1505o2.z0(0);
                c1505o2.G0(file.length());
                c1505o2.o0(file.getAbsolutePath());
                c1505o2.L(context, file);
                return c1505o2;
            } catch (Exception unused) {
                return null;
            }
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C1505o() {
        this.f12661a = -1;
        this.f12666f = 1;
        this.f12670j = -1L;
        this.f12672l = -1L;
        this.f12683w = -1L;
        this.f12684x = -1L;
    }

    private final void j0(Context context) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                String str = this.f12663c;
                AbstractC3159y.f(str);
                packageInfo = N4.q.d(packageManager, str, 0);
            } else {
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f12684x = new N4.f().m(packageInfo);
            }
        } catch (Exception unused) {
        }
    }

    public final void A0(String str) {
        this.f12669i = str;
    }

    public final void B0(String str) {
        this.f12676p = str;
    }

    public final void C0(int i8) {
        this.f12678r = i8;
    }

    public final void D0(String str) {
        this.f12662b = str;
    }

    public final void E0(String str) {
        this.f12663c = str;
    }

    public final void F0(int i8) {
        this.f12664d = i8;
    }

    public final int G() {
        return this.f12661a;
    }

    public final void G0(long j8) {
        this.f12667g = j8;
    }

    public final void H0(String str) {
        this.f12677q = str;
    }

    public final int I() {
        return this.f12666f;
    }

    public final void I0(String str) {
        this.f12679s = str;
    }

    public final void J0(long j8) {
        this.f12670j = j8;
    }

    public final void L(Context context, File file) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(file, "file");
        if (this.f12663c != null) {
            long j8 = this.f12670j;
            if (j8 > 0 && this.f12664d == 100) {
                this.f12683w = j8;
                j0(context);
                return;
            }
            String name = file.getName();
            AbstractC3159y.h(name, "file.name");
            if (g6.n.r(name, ".apk", false, 2, null) && this.f12664d == 100) {
                try {
                    PackageManager packageManager = context.getPackageManager();
                    AbstractC3159y.h(packageManager, "context.packageManager");
                    String absolutePath = file.getAbsolutePath();
                    AbstractC3159y.h(absolutePath, "file.absolutePath");
                    PackageInfo c8 = N4.q.c(packageManager, absolutePath, 128);
                    if (c8 != null) {
                        this.f12683w = new N4.f().m(c8);
                    }
                    if (c8 != null && g6.n.t(this.f12663c, c8.packageName, false, 2, null)) {
                        j0(context);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final String Q() {
        return this.f12669i;
    }

    public final String T() {
        return this.f12676p;
    }

    public final int V() {
        return this.f12678r;
    }

    public final String X() {
        return this.f12662b;
    }

    public final String Y() {
        return this.f12663c;
    }

    public final int Z() {
        return this.f12664d;
    }

    public final long a0() {
        return this.f12667g;
    }

    public final void b(C1498h appInfo) {
        String W02;
        AbstractC3159y.i(appInfo, "appInfo");
        if (this.f12663c == null) {
            this.f12663c = appInfo.y0();
        }
        if (this.f12670j <= 0) {
            if (appInfo.f1() > 0) {
                this.f12670j = appInfo.f1();
            } else if (appInfo.o0() > 0) {
                this.f12670j = appInfo.o0();
            }
        }
        if (this.f12672l <= 0) {
            this.f12672l = appInfo.i();
        }
        if (!C3332t.f34516a.f()) {
            this.f12673m = 1;
        }
        if (this.f12676p == null) {
            this.f12676p = appInfo.q0();
        }
        if (this.f12679s == null) {
            this.f12679s = appInfo.l0();
        }
        if (this.f12675o == null && appInfo.f0() > 0) {
            this.f12675o = String.valueOf(appInfo.f0());
        }
        if (this.f12667g <= 0 && (W02 = appInfo.W0()) != null && W02.length() != 0) {
            String W03 = appInfo.W0();
            AbstractC3159y.f(W03);
            this.f12667g = Long.parseLong(W03);
        }
        String str = this.f12680t;
        if (str == null || str.length() == 0) {
            this.f12680t = appInfo.s0();
        }
    }

    public final String b0() {
        return this.f12677q;
    }

    public final boolean c(Context context) {
        AbstractC3159y.i(context, "context");
        if (this.f12662b == null) {
            return false;
        }
        File f8 = new C3329q().f(context);
        String str = this.f12662b;
        AbstractC3159y.f(str);
        if (!new File(f8, str).exists() || this.f12664d != 100) {
            return false;
        }
        return true;
    }

    public final ArrayList c0() {
        return this.f12681u;
    }

    public final String d0() {
        return this.f12679s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String e() {
        return this.f12682v;
    }

    public final long e0() {
        return this.f12670j;
    }

    public final long f() {
        return this.f12672l;
    }

    public final long f0() {
        return this.f12683w;
    }

    public final long g0() {
        return this.f12684x;
    }

    public final boolean h0() {
        if (this.f12663c != null && this.f12666f == 1 && this.f12676p != null && this.f12670j > 0 && this.f12671k < 4) {
            return true;
        }
        return false;
    }

    public final String i() {
        return this.f12680t;
    }

    public final boolean i0() {
        K4.a h8 = E4.j.f2272g.h();
        if (this.f12670j > 0 && this.f12663c != null && h8 != null && g6.n.s(h8.b(), this.f12663c, true) && h8.e() == this.f12670j) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.f12671k;
    }

    public final int k() {
        return this.f12665e;
    }

    public final void k0(C1498h appInfo) {
        AbstractC3159y.i(appInfo, "appInfo");
        this.f12663c = appInfo.y0();
        this.f12672l = appInfo.i();
        this.f12680t = appInfo.s0();
        if (!C3332t.f34516a.f()) {
            this.f12673m = 1;
        }
        if (appInfo.W0() != null) {
            String W02 = appInfo.W0();
            AbstractC3159y.f(W02);
            if (W02.length() > 0) {
                try {
                    String W03 = appInfo.W0();
                    AbstractC3159y.f(W03);
                    this.f12667g = Long.parseLong(W03);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        }
        this.f12676p = appInfo.q0();
        this.f12674n = appInfo.S0();
        this.f12677q = null;
        if (appInfo.X0() != null) {
            ArrayList X02 = appInfo.X0();
            AbstractC3159y.f(X02);
            if (X02.size() > 0) {
                ArrayList X03 = appInfo.X0();
                AbstractC3159y.f(X03);
                int size = X03.size();
                for (int i8 = 0; i8 < size; i8++) {
                    String str = this.f12677q;
                    if (str == null) {
                        ArrayList X04 = appInfo.X0();
                        AbstractC3159y.f(X04);
                        this.f12677q = (String) X04.get(i8);
                    } else {
                        Y y8 = Y.f33752a;
                        ArrayList X05 = appInfo.X0();
                        AbstractC3159y.f(X05);
                        String format = String.format("%s,%s", Arrays.copyOf(new Object[]{str, X05.get(i8)}, 2));
                        AbstractC3159y.h(format, "format(...)");
                        this.f12677q = format;
                    }
                }
            }
        }
        this.f12675o = String.valueOf(appInfo.f0());
        if (appInfo.r0() != null) {
            try {
                String r02 = appInfo.r0();
                AbstractC3159y.f(r02);
                this.f12678r = Integer.parseInt(r02);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        this.f12679s = appInfo.l0();
        this.f12681u = appInfo.Y0();
    }

    public final int l0(Context context) {
        AbstractC3159y.i(context, "context");
        if (this.f12675o == null) {
            return -1;
        }
        C3326n a8 = C3326n.f34490t.a(context);
        a8.a();
        String str = this.f12675o;
        AbstractC3159y.f(str);
        C1505o Z7 = a8.Z(str);
        if (Z7 == null) {
            Z7 = a8.F0(this);
        }
        a8.g();
        return Z7.f12661a;
    }

    public final int m0(Context context) {
        C1505o c1505o;
        AbstractC3159y.i(context, "context");
        C3326n a8 = C3326n.f34490t.a(context);
        a8.a();
        String str = this.f12662b;
        if (str != null) {
            AbstractC3159y.f(str);
            c1505o = a8.Y(str);
        } else {
            c1505o = null;
        }
        if (c1505o == null) {
            c1505o = a8.F0(this);
        }
        a8.g();
        return c1505o.f12661a;
    }

    public final int n() {
        return this.f12673m;
    }

    public final int n0(Context context) {
        AbstractC3159y.i(context, "context");
        C3326n a8 = C3326n.f34490t.a(context);
        a8.a();
        int x8 = a8.x(this);
        a8.g();
        return x8;
    }

    public final long o() {
        return this.f12668h;
    }

    public final void o0(String str) {
        this.f12682v = str;
    }

    public final void p0(long j8) {
        this.f12672l = j8;
    }

    public final void q0(String str) {
        this.f12680t = str;
    }

    public final void r0(int i8) {
        this.f12671k = i8;
    }

    public final File s(Context context) {
        AbstractC3159y.i(context, "context");
        if (this.f12682v != null) {
            String str = this.f12682v;
            AbstractC3159y.f(str);
            File file = new File(str);
            if (file.exists()) {
                return file;
            }
        }
        if (this.f12662b == null) {
            return null;
        }
        File f8 = new C3329q().f(context);
        String str2 = this.f12662b;
        AbstractC3159y.f(str2);
        File file2 = new File(f8, str2);
        if (!file2.exists()) {
            return null;
        }
        return file2;
    }

    public final void s0(int i8) {
        this.f12665e = i8;
    }

    public final void t0(int i8) {
        this.f12673m = i8;
    }

    public String toString() {
        return "Download{id='" + this.f12661a + "', name='" + this.f12662b + "', packagename='" + this.f12663c + "', progress=" + this.f12664d + ", checkedByUser=" + this.f12665e + ", incomplete=" + this.f12666f + ", size=" + this.f12667g + ", downloadedSize=" + this.f12668h + ", md5='" + this.f12669i + "', versioncode='" + this.f12670j + "', attempts=" + this.f12671k + ", idPrograma=" + this.f12672l + ", downloadAnyway=" + this.f12673m + ", filehash=" + this.f12674n + ", fileId=" + this.f12675o + ", md5signature=" + this.f12676p + ", supportedAbis=" + this.f12677q + ", minsdk=" + this.f12678r + ", urlIcon=" + this.f12679s + ", absolutePath=" + this.f12682v + ", appName=" + this.f12680t + ", versioncodeFile=" + this.f12683w + ", versioncodeInstalled=" + this.f12684x + '}';
    }

    public final String u() {
        return this.f12675o;
    }

    public final void u0(Context context, long j8) {
        AbstractC3159y.i(context, "context");
        if (this.f12667g != j8) {
            C3326n a8 = C3326n.f34490t.a(context);
            a8.a();
            this.f12667g = j8;
            a8.s1(this);
            a8.g();
        }
    }

    public final void v0(long j8) {
        this.f12668h = j8;
    }

    public final void w0(String str) {
        this.f12675o = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeInt(this.f12661a);
        parcel.writeString(this.f12662b);
        parcel.writeString(this.f12663c);
        parcel.writeInt(this.f12664d);
        parcel.writeInt(this.f12665e);
        parcel.writeInt(this.f12666f);
        parcel.writeLong(this.f12667g);
        parcel.writeLong(this.f12668h);
        parcel.writeString(this.f12669i);
        parcel.writeLong(this.f12670j);
        parcel.writeInt(this.f12671k);
        parcel.writeLong(this.f12672l);
        parcel.writeInt(this.f12673m);
        parcel.writeString(this.f12674n);
        parcel.writeString(this.f12675o);
        parcel.writeString(this.f12676p);
        parcel.writeString(this.f12677q);
        parcel.writeInt(this.f12678r);
        parcel.writeString(this.f12679s);
        parcel.writeString(this.f12680t);
    }

    public final void x0(String str) {
        this.f12674n = str;
    }

    public final void y0(int i8) {
        this.f12661a = i8;
    }

    public final String z() {
        return this.f12674n;
    }

    public final void z0(int i8) {
        this.f12666f = i8;
    }

    public C1505o(Parcel source) {
        AbstractC3159y.i(source, "source");
        this.f12661a = -1;
        this.f12666f = 1;
        this.f12670j = -1L;
        this.f12672l = -1L;
        this.f12683w = -1L;
        this.f12684x = -1L;
        this.f12661a = source.readInt();
        this.f12662b = source.readString();
        this.f12663c = source.readString();
        this.f12664d = source.readInt();
        this.f12665e = source.readInt();
        this.f12666f = source.readInt();
        this.f12667g = source.readLong();
        this.f12668h = source.readLong();
        this.f12669i = source.readString();
        this.f12670j = source.readLong();
        this.f12671k = source.readInt();
        this.f12672l = source.readLong();
        this.f12673m = source.readInt();
        this.f12674n = source.readString();
        this.f12675o = source.readString();
        this.f12676p = source.readString();
        this.f12677q = source.readString();
        this.f12678r = source.readInt();
        this.f12679s = source.readString();
        this.f12680t = source.readString();
    }
}
