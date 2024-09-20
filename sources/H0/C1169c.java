package H0;

import java.io.File;

/* renamed from: H0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1169c extends AbstractC1184s {

    /* renamed from: a, reason: collision with root package name */
    private final J0.B f3274a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3275b;

    /* renamed from: c, reason: collision with root package name */
    private final File f3276c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1169c(J0.B b8, String str, File file) {
        if (b8 != null) {
            this.f3274a = b8;
            if (str != null) {
                this.f3275b = str;
                if (file != null) {
                    this.f3276c = file;
                    return;
                }
                throw new NullPointerException("Null reportFile");
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    @Override // H0.AbstractC1184s
    public J0.B b() {
        return this.f3274a;
    }

    @Override // H0.AbstractC1184s
    public File c() {
        return this.f3276c;
    }

    @Override // H0.AbstractC1184s
    public String d() {
        return this.f3275b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1184s)) {
            return false;
        }
        AbstractC1184s abstractC1184s = (AbstractC1184s) obj;
        if (this.f3274a.equals(abstractC1184s.b()) && this.f3275b.equals(abstractC1184s.d()) && this.f3276c.equals(abstractC1184s.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f3274a.hashCode() ^ 1000003) * 1000003) ^ this.f3275b.hashCode()) * 1000003) ^ this.f3276c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f3274a + ", sessionId=" + this.f3275b + ", reportFile=" + this.f3276c + "}";
    }
}
