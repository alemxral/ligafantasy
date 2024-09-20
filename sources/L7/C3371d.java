package l7;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* renamed from: l7.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3371d extends AbstractC3374g {

    /* renamed from: b, reason: collision with root package name */
    private final int f34799b;

    /* renamed from: c, reason: collision with root package name */
    private final C3376i f34800c;

    public C3371d(int i8, C3376i c3376i) {
        super(false);
        this.f34799b = i8;
        this.f34800c = c3376i;
    }

    public static C3371d a(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof C3371d) {
            return (C3371d) obj;
        }
        if (obj instanceof DataInputStream) {
            return new C3371d(((DataInputStream) obj).readInt(), C3376i.a(obj));
        }
        if (obj instanceof byte[]) {
            DataInputStream dataInputStream2 = null;
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th) {
                th = th;
            }
            try {
                C3371d a8 = a(dataInputStream);
                dataInputStream.close();
                return a8;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
                }
                throw th;
            }
        }
        if (obj instanceof InputStream) {
            return a(G7.a.b((InputStream) obj));
        }
        throw new IllegalArgumentException("cannot parse " + obj);
    }

    public int b() {
        return this.f34799b;
    }

    public C3376i c() {
        return this.f34800c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3371d c3371d = (C3371d) obj;
        if (this.f34799b != c3371d.f34799b) {
            return false;
        }
        return this.f34800c.equals(c3371d.f34800c);
    }

    @Override // l7.AbstractC3374g, E7.c
    public byte[] getEncoded() {
        return C3368a.f().i(this.f34799b).d(this.f34800c.getEncoded()).b();
    }

    public int hashCode() {
        return (this.f34799b * 31) + this.f34800c.hashCode();
    }
}
