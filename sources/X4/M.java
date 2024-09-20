package X4;

import android.content.Context;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3335w;

/* loaded from: classes5.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    private final String f12398a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12399b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12400c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f12401d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12402e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f12403f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f12404g;

    /* renamed from: h, reason: collision with root package name */
    private int f12405h;

    public M(Context context) {
        AbstractC3159y.i(context, "context");
        SettingsPreferences.a aVar = SettingsPreferences.f29309b;
        this.f12398a = aVar.q(context);
        this.f12399b = C3335w.f34532a.a(context);
        this.f12400c = aVar.z(context);
        this.f12401d = aVar.c0(context);
        this.f12402e = aVar.n(context);
        this.f12403f = aVar.R(context);
        this.f12404g = aVar.Y(context);
        this.f12405h = 625;
    }

    public final boolean a(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null && g6.n.s(str, str2, true)) {
            return true;
        }
        return false;
    }

    public final boolean b(M m8) {
        if (m8 != null && a(m8.f12398a, this.f12398a) && m8.f12399b == this.f12399b && m8.f12401d == this.f12401d && g6.n.s(m8.f12400c, this.f12400c, true) && AbstractC3159y.d(m8.f12402e, this.f12402e) && m8.f12403f == this.f12403f && m8.f12404g == this.f12404g) {
            return true;
        }
        return false;
    }

    public final String c() {
        return this.f12400c;
    }

    public final String d() {
        return this.f12398a;
    }

    public final int e() {
        return this.f12405h;
    }

    public final boolean f() {
        return this.f12403f;
    }

    public final String g() {
        return this.f12402e;
    }

    public final boolean h() {
        return this.f12404g;
    }

    public final boolean i() {
        return this.f12399b;
    }

    public final boolean j() {
        return this.f12401d;
    }

    public final void k(Context context, C1504n device) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(device, "device");
        new S4.q(context, device, this);
    }
}
