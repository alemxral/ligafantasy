package x;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    private static final e f39074c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f39075a;

    /* renamed from: b, reason: collision with root package name */
    private final long f39076b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f39077a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f39078b = 0;

        a() {
        }

        public e a() {
            return new e(this.f39077a, this.f39078b);
        }

        public a b(long j8) {
            this.f39077a = j8;
            return this;
        }

        public a c(long j8) {
            this.f39078b = j8;
            return this;
        }
    }

    e(long j8, long j9) {
        this.f39075a = j8;
        this.f39076b = j9;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f39075a;
    }

    public long b() {
        return this.f39076b;
    }
}
