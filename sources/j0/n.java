package J0;

import J0.B;

/* loaded from: classes3.dex */
final class n extends B.e.d.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final C f4582a;

    /* renamed from: b, reason: collision with root package name */
    private final B.e.d.a.b.c f4583b;

    /* renamed from: c, reason: collision with root package name */
    private final B.a f4584c;

    /* renamed from: d, reason: collision with root package name */
    private final B.e.d.a.b.AbstractC0080d f4585d;

    /* renamed from: e, reason: collision with root package name */
    private final C f4586e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.e.d.a.b.AbstractC0078b {

        /* renamed from: a, reason: collision with root package name */
        private C f4587a;

        /* renamed from: b, reason: collision with root package name */
        private B.e.d.a.b.c f4588b;

        /* renamed from: c, reason: collision with root package name */
        private B.a f4589c;

        /* renamed from: d, reason: collision with root package name */
        private B.e.d.a.b.AbstractC0080d f4590d;

        /* renamed from: e, reason: collision with root package name */
        private C f4591e;

        @Override // J0.B.e.d.a.b.AbstractC0078b
        public B.e.d.a.b a() {
            String str = "";
            if (this.f4590d == null) {
                str = " signal";
            }
            if (this.f4591e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new n(this.f4587a, this.f4588b, this.f4589c, this.f4590d, this.f4591e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.e.d.a.b.AbstractC0078b
        public B.e.d.a.b.AbstractC0078b b(B.a aVar) {
            this.f4589c = aVar;
            return this;
        }

        @Override // J0.B.e.d.a.b.AbstractC0078b
        public B.e.d.a.b.AbstractC0078b c(C c8) {
            if (c8 != null) {
                this.f4591e = c8;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        @Override // J0.B.e.d.a.b.AbstractC0078b
        public B.e.d.a.b.AbstractC0078b d(B.e.d.a.b.c cVar) {
            this.f4588b = cVar;
            return this;
        }

        @Override // J0.B.e.d.a.b.AbstractC0078b
        public B.e.d.a.b.AbstractC0078b e(B.e.d.a.b.AbstractC0080d abstractC0080d) {
            if (abstractC0080d != null) {
                this.f4590d = abstractC0080d;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        @Override // J0.B.e.d.a.b.AbstractC0078b
        public B.e.d.a.b.AbstractC0078b f(C c8) {
            this.f4587a = c8;
            return this;
        }
    }

    @Override // J0.B.e.d.a.b
    public B.a b() {
        return this.f4584c;
    }

    @Override // J0.B.e.d.a.b
    public C c() {
        return this.f4586e;
    }

    @Override // J0.B.e.d.a.b
    public B.e.d.a.b.c d() {
        return this.f4583b;
    }

    @Override // J0.B.e.d.a.b
    public B.e.d.a.b.AbstractC0080d e() {
        return this.f4585d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a.b)) {
            return false;
        }
        B.e.d.a.b bVar = (B.e.d.a.b) obj;
        C c8 = this.f4582a;
        if (c8 != null ? c8.equals(bVar.f()) : bVar.f() == null) {
            B.e.d.a.b.c cVar = this.f4583b;
            if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                B.a aVar = this.f4584c;
                if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f4585d.equals(bVar.e()) && this.f4586e.equals(bVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // J0.B.e.d.a.b
    public C f() {
        return this.f4582a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        C c8 = this.f4582a;
        int i8 = 0;
        if (c8 == null) {
            hashCode = 0;
        } else {
            hashCode = c8.hashCode();
        }
        int i9 = (hashCode ^ 1000003) * 1000003;
        B.e.d.a.b.c cVar = this.f4583b;
        if (cVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = cVar.hashCode();
        }
        int i10 = (i9 ^ hashCode2) * 1000003;
        B.a aVar = this.f4584c;
        if (aVar != null) {
            i8 = aVar.hashCode();
        }
        return ((((i10 ^ i8) * 1000003) ^ this.f4585d.hashCode()) * 1000003) ^ this.f4586e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f4582a + ", exception=" + this.f4583b + ", appExitInfo=" + this.f4584c + ", signal=" + this.f4585d + ", binaries=" + this.f4586e + "}";
    }

    private n(C c8, B.e.d.a.b.c cVar, B.a aVar, B.e.d.a.b.AbstractC0080d abstractC0080d, C c9) {
        this.f4582a = c8;
        this.f4583b = cVar;
        this.f4584c = aVar;
        this.f4585d = abstractC0080d;
        this.f4586e = c9;
    }
}
