package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class O2 extends C2 {

    /* renamed from: c, reason: collision with root package name */
    private int[] f32361c;

    /* renamed from: d, reason: collision with root package name */
    private int f32362d;

    @Override // j$.util.stream.InterfaceC2965o2, j$.util.stream.InterfaceC2975q2
    public final void accept(int i8) {
        int[] iArr = this.f32361c;
        int i9 = this.f32362d;
        this.f32362d = i9 + 1;
        iArr[i9] = i8;
    }

    @Override // j$.util.stream.AbstractC2945k2, j$.util.stream.InterfaceC2975q2
    public final void j() {
        int i8 = 0;
        Arrays.sort(this.f32361c, 0, this.f32362d);
        long j8 = this.f32362d;
        InterfaceC2975q2 interfaceC2975q2 = this.f32555a;
        interfaceC2975q2.k(j8);
        if (this.f32270b) {
            while (i8 < this.f32362d && !interfaceC2975q2.m()) {
                interfaceC2975q2.accept(this.f32361c[i8]);
                i8++;
            }
        } else {
            while (i8 < this.f32362d) {
                interfaceC2975q2.accept(this.f32361c[i8]);
                i8++;
            }
        }
        interfaceC2975q2.j();
        this.f32361c = null;
    }

    @Override // j$.util.stream.AbstractC2945k2, j$.util.stream.InterfaceC2975q2
    public final void k(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f32361c = new int[(int) j8];
    }
}
