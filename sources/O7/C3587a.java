package o7;

import d7.AbstractC2565b;

/* renamed from: o7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3587a extends AbstractC2565b {

    /* renamed from: b, reason: collision with root package name */
    private int f36933b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f36934c;

    public C3587a(int i8, byte[] bArr) {
        super(true);
        if (bArr.length == AbstractC3589c.b(i8)) {
            this.f36933b = i8;
            this.f36934c = E7.a.d(bArr);
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }

    public byte[] a() {
        return E7.a.d(this.f36934c);
    }

    public int b() {
        return this.f36933b;
    }
}
