package x;

/* renamed from: x.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3856b {

    /* renamed from: b, reason: collision with root package name */
    private static final C3856b f39052b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final e f39053a;

    /* renamed from: x.b$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private e f39054a = null;

        a() {
        }

        public C3856b a() {
            return new C3856b(this.f39054a);
        }

        public a b(e eVar) {
            this.f39054a = eVar;
            return this;
        }
    }

    C3856b(e eVar) {
        this.f39053a = eVar;
    }

    public static a b() {
        return new a();
    }

    public e a() {
        return this.f39053a;
    }
}
