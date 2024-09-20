package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;

/* renamed from: j$.util.stream.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3012z extends AbstractC2940j2 {

    /* renamed from: b, reason: collision with root package name */
    boolean f32650b;

    /* renamed from: c, reason: collision with root package name */
    C2981s f32651c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3000w f32652d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3012z(C3000w c3000w, InterfaceC2975q2 interfaceC2975q2) {
        super(interfaceC2975q2);
        this.f32652d = c3000w;
        InterfaceC2975q2 interfaceC2975q22 = this.f32552a;
        Objects.requireNonNull(interfaceC2975q22);
        this.f32651c = new C2981s(interfaceC2975q22);
    }

    @Override // j$.util.stream.InterfaceC2960n2, j$.util.stream.InterfaceC2975q2
    public final void accept(double d8) {
        G g8 = (G) ((DoubleFunction) this.f32652d.f32626n).apply(d8);
        if (g8 != null) {
            try {
                boolean z8 = this.f32650b;
                C2981s c2981s = this.f32651c;
                if (z8) {
                    j$.util.W spliterator = g8.sequential().spliterator();
                    while (!this.f32552a.m() && spliterator.tryAdvance((DoubleConsumer) c2981s)) {
                    }
                } else {
                    g8.sequential().forEach(c2981s);
                }
            } catch (Throwable th) {
                try {
                    g8.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (g8 != null) {
            g8.close();
        }
    }

    @Override // j$.util.stream.AbstractC2940j2, j$.util.stream.InterfaceC2975q2
    public final void k(long j8) {
        this.f32552a.k(-1L);
    }

    @Override // j$.util.stream.AbstractC2940j2, j$.util.stream.InterfaceC2975q2
    public final boolean m() {
        this.f32650b = true;
        return this.f32552a.m();
    }
}
