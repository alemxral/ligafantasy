package j$.util;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class s0 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Collection f32245a;

    /* renamed from: b, reason: collision with root package name */
    private Iterator f32246b = null;

    /* renamed from: c, reason: collision with root package name */
    private final int f32247c;

    /* renamed from: d, reason: collision with root package name */
    private long f32248d;

    /* renamed from: e, reason: collision with root package name */
    private int f32249e;

    public s0(int i8, java.util.Collection collection) {
        this.f32245a = collection;
        this.f32247c = i8 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f32247c;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        if (this.f32246b != null) {
            return this.f32248d;
        }
        java.util.Collection collection = this.f32245a;
        this.f32246b = collection.iterator();
        long size = collection.size();
        this.f32248d = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f32246b;
        if (it == null) {
            Iterator it2 = this.f32245a.iterator();
            this.f32246b = it2;
            this.f32248d = r0.size();
            it = it2;
        }
        AbstractC2877d.r(it, consumer);
    }

    @Override // j$.util.Spliterator
    public Comparator getComparator() {
        if (AbstractC2877d.e(this, 4)) {
            return null;
        }
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
        consumer.getClass();
        if (this.f32246b == null) {
            this.f32246b = this.f32245a.iterator();
            this.f32248d = r0.size();
        }
        if (!this.f32246b.hasNext()) {
            return false;
        }
        consumer.accept(this.f32246b.next());
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        long j8;
        Iterator it = this.f32246b;
        if (it == null) {
            java.util.Collection collection = this.f32245a;
            Iterator it2 = collection.iterator();
            this.f32246b = it2;
            j8 = collection.size();
            this.f32248d = j8;
            it = it2;
        } else {
            j8 = this.f32248d;
        }
        if (j8 <= 1 || !it.hasNext()) {
            return null;
        }
        int i8 = this.f32249e + 1024;
        if (i8 > j8) {
            i8 = (int) j8;
        }
        if (i8 > 33554432) {
            i8 = 33554432;
        }
        Object[] objArr = new Object[i8];
        int i9 = 0;
        do {
            objArr[i9] = it.next();
            i9++;
            if (i9 >= i8) {
                break;
            }
        } while (it.hasNext());
        this.f32249e = i9;
        long j9 = this.f32248d;
        if (j9 != Long.MAX_VALUE) {
            this.f32248d = j9 - i9;
        }
        return new l0(objArr, 0, i9, this.f32247c);
    }
}
