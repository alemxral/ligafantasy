package l5;

/* renamed from: l5.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3332t {

    /* renamed from: a, reason: collision with root package name */
    public static final C3332t f34516a = new C3332t();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f34517b = true;

    /* renamed from: c, reason: collision with root package name */
    private static int f34518c;

    /* renamed from: d, reason: collision with root package name */
    private static int f34519d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f34520e;

    private C3332t() {
    }

    public final int a() {
        return f34518c;
    }

    public final int b() {
        return f34519d;
    }

    public final boolean c() {
        int i8 = f34518c;
        if (i8 == 0) {
            return true;
        }
        if (f34517b && (f34520e || i8 >= 4300)) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        return f34517b;
    }

    public final boolean e() {
        if (f34517b && (f34520e || f34519d >= 9152)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return f34520e;
    }

    public final void g(int i8) {
        f34518c = i8;
    }

    public final void h(boolean z8) {
        f34517b = z8;
    }

    public final void i(int i8) {
        f34519d = i8;
    }

    public final void j(boolean z8) {
        f34520e = z8;
    }
}
