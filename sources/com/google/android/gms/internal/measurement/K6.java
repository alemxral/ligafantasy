package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class K6 implements J6 {

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15364a;

    /* renamed from: b, reason: collision with root package name */
    public static final X2 f15365b;

    /* renamed from: c, reason: collision with root package name */
    public static final X2 f15366c;

    /* renamed from: d, reason: collision with root package name */
    public static final X2 f15367d;

    /* renamed from: e, reason: collision with root package name */
    public static final X2 f15368e;

    static {
        T2 a8 = new T2(L2.a("com.google.android.gms.measurement")).a();
        f15364a = a8.f("measurement.test.boolean_flag", false);
        f15365b = a8.c("measurement.test.double_flag", -3.0d);
        f15366c = a8.d("measurement.test.int_flag", -2L);
        f15367d = a8.d("measurement.test.long_flag", -1L);
        f15368e = a8.e("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.J6
    public final double a() {
        return ((Double) f15365b.b()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.J6
    public final long b() {
        return ((Long) f15366c.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.J6
    public final long c() {
        return ((Long) f15367d.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.J6
    public final String d() {
        return (String) f15368e.b();
    }

    @Override // com.google.android.gms.internal.measurement.J6
    public final boolean e() {
        return ((Boolean) f15364a.b()).booleanValue();
    }
}
