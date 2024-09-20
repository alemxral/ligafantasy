package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2090r6 implements InterfaceC2083q6 {

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15864a;

    /* renamed from: b, reason: collision with root package name */
    public static final X2 f15865b;

    /* renamed from: c, reason: collision with root package name */
    public static final X2 f15866c;

    /* renamed from: d, reason: collision with root package name */
    public static final X2 f15867d;

    static {
        T2 a8 = new T2(L2.a("com.google.android.gms.measurement")).b().a();
        f15864a = a8.f("measurement.client.global_params", true);
        f15865b = a8.f("measurement.service.global_params_in_payload", true);
        f15866c = a8.f("measurement.service.clear_global_params_on_uninstall", true);
        f15867d = a8.f("measurement.service.global_params", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2083q6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2083q6
    public final boolean b() {
        return ((Boolean) f15866c.b()).booleanValue();
    }
}
