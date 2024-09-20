package O1;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f7718a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f7719b;

    public f(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            this.f7718a = bArr;
            if (bArr2 != null) {
                this.f7719b = bArr2;
                return;
            }
            throw new IllegalArgumentException("The authentication tag must not be null");
        }
        throw new IllegalArgumentException("The cipher text must not be null");
    }

    public byte[] a() {
        return this.f7719b;
    }

    public byte[] b() {
        return this.f7718a;
    }
}
