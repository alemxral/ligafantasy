package l6;

/* renamed from: l6.F */
/* loaded from: classes5.dex */
public interface InterfaceC3344F {

    /* renamed from: a */
    public static final a f34571a = a.f34572a;

    /* renamed from: l6.F$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f34572a = new a();

        /* renamed from: b */
        private static final InterfaceC3344F f34573b = new C3346H();

        /* renamed from: c */
        private static final InterfaceC3344F f34574c = new C3347I();

        private a() {
        }

        public static /* synthetic */ InterfaceC3344F b(a aVar, long j8, long j9, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                j8 = 0;
            }
            if ((i8 & 2) != 0) {
                j9 = Long.MAX_VALUE;
            }
            return aVar.a(j8, j9);
        }

        public final InterfaceC3344F a(long j8, long j9) {
            return new C3348J(j8, j9);
        }

        public final InterfaceC3344F c() {
            return f34573b;
        }

        public final InterfaceC3344F d() {
            return f34574c;
        }
    }

    InterfaceC3358f a(InterfaceC3349K interfaceC3349K);
}
