package O1;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f7725a;

    /* renamed from: b, reason: collision with root package name */
    private final SecretKey f7726b;

    /* renamed from: c, reason: collision with root package name */
    private final SecretKey f7727c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7728d;

    public j(SecretKey secretKey) {
        this.f7725a = secretKey;
        byte[] encoded = secretKey.getEncoded();
        if (encoded.length == 32) {
            this.f7726b = new SecretKeySpec(encoded, 0, 16, "HMACSHA256");
            this.f7727c = new SecretKeySpec(encoded, 16, 16, "AES");
            this.f7728d = 16;
        } else if (encoded.length == 48) {
            this.f7726b = new SecretKeySpec(encoded, 0, 24, "HMACSHA384");
            this.f7727c = new SecretKeySpec(encoded, 24, 24, "AES");
            this.f7728d = 24;
        } else {
            if (encoded.length == 64) {
                this.f7726b = new SecretKeySpec(encoded, 0, 32, "HMACSHA512");
                this.f7727c = new SecretKeySpec(encoded, 32, 32, "AES");
                this.f7728d = 32;
                return;
            }
            throw new K1.u("Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits");
        }
    }

    public SecretKey a() {
        return this.f7727c;
    }

    public SecretKey b() {
        return this.f7726b;
    }

    public int c() {
        return this.f7728d;
    }
}
