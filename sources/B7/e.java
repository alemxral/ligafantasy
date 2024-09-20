package B7;

import R6.C1347n;

/* loaded from: classes5.dex */
abstract class e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1347n a(String str) {
        if (str.equals("SHA-256")) {
            return U6.a.f11771c;
        }
        if (str.equals("SHA-512")) {
            return U6.a.f11775e;
        }
        if (str.equals("SHAKE128")) {
            return U6.a.f11791m;
        }
        if (str.equals("SHAKE256")) {
            return U6.a.f11793n;
        }
        throw new IllegalArgumentException("unrecognized digest: " + str);
    }
}
