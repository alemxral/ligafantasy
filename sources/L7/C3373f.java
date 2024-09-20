package l7;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: l7.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class C3373f implements E7.c {

    /* renamed from: a, reason: collision with root package name */
    private final C3372e f34813a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f34814b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f34815c;

    public C3373f(C3372e c3372e, byte[] bArr, byte[] bArr2) {
        this.f34813a = c3372e;
        this.f34814b = bArr;
        this.f34815c = bArr2;
    }

    public static C3373f a(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof C3373f) {
            return (C3373f) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            C3372e e8 = C3372e.e(dataInputStream2.readInt());
            byte[] bArr = new byte[e8.c()];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[e8.d() * e8.c()];
            dataInputStream2.readFully(bArr2);
            return new C3373f(e8, bArr, bArr2);
        }
        if (obj instanceof byte[]) {
            DataInputStream dataInputStream3 = null;
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th) {
                th = th;
            }
            try {
                C3373f a8 = a(dataInputStream);
                dataInputStream.close();
                return a8;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream3 = dataInputStream;
                if (dataInputStream3 != null) {
                    dataInputStream3.close();
                }
                throw th;
            }
        }
        if (obj instanceof InputStream) {
            return a(G7.a.b((InputStream) obj));
        }
        throw new IllegalArgumentException("cannot parse " + obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3373f c3373f = (C3373f) obj;
        C3372e c3372e = this.f34813a;
        if (c3372e == null ? c3373f.f34813a != null : !c3372e.equals(c3373f.f34813a)) {
            return false;
        }
        if (!Arrays.equals(this.f34814b, c3373f.f34814b)) {
            return false;
        }
        return Arrays.equals(this.f34815c, c3373f.f34815c);
    }

    @Override // E7.c
    public byte[] getEncoded() {
        return C3368a.f().i(this.f34813a.f()).d(this.f34814b).d(this.f34815c).b();
    }

    public int hashCode() {
        int i8;
        C3372e c3372e = this.f34813a;
        if (c3372e != null) {
            i8 = c3372e.hashCode();
        } else {
            i8 = 0;
        }
        return (((i8 * 31) + Arrays.hashCode(this.f34814b)) * 31) + Arrays.hashCode(this.f34815c);
    }
}
