package J0;

import J0.B;

/* loaded from: classes3.dex */
final class m extends B.e.d.a {

    /* renamed from: a, reason: collision with root package name */
    private final B.e.d.a.b f4572a;

    /* renamed from: b, reason: collision with root package name */
    private final C f4573b;

    /* renamed from: c, reason: collision with root package name */
    private final C f4574c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f4575d;

    /* renamed from: e, reason: collision with root package name */
    private final int f4576e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.e.d.a.AbstractC0075a {

        /* renamed from: a, reason: collision with root package name */
        private B.e.d.a.b f4577a;

        /* renamed from: b, reason: collision with root package name */
        private C f4578b;

        /* renamed from: c, reason: collision with root package name */
        private C f4579c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f4580d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f4581e;

        @Override // J0.B.e.d.a.AbstractC0075a
        public B.e.d.a a() {
            String str = "";
            if (this.f4577a == null) {
                str = " execution";
            }
            if (this.f4581e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new m(this.f4577a, this.f4578b, this.f4579c, this.f4580d, this.f4581e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.e.d.a.AbstractC0075a
        public B.e.d.a.AbstractC0075a b(Boolean bool) {
            this.f4580d = bool;
            return this;
        }

        @Override // J0.B.e.d.a.AbstractC0075a
        public B.e.d.a.AbstractC0075a c(C c8) {
            this.f4578b = c8;
            return this;
        }

        @Override // J0.B.e.d.a.AbstractC0075a
        public B.e.d.a.AbstractC0075a d(B.e.d.a.b bVar) {
            if (bVar != null) {
                this.f4577a = bVar;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        @Override // J0.B.e.d.a.AbstractC0075a
        public B.e.d.a.AbstractC0075a e(C c8) {
            this.f4579c = c8;
            return this;
        }

        @Override // J0.B.e.d.a.AbstractC0075a
        public B.e.d.a.AbstractC0075a f(int i8) {
            this.f4581e = Integer.valueOf(i8);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(B.e.d.a aVar) {
            this.f4577a = aVar.d();
            this.f4578b = aVar.c();
            this.f4579c = aVar.e();
            this.f4580d = aVar.b();
            this.f4581e = Integer.valueOf(aVar.f());
        }
    }

    @Override // J0.B.e.d.a
    public Boolean b() {
        return this.f4575d;
    }

    @Override // J0.B.e.d.a
    public C c() {
        return this.f4573b;
    }

    @Override // J0.B.e.d.a
    public B.e.d.a.b d() {
        return this.f4572a;
    }

    @Override // J0.B.e.d.a
    public C e() {
        return this.f4574c;
    }

    public boolean equals(Object obj) {
        C c8;
        C c9;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a)) {
            return false;
        }
        B.e.d.a aVar = (B.e.d.a) obj;
        if (this.f4572a.equals(aVar.d()) && ((c8 = this.f4573b) != null ? c8.equals(aVar.c()) : aVar.c() == null) && ((c9 = this.f4574c) != null ? c9.equals(aVar.e()) : aVar.e() == null) && ((bool = this.f4575d) != null ? bool.equals(aVar.b()) : aVar.b() == null) && this.f4576e == aVar.f()) {
            return true;
        }
        return false;
    }

    @Override // J0.B.e.d.a
    public int f() {
        return this.f4576e;
    }

    @Override // J0.B.e.d.a
    public B.e.d.a.AbstractC0075a g() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f4572a.hashCode() ^ 1000003) * 1000003;
        C c8 = this.f4573b;
        int i8 = 0;
        if (c8 == null) {
            hashCode = 0;
        } else {
            hashCode = c8.hashCode();
        }
        int i9 = (hashCode3 ^ hashCode) * 1000003;
        C c9 = this.f4574c;
        if (c9 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c9.hashCode();
        }
        int i10 = (i9 ^ hashCode2) * 1000003;
        Boolean bool = this.f4575d;
        if (bool != null) {
            i8 = bool.hashCode();
        }
        return ((i10 ^ i8) * 1000003) ^ this.f4576e;
    }

    public String toString() {
        return "Application{execution=" + this.f4572a + ", customAttributes=" + this.f4573b + ", internalKeys=" + this.f4574c + ", background=" + this.f4575d + ", uiOrientation=" + this.f4576e + "}";
    }

    private m(B.e.d.a.b bVar, C c8, C c9, Boolean bool, int i8) {
        this.f4572a = bVar;
        this.f4573b = c8;
        this.f4574c = c9;
        this.f4575d = bool;
        this.f4576e = i8;
    }
}
