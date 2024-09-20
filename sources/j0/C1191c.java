package J0;

import J0.B;

/* renamed from: J0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1191c extends B.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f4472a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4473b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4474c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4475d;

    /* renamed from: e, reason: collision with root package name */
    private final long f4476e;

    /* renamed from: f, reason: collision with root package name */
    private final long f4477f;

    /* renamed from: g, reason: collision with root package name */
    private final long f4478g;

    /* renamed from: h, reason: collision with root package name */
    private final String f4479h;

    /* renamed from: i, reason: collision with root package name */
    private final C f4480i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0.c$b */
    /* loaded from: classes3.dex */
    public static final class b extends B.a.b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f4481a;

        /* renamed from: b, reason: collision with root package name */
        private String f4482b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f4483c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f4484d;

        /* renamed from: e, reason: collision with root package name */
        private Long f4485e;

        /* renamed from: f, reason: collision with root package name */
        private Long f4486f;

        /* renamed from: g, reason: collision with root package name */
        private Long f4487g;

        /* renamed from: h, reason: collision with root package name */
        private String f4488h;

        /* renamed from: i, reason: collision with root package name */
        private C f4489i;

        @Override // J0.B.a.b
        public B.a a() {
            String str = "";
            if (this.f4481a == null) {
                str = " pid";
            }
            if (this.f4482b == null) {
                str = str + " processName";
            }
            if (this.f4483c == null) {
                str = str + " reasonCode";
            }
            if (this.f4484d == null) {
                str = str + " importance";
            }
            if (this.f4485e == null) {
                str = str + " pss";
            }
            if (this.f4486f == null) {
                str = str + " rss";
            }
            if (this.f4487g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new C1191c(this.f4481a.intValue(), this.f4482b, this.f4483c.intValue(), this.f4484d.intValue(), this.f4485e.longValue(), this.f4486f.longValue(), this.f4487g.longValue(), this.f4488h, this.f4489i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.a.b
        public B.a.b b(C c8) {
            this.f4489i = c8;
            return this;
        }

        @Override // J0.B.a.b
        public B.a.b c(int i8) {
            this.f4484d = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.a.b
        public B.a.b d(int i8) {
            this.f4481a = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.a.b
        public B.a.b e(String str) {
            if (str != null) {
                this.f4482b = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        @Override // J0.B.a.b
        public B.a.b f(long j8) {
            this.f4485e = Long.valueOf(j8);
            return this;
        }

        @Override // J0.B.a.b
        public B.a.b g(int i8) {
            this.f4483c = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.a.b
        public B.a.b h(long j8) {
            this.f4486f = Long.valueOf(j8);
            return this;
        }

        @Override // J0.B.a.b
        public B.a.b i(long j8) {
            this.f4487g = Long.valueOf(j8);
            return this;
        }

        @Override // J0.B.a.b
        public B.a.b j(String str) {
            this.f4488h = str;
            return this;
        }
    }

    @Override // J0.B.a
    public C b() {
        return this.f4480i;
    }

    @Override // J0.B.a
    public int c() {
        return this.f4475d;
    }

    @Override // J0.B.a
    public int d() {
        return this.f4472a;
    }

    @Override // J0.B.a
    public String e() {
        return this.f4473b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.a)) {
            return false;
        }
        B.a aVar = (B.a) obj;
        if (this.f4472a == aVar.d() && this.f4473b.equals(aVar.e()) && this.f4474c == aVar.g() && this.f4475d == aVar.c() && this.f4476e == aVar.f() && this.f4477f == aVar.h() && this.f4478g == aVar.i() && ((str = this.f4479h) != null ? str.equals(aVar.j()) : aVar.j() == null)) {
            C c8 = this.f4480i;
            if (c8 == null) {
                if (aVar.b() == null) {
                    return true;
                }
            } else if (c8.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // J0.B.a
    public long f() {
        return this.f4476e;
    }

    @Override // J0.B.a
    public int g() {
        return this.f4474c;
    }

    @Override // J0.B.a
    public long h() {
        return this.f4477f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.f4472a ^ 1000003) * 1000003) ^ this.f4473b.hashCode()) * 1000003) ^ this.f4474c) * 1000003) ^ this.f4475d) * 1000003;
        long j8 = this.f4476e;
        int i8 = (hashCode2 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f4477f;
        int i9 = (i8 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f4478g;
        int i10 = (i9 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str = this.f4479h;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (i10 ^ hashCode) * 1000003;
        C c8 = this.f4480i;
        if (c8 != null) {
            i11 = c8.hashCode();
        }
        return i12 ^ i11;
    }

    @Override // J0.B.a
    public long i() {
        return this.f4478g;
    }

    @Override // J0.B.a
    public String j() {
        return this.f4479h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f4472a + ", processName=" + this.f4473b + ", reasonCode=" + this.f4474c + ", importance=" + this.f4475d + ", pss=" + this.f4476e + ", rss=" + this.f4477f + ", timestamp=" + this.f4478g + ", traceFile=" + this.f4479h + ", buildIdMappingForArch=" + this.f4480i + "}";
    }

    private C1191c(int i8, String str, int i9, int i10, long j8, long j9, long j10, String str2, C c8) {
        this.f4472a = i8;
        this.f4473b = str;
        this.f4474c = i9;
        this.f4475d = i10;
        this.f4476e = j8;
        this.f4477f = j9;
        this.f4478g = j10;
        this.f4479h = str2;
        this.f4480i = c8;
    }
}
