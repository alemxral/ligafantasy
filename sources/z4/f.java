package Z4;

import L5.I;
import L5.t;
import X5.n;
import a5.InterfaceC1575a;
import kotlin.coroutines.jvm.internal.l;

/* loaded from: classes5.dex */
public final class f extends l implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1575a f13403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13404b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InterfaceC1575a interfaceC1575a, String str, P5.d dVar) {
        super(2, dVar);
        this.f13403a = interfaceC1575a;
        this.f13404b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new f(this.f13403a, this.f13404b, dVar);
    }

    @Override // X5.n
    public final Object invoke(Object obj, Object obj2) {
        return new f(this.f13403a, this.f13404b, (P5.d) obj2).invokeSuspend(I.f6474a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Q5.b.e();
        t.b(obj);
        this.f13403a.a(this.f13404b);
        return I.f6474a;
    }
}
