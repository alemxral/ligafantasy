package F6;

import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: n, reason: collision with root package name */
    public static final d f2730n = new a().c().a();

    /* renamed from: o, reason: collision with root package name */
    public static final d f2731o = new a().e().b(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2732a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2733b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2734c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2735d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f2736e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f2737f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f2738g;

    /* renamed from: h, reason: collision with root package name */
    private final int f2739h;

    /* renamed from: i, reason: collision with root package name */
    private final int f2740i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f2741j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f2742k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f2743l;

    /* renamed from: m, reason: collision with root package name */
    String f2744m;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f2745a;

        /* renamed from: b, reason: collision with root package name */
        boolean f2746b;

        /* renamed from: c, reason: collision with root package name */
        int f2747c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f2748d = -1;

        /* renamed from: e, reason: collision with root package name */
        int f2749e = -1;

        /* renamed from: f, reason: collision with root package name */
        boolean f2750f;

        /* renamed from: g, reason: collision with root package name */
        boolean f2751g;

        /* renamed from: h, reason: collision with root package name */
        boolean f2752h;

        public d a() {
            return new d(this);
        }

        public a b(int i8, TimeUnit timeUnit) {
            int i9;
            if (i8 >= 0) {
                long seconds = timeUnit.toSeconds(i8);
                if (seconds > 2147483647L) {
                    i9 = Integer.MAX_VALUE;
                } else {
                    i9 = (int) seconds;
                }
                this.f2748d = i9;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i8);
        }

        public a c() {
            this.f2745a = true;
            return this;
        }

        public a d() {
            this.f2746b = true;
            return this;
        }

        public a e() {
            this.f2750f = true;
            return this;
        }
    }

    private d(boolean z8, boolean z9, int i8, int i9, boolean z10, boolean z11, boolean z12, int i10, int i11, boolean z13, boolean z14, boolean z15, String str) {
        this.f2732a = z8;
        this.f2733b = z9;
        this.f2734c = i8;
        this.f2735d = i9;
        this.f2736e = z10;
        this.f2737f = z11;
        this.f2738g = z12;
        this.f2739h = i10;
        this.f2740i = i11;
        this.f2741j = z13;
        this.f2742k = z14;
        this.f2743l = z15;
        this.f2744m = str;
    }

    private String a() {
        StringBuilder sb = new StringBuilder();
        if (this.f2732a) {
            sb.append("no-cache, ");
        }
        if (this.f2733b) {
            sb.append("no-store, ");
        }
        if (this.f2734c != -1) {
            sb.append("max-age=");
            sb.append(this.f2734c);
            sb.append(", ");
        }
        if (this.f2735d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f2735d);
            sb.append(", ");
        }
        if (this.f2736e) {
            sb.append("private, ");
        }
        if (this.f2737f) {
            sb.append("public, ");
        }
        if (this.f2738g) {
            sb.append("must-revalidate, ");
        }
        if (this.f2739h != -1) {
            sb.append("max-stale=");
            sb.append(this.f2739h);
            sb.append(", ");
        }
        if (this.f2740i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f2740i);
            sb.append(", ");
        }
        if (this.f2741j) {
            sb.append("only-if-cached, ");
        }
        if (this.f2742k) {
            sb.append("no-transform, ");
        }
        if (this.f2743l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static F6.d l(F6.q r22) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F6.d.l(F6.q):F6.d");
    }

    public boolean b() {
        return this.f2743l;
    }

    public boolean c() {
        return this.f2736e;
    }

    public boolean d() {
        return this.f2737f;
    }

    public int e() {
        return this.f2734c;
    }

    public int f() {
        return this.f2739h;
    }

    public int g() {
        return this.f2740i;
    }

    public boolean h() {
        return this.f2738g;
    }

    public boolean i() {
        return this.f2732a;
    }

    public boolean j() {
        return this.f2733b;
    }

    public boolean k() {
        return this.f2741j;
    }

    public String toString() {
        String str = this.f2744m;
        if (str == null) {
            String a8 = a();
            this.f2744m = a8;
            return a8;
        }
        return str;
    }

    d(a aVar) {
        this.f2732a = aVar.f2745a;
        this.f2733b = aVar.f2746b;
        this.f2734c = aVar.f2747c;
        this.f2735d = -1;
        this.f2736e = false;
        this.f2737f = false;
        this.f2738g = false;
        this.f2739h = aVar.f2748d;
        this.f2740i = aVar.f2749e;
        this.f2741j = aVar.f2750f;
        this.f2742k = aVar.f2751g;
        this.f2743l = aVar.f2752h;
    }
}
