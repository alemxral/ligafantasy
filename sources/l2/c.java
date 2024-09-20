package L2;

import k3.i;

/* loaded from: classes4.dex */
public final class c implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f6093a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f6094b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f6095c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f6096d;

    public c(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4) {
        this.f6093a = aVar;
        this.f6094b = aVar2;
        this.f6095c = aVar3;
        this.f6096d = aVar4;
    }

    public static c a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4) {
        return new c(aVar, aVar2, aVar3, aVar4);
    }

    public static b c(K2.d dVar, P2.c cVar, M2.e eVar, i iVar) {
        return new b(dVar, cVar, eVar, iVar);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c((K2.d) this.f6093a.get(), (P2.c) this.f6094b.get(), (M2.e) this.f6095c.get(), (i) this.f6096d.get());
    }
}
