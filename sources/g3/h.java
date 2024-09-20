package G3;

import android.content.Context;
import j2.r;

/* loaded from: classes4.dex */
public final class h implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f3191a;

    public h(I5.a aVar) {
        this.f3191a = aVar;
    }

    public static h a(I5.a aVar) {
        return new h(aVar);
    }

    public static r c(Context context) {
        return (r) u5.h.d(g.f3188a.a(context));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.f3191a.get());
    }
}
