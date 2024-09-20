package s5;

import H7.m;
import L5.I;
import L5.t;
import X5.n;

/* loaded from: classes5.dex */
public final class j extends kotlin.coroutines.jvm.internal.l implements n {

    /* renamed from: a, reason: collision with root package name */
    public int f37996a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f37997b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, P5.d dVar) {
        super(2, dVar);
        this.f37997b = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new j(this.f37997b, dVar);
    }

    @Override // X5.n
    public Object invoke(Object obj, Object obj2) {
        return new j(this.f37997b, (P5.d) obj2).invokeSuspend(I.f6474a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = Q5.b.e();
        int i8 = this.f37996a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            m mVar = m.f3644a;
            H7.f fVar = H7.f.GDPR;
            int i9 = this.f37997b.f38009l;
            this.f37996a = 1;
            if (mVar.c(fVar, i9, this) == e8) {
                return e8;
            }
        }
        return I.f6474a;
    }
}
