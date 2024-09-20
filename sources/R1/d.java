package R1;

import Z1.n;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.Serializable;
import java.net.URI;
import java.security.KeyStore;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final g f8650a;

    /* renamed from: b, reason: collision with root package name */
    private final h f8651b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f8652c;

    /* renamed from: d, reason: collision with root package name */
    private final K1.a f8653d;

    /* renamed from: e, reason: collision with root package name */
    private final String f8654e;

    /* renamed from: f, reason: collision with root package name */
    private final URI f8655f;

    /* renamed from: g, reason: collision with root package name */
    private final Z1.c f8656g;

    /* renamed from: h, reason: collision with root package name */
    private final Z1.c f8657h;

    /* renamed from: i, reason: collision with root package name */
    private final List f8658i;

    /* renamed from: j, reason: collision with root package name */
    private final List f8659j;

    /* renamed from: k, reason: collision with root package name */
    private final KeyStore f8660k;

    /* JADX INFO: Access modifiers changed from: protected */
    public d(g gVar, h hVar, Set set, K1.a aVar, String str, URI uri, Z1.c cVar, Z1.c cVar2, List list, KeyStore keyStore) {
        if (gVar != null) {
            this.f8650a = gVar;
            if (i.a(hVar, set)) {
                this.f8651b = hVar;
                this.f8652c = set;
                this.f8653d = aVar;
                this.f8654e = str;
                this.f8655f = uri;
                this.f8656g = cVar;
                this.f8657h = cVar2;
                if (list != null && list.isEmpty()) {
                    throw new IllegalArgumentException("The X.509 certificate chain \"x5c\" must not be empty");
                }
                this.f8658i = list;
                try {
                    this.f8659j = n.a(list);
                    this.f8660k = keyStore;
                    return;
                } catch (ParseException e8) {
                    throw new IllegalArgumentException("Invalid X.509 certificate chain \"x5c\": " + e8.getMessage(), e8);
                }
            }
            throw new IllegalArgumentException("The key use \"use\" and key options \"key_ops\" parameters are not consistent, see RFC 7517, section 4.3");
        }
        throw new IllegalArgumentException("The key type \"kty\" parameter must not be null");
    }

    public static d m(Map map) {
        String h8 = Z1.k.h(map, "kty");
        if (h8 != null) {
            g b8 = g.b(h8);
            if (b8 == g.f8671c) {
                return b.y(map);
            }
            if (b8 == g.f8672d) {
                return l.q(map);
            }
            if (b8 == g.f8673e) {
                return k.p(map);
            }
            if (b8 == g.f8674f) {
                return j.p(map);
            }
            throw new ParseException("Unsupported key type \"kty\" parameter: " + b8, 0);
        }
        throw new ParseException("Missing key type \"kty\" parameter", 0);
    }

    public K1.a a() {
        return this.f8653d;
    }

    public String b() {
        return this.f8654e;
    }

    public Set c() {
        return this.f8652c;
    }

    public KeyStore d() {
        return this.f8660k;
    }

    public h e() {
        return this.f8651b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (Objects.equals(this.f8650a, dVar.f8650a) && Objects.equals(this.f8651b, dVar.f8651b) && Objects.equals(this.f8652c, dVar.f8652c) && Objects.equals(this.f8653d, dVar.f8653d) && Objects.equals(this.f8654e, dVar.f8654e) && Objects.equals(this.f8655f, dVar.f8655f) && Objects.equals(this.f8656g, dVar.f8656g) && Objects.equals(this.f8657h, dVar.f8657h) && Objects.equals(this.f8658i, dVar.f8658i) && Objects.equals(this.f8660k, dVar.f8660k)) {
            return true;
        }
        return false;
    }

    public List f() {
        List list = this.f8659j;
        if (list == null) {
            return null;
        }
        return DesugarCollections.unmodifiableList(list);
    }

    public List g() {
        List list = this.f8658i;
        if (list == null) {
            return null;
        }
        return DesugarCollections.unmodifiableList(list);
    }

    public Z1.c h() {
        return this.f8657h;
    }

    public int hashCode() {
        return Objects.hash(this.f8650a, this.f8651b, this.f8652c, this.f8653d, this.f8654e, this.f8655f, this.f8656g, this.f8657h, this.f8658i, this.f8660k);
    }

    public Z1.c j() {
        return this.f8656g;
    }

    public URI k() {
        return this.f8655f;
    }

    public abstract boolean l();

    public Map n() {
        Map l8 = Z1.k.l();
        l8.put("kty", this.f8650a.a());
        h hVar = this.f8651b;
        if (hVar != null) {
            l8.put("use", hVar.a());
        }
        if (this.f8652c != null) {
            List a8 = Z1.j.a();
            Iterator it = this.f8652c.iterator();
            while (it.hasNext()) {
                a8.add(((f) it.next()).a());
            }
            l8.put("key_ops", a8);
        }
        K1.a aVar = this.f8653d;
        if (aVar != null) {
            l8.put("alg", aVar.a());
        }
        String str = this.f8654e;
        if (str != null) {
            l8.put("kid", str);
        }
        URI uri = this.f8655f;
        if (uri != null) {
            l8.put("x5u", uri.toString());
        }
        Z1.c cVar = this.f8656g;
        if (cVar != null) {
            l8.put("x5t", cVar.toString());
        }
        Z1.c cVar2 = this.f8657h;
        if (cVar2 != null) {
            l8.put("x5t#S256", cVar2.toString());
        }
        if (this.f8658i != null) {
            List a9 = Z1.j.a();
            Iterator it2 = this.f8658i.iterator();
            while (it2.hasNext()) {
                a9.add(((Z1.a) it2.next()).toString());
            }
            l8.put("x5c", a9);
        }
        return l8;
    }

    public String o() {
        return Z1.k.o(n());
    }

    public String toString() {
        return Z1.k.o(n());
    }
}
