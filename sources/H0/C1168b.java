package H0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.List;

/* renamed from: H0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1168b {

    /* renamed from: a, reason: collision with root package name */
    public final String f3266a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3267b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3268c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3269d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3270e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3271f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3272g;

    /* renamed from: h, reason: collision with root package name */
    public final E0.e f3273h;

    public C1168b(String str, String str2, List list, String str3, String str4, String str5, String str6, E0.e eVar) {
        this.f3266a = str;
        this.f3267b = str2;
        this.f3268c = list;
        this.f3269d = str3;
        this.f3270e = str4;
        this.f3271f = str5;
        this.f3272g = str6;
        this.f3273h = eVar;
    }

    public static C1168b a(Context context, z zVar, String str, String str2, List list, E0.e eVar) {
        String packageName = context.getPackageName();
        String g8 = zVar.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String b8 = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C1168b(str, str2, list, g8, packageName, b8, str3, eVar);
    }

    private static String b(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            return Long.toString(longVersionCode);
        }
        return Integer.toString(packageInfo.versionCode);
    }
}
