package J2;

import com.stripe.android.googlepaylauncher.h;
import s0.C3723m;

/* loaded from: classes4.dex */
public final class k implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f4753a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f4754b;

    public k(I5.a aVar, I5.a aVar2) {
        this.f4753a = aVar;
        this.f4754b = aVar2;
    }

    public static k a(I5.a aVar, I5.a aVar2) {
        return new k(aVar, aVar2);
    }

    public static C3723m c(h.d dVar, I2.h hVar) {
        return (C3723m) u5.h.d(j.f4752a.a(dVar, hVar));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3723m get() {
        return c((h.d) this.f4753a.get(), (I2.h) this.f4754b.get());
    }
}
