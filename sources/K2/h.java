package K2;

import N2.a;
import com.stripe.android.link.LinkActivityContract;

/* loaded from: classes4.dex */
public final class h implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f5898a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f5899b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f5900c;

    public h(I5.a aVar, I5.a aVar2, I5.a aVar3) {
        this.f5898a = aVar;
        this.f5899b = aVar2;
        this.f5900c = aVar3;
    }

    public static h a(I5.a aVar, I5.a aVar2, I5.a aVar3) {
        return new h(aVar, aVar2, aVar3);
    }

    public static com.stripe.android.link.a c(a.InterfaceC0151a interfaceC0151a, LinkActivityContract linkActivityContract, L2.d dVar) {
        return new com.stripe.android.link.a(interfaceC0151a, linkActivityContract, dVar);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.link.a get() {
        return c((a.InterfaceC0151a) this.f5898a.get(), (LinkActivityContract) this.f5899b.get(), (L2.d) this.f5900c.get());
    }
}
