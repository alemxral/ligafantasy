package t;

import t.o;

/* loaded from: classes3.dex */
final class i extends o {

    /* renamed from: a, reason: collision with root package name */
    private final o.c f38121a;

    /* renamed from: b, reason: collision with root package name */
    private final o.b f38122b;

    /* loaded from: classes3.dex */
    static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private o.c f38123a;

        /* renamed from: b, reason: collision with root package name */
        private o.b f38124b;

        @Override // t.o.a
        public o a() {
            return new i(this.f38123a, this.f38124b);
        }

        @Override // t.o.a
        public o.a b(o.b bVar) {
            this.f38124b = bVar;
            return this;
        }

        @Override // t.o.a
        public o.a c(o.c cVar) {
            this.f38123a = cVar;
            return this;
        }
    }

    @Override // t.o
    public o.b b() {
        return this.f38122b;
    }

    @Override // t.o
    public o.c c() {
        return this.f38121a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.c cVar = this.f38121a;
        if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
            o.b bVar = this.f38122b;
            if (bVar == null) {
                if (oVar.b() == null) {
                    return true;
                }
            } else if (bVar.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        o.c cVar = this.f38121a;
        int i8 = 0;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        int i9 = (hashCode ^ 1000003) * 1000003;
        o.b bVar = this.f38122b;
        if (bVar != null) {
            i8 = bVar.hashCode();
        }
        return i9 ^ i8;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f38121a + ", mobileSubtype=" + this.f38122b + "}";
    }

    private i(o.c cVar, o.b bVar) {
        this.f38121a = cVar;
        this.f38122b = bVar;
    }
}
