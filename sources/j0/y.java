package J0;

import J0.D;

/* loaded from: classes3.dex */
final class y extends D.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f4659a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4660b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4661c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4662d;

    /* renamed from: e, reason: collision with root package name */
    private final int f4663e;

    /* renamed from: f, reason: collision with root package name */
    private final E0.e f4664f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(String str, String str2, String str3, String str4, int i8, E0.e eVar) {
        if (str != null) {
            this.f4659a = str;
            if (str2 != null) {
                this.f4660b = str2;
                if (str3 != null) {
                    this.f4661c = str3;
                    if (str4 != null) {
                        this.f4662d = str4;
                        this.f4663e = i8;
                        if (eVar != null) {
                            this.f4664f = eVar;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    @Override // J0.D.a
    public String a() {
        return this.f4659a;
    }

    @Override // J0.D.a
    public int c() {
        return this.f4663e;
    }

    @Override // J0.D.a
    public E0.e d() {
        return this.f4664f;
    }

    @Override // J0.D.a
    public String e() {
        return this.f4662d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D.a)) {
            return false;
        }
        D.a aVar = (D.a) obj;
        if (this.f4659a.equals(aVar.a()) && this.f4660b.equals(aVar.f()) && this.f4661c.equals(aVar.g()) && this.f4662d.equals(aVar.e()) && this.f4663e == aVar.c() && this.f4664f.equals(aVar.d())) {
            return true;
        }
        return false;
    }

    @Override // J0.D.a
    public String f() {
        return this.f4660b;
    }

    @Override // J0.D.a
    public String g() {
        return this.f4661c;
    }

    public int hashCode() {
        return ((((((((((this.f4659a.hashCode() ^ 1000003) * 1000003) ^ this.f4660b.hashCode()) * 1000003) ^ this.f4661c.hashCode()) * 1000003) ^ this.f4662d.hashCode()) * 1000003) ^ this.f4663e) * 1000003) ^ this.f4664f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f4659a + ", versionCode=" + this.f4660b + ", versionName=" + this.f4661c + ", installUuid=" + this.f4662d + ", deliveryMechanism=" + this.f4663e + ", developmentPlatformProvider=" + this.f4664f + "}";
    }
}
