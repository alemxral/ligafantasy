package t7;

import R6.C1347n;

/* loaded from: classes5.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private final w f38296a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38297b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38298c;

    /* renamed from: d, reason: collision with root package name */
    private final int f38299d;

    /* renamed from: e, reason: collision with root package name */
    private final int f38300e;

    /* renamed from: f, reason: collision with root package name */
    private final int f38301f;

    /* renamed from: g, reason: collision with root package name */
    private final C1347n f38302g;

    /* JADX INFO: Access modifiers changed from: protected */
    public m(C1347n c1347n) {
        if (c1347n != null) {
            this.f38302g = c1347n;
            Y6.e a8 = f.a(c1347n);
            int h8 = A.h(a8);
            this.f38297b = h8;
            this.f38298c = 16;
            int ceil = (int) Math.ceil((h8 * 8) / A.o(16));
            this.f38300e = ceil;
            int floor = ((int) Math.floor(A.o((16 - 1) * ceil) / A.o(16))) + 1;
            this.f38301f = floor;
            int i8 = ceil + floor;
            this.f38299d = i8;
            l c8 = l.c(a8.e(), h8, 16, i8);
            this.f38296a = c8;
            if (c8 != null) {
                return;
            }
            throw new IllegalArgumentException("cannot find OID for digest algorithm: " + a8.e());
        }
        throw new NullPointerException("treeDigest == null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a() {
        return this.f38299d;
    }

    public C1347n b() {
        return this.f38302g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int c() {
        return this.f38297b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int d() {
        return this.f38298c;
    }
}
