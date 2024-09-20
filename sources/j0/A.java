package J0;

import J0.D;

/* loaded from: classes3.dex */
final class A extends D.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f4320a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4321b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4322c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(String str, String str2, boolean z8) {
        if (str != null) {
            this.f4320a = str;
            if (str2 != null) {
                this.f4321b = str2;
                this.f4322c = z8;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    @Override // J0.D.c
    public boolean b() {
        return this.f4322c;
    }

    @Override // J0.D.c
    public String c() {
        return this.f4321b;
    }

    @Override // J0.D.c
    public String d() {
        return this.f4320a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D.c)) {
            return false;
        }
        D.c cVar = (D.c) obj;
        if (this.f4320a.equals(cVar.d()) && this.f4321b.equals(cVar.c()) && this.f4322c == cVar.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i8;
        int hashCode = (((this.f4320a.hashCode() ^ 1000003) * 1000003) ^ this.f4321b.hashCode()) * 1000003;
        if (this.f4322c) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        return hashCode ^ i8;
    }

    public String toString() {
        return "OsData{osRelease=" + this.f4320a + ", osCodeName=" + this.f4321b + ", isRooted=" + this.f4322c + "}";
    }
}
