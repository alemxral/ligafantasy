package J0;

import J0.B;

/* loaded from: classes3.dex */
final class l extends B.e.d {

    /* renamed from: a, reason: collision with root package name */
    private final long f4562a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4563b;

    /* renamed from: c, reason: collision with root package name */
    private final B.e.d.a f4564c;

    /* renamed from: d, reason: collision with root package name */
    private final B.e.d.c f4565d;

    /* renamed from: e, reason: collision with root package name */
    private final B.e.d.AbstractC0086d f4566e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.e.d.b {

        /* renamed from: a, reason: collision with root package name */
        private Long f4567a;

        /* renamed from: b, reason: collision with root package name */
        private String f4568b;

        /* renamed from: c, reason: collision with root package name */
        private B.e.d.a f4569c;

        /* renamed from: d, reason: collision with root package name */
        private B.e.d.c f4570d;

        /* renamed from: e, reason: collision with root package name */
        private B.e.d.AbstractC0086d f4571e;

        @Override // J0.B.e.d.b
        public B.e.d a() {
            String str = "";
            if (this.f4567a == null) {
                str = " timestamp";
            }
            if (this.f4568b == null) {
                str = str + " type";
            }
            if (this.f4569c == null) {
                str = str + " app";
            }
            if (this.f4570d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new l(this.f4567a.longValue(), this.f4568b, this.f4569c, this.f4570d, this.f4571e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.e.d.b
        public B.e.d.b b(B.e.d.a aVar) {
            if (aVar != null) {
                this.f4569c = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // J0.B.e.d.b
        public B.e.d.b c(B.e.d.c cVar) {
            if (cVar != null) {
                this.f4570d = cVar;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        @Override // J0.B.e.d.b
        public B.e.d.b d(B.e.d.AbstractC0086d abstractC0086d) {
            this.f4571e = abstractC0086d;
            return this;
        }

        @Override // J0.B.e.d.b
        public B.e.d.b e(long j8) {
            this.f4567a = Long.valueOf(j8);
            return this;
        }

        @Override // J0.B.e.d.b
        public B.e.d.b f(String str) {
            if (str != null) {
                this.f4568b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(B.e.d dVar) {
            this.f4567a = Long.valueOf(dVar.e());
            this.f4568b = dVar.f();
            this.f4569c = dVar.b();
            this.f4570d = dVar.c();
            this.f4571e = dVar.d();
        }
    }

    @Override // J0.B.e.d
    public B.e.d.a b() {
        return this.f4564c;
    }

    @Override // J0.B.e.d
    public B.e.d.c c() {
        return this.f4565d;
    }

    @Override // J0.B.e.d
    public B.e.d.AbstractC0086d d() {
        return this.f4566e;
    }

    @Override // J0.B.e.d
    public long e() {
        return this.f4562a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d)) {
            return false;
        }
        B.e.d dVar = (B.e.d) obj;
        if (this.f4562a == dVar.e() && this.f4563b.equals(dVar.f()) && this.f4564c.equals(dVar.b()) && this.f4565d.equals(dVar.c())) {
            B.e.d.AbstractC0086d abstractC0086d = this.f4566e;
            if (abstractC0086d == null) {
                if (dVar.d() == null) {
                    return true;
                }
            } else if (abstractC0086d.equals(dVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // J0.B.e.d
    public String f() {
        return this.f4563b;
    }

    @Override // J0.B.e.d
    public B.e.d.b g() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode;
        long j8 = this.f4562a;
        int hashCode2 = (((((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f4563b.hashCode()) * 1000003) ^ this.f4564c.hashCode()) * 1000003) ^ this.f4565d.hashCode()) * 1000003;
        B.e.d.AbstractC0086d abstractC0086d = this.f4566e;
        if (abstractC0086d == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC0086d.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public String toString() {
        return "Event{timestamp=" + this.f4562a + ", type=" + this.f4563b + ", app=" + this.f4564c + ", device=" + this.f4565d + ", log=" + this.f4566e + "}";
    }

    private l(long j8, String str, B.e.d.a aVar, B.e.d.c cVar, B.e.d.AbstractC0086d abstractC0086d) {
        this.f4562a = j8;
        this.f4563b = str;
        this.f4564c = aVar;
        this.f4565d = cVar;
        this.f4566e = abstractC0086d;
    }
}
