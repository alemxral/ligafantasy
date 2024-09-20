package J0;

import J0.B;

/* loaded from: classes3.dex */
final class t extends B.e.d.c {

    /* renamed from: a, reason: collision with root package name */
    private final Double f4632a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4633b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4634c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4635d;

    /* renamed from: e, reason: collision with root package name */
    private final long f4636e;

    /* renamed from: f, reason: collision with root package name */
    private final long f4637f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.e.d.c.a {

        /* renamed from: a, reason: collision with root package name */
        private Double f4638a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f4639b;

        /* renamed from: c, reason: collision with root package name */
        private Boolean f4640c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f4641d;

        /* renamed from: e, reason: collision with root package name */
        private Long f4642e;

        /* renamed from: f, reason: collision with root package name */
        private Long f4643f;

        @Override // J0.B.e.d.c.a
        public B.e.d.c a() {
            String str = "";
            if (this.f4639b == null) {
                str = " batteryVelocity";
            }
            if (this.f4640c == null) {
                str = str + " proximityOn";
            }
            if (this.f4641d == null) {
                str = str + " orientation";
            }
            if (this.f4642e == null) {
                str = str + " ramUsed";
            }
            if (this.f4643f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new t(this.f4638a, this.f4639b.intValue(), this.f4640c.booleanValue(), this.f4641d.intValue(), this.f4642e.longValue(), this.f4643f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.e.d.c.a
        public B.e.d.c.a b(Double d8) {
            this.f4638a = d8;
            return this;
        }

        @Override // J0.B.e.d.c.a
        public B.e.d.c.a c(int i8) {
            this.f4639b = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.e.d.c.a
        public B.e.d.c.a d(long j8) {
            this.f4643f = Long.valueOf(j8);
            return this;
        }

        @Override // J0.B.e.d.c.a
        public B.e.d.c.a e(int i8) {
            this.f4641d = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.e.d.c.a
        public B.e.d.c.a f(boolean z8) {
            this.f4640c = Boolean.valueOf(z8);
            return this;
        }

        @Override // J0.B.e.d.c.a
        public B.e.d.c.a g(long j8) {
            this.f4642e = Long.valueOf(j8);
            return this;
        }
    }

    @Override // J0.B.e.d.c
    public Double b() {
        return this.f4632a;
    }

    @Override // J0.B.e.d.c
    public int c() {
        return this.f4633b;
    }

    @Override // J0.B.e.d.c
    public long d() {
        return this.f4637f;
    }

    @Override // J0.B.e.d.c
    public int e() {
        return this.f4635d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.c)) {
            return false;
        }
        B.e.d.c cVar = (B.e.d.c) obj;
        Double d8 = this.f4632a;
        if (d8 != null ? d8.equals(cVar.b()) : cVar.b() == null) {
            if (this.f4633b == cVar.c() && this.f4634c == cVar.g() && this.f4635d == cVar.e() && this.f4636e == cVar.f() && this.f4637f == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // J0.B.e.d.c
    public long f() {
        return this.f4636e;
    }

    @Override // J0.B.e.d.c
    public boolean g() {
        return this.f4634c;
    }

    public int hashCode() {
        int hashCode;
        int i8;
        Double d8 = this.f4632a;
        if (d8 == null) {
            hashCode = 0;
        } else {
            hashCode = d8.hashCode();
        }
        int i9 = (((hashCode ^ 1000003) * 1000003) ^ this.f4633b) * 1000003;
        if (this.f4634c) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        int i10 = (((i9 ^ i8) * 1000003) ^ this.f4635d) * 1000003;
        long j8 = this.f4636e;
        long j9 = this.f4637f;
        return ((i10 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f4632a + ", batteryVelocity=" + this.f4633b + ", proximityOn=" + this.f4634c + ", orientation=" + this.f4635d + ", ramUsed=" + this.f4636e + ", diskUsed=" + this.f4637f + "}";
    }

    private t(Double d8, int i8, boolean z8, int i9, long j8, long j9) {
        this.f4632a = d8;
        this.f4633b = i8;
        this.f4634c = z8;
        this.f4635d = i9;
        this.f4636e = j8;
        this.f4637f = j9;
    }
}
