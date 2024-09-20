package j4;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: j4.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3085k {

    /* renamed from: a, reason: collision with root package name */
    public static final C3085k f33215a = new C3085k();

    /* renamed from: b, reason: collision with root package name */
    private static C3082h f33216b;

    /* renamed from: c, reason: collision with root package name */
    private static C3082h f33217c;

    /* renamed from: d, reason: collision with root package name */
    private static C3084j f33218d;

    /* renamed from: e, reason: collision with root package name */
    private static n f33219e;

    /* renamed from: f, reason: collision with root package name */
    private static C3077c f33220f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f33221g;

    static {
        C3086l c3086l = C3086l.f33222a;
        f33216b = c3086l.b();
        f33217c = c3086l.c();
        f33218d = c3086l.e();
        f33219e = c3086l.f();
        f33220f = c3086l.d();
        f33221g = 8;
    }

    private C3085k() {
    }

    public final C3082h a(boolean z8) {
        if (z8) {
            return f33216b;
        }
        return f33217c;
    }

    public final C3077c b() {
        return f33220f;
    }

    public final C3084j c() {
        return f33218d;
    }

    public final n d() {
        return f33219e;
    }

    public final void e(C3082h c3082h) {
        AbstractC3159y.i(c3082h, "<set-?>");
        f33216b = c3082h;
    }

    public final void f(C3082h c3082h) {
        AbstractC3159y.i(c3082h, "<set-?>");
        f33217c = c3082h;
    }

    public final void g(C3077c c3077c) {
        AbstractC3159y.i(c3077c, "<set-?>");
        f33220f = c3077c;
    }

    public final void h(C3084j c3084j) {
        AbstractC3159y.i(c3084j, "<set-?>");
        f33218d = c3084j;
    }

    public final void i(n nVar) {
        AbstractC3159y.i(nVar, "<set-?>");
        f33219e = nVar;
    }
}
