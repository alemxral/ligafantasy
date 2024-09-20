package K1;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes4.dex */
public final class w implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final a f5851a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f5852b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5853c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f5854d;

    /* renamed from: e, reason: collision with root package name */
    private final Z1.c f5855e;

    /* renamed from: f, reason: collision with root package name */
    private final r f5856f;

    /* loaded from: classes4.dex */
    public enum a {
        JSON,
        STRING,
        BYTE_ARRAY,
        BASE64URL,
        JWS_OBJECT,
        SIGNED_JWT
    }

    public w(String str) {
        if (str != null) {
            this.f5852b = null;
            this.f5853c = str;
            this.f5854d = null;
            this.f5855e = null;
            this.f5856f = null;
            this.f5851a = a.STRING;
            return;
        }
        throw new IllegalArgumentException("The string must not be null");
    }

    private static String a(byte[] bArr) {
        if (bArr != null) {
            return new String(bArr, Z1.m.f13234a);
        }
        return null;
    }

    private static byte[] b(String str) {
        if (str != null) {
            return str.getBytes(Z1.m.f13234a);
        }
        return null;
    }

    public Z1.c c() {
        Z1.c cVar = this.f5855e;
        if (cVar != null) {
            return cVar;
        }
        return Z1.c.e(d());
    }

    public byte[] d() {
        byte[] bArr = this.f5854d;
        if (bArr != null) {
            return bArr;
        }
        Z1.c cVar = this.f5855e;
        if (cVar != null) {
            return cVar.a();
        }
        return b(toString());
    }

    public String toString() {
        String str = this.f5853c;
        if (str != null) {
            return str;
        }
        r rVar = this.f5856f;
        if (rVar != null) {
            if (rVar.a() != null) {
                return this.f5856f.a();
            }
            return this.f5856f.m();
        }
        Map map = this.f5852b;
        if (map != null) {
            return Z1.k.o(map);
        }
        byte[] bArr = this.f5854d;
        if (bArr != null) {
            return a(bArr);
        }
        Z1.c cVar = this.f5855e;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    public w(byte[] bArr) {
        if (bArr != null) {
            this.f5852b = null;
            this.f5853c = null;
            this.f5854d = bArr;
            this.f5855e = null;
            this.f5856f = null;
            this.f5851a = a.BYTE_ARRAY;
            return;
        }
        throw new IllegalArgumentException("The byte array must not be null");
    }

    public w(Z1.c cVar) {
        if (cVar != null) {
            this.f5852b = null;
            this.f5853c = null;
            this.f5854d = null;
            this.f5855e = cVar;
            this.f5856f = null;
            this.f5851a = a.BASE64URL;
            return;
        }
        throw new IllegalArgumentException("The Base64URL-encoded object must not be null");
    }
}
