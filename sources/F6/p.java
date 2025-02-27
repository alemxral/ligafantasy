package F6;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final C f2916a;

    /* renamed from: b, reason: collision with root package name */
    private final g f2917b;

    /* renamed from: c, reason: collision with root package name */
    private final List f2918c;

    /* renamed from: d, reason: collision with root package name */
    private final List f2919d;

    private p(C c8, g gVar, List list, List list2) {
        this.f2916a = c8;
        this.f2917b = gVar;
        this.f2918c = list;
        this.f2919d = list2;
    }

    public static p b(C c8, g gVar, List list, List list2) {
        if (c8 != null) {
            if (gVar != null) {
                return new p(c8, gVar, G6.c.q(list), G6.c.q(list2));
            }
            throw new NullPointerException("cipherSuite == null");
        }
        throw new NullPointerException("tlsVersion == null");
    }

    public static p c(SSLSession sSLSession) {
        Certificate[] certificateArr;
        List emptyList;
        List emptyList2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            g a8 = g.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol != null) {
                C a9 = C.a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    emptyList = G6.c.r(certificateArr);
                } else {
                    emptyList = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    emptyList2 = G6.c.r(localCertificates);
                } else {
                    emptyList2 = Collections.emptyList();
                }
                return new p(a9, a8, emptyList, emptyList2);
            }
            throw new IllegalStateException("tlsVersion == null");
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    public g a() {
        return this.f2917b;
    }

    public List d() {
        return this.f2919d;
    }

    public List e() {
        return this.f2918c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!this.f2916a.equals(pVar.f2916a) || !this.f2917b.equals(pVar.f2917b) || !this.f2918c.equals(pVar.f2918c) || !this.f2919d.equals(pVar.f2919d)) {
            return false;
        }
        return true;
    }

    public C f() {
        return this.f2916a;
    }

    public int hashCode() {
        return ((((((527 + this.f2916a.hashCode()) * 31) + this.f2917b.hashCode()) * 31) + this.f2918c.hashCode()) * 31) + this.f2919d.hashCode();
    }
}
