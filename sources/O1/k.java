package O1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public class k implements Q1.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f7729a;

    /* renamed from: b, reason: collision with root package name */
    private final Q1.b f7730b = new Q1.b();

    public k(String str) {
        if (str != null) {
            this.f7729a = str;
            return;
        }
        throw new IllegalArgumentException("The JCA hash algorithm must not be null");
    }

    public static byte[] g(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return Z1.e.d(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    public static int h(int i8, int i9) {
        return ((i9 + i8) - 1) / i8;
    }

    public static byte[] k(Z1.c cVar) {
        byte[] bArr;
        if (cVar != null) {
            bArr = cVar.a();
        } else {
            bArr = null;
        }
        return l(bArr);
    }

    public static byte[] l(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        return Z1.e.d(Z1.i.a(bArr.length), bArr);
    }

    public static byte[] m(int i8) {
        return Z1.i.a(i8);
    }

    public static byte[] n() {
        return new byte[0];
    }

    public static byte[] o(String str) {
        byte[] bArr;
        if (str != null) {
            bArr = str.getBytes(Z1.m.f13234a);
        } else {
            bArr = null;
        }
        return l(bArr);
    }

    private MessageDigest p() {
        Provider a8 = e().a();
        try {
            if (a8 == null) {
                return MessageDigest.getInstance(this.f7729a);
            }
            return MessageDigest.getInstance(this.f7729a, a8);
        } catch (NoSuchAlgorithmException e8) {
            throw new K1.f("Couldn't get message digest for KDF: " + e8.getMessage(), e8);
        }
    }

    @Override // Q1.a
    public Q1.b e() {
        return this.f7730b;
    }

    public SecretKey i(SecretKey secretKey, int i8, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        MessageDigest p8 = p();
        for (int i9 = 1; i9 <= h(Z1.e.e(p8.getDigestLength()), i8); i9++) {
            p8.update(Z1.i.a(i9));
            p8.update(secretKey.getEncoded());
            if (bArr != null) {
                p8.update(bArr);
            }
            try {
                byteArrayOutputStream.write(p8.digest());
            } catch (IOException e8) {
                throw new K1.f("Couldn't write derived key: " + e8.getMessage(), e8);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int c8 = Z1.e.c(i8);
        if (byteArray.length == c8) {
            return new SecretKeySpec(byteArray, "AES");
        }
        return new SecretKeySpec(Z1.e.g(byteArray, 0, c8), "AES");
    }

    public SecretKey j(SecretKey secretKey, int i8, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return i(secretKey, i8, g(bArr, bArr2, bArr3, bArr4, bArr5));
    }
}
