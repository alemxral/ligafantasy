package H3;

import e3.m;
import java.util.Set;
import k3.i;
import r2.InterfaceC3684d;

/* loaded from: classes4.dex */
public final class b implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f3477a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f3478b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f3479c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f3480d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.a f3481e;

    /* renamed from: f, reason: collision with root package name */
    private final I5.a f3482f;

    public b(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6) {
        this.f3477a = aVar;
        this.f3478b = aVar2;
        this.f3479c = aVar3;
        this.f3480d = aVar4;
        this.f3481e = aVar5;
        this.f3482f = aVar6;
    }

    public static b a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6) {
        return new b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static a c(m mVar, I5.a aVar, InterfaceC3684d interfaceC3684d, i iVar, P5.g gVar, Set set) {
        return new a(mVar, aVar, interfaceC3684d, iVar, gVar, set);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c((m) this.f3477a.get(), this.f3478b, (InterfaceC3684d) this.f3479c.get(), (i) this.f3480d.get(), (P5.g) this.f3481e.get(), (Set) this.f3482f.get());
    }
}
