package J0;

import J0.D;

/* loaded from: classes3.dex */
final class x extends D {

    /* renamed from: a, reason: collision with root package name */
    private final D.a f4656a;

    /* renamed from: b, reason: collision with root package name */
    private final D.c f4657b;

    /* renamed from: c, reason: collision with root package name */
    private final D.b f4658c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(D.a aVar, D.c cVar, D.b bVar) {
        if (aVar != null) {
            this.f4656a = aVar;
            if (cVar != null) {
                this.f4657b = cVar;
                if (bVar != null) {
                    this.f4658c = bVar;
                    return;
                }
                throw new NullPointerException("Null deviceData");
            }
            throw new NullPointerException("Null osData");
        }
        throw new NullPointerException("Null appData");
    }

    @Override // J0.D
    public D.a a() {
        return this.f4656a;
    }

    @Override // J0.D
    public D.b c() {
        return this.f4658c;
    }

    @Override // J0.D
    public D.c d() {
        return this.f4657b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d8 = (D) obj;
        if (this.f4656a.equals(d8.a()) && this.f4657b.equals(d8.d()) && this.f4658c.equals(d8.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f4656a.hashCode() ^ 1000003) * 1000003) ^ this.f4657b.hashCode()) * 1000003) ^ this.f4658c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f4656a + ", osData=" + this.f4657b + ", deviceData=" + this.f4658c + "}";
    }
}
