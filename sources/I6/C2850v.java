package i6;

/* renamed from: i6.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2850v extends AbstractC2859z0 implements InterfaceC2848u {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2852w f31791e;

    public C2850v(InterfaceC2852w interfaceC2852w) {
        this.f31791e = interfaceC2852w;
    }

    @Override // i6.InterfaceC2848u
    public boolean b(Throwable th) {
        return s().Q(th);
    }

    @Override // i6.InterfaceC2848u
    public InterfaceC2855x0 getParent() {
        return s();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        r((Throwable) obj);
        return L5.I.f6474a;
    }

    @Override // i6.AbstractC2806E
    public void r(Throwable th) {
        this.f31791e.r(s());
    }
}
