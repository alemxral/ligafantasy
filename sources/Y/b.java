package Y;

import W.k;
import android.content.Context;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static Context f12739a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f12740b;

    public static synchronized boolean a(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (b.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f12739a;
            if (context2 != null && (bool = f12740b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f12740b = null;
            if (k.h()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f12740b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f12740b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f12740b = Boolean.FALSE;
                }
            }
            f12739a = applicationContext;
            return f12740b.booleanValue();
        }
    }
}
