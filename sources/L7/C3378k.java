package l7;

import R6.C1347n;
import java.util.HashMap;
import java.util.Map;

/* renamed from: l7.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3378k {

    /* renamed from: e, reason: collision with root package name */
    public static final C3378k f34837e;

    /* renamed from: f, reason: collision with root package name */
    public static final C3378k f34838f;

    /* renamed from: g, reason: collision with root package name */
    public static final C3378k f34839g;

    /* renamed from: h, reason: collision with root package name */
    public static final C3378k f34840h;

    /* renamed from: i, reason: collision with root package name */
    public static final C3378k f34841i;

    /* renamed from: j, reason: collision with root package name */
    private static Map f34842j;

    /* renamed from: a, reason: collision with root package name */
    private final int f34843a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34844b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34845c;

    /* renamed from: d, reason: collision with root package name */
    private final C1347n f34846d;

    /* renamed from: l7.k$a */
    /* loaded from: classes5.dex */
    static class a extends HashMap {
        a() {
            C3378k c3378k = C3378k.f34837e;
            put(Integer.valueOf(c3378k.f34843a), c3378k);
            C3378k c3378k2 = C3378k.f34838f;
            put(Integer.valueOf(c3378k2.f34843a), c3378k2);
            C3378k c3378k3 = C3378k.f34839g;
            put(Integer.valueOf(c3378k3.f34843a), c3378k3);
            C3378k c3378k4 = C3378k.f34840h;
            put(Integer.valueOf(c3378k4.f34843a), c3378k4);
            C3378k c3378k5 = C3378k.f34841i;
            put(Integer.valueOf(c3378k5.f34843a), c3378k5);
        }
    }

    static {
        C1347n c1347n = U6.a.f11771c;
        f34837e = new C3378k(5, 32, 5, c1347n);
        f34838f = new C3378k(6, 32, 10, c1347n);
        f34839g = new C3378k(7, 32, 15, c1347n);
        f34840h = new C3378k(8, 32, 20, c1347n);
        f34841i = new C3378k(9, 32, 25, c1347n);
        f34842j = new a();
    }

    protected C3378k(int i8, int i9, int i10, C1347n c1347n) {
        this.f34843a = i8;
        this.f34844b = i9;
        this.f34845c = i10;
        this.f34846d = c1347n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C3378k e(int i8) {
        return (C3378k) f34842j.get(Integer.valueOf(i8));
    }

    public C1347n b() {
        return this.f34846d;
    }

    public int c() {
        return this.f34845c;
    }

    public int d() {
        return this.f34844b;
    }

    public int f() {
        return this.f34843a;
    }
}
