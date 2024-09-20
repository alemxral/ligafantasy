package X0;

import java.util.List;

/* loaded from: classes3.dex */
final class a extends l {

    /* renamed from: a, reason: collision with root package name */
    private final String f12156a;

    /* renamed from: b, reason: collision with root package name */
    private final List f12157b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, List list) {
        if (str != null) {
            this.f12156a = str;
            if (list != null) {
                this.f12157b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }

    @Override // X0.l
    public List b() {
        return this.f12157b;
    }

    @Override // X0.l
    public String c() {
        return this.f12156a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f12156a.equals(lVar.c()) && this.f12157b.equals(lVar.b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f12156a.hashCode() ^ 1000003) * 1000003) ^ this.f12157b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f12156a + ", usedDates=" + this.f12157b + "}";
    }
}
