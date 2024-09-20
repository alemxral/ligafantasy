package J0;

import J0.B;

/* loaded from: classes3.dex */
final class p extends B.e.d.a.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f4600a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4601b;

    /* renamed from: c, reason: collision with root package name */
    private final C f4602c;

    /* renamed from: d, reason: collision with root package name */
    private final B.e.d.a.b.c f4603d;

    /* renamed from: e, reason: collision with root package name */
    private final int f4604e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.e.d.a.b.c.AbstractC0079a {

        /* renamed from: a, reason: collision with root package name */
        private String f4605a;

        /* renamed from: b, reason: collision with root package name */
        private String f4606b;

        /* renamed from: c, reason: collision with root package name */
        private C f4607c;

        /* renamed from: d, reason: collision with root package name */
        private B.e.d.a.b.c f4608d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f4609e;

        @Override // J0.B.e.d.a.b.c.AbstractC0079a
        public B.e.d.a.b.c a() {
            String str = "";
            if (this.f4605a == null) {
                str = " type";
            }
            if (this.f4607c == null) {
                str = str + " frames";
            }
            if (this.f4609e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new p(this.f4605a, this.f4606b, this.f4607c, this.f4608d, this.f4609e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.e.d.a.b.c.AbstractC0079a
        public B.e.d.a.b.c.AbstractC0079a b(B.e.d.a.b.c cVar) {
            this.f4608d = cVar;
            return this;
        }

        @Override // J0.B.e.d.a.b.c.AbstractC0079a
        public B.e.d.a.b.c.AbstractC0079a c(C c8) {
            if (c8 != null) {
                this.f4607c = c8;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // J0.B.e.d.a.b.c.AbstractC0079a
        public B.e.d.a.b.c.AbstractC0079a d(int i8) {
            this.f4609e = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.e.d.a.b.c.AbstractC0079a
        public B.e.d.a.b.c.AbstractC0079a e(String str) {
            this.f4606b = str;
            return this;
        }

        @Override // J0.B.e.d.a.b.c.AbstractC0079a
        public B.e.d.a.b.c.AbstractC0079a f(String str) {
            if (str != null) {
                this.f4605a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    @Override // J0.B.e.d.a.b.c
    public B.e.d.a.b.c b() {
        return this.f4603d;
    }

    @Override // J0.B.e.d.a.b.c
    public C c() {
        return this.f4602c;
    }

    @Override // J0.B.e.d.a.b.c
    public int d() {
        return this.f4604e;
    }

    @Override // J0.B.e.d.a.b.c
    public String e() {
        return this.f4601b;
    }

    public boolean equals(Object obj) {
        String str;
        B.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a.b.c)) {
            return false;
        }
        B.e.d.a.b.c cVar2 = (B.e.d.a.b.c) obj;
        if (this.f4600a.equals(cVar2.f()) && ((str = this.f4601b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f4602c.equals(cVar2.c()) && ((cVar = this.f4603d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f4604e == cVar2.d()) {
            return true;
        }
        return false;
    }

    @Override // J0.B.e.d.a.b.c
    public String f() {
        return this.f4600a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f4600a.hashCode() ^ 1000003) * 1000003;
        String str = this.f4601b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f4602c.hashCode()) * 1000003;
        B.e.d.a.b.c cVar = this.f4603d;
        if (cVar != null) {
            i8 = cVar.hashCode();
        }
        return ((hashCode3 ^ i8) * 1000003) ^ this.f4604e;
    }

    public String toString() {
        return "Exception{type=" + this.f4600a + ", reason=" + this.f4601b + ", frames=" + this.f4602c + ", causedBy=" + this.f4603d + ", overflowCount=" + this.f4604e + "}";
    }

    private p(String str, String str2, C c8, B.e.d.a.b.c cVar, int i8) {
        this.f4600a = str;
        this.f4601b = str2;
        this.f4602c = c8;
        this.f4603d = cVar;
        this.f4604e = i8;
    }
}
