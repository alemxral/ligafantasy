package q;

import L5.I;
import L5.t;

/* renamed from: q.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3641o extends kotlin.coroutines.jvm.internal.l implements X5.n {

    /* renamed from: a, reason: collision with root package name */
    public int f37170a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3639m f37171b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3641o(C3639m c3639m, P5.d dVar) {
        super(2, dVar);
        this.f37171b = c3639m;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new C3641o(this.f37171b, dVar);
    }

    @Override // X5.n
    public Object invoke(Object obj, Object obj2) {
        return new C3641o(this.f37171b, (P5.d) obj2).invokeSuspend(I.f6474a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = Q5.b.e();
        int i8 = this.f37170a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            H7.m mVar = H7.m.f3644a;
            H7.f fVar = H7.f.MSPA;
            int i9 = this.f37171b.f37167d;
            this.f37170a = 1;
            if (mVar.c(fVar, i9, this) == e8) {
                return e8;
            }
        }
        return I.f6474a;
    }
}
