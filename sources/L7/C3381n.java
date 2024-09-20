package l7;

/* renamed from: l7.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class C3381n {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f34847a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f34848b;

    /* renamed from: c, reason: collision with root package name */
    private final Y6.e f34849c;

    /* renamed from: d, reason: collision with root package name */
    private int f34850d;

    /* renamed from: e, reason: collision with root package name */
    private int f34851e;

    public C3381n(byte[] bArr, byte[] bArr2, Y6.e eVar) {
        this.f34847a = bArr;
        this.f34848b = bArr2;
        this.f34849c = eVar;
    }

    public void a(byte[] bArr, boolean z8, int i8) {
        b(bArr, i8);
        if (z8) {
            this.f34851e++;
        }
    }

    public byte[] b(byte[] bArr, int i8) {
        if (bArr.length >= this.f34849c.f()) {
            Y6.e eVar = this.f34849c;
            byte[] bArr2 = this.f34847a;
            eVar.b(bArr2, 0, bArr2.length);
            this.f34849c.c((byte) (this.f34850d >>> 24));
            this.f34849c.c((byte) (this.f34850d >>> 16));
            this.f34849c.c((byte) (this.f34850d >>> 8));
            this.f34849c.c((byte) this.f34850d);
            this.f34849c.c((byte) (this.f34851e >>> 8));
            this.f34849c.c((byte) this.f34851e);
            this.f34849c.c((byte) -1);
            Y6.e eVar2 = this.f34849c;
            byte[] bArr3 = this.f34848b;
            eVar2.b(bArr3, 0, bArr3.length);
            this.f34849c.a(bArr, i8);
            return bArr;
        }
        throw new IllegalArgumentException("target length is less than digest size.");
    }

    public void c(int i8) {
        this.f34851e = i8;
    }

    public void d(int i8) {
        this.f34850d = i8;
    }
}
