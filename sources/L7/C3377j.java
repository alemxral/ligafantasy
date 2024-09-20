package l7;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: l7.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class C3377j implements E7.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f34833a;

    /* renamed from: b, reason: collision with root package name */
    private final C3373f f34834b;

    /* renamed from: c, reason: collision with root package name */
    private final C3378k f34835c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[][] f34836d;

    public C3377j(int i8, C3373f c3373f, C3378k c3378k, byte[][] bArr) {
        this.f34833a = i8;
        this.f34834b = c3373f;
        this.f34835c = c3378k;
        this.f34836d = bArr;
    }

    public static C3377j a(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof C3377j) {
            return (C3377j) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            int readInt = dataInputStream2.readInt();
            C3373f a8 = C3373f.a(obj);
            C3378k e8 = C3378k.e(dataInputStream2.readInt());
            int c8 = e8.c();
            byte[][] bArr = new byte[c8];
            for (int i8 = 0; i8 < c8; i8++) {
                byte[] bArr2 = new byte[e8.d()];
                bArr[i8] = bArr2;
                dataInputStream2.readFully(bArr2);
            }
            return new C3377j(readInt, a8, e8, bArr);
        }
        if (obj instanceof byte[]) {
            DataInputStream dataInputStream3 = null;
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th) {
                th = th;
            }
            try {
                C3377j a9 = a(dataInputStream);
                dataInputStream.close();
                return a9;
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
        C3377j c3377j = (C3377j) obj;
        if (this.f34833a != c3377j.f34833a) {
            return false;
        }
        C3373f c3373f = this.f34834b;
        if (c3373f == null ? c3377j.f34834b != null : !c3373f.equals(c3377j.f34834b)) {
            return false;
        }
        C3378k c3378k = this.f34835c;
        if (c3378k == null ? c3377j.f34835c != null : !c3378k.equals(c3377j.f34835c)) {
            return false;
        }
        return Arrays.deepEquals(this.f34836d, c3377j.f34836d);
    }

    @Override // E7.c
    public byte[] getEncoded() {
        return C3368a.f().i(this.f34833a).d(this.f34834b.getEncoded()).i(this.f34835c.f()).e(this.f34836d).b();
    }

    public int hashCode() {
        int i8;
        int i9 = this.f34833a * 31;
        C3373f c3373f = this.f34834b;
        int i10 = 0;
        if (c3373f != null) {
            i8 = c3373f.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (i9 + i8) * 31;
        C3378k c3378k = this.f34835c;
        if (c3378k != null) {
            i10 = c3378k.hashCode();
        }
        return ((i11 + i10) * 31) + Arrays.deepHashCode(this.f34836d);
    }
}
