package X4;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3326n;

/* renamed from: X4.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1492b {

    /* renamed from: j, reason: collision with root package name */
    public static final a f12462j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private long f12463a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f12464b = -1;

    /* renamed from: c, reason: collision with root package name */
    private String f12465c;

    /* renamed from: d, reason: collision with root package name */
    private String f12466d;

    /* renamed from: e, reason: collision with root package name */
    private String f12467e;

    /* renamed from: f, reason: collision with root package name */
    private String f12468f;

    /* renamed from: g, reason: collision with root package name */
    private String f12469g;

    /* renamed from: h, reason: collision with root package name */
    private String f12470h;

    /* renamed from: i, reason: collision with root package name */
    private String f12471i;

    /* renamed from: X4.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private final String e() {
        int i8 = this.f12464b;
        if (i8 != 1) {
            if (i8 != 3) {
                if (i8 != 4) {
                    return "Unknown";
                }
                return "INSTALLED_UPDATE";
            }
            return "DOWNLOADED_UPDATE";
        }
        return "NEW_UPDATE";
    }

    public final String a() {
        return this.f12465c;
    }

    public final String b() {
        return this.f12470h;
    }

    public final String c() {
        return this.f12471i;
    }

    public final int d() {
        return this.f12464b;
    }

    public final String f() {
        return this.f12469g;
    }

    public final String g() {
        return this.f12468f;
    }

    public final String h() {
        return this.f12467e;
    }

    public final String i() {
        return this.f12466d;
    }

    public final void j(C1496f appStored, O update, C3326n dbManager) {
        AbstractC3159y.i(appStored, "appStored");
        AbstractC3159y.i(update, "update");
        AbstractC3159y.i(dbManager, "dbManager");
        C1492b c1492b = new C1492b();
        c1492b.f12465c = appStored.Q();
        c1492b.f12464b = 3;
        c1492b.f12468f = String.valueOf(appStored.f0());
        c1492b.f12469g = String.valueOf(update.u());
        c1492b.f12466d = appStored.h0();
        c1492b.f12467e = update.z();
        c1492b.f12470h = String.valueOf(update.s());
        c1492b.f12471i = String.valueOf(System.currentTimeMillis() / 1000);
        dbManager.B0(c1492b);
    }

    public final void k(C1496f appUpdated, C3326n dbManager) {
        AbstractC3159y.i(appUpdated, "appUpdated");
        AbstractC3159y.i(dbManager, "dbManager");
        C1492b c1492b = new C1492b();
        c1492b.f12465c = appUpdated.Q();
        c1492b.f12464b = 4;
        c1492b.f12469g = String.valueOf(appUpdated.f0());
        c1492b.f12467e = appUpdated.h0();
        c1492b.f12471i = String.valueOf(System.currentTimeMillis() / 1000);
        dbManager.B0(c1492b);
    }

    public final void l(C1496f appStored, O update, C3326n dbManager) {
        AbstractC3159y.i(appStored, "appStored");
        AbstractC3159y.i(update, "update");
        AbstractC3159y.i(dbManager, "dbManager");
        C1492b c1492b = new C1492b();
        c1492b.f12465c = appStored.Q();
        c1492b.f12464b = 1;
        c1492b.f12468f = String.valueOf(appStored.f0());
        c1492b.f12469g = String.valueOf(update.u());
        c1492b.f12466d = appStored.h0();
        c1492b.f12467e = update.z();
        c1492b.f12470h = String.valueOf(update.s());
        c1492b.f12471i = String.valueOf(System.currentTimeMillis() / 1000);
        dbManager.B0(c1492b);
    }

    public String toString() {
        return "{id=" + this.f12463a + ", type=" + this.f12464b + ", typeReadable=" + e() + ", packageName=" + this.f12465c + ", versionNameOld=" + this.f12466d + ", versionNameNew=" + this.f12467e + ", versionCodeOld=" + this.f12468f + ", versionCodeNew=" + this.f12469g + ", size=" + this.f12470h + ", timestamp=" + this.f12471i + '}';
    }
}
