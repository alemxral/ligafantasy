package l7;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: l7.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3375h extends AbstractC3374g {

    /* renamed from: l, reason: collision with root package name */
    private static a f34816l;

    /* renamed from: m, reason: collision with root package name */
    private static a[] f34817m;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f34818b;

    /* renamed from: c, reason: collision with root package name */
    private final C3378k f34819c;

    /* renamed from: d, reason: collision with root package name */
    private final C3372e f34820d;

    /* renamed from: e, reason: collision with root package name */
    private final int f34821e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f34822f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f34823g;

    /* renamed from: h, reason: collision with root package name */
    private final int f34824h;

    /* renamed from: i, reason: collision with root package name */
    private final Y6.e f34825i;

    /* renamed from: j, reason: collision with root package name */
    private int f34826j;

    /* renamed from: k, reason: collision with root package name */
    private C3376i f34827k;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l7.h$a */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f34828a;

        a(int i8) {
            this.f34828a = i8;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a) || ((a) obj).f34828a != this.f34828a) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f34828a;
        }
    }

    static {
        a aVar = new a(1);
        f34816l = aVar;
        a[] aVarArr = new a[TsExtractor.TS_STREAM_TYPE_AC3];
        f34817m = aVarArr;
        aVarArr[1] = aVar;
        int i8 = 2;
        while (true) {
            a[] aVarArr2 = f34817m;
            if (i8 < aVarArr2.length) {
                aVarArr2[i8] = new a(i8);
                i8++;
            } else {
                return;
            }
        }
    }

    public C3375h(C3378k c3378k, C3372e c3372e, int i8, byte[] bArr, int i9, byte[] bArr2) {
        super(true);
        this.f34819c = c3378k;
        this.f34820d = c3372e;
        this.f34826j = i8;
        this.f34818b = E7.a.d(bArr);
        this.f34821e = i9;
        this.f34822f = E7.a.d(bArr2);
        this.f34824h = 1 << (c3378k.c() + 1);
        this.f34823g = new WeakHashMap();
        this.f34825i = AbstractC3369b.a(c3378k.b());
    }

    private byte[] a(int i8) {
        int c8 = 1 << j().c();
        if (i8 >= c8) {
            AbstractC3380m.a(d(), this.f34825i);
            AbstractC3380m.c(i8, this.f34825i);
            AbstractC3380m.b((short) -32126, this.f34825i);
            AbstractC3380m.a(AbstractC3379l.a(h(), d(), i8 - c8, g()), this.f34825i);
            byte[] bArr = new byte[this.f34825i.f()];
            this.f34825i.a(bArr, 0);
            return bArr;
        }
        int i9 = i8 * 2;
        byte[] b8 = b(i9);
        byte[] b9 = b(i9 + 1);
        AbstractC3380m.a(d(), this.f34825i);
        AbstractC3380m.c(i8, this.f34825i);
        AbstractC3380m.b((short) -31869, this.f34825i);
        AbstractC3380m.a(b8, this.f34825i);
        AbstractC3380m.a(b9, this.f34825i);
        byte[] bArr2 = new byte[this.f34825i.f()];
        this.f34825i.a(bArr2, 0);
        return bArr2;
    }

    private byte[] c(a aVar) {
        synchronized (this.f34823g) {
            try {
                byte[] bArr = (byte[]) this.f34823g.get(aVar);
                if (bArr != null) {
                    return bArr;
                }
                byte[] a8 = a(aVar.f34828a);
                this.f34823g.put(aVar, a8);
                return a8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C3375h e(Object obj) {
        if (obj instanceof C3375h) {
            return (C3375h) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            if (dataInputStream.readInt() == 0) {
                C3378k e8 = C3378k.e(dataInputStream.readInt());
                C3372e e9 = C3372e.e(dataInputStream.readInt());
                byte[] bArr = new byte[16];
                dataInputStream.readFully(bArr);
                int readInt = dataInputStream.readInt();
                int readInt2 = dataInputStream.readInt();
                int readInt3 = dataInputStream.readInt();
                if (readInt3 >= 0) {
                    if (readInt3 <= dataInputStream.available()) {
                        byte[] bArr2 = new byte[readInt3];
                        dataInputStream.readFully(bArr2);
                        return new C3375h(e8, e9, readInt, bArr, readInt2, bArr2);
                    }
                    throw new IOException("secret length exceeded " + dataInputStream.available());
                }
                throw new IllegalStateException("secret length less than zero");
            }
            throw new IllegalStateException("expected version 0 lms private key");
        }
        if (obj instanceof byte[]) {
            DataInputStream dataInputStream2 = null;
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    C3375h e10 = e(dataInputStream3);
                    dataInputStream3.close();
                    return e10;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream2 = dataInputStream3;
                    if (dataInputStream2 != null) {
                        dataInputStream2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (obj instanceof InputStream) {
                return e(G7.a.b((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
    }

    public static C3375h f(byte[] bArr, byte[] bArr2) {
        C3375h e8 = e(bArr);
        e8.f34827k = C3376i.a(bArr2);
        return e8;
    }

    byte[] b(int i8) {
        a aVar;
        if (i8 < this.f34824h) {
            a[] aVarArr = f34817m;
            if (i8 < aVarArr.length) {
                aVar = aVarArr[i8];
            } else {
                aVar = new a(i8);
            }
            return c(aVar);
        }
        return a(i8);
    }

    public byte[] d() {
        return E7.a.d(this.f34818b);
    }

    public boolean equals(Object obj) {
        C3376i c3376i;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3375h c3375h = (C3375h) obj;
        if (this.f34826j != c3375h.f34826j || this.f34821e != c3375h.f34821e || !E7.a.a(this.f34818b, c3375h.f34818b)) {
            return false;
        }
        C3378k c3378k = this.f34819c;
        if (c3378k == null ? c3375h.f34819c != null : !c3378k.equals(c3375h.f34819c)) {
            return false;
        }
        C3372e c3372e = this.f34820d;
        if (c3372e == null ? c3375h.f34820d != null : !c3372e.equals(c3375h.f34820d)) {
            return false;
        }
        if (!E7.a.a(this.f34822f, c3375h.f34822f)) {
            return false;
        }
        C3376i c3376i2 = this.f34827k;
        if (c3376i2 == null || (c3376i = c3375h.f34827k) == null) {
            return true;
        }
        return c3376i2.equals(c3376i);
    }

    public byte[] g() {
        return E7.a.d(this.f34822f);
    }

    @Override // l7.AbstractC3374g, E7.c
    public byte[] getEncoded() {
        return C3368a.f().i(0).i(this.f34819c.f()).i(this.f34820d.f()).d(this.f34818b).i(this.f34826j).i(this.f34821e).i(this.f34822f.length).d(this.f34822f).b();
    }

    public C3372e h() {
        return this.f34820d;
    }

    public int hashCode() {
        int i8;
        int i9;
        int k8 = ((this.f34826j * 31) + E7.a.k(this.f34818b)) * 31;
        C3378k c3378k = this.f34819c;
        int i10 = 0;
        if (c3378k != null) {
            i8 = c3378k.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (k8 + i8) * 31;
        C3372e c3372e = this.f34820d;
        if (c3372e != null) {
            i9 = c3372e.hashCode();
        } else {
            i9 = 0;
        }
        int k9 = (((((i11 + i9) * 31) + this.f34821e) * 31) + E7.a.k(this.f34822f)) * 31;
        C3376i c3376i = this.f34827k;
        if (c3376i != null) {
            i10 = c3376i.hashCode();
        }
        return k9 + i10;
    }

    public C3376i i() {
        C3376i c3376i;
        synchronized (this) {
            try {
                if (this.f34827k == null) {
                    this.f34827k = new C3376i(this.f34819c, this.f34820d, c(f34816l), this.f34818b);
                }
                c3376i = this.f34827k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3376i;
    }

    public C3378k j() {
        return this.f34819c;
    }
}
