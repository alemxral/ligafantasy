package j$.util.stream;

/* renamed from: j$.util.stream.t2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2989t2 extends AbstractC2945k2 {

    /* renamed from: b, reason: collision with root package name */
    long f32609b;

    /* renamed from: c, reason: collision with root package name */
    long f32610c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2994u2 f32611d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2989t2(C2994u2 c2994u2, InterfaceC2975q2 interfaceC2975q2) {
        super(interfaceC2975q2);
        this.f32611d = c2994u2;
        this.f32609b = c2994u2.f32615m;
        long j8 = c2994u2.f32616n;
        this.f32610c = j8 < 0 ? Long.MAX_VALUE : j8;
    }

    @Override // j$.util.stream.InterfaceC2965o2, j$.util.stream.InterfaceC2975q2
    public final void accept(int i8) {
        long j8 = this.f32609b;
        if (j8 != 0) {
            this.f32609b = j8 - 1;
            return;
        }
        long j9 = this.f32610c;
        if (j9 > 0) {
            this.f32610c = j9 - 1;
            this.f32555a.accept(i8);
        }
    }

    @Override // j$.util.stream.AbstractC2945k2, j$.util.stream.InterfaceC2975q2
    public final void k(long j8) {
        this.f32555a.k(AbstractC3013z0.A(j8, this.f32611d.f32615m, this.f32610c));
    }

    @Override // j$.util.stream.AbstractC2945k2, j$.util.stream.InterfaceC2975q2
    public final boolean m() {
        return this.f32610c == 0 || this.f32555a.m();
    }
}
