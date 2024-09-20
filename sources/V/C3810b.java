package v;

import v.g;

/* renamed from: v.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3810b extends g {

    /* renamed from: a, reason: collision with root package name */
    private final g.a f38564a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38565b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3810b(g.a aVar, long j8) {
        if (aVar != null) {
            this.f38564a = aVar;
            this.f38565b = j8;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // v.g
    public long b() {
        return this.f38565b;
    }

    @Override // v.g
    public g.a c() {
        return this.f38564a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f38564a.equals(gVar.c()) && this.f38565b == gVar.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f38564a.hashCode() ^ 1000003) * 1000003;
        long j8 = this.f38565b;
        return hashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f38564a + ", nextRequestWaitMillis=" + this.f38565b + "}";
    }
}
