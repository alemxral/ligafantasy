package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.w5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2129w5 extends AbstractC2145y5 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2129w5(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2145y5
    public final double a(Object obj, long j8) {
        return Double.longBitsToDouble(this.f15953a.getLong(obj, j8));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2145y5
    public final float b(Object obj, long j8) {
        return Float.intBitsToFloat(this.f15953a.getInt(obj, j8));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2145y5
    public final void c(Object obj, long j8, boolean z8) {
        if (AbstractC2153z5.f15969h) {
            AbstractC2153z5.d(obj, j8, r3 ? (byte) 1 : (byte) 0);
        } else {
            AbstractC2153z5.e(obj, j8, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2145y5
    public final void d(Object obj, long j8, byte b8) {
        if (AbstractC2153z5.f15969h) {
            AbstractC2153z5.d(obj, j8, b8);
        } else {
            AbstractC2153z5.e(obj, j8, b8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2145y5
    public final void e(Object obj, long j8, double d8) {
        this.f15953a.putLong(obj, j8, Double.doubleToLongBits(d8));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2145y5
    public final void f(Object obj, long j8, float f8) {
        this.f15953a.putInt(obj, j8, Float.floatToIntBits(f8));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2145y5
    public final boolean g(Object obj, long j8) {
        if (AbstractC2153z5.f15969h) {
            return AbstractC2153z5.y(obj, j8);
        }
        return AbstractC2153z5.z(obj, j8);
    }
}
