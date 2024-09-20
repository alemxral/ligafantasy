package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2893a0 extends AbstractC2945k2 {

    /* renamed from: b, reason: collision with root package name */
    boolean f32461b;

    /* renamed from: c, reason: collision with root package name */
    W f32462c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Y f32463d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2893a0(Y y8, InterfaceC2975q2 interfaceC2975q2) {
        super(interfaceC2975q2);
        this.f32463d = y8;
        InterfaceC2975q2 interfaceC2975q22 = this.f32555a;
        Objects.requireNonNull(interfaceC2975q22);
        this.f32462c = new W(interfaceC2975q22);
    }

    @Override // j$.util.stream.InterfaceC2965o2, j$.util.stream.InterfaceC2975q2
    public final void accept(int i8) {
        IntStream intStream = (IntStream) ((IntFunction) this.f32463d.f32447n).apply(i8);
        if (intStream != null) {
            try {
                boolean z8 = this.f32461b;
                W w8 = this.f32462c;
                if (z8) {
                    j$.util.Z spliterator = intStream.sequential().spliterator();
                    while (!this.f32555a.m() && spliterator.tryAdvance((IntConsumer) w8)) {
                    }
                } else {
                    intStream.sequential().forEach(w8);
                }
            } catch (Throwable th) {
                try {
                    intStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.AbstractC2945k2, j$.util.stream.InterfaceC2975q2
    public final void k(long j8) {
        this.f32555a.k(-1L);
    }

    @Override // j$.util.stream.AbstractC2945k2, j$.util.stream.InterfaceC2975q2
    public final boolean m() {
        this.f32461b = true;
        return this.f32555a.m();
    }
}
