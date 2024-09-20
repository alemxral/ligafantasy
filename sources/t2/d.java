package T2;

import r2.InterfaceC3684d;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f9760a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f9761b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f9762c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f9763d;

    public d(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4) {
        this.f9760a = aVar;
        this.f9761b = aVar2;
        this.f9762c = aVar3;
        this.f9763d = aVar4;
    }

    public static d a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4) {
        return new d(aVar, aVar2, aVar3, aVar4);
    }

    public static c c(k kVar, K2.d dVar, L2.b bVar, M2.e eVar, InterfaceC3684d interfaceC3684d) {
        return new c(kVar, dVar, bVar, eVar, interfaceC3684d);
    }

    public c b(k kVar) {
        return c(kVar, (K2.d) this.f9760a.get(), (L2.b) this.f9761b.get(), (M2.e) this.f9762c.get(), (InterfaceC3684d) this.f9763d.get());
    }
}
