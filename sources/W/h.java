package W;

import O.AbstractC1268l;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f11939a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f11940b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f11941c;

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f11942d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f11942d == null) {
            boolean z8 = false;
            if (k.h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z8 = true;
            }
            f11942d = Boolean.valueOf(z8);
        }
        return f11942d.booleanValue();
    }

    public static boolean b() {
        int i8 = AbstractC1268l.f7658a;
        return "user".equals(Build.TYPE);
    }

    public static boolean c(Context context) {
        return g(context.getPackageManager());
    }

    public static boolean d(Context context) {
        if (!c(context) || k.g()) {
            if (e(context)) {
                if (!k.h() || k.k()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean e(Context context) {
        if (f11940b == null) {
            boolean z8 = false;
            if (k.f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z8 = true;
            }
            f11940b = Boolean.valueOf(z8);
        }
        return f11940b.booleanValue();
    }

    public static boolean f(Context context) {
        if (f11941c == null) {
            boolean z8 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z8 = false;
            }
            f11941c = Boolean.valueOf(z8);
        }
        return f11941c.booleanValue();
    }

    public static boolean g(PackageManager packageManager) {
        if (f11939a == null) {
            boolean z8 = false;
            if (k.e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z8 = true;
            }
            f11939a = Boolean.valueOf(z8);
        }
        return f11939a.booleanValue();
    }
}
