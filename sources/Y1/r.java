package Y1;

/* loaded from: classes4.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    final s f12902a;

    /* renamed from: b, reason: collision with root package name */
    final s f12903b;

    /* renamed from: c, reason: collision with root package name */
    final s f12904c;

    /* renamed from: d, reason: collision with root package name */
    final int f12905d;

    /* renamed from: e, reason: collision with root package name */
    final String f12906e;

    /* renamed from: f, reason: collision with root package name */
    r f12907f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(s sVar, s sVar2, s sVar3, int i8, String str) {
        this.f12902a = sVar;
        this.f12903b = sVar2;
        this.f12904c = sVar3;
        this.f12905d = i8;
        this.f12906e = str;
    }

    static int a(r rVar) {
        int i8 = 0;
        while (rVar != null) {
            i8++;
            rVar = rVar.f12907f;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(r rVar) {
        return (a(rVar) * 8) + 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(r rVar, C1515d c1515d) {
        c1515d.k(a(rVar));
        while (rVar != null) {
            c1515d.k(rVar.f12902a.f12912d).k(rVar.f12903b.f12912d).k(rVar.f12904c.f12912d).k(rVar.f12905d);
            rVar = rVar.f12907f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r d(r rVar, s sVar, s sVar2) {
        int i8;
        if (rVar == null) {
            return null;
        }
        r d8 = d(rVar.f12907f, sVar, sVar2);
        rVar.f12907f = d8;
        s sVar3 = rVar.f12902a;
        int i9 = sVar3.f12912d;
        s sVar4 = rVar.f12903b;
        int i10 = sVar4.f12912d;
        int i11 = sVar.f12912d;
        if (sVar2 == null) {
            i8 = Integer.MAX_VALUE;
        } else {
            i8 = sVar2.f12912d;
        }
        if (i11 < i10 && i8 > i9) {
            if (i11 <= i9) {
                if (i8 >= i10) {
                    return d8;
                }
                return new r(rVar, sVar2, sVar4);
            }
            if (i8 >= i10) {
                return new r(rVar, sVar3, sVar);
            }
            rVar.f12907f = new r(rVar, sVar2, sVar4);
            return new r(rVar, rVar.f12902a, sVar);
        }
        return rVar;
    }

    r(r rVar, s sVar, s sVar2) {
        this(sVar, sVar2, rVar.f12904c, rVar.f12905d, rVar.f12906e);
        this.f12907f = rVar.f12907f;
    }
}
