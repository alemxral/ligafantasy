package j$.util.stream;

/* loaded from: classes2.dex */
final class P3 extends AbstractC2955m2 {

    /* renamed from: b, reason: collision with root package name */
    long f32371b;

    /* renamed from: c, reason: collision with root package name */
    boolean f32372c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f32373d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Q3 f32374e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P3(Q3 q32, InterfaceC2975q2 interfaceC2975q2, boolean z8) {
        super(interfaceC2975q2);
        this.f32374e = q32;
        this.f32373d = z8;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z8 = true;
        if (!this.f32372c) {
            boolean z9 = !this.f32374e.f32381m.test(obj);
            this.f32372c = z9;
            if (!z9) {
                z8 = false;
            }
        }
        boolean z10 = this.f32373d;
        if (z10 && !z8) {
            this.f32371b++;
        }
        if (z10 || z8) {
            this.f32564a.accept((InterfaceC2975q2) obj);
        }
    }
}
