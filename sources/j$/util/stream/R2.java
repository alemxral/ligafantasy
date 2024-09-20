package j$.util.stream;

import j$.util.AbstractC2877d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class R2 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    int f32386a;

    /* renamed from: b, reason: collision with root package name */
    final int f32387b;

    /* renamed from: c, reason: collision with root package name */
    int f32388c;

    /* renamed from: d, reason: collision with root package name */
    final int f32389d;

    /* renamed from: e, reason: collision with root package name */
    Object[] f32390e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2896a3 f32391f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public R2(C2896a3 c2896a3, int i8, int i9, int i10, int i11) {
        this.f32391f = c2896a3;
        this.f32386a = i8;
        this.f32387b = i9;
        this.f32388c = i10;
        this.f32389d = i11;
        Object[][] objArr = c2896a3.f32465f;
        this.f32390e = objArr == null ? c2896a3.f32464e : objArr[i8];
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i8 = this.f32386a;
        int i9 = this.f32389d;
        int i10 = this.f32387b;
        if (i8 == i10) {
            return i9 - this.f32388c;
        }
        long[] jArr = this.f32391f.f32487d;
        return ((jArr[i10] + i9) - jArr[i8]) - this.f32388c;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        C2896a3 c2896a3;
        Objects.requireNonNull(consumer);
        int i8 = this.f32386a;
        int i9 = this.f32389d;
        int i10 = this.f32387b;
        if (i8 < i10 || (i8 == i10 && this.f32388c < i9)) {
            int i11 = this.f32388c;
            while (true) {
                c2896a3 = this.f32391f;
                if (i8 >= i10) {
                    break;
                }
                Object[] objArr = c2896a3.f32465f[i8];
                while (i11 < objArr.length) {
                    consumer.accept(objArr[i11]);
                    i11++;
                }
                i8++;
                i11 = 0;
            }
            Object[] objArr2 = this.f32386a == i10 ? this.f32390e : c2896a3.f32465f[i10];
            while (i11 < i9) {
                consumer.accept(objArr2[i11]);
                i11++;
            }
            this.f32386a = i10;
            this.f32388c = i9;
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC2877d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC2877d.e(this, i8);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i8 = this.f32386a;
        int i9 = this.f32387b;
        if (i8 >= i9 && (i8 != i9 || this.f32388c >= this.f32389d)) {
            return false;
        }
        Object[] objArr = this.f32390e;
        int i10 = this.f32388c;
        this.f32388c = i10 + 1;
        consumer.accept(objArr[i10]);
        if (this.f32388c == this.f32390e.length) {
            this.f32388c = 0;
            int i11 = this.f32386a + 1;
            this.f32386a = i11;
            Object[][] objArr2 = this.f32391f.f32465f;
            if (objArr2 != null && i11 <= i9) {
                this.f32390e = objArr2[i11];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i8 = this.f32386a;
        int i9 = this.f32387b;
        if (i8 < i9) {
            int i10 = i9 - 1;
            int i11 = this.f32388c;
            C2896a3 c2896a3 = this.f32391f;
            R2 r22 = new R2(c2896a3, i8, i10, i11, c2896a3.f32465f[i10].length);
            this.f32386a = i9;
            this.f32388c = 0;
            this.f32390e = c2896a3.f32465f[i9];
            return r22;
        }
        if (i8 != i9) {
            return null;
        }
        int i12 = this.f32388c;
        int i13 = (this.f32389d - i12) / 2;
        if (i13 == 0) {
            return null;
        }
        Spliterator m8 = j$.util.u0.m(this.f32390e, i12, i12 + i13);
        this.f32388c += i13;
        return m8;
    }
}
