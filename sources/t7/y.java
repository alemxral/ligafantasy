package t7;

import java.io.IOException;
import t7.j;

/* loaded from: classes5.dex */
public final class y extends p implements E7.c {

    /* renamed from: c, reason: collision with root package name */
    private final x f38355c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f38356d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f38357e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f38358f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f38359g;

    /* renamed from: h, reason: collision with root package name */
    private volatile C3797a f38360h;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final x f38361a;

        /* renamed from: b, reason: collision with root package name */
        private int f38362b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f38363c = -1;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f38364d = null;

        /* renamed from: e, reason: collision with root package name */
        private byte[] f38365e = null;

        /* renamed from: f, reason: collision with root package name */
        private byte[] f38366f = null;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f38367g = null;

        /* renamed from: h, reason: collision with root package name */
        private C3797a f38368h = null;

        /* renamed from: i, reason: collision with root package name */
        private byte[] f38369i = null;

        public b(x xVar) {
            this.f38361a = xVar;
        }

        public y j() {
            return new y(this);
        }

        public b k(C3797a c3797a) {
            this.f38368h = c3797a;
            return this;
        }

        public b l(int i8) {
            this.f38362b = i8;
            return this;
        }

        public b m(int i8) {
            this.f38363c = i8;
            return this;
        }

        public b n(byte[] bArr) {
            this.f38366f = A.c(bArr);
            return this;
        }

        public b o(byte[] bArr) {
            this.f38367g = A.c(bArr);
            return this;
        }

        public b p(byte[] bArr) {
            this.f38365e = A.c(bArr);
            return this;
        }

        public b q(byte[] bArr) {
            this.f38364d = A.c(bArr);
            return this;
        }
    }

    private y(b bVar) {
        super(true, bVar.f38361a.f());
        x xVar = bVar.f38361a;
        this.f38355c = xVar;
        if (xVar == null) {
            throw new NullPointerException("params == null");
        }
        int h8 = xVar.h();
        byte[] bArr = bVar.f38369i;
        if (bArr != null) {
            int b8 = xVar.b();
            int a8 = E7.f.a(bArr, 0);
            if (!A.l(b8, a8)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.f38356d = A.g(bArr, 4, h8);
            int i8 = 4 + h8;
            this.f38357e = A.g(bArr, i8, h8);
            int i9 = i8 + h8;
            this.f38358f = A.g(bArr, i9, h8);
            int i10 = i9 + h8;
            this.f38359g = A.g(bArr, i10, h8);
            int i11 = i10 + h8;
            try {
                C3797a c3797a = (C3797a) A.f(A.g(bArr, i11, bArr.length - i11), C3797a.class);
                if (c3797a.b() != a8) {
                    throw new IllegalStateException("serialized BDS has wrong index");
                }
                this.f38360h = c3797a.h(bVar.f38361a.g());
                return;
            } catch (IOException e8) {
                throw new IllegalArgumentException(e8.getMessage(), e8);
            } catch (ClassNotFoundException e9) {
                throw new IllegalArgumentException(e9.getMessage(), e9);
            }
        }
        byte[] bArr2 = bVar.f38364d;
        if (bArr2 == null) {
            this.f38356d = new byte[h8];
        } else {
            if (bArr2.length != h8) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.f38356d = bArr2;
        }
        byte[] bArr3 = bVar.f38365e;
        if (bArr3 == null) {
            this.f38357e = new byte[h8];
        } else {
            if (bArr3.length != h8) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.f38357e = bArr3;
        }
        byte[] bArr4 = bVar.f38366f;
        if (bArr4 == null) {
            this.f38358f = new byte[h8];
        } else {
            if (bArr4.length != h8) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f38358f = bArr4;
        }
        byte[] bArr5 = bVar.f38367g;
        if (bArr5 == null) {
            this.f38359g = new byte[h8];
        } else {
            if (bArr5.length != h8) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.f38359g = bArr5;
        }
        C3797a c3797a2 = bVar.f38368h;
        this.f38360h = c3797a2 == null ? (bVar.f38362b >= (1 << xVar.b()) + (-2) || bArr4 == null || bArr2 == null) ? new C3797a(xVar, (1 << xVar.b()) - 1, bVar.f38362b) : new C3797a(xVar, bArr4, bArr2, (j) new j.b().l(), bVar.f38362b) : c3797a2;
        if (bVar.f38363c >= 0 && bVar.f38363c != this.f38360h.c()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public x b() {
        return this.f38355c;
    }

    public byte[] c() {
        byte[] f8;
        synchronized (this) {
            try {
                int h8 = this.f38355c.h();
                byte[] bArr = new byte[h8 + 4 + h8 + h8 + h8];
                E7.f.d(this.f38360h.b(), bArr, 0);
                A.e(bArr, this.f38356d, 4);
                int i8 = 4 + h8;
                A.e(bArr, this.f38357e, i8);
                int i9 = i8 + h8;
                A.e(bArr, this.f38358f, i9);
                A.e(bArr, this.f38359g, i9 + h8);
                try {
                    f8 = E7.a.f(bArr, A.p(this.f38360h));
                } catch (IOException e8) {
                    throw new RuntimeException("error serializing bds state: " + e8.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f8;
    }

    @Override // E7.c
    public byte[] getEncoded() {
        byte[] c8;
        synchronized (this) {
            c8 = c();
        }
        return c8;
    }
}
