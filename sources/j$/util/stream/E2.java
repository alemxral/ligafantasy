package j$.util.stream;

import java.util.Comparator;

/* loaded from: classes2.dex */
abstract class E2 extends AbstractC2955m2 {

    /* renamed from: b, reason: collision with root package name */
    protected final Comparator f32282b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f32283c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E2(InterfaceC2975q2 interfaceC2975q2, Comparator comparator) {
        super(interfaceC2975q2);
        this.f32282b = comparator;
    }

    @Override // j$.util.stream.AbstractC2955m2, j$.util.stream.InterfaceC2975q2
    public final boolean m() {
        this.f32283c = true;
        return false;
    }
}
