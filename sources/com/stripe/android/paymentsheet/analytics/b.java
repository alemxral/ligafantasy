package com.stripe.android.paymentsheet.analytics;

import A2.d;
import P5.g;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import u5.e;
import x2.InterfaceC3873c;

/* loaded from: classes4.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f25732a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f25733b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f25734c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f25735d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.a f25736e;

    public b(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5) {
        this.f25732a = aVar;
        this.f25733b = aVar2;
        this.f25734c = aVar3;
        this.f25735d = aVar4;
        this.f25736e = aVar5;
    }

    public static b a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5) {
        return new b(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static a c(EventReporter.Mode mode, InterfaceC3873c interfaceC3873c, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, d dVar, g gVar) {
        return new a(mode, interfaceC3873c, paymentAnalyticsRequestFactory, dVar, gVar);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c((EventReporter.Mode) this.f25732a.get(), (InterfaceC3873c) this.f25733b.get(), (PaymentAnalyticsRequestFactory) this.f25734c.get(), (d) this.f25735d.get(), (g) this.f25736e.get());
    }
}
