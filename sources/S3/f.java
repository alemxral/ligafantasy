package S3;

import L5.r;
import L5.x;
import M5.Q;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.core.os.LocaleListCompat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Y;

/* loaded from: classes4.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Z3.d f9029a;

    /* renamed from: b, reason: collision with root package name */
    private final DisplayMetrics f9030b;

    public f(Context context, Z3.d hardwareIdSupplier) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(hardwareIdSupplier, "hardwareIdSupplier");
        this.f9029a = hardwareIdSupplier;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        AbstractC3159y.h(displayMetrics, "getDisplayMetrics(...)");
        this.f9030b = displayMetrics;
    }

    @Override // S3.e
    public Map a() {
        Map h8;
        String b8 = ((j) this.f9029a.get()).b();
        r a8 = x.a(g.f9111b.toString(), "Android");
        r a9 = x.a(g.f9114c.toString(), Build.MODEL);
        r a10 = x.a(g.f9117d.toString(), Build.VERSION.CODENAME);
        r a11 = x.a(g.f9120e.toString(), Build.VERSION.RELEASE);
        r a12 = x.a(g.f9123f.toString(), LocaleListCompat.create(Locale.getDefault()).toLanguageTags());
        r a13 = x.a(g.f9126g.toString(), TimeZone.getDefault().getDisplayName());
        String gVar = g.f9132i.toString();
        Y y8 = Y.f33752a;
        String format = String.format(Locale.ROOT, "%sx%s", Arrays.copyOf(new Object[]{Integer.valueOf(this.f9030b.heightPixels), Integer.valueOf(this.f9030b.widthPixels)}, 2));
        AbstractC3159y.h(format, "format(locale, format, *args)");
        Map k8 = Q.k(a8, a9, a10, a11, a12, a13, x.a(gVar, format));
        if (b8.length() > 0) {
            h8 = Q.e(x.a(g.f9129h.toString(), b8));
        } else {
            h8 = Q.h();
        }
        return Q.q(k8, h8);
    }
}
