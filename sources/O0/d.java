package O0;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f7681a;

    /* renamed from: b, reason: collision with root package name */
    public final a f7682b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7683c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7684d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7685e;

    /* renamed from: f, reason: collision with root package name */
    public final double f7686f;

    /* renamed from: g, reason: collision with root package name */
    public final double f7687g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7688h;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7689a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f7690b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f7691c;

        public a(boolean z8, boolean z9, boolean z10) {
            this.f7689a = z8;
            this.f7690b = z9;
            this.f7691c = z10;
        }
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f7692a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7693b;

        public b(int i8, int i9) {
            this.f7692a = i8;
            this.f7693b = i9;
        }
    }

    public d(long j8, b bVar, a aVar, int i8, int i9, double d8, double d9, int i10) {
        this.f7683c = j8;
        this.f7681a = bVar;
        this.f7682b = aVar;
        this.f7684d = i8;
        this.f7685e = i9;
        this.f7686f = d8;
        this.f7687g = d9;
        this.f7688h = i10;
    }

    public boolean a(long j8) {
        if (this.f7683c < j8) {
            return true;
        }
        return false;
    }
}
