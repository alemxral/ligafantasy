package R1;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.net.URI;
import java.security.KeyStore;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class j extends d {

    /* renamed from: q, reason: collision with root package name */
    public static final Set f8681q = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(a.f8619i, a.f8620j, a.f8621k, a.f8622l)));

    /* renamed from: l, reason: collision with root package name */
    private final a f8682l;

    /* renamed from: m, reason: collision with root package name */
    private final Z1.c f8683m;

    /* renamed from: n, reason: collision with root package name */
    private final byte[] f8684n;

    /* renamed from: o, reason: collision with root package name */
    private final Z1.c f8685o;

    /* renamed from: p, reason: collision with root package name */
    private final byte[] f8686p;

    public j(a aVar, Z1.c cVar, h hVar, Set set, K1.a aVar2, String str, URI uri, Z1.c cVar2, Z1.c cVar3, List list, KeyStore keyStore) {
        super(g.f8674f, hVar, set, aVar2, str, uri, cVar2, cVar3, list, keyStore);
        if (aVar != null) {
            if (f8681q.contains(aVar)) {
                this.f8682l = aVar;
                if (cVar != null) {
                    this.f8683m = cVar;
                    this.f8684n = cVar.a();
                    this.f8685o = null;
                    this.f8686p = null;
                    return;
                }
                throw new IllegalArgumentException("The 'x' parameter must not be null");
            }
            throw new IllegalArgumentException("Unknown / unsupported curve: " + aVar);
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    public static j p(Map map) {
        g gVar = g.f8674f;
        if (gVar.equals(e.d(map))) {
            try {
                a e8 = a.e(Z1.k.h(map, "crv"));
                Z1.c a8 = Z1.k.a(map, "x");
                Z1.c a9 = Z1.k.a(map, "d");
                try {
                    if (a9 == null) {
                        return new j(e8, a8, e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), null);
                    }
                    return new j(e8, a8, a9, e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), null);
                } catch (IllegalArgumentException e9) {
                    throw new ParseException(e9.getMessage(), 0);
                }
            } catch (IllegalArgumentException e10) {
                throw new ParseException(e10.getMessage(), 0);
            }
        }
        throw new ParseException("The key type kty must be " + gVar.a(), 0);
    }

    @Override // R1.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j) || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        if (Objects.equals(this.f8682l, jVar.f8682l) && Objects.equals(this.f8683m, jVar.f8683m) && Arrays.equals(this.f8684n, jVar.f8684n) && Objects.equals(this.f8685o, jVar.f8685o) && Arrays.equals(this.f8686p, jVar.f8686p)) {
            return true;
        }
        return false;
    }

    @Override // R1.d
    public int hashCode() {
        return (((Objects.hash(Integer.valueOf(super.hashCode()), this.f8682l, this.f8683m, this.f8685o) * 31) + Arrays.hashCode(this.f8684n)) * 31) + Arrays.hashCode(this.f8686p);
    }

    @Override // R1.d
    public boolean l() {
        if (this.f8685o != null) {
            return true;
        }
        return false;
    }

    @Override // R1.d
    public Map n() {
        Map n8 = super.n();
        n8.put("crv", this.f8682l.toString());
        n8.put("x", this.f8683m.toString());
        Z1.c cVar = this.f8685o;
        if (cVar != null) {
            n8.put("d", cVar.toString());
        }
        return n8;
    }

    public j(a aVar, Z1.c cVar, Z1.c cVar2, h hVar, Set set, K1.a aVar2, String str, URI uri, Z1.c cVar3, Z1.c cVar4, List list, KeyStore keyStore) {
        super(g.f8674f, hVar, set, aVar2, str, uri, cVar3, cVar4, list, keyStore);
        if (aVar != null) {
            if (f8681q.contains(aVar)) {
                this.f8682l = aVar;
                if (cVar != null) {
                    this.f8683m = cVar;
                    this.f8684n = cVar.a();
                    if (cVar2 != null) {
                        this.f8685o = cVar2;
                        this.f8686p = cVar2.a();
                        return;
                    }
                    throw new IllegalArgumentException("The 'd' parameter must not be null");
                }
                throw new IllegalArgumentException("The 'x' parameter must not be null");
            }
            throw new IllegalArgumentException("Unknown / unsupported curve: " + aVar);
        }
        throw new IllegalArgumentException("The curve must not be null");
    }
}
