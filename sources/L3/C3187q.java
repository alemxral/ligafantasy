package l3;

import android.content.Context;

/* renamed from: l3.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3187q implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f33932a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f33933b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f33934c;

    public C3187q(I5.a aVar, I5.a aVar2, I5.a aVar3) {
        this.f33932a = aVar;
        this.f33933b = aVar2;
        this.f33934c = aVar3;
    }

    public static C3187q a(I5.a aVar, I5.a aVar2, I5.a aVar3) {
        return new C3187q(aVar, aVar2, aVar3);
    }

    public static C3186p c(C3189s c3189s, C3174d c3174d, Context context) {
        return new C3186p(c3189s, c3174d, context);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3186p get() {
        return c((C3189s) this.f33932a.get(), (C3174d) this.f33933b.get(), (Context) this.f33934c.get());
    }
}
