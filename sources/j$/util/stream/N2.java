package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class N2 extends B2 {

    /* renamed from: c, reason: collision with root package name */
    private double[] f32352c;

    /* renamed from: d, reason: collision with root package name */
    private int f32353d;

    @Override // j$.util.stream.InterfaceC2960n2, j$.util.stream.InterfaceC2975q2
    public final void accept(double d8) {
        double[] dArr = this.f32352c;
        int i8 = this.f32353d;
        this.f32353d = i8 + 1;
        dArr[i8] = d8;
    }

    @Override // j$.util.stream.AbstractC2940j2, j$.util.stream.InterfaceC2975q2
    public final void j() {
        int i8 = 0;
        Arrays.sort(this.f32352c, 0, this.f32353d);
        long j8 = this.f32353d;
        InterfaceC2975q2 interfaceC2975q2 = this.f32552a;
        interfaceC2975q2.k(j8);
        if (this.f32264b) {
            while (i8 < this.f32353d && !interfaceC2975q2.m()) {
                interfaceC2975q2.accept(this.f32352c[i8]);
                i8++;
            }
        } else {
            while (i8 < this.f32353d) {
                interfaceC2975q2.accept(this.f32352c[i8]);
                i8++;
            }
        }
        interfaceC2975q2.j();
        this.f32352c = null;
    }

    @Override // j$.util.stream.AbstractC2940j2, j$.util.stream.InterfaceC2975q2
    public final void k(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f32352c = new double[(int) j8];
    }
}
