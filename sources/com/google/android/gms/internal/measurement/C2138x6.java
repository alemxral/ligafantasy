package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.x6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2138x6 implements InterfaceC2130w6 {

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15944a;

    /* renamed from: b, reason: collision with root package name */
    public static final X2 f15945b;

    /* renamed from: c, reason: collision with root package name */
    public static final X2 f15946c;

    static {
        T2 a8 = new T2(L2.a("com.google.android.gms.measurement")).b().a();
        f15944a = a8.f("measurement.item_scoped_custom_parameters.client", true);
        f15945b = a8.f("measurement.item_scoped_custom_parameters.service", false);
        f15946c = a8.d("measurement.id.item_scoped_custom_parameters.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2130w6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2130w6
    public final boolean b() {
        return ((Boolean) f15944a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2130w6
    public final boolean c() {
        return ((Boolean) f15945b.b()).booleanValue();
    }
}
