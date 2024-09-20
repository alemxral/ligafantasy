package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class V5 implements U5 {

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15576a;

    /* renamed from: b, reason: collision with root package name */
    public static final X2 f15577b;

    /* renamed from: c, reason: collision with root package name */
    public static final X2 f15578c;

    static {
        T2 a8 = new T2(L2.a("com.google.android.gms.measurement")).b().a();
        f15576a = a8.f("measurement.collection.event_safelist", true);
        f15577b = a8.f("measurement.service.store_null_safelist", true);
        f15578c = a8.f("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.U5
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.U5
    public final boolean b() {
        return ((Boolean) f15577b.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.U5
    public final boolean c() {
        return ((Boolean) f15578c.b()).booleanValue();
    }
}
