package m6;

import P5.g;

/* loaded from: classes5.dex */
public final class l implements P5.g {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f35915a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ P5.g f35916b;

    public l(Throwable th, P5.g gVar) {
        this.f35915a = th;
        this.f35916b = gVar;
    }

    @Override // P5.g
    public Object fold(Object obj, X5.n nVar) {
        return this.f35916b.fold(obj, nVar);
    }

    @Override // P5.g
    public g.b get(g.c cVar) {
        return this.f35916b.get(cVar);
    }

    @Override // P5.g
    public P5.g minusKey(g.c cVar) {
        return this.f35916b.minusKey(cVar);
    }

    @Override // P5.g
    public P5.g plus(P5.g gVar) {
        return this.f35916b.plus(gVar);
    }
}
