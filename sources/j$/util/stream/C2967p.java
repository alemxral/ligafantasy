package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2967p extends AbstractC2955m2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32580b = 2;

    /* renamed from: c, reason: collision with root package name */
    boolean f32581c;

    /* renamed from: d, reason: collision with root package name */
    Object f32582d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2967p(O3 o32, InterfaceC2975q2 interfaceC2975q2) {
        super(interfaceC2975q2);
        this.f32582d = o32;
        this.f32581c = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2967p(C2920f2 c2920f2, InterfaceC2975q2 interfaceC2975q2) {
        super(interfaceC2975q2);
        this.f32582d = c2920f2;
    }

    public /* synthetic */ C2967p(InterfaceC2975q2 interfaceC2975q2) {
        super(interfaceC2975q2);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f32580b) {
            case 0:
                InterfaceC2975q2 interfaceC2975q2 = this.f32564a;
                if (obj != null) {
                    Object obj2 = this.f32582d;
                    if (obj2 != null && obj.equals(obj2)) {
                        return;
                    }
                } else {
                    if (this.f32581c) {
                        return;
                    }
                    this.f32581c = true;
                    obj = null;
                }
                this.f32582d = obj;
                interfaceC2975q2.accept((InterfaceC2975q2) obj);
                return;
            case 1:
                Stream stream = (Stream) ((C2920f2) this.f32582d).f32526n.apply(obj);
                if (stream != null) {
                    try {
                        boolean z8 = this.f32581c;
                        InterfaceC2975q2 interfaceC2975q22 = this.f32564a;
                        if (z8) {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!interfaceC2975q22.m() && spliterator.tryAdvance(interfaceC2975q22)) {
                            }
                        } else {
                            ((Stream) stream.sequential()).forEach(interfaceC2975q22);
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.f32581c) {
                    boolean test = ((O3) this.f32582d).f32363m.test(obj);
                    this.f32581c = test;
                    if (test) {
                        this.f32564a.accept((InterfaceC2975q2) obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC2955m2, j$.util.stream.InterfaceC2975q2
    public void j() {
        switch (this.f32580b) {
            case 0:
                this.f32581c = false;
                this.f32582d = null;
                this.f32564a.j();
                return;
            default:
                super.j();
                return;
        }
    }

    @Override // j$.util.stream.AbstractC2955m2, j$.util.stream.InterfaceC2975q2
    public final void k(long j8) {
        switch (this.f32580b) {
            case 0:
                this.f32581c = false;
                this.f32582d = null;
                this.f32564a.k(-1L);
                return;
            case 1:
                this.f32564a.k(-1L);
                return;
            default:
                this.f32564a.k(-1L);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC2955m2, j$.util.stream.InterfaceC2975q2
    public boolean m() {
        switch (this.f32580b) {
            case 1:
                this.f32581c = true;
                return this.f32564a.m();
            case 2:
                return !this.f32581c || this.f32564a.m();
            default:
                return super.m();
        }
    }
}
