package b1;

import b1.AbstractC1854d;
import b1.C1853c;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1851a extends AbstractC1854d {

    /* renamed from: b, reason: collision with root package name */
    private final String f14229b;

    /* renamed from: c, reason: collision with root package name */
    private final C1853c.a f14230c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14231d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14232e;

    /* renamed from: f, reason: collision with root package name */
    private final long f14233f;

    /* renamed from: g, reason: collision with root package name */
    private final long f14234g;

    /* renamed from: h, reason: collision with root package name */
    private final String f14235h;

    /* renamed from: b1.a$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC1854d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f14236a;

        /* renamed from: b, reason: collision with root package name */
        private C1853c.a f14237b;

        /* renamed from: c, reason: collision with root package name */
        private String f14238c;

        /* renamed from: d, reason: collision with root package name */
        private String f14239d;

        /* renamed from: e, reason: collision with root package name */
        private Long f14240e;

        /* renamed from: f, reason: collision with root package name */
        private Long f14241f;

        /* renamed from: g, reason: collision with root package name */
        private String f14242g;

        @Override // b1.AbstractC1854d.a
        public AbstractC1854d a() {
            String str = "";
            if (this.f14237b == null) {
                str = " registrationStatus";
            }
            if (this.f14240e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f14241f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C1851a(this.f14236a, this.f14237b, this.f14238c, this.f14239d, this.f14240e.longValue(), this.f14241f.longValue(), this.f14242g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // b1.AbstractC1854d.a
        public AbstractC1854d.a b(String str) {
            this.f14238c = str;
            return this;
        }

        @Override // b1.AbstractC1854d.a
        public AbstractC1854d.a c(long j8) {
            this.f14240e = Long.valueOf(j8);
            return this;
        }

        @Override // b1.AbstractC1854d.a
        public AbstractC1854d.a d(String str) {
            this.f14236a = str;
            return this;
        }

        @Override // b1.AbstractC1854d.a
        public AbstractC1854d.a e(String str) {
            this.f14242g = str;
            return this;
        }

        @Override // b1.AbstractC1854d.a
        public AbstractC1854d.a f(String str) {
            this.f14239d = str;
            return this;
        }

        @Override // b1.AbstractC1854d.a
        public AbstractC1854d.a g(C1853c.a aVar) {
            if (aVar != null) {
                this.f14237b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        @Override // b1.AbstractC1854d.a
        public AbstractC1854d.a h(long j8) {
            this.f14241f = Long.valueOf(j8);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(AbstractC1854d abstractC1854d) {
            this.f14236a = abstractC1854d.d();
            this.f14237b = abstractC1854d.g();
            this.f14238c = abstractC1854d.b();
            this.f14239d = abstractC1854d.f();
            this.f14240e = Long.valueOf(abstractC1854d.c());
            this.f14241f = Long.valueOf(abstractC1854d.h());
            this.f14242g = abstractC1854d.e();
        }
    }

    @Override // b1.AbstractC1854d
    public String b() {
        return this.f14231d;
    }

    @Override // b1.AbstractC1854d
    public long c() {
        return this.f14233f;
    }

    @Override // b1.AbstractC1854d
    public String d() {
        return this.f14229b;
    }

    @Override // b1.AbstractC1854d
    public String e() {
        return this.f14235h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1854d)) {
            return false;
        }
        AbstractC1854d abstractC1854d = (AbstractC1854d) obj;
        String str3 = this.f14229b;
        if (str3 != null ? str3.equals(abstractC1854d.d()) : abstractC1854d.d() == null) {
            if (this.f14230c.equals(abstractC1854d.g()) && ((str = this.f14231d) != null ? str.equals(abstractC1854d.b()) : abstractC1854d.b() == null) && ((str2 = this.f14232e) != null ? str2.equals(abstractC1854d.f()) : abstractC1854d.f() == null) && this.f14233f == abstractC1854d.c() && this.f14234g == abstractC1854d.h()) {
                String str4 = this.f14235h;
                if (str4 == null) {
                    if (abstractC1854d.e() == null) {
                        return true;
                    }
                } else if (str4.equals(abstractC1854d.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // b1.AbstractC1854d
    public String f() {
        return this.f14232e;
    }

    @Override // b1.AbstractC1854d
    public C1853c.a g() {
        return this.f14230c;
    }

    @Override // b1.AbstractC1854d
    public long h() {
        return this.f14234g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f14229b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((hashCode ^ 1000003) * 1000003) ^ this.f14230c.hashCode()) * 1000003;
        String str2 = this.f14231d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i9 = (hashCode4 ^ hashCode2) * 1000003;
        String str3 = this.f14232e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i10 = (i9 ^ hashCode3) * 1000003;
        long j8 = this.f14233f;
        int i11 = (i10 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f14234g;
        int i12 = (i11 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        String str4 = this.f14235h;
        if (str4 != null) {
            i8 = str4.hashCode();
        }
        return i12 ^ i8;
    }

    @Override // b1.AbstractC1854d
    public AbstractC1854d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f14229b + ", registrationStatus=" + this.f14230c + ", authToken=" + this.f14231d + ", refreshToken=" + this.f14232e + ", expiresInSecs=" + this.f14233f + ", tokenCreationEpochInSecs=" + this.f14234g + ", fisError=" + this.f14235h + "}";
    }

    private C1851a(String str, C1853c.a aVar, String str2, String str3, long j8, long j9, String str4) {
        this.f14229b = str;
        this.f14230c = aVar;
        this.f14231d = str2;
        this.f14232e = str3;
        this.f14233f = j8;
        this.f14234g = j9;
        this.f14235h = str4;
    }
}
