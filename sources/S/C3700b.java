package s;

/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3700b {

    /* renamed from: a, reason: collision with root package name */
    private final String f37679a;

    private C3700b(String str) {
        if (str != null) {
            this.f37679a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public static C3700b b(String str) {
        return new C3700b(str);
    }

    public String a() {
        return this.f37679a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3700b)) {
            return false;
        }
        return this.f37679a.equals(((C3700b) obj).f37679a);
    }

    public int hashCode() {
        return this.f37679a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f37679a + "\"}";
    }
}
