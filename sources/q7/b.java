package Q7;

import L5.I;
import L5.t;

/* loaded from: classes5.dex */
public final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

    /* renamed from: a, reason: collision with root package name */
    public int f8372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f8373b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, P5.d dVar) {
        super(2, dVar);
        this.f8373b = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new b(this.f8373b, dVar);
    }

    @Override // X5.n
    public Object invoke(Object obj, Object obj2) {
        return new b(this.f8373b, (P5.d) obj2).invokeSuspend(I.f6474a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = Q5.b.e();
        int i8 = this.f8372a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            L7.a aVar = this.f8373b.f8374a;
            this.f8372a = 1;
            obj = aVar.a(this);
            if (obj == e8) {
                return e8;
            }
        }
        return obj;
    }
}
