package X4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3141f;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3326n;

/* renamed from: X4.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1496f implements Parcelable {

    /* renamed from: A, reason: collision with root package name */
    private ArrayList f12495A;

    /* renamed from: B, reason: collision with root package name */
    private ArrayList f12496B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f12497C;

    /* renamed from: a, reason: collision with root package name */
    private long f12498a;

    /* renamed from: b, reason: collision with root package name */
    private String f12499b;

    /* renamed from: c, reason: collision with root package name */
    private String f12500c;

    /* renamed from: d, reason: collision with root package name */
    private long f12501d;

    /* renamed from: e, reason: collision with root package name */
    private String f12502e;

    /* renamed from: f, reason: collision with root package name */
    private String f12503f;

    /* renamed from: g, reason: collision with root package name */
    private c f12504g;

    /* renamed from: h, reason: collision with root package name */
    private int f12505h;

    /* renamed from: i, reason: collision with root package name */
    private int f12506i;

    /* renamed from: j, reason: collision with root package name */
    private String f12507j;

    /* renamed from: k, reason: collision with root package name */
    private int f12508k;

    /* renamed from: l, reason: collision with root package name */
    private int f12509l;

    /* renamed from: m, reason: collision with root package name */
    private String f12510m;

    /* renamed from: n, reason: collision with root package name */
    private int f12511n;

    /* renamed from: o, reason: collision with root package name */
    private long f12512o;

    /* renamed from: p, reason: collision with root package name */
    private long f12513p;

    /* renamed from: q, reason: collision with root package name */
    private int f12514q;

    /* renamed from: r, reason: collision with root package name */
    private String f12515r;

    /* renamed from: s, reason: collision with root package name */
    private long f12516s;

    /* renamed from: t, reason: collision with root package name */
    private String f12517t;

    /* renamed from: u, reason: collision with root package name */
    private int f12518u;

    /* renamed from: v, reason: collision with root package name */
    private C f12519v;

    /* renamed from: w, reason: collision with root package name */
    private String f12520w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f12521x;

    /* renamed from: y, reason: collision with root package name */
    private long f12522y;

    /* renamed from: z, reason: collision with root package name */
    private int f12523z;

    /* renamed from: D, reason: collision with root package name */
    public static final b f12494D = new b(null);
    public static Parcelable.Creator<C1496f> CREATOR = new a();

    /* renamed from: X4.f$a */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1496f createFromParcel(Parcel source) {
            AbstractC3159y.i(source, "source");
            return new C1496f(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1496f[] newArray(int i8) {
            return new C1496f[i8];
        }
    }

    /* renamed from: X4.f$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: X4.f$c */
    /* loaded from: classes5.dex */
    public enum c {
        OUTDATED,
        UPDATED,
        UNAVAILABLE
    }

    /* renamed from: X4.f$d */
    /* loaded from: classes5.dex */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12528a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.OUTDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.UPDATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12528a = iArr;
        }
    }

    public C1496f() {
        this.f12498a = -1L;
        this.f12501d = -1L;
        this.f12504g = c.UPDATED;
    }

    public final void A0(String str) {
        this.f12507j = str;
    }

    public final void B0(String str) {
        this.f12510m = str;
    }

    public final void C0(String str) {
        this.f12499b = str;
    }

    public final void D0(String str) {
        this.f12500c = str;
    }

    public final void E0(C c8) {
        this.f12519v = c8;
    }

    public final void F0(int i8) {
        this.f12518u = i8;
    }

    public final int G() {
        return this.f12508k;
    }

    public final void G0(String str) {
        this.f12517t = str;
    }

    public final void H0(boolean z8) {
        this.f12521x = z8;
    }

    public final String I() {
        return this.f12499b;
    }

    public final void I0(long j8) {
        this.f12512o = j8;
    }

    public final void J0(c cVar) {
        AbstractC3159y.i(cVar, "<set-?>");
        this.f12504g = cVar;
    }

    public final void K0(int i8) {
        this.f12505h = i8;
    }

    public final ArrayList L() {
        return this.f12496B;
    }

    public final void L0(int i8) {
        this.f12506i = i8;
    }

    public final void M0(String str) {
        this.f12503f = str;
    }

    public final void N0(long j8) {
        this.f12501d = j8;
    }

    public final void O0(String str) {
        this.f12520w = str;
    }

    public final void P0(String str) {
        this.f12502e = str;
    }

    public final String Q() {
        return this.f12500c;
    }

    public final C T() {
        return this.f12519v;
    }

    public final int V() {
        return this.f12518u;
    }

    public final String X() {
        return this.f12517t;
    }

    public final boolean Y() {
        return this.f12521x;
    }

    public final long Z() {
        return this.f12512o;
    }

    public final String a0() {
        return new N4.g().c(this.f12512o);
    }

    public final void b(String path, ArrayList appFilesStored, C3326n dbManager, C1496f appStored, ArrayList out) {
        AbstractC3159y.i(path, "path");
        AbstractC3159y.i(appFilesStored, "appFilesStored");
        AbstractC3159y.i(dbManager, "dbManager");
        AbstractC3159y.i(appStored, "appStored");
        AbstractC3159y.i(out, "out");
        r rVar = new r();
        rVar.i(new File(path).length());
        rVar.f(path);
        Iterator it = appFilesStored.iterator();
        int i8 = -1;
        int i9 = 0;
        while (it.hasNext()) {
            int i10 = i9 + 1;
            r rVar2 = (r) it.next();
            if (g6.n.t(rVar2.a(), rVar.a(), false, 2, null) && rVar2.e() == rVar.e()) {
                if (rVar2.b() != null) {
                    rVar.g(rVar2.b());
                }
                if (rVar2.d() != null) {
                    rVar.h(rVar2.d());
                }
                i8 = i9;
            }
            i9 = i10;
        }
        if (i8 == -1) {
            if (dbManager.D0(appStored.f12498a, rVar) >= 0) {
                out.add(rVar);
            }
        } else {
            appFilesStored.remove(i8);
            out.add(rVar);
        }
    }

    public final ArrayList b0() {
        return this.f12495A;
    }

    public final long c() {
        return this.f12522y;
    }

    public final c c0() {
        return this.f12504g;
    }

    public final int d0() {
        return this.f12509l;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String e() {
        return this.f12515r;
    }

    public final String e0() {
        return this.f12503f;
    }

    public final boolean f() {
        return this.f12497C;
    }

    public final long f0() {
        return this.f12501d;
    }

    public final String g0() {
        return this.f12520w;
    }

    public final String h0() {
        return this.f12502e;
    }

    public final int i() {
        return this.f12511n;
    }

    public final boolean i0(Context context) {
        AbstractC3159y.i(context, "context");
        if (this.f12500c == null) {
            return false;
        }
        if (n0()) {
            return SettingsPreferences.f29309b.i0(context);
        }
        if (l0()) {
            return SettingsPreferences.f29309b.h0(context);
        }
        return true;
    }

    public final int j() {
        return this.f12514q;
    }

    public final boolean j0() {
        long j8 = this.f12513p;
        long j9 = this.f12516s;
        long currentTimeMillis = System.currentTimeMillis();
        if (j9 != j8 && currentTimeMillis - j8 < 604800000) {
            return true;
        }
        return false;
    }

    public final long k() {
        return this.f12516s;
    }

    public final int k0() {
        return this.f12505h;
    }

    public final boolean l0() {
        if (this.f12505h == 1) {
            return true;
        }
        return false;
    }

    public final int m0() {
        return this.f12506i;
    }

    public final int n() {
        return this.f12523z;
    }

    public final boolean n0() {
        if (this.f12506i == 1) {
            return true;
        }
        return false;
    }

    public final long o() {
        return this.f12498a;
    }

    public final void o0(C3326n dbManager) {
        AbstractC3159y.i(dbManager, "dbManager");
        this.f12496B = new ArrayList();
        N4.u uVar = new N4.u();
        String str = this.f12500c;
        AbstractC3159y.f(str);
        ArrayList a8 = uVar.a(str);
        if (!a8.isEmpty()) {
            String str2 = this.f12500c;
            AbstractC3159y.f(str2);
            C1496f S7 = dbManager.S(str2);
            if (S7 != null) {
                ArrayList T7 = dbManager.T(S7.f12498a);
                Iterator it = a8.iterator();
                while (it.hasNext()) {
                    File file = (File) it.next();
                    if (file.isFile()) {
                        String name = file.getName();
                        AbstractC3159y.h(name, "obbFile.name");
                        if (g6.n.r(name, ".obb", false, 2, null)) {
                            String absolutePath = file.getAbsolutePath();
                            AbstractC3159y.h(absolutePath, "obbFile.absolutePath");
                            ArrayList arrayList = this.f12496B;
                            AbstractC3159y.f(arrayList);
                            b(absolutePath, T7, dbManager, S7, arrayList);
                        }
                    }
                }
            }
        }
    }

    public final void p0(ApplicationInfo applicationInfo, C3326n dbManager) {
        AbstractC3159y.i(applicationInfo, "applicationInfo");
        AbstractC3159y.i(dbManager, "dbManager");
        this.f12495A = new ArrayList();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            String str = this.f12500c;
            AbstractC3159y.f(str);
            C1496f S7 = dbManager.S(str);
            if (S7 != null) {
                ArrayList T7 = dbManager.T(S7.f12498a);
                Iterator a8 = AbstractC3141f.a(strArr);
                while (a8.hasNext()) {
                    String splitSourceDir = (String) a8.next();
                    AbstractC3159y.h(splitSourceDir, "splitSourceDir");
                    if (g6.n.r(splitSourceDir, ".apk", false, 2, null)) {
                        ArrayList arrayList = this.f12495A;
                        AbstractC3159y.f(arrayList);
                        b(splitSourceDir, T7, dbManager, S7, arrayList);
                    }
                }
                if (!T7.isEmpty()) {
                    Iterator it = T7.iterator();
                    while (it.hasNext()) {
                        r appfile = (r) it.next();
                        AbstractC3159y.h(appfile, "appfile");
                        dbManager.u(appfile);
                    }
                }
            }
        }
    }

    public final void q0(long j8) {
        this.f12522y = j8;
    }

    public final void r0(String str) {
        this.f12515r = str;
    }

    public final long s() {
        return this.f12513p;
    }

    public final void s0(boolean z8) {
        this.f12497C = z8;
    }

    public final void t0(int i8) {
        this.f12511n = i8;
    }

    public String toString() {
        return "App{id='" + this.f12498a + "', name='" + this.f12499b + "', packagename='" + this.f12500c + "', versionCode='" + this.f12501d + "', versionName='" + this.f12502e + "', urlFicha='" + this.f12503f + "', status=" + this.f12504g + ", isSystemApp=" + this.f12505h + ", isSystemService=" + this.f12506i + ", md5='" + this.f12507j + "', minSdkVersion=" + this.f12508k + ", targetSdkVersion=" + this.f12509l + ", md5signature='" + this.f12510m + "', exclude=" + this.f12511n + ", size=" + this.f12512o + ", lastUpdateTime=" + this.f12513p + ", excludeFromTracking=" + this.f12514q + ", defaultName='" + this.f12515r + "', firstInstallTime=" + this.f12516s + ", sha256=" + this.f12517t + ", versionDetails=" + this.f12520w + ", appID=" + this.f12522y + ", hasOldVersions=" + this.f12523z + '}';
    }

    public final String u() {
        return this.f12507j;
    }

    public final void u0(int i8) {
        this.f12514q = i8;
    }

    public final void v0(boolean z8, boolean z9) {
        if (l0()) {
            if (!z8) {
                this.f12514q = 1;
            } else {
                this.f12514q = 0;
            }
        }
        if (n0()) {
            if (!z9) {
                this.f12514q = 1;
            } else {
                this.f12514q = 0;
            }
        }
    }

    public final void w0(long j8) {
        this.f12516s = j8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeLong(this.f12498a);
        parcel.writeString(this.f12499b);
        parcel.writeString(this.f12500c);
        parcel.writeLong(this.f12501d);
        parcel.writeString(this.f12502e);
        parcel.writeString(this.f12503f);
        int i9 = d.f12528a[this.f12504g.ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                parcel.writeInt(2);
            } else {
                parcel.writeInt(1);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f12505h);
        parcel.writeInt(this.f12506i);
        parcel.writeString(this.f12507j);
        parcel.writeInt(this.f12508k);
        parcel.writeInt(this.f12509l);
        parcel.writeString(this.f12510m);
        parcel.writeInt(this.f12511n);
        parcel.writeLong(this.f12512o);
        parcel.writeLong(this.f12513p);
        parcel.writeInt(this.f12514q);
        parcel.writeString(this.f12515r);
        parcel.writeLong(this.f12516s);
        parcel.writeString(this.f12517t);
        parcel.writeInt(this.f12518u);
        parcel.writeString(this.f12520w);
        parcel.writeLong(this.f12522y);
        parcel.writeInt(this.f12523z);
        parcel.writeInt(this.f12497C ? 1 : 0);
    }

    public final void x0(int i8) {
        this.f12523z = i8;
    }

    public final void y0(long j8) {
        this.f12498a = j8;
    }

    public final String z() {
        return this.f12510m;
    }

    public final void z0(long j8) {
        this.f12513p = j8;
    }

    public C1496f(Parcel source) {
        AbstractC3159y.i(source, "source");
        this.f12498a = -1L;
        this.f12501d = -1L;
        c cVar = c.UPDATED;
        this.f12504g = cVar;
        this.f12498a = source.readLong();
        this.f12499b = source.readString();
        this.f12500c = source.readString();
        this.f12501d = source.readLong();
        this.f12502e = source.readString();
        this.f12503f = source.readString();
        int readInt = source.readInt();
        if (readInt == 0) {
            this.f12504g = c.OUTDATED;
        } else if (readInt != 1) {
            this.f12504g = c.UNAVAILABLE;
        } else {
            this.f12504g = cVar;
        }
        this.f12505h = source.readInt();
        this.f12506i = source.readInt();
        this.f12507j = source.readString();
        this.f12508k = source.readInt();
        this.f12509l = source.readInt();
        this.f12510m = source.readString();
        this.f12511n = source.readInt();
        this.f12512o = source.readLong();
        this.f12513p = source.readLong();
        this.f12514q = source.readInt();
        this.f12515r = source.readString();
        this.f12516s = source.readLong();
        this.f12517t = source.readString();
        this.f12518u = source.readInt();
        this.f12520w = source.readString();
        this.f12522y = source.readLong();
        this.f12523z = source.readInt();
        this.f12497C = source.readInt() == 1;
    }
}
