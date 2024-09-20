package R6;

/* loaded from: classes5.dex */
public class D0 {

    /* renamed from: a, reason: collision with root package name */
    private String f8758a;

    /* renamed from: b, reason: collision with root package name */
    private int f8759b = 0;

    public D0(String str) {
        this.f8758a = str;
    }

    public boolean a() {
        if (this.f8759b != -1) {
            return true;
        }
        return false;
    }

    public String b() {
        int i8 = this.f8759b;
        if (i8 == -1) {
            return null;
        }
        int indexOf = this.f8758a.indexOf(46, i8);
        if (indexOf == -1) {
            String substring = this.f8758a.substring(this.f8759b);
            this.f8759b = -1;
            return substring;
        }
        String substring2 = this.f8758a.substring(this.f8759b, indexOf);
        this.f8759b = indexOf + 1;
        return substring2;
    }
}
