package m3;

import P5.g;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import e3.m;
import r2.InterfaceC3684d;
import x2.InterfaceC3864B;
import x2.InterfaceC3873c;

/* renamed from: m3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3397b implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f34906a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f34907b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f34908c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f34909d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.a f34910e;

    /* renamed from: f, reason: collision with root package name */
    private final I5.a f34911f;

    public C3397b(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6) {
        this.f34906a = aVar;
        this.f34907b = aVar2;
        this.f34908c = aVar3;
        this.f34909d = aVar4;
        this.f34910e = aVar5;
        this.f34911f = aVar6;
    }

    public static C3397b a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6) {
        return new C3397b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static C3396a c(m mVar, InterfaceC3873c interfaceC3873c, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, InterfaceC3864B interfaceC3864B, InterfaceC3684d interfaceC3684d, g gVar) {
        return new C3396a(mVar, interfaceC3873c, paymentAnalyticsRequestFactory, interfaceC3864B, interfaceC3684d, gVar);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3396a get() {
        return c((m) this.f34906a.get(), (InterfaceC3873c) this.f34907b.get(), (PaymentAnalyticsRequestFactory) this.f34908c.get(), (InterfaceC3864B) this.f34909d.get(), (InterfaceC3684d) this.f34910e.get(), (g) this.f34911f.get());
    }
}
