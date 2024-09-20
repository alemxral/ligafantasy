package j$.util.stream;

/* renamed from: j$.util.stream.r2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2979r2 extends AbstractC2955m2 {

    /* renamed from: b, reason: collision with root package name */
    long f32598b;

    /* renamed from: c, reason: collision with root package name */
    long f32599c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2984s2 f32600d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2979r2(C2984s2 c2984s2, InterfaceC2975q2 interfaceC2975q2) {
        super(interfaceC2975q2);
        this.f32600d = c2984s2;
        this.f32598b = c2984s2.f32602m;
        long j8 = c2984s2.f32603n;
        this.f32599c = j8 < 0 ? Long.MAX_VALUE : j8;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        long j8 = this.f32598b;
        if (j8 != 0) {
            this.f32598b = j8 - 1;
            return;
        }
        long j9 = this.f32599c;
        if (j9 > 0) {
            this.f32599c = j9 - 1;
            this.f32564a.o((InterfaceC2975q2) obj);
        }
    }

    @Override // j$.util.stream.AbstractC2955m2, j$.util.stream.InterfaceC2975q2
    public final void k(long j8) {
        this.f32564a.k(AbstractC3013z0.A(j8, this.f32600d.f32602m, this.f32599c));
    }

    @Override // j$.util.stream.AbstractC2955m2, j$.util.stream.InterfaceC2975q2
    public final boolean m() {
        return this.f32599c == 0 || this.f32564a.m();
    }
}
