package O1;

import j$.util.DesugarCollections;
import java.util.Set;

/* loaded from: classes4.dex */
abstract class g implements K1.o {

    /* renamed from: a, reason: collision with root package name */
    private final Set f7720a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f7721b;

    /* renamed from: c, reason: collision with root package name */
    private final Q1.c f7722c = new Q1.c();

    public g(Set set, Set set2) {
        if (set != null) {
            this.f7720a = DesugarCollections.unmodifiableSet(set);
            if (set2 != null) {
                this.f7721b = set2;
                return;
            }
            throw new IllegalArgumentException("The supported encryption methods must not be null");
        }
        throw new IllegalArgumentException("The supported JWE algorithm set must not be null");
    }

    @Override // K1.o
    public Set c() {
        return this.f7721b;
    }

    @Override // K1.o
    public Set f() {
        return this.f7720a;
    }

    public Q1.c g() {
        return this.f7722c;
    }
}
