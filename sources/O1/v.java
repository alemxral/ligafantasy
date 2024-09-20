package O1;

import j$.util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class v extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final Set f7742d;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f7743c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(K1.p.f5811d);
        linkedHashSet.add(K1.p.f5812e);
        linkedHashSet.add(K1.p.f5813f);
        f7742d = DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public v(byte[] bArr, Set set) {
        super(set);
        if (bArr.length >= 32) {
            this.f7743c = bArr;
            return;
        }
        throw new K1.u("The secret length must be at least 256 bits");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String h(K1.p pVar) {
        if (pVar.equals(K1.p.f5811d)) {
            return "HMACSHA256";
        }
        if (pVar.equals(K1.p.f5812e)) {
            return "HMACSHA384";
        }
        if (pVar.equals(K1.p.f5813f)) {
            return "HMACSHA512";
        }
        throw new K1.f(e.d(pVar, f7742d));
    }

    public byte[] i() {
        return this.f7743c;
    }
}
