package k3;

import x2.C3875e;
import x2.InterfaceC3873c;

/* loaded from: classes4.dex */
public final class k implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f33436a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f33437b;

    public k(I5.a aVar, I5.a aVar2) {
        this.f33436a = aVar;
        this.f33437b = aVar2;
    }

    public static k a(I5.a aVar, I5.a aVar2) {
        return new k(aVar, aVar2);
    }

    public static j c(InterfaceC3873c interfaceC3873c, C3875e c3875e) {
        return new j(interfaceC3873c, c3875e);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c((InterfaceC3873c) this.f33436a.get(), (C3875e) this.f33437b.get());
    }
}
