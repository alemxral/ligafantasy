package x3;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class W implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f39284a;

    public W(I5.a aVar) {
        this.f39284a = aVar;
    }

    public static W a(I5.a aVar) {
        return new W(aVar);
    }

    public static Function0 c(I5.a aVar) {
        return (Function0) u5.h.d(AbstractC3891M.f39269a.k(aVar));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Function0 get() {
        return c(this.f39284a);
    }
}
