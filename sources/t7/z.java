package t7;

/* loaded from: classes5.dex */
public final class z extends p implements E7.c {

    /* renamed from: c, reason: collision with root package name */
    private final x f38370c;

    /* renamed from: d, reason: collision with root package name */
    private final int f38371d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f38372e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f38373f;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final x f38374a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f38375b = null;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f38376c = null;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f38377d = null;

        public b(x xVar) {
            this.f38374a = xVar;
        }

        public z e() {
            return new z(this);
        }

        public b f(byte[] bArr) {
            this.f38377d = A.c(bArr);
            return this;
        }

        public b g(byte[] bArr) {
            this.f38376c = A.c(bArr);
            return this;
        }

        public b h(byte[] bArr) {
            this.f38375b = A.c(bArr);
            return this;
        }
    }

    private z(b bVar) {
        super(false, bVar.f38374a.f());
        x xVar = bVar.f38374a;
        this.f38370c = xVar;
        if (xVar == null) {
            throw new NullPointerException("params == null");
        }
        int h8 = xVar.h();
        byte[] bArr = bVar.f38377d;
        if (bArr != null) {
            if (bArr.length == h8 + h8) {
                this.f38371d = 0;
                this.f38372e = A.g(bArr, 0, h8);
                this.f38373f = A.g(bArr, h8, h8);
                return;
            } else {
                if (bArr.length != h8 + 4 + h8) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.f38371d = E7.f.a(bArr, 0);
                this.f38372e = A.g(bArr, 4, h8);
                this.f38373f = A.g(bArr, 4 + h8, h8);
                return;
            }
        }
        if (xVar.e() != null) {
            this.f38371d = xVar.e().a();
        } else {
            this.f38371d = 0;
        }
        byte[] bArr2 = bVar.f38375b;
        if (bArr2 == null) {
            this.f38372e = new byte[h8];
        } else {
            if (bArr2.length != h8) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.f38372e = bArr2;
        }
        byte[] bArr3 = bVar.f38376c;
        if (bArr3 == null) {
            this.f38373f = new byte[h8];
        } else {
            if (bArr3.length != h8) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.f38373f = bArr3;
        }
    }

    public x b() {
        return this.f38370c;
    }

    public byte[] c() {
        return A.c(this.f38373f);
    }

    public byte[] d() {
        return A.c(this.f38372e);
    }

    public byte[] e() {
        byte[] bArr;
        int h8 = this.f38370c.h();
        int i8 = this.f38371d;
        int i9 = 0;
        if (i8 != 0) {
            bArr = new byte[h8 + 4 + h8];
            E7.f.d(i8, bArr, 0);
            i9 = 4;
        } else {
            bArr = new byte[h8 + h8];
        }
        A.e(bArr, this.f38372e, i9);
        A.e(bArr, this.f38373f, i9 + h8);
        return bArr;
    }

    @Override // E7.c
    public byte[] getEncoded() {
        return e();
    }
}
