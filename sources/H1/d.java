package h1;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f31339b;

    /* renamed from: a, reason: collision with root package name */
    private final Set f31340a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f31339b;
        if (dVar == null) {
            synchronized (d.class) {
                try {
                    dVar = f31339b;
                    if (dVar == null) {
                        dVar = new d();
                        f31339b = dVar;
                    }
                } finally {
                }
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set b() {
        Set unmodifiableSet;
        synchronized (this.f31340a) {
            unmodifiableSet = DesugarCollections.unmodifiableSet(this.f31340a);
        }
        return unmodifiableSet;
    }
}
