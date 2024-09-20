package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;

/* renamed from: j$.util.stream.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2933i0 extends AbstractC2950l2 {

    /* renamed from: b, reason: collision with root package name */
    boolean f32545b;

    /* renamed from: c, reason: collision with root package name */
    C2913e0 f32546c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2938j0 f32547d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2933i0(C2938j0 c2938j0, InterfaceC2975q2 interfaceC2975q2) {
        super(interfaceC2975q2);
        this.f32547d = c2938j0;
        InterfaceC2975q2 interfaceC2975q22 = this.f32559a;
        Objects.requireNonNull(interfaceC2975q22);
        this.f32546c = new C2913e0(interfaceC2975q22);
    }

    @Override // j$.util.stream.InterfaceC2970p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        InterfaceC2968p0 interfaceC2968p0 = (InterfaceC2968p0) ((LongFunction) this.f32547d.f32551n).apply(j8);
        if (interfaceC2968p0 != null) {
            try {
                boolean z8 = this.f32545b;
                C2913e0 c2913e0 = this.f32546c;
                if (z8) {
                    j$.util.c0 spliterator = interfaceC2968p0.sequential().spliterator();
                    while (!this.f32559a.m() && spliterator.tryAdvance((LongConsumer) c2913e0)) {
                    }
                } else {
                    interfaceC2968p0.sequential().forEach(c2913e0);
                }
            } catch (Throwable th) {
                try {
                    interfaceC2968p0.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC2968p0 != null) {
            interfaceC2968p0.close();
        }
    }

    @Override // j$.util.stream.AbstractC2950l2, j$.util.stream.InterfaceC2975q2
    public final void k(long j8) {
        this.f32559a.k(-1L);
    }

    @Override // j$.util.stream.AbstractC2950l2, j$.util.stream.InterfaceC2975q2
    public final boolean m() {
        this.f32545b = true;
        return this.f32559a.m();
    }
}
