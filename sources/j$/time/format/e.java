package j$.time.format;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    private final f[] f31924a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f31925b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(List list, boolean z8) {
        this((f[]) list.toArray(new f[list.size()]), z8);
    }

    e(f[] fVarArr, boolean z8) {
        this.f31924a = fVarArr;
        this.f31925b = z8;
    }

    public final e a() {
        return !this.f31925b ? this : new e(this.f31924a, false);
    }

    @Override // j$.time.format.f
    public final boolean j(p pVar, StringBuilder sb) {
        int length = sb.length();
        boolean z8 = this.f31925b;
        if (z8) {
            pVar.g();
        }
        try {
            for (f fVar : this.f31924a) {
                if (!fVar.j(pVar, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            if (z8) {
                pVar.a();
            }
            return true;
        } finally {
            if (z8) {
                pVar.a();
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        f[] fVarArr = this.f31924a;
        if (fVarArr != null) {
            boolean z8 = this.f31925b;
            sb.append(z8 ? "[" : "(");
            for (f fVar : fVarArr) {
                sb.append(fVar);
            }
            sb.append(z8 ? "]" : ")");
        }
        return sb.toString();
    }
}
