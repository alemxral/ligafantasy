package i1;

/* renamed from: i1.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2769c implements T0.a {

    /* renamed from: a, reason: collision with root package name */
    public static final T0.a f31423a = new C2769c();

    /* renamed from: i1.c$a */
    /* loaded from: classes3.dex */
    private static final class a implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final a f31424a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f31425b = S0.c.d("packageName");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f31426c = S0.c.d("versionName");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f31427d = S0.c.d("appBuildVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f31428e = S0.c.d("deviceManufacturer");

        private a() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C2767a c2767a, S0.e eVar) {
            eVar.a(f31425b, c2767a.c());
            eVar.a(f31426c, c2767a.d());
            eVar.a(f31427d, c2767a.a());
            eVar.a(f31428e, c2767a.b());
        }
    }

    /* renamed from: i1.c$b */
    /* loaded from: classes3.dex */
    private static final class b implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final b f31429a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f31430b = S0.c.d("appId");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f31431c = S0.c.d("deviceModel");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f31432d = S0.c.d("sessionSdkVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f31433e = S0.c.d("osVersion");

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f31434f = S0.c.d("logEnvironment");

        /* renamed from: g, reason: collision with root package name */
        private static final S0.c f31435g = S0.c.d("androidAppInfo");

        private b() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C2768b c2768b, S0.e eVar) {
            eVar.a(f31430b, c2768b.b());
            eVar.a(f31431c, c2768b.c());
            eVar.a(f31432d, c2768b.f());
            eVar.a(f31433e, c2768b.e());
            eVar.a(f31434f, c2768b.d());
            eVar.a(f31435g, c2768b.a());
        }
    }

    /* renamed from: i1.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0757c implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final C0757c f31436a = new C0757c();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f31437b = S0.c.d("performance");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f31438c = S0.c.d("crashlytics");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f31439d = S0.c.d("sessionSamplingRate");

        private C0757c() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C2771e c2771e, S0.e eVar) {
            eVar.a(f31437b, c2771e.b());
            eVar.a(f31438c, c2771e.a());
            eVar.b(f31439d, c2771e.c());
        }
    }

    /* renamed from: i1.c$d */
    /* loaded from: classes3.dex */
    private static final class d implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final d f31440a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f31441b = S0.c.d("eventType");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f31442c = S0.c.d("sessionData");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f31443d = S0.c.d("applicationInfo");

        private d() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p pVar, S0.e eVar) {
            eVar.a(f31441b, pVar.b());
            eVar.a(f31442c, pVar.c());
            eVar.a(f31443d, pVar.a());
        }
    }

    /* renamed from: i1.c$e */
    /* loaded from: classes3.dex */
    private static final class e implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final e f31444a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f31445b = S0.c.d("sessionId");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f31446c = S0.c.d("firstSessionId");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f31447d = S0.c.d("sessionIndex");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f31448e = S0.c.d("eventTimestampUs");

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f31449f = S0.c.d("dataCollectionStatus");

        /* renamed from: g, reason: collision with root package name */
        private static final S0.c f31450g = S0.c.d("firebaseInstallationId");

        private e() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s sVar, S0.e eVar) {
            eVar.a(f31445b, sVar.e());
            eVar.a(f31446c, sVar.d());
            eVar.c(f31447d, sVar.f());
            eVar.d(f31448e, sVar.b());
            eVar.a(f31449f, sVar.a());
            eVar.a(f31450g, sVar.c());
        }
    }

    private C2769c() {
    }

    @Override // T0.a
    public void a(T0.b bVar) {
        bVar.a(p.class, d.f31440a);
        bVar.a(s.class, e.f31444a);
        bVar.a(C2771e.class, C0757c.f31436a);
        bVar.a(C2768b.class, b.f31429a);
        bVar.a(C2767a.class, a.f31424a);
    }
}
