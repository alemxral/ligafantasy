package E0;

import android.util.Log;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    static final f f1915c = new f("FirebaseCrashlytics");

    /* renamed from: a, reason: collision with root package name */
    private final String f1916a;

    /* renamed from: b, reason: collision with root package name */
    private int f1917b = 4;

    public f(String str) {
        this.f1916a = str;
    }

    private boolean a(int i8) {
        if (this.f1917b > i8 && !Log.isLoggable(this.f1916a, i8)) {
            return false;
        }
        return true;
    }

    public static f f() {
        return f1915c;
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th) {
        if (a(3)) {
            Log.d(this.f1916a, str, th);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.f1916a, str, th);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th) {
        if (a(4)) {
            Log.i(this.f1916a, str, th);
        }
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th) {
        if (a(2)) {
            Log.v(this.f1916a, str, th);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th) {
        if (a(5)) {
            Log.w(this.f1916a, str, th);
        }
    }
}
