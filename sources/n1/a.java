package N1;

import K1.q;
import K1.s;
import L1.c;
import L1.d;
import L1.f;
import O1.r;
import O1.v;
import O1.z;
import Q1.b;
import j$.util.DesugarCollections;
import java.security.Key;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public class a implements Q1.a {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f7157b;

    /* renamed from: a, reason: collision with root package name */
    private final b f7158a = new b();

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(v.f7742d);
        linkedHashSet.addAll(z.f7746c);
        linkedHashSet.addAll(r.f7737c);
        f7157b = DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    @Override // Q1.a
    public b e() {
        return this.f7158a;
    }

    public s g(q qVar, Key key) {
        s cVar;
        if (v.f7742d.contains(qVar.t())) {
            if (key instanceof SecretKey) {
                cVar = new d((SecretKey) key);
            } else {
                throw new K1.v(SecretKey.class);
            }
        } else if (z.f7746c.contains(qVar.t())) {
            if (key instanceof RSAPublicKey) {
                cVar = new f((RSAPublicKey) key);
            } else {
                throw new K1.v(RSAPublicKey.class);
            }
        } else if (r.f7737c.contains(qVar.t())) {
            if (key instanceof ECPublicKey) {
                cVar = new c((ECPublicKey) key);
            } else {
                throw new K1.v(ECPublicKey.class);
            }
        } else {
            throw new K1.f("Unsupported JWS algorithm: " + qVar.t());
        }
        cVar.e().c(this.f7158a.a());
        return cVar;
    }
}
