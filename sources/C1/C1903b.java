package c1;

import c1.f;

/* renamed from: c1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1903b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f14845a;

    /* renamed from: b, reason: collision with root package name */
    private final long f14846b;

    /* renamed from: c, reason: collision with root package name */
    private final f.b f14847c;

    /* renamed from: c1.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0365b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f14848a;

        /* renamed from: b, reason: collision with root package name */
        private Long f14849b;

        /* renamed from: c, reason: collision with root package name */
        private f.b f14850c;

        @Override // c1.f.a
        public f a() {
            String str = "";
            if (this.f14849b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C1903b(this.f14848a, this.f14849b.longValue(), this.f14850c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c1.f.a
        public f.a b(f.b bVar) {
            this.f14850c = bVar;
            return this;
        }

        @Override // c1.f.a
        public f.a c(String str) {
            this.f14848a = str;
            return this;
        }

        @Override // c1.f.a
        public f.a d(long j8) {
            this.f14849b = Long.valueOf(j8);
            return this;
        }
    }

    @Override // c1.f
    public f.b b() {
        return this.f14847c;
    }

    @Override // c1.f
    public String c() {
        return this.f14845a;
    }

    @Override // c1.f
    public long d() {
        return this.f14846b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f14845a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f14846b == fVar.d()) {
                f.b bVar = this.f14847c;
                if (bVar == null) {
                    if (fVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f14845a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j8 = this.f14846b;
        int i9 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        f.b bVar = this.f14847c;
        if (bVar != null) {
            i8 = bVar.hashCode();
        }
        return i9 ^ i8;
    }

    public String toString() {
        return "TokenResult{token=" + this.f14845a + ", tokenExpirationTimestamp=" + this.f14846b + ", responseCode=" + this.f14847c + "}";
    }

    private C1903b(String str, long j8, f.b bVar) {
        this.f14845a = str;
        this.f14846b = j8;
        this.f14847c = bVar;
    }
}
