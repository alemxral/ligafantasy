package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class A2 extends AbstractC2902c {

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC2897b f32255j;

    /* renamed from: k, reason: collision with root package name */
    private final IntFunction f32256k;

    /* renamed from: l, reason: collision with root package name */
    private final long f32257l;

    /* renamed from: m, reason: collision with root package name */
    private final long f32258m;

    /* renamed from: n, reason: collision with root package name */
    private long f32259n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f32260o;

    A2(A2 a22, Spliterator spliterator) {
        super(a22, spliterator);
        this.f32255j = a22.f32255j;
        this.f32256k = a22.f32256k;
        this.f32257l = a22.f32257l;
        this.f32258m = a22.f32258m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public A2(AbstractC2897b abstractC2897b, AbstractC2897b abstractC2897b2, Spliterator spliterator, IntFunction intFunction, long j8, long j9) {
        super(abstractC2897b2, spliterator);
        this.f32255j = abstractC2897b;
        this.f32256k = intFunction;
        this.f32257l = j8;
        this.f32258m = j9;
    }

    private long k(long j8) {
        if (this.f32260o) {
            return this.f32259n;
        }
        A2 a22 = (A2) this.f32497d;
        A2 a23 = (A2) this.f32498e;
        if (a22 == null || a23 == null) {
            return this.f32259n;
        }
        long k8 = a22.k(j8);
        return k8 >= j8 ? k8 : k8 + a23.k(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC2912e
    public final Object a() {
        if (d()) {
            D0 J8 = this.f32255j.J(EnumC2916e3.SIZED.u(this.f32255j.f32468c) ? this.f32255j.C(this.f32495b) : -1L, this.f32256k);
            InterfaceC2975q2 N8 = this.f32255j.N(this.f32494a.G(), J8);
            AbstractC2897b abstractC2897b = this.f32494a;
            abstractC2897b.x(this.f32495b, abstractC2897b.S(N8));
            return J8.a();
        }
        D0 J9 = this.f32255j.J(-1L, this.f32256k);
        if (this.f32257l == 0) {
            InterfaceC2975q2 N9 = this.f32255j.N(this.f32494a.G(), J9);
            AbstractC2897b abstractC2897b2 = this.f32494a;
            abstractC2897b2.x(this.f32495b, abstractC2897b2.S(N9));
        } else {
            this.f32494a.R(this.f32495b, J9);
        }
        L0 a8 = J9.a();
        this.f32259n = a8.count();
        this.f32260o = true;
        this.f32495b = null;
        return a8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC2912e
    public final AbstractC2912e e(Spliterator spliterator) {
        return new A2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC2902c
    protected final void h() {
        this.f32480i = true;
        if (this.f32260o) {
            f(AbstractC3013z0.L(this.f32255j.E()));
        }
    }

    @Override // j$.util.stream.AbstractC2902c
    protected final Object j() {
        return AbstractC3013z0.L(this.f32255j.E());
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00df, code lost:
    
        if (r2 >= r0) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    @Override // j$.util.stream.AbstractC2912e, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.A2.onCompletion(java.util.concurrent.CountedCompleter):void");
    }
}
