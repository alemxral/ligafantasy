package L;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private int f6005a = 1;

    public b a(Object obj) {
        int hashCode;
        int i8 = this.f6005a * 31;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        this.f6005a = i8 + hashCode;
        return this;
    }

    public int b() {
        return this.f6005a;
    }

    public final b c(boolean z8) {
        this.f6005a = (this.f6005a * 31) + (z8 ? 1 : 0);
        return this;
    }
}
