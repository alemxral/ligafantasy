package j$.time.temporal;

import j$.util.Objects;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class n {

    /* renamed from: a, reason: collision with root package name */
    static final t f32016a = new s(0);

    /* renamed from: b, reason: collision with root package name */
    static final t f32017b = new s(1);

    /* renamed from: c, reason: collision with root package name */
    static final t f32018c = new s(2);

    /* renamed from: d, reason: collision with root package name */
    static final t f32019d = new s(3);

    /* renamed from: e, reason: collision with root package name */
    static final t f32020e = new s(4);

    /* renamed from: f, reason: collision with root package name */
    static final t f32021f = new s(5);

    /* renamed from: g, reason: collision with root package name */
    static final t f32022g = new s(6);

    public static int a(o oVar, r rVar) {
        w m8 = oVar.m(rVar);
        if (!m8.h()) {
            throw new RuntimeException("Invalid field " + rVar + " for get() method, use getLong() instead");
        }
        long r8 = oVar.r(rVar);
        if (m8.i(r8)) {
            return (int) r8;
        }
        throw new RuntimeException("Invalid value for " + rVar + " (valid values " + m8 + "): " + r8);
    }

    public static m b(m mVar, long j8, u uVar) {
        long j9;
        if (j8 == Long.MIN_VALUE) {
            mVar = mVar.e(Long.MAX_VALUE, uVar);
            j9 = 1;
        } else {
            j9 = -j8;
        }
        return mVar.e(j9, uVar);
    }

    public static Object c(o oVar, t tVar) {
        if (tVar == f32016a || tVar == f32017b || tVar == f32018c) {
            return null;
        }
        return tVar.a(oVar);
    }

    public static w d(o oVar, r rVar) {
        if (!(rVar instanceof a)) {
            Objects.requireNonNull(rVar, "field");
            return rVar.u(oVar);
        }
        if (oVar.f(rVar)) {
            return ((a) rVar).j();
        }
        throw new RuntimeException(j$.time.d.a("Unsupported field: ", rVar));
    }

    public static t e() {
        return f32017b;
    }

    public static t f() {
        return f32021f;
    }

    public static t g() {
        return f32022g;
    }

    public static t h() {
        return f32019d;
    }

    public static t i() {
        return f32018c;
    }

    public static t j() {
        return f32020e;
    }

    public static t k() {
        return f32016a;
    }
}
