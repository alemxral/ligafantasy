package x3;

import android.content.Context;
import x2.C3875e;

/* renamed from: x3.N, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3892N implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f39274a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f39275b;

    public C3892N(I5.a aVar, I5.a aVar2) {
        this.f39274a = aVar;
        this.f39275b = aVar2;
    }

    public static C3892N a(I5.a aVar, I5.a aVar2) {
        return new C3892N(aVar, aVar2);
    }

    public static C3875e c(Context context, I5.a aVar) {
        return (C3875e) u5.h.d(AbstractC3891M.f39269a.b(context, aVar));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3875e get() {
        return c((Context) this.f39274a.get(), this.f39275b);
    }
}
