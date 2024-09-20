package b7;

import Y6.b;
import Y6.f;
import Y6.g;
import c7.C1935a;
import c7.InterfaceC1936b;
import c7.c;
import c7.d;
import c7.e;
import d7.C2564a;
import d7.C2566c;

/* renamed from: b7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1886a {

    /* renamed from: a, reason: collision with root package name */
    private Y6.a f14780a;

    /* renamed from: b, reason: collision with root package name */
    private c f14781b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC1936b f14782c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14783d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14784e;

    /* renamed from: f, reason: collision with root package name */
    private int f14785f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f14786g;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f14787h;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f14788i;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f14789j;

    /* renamed from: k, reason: collision with root package name */
    private byte[] f14790k;

    /* renamed from: l, reason: collision with root package name */
    private byte[] f14791l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f14792m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f14793n;

    /* renamed from: o, reason: collision with root package name */
    private byte[] f14794o;

    /* renamed from: p, reason: collision with root package name */
    private byte[] f14795p;

    /* renamed from: q, reason: collision with root package name */
    private byte[] f14796q;

    /* renamed from: r, reason: collision with root package name */
    private int f14797r;

    /* renamed from: s, reason: collision with root package name */
    private int f14798s;

    /* renamed from: t, reason: collision with root package name */
    private long f14799t;

    /* renamed from: u, reason: collision with root package name */
    private byte[] f14800u;

    /* renamed from: v, reason: collision with root package name */
    private int f14801v;

    /* renamed from: w, reason: collision with root package name */
    private long f14802w;

    /* renamed from: x, reason: collision with root package name */
    private long f14803x;

    public C1886a(Y6.a aVar) {
        this(aVar, null);
    }

    private void a() {
        if (!this.f14784e) {
            if (this.f14783d) {
                throw new IllegalStateException("GCM cipher cannot be reused for encryption");
            }
            throw new IllegalStateException("GCM cipher needs to be initialised");
        }
    }

    private void c(byte[] bArr, byte[] bArr2, int i8) {
        for (int i9 = 0; i9 < i8; i9 += 16) {
            f(bArr, bArr2, i9, Math.min(i8 - i9, 16));
        }
    }

    private void d(byte[] bArr, byte[] bArr2) {
        d.p(bArr, bArr2);
        this.f14781b.b(bArr);
    }

    private void e(byte[] bArr, byte[] bArr2, int i8) {
        d.q(bArr, bArr2, i8);
        this.f14781b.b(bArr);
    }

    private void f(byte[] bArr, byte[] bArr2, int i8, int i9) {
        d.r(bArr, bArr2, i8, i9);
        this.f14781b.b(bArr);
    }

    private void g(byte[] bArr) {
        int i8 = this.f14797r;
        if (i8 != 0) {
            this.f14797r = i8 - 1;
            byte[] bArr2 = this.f14796q;
            int i9 = (bArr2[15] & 255) + 1;
            bArr2[15] = (byte) i9;
            int i10 = (i9 >>> 8) + (bArr2[14] & 255);
            bArr2[14] = (byte) i10;
            int i11 = (i10 >>> 8) + (bArr2[13] & 255);
            bArr2[13] = (byte) i11;
            bArr2[12] = (byte) ((i11 >>> 8) + (bArr2[12] & 255));
            this.f14780a.b(bArr2, 0, bArr, 0);
            return;
        }
        throw new IllegalStateException("Attempt to process too many blocks");
    }

    private void j() {
        if (this.f14802w > 0) {
            System.arraycopy(this.f14794o, 0, this.f14795p, 0, 16);
            this.f14803x = this.f14802w;
        }
        int i8 = this.f14801v;
        if (i8 > 0) {
            f(this.f14795p, this.f14800u, 0, i8);
            this.f14803x += this.f14801v;
        }
        if (this.f14803x > 0) {
            System.arraycopy(this.f14795p, 0, this.f14793n, 0, 16);
        }
    }

    private void l(byte[] bArr, int i8, byte[] bArr2, int i9) {
        if (bArr2.length - i9 >= 16) {
            if (this.f14799t == 0) {
                j();
            }
            byte[] bArr3 = new byte[16];
            g(bArr3);
            if (this.f14783d) {
                d.q(bArr3, bArr, i8);
                d(this.f14793n, bArr3);
                System.arraycopy(bArr3, 0, bArr2, i9, 16);
            } else {
                e(this.f14793n, bArr, i8);
                d.o(bArr3, 0, bArr, i8, bArr2, i9);
            }
            this.f14799t += 16;
            return;
        }
        throw new g("Output buffer too short");
    }

    private void n(byte[] bArr, int i8, int i9, byte[] bArr2, int i10) {
        byte[] bArr3 = new byte[16];
        g(bArr3);
        if (this.f14783d) {
            d.n(bArr, i8, bArr3, 0, i9);
            f(this.f14793n, bArr, i8, i9);
        } else {
            f(this.f14793n, bArr, i8, i9);
            d.n(bArr, i8, bArr3, 0, i9);
        }
        System.arraycopy(bArr, i8, bArr2, i10, i9);
        this.f14799t += i9;
    }

    private void o(boolean z8) {
        this.f14780a.reset();
        this.f14793n = new byte[16];
        this.f14794o = new byte[16];
        this.f14795p = new byte[16];
        this.f14800u = new byte[16];
        this.f14801v = 0;
        this.f14802w = 0L;
        this.f14803x = 0L;
        this.f14796q = E7.a.d(this.f14790k);
        this.f14797r = -2;
        this.f14798s = 0;
        this.f14799t = 0L;
        byte[] bArr = this.f14791l;
        if (bArr != null) {
            E7.a.i(bArr, (byte) 0);
        }
        if (z8) {
            this.f14792m = null;
        }
        if (this.f14783d) {
            this.f14784e = false;
            return;
        }
        byte[] bArr2 = this.f14788i;
        if (bArr2 != null) {
            k(bArr2, 0, bArr2.length);
        }
    }

    public int b(byte[] bArr, int i8) {
        a();
        if (this.f14799t == 0) {
            j();
        }
        int i9 = this.f14798s;
        if (this.f14783d) {
            if (bArr.length - i8 < this.f14785f + i9) {
                throw new g("Output buffer too short");
            }
        } else {
            int i10 = this.f14785f;
            if (i9 >= i10) {
                i9 -= i10;
                if (bArr.length - i8 < i9) {
                    throw new g("Output buffer too short");
                }
            } else {
                throw new f("data too short");
            }
        }
        if (i9 > 0) {
            n(this.f14791l, 0, i9, bArr, i8);
        }
        long j8 = this.f14802w;
        int i11 = this.f14801v;
        long j9 = j8 + i11;
        this.f14802w = j9;
        if (j9 > this.f14803x) {
            if (i11 > 0) {
                f(this.f14794o, this.f14800u, 0, i11);
            }
            if (this.f14803x > 0) {
                d.p(this.f14794o, this.f14795p);
            }
            long j10 = ((this.f14799t * 8) + 127) >>> 7;
            byte[] bArr2 = new byte[16];
            if (this.f14782c == null) {
                C1935a c1935a = new C1935a();
                this.f14782c = c1935a;
                c1935a.a(this.f14789j);
            }
            this.f14782c.b(j10, bArr2);
            d.i(this.f14794o, bArr2);
            d.p(this.f14793n, this.f14794o);
        }
        byte[] bArr3 = new byte[16];
        E7.f.i(this.f14802w * 8, bArr3, 0);
        E7.f.i(this.f14799t * 8, bArr3, 8);
        d(this.f14793n, bArr3);
        byte[] bArr4 = new byte[16];
        this.f14780a.b(this.f14790k, 0, bArr4, 0);
        d.p(bArr4, this.f14793n);
        int i12 = this.f14785f;
        byte[] bArr5 = new byte[i12];
        this.f14792m = bArr5;
        System.arraycopy(bArr4, 0, bArr5, 0, i12);
        if (this.f14783d) {
            System.arraycopy(this.f14792m, 0, bArr, i8 + this.f14798s, this.f14785f);
            i9 += this.f14785f;
        } else {
            int i13 = this.f14785f;
            byte[] bArr6 = new byte[i13];
            System.arraycopy(this.f14791l, i9, bArr6, 0, i13);
            if (!E7.a.g(this.f14792m, bArr6)) {
                throw new f("mac check in GCM failed");
            }
        }
        o(false);
        return i9;
    }

    public int h(int i8) {
        int i9 = i8 + this.f14798s;
        if (this.f14783d) {
            return i9 + this.f14785f;
        }
        int i10 = this.f14785f;
        if (i9 < i10) {
            return 0;
        }
        return i9 - i10;
    }

    public void i(boolean z8, b bVar) {
        int i8;
        byte[] bArr;
        this.f14783d = z8;
        this.f14792m = null;
        this.f14784e = true;
        if (bVar instanceof C2564a) {
            C2564a c2564a = (C2564a) bVar;
            byte[] d8 = c2564a.d();
            this.f14788i = c2564a.a();
            int c8 = c2564a.c();
            if (c8 >= 32 && c8 <= 128 && c8 % 8 == 0) {
                this.f14785f = c8 / 8;
                C2566c b8 = c2564a.b();
                if (z8) {
                    i8 = 16;
                } else {
                    i8 = this.f14785f + 16;
                }
                this.f14791l = new byte[i8];
                if (d8 != null && d8.length >= 1) {
                    if (z8 && (bArr = this.f14787h) != null && E7.a.a(bArr, d8)) {
                        if (b8 != null) {
                            byte[] bArr2 = this.f14786g;
                            if (bArr2 != null && E7.a.a(bArr2, b8.a())) {
                                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
                            }
                        } else {
                            throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
                        }
                    }
                    this.f14787h = d8;
                    if (b8 != null) {
                        this.f14786g = b8.a();
                    }
                    if (b8 != null) {
                        this.f14780a.a(true, b8);
                        byte[] bArr3 = new byte[16];
                        this.f14789j = bArr3;
                        this.f14780a.b(bArr3, 0, bArr3, 0);
                        this.f14781b.a(this.f14789j);
                        this.f14782c = null;
                    } else if (this.f14789j == null) {
                        throw new IllegalArgumentException("Key must be specified in initial init");
                    }
                    byte[] bArr4 = new byte[16];
                    this.f14790k = bArr4;
                    byte[] bArr5 = this.f14787h;
                    if (bArr5.length == 12) {
                        System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
                        this.f14790k[15] = 1;
                    } else {
                        c(bArr4, bArr5, bArr5.length);
                        byte[] bArr6 = new byte[16];
                        E7.f.i(this.f14787h.length * 8, bArr6, 8);
                        d(this.f14790k, bArr6);
                    }
                    this.f14793n = new byte[16];
                    this.f14794o = new byte[16];
                    this.f14795p = new byte[16];
                    this.f14800u = new byte[16];
                    this.f14801v = 0;
                    this.f14802w = 0L;
                    this.f14803x = 0L;
                    this.f14796q = E7.a.d(this.f14790k);
                    this.f14797r = -2;
                    this.f14798s = 0;
                    this.f14799t = 0L;
                    byte[] bArr7 = this.f14788i;
                    if (bArr7 != null) {
                        k(bArr7, 0, bArr7.length);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("IV must be at least 1 byte");
            }
            throw new IllegalArgumentException("Invalid value for MAC size: " + c8);
        }
        throw new IllegalArgumentException("invalid parameters passed to GCM");
    }

    public void k(byte[] bArr, int i8, int i9) {
        a();
        for (int i10 = 0; i10 < i9; i10++) {
            byte[] bArr2 = this.f14800u;
            int i11 = this.f14801v;
            bArr2[i11] = bArr[i8 + i10];
            int i12 = i11 + 1;
            this.f14801v = i12;
            if (i12 == 16) {
                d(this.f14794o, bArr2);
                this.f14801v = 0;
                this.f14802w += 16;
            }
        }
    }

    public int m(byte[] bArr, int i8, int i9, byte[] bArr2, int i10) {
        int i11;
        a();
        if (bArr.length - i8 >= i9) {
            if (this.f14783d) {
                if (this.f14798s != 0) {
                    while (i9 > 0) {
                        i9--;
                        byte[] bArr3 = this.f14791l;
                        int i12 = this.f14798s;
                        int i13 = i8 + 1;
                        bArr3[i12] = bArr[i8];
                        int i14 = i12 + 1;
                        this.f14798s = i14;
                        if (i14 == 16) {
                            l(bArr3, 0, bArr2, i10);
                            this.f14798s = 0;
                            i8 = i13;
                            i11 = 16;
                            break;
                        }
                        i8 = i13;
                    }
                }
                i11 = 0;
                while (i9 >= 16) {
                    l(bArr, i8, bArr2, i10 + i11);
                    i8 += 16;
                    i9 -= 16;
                    i11 += 16;
                }
                if (i9 > 0) {
                    System.arraycopy(bArr, i8, this.f14791l, 0, i9);
                    this.f14798s = i9;
                }
            } else {
                i11 = 0;
                for (int i15 = 0; i15 < i9; i15++) {
                    byte[] bArr4 = this.f14791l;
                    int i16 = this.f14798s;
                    bArr4[i16] = bArr[i8 + i15];
                    int i17 = i16 + 1;
                    this.f14798s = i17;
                    if (i17 == bArr4.length) {
                        l(bArr4, 0, bArr2, i10 + i11);
                        byte[] bArr5 = this.f14791l;
                        System.arraycopy(bArr5, 16, bArr5, 0, this.f14785f);
                        this.f14798s = this.f14785f;
                        i11 += 16;
                    }
                }
            }
            return i11;
        }
        throw new Y6.d("Input buffer too short");
    }

    public C1886a(Y6.a aVar, c cVar) {
        if (aVar.c() != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        cVar = cVar == null ? new e() : cVar;
        this.f14780a = aVar;
        this.f14781b = cVar;
    }
}
