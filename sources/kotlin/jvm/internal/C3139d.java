package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* renamed from: kotlin.jvm.internal.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3139d extends M5.N {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f33757a;

    /* renamed from: b, reason: collision with root package name */
    private int f33758b;

    public C3139d(int[] array) {
        AbstractC3159y.i(array, "array");
        this.f33757a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f33758b < this.f33757a.length) {
            return true;
        }
        return false;
    }

    @Override // M5.N
    public int nextInt() {
        try {
            int[] iArr = this.f33757a;
            int i8 = this.f33758b;
            this.f33758b = i8 + 1;
            return iArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.f33758b--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }
}
