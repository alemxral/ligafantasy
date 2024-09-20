package J0;

import J0.B;

/* loaded from: classes3.dex */
final class h extends B.e {

    /* renamed from: a, reason: collision with root package name */
    private final String f4508a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4509b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4510c;

    /* renamed from: d, reason: collision with root package name */
    private final long f4511d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f4512e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f4513f;

    /* renamed from: g, reason: collision with root package name */
    private final B.e.a f4514g;

    /* renamed from: h, reason: collision with root package name */
    private final B.e.f f4515h;

    /* renamed from: i, reason: collision with root package name */
    private final B.e.AbstractC0087e f4516i;

    /* renamed from: j, reason: collision with root package name */
    private final B.e.c f4517j;

    /* renamed from: k, reason: collision with root package name */
    private final C f4518k;

    /* renamed from: l, reason: collision with root package name */
    private final int f4519l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.e.b {

        /* renamed from: a, reason: collision with root package name */
        private String f4520a;

        /* renamed from: b, reason: collision with root package name */
        private String f4521b;

        /* renamed from: c, reason: collision with root package name */
        private String f4522c;

        /* renamed from: d, reason: collision with root package name */
        private Long f4523d;

        /* renamed from: e, reason: collision with root package name */
        private Long f4524e;

        /* renamed from: f, reason: collision with root package name */
        private Boolean f4525f;

        /* renamed from: g, reason: collision with root package name */
        private B.e.a f4526g;

        /* renamed from: h, reason: collision with root package name */
        private B.e.f f4527h;

        /* renamed from: i, reason: collision with root package name */
        private B.e.AbstractC0087e f4528i;

        /* renamed from: j, reason: collision with root package name */
        private B.e.c f4529j;

        /* renamed from: k, reason: collision with root package name */
        private C f4530k;

        /* renamed from: l, reason: collision with root package name */
        private Integer f4531l;

        @Override // J0.B.e.b
        public B.e a() {
            String str = "";
            if (this.f4520a == null) {
                str = " generator";
            }
            if (this.f4521b == null) {
                str = str + " identifier";
            }
            if (this.f4523d == null) {
                str = str + " startedAt";
            }
            if (this.f4525f == null) {
                str = str + " crashed";
            }
            if (this.f4526g == null) {
                str = str + " app";
            }
            if (this.f4531l == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new h(this.f4520a, this.f4521b, this.f4522c, this.f4523d.longValue(), this.f4524e, this.f4525f.booleanValue(), this.f4526g, this.f4527h, this.f4528i, this.f4529j, this.f4530k, this.f4531l.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.e.b
        public B.e.b b(B.e.a aVar) {
            if (aVar != null) {
                this.f4526g = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // J0.B.e.b
        public B.e.b c(String str) {
            this.f4522c = str;
            return this;
        }

        @Override // J0.B.e.b
        public B.e.b d(boolean z8) {
            this.f4525f = Boolean.valueOf(z8);
            return this;
        }

        @Override // J0.B.e.b
        public B.e.b e(B.e.c cVar) {
            this.f4529j = cVar;
            return this;
        }

        @Override // J0.B.e.b
        public B.e.b f(Long l8) {
            this.f4524e = l8;
            return this;
        }

        @Override // J0.B.e.b
        public B.e.b g(C c8) {
            this.f4530k = c8;
            return this;
        }

        @Override // J0.B.e.b
        public B.e.b h(String str) {
            if (str != null) {
                this.f4520a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        @Override // J0.B.e.b
        public B.e.b i(int i8) {
            this.f4531l = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.e.b
        public B.e.b j(String str) {
            if (str != null) {
                this.f4521b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // J0.B.e.b
        public B.e.b l(B.e.AbstractC0087e abstractC0087e) {
            this.f4528i = abstractC0087e;
            return this;
        }

        @Override // J0.B.e.b
        public B.e.b m(long j8) {
            this.f4523d = Long.valueOf(j8);
            return this;
        }

        @Override // J0.B.e.b
        public B.e.b n(B.e.f fVar) {
            this.f4527h = fVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(B.e eVar) {
            this.f4520a = eVar.g();
            this.f4521b = eVar.i();
            this.f4522c = eVar.c();
            this.f4523d = Long.valueOf(eVar.l());
            this.f4524e = eVar.e();
            this.f4525f = Boolean.valueOf(eVar.n());
            this.f4526g = eVar.b();
            this.f4527h = eVar.m();
            this.f4528i = eVar.k();
            this.f4529j = eVar.d();
            this.f4530k = eVar.f();
            this.f4531l = Integer.valueOf(eVar.h());
        }
    }

    @Override // J0.B.e
    public B.e.a b() {
        return this.f4514g;
    }

    @Override // J0.B.e
    public String c() {
        return this.f4510c;
    }

    @Override // J0.B.e
    public B.e.c d() {
        return this.f4517j;
    }

    @Override // J0.B.e
    public Long e() {
        return this.f4512e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l8;
        B.e.f fVar;
        B.e.AbstractC0087e abstractC0087e;
        B.e.c cVar;
        C c8;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e)) {
            return false;
        }
        B.e eVar = (B.e) obj;
        if (this.f4508a.equals(eVar.g()) && this.f4509b.equals(eVar.i()) && ((str = this.f4510c) != null ? str.equals(eVar.c()) : eVar.c() == null) && this.f4511d == eVar.l() && ((l8 = this.f4512e) != null ? l8.equals(eVar.e()) : eVar.e() == null) && this.f4513f == eVar.n() && this.f4514g.equals(eVar.b()) && ((fVar = this.f4515h) != null ? fVar.equals(eVar.m()) : eVar.m() == null) && ((abstractC0087e = this.f4516i) != null ? abstractC0087e.equals(eVar.k()) : eVar.k() == null) && ((cVar = this.f4517j) != null ? cVar.equals(eVar.d()) : eVar.d() == null) && ((c8 = this.f4518k) != null ? c8.equals(eVar.f()) : eVar.f() == null) && this.f4519l == eVar.h()) {
            return true;
        }
        return false;
    }

    @Override // J0.B.e
    public C f() {
        return this.f4518k;
    }

    @Override // J0.B.e
    public String g() {
        return this.f4508a;
    }

    @Override // J0.B.e
    public int h() {
        return this.f4519l;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i8;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.f4508a.hashCode() ^ 1000003) * 1000003) ^ this.f4509b.hashCode()) * 1000003;
        String str = this.f4510c;
        int i9 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j8 = this.f4511d;
        int i10 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        Long l8 = this.f4512e;
        if (l8 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l8.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        if (this.f4513f) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        int hashCode7 = (((i11 ^ i8) * 1000003) ^ this.f4514g.hashCode()) * 1000003;
        B.e.f fVar = this.f4515h;
        if (fVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = fVar.hashCode();
        }
        int i12 = (hashCode7 ^ hashCode3) * 1000003;
        B.e.AbstractC0087e abstractC0087e = this.f4516i;
        if (abstractC0087e == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = abstractC0087e.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        B.e.c cVar = this.f4517j;
        if (cVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = cVar.hashCode();
        }
        int i14 = (i13 ^ hashCode5) * 1000003;
        C c8 = this.f4518k;
        if (c8 != null) {
            i9 = c8.hashCode();
        }
        return ((i14 ^ i9) * 1000003) ^ this.f4519l;
    }

    @Override // J0.B.e
    public String i() {
        return this.f4509b;
    }

    @Override // J0.B.e
    public B.e.AbstractC0087e k() {
        return this.f4516i;
    }

    @Override // J0.B.e
    public long l() {
        return this.f4511d;
    }

    @Override // J0.B.e
    public B.e.f m() {
        return this.f4515h;
    }

    @Override // J0.B.e
    public boolean n() {
        return this.f4513f;
    }

    @Override // J0.B.e
    public B.e.b o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f4508a + ", identifier=" + this.f4509b + ", appQualitySessionId=" + this.f4510c + ", startedAt=" + this.f4511d + ", endedAt=" + this.f4512e + ", crashed=" + this.f4513f + ", app=" + this.f4514g + ", user=" + this.f4515h + ", os=" + this.f4516i + ", device=" + this.f4517j + ", events=" + this.f4518k + ", generatorType=" + this.f4519l + "}";
    }

    private h(String str, String str2, String str3, long j8, Long l8, boolean z8, B.e.a aVar, B.e.f fVar, B.e.AbstractC0087e abstractC0087e, B.e.c cVar, C c8, int i8) {
        this.f4508a = str;
        this.f4509b = str2;
        this.f4510c = str3;
        this.f4511d = j8;
        this.f4512e = l8;
        this.f4513f = z8;
        this.f4514g = aVar;
        this.f4515h = fVar;
        this.f4516i = abstractC0087e;
        this.f4517j = cVar;
        this.f4518k = c8;
        this.f4519l = i8;
    }
}
