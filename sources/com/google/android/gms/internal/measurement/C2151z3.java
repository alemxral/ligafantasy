package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.z3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2151z3 extends E3 {

    /* renamed from: a, reason: collision with root package name */
    boolean f15960a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f15961b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2151z3(Object obj) {
        this.f15961b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f15960a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f15960a) {
            this.f15960a = true;
            return this.f15961b;
        }
        throw new NoSuchElementException();
    }
}
