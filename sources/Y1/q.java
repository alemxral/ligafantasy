package Y1;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final int f12897a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12898b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12899c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12900d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f12901e;

    public q(int i8, String str, String str2, String str3, boolean z8) {
        this.f12897a = i8;
        this.f12898b = str;
        this.f12899c = str2;
        this.f12900d = str3;
        this.f12901e = z8;
    }

    public String a() {
        return this.f12900d;
    }

    public String b() {
        return this.f12899c;
    }

    public String c() {
        return this.f12898b;
    }

    public int d() {
        return this.f12897a;
    }

    public boolean e() {
        return this.f12901e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f12897a == qVar.f12897a && this.f12901e == qVar.f12901e && this.f12898b.equals(qVar.f12898b) && this.f12899c.equals(qVar.f12899c) && this.f12900d.equals(qVar.f12900d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i8;
        int i9 = this.f12897a;
        if (this.f12901e) {
            i8 = 64;
        } else {
            i8 = 0;
        }
        return i9 + i8 + (this.f12898b.hashCode() * this.f12899c.hashCode() * this.f12900d.hashCode());
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12898b);
        sb.append('.');
        sb.append(this.f12899c);
        sb.append(this.f12900d);
        sb.append(" (");
        sb.append(this.f12897a);
        if (this.f12901e) {
            str = " itf";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
