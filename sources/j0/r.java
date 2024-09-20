package J0;

import J0.B;

/* loaded from: classes3.dex */
final class r extends B.e.d.a.b.AbstractC0082e {

    /* renamed from: a, reason: collision with root package name */
    private final String f4616a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4617b;

    /* renamed from: c, reason: collision with root package name */
    private final C f4618c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.e.d.a.b.AbstractC0082e.AbstractC0083a {

        /* renamed from: a, reason: collision with root package name */
        private String f4619a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f4620b;

        /* renamed from: c, reason: collision with root package name */
        private C f4621c;

        @Override // J0.B.e.d.a.b.AbstractC0082e.AbstractC0083a
        public B.e.d.a.b.AbstractC0082e a() {
            String str = "";
            if (this.f4619a == null) {
                str = " name";
            }
            if (this.f4620b == null) {
                str = str + " importance";
            }
            if (this.f4621c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new r(this.f4619a, this.f4620b.intValue(), this.f4621c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.e.d.a.b.AbstractC0082e.AbstractC0083a
        public B.e.d.a.b.AbstractC0082e.AbstractC0083a b(C c8) {
            if (c8 != null) {
                this.f4621c = c8;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // J0.B.e.d.a.b.AbstractC0082e.AbstractC0083a
        public B.e.d.a.b.AbstractC0082e.AbstractC0083a c(int i8) {
            this.f4620b = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.e.d.a.b.AbstractC0082e.AbstractC0083a
        public B.e.d.a.b.AbstractC0082e.AbstractC0083a d(String str) {
            if (str != null) {
                this.f4619a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @Override // J0.B.e.d.a.b.AbstractC0082e
    public C b() {
        return this.f4618c;
    }

    @Override // J0.B.e.d.a.b.AbstractC0082e
    public int c() {
        return this.f4617b;
    }

    @Override // J0.B.e.d.a.b.AbstractC0082e
    public String d() {
        return this.f4616a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a.b.AbstractC0082e)) {
            return false;
        }
        B.e.d.a.b.AbstractC0082e abstractC0082e = (B.e.d.a.b.AbstractC0082e) obj;
        if (this.f4616a.equals(abstractC0082e.d()) && this.f4617b == abstractC0082e.c() && this.f4618c.equals(abstractC0082e.b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f4616a.hashCode() ^ 1000003) * 1000003) ^ this.f4617b) * 1000003) ^ this.f4618c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f4616a + ", importance=" + this.f4617b + ", frames=" + this.f4618c + "}";
    }

    private r(String str, int i8, C c8) {
        this.f4616a = str;
        this.f4617b = i8;
        this.f4618c = c8;
    }
}
