package R;

/* renamed from: R.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1320q {

    /* renamed from: b, reason: collision with root package name */
    private static C1320q f8588b;

    /* renamed from: c, reason: collision with root package name */
    private static final r f8589c = new r(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private r f8590a;

    private C1320q() {
    }

    public static synchronized C1320q b() {
        C1320q c1320q;
        synchronized (C1320q.class) {
            try {
                if (f8588b == null) {
                    f8588b = new C1320q();
                }
                c1320q = f8588b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1320q;
    }

    public r a() {
        return this.f8590a;
    }

    public final synchronized void c(r rVar) {
        if (rVar == null) {
            this.f8590a = f8589c;
            return;
        }
        r rVar2 = this.f8590a;
        if (rVar2 != null && rVar2.I() >= rVar.I()) {
            return;
        }
        this.f8590a = rVar;
    }
}
