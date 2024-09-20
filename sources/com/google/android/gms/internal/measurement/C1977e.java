package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1977e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f15677a = 0;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1986f f15678b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1977e(C1986f c1986f) {
        this.f15678b = c1986f;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f15677a < this.f15678b.r()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f15677a < this.f15678b.r()) {
            C1986f c1986f = this.f15678b;
            int i8 = this.f15677a;
            this.f15677a = i8 + 1;
            return c1986f.s(i8);
        }
        throw new NoSuchElementException("Out of bounds index: " + this.f15677a);
    }
}
