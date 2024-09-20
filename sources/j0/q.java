package J0;

import J0.B;

/* loaded from: classes3.dex */
final class q extends B.e.d.a.b.AbstractC0080d {

    /* renamed from: a, reason: collision with root package name */
    private final String f4610a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4611b;

    /* renamed from: c, reason: collision with root package name */
    private final long f4612c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.e.d.a.b.AbstractC0080d.AbstractC0081a {

        /* renamed from: a, reason: collision with root package name */
        private String f4613a;

        /* renamed from: b, reason: collision with root package name */
        private String f4614b;

        /* renamed from: c, reason: collision with root package name */
        private Long f4615c;

        @Override // J0.B.e.d.a.b.AbstractC0080d.AbstractC0081a
        public B.e.d.a.b.AbstractC0080d a() {
            String str = "";
            if (this.f4613a == null) {
                str = " name";
            }
            if (this.f4614b == null) {
                str = str + " code";
            }
            if (this.f4615c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new q(this.f4613a, this.f4614b, this.f4615c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.e.d.a.b.AbstractC0080d.AbstractC0081a
        public B.e.d.a.b.AbstractC0080d.AbstractC0081a b(long j8) {
            this.f4615c = Long.valueOf(j8);
            return this;
        }

        @Override // J0.B.e.d.a.b.AbstractC0080d.AbstractC0081a
        public B.e.d.a.b.AbstractC0080d.AbstractC0081a c(String str) {
            if (str != null) {
                this.f4614b = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        @Override // J0.B.e.d.a.b.AbstractC0080d.AbstractC0081a
        public B.e.d.a.b.AbstractC0080d.AbstractC0081a d(String str) {
            if (str != null) {
                this.f4613a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @Override // J0.B.e.d.a.b.AbstractC0080d
    public long b() {
        return this.f4612c;
    }

    @Override // J0.B.e.d.a.b.AbstractC0080d
    public String c() {
        return this.f4611b;
    }

    @Override // J0.B.e.d.a.b.AbstractC0080d
    public String d() {
        return this.f4610a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a.b.AbstractC0080d)) {
            return false;
        }
        B.e.d.a.b.AbstractC0080d abstractC0080d = (B.e.d.a.b.AbstractC0080d) obj;
        if (this.f4610a.equals(abstractC0080d.d()) && this.f4611b.equals(abstractC0080d.c()) && this.f4612c == abstractC0080d.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f4610a.hashCode() ^ 1000003) * 1000003) ^ this.f4611b.hashCode()) * 1000003;
        long j8 = this.f4612c;
        return hashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f4610a + ", code=" + this.f4611b + ", address=" + this.f4612c + "}";
    }

    private q(String str, String str2, long j8) {
        this.f4610a = str;
        this.f4611b = str2;
        this.f4612c = j8;
    }
}
