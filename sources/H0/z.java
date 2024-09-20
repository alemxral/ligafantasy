package H0;

import H0.A;
import a1.InterfaceC1554e;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class z implements A {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f3419g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h, reason: collision with root package name */
    private static final String f3420h = Pattern.quote("/");

    /* renamed from: a, reason: collision with root package name */
    private final B f3421a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f3422b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3423c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1554e f3424d;

    /* renamed from: e, reason: collision with root package name */
    private final C1187v f3425e;

    /* renamed from: f, reason: collision with root package name */
    private A.a f3426f;

    public z(Context context, String str, InterfaceC1554e interfaceC1554e, C1187v c1187v) {
        if (context != null) {
            if (str != null) {
                this.f3422b = context;
                this.f3423c = str;
                this.f3424d = interfaceC1554e;
                this.f3425e = c1187v;
                this.f3421a = new B();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String e8;
        e8 = e(UUID.randomUUID().toString());
        E0.f.f().i("Created new Crashlytics installation ID: " + e8 + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e8).putString("firebase.installation.id", str).apply();
        return e8;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private static String e(String str) {
        if (str == null) {
            return null;
        }
        return f3419g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        if (str != null && str.startsWith("SYN_")) {
            return true;
        }
        return false;
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(f3420h, "");
    }

    private boolean n() {
        A.a aVar = this.f3426f;
        if (aVar != null && (aVar.d() != null || !this.f3425e.d())) {
            return false;
        }
        return true;
    }

    @Override // H0.A
    public synchronized A.a a() {
        if (!n()) {
            return this.f3426f;
        }
        E0.f.f().i("Determining Crashlytics installation ID...");
        SharedPreferences s8 = AbstractC1176j.s(this.f3422b);
        String string = s8.getString("firebase.installation.id", null);
        E0.f.f().i("Cached Firebase Installation ID: " + string);
        if (this.f3425e.d()) {
            String d8 = d();
            E0.f.f().i("Fetched Firebase Installation ID: " + d8);
            if (d8 == null) {
                if (string == null) {
                    d8 = c();
                } else {
                    d8 = string;
                }
            }
            if (d8.equals(string)) {
                this.f3426f = A.a.a(l(s8), d8);
            } else {
                this.f3426f = A.a.a(b(d8, s8), d8);
            }
        } else if (k(string)) {
            this.f3426f = A.a.b(l(s8));
        } else {
            this.f3426f = A.a.b(b(c(), s8));
        }
        E0.f.f().i("Install IDs: " + this.f3426f);
        return this.f3426f;
    }

    public String d() {
        try {
            return (String) W.f(this.f3424d.getId());
        } catch (Exception e8) {
            E0.f.f().l("Failed to retrieve Firebase Installation ID.", e8);
            return null;
        }
    }

    public String f() {
        return this.f3423c;
    }

    public String g() {
        return this.f3421a.a(this.f3422b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
