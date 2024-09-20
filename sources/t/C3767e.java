package t;

import t.k;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3767e extends k {

    /* renamed from: a, reason: collision with root package name */
    private final k.b f38088a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3763a f38089b;

    /* renamed from: t.e$b */
    /* loaded from: classes3.dex */
    static final class b extends k.a {

        /* renamed from: a, reason: collision with root package name */
        private k.b f38090a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC3763a f38091b;

        @Override // t.k.a
        public k a() {
            return new C3767e(this.f38090a, this.f38091b);
        }

        @Override // t.k.a
        public k.a b(AbstractC3763a abstractC3763a) {
            this.f38091b = abstractC3763a;
            return this;
        }

        @Override // t.k.a
        public k.a c(k.b bVar) {
            this.f38090a = bVar;
            return this;
        }
    }

    @Override // t.k
    public AbstractC3763a b() {
        return this.f38089b;
    }

    @Override // t.k
    public k.b c() {
        return this.f38088a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.b bVar = this.f38088a;
        if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
            AbstractC3763a abstractC3763a = this.f38089b;
            if (abstractC3763a == null) {
                if (kVar.b() == null) {
                    return true;
                }
            } else if (abstractC3763a.equals(kVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        k.b bVar = this.f38088a;
        int i8 = 0;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        int i9 = (hashCode ^ 1000003) * 1000003;
        AbstractC3763a abstractC3763a = this.f38089b;
        if (abstractC3763a != null) {
            i8 = abstractC3763a.hashCode();
        }
        return i9 ^ i8;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f38088a + ", androidClientInfo=" + this.f38089b + "}";
    }

    private C3767e(k.b bVar, AbstractC3763a abstractC3763a) {
        this.f38088a = bVar;
        this.f38089b = abstractC3763a;
    }
}
