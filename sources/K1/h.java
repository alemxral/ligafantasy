package K1;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class h implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final h f5735b = new h("JOSE");

    /* renamed from: c, reason: collision with root package name */
    public static final h f5736c = new h("JOSE+JSON");

    /* renamed from: d, reason: collision with root package name */
    public static final h f5737d = new h("JWT");

    /* renamed from: a, reason: collision with root package name */
    private final String f5738a;

    public h(String str) {
        if (str != null) {
            this.f5738a = str;
            return;
        }
        throw new IllegalArgumentException("The object type must not be null");
    }

    public boolean equals(Object obj) {
        if ((obj instanceof h) && this.f5738a.equalsIgnoreCase(((h) obj).f5738a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5738a.toLowerCase().hashCode();
    }

    public String toString() {
        return this.f5738a;
    }
}
