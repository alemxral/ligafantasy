package l5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import androidx.core.content.ContextCompat;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import j$.util.DesugarTimeZone;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: l5.A, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3307A {

    /* renamed from: a, reason: collision with root package name */
    public static final C3307A f34459a = new C3307A();

    /* renamed from: b, reason: collision with root package name */
    private static ArrayList f34460b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private static Y4.f f34461c = new Y4.f(null);

    /* renamed from: d, reason: collision with root package name */
    private static Y4.e f34462d = new Y4.e(null);

    /* renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap f34463e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private static ArrayList f34464f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private static ArrayList f34465g = new ArrayList();

    private C3307A() {
    }

    public final void a(long j8) {
        f34465g.add(Long.valueOf(j8));
    }

    public final void b(long j8) {
        f34464f.add(Long.valueOf(j8));
    }

    public final Spanned c(String str) {
        Spanned fromHtml;
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(str, 0);
            AbstractC3159y.h(fromHtml, "fromHtml(html, HtmlCompat.FROM_HTML_MODE_LEGACY)");
            return fromHtml;
        }
        Spanned fromHtml2 = Html.fromHtml(str);
        AbstractC3159y.h(fromHtml2, "fromHtml(html)");
        return fromHtml2;
    }

    public final ArrayList d() {
        return f34460b;
    }

    public final String e() {
        DateFormat timeInstance = DateFormat.getTimeInstance();
        timeInstance.setTimeZone(DesugarTimeZone.getTimeZone("gmt"));
        timeInstance.format(new Date(System.currentTimeMillis()));
        long timeInMillis = (timeInstance.getCalendar().getTimeInMillis() - (((r0.get(12) * MBridgeCommon.DEFAULT_LOAD_TIMEOUT) + (r0.get(13) * 1000)) + r0.get(14))) / 1000;
        return N4.d.f7188a.c("$(=a%·!45J&S" + timeInMillis);
    }

    public final Y4.e f() {
        return f34462d;
    }

    public final Y4.f g() {
        return f34461c;
    }

    public final boolean h(long j8) {
        return f34465g.contains(Long.valueOf(j8));
    }

    public final boolean i(long j8) {
        return f34464f.contains(Long.valueOf(j8));
    }

    public final Drawable j(Context context, String str) {
        AbstractC3159y.i(context, "context");
        return k(context, str, -1);
    }

    public final Drawable k(Context context, String str, int i8) {
        AbstractC3159y.i(context, "context");
        if (str != null) {
            Drawable drawable = (Drawable) f34463e.get(str);
            if (drawable == null) {
                try {
                    PackageManager packageManager = context.getPackageManager();
                    AbstractC3159y.h(packageManager, "context.packageManager");
                    drawable = N4.q.d(packageManager, str, 0).applicationInfo.loadIcon(context.getPackageManager());
                } catch (Exception unused) {
                    if (i8 != -1) {
                        drawable = ContextCompat.getDrawable(context, i8);
                    }
                }
                if (drawable != null) {
                    f34463e.put(str, drawable);
                    return drawable;
                }
                return drawable;
            }
            return drawable;
        }
        return null;
    }

    public final Drawable l(Context context, String pathFile, int i8) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(pathFile, "pathFile");
        Drawable drawable = (Drawable) f34463e.get(pathFile);
        if (drawable == null) {
            PackageManager pm = context.getPackageManager();
            try {
                AbstractC3159y.h(pm, "pm");
                PackageInfo c8 = N4.q.c(pm, pathFile, 128);
                if (c8 != null) {
                    ApplicationInfo applicationInfo = c8.applicationInfo;
                    applicationInfo.sourceDir = pathFile;
                    applicationInfo.publicSourceDir = pathFile;
                    drawable = applicationInfo.loadIcon(pm);
                } else {
                    drawable = ContextCompat.getDrawable(context, i8);
                }
            } catch (Exception unused) {
                if (i8 != -1) {
                    drawable = ContextCompat.getDrawable(context, i8);
                }
            }
            if (drawable != null) {
                f34463e.put(pathFile, drawable);
            }
        }
        return drawable;
    }

    public final void m(long j8) {
        f34464f.remove(Long.valueOf(j8));
    }

    public final void n(HttpsURLConnection mHttpsURLConnection) {
        AbstractC3159y.i(mHttpsURLConnection, "mHttpsURLConnection");
        mHttpsURLConnection.setRequestProperty("Identificador", "Uptodown_Android");
        mHttpsURLConnection.setRequestProperty("Identificador-Version", "625");
        mHttpsURLConnection.setRequestProperty("APIKEY", e());
        mHttpsURLConnection.setConnectTimeout(MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
        mHttpsURLConnection.setReadTimeout(90000);
    }
}
