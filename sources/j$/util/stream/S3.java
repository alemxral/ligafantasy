package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class S3 extends AbstractC2902c {

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC2897b f32405j;

    /* renamed from: k, reason: collision with root package name */
    private final IntFunction f32406k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f32407l;

    /* renamed from: m, reason: collision with root package name */
    private long f32408m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f32409n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f32410o;

    S3(S3 s32, Spliterator spliterator) {
        super(s32, spliterator);
        this.f32405j = s32.f32405j;
        this.f32406k = s32.f32406k;
        this.f32407l = s32.f32407l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public S3(AbstractC2897b abstractC2897b, AbstractC2897b abstractC2897b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC2897b2, spliterator);
        this.f32405j = abstractC2897b;
        this.f32406k = intFunction;
        this.f32407l = EnumC2916e3.ORDERED.r(abstractC2897b2.G());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC2912e
    public final Object a() {
        D0 J8 = this.f32494a.J(-1L, this.f32406k);
        InterfaceC2975q2 N8 = this.f32405j.N(this.f32494a.G(), J8);
        AbstractC2897b abstractC2897b = this.f32494a;
        boolean x8 = abstractC2897b.x(this.f32495b, abstractC2897b.S(N8));
        this.f32409n = x8;
        if (x8) {
            i();
        }
        L0 a8 = J8.a();
        this.f32408m = a8.count();
        return a8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC2912e
    public final AbstractC2912e e(Spliterator spliterator) {
        return new S3(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC2902c
    protected final void h() {
        this.f32480i = true;
        if (this.f32407l && this.f32410o) {
            f(AbstractC3013z0.L(this.f32405j.E()));
        }
    }

    @Override // j$.util.stream.AbstractC2902c
    protected final Object j() {
        return AbstractC3013z0.L(this.f32405j.E());
    }

    @Override // j$.util.stream.AbstractC2912e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        Object I8;
        Object c8;
        AbstractC2912e abstractC2912e = this.f32497d;
        if (abstractC2912e != null) {
            this.f32409n = ((S3) abstractC2912e).f32409n | ((S3) this.f32498e).f32409n;
            if (this.f32407l && this.f32480i) {
                this.f32408m = 0L;
                I8 = AbstractC3013z0.L(this.f32405j.E());
            } else {
                if (this.f32407l) {
                    S3 s32 = (S3) this.f32497d;
                    if (s32.f32409n) {
                        this.f32408m = s32.f32408m;
                        I8 = (L0) s32.c();
                    }
                }
                S3 s33 = (S3) this.f32497d;
                long j8 = s33.f32408m;
                S3 s34 = (S3) this.f32498e;
                this.f32408m = j8 + s34.f32408m;
                if (s33.f32408m == 0) {
                    c8 = s34.c();
                } else if (s34.f32408m == 0) {
                    c8 = s33.c();
                } else {
                    I8 = AbstractC3013z0.I(this.f32405j.E(), (L0) ((S3) this.f32497d).c(), (L0) ((S3) this.f32498e).c());
                }
                I8 = (L0) c8;
            }
            f(I8);
        }
        this.f32410o = true;
        super.onCompletion(countedCompleter);
    }
}
