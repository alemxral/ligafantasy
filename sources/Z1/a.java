package Z1;

import java.io.Serializable;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final String f13232a;

    public a(String str) {
        if (str != null) {
            this.f13232a = str;
            return;
        }
        throw new IllegalArgumentException("The Base64 value must not be null");
    }

    public byte[] a() {
        return b.c(this.f13232a);
    }

    public BigInteger b() {
        return new BigInteger(1, a());
    }

    public String c() {
        return new String(a(), m.f13234a);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof a) && toString().equals(obj.toString())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f13232a.hashCode();
    }

    public String toString() {
        return this.f13232a;
    }
}
