package Y1;

/* loaded from: classes4.dex */
public class s {

    /* renamed from: n, reason: collision with root package name */
    static final s f12908n = new s();

    /* renamed from: a, reason: collision with root package name */
    short f12909a;

    /* renamed from: b, reason: collision with root package name */
    private short f12910b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f12911c;

    /* renamed from: d, reason: collision with root package name */
    int f12912d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f12913e;

    /* renamed from: f, reason: collision with root package name */
    short f12914f;

    /* renamed from: g, reason: collision with root package name */
    short f12915g;

    /* renamed from: h, reason: collision with root package name */
    short f12916h;

    /* renamed from: i, reason: collision with root package name */
    short f12917i;

    /* renamed from: j, reason: collision with root package name */
    p f12918j;

    /* renamed from: k, reason: collision with root package name */
    s f12919k;

    /* renamed from: l, reason: collision with root package name */
    m f12920l;

    /* renamed from: m, reason: collision with root package name */
    s f12921m;

    private void b(int i8, int i9, int i10) {
        if (this.f12913e == null) {
            this.f12913e = new int[6];
        }
        int[] iArr = this.f12913e;
        int i11 = iArr[0];
        if (i11 + 2 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f12913e = iArr2;
        }
        int[] iArr3 = this.f12913e;
        iArr3[i11 + 1] = i8;
        int i12 = i11 + 2;
        iArr3[i12] = i9 | i10;
        iArr3[0] = i12;
    }

    private s g(s sVar) {
        for (m mVar = this.f12920l; mVar != null; mVar = mVar.f12874c) {
            if ((this.f12909a & 16) == 0 || mVar != this.f12920l.f12874c) {
                s sVar2 = mVar.f12873b;
                if (sVar2.f12921m == null) {
                    sVar2.f12921m = sVar;
                    sVar = sVar2;
                }
            }
        }
        return sVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(u uVar, boolean z8) {
        short s8;
        uVar.o(this);
        if (z8 && (s8 = this.f12910b) != 0) {
            uVar.q(s8 & 65535, this);
            if (this.f12911c != null) {
                int i8 = 1;
                while (true) {
                    int[] iArr = this.f12911c;
                    if (i8 <= iArr[0]) {
                        uVar.q(iArr[i8], this);
                        i8++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i8) {
        if (this.f12910b == 0) {
            this.f12910b = (short) i8;
            return;
        }
        if (this.f12911c == null) {
            this.f12911c = new int[4];
        }
        int[] iArr = this.f12911c;
        int i9 = iArr[0] + 1;
        iArr[0] = i9;
        if (i9 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 4];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f12911c = iArr2;
        }
        this.f12911c[i9] = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(s sVar) {
        s sVar2 = f12908n;
        this.f12921m = sVar2;
        s sVar3 = sVar2;
        s sVar4 = this;
        while (sVar4 != f12908n) {
            s sVar5 = sVar4.f12921m;
            sVar4.f12921m = sVar3;
            if ((sVar4.f12909a & 64) != 0 && sVar4.f12917i != sVar.f12917i) {
                sVar4.f12920l = new m(sVar4.f12915g, sVar.f12920l.f12873b, sVar4.f12920l);
            }
            sVar3 = sVar4;
            sVar4 = sVar4.g(sVar5);
        }
        while (sVar3 != f12908n) {
            s sVar6 = sVar3.f12921m;
            sVar3.f12921m = null;
            sVar3 = sVar6;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final s e() {
        p pVar = this.f12918j;
        if (pVar == null) {
            return this;
        }
        return pVar.f12888a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(short s8) {
        this.f12921m = f12908n;
        s sVar = this;
        while (sVar != f12908n) {
            s sVar2 = sVar.f12921m;
            sVar.f12921m = null;
            if (sVar.f12917i == 0) {
                sVar.f12917i = s8;
                sVar = sVar.g(sVar2);
            } else {
                sVar = sVar2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(C1515d c1515d, int i8, boolean z8) {
        if ((this.f12909a & 4) == 0) {
            if (z8) {
                b(i8, 536870912, c1515d.f12804b);
                c1515d.i(-1);
                return;
            } else {
                b(i8, 268435456, c1515d.f12804b);
                c1515d.k(-1);
                return;
            }
        }
        if (z8) {
            c1515d.i(this.f12912d - i8);
        } else {
            c1515d.k(this.f12912d - i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i(byte[] bArr, int i8) {
        this.f12909a = (short) (this.f12909a | 4);
        this.f12912d = i8;
        int[] iArr = this.f12913e;
        boolean z8 = false;
        if (iArr == null) {
            return false;
        }
        for (int i9 = iArr[0]; i9 > 0; i9 -= 2) {
            int[] iArr2 = this.f12913e;
            int i10 = iArr2[i9 - 1];
            int i11 = iArr2[i9];
            int i12 = i8 - i10;
            int i13 = 268435455 & i11;
            if ((i11 & (-268435456)) == 268435456) {
                if (i12 < -32768 || i12 > 32767) {
                    int i14 = bArr[i10] & 255;
                    if (i14 < 198) {
                        bArr[i10] = (byte) (i14 + 49);
                    } else {
                        bArr[i10] = (byte) (i14 + 20);
                    }
                    z8 = true;
                }
                bArr[i13] = (byte) (i12 >>> 8);
                bArr[i13 + 1] = (byte) i12;
            } else {
                bArr[i13] = (byte) (i12 >>> 24);
                bArr[i13 + 1] = (byte) (i12 >>> 16);
                bArr[i13 + 2] = (byte) (i12 >>> 8);
                bArr[i13 + 3] = (byte) i12;
            }
        }
        return z8;
    }

    public String toString() {
        return "L" + System.identityHashCode(this);
    }
}
