package X4;

import android.content.Context;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: f, reason: collision with root package name */
    public static final a f12714f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private String f12716b;

    /* renamed from: d, reason: collision with root package name */
    private long f12718d;

    /* renamed from: e, reason: collision with root package name */
    private long f12719e;

    /* renamed from: a, reason: collision with root package name */
    private long f12715a = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f12717c = -1;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(Context context) {
            AbstractC3159y.i(context, "context");
            SettingsPreferences.f29309b.c(context);
        }

        public final x b(Context context) {
            AbstractC3159y.i(context, "context");
            x A8 = SettingsPreferences.f29309b.A(context);
            if (A8 != null) {
                if (A8.h()) {
                    return A8;
                }
                a(context);
                return null;
            }
            return null;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h() {
        if (this.f12715a > -1 && this.f12716b != null) {
            long j8 = this.f12718d;
            if (j8 > 0 && j8 + 86400000 > System.currentTimeMillis()) {
                return true;
            }
        }
        return false;
    }

    public final long b() {
        return this.f12715a;
    }

    public final int c() {
        return this.f12717c;
    }

    public final String d() {
        return this.f12716b;
    }

    public final long e() {
        return this.f12718d;
    }

    public final long f() {
        return this.f12719e;
    }

    public final boolean g() {
        if (this.f12719e > 0) {
            return true;
        }
        return false;
    }

    public final void i(Context context) {
        AbstractC3159y.i(context, "context");
        SettingsPreferences.f29309b.s0(context, this);
    }

    public final void j(long j8) {
        this.f12715a = j8;
    }

    public final void k(int i8) {
        this.f12717c = i8;
    }

    public final void l(Context context, int i8) {
        AbstractC3159y.i(context, "context");
        this.f12717c = i8;
        i(context);
    }

    public final void m(String str) {
        this.f12716b = str;
    }

    public final void n(Context context) {
        AbstractC3159y.i(context, "context");
        this.f12718d = System.currentTimeMillis();
        i(context);
    }

    public final void o(long j8) {
        this.f12718d = j8;
    }

    public final void p(Context context) {
        AbstractC3159y.i(context, "context");
        this.f12719e = System.currentTimeMillis();
        i(context);
    }

    public final void q(long j8) {
        this.f12719e = j8;
    }

    public String toString() {
        return "NotificationFCM(appId=" + this.f12715a + ", packageName=" + this.f12716b + ", downloadId=" + this.f12717c + ')';
    }
}
