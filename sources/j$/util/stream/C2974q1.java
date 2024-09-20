package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.q1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2974q1 implements J0 {

    /* renamed from: a, reason: collision with root package name */
    final long[] f32592a;

    /* renamed from: b, reason: collision with root package name */
    int f32593b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2974q1(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f32592a = new long[(int) j8];
        this.f32593b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2974q1(long[] jArr) {
        this.f32592a = jArr;
        this.f32593b = jArr.length;
    }

    @Override // j$.util.stream.K0, j$.util.stream.L0
    public final K0 b(int i8) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.L0
    public final /* bridge */ /* synthetic */ L0 b(int i8) {
        b(i8);
        throw null;
    }

    @Override // j$.util.stream.L0
    public final long count() {
        return this.f32593b;
    }

    @Override // j$.util.stream.K0
    public final Object d() {
        long[] jArr = this.f32592a;
        int length = jArr.length;
        int i8 = this.f32593b;
        return length == i8 ? jArr : Arrays.copyOf(jArr, i8);
    }

    @Override // j$.util.stream.K0
    public final void e(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i8 = 0; i8 < this.f32593b; i8++) {
            longConsumer.accept(this.f32592a[i8]);
        }
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC3013z0.s(this, consumer);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ Object[] n(IntFunction intFunction) {
        return AbstractC3013z0.m(this, intFunction);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.K0
    public final void q(int i8, Object obj) {
        int i9 = this.f32593b;
        System.arraycopy(this.f32592a, 0, (long[]) obj, i8, i9);
    }

    @Override // j$.util.stream.L0
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void h(Long[] lArr, int i8) {
        AbstractC3013z0.p(this, lArr, i8);
    }

    @Override // j$.util.stream.L0
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ J0 g(long j8, long j9, IntFunction intFunction) {
        return AbstractC3013z0.v(this, j8, j9);
    }

    @Override // j$.util.stream.L0
    public final Spliterator spliterator() {
        return j$.util.u0.l(this.f32592a, 0, this.f32593b);
    }

    @Override // j$.util.stream.K0, j$.util.stream.L0
    public final j$.util.f0 spliterator() {
        return j$.util.u0.l(this.f32592a, 0, this.f32593b);
    }

    public String toString() {
        long[] jArr = this.f32592a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.f32593b), Arrays.toString(jArr));
    }
}
