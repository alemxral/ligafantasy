package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.o3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2064o3 extends F3 {

    /* renamed from: a, reason: collision with root package name */
    private final int f15762a;

    /* renamed from: b, reason: collision with root package name */
    private int f15763b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2064o3(int i8, int i9) {
        AbstractC1990f3.b(i9, i8, "index");
        this.f15762a = i8;
        this.f15763b = i9;
    }

    protected abstract Object b(int i8);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f15763b < this.f15762a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f15763b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i8 = this.f15763b;
            this.f15763b = i8 + 1;
            return b(i8);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15763b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i8 = this.f15763b - 1;
            this.f15763b = i8;
            return b(i8);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15763b - 1;
    }
}
