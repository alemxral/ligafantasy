package X4;

import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.uptodown.UptodownApp;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class J {

    /* renamed from: e, reason: collision with root package name */
    public static final a f12363e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f12364a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12365b;

    /* renamed from: c, reason: collision with root package name */
    private int f12366c;

    /* renamed from: d, reason: collision with root package name */
    private long f12367d;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public J(String type, String json) {
        AbstractC3159y.i(type, "type");
        AbstractC3159y.i(json, "json");
        this.f12364a = type;
        this.f12365b = json;
        this.f12366c = -1;
        this.f12367d = System.currentTimeMillis();
    }

    private final int f() {
        if (UptodownApp.f27990B.M()) {
            return MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
        }
        if (!g6.n.s(this.f12364a, "new_releases", true) && !g6.n.s(this.f12364a, "last_updates", true)) {
            return 1800000;
        }
        return 600000;
    }

    public final boolean a() {
        if (System.currentTimeMillis() - this.f12367d < f()) {
            return true;
        }
        return false;
    }

    public final String b() {
        return this.f12365b;
    }

    public final I c() {
        I i8 = new I();
        i8.i(this.f12365b);
        i8.j(200);
        return i8;
    }

    public final long d() {
        return this.f12367d;
    }

    public final String e() {
        return this.f12364a;
    }

    public final void g(int i8) {
        this.f12366c = i8;
    }

    public final void h(long j8) {
        this.f12367d = j8;
    }
}
