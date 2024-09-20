package K4;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0115a f5938f = new C0115a(null);

    /* renamed from: a, reason: collision with root package name */
    private String f5939a;

    /* renamed from: c, reason: collision with root package name */
    private String f5941c;

    /* renamed from: d, reason: collision with root package name */
    private long f5942d;

    /* renamed from: b, reason: collision with root package name */
    private long f5940b = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f5943e = -1;

    /* renamed from: K4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0115a {
        private C0115a() {
        }

        public /* synthetic */ C0115a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public final String a() {
        return this.f5941c;
    }

    public final String b() {
        return this.f5939a;
    }

    public final long c() {
        return this.f5943e;
    }

    public final long d() {
        return this.f5942d;
    }

    public final long e() {
        return this.f5940b;
    }

    public final void f(String packageName, long j8, String appName, long j9) {
        AbstractC3159y.i(packageName, "packageName");
        AbstractC3159y.i(appName, "appName");
        this.f5939a = packageName;
        this.f5940b = j8;
        this.f5941c = appName;
        this.f5942d = System.currentTimeMillis();
        this.f5943e = j9;
    }
}
