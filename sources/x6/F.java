package x6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class F extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private int[] f39494a;

    /* renamed from: b, reason: collision with root package name */
    private int f39495b;

    public F(int[] bufferWithData) {
        AbstractC3159y.i(bufferWithData, "bufferWithData");
        this.f39494a = bufferWithData;
        this.f39495b = bufferWithData.length;
        b(10);
    }

    @Override // x6.h0
    public void b(int i8) {
        int[] iArr = this.f39494a;
        if (iArr.length < i8) {
            int[] copyOf = Arrays.copyOf(iArr, d6.m.d(i8, iArr.length * 2));
            AbstractC3159y.h(copyOf, "copyOf(...)");
            this.f39494a = copyOf;
        }
    }

    @Override // x6.h0
    public int d() {
        return this.f39495b;
    }

    public final void e(int i8) {
        h0.c(this, 0, 1, null);
        int[] iArr = this.f39494a;
        int d8 = d();
        this.f39495b = d8 + 1;
        iArr[d8] = i8;
    }

    @Override // x6.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] copyOf = Arrays.copyOf(this.f39494a, d());
        AbstractC3159y.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
