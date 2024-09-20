package J0;

import J0.B;

/* renamed from: J0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1190b extends B {

    /* renamed from: b, reason: collision with root package name */
    private final String f4452b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4453c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4454d;

    /* renamed from: e, reason: collision with root package name */
    private final String f4455e;

    /* renamed from: f, reason: collision with root package name */
    private final String f4456f;

    /* renamed from: g, reason: collision with root package name */
    private final String f4457g;

    /* renamed from: h, reason: collision with root package name */
    private final String f4458h;

    /* renamed from: i, reason: collision with root package name */
    private final B.e f4459i;

    /* renamed from: j, reason: collision with root package name */
    private final B.d f4460j;

    /* renamed from: k, reason: collision with root package name */
    private final B.a f4461k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0089b extends B.b {

        /* renamed from: a, reason: collision with root package name */
        private String f4462a;

        /* renamed from: b, reason: collision with root package name */
        private String f4463b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f4464c;

        /* renamed from: d, reason: collision with root package name */
        private String f4465d;

        /* renamed from: e, reason: collision with root package name */
        private String f4466e;

        /* renamed from: f, reason: collision with root package name */
        private String f4467f;

        /* renamed from: g, reason: collision with root package name */
        private String f4468g;

        /* renamed from: h, reason: collision with root package name */
        private B.e f4469h;

        /* renamed from: i, reason: collision with root package name */
        private B.d f4470i;

        /* renamed from: j, reason: collision with root package name */
        private B.a f4471j;

        @Override // J0.B.b
        public B a() {
            String str = "";
            if (this.f4462a == null) {
                str = " sdkVersion";
            }
            if (this.f4463b == null) {
                str = str + " gmpAppId";
            }
            if (this.f4464c == null) {
                str = str + " platform";
            }
            if (this.f4465d == null) {
                str = str + " installationUuid";
            }
            if (this.f4467f == null) {
                str = str + " buildVersion";
            }
            if (this.f4468g == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new C1190b(this.f4462a, this.f4463b, this.f4464c.intValue(), this.f4465d, this.f4466e, this.f4467f, this.f4468g, this.f4469h, this.f4470i, this.f4471j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.b
        public B.b b(B.a aVar) {
            this.f4471j = aVar;
            return this;
        }

        @Override // J0.B.b
        public B.b c(String str) {
            if (str != null) {
                this.f4467f = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // J0.B.b
        public B.b d(String str) {
            if (str != null) {
                this.f4468g = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        @Override // J0.B.b
        public B.b e(String str) {
            this.f4466e = str;
            return this;
        }

        @Override // J0.B.b
        public B.b f(String str) {
            if (str != null) {
                this.f4463b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        @Override // J0.B.b
        public B.b g(String str) {
            if (str != null) {
                this.f4465d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        @Override // J0.B.b
        public B.b h(B.d dVar) {
            this.f4470i = dVar;
            return this;
        }

        @Override // J0.B.b
        public B.b i(int i8) {
            this.f4464c = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.b
        public B.b j(String str) {
            if (str != null) {
                this.f4462a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        @Override // J0.B.b
        public B.b k(B.e eVar) {
            this.f4469h = eVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0089b() {
        }

        private C0089b(B b8) {
            this.f4462a = b8.k();
            this.f4463b = b8.g();
            this.f4464c = Integer.valueOf(b8.j());
            this.f4465d = b8.h();
            this.f4466e = b8.f();
            this.f4467f = b8.d();
            this.f4468g = b8.e();
            this.f4469h = b8.l();
            this.f4470i = b8.i();
            this.f4471j = b8.c();
        }
    }

    @Override // J0.B
    public B.a c() {
        return this.f4461k;
    }

    @Override // J0.B
    public String d() {
        return this.f4457g;
    }

    @Override // J0.B
    public String e() {
        return this.f4458h;
    }

    public boolean equals(Object obj) {
        String str;
        B.e eVar;
        B.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b8 = (B) obj;
        if (this.f4452b.equals(b8.k()) && this.f4453c.equals(b8.g()) && this.f4454d == b8.j() && this.f4455e.equals(b8.h()) && ((str = this.f4456f) != null ? str.equals(b8.f()) : b8.f() == null) && this.f4457g.equals(b8.d()) && this.f4458h.equals(b8.e()) && ((eVar = this.f4459i) != null ? eVar.equals(b8.l()) : b8.l() == null) && ((dVar = this.f4460j) != null ? dVar.equals(b8.i()) : b8.i() == null)) {
            B.a aVar = this.f4461k;
            if (aVar == null) {
                if (b8.c() == null) {
                    return true;
                }
            } else if (aVar.equals(b8.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // J0.B
    public String f() {
        return this.f4456f;
    }

    @Override // J0.B
    public String g() {
        return this.f4453c;
    }

    @Override // J0.B
    public String h() {
        return this.f4455e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (((((((this.f4452b.hashCode() ^ 1000003) * 1000003) ^ this.f4453c.hashCode()) * 1000003) ^ this.f4454d) * 1000003) ^ this.f4455e.hashCode()) * 1000003;
        String str = this.f4456f;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode5 = (((((hashCode4 ^ hashCode) * 1000003) ^ this.f4457g.hashCode()) * 1000003) ^ this.f4458h.hashCode()) * 1000003;
        B.e eVar = this.f4459i;
        if (eVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = eVar.hashCode();
        }
        int i9 = (hashCode5 ^ hashCode2) * 1000003;
        B.d dVar = this.f4460j;
        if (dVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = dVar.hashCode();
        }
        int i10 = (i9 ^ hashCode3) * 1000003;
        B.a aVar = this.f4461k;
        if (aVar != null) {
            i8 = aVar.hashCode();
        }
        return i10 ^ i8;
    }

    @Override // J0.B
    public B.d i() {
        return this.f4460j;
    }

    @Override // J0.B
    public int j() {
        return this.f4454d;
    }

    @Override // J0.B
    public String k() {
        return this.f4452b;
    }

    @Override // J0.B
    public B.e l() {
        return this.f4459i;
    }

    @Override // J0.B
    protected B.b m() {
        return new C0089b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f4452b + ", gmpAppId=" + this.f4453c + ", platform=" + this.f4454d + ", installationUuid=" + this.f4455e + ", firebaseInstallationId=" + this.f4456f + ", buildVersion=" + this.f4457g + ", displayVersion=" + this.f4458h + ", session=" + this.f4459i + ", ndkPayload=" + this.f4460j + ", appExitInfo=" + this.f4461k + "}";
    }

    private C1190b(String str, String str2, int i8, String str3, String str4, String str5, String str6, B.e eVar, B.d dVar, B.a aVar) {
        this.f4452b = str;
        this.f4453c = str2;
        this.f4454d = i8;
        this.f4455e = str3;
        this.f4456f = str4;
        this.f4457g = str5;
        this.f4458h = str6;
        this.f4459i = eVar;
        this.f4460j = dVar;
        this.f4461k = aVar;
    }
}
