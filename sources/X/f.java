package x;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    private static final f f39079c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f39080a;

    /* renamed from: b, reason: collision with root package name */
    private final long f39081b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f39082a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f39083b = 0;

        a() {
        }

        public f a() {
            return new f(this.f39082a, this.f39083b);
        }

        public a b(long j8) {
            this.f39083b = j8;
            return this;
        }

        public a c(long j8) {
            this.f39082a = j8;
            return this;
        }
    }

    f(long j8, long j9) {
        this.f39080a = j8;
        this.f39081b = j9;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f39081b;
    }

    public long b() {
        return this.f39080a;
    }
}
