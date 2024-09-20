package R1;

import K1.p;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.Serializable;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class a implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final a f8614d = new a("P-256", "secp256r1", "1.2.840.10045.3.1.7");

    /* renamed from: e, reason: collision with root package name */
    public static final a f8615e = new a("secp256k1", "secp256k1", "1.3.132.0.10");

    /* renamed from: f, reason: collision with root package name */
    public static final a f8616f = new a("P-256K", "secp256k1", "1.3.132.0.10");

    /* renamed from: g, reason: collision with root package name */
    public static final a f8617g = new a("P-384", "secp384r1", "1.3.132.0.34");

    /* renamed from: h, reason: collision with root package name */
    public static final a f8618h = new a("P-521", "secp521r1", "1.3.132.0.35");

    /* renamed from: i, reason: collision with root package name */
    public static final a f8619i = new a("Ed25519", "Ed25519", null);

    /* renamed from: j, reason: collision with root package name */
    public static final a f8620j = new a("Ed448", "Ed448", null);

    /* renamed from: k, reason: collision with root package name */
    public static final a f8621k = new a("X25519", "X25519", null);

    /* renamed from: l, reason: collision with root package name */
    public static final a f8622l = new a("X448", "X448", null);

    /* renamed from: a, reason: collision with root package name */
    private final String f8623a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8624b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8625c;

    public a(String str) {
        this(str, null, null);
    }

    public static a a(ECParameterSpec eCParameterSpec) {
        return c.a(eCParameterSpec);
    }

    public static Set b(p pVar) {
        if (p.f5817j.equals(pVar)) {
            return Collections.singleton(f8614d);
        }
        if (p.f5818k.equals(pVar)) {
            return Collections.singleton(f8615e);
        }
        if (p.f5819l.equals(pVar)) {
            return Collections.singleton(f8617g);
        }
        if (p.f5820m.equals(pVar)) {
            return Collections.singleton(f8618h);
        }
        if (p.f5824q.equals(pVar)) {
            return DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(f8619i, f8620j)));
        }
        return null;
    }

    public static a e(String str) {
        if (str != null && !str.trim().isEmpty()) {
            a aVar = f8614d;
            if (str.equals(aVar.c())) {
                return aVar;
            }
            a aVar2 = f8616f;
            if (str.equals(aVar2.c())) {
                return aVar2;
            }
            a aVar3 = f8615e;
            if (str.equals(aVar3.c())) {
                return aVar3;
            }
            a aVar4 = f8617g;
            if (str.equals(aVar4.c())) {
                return aVar4;
            }
            a aVar5 = f8618h;
            if (str.equals(aVar5.c())) {
                return aVar5;
            }
            a aVar6 = f8619i;
            if (str.equals(aVar6.c())) {
                return aVar6;
            }
            a aVar7 = f8620j;
            if (str.equals(aVar7.c())) {
                return aVar7;
            }
            a aVar8 = f8621k;
            if (str.equals(aVar8.c())) {
                return aVar8;
            }
            a aVar9 = f8622l;
            if (str.equals(aVar9.c())) {
                return aVar9;
            }
            return new a(str);
        }
        throw new IllegalArgumentException("The cryptographic curve string must not be null or empty");
    }

    public String c() {
        return this.f8623a;
    }

    public String d() {
        return this.f8624b;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof a) && toString().equals(obj.toString())) {
            return true;
        }
        return false;
    }

    public ECParameterSpec f() {
        return c.b(this);
    }

    public int hashCode() {
        return Objects.hash(c());
    }

    public String toString() {
        return c();
    }

    public a(String str, String str2, String str3) {
        if (str != null) {
            this.f8623a = str;
            this.f8624b = str2;
            this.f8625c = str3;
            return;
        }
        throw new IllegalArgumentException("The JOSE cryptographic curve name must not be null");
    }
}
