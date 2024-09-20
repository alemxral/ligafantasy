package x;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private static final c f39055c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f39056a;

    /* renamed from: b, reason: collision with root package name */
    private final b f39057b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f39058a = 0;

        /* renamed from: b, reason: collision with root package name */
        private b f39059b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f39058a, this.f39059b);
        }

        public a b(long j8) {
            this.f39058a = j8;
            return this;
        }

        public a c(b bVar) {
            this.f39059b = bVar;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public enum b implements V0.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: a, reason: collision with root package name */
        private final int f39068a;

        b(int i8) {
            this.f39068a = i8;
        }

        @Override // V0.c
        public int getNumber() {
            return this.f39068a;
        }
    }

    c(long j8, b bVar) {
        this.f39056a = j8;
        this.f39057b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f39056a;
    }

    public b b() {
        return this.f39057b;
    }
}
