package x6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class o0 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private short[] f39573a;

    /* renamed from: b, reason: collision with root package name */
    private int f39574b;

    public o0(short[] bufferWithData) {
        AbstractC3159y.i(bufferWithData, "bufferWithData");
        this.f39573a = bufferWithData;
        this.f39574b = bufferWithData.length;
        b(10);
    }

    @Override // x6.h0
    public void b(int i8) {
        short[] sArr = this.f39573a;
        if (sArr.length < i8) {
            short[] copyOf = Arrays.copyOf(sArr, d6.m.d(i8, sArr.length * 2));
            AbstractC3159y.h(copyOf, "copyOf(...)");
            this.f39573a = copyOf;
        }
    }

    @Override // x6.h0
    public int d() {
        return this.f39574b;
    }

    public final void e(short s8) {
        h0.c(this, 0, 1, null);
        short[] sArr = this.f39573a;
        int d8 = d();
        this.f39574b = d8 + 1;
        sArr[d8] = s8;
    }

    @Override // x6.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] a() {
        short[] copyOf = Arrays.copyOf(this.f39573a, d());
        AbstractC3159y.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
