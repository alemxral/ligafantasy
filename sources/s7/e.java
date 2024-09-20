package s7;

import R6.C1347n;
import R6.Y;
import Z6.g;
import Z6.j;
import Z6.k;
import java.util.HashMap;
import java.util.Map;
import k7.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    static final X6.a f38016a;

    /* renamed from: b, reason: collision with root package name */
    static final X6.a f38017b;

    /* renamed from: c, reason: collision with root package name */
    static final X6.a f38018c;

    /* renamed from: d, reason: collision with root package name */
    static final X6.a f38019d;

    /* renamed from: e, reason: collision with root package name */
    static final X6.a f38020e;

    /* renamed from: f, reason: collision with root package name */
    static final X6.a f38021f;

    /* renamed from: g, reason: collision with root package name */
    static final X6.a f38022g;

    /* renamed from: h, reason: collision with root package name */
    static final X6.a f38023h;

    /* renamed from: i, reason: collision with root package name */
    static final Map f38024i;

    static {
        C1347n c1347n = k7.e.f33662X;
        f38016a = new X6.a(c1347n);
        C1347n c1347n2 = k7.e.f33663Y;
        f38017b = new X6.a(c1347n2);
        f38018c = new X6.a(U6.a.f11785j);
        f38019d = new X6.a(U6.a.f11781h);
        f38020e = new X6.a(U6.a.f11771c);
        f38021f = new X6.a(U6.a.f11775e);
        f38022g = new X6.a(U6.a.f11791m);
        f38023h = new X6.a(U6.a.f11793n);
        HashMap hashMap = new HashMap();
        f38024i = hashMap;
        hashMap.put(c1347n, E7.d.a(5));
        hashMap.put(c1347n2, E7.d.a(6));
    }

    public static X6.a a(String str) {
        if (str.equals("SHA-1")) {
            return new X6.a(V6.a.f11933i, Y.f8783a);
        }
        if (str.equals("SHA-224")) {
            return new X6.a(U6.a.f11777f);
        }
        if (str.equals("SHA-256")) {
            return new X6.a(U6.a.f11771c);
        }
        if (str.equals("SHA-384")) {
            return new X6.a(U6.a.f11773d);
        }
        if (str.equals("SHA-512")) {
            return new X6.a(U6.a.f11775e);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Y6.e b(C1347n c1347n) {
        if (c1347n.r(U6.a.f11771c)) {
            return new g();
        }
        if (c1347n.r(U6.a.f11775e)) {
            return new j();
        }
        if (c1347n.r(U6.a.f11791m)) {
            return new k(128);
        }
        if (c1347n.r(U6.a.f11793n)) {
            return new k(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + c1347n);
    }

    public static String c(C1347n c1347n) {
        if (c1347n.r(V6.a.f11933i)) {
            return "SHA-1";
        }
        if (c1347n.r(U6.a.f11777f)) {
            return "SHA-224";
        }
        if (c1347n.r(U6.a.f11771c)) {
            return "SHA-256";
        }
        if (c1347n.r(U6.a.f11773d)) {
            return "SHA-384";
        }
        if (c1347n.r(U6.a.f11775e)) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + c1347n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static X6.a d(int i8) {
        if (i8 != 5) {
            if (i8 == 6) {
                return f38017b;
            }
            throw new IllegalArgumentException("unknown security category: " + i8);
        }
        return f38016a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(X6.a aVar) {
        return ((Integer) f38024i.get(aVar.m())).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static X6.a f(String str) {
        if (str.equals("SHA3-256")) {
            return f38018c;
        }
        if (str.equals("SHA-512/256")) {
            return f38019d;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g(h hVar) {
        X6.a p8 = hVar.p();
        if (p8.m().r(f38018c.m())) {
            return "SHA3-256";
        }
        if (p8.m().r(f38019d.m())) {
            return "SHA-512/256";
        }
        throw new IllegalArgumentException("unknown tree digest: " + p8.m());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static X6.a h(String str) {
        if (str.equals("SHA-256")) {
            return f38020e;
        }
        if (str.equals("SHA-512")) {
            return f38021f;
        }
        if (str.equals("SHAKE128")) {
            return f38022g;
        }
        if (str.equals("SHAKE256")) {
            return f38023h;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }
}
