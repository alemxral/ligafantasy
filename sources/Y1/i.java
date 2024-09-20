package Y1;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f12849a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12850b;

    /* renamed from: c, reason: collision with root package name */
    private final q f12851c;

    /* renamed from: d, reason: collision with root package name */
    private final Object[] f12852d;

    public i(String str, String str2, q qVar, Object... objArr) {
        this.f12849a = str;
        this.f12850b = str2;
        this.f12851c = qVar;
        this.f12852d = objArr;
    }

    public q a() {
        return this.f12851c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] b() {
        return this.f12852d;
    }

    public String c() {
        return this.f12850b;
    }

    public String d() {
        return this.f12849a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f12849a.equals(iVar.f12849a) && this.f12850b.equals(iVar.f12850b) && this.f12851c.equals(iVar.f12851c) && Arrays.equals(this.f12852d, iVar.f12852d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f12849a.hashCode() ^ Integer.rotateLeft(this.f12850b.hashCode(), 8)) ^ Integer.rotateLeft(this.f12851c.hashCode(), 16)) ^ Integer.rotateLeft(Arrays.hashCode(this.f12852d), 24);
    }

    public String toString() {
        return this.f12849a + " : " + this.f12850b + ' ' + this.f12851c + ' ' + Arrays.toString(this.f12852d);
    }
}
