package R;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes3.dex */
public abstract class Y {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f8464a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f8465b;

    /* renamed from: c, reason: collision with root package name */
    private static String f8466c;

    /* renamed from: d, reason: collision with root package name */
    private static int f8467d;

    public static int a(Context context) {
        b(context);
        return f8467d;
    }

    private static void b(Context context) {
        Bundle bundle;
        synchronized (f8464a) {
            try {
                if (f8465b) {
                    return;
                }
                f8465b = true;
                try {
                    bundle = Y.e.a(context).c(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e8) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e8);
                }
                if (bundle == null) {
                    return;
                }
                f8466c = bundle.getString("com.google.app.id");
                f8467d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
