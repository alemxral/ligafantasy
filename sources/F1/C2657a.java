package f1;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2657a {

    /* renamed from: p, reason: collision with root package name */
    private static final C2657a f30939p = new C0737a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f30940a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30941b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30942c;

    /* renamed from: d, reason: collision with root package name */
    private final c f30943d;

    /* renamed from: e, reason: collision with root package name */
    private final d f30944e;

    /* renamed from: f, reason: collision with root package name */
    private final String f30945f;

    /* renamed from: g, reason: collision with root package name */
    private final String f30946g;

    /* renamed from: h, reason: collision with root package name */
    private final int f30947h;

    /* renamed from: i, reason: collision with root package name */
    private final int f30948i;

    /* renamed from: j, reason: collision with root package name */
    private final String f30949j;

    /* renamed from: k, reason: collision with root package name */
    private final long f30950k;

    /* renamed from: l, reason: collision with root package name */
    private final b f30951l;

    /* renamed from: m, reason: collision with root package name */
    private final String f30952m;

    /* renamed from: n, reason: collision with root package name */
    private final long f30953n;

    /* renamed from: o, reason: collision with root package name */
    private final String f30954o;

    /* renamed from: f1.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0737a {

        /* renamed from: a, reason: collision with root package name */
        private long f30955a = 0;

        /* renamed from: b, reason: collision with root package name */
        private String f30956b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f30957c = "";

        /* renamed from: d, reason: collision with root package name */
        private c f30958d = c.UNKNOWN;

        /* renamed from: e, reason: collision with root package name */
        private d f30959e = d.UNKNOWN_OS;

        /* renamed from: f, reason: collision with root package name */
        private String f30960f = "";

        /* renamed from: g, reason: collision with root package name */
        private String f30961g = "";

        /* renamed from: h, reason: collision with root package name */
        private int f30962h = 0;

        /* renamed from: i, reason: collision with root package name */
        private int f30963i = 0;

        /* renamed from: j, reason: collision with root package name */
        private String f30964j = "";

        /* renamed from: k, reason: collision with root package name */
        private long f30965k = 0;

        /* renamed from: l, reason: collision with root package name */
        private b f30966l = b.UNKNOWN_EVENT;

        /* renamed from: m, reason: collision with root package name */
        private String f30967m = "";

        /* renamed from: n, reason: collision with root package name */
        private long f30968n = 0;

        /* renamed from: o, reason: collision with root package name */
        private String f30969o = "";

        C0737a() {
        }

        public C2657a a() {
            return new C2657a(this.f30955a, this.f30956b, this.f30957c, this.f30958d, this.f30959e, this.f30960f, this.f30961g, this.f30962h, this.f30963i, this.f30964j, this.f30965k, this.f30966l, this.f30967m, this.f30968n, this.f30969o);
        }

        public C0737a b(String str) {
            this.f30967m = str;
            return this;
        }

        public C0737a c(String str) {
            this.f30961g = str;
            return this;
        }

        public C0737a d(String str) {
            this.f30969o = str;
            return this;
        }

        public C0737a e(b bVar) {
            this.f30966l = bVar;
            return this;
        }

        public C0737a f(String str) {
            this.f30957c = str;
            return this;
        }

        public C0737a g(String str) {
            this.f30956b = str;
            return this;
        }

        public C0737a h(c cVar) {
            this.f30958d = cVar;
            return this;
        }

        public C0737a i(String str) {
            this.f30960f = str;
            return this;
        }

        public C0737a j(long j8) {
            this.f30955a = j8;
            return this;
        }

        public C0737a k(d dVar) {
            this.f30959e = dVar;
            return this;
        }

        public C0737a l(String str) {
            this.f30964j = str;
            return this;
        }

        public C0737a m(int i8) {
            this.f30963i = i8;
            return this;
        }
    }

    /* renamed from: f1.a$b */
    /* loaded from: classes3.dex */
    public enum b implements V0.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* renamed from: a, reason: collision with root package name */
        private final int f30974a;

        b(int i8) {
            this.f30974a = i8;
        }

        @Override // V0.c
        public int getNumber() {
            return this.f30974a;
        }
    }

    /* renamed from: f1.a$c */
    /* loaded from: classes3.dex */
    public enum c implements V0.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f30980a;

        c(int i8) {
            this.f30980a = i8;
        }

        @Override // V0.c
        public int getNumber() {
            return this.f30980a;
        }
    }

    /* renamed from: f1.a$d */
    /* loaded from: classes3.dex */
    public enum d implements V0.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f30986a;

        d(int i8) {
            this.f30986a = i8;
        }

        @Override // V0.c
        public int getNumber() {
            return this.f30986a;
        }
    }

    C2657a(long j8, String str, String str2, c cVar, d dVar, String str3, String str4, int i8, int i9, String str5, long j9, b bVar, String str6, long j10, String str7) {
        this.f30940a = j8;
        this.f30941b = str;
        this.f30942c = str2;
        this.f30943d = cVar;
        this.f30944e = dVar;
        this.f30945f = str3;
        this.f30946g = str4;
        this.f30947h = i8;
        this.f30948i = i9;
        this.f30949j = str5;
        this.f30950k = j9;
        this.f30951l = bVar;
        this.f30952m = str6;
        this.f30953n = j10;
        this.f30954o = str7;
    }

    public static C0737a p() {
        return new C0737a();
    }

    public String a() {
        return this.f30952m;
    }

    public long b() {
        return this.f30950k;
    }

    public long c() {
        return this.f30953n;
    }

    public String d() {
        return this.f30946g;
    }

    public String e() {
        return this.f30954o;
    }

    public b f() {
        return this.f30951l;
    }

    public String g() {
        return this.f30942c;
    }

    public String h() {
        return this.f30941b;
    }

    public c i() {
        return this.f30943d;
    }

    public String j() {
        return this.f30945f;
    }

    public int k() {
        return this.f30947h;
    }

    public long l() {
        return this.f30940a;
    }

    public d m() {
        return this.f30944e;
    }

    public String n() {
        return this.f30949j;
    }

    public int o() {
        return this.f30948i;
    }
}
