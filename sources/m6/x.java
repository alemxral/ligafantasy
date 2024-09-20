package m6;

/* loaded from: classes5.dex */
final class x implements P5.d, kotlin.coroutines.jvm.internal.e {

    /* renamed from: a, reason: collision with root package name */
    private final P5.d f35933a;

    /* renamed from: b, reason: collision with root package name */
    private final P5.g f35934b;

    public x(P5.d dVar, P5.g gVar) {
        this.f35933a = dVar;
        this.f35934b = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        P5.d dVar = this.f35933a;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // P5.d
    public P5.g getContext() {
        return this.f35934b;
    }

    @Override // P5.d
    public void resumeWith(Object obj) {
        this.f35933a.resumeWith(obj);
    }
}
