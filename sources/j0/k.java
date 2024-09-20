package J0;

import J0.B;

/* loaded from: classes3.dex */
final class k extends B.e.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f4544a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4545b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4546c;

    /* renamed from: d, reason: collision with root package name */
    private final long f4547d;

    /* renamed from: e, reason: collision with root package name */
    private final long f4548e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f4549f;

    /* renamed from: g, reason: collision with root package name */
    private final int f4550g;

    /* renamed from: h, reason: collision with root package name */
    private final String f4551h;

    /* renamed from: i, reason: collision with root package name */
    private final String f4552i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.e.c.a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f4553a;

        /* renamed from: b, reason: collision with root package name */
        private String f4554b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f4555c;

        /* renamed from: d, reason: collision with root package name */
        private Long f4556d;

        /* renamed from: e, reason: collision with root package name */
        private Long f4557e;

        /* renamed from: f, reason: collision with root package name */
        private Boolean f4558f;

        /* renamed from: g, reason: collision with root package name */
        private Integer f4559g;

        /* renamed from: h, reason: collision with root package name */
        private String f4560h;

        /* renamed from: i, reason: collision with root package name */
        private String f4561i;

        @Override // J0.B.e.c.a
        public B.e.c a() {
            String str = "";
            if (this.f4553a == null) {
                str = " arch";
            }
            if (this.f4554b == null) {
                str = str + " model";
            }
            if (this.f4555c == null) {
                str = str + " cores";
            }
            if (this.f4556d == null) {
                str = str + " ram";
            }
            if (this.f4557e == null) {
                str = str + " diskSpace";
            }
            if (this.f4558f == null) {
                str = str + " simulator";
            }
            if (this.f4559g == null) {
                str = str + " state";
            }
            if (this.f4560h == null) {
                str = str + " manufacturer";
            }
            if (this.f4561i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new k(this.f4553a.intValue(), this.f4554b, this.f4555c.intValue(), this.f4556d.longValue(), this.f4557e.longValue(), this.f4558f.booleanValue(), this.f4559g.intValue(), this.f4560h, this.f4561i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.e.c.a
        public B.e.c.a b(int i8) {
            this.f4553a = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.e.c.a
        public B.e.c.a c(int i8) {
            this.f4555c = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.e.c.a
        public B.e.c.a d(long j8) {
            this.f4557e = Long.valueOf(j8);
            return this;
        }

        @Override // J0.B.e.c.a
        public B.e.c.a e(String str) {
            if (str != null) {
                this.f4560h = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        @Override // J0.B.e.c.a
        public B.e.c.a f(String str) {
            if (str != null) {
                this.f4554b = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        @Override // J0.B.e.c.a
        public B.e.c.a g(String str) {
            if (str != null) {
                this.f4561i = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        @Override // J0.B.e.c.a
        public B.e.c.a h(long j8) {
            this.f4556d = Long.valueOf(j8);
            return this;
        }

        @Override // J0.B.e.c.a
        public B.e.c.a i(boolean z8) {
            this.f4558f = Boolean.valueOf(z8);
            return this;
        }

        @Override // J0.B.e.c.a
        public B.e.c.a j(int i8) {
            this.f4559g = Integer.valueOf(i8);
            return this;
        }
    }

    @Override // J0.B.e.c
    public int b() {
        return this.f4544a;
    }

    @Override // J0.B.e.c
    public int c() {
        return this.f4546c;
    }

    @Override // J0.B.e.c
    public long d() {
        return this.f4548e;
    }

    @Override // J0.B.e.c
    public String e() {
        return this.f4551h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.c)) {
            return false;
        }
        B.e.c cVar = (B.e.c) obj;
        if (this.f4544a == cVar.b() && this.f4545b.equals(cVar.f()) && this.f4546c == cVar.c() && this.f4547d == cVar.h() && this.f4548e == cVar.d() && this.f4549f == cVar.j() && this.f4550g == cVar.i() && this.f4551h.equals(cVar.e()) && this.f4552i.equals(cVar.g())) {
            return true;
        }
        return false;
    }

    @Override // J0.B.e.c
    public String f() {
        return this.f4545b;
    }

    @Override // J0.B.e.c
    public String g() {
        return this.f4552i;
    }

    @Override // J0.B.e.c
    public long h() {
        return this.f4547d;
    }

    public int hashCode() {
        int i8;
        int hashCode = (((((this.f4544a ^ 1000003) * 1000003) ^ this.f4545b.hashCode()) * 1000003) ^ this.f4546c) * 1000003;
        long j8 = this.f4547d;
        int i9 = (hashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f4548e;
        int i10 = (i9 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        if (this.f4549f) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        return ((((((i10 ^ i8) * 1000003) ^ this.f4550g) * 1000003) ^ this.f4551h.hashCode()) * 1000003) ^ this.f4552i.hashCode();
    }

    @Override // J0.B.e.c
    public int i() {
        return this.f4550g;
    }

    @Override // J0.B.e.c
    public boolean j() {
        return this.f4549f;
    }

    public String toString() {
        return "Device{arch=" + this.f4544a + ", model=" + this.f4545b + ", cores=" + this.f4546c + ", ram=" + this.f4547d + ", diskSpace=" + this.f4548e + ", simulator=" + this.f4549f + ", state=" + this.f4550g + ", manufacturer=" + this.f4551h + ", modelClass=" + this.f4552i + "}";
    }

    private k(int i8, String str, int i9, long j8, long j9, boolean z8, int i10, String str2, String str3) {
        this.f4544a = i8;
        this.f4545b = str;
        this.f4546c = i9;
        this.f4547d = j8;
        this.f4548e = j9;
        this.f4549f = z8;
        this.f4550g = i10;
        this.f4551h = str2;
        this.f4552i = str3;
    }
}
