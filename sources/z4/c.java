package Z4;

import a5.InterfaceC1575a;

/* loaded from: classes5.dex */
public final class c extends kotlin.coroutines.jvm.internal.d {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC1575a f13397a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13398b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f13399c;

    /* renamed from: d, reason: collision with root package name */
    public int f13400d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, P5.d dVar) {
        super(dVar);
        this.f13399c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f13398b = obj;
        this.f13400d |= Integer.MIN_VALUE;
        return a.b(this.f13399c, null, null, this);
    }
}
