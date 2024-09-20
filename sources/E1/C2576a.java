package e1;

import W0.c;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.ContextCompat;

/* renamed from: e1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2576a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30210a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f30211b;

    /* renamed from: c, reason: collision with root package name */
    private final c f30212c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f30213d;

    public C2576a(Context context, String str, c cVar) {
        Context a8 = a(context);
        this.f30210a = a8;
        this.f30211b = a8.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f30212c = cVar;
        this.f30213d = c();
    }

    private static Context a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return context;
        }
        return ContextCompat.createDeviceProtectedStorageContext(context);
    }

    private boolean c() {
        if (this.f30211b.contains("firebase_data_collection_default_enabled")) {
            return this.f30211b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f30210a.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.f30210a.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized boolean b() {
        return this.f30213d;
    }
}
