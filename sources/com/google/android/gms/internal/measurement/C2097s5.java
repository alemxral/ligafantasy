package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.measurement.s5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2097s5 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    final ListIterator f15877a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f15878b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2113u5 f15879c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2097s5(C2113u5 c2113u5, int i8) {
        G4 g42;
        this.f15879c = c2113u5;
        this.f15878b = i8;
        g42 = c2113u5.f15901a;
        this.f15877a = g42.listIterator(i8);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f15877a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f15877a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f15877a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15877a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f15877a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15877a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
