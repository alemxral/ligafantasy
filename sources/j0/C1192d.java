package J0;

import J0.B;

/* renamed from: J0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1192d extends B.a.AbstractC0072a {

    /* renamed from: a, reason: collision with root package name */
    private final String f4490a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4491b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4492c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0.d$b */
    /* loaded from: classes3.dex */
    public static final class b extends B.a.AbstractC0072a.AbstractC0073a {

        /* renamed from: a, reason: collision with root package name */
        private String f4493a;

        /* renamed from: b, reason: collision with root package name */
        private String f4494b;

        /* renamed from: c, reason: collision with root package name */
        private String f4495c;

        @Override // J0.B.a.AbstractC0072a.AbstractC0073a
        public B.a.AbstractC0072a a() {
            String str = "";
            if (this.f4493a == null) {
                str = " arch";
            }
            if (this.f4494b == null) {
                str = str + " libraryName";
            }
            if (this.f4495c == null) {
                str = str + " buildId";
            }
            if (str.isEmpty()) {
                return new C1192d(this.f4493a, this.f4494b, this.f4495c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.a.AbstractC0072a.AbstractC0073a
        public B.a.AbstractC0072a.AbstractC0073a b(String str) {
            if (str != null) {
                this.f4493a = str;
                return this;
            }
            throw new NullPointerException("Null arch");
        }

        @Override // J0.B.a.AbstractC0072a.AbstractC0073a
        public B.a.AbstractC0072a.AbstractC0073a c(String str) {
            if (str != null) {
                this.f4495c = str;
                return this;
            }
            throw new NullPointerException("Null buildId");
        }

        @Override // J0.B.a.AbstractC0072a.AbstractC0073a
        public B.a.AbstractC0072a.AbstractC0073a d(String str) {
            if (str != null) {
                this.f4494b = str;
                return this;
            }
            throw new NullPointerException("Null libraryName");
        }
    }

    @Override // J0.B.a.AbstractC0072a
    public String b() {
        return this.f4490a;
    }

    @Override // J0.B.a.AbstractC0072a
    public String c() {
        return this.f4492c;
    }

    @Override // J0.B.a.AbstractC0072a
    public String d() {
        return this.f4491b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.a.AbstractC0072a)) {
            return false;
        }
        B.a.AbstractC0072a abstractC0072a = (B.a.AbstractC0072a) obj;
        if (this.f4490a.equals(abstractC0072a.b()) && this.f4491b.equals(abstractC0072a.d()) && this.f4492c.equals(abstractC0072a.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f4490a.hashCode() ^ 1000003) * 1000003) ^ this.f4491b.hashCode()) * 1000003) ^ this.f4492c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f4490a + ", libraryName=" + this.f4491b + ", buildId=" + this.f4492c + "}";
    }

    private C1192d(String str, String str2, String str3) {
        this.f4490a = str;
        this.f4491b = str2;
        this.f4492c = str3;
    }
}
