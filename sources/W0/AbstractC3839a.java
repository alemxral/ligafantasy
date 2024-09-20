package w0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3839a {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f38920a;

    /* renamed from: b, reason: collision with root package name */
    private static Context f38921b;

    /* renamed from: c, reason: collision with root package name */
    private static C0899a f38922c;

    /* renamed from: w0.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0899a {

        /* renamed from: b, reason: collision with root package name */
        private static Method f38923b;

        /* renamed from: a, reason: collision with root package name */
        private final PackageManager f38924a;

        C0899a(PackageManager packageManager) {
            this.f38924a = packageManager;
        }

        Boolean a() {
            if (!AbstractC3839a.a()) {
                return null;
            }
            if (f38923b == null) {
                try {
                    f38923b = PackageManager.class.getDeclaredMethod("isInstantApp", null);
                } catch (NoSuchMethodException unused) {
                    return null;
                }
            }
            try {
                return (Boolean) f38923b.invoke(this.f38924a, null);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return null;
            }
        }
    }

    static /* synthetic */ boolean a() {
        return b();
    }

    private static boolean b() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static boolean c(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                if (f38920a != null && applicationContext.equals(f38921b)) {
                    return f38920a.booleanValue();
                }
                Boolean bool = null;
                f38920a = null;
                if (b()) {
                    if (f38922c == null || !applicationContext.equals(f38921b)) {
                        f38922c = new C0899a(applicationContext.getPackageManager());
                    }
                    bool = f38922c.a();
                }
                f38921b = applicationContext;
                if (bool != null) {
                    f38920a = bool;
                } else {
                    try {
                        applicationContext.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f38920a = Boolean.TRUE;
                    } catch (ClassNotFoundException unused) {
                        f38920a = Boolean.FALSE;
                    }
                }
                return f38920a.booleanValue();
            }
            throw new IllegalStateException("Application context is null!");
        }
        throw new IllegalArgumentException("Context must be non-null");
    }
}
