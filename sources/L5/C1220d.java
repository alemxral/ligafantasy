package L5;

import L5.s;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: L5.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1220d extends AbstractC1219c implements P5.d {

    /* renamed from: a, reason: collision with root package name */
    private X5.o f6479a;

    /* renamed from: b, reason: collision with root package name */
    private Object f6480b;

    /* renamed from: c, reason: collision with root package name */
    private P5.d f6481c;

    /* renamed from: d, reason: collision with root package name */
    private Object f6482d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1220d(X5.o block, Object obj) {
        super(null);
        Object obj2;
        AbstractC3159y.i(block, "block");
        this.f6479a = block;
        this.f6480b = obj;
        AbstractC3159y.g(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f6481c = this;
        obj2 = AbstractC1218b.f6478a;
        this.f6482d = obj2;
    }

    @Override // L5.AbstractC1219c
    public Object a(Object obj, P5.d dVar) {
        AbstractC3159y.g(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f6481c = dVar;
        this.f6480b = obj;
        Object e8 = Q5.b.e();
        if (e8 == Q5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return e8;
    }

    public final Object c() {
        Object obj;
        Object obj2;
        Object invoke;
        while (true) {
            Object obj3 = this.f6482d;
            P5.d dVar = this.f6481c;
            if (dVar != null) {
                obj = AbstractC1218b.f6478a;
                if (!s.d(obj, obj3)) {
                    obj2 = AbstractC1218b.f6478a;
                    this.f6482d = obj2;
                    dVar.resumeWith(obj3);
                } else {
                    try {
                        X5.o oVar = this.f6479a;
                        Object obj4 = this.f6480b;
                        if (!(oVar instanceof kotlin.coroutines.jvm.internal.a)) {
                            invoke = Q5.b.d(oVar, this, obj4, dVar);
                        } else {
                            invoke = ((X5.o) Z.d(oVar, 3)).invoke(this, obj4, dVar);
                        }
                        if (invoke != Q5.b.e()) {
                            dVar.resumeWith(s.b(invoke));
                        }
                    } catch (Throwable th) {
                        s.a aVar = s.f6498b;
                        dVar.resumeWith(s.b(t.a(th)));
                    }
                }
            } else {
                t.b(obj3);
                return obj3;
            }
        }
    }

    @Override // P5.d
    public P5.g getContext() {
        return P5.h.f7981a;
    }

    @Override // P5.d
    public void resumeWith(Object obj) {
        this.f6481c = null;
        this.f6482d = obj;
    }
}
