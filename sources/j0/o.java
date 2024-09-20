package J0;

import J0.B;

/* loaded from: classes3.dex */
final class o extends B.e.d.a.b.AbstractC0076a {

    /* renamed from: a, reason: collision with root package name */
    private final long f4592a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4593b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4594c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4595d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.e.d.a.b.AbstractC0076a.AbstractC0077a {

        /* renamed from: a, reason: collision with root package name */
        private Long f4596a;

        /* renamed from: b, reason: collision with root package name */
        private Long f4597b;

        /* renamed from: c, reason: collision with root package name */
        private String f4598c;

        /* renamed from: d, reason: collision with root package name */
        private String f4599d;

        @Override // J0.B.e.d.a.b.AbstractC0076a.AbstractC0077a
        public B.e.d.a.b.AbstractC0076a a() {
            String str = "";
            if (this.f4596a == null) {
                str = " baseAddress";
            }
            if (this.f4597b == null) {
                str = str + " size";
            }
            if (this.f4598c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new o(this.f4596a.longValue(), this.f4597b.longValue(), this.f4598c, this.f4599d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.e.d.a.b.AbstractC0076a.AbstractC0077a
        public B.e.d.a.b.AbstractC0076a.AbstractC0077a b(long j8) {
            this.f4596a = Long.valueOf(j8);
            return this;
        }

        @Override // J0.B.e.d.a.b.AbstractC0076a.AbstractC0077a
        public B.e.d.a.b.AbstractC0076a.AbstractC0077a c(String str) {
            if (str != null) {
                this.f4598c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override // J0.B.e.d.a.b.AbstractC0076a.AbstractC0077a
        public B.e.d.a.b.AbstractC0076a.AbstractC0077a d(long j8) {
            this.f4597b = Long.valueOf(j8);
            return this;
        }

        @Override // J0.B.e.d.a.b.AbstractC0076a.AbstractC0077a
        public B.e.d.a.b.AbstractC0076a.AbstractC0077a e(String str) {
            this.f4599d = str;
            return this;
        }
    }

    @Override // J0.B.e.d.a.b.AbstractC0076a
    public long b() {
        return this.f4592a;
    }

    @Override // J0.B.e.d.a.b.AbstractC0076a
    public String c() {
        return this.f4594c;
    }

    @Override // J0.B.e.d.a.b.AbstractC0076a
    public long d() {
        return this.f4593b;
    }

    @Override // J0.B.e.d.a.b.AbstractC0076a
    public String e() {
        return this.f4595d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a.b.AbstractC0076a)) {
            return false;
        }
        B.e.d.a.b.AbstractC0076a abstractC0076a = (B.e.d.a.b.AbstractC0076a) obj;
        if (this.f4592a == abstractC0076a.b() && this.f4593b == abstractC0076a.d() && this.f4594c.equals(abstractC0076a.c())) {
            String str = this.f4595d;
            if (str == null) {
                if (abstractC0076a.e() == null) {
                    return true;
                }
            } else if (str.equals(abstractC0076a.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        long j8 = this.f4592a;
        long j9 = this.f4593b;
        int hashCode2 = (((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f4594c.hashCode()) * 1000003;
        String str = this.f4595d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f4592a + ", size=" + this.f4593b + ", name=" + this.f4594c + ", uuid=" + this.f4595d + "}";
    }

    private o(long j8, long j9, String str, String str2) {
        this.f4592a = j8;
        this.f4593b = j9;
        this.f4594c = str;
        this.f4595d = str2;
    }
}
