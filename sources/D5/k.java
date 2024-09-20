package D5;

import L5.I;
import L5.t;
import L7.u;
import X5.n;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class k extends kotlin.coroutines.jvm.internal.l implements n {

    /* renamed from: a, reason: collision with root package name */
    public Object f1860a;

    /* renamed from: b, reason: collision with root package name */
    public int f1861b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f1862c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f1863d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Function1 function1, l lVar, P5.d dVar) {
        super(2, dVar);
        this.f1862c = function1;
        this.f1863d = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new k(this.f1862c, this.f1863d, dVar);
    }

    @Override // X5.n
    public Object invoke(Object obj, Object obj2) {
        return new k(this.f1862c, this.f1863d, (P5.d) obj2).invokeSuspend(I.f6474a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        Object e8 = Q5.b.e();
        int i8 = this.f1861b;
        if (i8 != 0) {
            if (i8 == 1) {
                function1 = (Function1) this.f1860a;
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            Function1 function12 = this.f1862c;
            u uVar = this.f1863d.f1868e;
            this.f1860a = function12;
            this.f1861b = 1;
            Object a8 = uVar.a(this);
            if (a8 == e8) {
                return e8;
            }
            function1 = function12;
            obj = a8;
        }
        function1.invoke(obj);
        return I.f6474a;
    }
}
