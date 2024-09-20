package y0;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3967a extends n {

    /* renamed from: a, reason: collision with root package name */
    private final long f39629a;

    /* renamed from: b, reason: collision with root package name */
    private final long f39630b;

    /* renamed from: c, reason: collision with root package name */
    private final long f39631c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3967a(long j8, long j9, long j10) {
        this.f39629a = j8;
        this.f39630b = j9;
        this.f39631c = j10;
    }

    @Override // y0.n
    public long b() {
        return this.f39630b;
    }

    @Override // y0.n
    public long c() {
        return this.f39629a;
    }

    @Override // y0.n
    public long d() {
        return this.f39631c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f39629a == nVar.c() && this.f39630b == nVar.b() && this.f39631c == nVar.d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j8 = this.f39629a;
        long j9 = this.f39630b;
        int i8 = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f39631c;
        return ((int) ((j10 >>> 32) ^ j10)) ^ i8;
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f39629a + ", elapsedRealtime=" + this.f39630b + ", uptimeMillis=" + this.f39631c + "}";
    }
}
