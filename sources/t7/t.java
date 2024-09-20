package t7;

/* loaded from: classes5.dex */
public final class t extends q implements E7.c {

    /* renamed from: c, reason: collision with root package name */
    private final r f38336c;

    /* renamed from: d, reason: collision with root package name */
    private final int f38337d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f38338e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f38339f;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final r f38340a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f38341b = null;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f38342c = null;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f38343d = null;

        public b(r rVar) {
            this.f38340a = rVar;
        }

        public t e() {
            return new t(this);
        }

        public b f(byte[] bArr) {
            this.f38343d = A.c(bArr);
            return this;
        }

        public b g(byte[] bArr) {
            this.f38342c = A.c(bArr);
            return this;
        }

        public b h(byte[] bArr) {
            this.f38341b = A.c(bArr);
            return this;
        }
    }

    private t(b bVar) {
        super(false, bVar.f38340a.e());
        r rVar = bVar.f38340a;
        this.f38336c = rVar;
        if (rVar == null) {
            throw new NullPointerException("params == null");
        }
        int f8 = rVar.f();
        byte[] bArr = bVar.f38343d;
        if (bArr != null) {
            if (bArr.length == f8 + f8) {
                this.f38337d = 0;
                this.f38338e = A.g(bArr, 0, f8);
                this.f38339f = A.g(bArr, f8, f8);
                return;
            } else {
                if (bArr.length != f8 + 4 + f8) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.f38337d = E7.f.a(bArr, 0);
                this.f38338e = A.g(bArr, 4, f8);
                this.f38339f = A.g(bArr, 4 + f8, f8);
                return;
            }
        }
        if (rVar.d() != null) {
            this.f38337d = rVar.d().a();
        } else {
            this.f38337d = 0;
        }
        byte[] bArr2 = bVar.f38341b;
        if (bArr2 == null) {
            this.f38338e = new byte[f8];
        } else {
            if (bArr2.length != f8) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.f38338e = bArr2;
        }
        byte[] bArr3 = bVar.f38342c;
        if (bArr3 == null) {
            this.f38339f = new byte[f8];
        } else {
            if (bArr3.length != f8) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.f38339f = bArr3;
        }
    }

    public r b() {
        return this.f38336c;
    }

    public byte[] c() {
        return A.c(this.f38339f);
    }

    public byte[] d() {
        return A.c(this.f38338e);
    }

    public byte[] e() {
        byte[] bArr;
        int f8 = this.f38336c.f();
        int i8 = this.f38337d;
        int i9 = 0;
        if (i8 != 0) {
            bArr = new byte[f8 + 4 + f8];
            E7.f.d(i8, bArr, 0);
            i9 = 4;
        } else {
            bArr = new byte[f8 + f8];
        }
        A.e(bArr, this.f38338e, i9);
        A.e(bArr, this.f38339f, i9 + f8);
        return bArr;
    }

    @Override // E7.c
    public byte[] getEncoded() {
        return e();
    }
}
