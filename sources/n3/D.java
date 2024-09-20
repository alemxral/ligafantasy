package n3;

import android.content.Context;

/* loaded from: classes4.dex */
public final class D implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f35985a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f35986b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f35987c;

    public D(I5.a aVar, I5.a aVar2, I5.a aVar3) {
        this.f35985a = aVar;
        this.f35986b = aVar2;
        this.f35987c = aVar3;
    }

    public static D a(I5.a aVar, I5.a aVar2, I5.a aVar3) {
        return new D(aVar, aVar2, aVar3);
    }

    public static W3.a c(Context context, boolean z8, P5.g gVar) {
        return (W3.a) u5.h.d(AbstractC3453B.f35983a.b(context, z8, gVar));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public W3.a get() {
        return c((Context) this.f35985a.get(), ((Boolean) this.f35986b.get()).booleanValue(), (P5.g) this.f35987c.get());
    }
}
