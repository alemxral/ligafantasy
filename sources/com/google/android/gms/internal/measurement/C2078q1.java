package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.q1 */
/* loaded from: classes3.dex */
public final class C2078q1 extends AbstractC2112u4 implements Z4 {
    private static final C2078q1 zza;
    private int zzd;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private A4 zzh = AbstractC2112u4.p();

    static {
        C2078q1 c2078q1 = new C2078q1();
        zza = c2078q1;
        AbstractC2112u4.w(C2078q1.class, c2078q1);
    }

    private C2078q1() {
    }

    public static C2078q1 D() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2112u4
    public final Object A(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 != 0) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C2046m1(null);
                }
                return new C2078q1();
            }
            return AbstractC2112u4.s(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", C2062o1.f15761a, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final int B() {
        return this.zzh.size();
    }

    public final String E() {
        return this.zzf;
    }

    public final List F() {
        return this.zzh;
    }

    public final boolean G() {
        return this.zzg;
    }

    public final boolean H() {
        return (this.zzd & 4) != 0;
    }

    public final boolean J() {
        return (this.zzd & 2) != 0;
    }

    public final boolean K() {
        return (this.zzd & 1) != 0;
    }

    public final int M() {
        int a8 = AbstractC2070p1.a(this.zze);
        if (a8 == 0) {
            return 1;
        }
        return a8;
    }
}
