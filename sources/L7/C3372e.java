package l7;

import R6.C1347n;
import java.util.HashMap;
import java.util.Map;

/* renamed from: l7.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3372e {

    /* renamed from: h, reason: collision with root package name */
    public static final C3372e f34801h;

    /* renamed from: i, reason: collision with root package name */
    public static final C3372e f34802i;

    /* renamed from: j, reason: collision with root package name */
    public static final C3372e f34803j;

    /* renamed from: k, reason: collision with root package name */
    public static final C3372e f34804k;

    /* renamed from: l, reason: collision with root package name */
    private static final Map f34805l;

    /* renamed from: a, reason: collision with root package name */
    private final int f34806a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34807b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34808c;

    /* renamed from: d, reason: collision with root package name */
    private final int f34809d;

    /* renamed from: e, reason: collision with root package name */
    private final int f34810e;

    /* renamed from: f, reason: collision with root package name */
    private final int f34811f;

    /* renamed from: g, reason: collision with root package name */
    private final C1347n f34812g;

    /* renamed from: l7.e$a */
    /* loaded from: classes5.dex */
    static class a extends HashMap {
        a() {
            C3372e c3372e = C3372e.f34801h;
            put(Integer.valueOf(c3372e.f34806a), c3372e);
            C3372e c3372e2 = C3372e.f34802i;
            put(Integer.valueOf(c3372e2.f34806a), c3372e2);
            C3372e c3372e3 = C3372e.f34803j;
            put(Integer.valueOf(c3372e3.f34806a), c3372e3);
            C3372e c3372e4 = C3372e.f34804k;
            put(Integer.valueOf(c3372e4.f34806a), c3372e4);
        }
    }

    static {
        C1347n c1347n = U6.a.f11771c;
        f34801h = new C3372e(1, 32, 1, 265, 7, 8516, c1347n);
        f34802i = new C3372e(2, 32, 2, 133, 6, 4292, c1347n);
        f34803j = new C3372e(3, 32, 4, 67, 4, 2180, c1347n);
        f34804k = new C3372e(4, 32, 8, 34, 0, 1124, c1347n);
        f34805l = new a();
    }

    protected C3372e(int i8, int i9, int i10, int i11, int i12, int i13, C1347n c1347n) {
        this.f34806a = i8;
        this.f34807b = i9;
        this.f34808c = i10;
        this.f34809d = i11;
        this.f34810e = i12;
        this.f34811f = i13;
        this.f34812g = c1347n;
    }

    public static C3372e e(int i8) {
        return (C3372e) f34805l.get(Integer.valueOf(i8));
    }

    public C1347n b() {
        return this.f34812g;
    }

    public int c() {
        return this.f34807b;
    }

    public int d() {
        return this.f34809d;
    }

    public int f() {
        return this.f34806a;
    }

    public int g() {
        return this.f34808c;
    }
}
