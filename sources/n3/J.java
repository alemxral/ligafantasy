package n3;

import l3.AbstractC3176f;
import l3.C3184n;

/* loaded from: classes4.dex */
public final class J implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I f35988a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f35989b;

    public J(I i8, I5.a aVar) {
        this.f35988a = i8;
        this.f35989b = aVar;
    }

    public static J a(I i8, I5.a aVar) {
        return new J(i8, aVar);
    }

    public static AbstractC3176f c(I i8, C3184n c3184n) {
        return (AbstractC3176f) u5.h.d(i8.a(c3184n));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC3176f get() {
        return c(this.f35988a, (C3184n) this.f35989b.get());
    }
}
