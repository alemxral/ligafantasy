package Z4;

import L5.I;
import L5.t;
import X5.n;
import a5.InterfaceC1575a;
import android.content.Context;
import c5.C1929d;
import d5.C2556a;
import i6.M;
import kotlin.coroutines.jvm.internal.l;

/* loaded from: classes5.dex */
public final class b extends l implements n {

    /* renamed from: a, reason: collision with root package name */
    public int f13393a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f13394b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13395c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1575a f13396d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, String str, InterfaceC1575a interfaceC1575a, P5.d dVar) {
        super(2, dVar);
        this.f13394b = aVar;
        this.f13395c = str;
        this.f13396d = interfaceC1575a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new b(this.f13394b, this.f13395c, this.f13396d, dVar);
    }

    @Override // X5.n
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((M) obj, (P5.d) obj2)).invokeSuspend(I.f6474a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        Object e8 = Q5.b.e();
        int i8 = this.f13393a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            context = this.f13394b.f13392a;
            C1929d b8 = new C2556a(context).b(this.f13395c);
            a aVar = this.f13394b;
            InterfaceC1575a interfaceC1575a = this.f13396d;
            this.f13393a = 1;
            if (a.b(aVar, b8, interfaceC1575a, this) == e8) {
                return e8;
            }
        }
        return I.f6474a;
    }
}
