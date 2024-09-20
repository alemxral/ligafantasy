package j$.util.concurrent;

import j$.util.AbstractC2877d;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j extends p implements Spliterator {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f32142i;

    /* renamed from: j, reason: collision with root package name */
    long f32143j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l[] lVarArr, int i8, int i9, int i10, long j8, int i11) {
        super(lVarArr, i8, i9, i10);
        this.f32142i = i11;
        this.f32143j = j8;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        switch (this.f32142i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        switch (this.f32142i) {
            case 0:
                return this.f32143j;
            default:
                return this.f32143j;
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f32142i) {
            case 0:
                consumer.getClass();
                while (true) {
                    l a8 = a();
                    if (a8 == null) {
                        return;
                    } else {
                        consumer.accept(a8.f32148b);
                    }
                }
            default:
                consumer.getClass();
                while (true) {
                    l a9 = a();
                    if (a9 == null) {
                        return;
                    } else {
                        consumer.accept(a9.f32149c);
                    }
                }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        switch (this.f32142i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f32142i) {
            case 0:
                return AbstractC2877d.d(this);
            default:
                return AbstractC2877d.d(this);
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        switch (this.f32142i) {
            case 0:
                return AbstractC2877d.e(this, i8);
            default:
                return AbstractC2877d.e(this, i8);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.f32142i) {
            case 0:
                consumer.getClass();
                l a8 = a();
                if (a8 == null) {
                    return false;
                }
                consumer.accept(a8.f32148b);
                return true;
            default:
                consumer.getClass();
                l a9 = a();
                if (a9 == null) {
                    return false;
                }
                consumer.accept(a9.f32149c);
                return true;
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.f32142i) {
            case 0:
                int i8 = this.f32160f;
                int i9 = this.f32161g;
                int i10 = (i8 + i9) >>> 1;
                if (i10 <= i8) {
                    return null;
                }
                l[] lVarArr = this.f32155a;
                this.f32161g = i10;
                long j8 = this.f32143j >>> 1;
                this.f32143j = j8;
                return new j(lVarArr, this.f32162h, i10, i9, j8, 0);
            default:
                int i11 = this.f32160f;
                int i12 = this.f32161g;
                int i13 = (i11 + i12) >>> 1;
                if (i13 <= i11) {
                    return null;
                }
                l[] lVarArr2 = this.f32155a;
                this.f32161g = i13;
                long j9 = this.f32143j >>> 1;
                this.f32143j = j9;
                return new j(lVarArr2, this.f32162h, i13, i12, j9, 1);
        }
    }
}
