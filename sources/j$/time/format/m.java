package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class m implements f {

    /* renamed from: a, reason: collision with root package name */
    private final j$.time.temporal.r f31941a;

    /* renamed from: b, reason: collision with root package name */
    private final v f31942b;

    /* renamed from: c, reason: collision with root package name */
    private final b f31943c;

    /* renamed from: d, reason: collision with root package name */
    private volatile i f31944d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(j$.time.temporal.r rVar, v vVar, b bVar) {
        this.f31941a = rVar;
        this.f31942b = vVar;
        this.f31943c = bVar;
    }

    @Override // j$.time.format.f
    public final boolean j(p pVar, StringBuilder sb) {
        Long e8 = pVar.e(this.f31941a);
        if (e8 == null) {
            return false;
        }
        j$.time.chrono.m mVar = (j$.time.chrono.m) pVar.d().u(j$.time.temporal.n.e());
        String c8 = (mVar == null || mVar == j$.time.chrono.t.f31895d) ? this.f31943c.c(this.f31941a, e8.longValue(), this.f31942b, pVar.c()) : this.f31943c.b(mVar, this.f31941a, e8.longValue(), this.f31942b, pVar.c());
        if (c8 != null) {
            sb.append(c8);
            return true;
        }
        if (this.f31944d == null) {
            this.f31944d = new i(this.f31941a, 1, 19, u.NORMAL);
        }
        return this.f31944d.j(pVar, sb);
    }

    public final String toString() {
        StringBuilder sb;
        v vVar = v.FULL;
        j$.time.temporal.r rVar = this.f31941a;
        v vVar2 = this.f31942b;
        if (vVar2 == vVar) {
            sb = new StringBuilder("Text(");
            sb.append(rVar);
        } else {
            sb = new StringBuilder("Text(");
            sb.append(rVar);
            sb.append(",");
            sb.append(vVar2);
        }
        sb.append(")");
        return sb.toString();
    }
}
