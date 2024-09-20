package i6;

import kotlin.jvm.functions.Function1;

/* renamed from: i6.u0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C2849u0 extends AbstractC2833m {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f31790a;

    public C2849u0(Function1 function1) {
        this.f31790a = function1;
    }

    @Override // i6.AbstractC2835n
    public void a(Throwable th) {
        this.f31790a.invoke(th);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return L5.I.f6474a;
    }

    public String toString() {
        return "InvokeOnCancel[" + Q.a(this.f31790a) + '@' + Q.b(this) + ']';
    }
}
