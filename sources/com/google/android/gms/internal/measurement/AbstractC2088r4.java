package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.r4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2088r4 extends G3 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2112u4 f15862a;

    /* renamed from: b, reason: collision with root package name */
    protected AbstractC2112u4 f15863b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2088r4(AbstractC2112u4 abstractC2112u4) {
        this.f15862a = abstractC2112u4;
        if (!abstractC2112u4.y()) {
            this.f15863b = abstractC2112u4.l();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static void g(Object obj, Object obj2) {
        C2001g5.a().b(obj.getClass()).h(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.G3
    public final /* bridge */ /* synthetic */ G3 e(byte[] bArr, int i8, int i9) {
        j(bArr, 0, i9, C2025j4.f15730c);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.G3
    public final /* bridge */ /* synthetic */ G3 f(byte[] bArr, int i8, int i9, C2025j4 c2025j4) {
        j(bArr, 0, i9, c2025j4);
        return this;
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final AbstractC2088r4 clone() {
        AbstractC2088r4 abstractC2088r4 = (AbstractC2088r4) this.f15862a.A(5, null, null);
        abstractC2088r4.f15863b = u();
        return abstractC2088r4;
    }

    public final AbstractC2088r4 i(AbstractC2112u4 abstractC2112u4) {
        if (!this.f15862a.equals(abstractC2112u4)) {
            if (!this.f15863b.y()) {
                n();
            }
            g(this.f15863b, abstractC2112u4);
        }
        return this;
    }

    public final AbstractC2088r4 j(byte[] bArr, int i8, int i9, C2025j4 c2025j4) {
        if (!this.f15863b.y()) {
            n();
        }
        try {
            C2001g5.a().b(this.f15863b.getClass()).f(this.f15863b, bArr, 0, i9, new K3(c2025j4));
            return this;
        } catch (D4 e8) {
            throw e8;
        } catch (IOException e9) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e9);
        } catch (IndexOutOfBoundsException unused) {
            throw D4.f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r3 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.AbstractC2112u4 k() {
        /*
            r5 = this;
            com.google.android.gms.internal.measurement.u4 r0 = r5.u()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.A(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L13
            goto L30
        L13:
            if (r3 == 0) goto L31
            com.google.android.gms.internal.measurement.g5 r3 = com.google.android.gms.internal.measurement.C2001g5.a()
            java.lang.Class r4 = r0.getClass()
            com.google.android.gms.internal.measurement.j5 r3 = r3.b(r4)
            boolean r3 = r3.c(r0)
            if (r1 == r3) goto L29
            r1 = r2
            goto L2a
        L29:
            r1 = r0
        L2a:
            r4 = 2
            r0.A(r4, r1, r2)
            if (r3 == 0) goto L31
        L30:
            return r0
        L31:
            com.google.android.gms.internal.measurement.o5 r1 = new com.google.android.gms.internal.measurement.o5
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC2088r4.k():com.google.android.gms.internal.measurement.u4");
    }

    @Override // com.google.android.gms.internal.measurement.X4
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC2112u4 u() {
        if (!this.f15863b.y()) {
            return this.f15863b;
        }
        this.f15863b.t();
        return this.f15863b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m() {
        if (!this.f15863b.y()) {
            n();
        }
    }

    protected void n() {
        AbstractC2112u4 l8 = this.f15862a.l();
        g(l8, this.f15863b);
        this.f15863b = l8;
    }
}
