package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class P2 extends D2 {

    /* renamed from: c, reason: collision with root package name */
    private long[] f32369c;

    /* renamed from: d, reason: collision with root package name */
    private int f32370d;

    @Override // j$.util.stream.InterfaceC2970p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        long[] jArr = this.f32369c;
        int i8 = this.f32370d;
        this.f32370d = i8 + 1;
        jArr[i8] = j8;
    }

    @Override // j$.util.stream.AbstractC2950l2, j$.util.stream.InterfaceC2975q2
    public final void j() {
        int i8 = 0;
        Arrays.sort(this.f32369c, 0, this.f32370d);
        long j8 = this.f32370d;
        InterfaceC2975q2 interfaceC2975q2 = this.f32559a;
        interfaceC2975q2.k(j8);
        if (this.f32276b) {
            while (i8 < this.f32370d && !interfaceC2975q2.m()) {
                interfaceC2975q2.accept(this.f32369c[i8]);
                i8++;
            }
        } else {
            while (i8 < this.f32370d) {
                interfaceC2975q2.accept(this.f32369c[i8]);
                i8++;
            }
        }
        interfaceC2975q2.j();
        this.f32369c = null;
    }

    @Override // j$.util.stream.AbstractC2950l2, j$.util.stream.InterfaceC2975q2
    public final void k(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f32369c = new long[(int) j8];
    }
}
