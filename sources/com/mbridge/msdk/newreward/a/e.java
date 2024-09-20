package com.mbridge.msdk.newreward.a;

import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: A, reason: collision with root package name */
    private int f20805A;

    /* renamed from: B, reason: collision with root package name */
    private long f20806B;

    /* renamed from: K, reason: collision with root package name */
    private RewardVideoListener f20815K;

    /* renamed from: a, reason: collision with root package name */
    public b f20816a;

    /* renamed from: b, reason: collision with root package name */
    int f20817b;

    /* renamed from: c, reason: collision with root package name */
    private String f20818c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f20819d;

    /* renamed from: e, reason: collision with root package name */
    private int f20820e;

    /* renamed from: f, reason: collision with root package name */
    private int f20821f;

    /* renamed from: g, reason: collision with root package name */
    private int f20822g;

    /* renamed from: h, reason: collision with root package name */
    private int f20823h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f20826k;

    /* renamed from: m, reason: collision with root package name */
    private long f20828m;

    /* renamed from: n, reason: collision with root package name */
    private long f20829n;

    /* renamed from: r, reason: collision with root package name */
    private String f20833r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f20834s;

    /* renamed from: u, reason: collision with root package name */
    private String f20836u;

    /* renamed from: v, reason: collision with root package name */
    private String f20837v;

    /* renamed from: w, reason: collision with root package name */
    private int f20838w;

    /* renamed from: x, reason: collision with root package name */
    private String f20839x;

    /* renamed from: y, reason: collision with root package name */
    private String f20840y;

    /* renamed from: i, reason: collision with root package name */
    private int f20824i = 2;

    /* renamed from: j, reason: collision with root package name */
    private int f20825j = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;

    /* renamed from: l, reason: collision with root package name */
    private boolean f20827l = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20830o = false;

    /* renamed from: p, reason: collision with root package name */
    private int f20831p = 0;

    /* renamed from: q, reason: collision with root package name */
    private int f20832q = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f20835t = false;

    /* renamed from: z, reason: collision with root package name */
    private String f20841z = "";

    /* renamed from: C, reason: collision with root package name */
    private boolean f20807C = false;

    /* renamed from: D, reason: collision with root package name */
    private boolean f20808D = false;

    /* renamed from: E, reason: collision with root package name */
    private boolean f20809E = false;

    /* renamed from: F, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.a f20810F = new com.mbridge.msdk.newreward.function.f.a();

    /* renamed from: G, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.d f20811G = new com.mbridge.msdk.newreward.function.f.d();

    /* renamed from: H, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.e f20812H = new com.mbridge.msdk.newreward.function.f.e();

    /* renamed from: I, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.c f20813I = new com.mbridge.msdk.newreward.function.f.c();

    /* renamed from: J, reason: collision with root package name */
    private int f20814J = 25000;

    public e(boolean z8, int i8, String str, String str2, boolean z9) {
        this.f20819d = z8;
        this.f20838w = i8;
        this.f20836u = str;
        this.f20837v = str2;
        this.f20826k = z9;
    }

    public final String A() {
        return this.f20837v;
    }

    public final boolean B() {
        return this.f20819d;
    }

    public final String C() {
        return this.f20836u;
    }

    public final RewardVideoListener D() {
        return this.f20815K;
    }

    public final int E() {
        return this.f20821f;
    }

    public final int F() {
        if (this.f20819d) {
            return 2;
        }
        return 3;
    }

    public final int G() {
        return this.f20820e;
    }

    public final int H() {
        return this.f20824i;
    }

    public final int I() {
        int i8 = this.f20814J;
        if (i8 <= 0) {
            return 25000;
        }
        return i8;
    }

    public final int J() {
        return this.f20825j;
    }

    public final boolean K() {
        return this.f20826k;
    }

    public final long L() {
        long f8;
        com.mbridge.msdk.newreward.function.f.a aVar = this.f20810F;
        if (aVar != null && aVar.b() != null && this.f20810F.b().n() > 0) {
            return this.f20810F.b().n();
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.mbridge.msdk.videocommon.d.a a8 = this.f20812H.a();
        if (a8 == null) {
            f8 = 3600000;
        } else {
            f8 = a8.f();
        }
        return f8 + currentTimeMillis;
    }

    public final boolean a() {
        return this.f20834s;
    }

    public final String b() {
        return this.f20833r;
    }

    public final void c() {
        this.f20831p++;
    }

    public final void d() {
        this.f20832q++;
    }

    public final boolean e() {
        return this.f20830o;
    }

    public final long f() {
        return this.f20829n;
    }

    public final long g() {
        return this.f20828m;
    }

    public final boolean h() {
        return this.f20827l;
    }

    public final boolean i() {
        return this.f20835t;
    }

    public final int j() {
        return this.f20822g;
    }

    public final int k() {
        return this.f20823h;
    }

    public final boolean l() {
        return this.f20809E;
    }

    public final boolean m() {
        return this.f20808D;
    }

    public final boolean n() {
        return this.f20807C;
    }

    public final long o() {
        return this.f20806B;
    }

    public final int p() {
        return this.f20838w;
    }

    public final String q() {
        return this.f20841z;
    }

    public final com.mbridge.msdk.newreward.function.f.e r() {
        return this.f20812H;
    }

    public final int s() {
        return this.f20805A;
    }

    public final com.mbridge.msdk.newreward.function.f.c t() {
        return this.f20813I;
    }

    public final int u() {
        return this.f20817b;
    }

    public final String v() {
        return this.f20839x;
    }

    public final String w() {
        return this.f20840y;
    }

    public final com.mbridge.msdk.newreward.function.f.a x() {
        return this.f20810F;
    }

    public final com.mbridge.msdk.newreward.function.f.d y() {
        return this.f20811G;
    }

    public final String z() {
        return this.f20818c;
    }

    public final void a(boolean z8) {
        this.f20834s = z8;
    }

    public final void b(boolean z8) {
        this.f20830o = z8;
    }

    public final void c(boolean z8) {
        this.f20827l = z8;
    }

    public final void d(boolean z8) {
        this.f20835t = z8;
    }

    public final void e(boolean z8) {
        this.f20809E = z8;
    }

    public final void f(boolean z8) {
        this.f20808D = z8;
    }

    public final void g(boolean z8) {
        this.f20807C = z8;
    }

    public final void a(String str) {
        this.f20833r = str;
    }

    public final void b(long j8) {
        this.f20828m = j8;
    }

    public final void c(long j8) {
        this.f20806B = j8;
    }

    public final void d(String str) {
        this.f20840y = str;
    }

    public final void e(String str) {
        this.f20818c = str;
    }

    public final void f(int i8) {
        this.f20825j = i8;
    }

    public final void a(long j8) {
        this.f20829n = j8;
    }

    public final void b(String str) {
        this.f20841z = str;
    }

    public final void c(int i8) {
        this.f20817b = i8;
    }

    public final void d(int i8) {
        this.f20824i = i8;
    }

    public final void e(int i8) {
        this.f20814J = i8;
    }

    public final void a(int i8) {
        this.f20820e = i8;
    }

    public final void b(int i8) {
        this.f20805A = i8;
    }

    public final void c(String str) {
        this.f20839x = str;
    }

    public final void a(com.mbridge.msdk.newreward.function.f.e eVar) {
        this.f20812H = eVar;
    }

    public final void a(com.mbridge.msdk.newreward.function.f.a aVar) {
        this.f20810F = aVar;
    }

    public final void a(RewardVideoListener rewardVideoListener) {
        this.f20815K = rewardVideoListener;
    }

    public final void a(int i8, int i9, int i10) {
        this.f20821f = i8;
        this.f20822g = i9;
        this.f20823h = i10;
    }
}
