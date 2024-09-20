package J0;

import J0.D;

/* loaded from: classes3.dex */
final class z extends D.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f4665a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4666b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4667c;

    /* renamed from: d, reason: collision with root package name */
    private final long f4668d;

    /* renamed from: e, reason: collision with root package name */
    private final long f4669e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f4670f;

    /* renamed from: g, reason: collision with root package name */
    private final int f4671g;

    /* renamed from: h, reason: collision with root package name */
    private final String f4672h;

    /* renamed from: i, reason: collision with root package name */
    private final String f4673i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(int i8, String str, int i9, long j8, long j9, boolean z8, int i10, String str2, String str3) {
        this.f4665a = i8;
        if (str != null) {
            this.f4666b = str;
            this.f4667c = i9;
            this.f4668d = j8;
            this.f4669e = j9;
            this.f4670f = z8;
            this.f4671g = i10;
            if (str2 != null) {
                this.f4672h = str2;
                if (str3 != null) {
                    this.f4673i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    @Override // J0.D.b
    public int a() {
        return this.f4665a;
    }

    @Override // J0.D.b
    public int b() {
        return this.f4667c;
    }

    @Override // J0.D.b
    public long d() {
        return this.f4669e;
    }

    @Override // J0.D.b
    public boolean e() {
        return this.f4670f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D.b)) {
            return false;
        }
        D.b bVar = (D.b) obj;
        if (this.f4665a == bVar.a() && this.f4666b.equals(bVar.g()) && this.f4667c == bVar.b() && this.f4668d == bVar.j() && this.f4669e == bVar.d() && this.f4670f == bVar.e() && this.f4671g == bVar.i() && this.f4672h.equals(bVar.f()) && this.f4673i.equals(bVar.h())) {
            return true;
        }
        return false;
    }

    @Override // J0.D.b
    public String f() {
        return this.f4672h;
    }

    @Override // J0.D.b
    public String g() {
        return this.f4666b;
    }

    @Override // J0.D.b
    public String h() {
        return this.f4673i;
    }

    public int hashCode() {
        int i8;
        int hashCode = (((((this.f4665a ^ 1000003) * 1000003) ^ this.f4666b.hashCode()) * 1000003) ^ this.f4667c) * 1000003;
        long j8 = this.f4668d;
        int i9 = (hashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f4669e;
        int i10 = (i9 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        if (this.f4670f) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        return ((((((i10 ^ i8) * 1000003) ^ this.f4671g) * 1000003) ^ this.f4672h.hashCode()) * 1000003) ^ this.f4673i.hashCode();
    }

    @Override // J0.D.b
    public int i() {
        return this.f4671g;
    }

    @Override // J0.D.b
    public long j() {
        return this.f4668d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f4665a + ", model=" + this.f4666b + ", availableProcessors=" + this.f4667c + ", totalRam=" + this.f4668d + ", diskSpace=" + this.f4669e + ", isEmulator=" + this.f4670f + ", state=" + this.f4671g + ", manufacturer=" + this.f4672h + ", modelClass=" + this.f4673i + "}";
    }
}
