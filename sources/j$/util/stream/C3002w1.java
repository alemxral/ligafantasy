package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.w1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3002w1 extends AbstractC3006x1 {

    /* renamed from: h, reason: collision with root package name */
    private final Object[] f32630h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3002w1(Spliterator spliterator, AbstractC2897b abstractC2897b, Object[] objArr) {
        super(spliterator, abstractC2897b, objArr.length);
        this.f32630h = objArr;
    }

    C3002w1(C3002w1 c3002w1, Spliterator spliterator, long j8, long j9) {
        super(c3002w1, spliterator, j8, j9, c3002w1.f32630h.length);
        this.f32630h = c3002w1.f32630h;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i8 = this.f32641f;
        if (i8 >= this.f32642g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f32641f));
        }
        Object[] objArr = this.f32630h;
        this.f32641f = i8 + 1;
        objArr[i8] = obj;
    }

    @Override // j$.util.stream.AbstractC3006x1
    final AbstractC3006x1 b(Spliterator spliterator, long j8, long j9) {
        return new C3002w1(this, spliterator, j8, j9);
    }
}
