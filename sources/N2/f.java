package N2;

import P5.g;
import r2.InterfaceC3684d;
import u5.h;

/* loaded from: classes4.dex */
public final class f implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f7162a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f7163b;

    public f(I5.a aVar, I5.a aVar2) {
        this.f7162a = aVar;
        this.f7163b = aVar2;
    }

    public static f a(I5.a aVar, I5.a aVar2) {
        return new f(aVar, aVar2);
    }

    public static O3.a c(InterfaceC3684d interfaceC3684d, g gVar) {
        return (O3.a) h.d(e.f7160a.a(interfaceC3684d, gVar));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public O3.a get() {
        return c((InterfaceC3684d) this.f7162a.get(), (g) this.f7163b.get());
    }
}
