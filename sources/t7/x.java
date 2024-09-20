package t7;

import R6.C1347n;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: i, reason: collision with root package name */
    private static final Map f38346i;

    /* renamed from: a, reason: collision with root package name */
    private final w f38347a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38348b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38349c;

    /* renamed from: d, reason: collision with root package name */
    private final C1347n f38350d;

    /* renamed from: e, reason: collision with root package name */
    private final int f38351e;

    /* renamed from: f, reason: collision with root package name */
    private final String f38352f;

    /* renamed from: g, reason: collision with root package name */
    private final int f38353g;

    /* renamed from: h, reason: collision with root package name */
    private final m f38354h;

    static {
        HashMap hashMap = new HashMap();
        Integer a8 = E7.d.a(1);
        C1347n c1347n = U6.a.f11771c;
        hashMap.put(a8, new x(10, c1347n));
        hashMap.put(E7.d.a(2), new x(16, c1347n));
        hashMap.put(E7.d.a(3), new x(20, c1347n));
        Integer a9 = E7.d.a(4);
        C1347n c1347n2 = U6.a.f11775e;
        hashMap.put(a9, new x(10, c1347n2));
        hashMap.put(E7.d.a(5), new x(16, c1347n2));
        hashMap.put(E7.d.a(6), new x(20, c1347n2));
        Integer a10 = E7.d.a(7);
        C1347n c1347n3 = U6.a.f11791m;
        hashMap.put(a10, new x(10, c1347n3));
        hashMap.put(E7.d.a(8), new x(16, c1347n3));
        hashMap.put(E7.d.a(9), new x(20, c1347n3));
        Integer a11 = E7.d.a(10);
        C1347n c1347n4 = U6.a.f11793n;
        hashMap.put(a11, new x(10, c1347n4));
        hashMap.put(E7.d.a(11), new x(16, c1347n4));
        hashMap.put(E7.d.a(12), new x(20, c1347n4));
        f38346i = DesugarCollections.unmodifiableMap(hashMap);
    }

    public x(int i8, C1347n c1347n) {
        if (i8 < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if (c1347n == null) {
            throw new NullPointerException("digest == null");
        }
        this.f38348b = i8;
        this.f38349c = a();
        String b8 = f.b(c1347n);
        this.f38352f = b8;
        this.f38350d = c1347n;
        m mVar = new m(c1347n);
        this.f38354h = mVar;
        int c8 = mVar.c();
        this.f38353g = c8;
        int d8 = mVar.d();
        this.f38351e = d8;
        this.f38347a = e.c(b8, c8, d8, mVar.a(), i8);
    }

    private int a() {
        int i8 = 2;
        while (true) {
            int i9 = this.f38348b;
            if (i8 <= i9) {
                if ((i9 - i8) % 2 == 0) {
                    return i8;
                }
                i8++;
            } else {
                throw new IllegalStateException("should never happen...");
            }
        }
    }

    public static x k(int i8) {
        return (x) f38346i.get(E7.d.a(i8));
    }

    public int b() {
        return this.f38348b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f38349c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f38354h.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w e() {
        return this.f38347a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String f() {
        return this.f38352f;
    }

    public C1347n g() {
        return this.f38350d;
    }

    public int h() {
        return this.f38353g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k i() {
        return new k(this.f38354h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f38351e;
    }

    public x(int i8, Y6.e eVar) {
        this(i8, f.c(eVar.e()));
    }
}
