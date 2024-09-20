package i6;

/* renamed from: i6.e0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C2818e0 extends AbstractC2833m {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2816d0 f31750a;

    public C2818e0(InterfaceC2816d0 interfaceC2816d0) {
        this.f31750a = interfaceC2816d0;
    }

    @Override // i6.AbstractC2835n
    public void a(Throwable th) {
        this.f31750a.dispose();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return L5.I.f6474a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f31750a + ']';
    }
}
