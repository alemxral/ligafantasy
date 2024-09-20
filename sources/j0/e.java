package J0;

import J0.B;

/* loaded from: classes3.dex */
final class e extends B.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f4496a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4497b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.c.a {

        /* renamed from: a, reason: collision with root package name */
        private String f4498a;

        /* renamed from: b, reason: collision with root package name */
        private String f4499b;

        @Override // J0.B.c.a
        public B.c a() {
            String str = "";
            if (this.f4498a == null) {
                str = " key";
            }
            if (this.f4499b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new e(this.f4498a, this.f4499b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.c.a
        public B.c.a b(String str) {
            if (str != null) {
                this.f4498a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        @Override // J0.B.c.a
        public B.c.a c(String str) {
            if (str != null) {
                this.f4499b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    @Override // J0.B.c
    public String b() {
        return this.f4496a;
    }

    @Override // J0.B.c
    public String c() {
        return this.f4497b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.c)) {
            return false;
        }
        B.c cVar = (B.c) obj;
        if (this.f4496a.equals(cVar.b()) && this.f4497b.equals(cVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f4496a.hashCode() ^ 1000003) * 1000003) ^ this.f4497b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f4496a + ", value=" + this.f4497b + "}";
    }

    private e(String str, String str2) {
        this.f4496a = str;
        this.f4497b = str2;
    }
}
