package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.t1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2988t1 extends AbstractC3006x1 implements InterfaceC2960n2 {

    /* renamed from: h, reason: collision with root package name */
    private final double[] f32608h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2988t1(Spliterator spliterator, AbstractC2897b abstractC2897b, double[] dArr) {
        super(spliterator, abstractC2897b, dArr.length);
        this.f32608h = dArr;
    }

    C2988t1(C2988t1 c2988t1, Spliterator spliterator, long j8, long j9) {
        super(c2988t1, spliterator, j8, j9, c2988t1.f32608h.length);
        this.f32608h = c2988t1.f32608h;
    }

    @Override // j$.util.stream.AbstractC3006x1, j$.util.stream.InterfaceC2975q2
    public final void accept(double d8) {
        int i8 = this.f32641f;
        if (i8 >= this.f32642g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f32641f));
        }
        double[] dArr = this.f32608h;
        this.f32641f = i8 + 1;
        dArr[i8] = d8;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        o((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.AbstractC3006x1
    final AbstractC3006x1 b(Spliterator spliterator, long j8, long j9) {
        return new C2988t1(this, spliterator, j8, j9);
    }

    @Override // j$.util.stream.InterfaceC2960n2
    public final /* synthetic */ void o(Double d8) {
        AbstractC3013z0.e(this, d8);
    }
}
