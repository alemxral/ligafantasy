package x6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class O extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private long[] f39505a;

    /* renamed from: b, reason: collision with root package name */
    private int f39506b;

    public O(long[] bufferWithData) {
        AbstractC3159y.i(bufferWithData, "bufferWithData");
        this.f39505a = bufferWithData;
        this.f39506b = bufferWithData.length;
        b(10);
    }

    @Override // x6.h0
    public void b(int i8) {
        long[] jArr = this.f39505a;
        if (jArr.length < i8) {
            long[] copyOf = Arrays.copyOf(jArr, d6.m.d(i8, jArr.length * 2));
            AbstractC3159y.h(copyOf, "copyOf(...)");
            this.f39505a = copyOf;
        }
    }

    @Override // x6.h0
    public int d() {
        return this.f39506b;
    }

    public final void e(long j8) {
        h0.c(this, 0, 1, null);
        long[] jArr = this.f39505a;
        int d8 = d();
        this.f39506b = d8 + 1;
        jArr[d8] = j8;
    }

    @Override // x6.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        long[] copyOf = Arrays.copyOf(this.f39505a, d());
        AbstractC3159y.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
