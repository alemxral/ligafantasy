package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.q5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2082q5 {

    /* renamed from: f, reason: collision with root package name */
    private static final C2082q5 f15845f = new C2082q5(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f15846a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f15847b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f15848c;

    /* renamed from: d, reason: collision with root package name */
    private int f15849d = -1;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15850e;

    private C2082q5(int i8, int[] iArr, Object[] objArr, boolean z8) {
        this.f15846a = i8;
        this.f15847b = iArr;
        this.f15848c = objArr;
        this.f15850e = z8;
    }

    public static C2082q5 c() {
        return f15845f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2082q5 e(C2082q5 c2082q5, C2082q5 c2082q52) {
        int i8 = c2082q5.f15846a + c2082q52.f15846a;
        int[] copyOf = Arrays.copyOf(c2082q5.f15847b, i8);
        System.arraycopy(c2082q52.f15847b, 0, copyOf, c2082q5.f15846a, c2082q52.f15846a);
        Object[] copyOf2 = Arrays.copyOf(c2082q5.f15848c, i8);
        System.arraycopy(c2082q52.f15848c, 0, copyOf2, c2082q5.f15846a, c2082q52.f15846a);
        return new C2082q5(i8, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2082q5 f() {
        return new C2082q5(0, new int[8], new Object[8], true);
    }

    private final void l(int i8) {
        int[] iArr = this.f15847b;
        if (i8 > iArr.length) {
            int i9 = this.f15846a;
            int i10 = i9 + (i9 / 2);
            if (i10 >= i8) {
                i8 = i10;
            }
            if (i8 < 8) {
                i8 = 8;
            }
            this.f15847b = Arrays.copyOf(iArr, i8);
            this.f15848c = Arrays.copyOf(this.f15848c, i8);
        }
    }

    public final int a() {
        int z8;
        int y8;
        int i8;
        int i9 = this.f15849d;
        if (i9 == -1) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f15846a; i11++) {
                int i12 = this.f15847b[i11];
                int i13 = i12 >>> 3;
                int i14 = i12 & 7;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                if (i14 == 5) {
                                    ((Integer) this.f15848c[i11]).intValue();
                                    i8 = AbstractC1991f4.y(i13 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(D4.a());
                                }
                            } else {
                                int i15 = i13 << 3;
                                int i16 = AbstractC1991f4.f15689d;
                                z8 = ((C2082q5) this.f15848c[i11]).a();
                                int y9 = AbstractC1991f4.y(i15);
                                y8 = y9 + y9;
                            }
                        } else {
                            X3 x32 = (X3) this.f15848c[i11];
                            int i17 = AbstractC1991f4.f15689d;
                            int g8 = x32.g();
                            i8 = AbstractC1991f4.y(i13 << 3) + AbstractC1991f4.y(g8) + g8;
                        }
                    } else {
                        ((Long) this.f15848c[i11]).longValue();
                        i8 = AbstractC1991f4.y(i13 << 3) + 8;
                    }
                    i10 += i8;
                } else {
                    int i18 = i13 << 3;
                    z8 = AbstractC1991f4.z(((Long) this.f15848c[i11]).longValue());
                    y8 = AbstractC1991f4.y(i18);
                }
                i8 = y8 + z8;
                i10 += i8;
            }
            this.f15849d = i10;
            return i10;
        }
        return i9;
    }

    public final int b() {
        int i8 = this.f15849d;
        if (i8 == -1) {
            int i9 = 0;
            for (int i10 = 0; i10 < this.f15846a; i10++) {
                int i11 = this.f15847b[i10] >>> 3;
                X3 x32 = (X3) this.f15848c[i10];
                int i12 = AbstractC1991f4.f15689d;
                int g8 = x32.g();
                int y8 = AbstractC1991f4.y(g8) + g8;
                int y9 = AbstractC1991f4.y(16);
                int y10 = AbstractC1991f4.y(i11);
                int y11 = AbstractC1991f4.y(8);
                i9 += y11 + y11 + y9 + y10 + AbstractC1991f4.y(24) + y8;
            }
            this.f15849d = i9;
            return i9;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C2082q5 d(C2082q5 c2082q5) {
        if (c2082q5.equals(f15845f)) {
            return this;
        }
        g();
        int i8 = this.f15846a + c2082q5.f15846a;
        l(i8);
        System.arraycopy(c2082q5.f15847b, 0, this.f15847b, this.f15846a, c2082q5.f15846a);
        System.arraycopy(c2082q5.f15848c, 0, this.f15848c, this.f15846a, c2082q5.f15846a);
        this.f15846a = i8;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2082q5)) {
            return false;
        }
        C2082q5 c2082q5 = (C2082q5) obj;
        int i8 = this.f15846a;
        if (i8 == c2082q5.f15846a) {
            int[] iArr = this.f15847b;
            int[] iArr2 = c2082q5.f15847b;
            int i9 = 0;
            while (true) {
                if (i9 < i8) {
                    if (iArr[i9] != iArr2[i9]) {
                        break;
                    }
                    i9++;
                } else {
                    Object[] objArr = this.f15848c;
                    Object[] objArr2 = c2082q5.f15848c;
                    int i10 = this.f15846a;
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (objArr[i11].equals(objArr2[i11])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    final void g() {
        if (this.f15850e) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f15850e) {
            this.f15850e = false;
        }
    }

    public final int hashCode() {
        int i8 = this.f15846a;
        int i9 = i8 + 527;
        int[] iArr = this.f15847b;
        int i10 = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i8; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i9 * 31) + i11;
        Object[] objArr = this.f15848c;
        int i14 = this.f15846a;
        for (int i15 = 0; i15 < i14; i15++) {
            i10 = (i10 * 31) + objArr[i15].hashCode();
        }
        return (i13 * 31) + i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < this.f15846a; i9++) {
            AbstractC1947a5.b(sb, i8, String.valueOf(this.f15847b[i9] >>> 3), this.f15848c[i9]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(int i8, Object obj) {
        g();
        l(this.f15846a + 1);
        int[] iArr = this.f15847b;
        int i9 = this.f15846a;
        iArr[i9] = i8;
        this.f15848c[i9] = obj;
        this.f15846a = i9 + 1;
    }

    public final void k(G5 g52) {
        if (this.f15846a != 0) {
            for (int i8 = 0; i8 < this.f15846a; i8++) {
                int i9 = this.f15847b[i8];
                Object obj = this.f15848c[i8];
                int i10 = i9 & 7;
                int i11 = i9 >>> 3;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 5) {
                                    g52.e(i11, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(D4.a());
                                }
                            } else {
                                g52.E(i11);
                                ((C2082q5) obj).k(g52);
                                g52.J(i11);
                            }
                        } else {
                            g52.A(i11, (X3) obj);
                        }
                    } else {
                        g52.G(i11, ((Long) obj).longValue());
                    }
                } else {
                    g52.i(i11, ((Long) obj).longValue());
                }
            }
        }
    }
}
