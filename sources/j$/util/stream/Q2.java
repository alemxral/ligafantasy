package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class Q2 extends E2 {

    /* renamed from: d, reason: collision with root package name */
    private Object[] f32379d;

    /* renamed from: e, reason: collision with root package name */
    private int f32380e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f32379d;
        int i8 = this.f32380e;
        this.f32380e = i8 + 1;
        objArr[i8] = obj;
    }

    @Override // j$.util.stream.AbstractC2955m2, j$.util.stream.InterfaceC2975q2
    public final void j() {
        int i8 = 0;
        Arrays.sort(this.f32379d, 0, this.f32380e, this.f32282b);
        long j8 = this.f32380e;
        InterfaceC2975q2 interfaceC2975q2 = this.f32564a;
        interfaceC2975q2.k(j8);
        if (this.f32283c) {
            while (i8 < this.f32380e && !interfaceC2975q2.m()) {
                interfaceC2975q2.accept((InterfaceC2975q2) this.f32379d[i8]);
                i8++;
            }
        } else {
            while (i8 < this.f32380e) {
                interfaceC2975q2.accept((InterfaceC2975q2) this.f32379d[i8]);
                i8++;
            }
        }
        interfaceC2975q2.j();
        this.f32379d = null;
    }

    @Override // j$.util.stream.AbstractC2955m2, j$.util.stream.InterfaceC2975q2
    public final void k(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f32379d = new Object[(int) j8];
    }
}
