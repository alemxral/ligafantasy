package K4;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f5944a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5945b;

    /* renamed from: c, reason: collision with root package name */
    private String f5946c;

    public b(String packageName, String name) {
        AbstractC3159y.i(packageName, "packageName");
        AbstractC3159y.i(name, "name");
        this.f5944a = packageName;
        this.f5945b = name;
    }

    public final String a() {
        return this.f5946c;
    }

    public final String b() {
        return this.f5945b;
    }

    public final String c() {
        return this.f5944a;
    }

    public final void d(String str) {
        this.f5946c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3159y.d(this.f5944a, bVar.f5944a) && AbstractC3159y.d(this.f5945b, bVar.f5945b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f5944a.hashCode() * 31) + this.f5945b.hashCode();
    }

    public String toString() {
        return "AppToBackup(packageName=" + this.f5944a + ", name=" + this.f5945b + ')';
    }
}
