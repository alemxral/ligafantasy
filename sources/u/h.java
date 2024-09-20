package u;

import java.util.Arrays;
import s.C3700b;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final C3700b f38442a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f38443b;

    public h(C3700b c3700b, byte[] bArr) {
        if (c3700b != null) {
            if (bArr != null) {
                this.f38442a = c3700b;
                this.f38443b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public byte[] a() {
        return this.f38443b;
    }

    public C3700b b() {
        return this.f38442a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f38442a.equals(hVar.f38442a)) {
            return false;
        }
        return Arrays.equals(this.f38443b, hVar.f38443b);
    }

    public int hashCode() {
        return ((this.f38442a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f38443b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f38442a + ", bytes=[...]}";
    }
}
