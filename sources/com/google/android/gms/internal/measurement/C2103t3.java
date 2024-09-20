package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.t3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2103t3 extends AbstractC2080q3 {
    public C2103t3() {
        super(4);
    }

    public final C2103t3 a(Object... objArr) {
        A3.b(objArr, 15);
        int i8 = this.f15842b;
        int i9 = i8 + 15;
        Object[] objArr2 = this.f15841a;
        int length = objArr2.length;
        if (length < i9) {
            int i10 = length + (length >> 1) + 1;
            if (i10 < i9) {
                int highestOneBit = Integer.highestOneBit(i8 + 14);
                i10 = highestOneBit + highestOneBit;
            }
            if (i10 < 0) {
                i10 = Integer.MAX_VALUE;
            }
            this.f15841a = Arrays.copyOf(objArr2, i10);
            this.f15843c = false;
        } else if (this.f15843c) {
            this.f15841a = (Object[]) objArr2.clone();
            this.f15843c = false;
        }
        System.arraycopy(objArr, 0, this.f15841a, this.f15842b, 15);
        this.f15842b += 15;
        return this;
    }

    public final AbstractC2135x3 b() {
        this.f15843c = true;
        return AbstractC2135x3.m(this.f15841a, this.f15842b);
    }
}
