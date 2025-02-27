package v7;

import R6.Y;
import e7.AbstractC2649a;

/* loaded from: classes5.dex */
abstract class g {
    /* JADX INFO: Access modifiers changed from: package-private */
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
    public static Y6.e b(X6.a aVar) {
        if (aVar.m().r(V6.a.f11933i)) {
            return AbstractC2649a.b();
        }
        if (aVar.m().r(U6.a.f11777f)) {
            return AbstractC2649a.c();
        }
        if (aVar.m().r(U6.a.f11771c)) {
            return AbstractC2649a.d();
        }
        if (aVar.m().r(U6.a.f11773d)) {
            return AbstractC2649a.e();
        }
        if (aVar.m().r(U6.a.f11775e)) {
            return AbstractC2649a.j();
        }
        throw new IllegalArgumentException("unrecognised OID in digest algorithm identifier: " + aVar.m());
    }
}
