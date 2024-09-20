package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class R3 extends AbstractC2912e {

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC2897b f32392h;

    /* renamed from: i, reason: collision with root package name */
    private final IntFunction f32393i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f32394j;

    /* renamed from: k, reason: collision with root package name */
    private long f32395k;

    /* renamed from: l, reason: collision with root package name */
    private long f32396l;

    R3(R3 r32, Spliterator spliterator) {
        super(r32, spliterator);
        this.f32392h = r32.f32392h;
        this.f32393i = r32.f32393i;
        this.f32394j = r32.f32394j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public R3(AbstractC2897b abstractC2897b, AbstractC2897b abstractC2897b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC2897b2, spliterator);
        this.f32392h = abstractC2897b;
        this.f32393i = intFunction;
        this.f32394j = EnumC2916e3.ORDERED.r(abstractC2897b2.G());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC2912e
    public final Object a() {
        boolean z8 = !d();
        D0 J8 = this.f32494a.J((z8 && this.f32394j && EnumC2916e3.SIZED.u(this.f32392h.f32468c)) ? this.f32392h.C(this.f32495b) : -1L, this.f32393i);
        Q3 q32 = (Q3) this.f32392h;
        boolean z9 = this.f32394j && z8;
        q32.getClass();
        P3 p32 = new P3(q32, J8, z9);
        this.f32494a.R(this.f32495b, p32);
        L0 a8 = J8.a();
        this.f32395k = a8.count();
        this.f32396l = p32.f32371b;
        return a8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC2912e
    public final AbstractC2912e e(Spliterator spliterator) {
        return new R3(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC2912e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        L0 I8;
        Object c8;
        L0 l02;
        AbstractC2912e abstractC2912e = this.f32497d;
        if (abstractC2912e != null) {
            if (this.f32394j) {
                R3 r32 = (R3) abstractC2912e;
                long j8 = r32.f32396l;
                this.f32396l = j8;
                if (j8 == r32.f32395k) {
                    this.f32396l = j8 + ((R3) this.f32498e).f32396l;
                }
            }
            R3 r33 = (R3) abstractC2912e;
            long j9 = r33.f32395k;
            R3 r34 = (R3) this.f32498e;
            this.f32395k = j9 + r34.f32395k;
            if (r33.f32395k == 0) {
                c8 = r34.c();
            } else if (r34.f32395k == 0) {
                c8 = r33.c();
            } else {
                I8 = AbstractC3013z0.I(this.f32392h.E(), (L0) ((R3) this.f32497d).c(), (L0) ((R3) this.f32498e).c());
                l02 = I8;
                if (d() && this.f32394j) {
                    l02 = l02.g(this.f32396l, l02.count(), this.f32393i);
                }
                f(l02);
            }
            I8 = (L0) c8;
            l02 = I8;
            if (d()) {
                l02 = l02.g(this.f32396l, l02.count(), this.f32393i);
            }
            f(l02);
        }
        super.onCompletion(countedCompleter);
    }
}
