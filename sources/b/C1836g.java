package b;

import L5.I;
import L5.t;
import X5.n;

/* renamed from: b.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1836g extends kotlin.coroutines.jvm.internal.l implements n {

    /* renamed from: a, reason: collision with root package name */
    public int f14198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1841l f14199b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1836g(C1841l c1841l, P5.d dVar) {
        super(2, dVar);
        this.f14199b = c1841l;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new C1836g(this.f14199b, dVar);
    }

    @Override // X5.n
    public Object invoke(Object obj, Object obj2) {
        return new C1836g(this.f14199b, (P5.d) obj2).invokeSuspend(I.f6474a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = Q5.b.e();
        int i8 = this.f14198a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            L7.k kVar = this.f14199b.f14218j;
            this.f14198a = 1;
            obj = kVar.a(this);
            if (obj == e8) {
                return e8;
            }
        }
        return obj;
    }
}
