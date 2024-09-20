package l7;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* renamed from: l7.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3376i extends AbstractC3374g {

    /* renamed from: b, reason: collision with root package name */
    private final C3378k f34829b;

    /* renamed from: c, reason: collision with root package name */
    private final C3372e f34830c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f34831d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f34832e;

    public C3376i(C3378k c3378k, C3372e c3372e, byte[] bArr, byte[] bArr2) {
        super(false);
        this.f34829b = c3378k;
        this.f34830c = c3372e;
        this.f34831d = E7.a.d(bArr2);
        this.f34832e = E7.a.d(bArr);
    }

    public static C3376i a(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof C3376i) {
            return (C3376i) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            C3378k e8 = C3378k.e(dataInputStream2.readInt());
            C3372e e9 = C3372e.e(dataInputStream2.readInt());
            byte[] bArr = new byte[16];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[e8.d()];
            dataInputStream2.readFully(bArr2);
            return new C3376i(e8, e9, bArr2, bArr);
        }
        if (obj instanceof byte[]) {
            DataInputStream dataInputStream3 = null;
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th) {
                th = th;
            }
            try {
                C3376i a8 = a(dataInputStream);
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

    byte[] b() {
        return C3368a.f().i(this.f34829b.f()).i(this.f34830c.f()).d(this.f34831d).d(this.f34832e).b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3376i c3376i = (C3376i) obj;
        if (!this.f34829b.equals(c3376i.f34829b) || !this.f34830c.equals(c3376i.f34830c) || !E7.a.a(this.f34831d, c3376i.f34831d)) {
            return false;
        }
        return E7.a.a(this.f34832e, c3376i.f34832e);
    }

    @Override // l7.AbstractC3374g, E7.c
    public byte[] getEncoded() {
        return b();
    }

    public int hashCode() {
        return (((((this.f34829b.hashCode() * 31) + this.f34830c.hashCode()) * 31) + E7.a.k(this.f34831d)) * 31) + E7.a.k(this.f34832e);
    }
}
