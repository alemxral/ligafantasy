package O1;

import j$.util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class x extends g {

    /* renamed from: d, reason: collision with root package name */
    public static final Set f7744d;

    /* renamed from: e, reason: collision with root package name */
    public static final Set f7745e = l.f7731a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(K1.i.f5739d);
        linkedHashSet.add(K1.i.f5740e);
        linkedHashSet.add(K1.i.f5741f);
        linkedHashSet.add(K1.i.f5742g);
        linkedHashSet.add(K1.i.f5743h);
        f7744d = DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public x() {
        super(f7744d, l.f7731a);
    }

    @Override // O1.g, K1.o
    public /* bridge */ /* synthetic */ Set c() {
        return super.c();
    }

    @Override // O1.g, K1.o
    public /* bridge */ /* synthetic */ Set f() {
        return super.f();
    }

    @Override // O1.g
    public /* bridge */ /* synthetic */ Q1.c g() {
        return super.g();
    }
}
