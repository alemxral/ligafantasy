package O1;

import j$.util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class z extends h {

    /* renamed from: c, reason: collision with root package name */
    public static final Set f7746c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(K1.p.f5814g);
        linkedHashSet.add(K1.p.f5815h);
        linkedHashSet.add(K1.p.f5816i);
        linkedHashSet.add(K1.p.f5821n);
        linkedHashSet.add(K1.p.f5822o);
        linkedHashSet.add(K1.p.f5823p);
        f7746c = DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public z() {
        super(f7746c);
    }
}
